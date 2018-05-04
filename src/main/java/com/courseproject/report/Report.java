package com.courseproject.report;

import com.courseproject.entity.AutoInf;
import com.courseproject.service.AutoInfService;
import com.courseproject.service.TestSystemService;

import javax.swing.text.Document;
import java.io.*;
import java.time.LocalDate;
import java.util.Random;

public class Report {
    private AutoInfService autoInfService;
    private StringBuilder reportstring;
    private TestSystemService testSystemService;
    private static final String HEAD = "ДИАГНОСТИЧЕСКАЯ КАРТА ТРАНСПОРТНОГО СРЕДСТВА                        серия БФ № ";
    private static final String END = "ВНИМАНИЕ!\nПовторное проведение КДР должно быть выполнено до \"__\" ______ 20__г.\n"+
            "При повторном проведении гостехосмотра проводятся контрольно-диагностические работы только\n" +
            "в отношении узлов, систем, внешнего вида и комплектации ТС, которые при предыдущем\n" +
            "проведении гостехосмотра признаны не соответствующими требованиям ТНПА.";
    

    public void createReport(int id) throws FileNotFoundException {

        AutoInf auto = autoInfService.getById(id);
        Random rand = new Random();
        LocalDate d = LocalDate.now();
        reportstring.append(HEAD).append(rand.nextInt(999999)+1000000).append("\n");
        reportstring.append("\nРегистрационный знак: ").append(auto.getRegistrationPlate());
        reportstring.append("\nМарка, модель: ").append(auto.getModel());
        reportstring.append("\nТип/категория: ").append(auto.getType()).append("/").append(auto.getCategory());
        reportstring.append("\nГод выпуска: ").append(auto.getYearOfManufacture());
        reportstring.append("\nВладелец: ").append(auto.getOwner());
        reportstring.append("\n\nРезультаты контрольно-диагностических работ:\n");
        reportstring.append(testSystemService.getBrakeErrorsByAutoId(id)).append("\n");
        reportstring.append(testSystemService.getEngineErrorsByAutoId(id)).append("\n");
        reportstring.append(testSystemService.getExhaustErrorsByAutoId(id)).append("\n");
        reportstring.append(testSystemService.getHeadlampsErrorsByAutoId(id)).append("\n");
        reportstring.append(testSystemService.getRudderErrorsByAutoId(id)).append("\n");
        reportstring.append("Транспортное средство установленным требованиям: ");
        if(testSystemService.getBrakeErrorsByAutoId(id).isEmpty() && testSystemService.getEngineErrorsByAutoId(id).isEmpty() &&
        testSystemService.getExhaustErrorsByAutoId(id).isEmpty() && testSystemService.getHeadlampsErrorsByAutoId(id).isEmpty() &&
                testSystemService.getRudderErrorsByAutoId(id).isEmpty())
                reportstring.append("НЕ СООТВЕТСТВУЕТ");
        else reportstring.append("СООТВЕТСТВУЕТ");
        reportstring.append("Дата проведения:              Услугу по проведения КДР сдал:\n");
        reportstring.append(d).append("                    ______________________________\n\n");
        reportstring.append(END);

        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("report.txt"), "utf-8"))) {
            writer.write(String.valueOf(reportstring));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
