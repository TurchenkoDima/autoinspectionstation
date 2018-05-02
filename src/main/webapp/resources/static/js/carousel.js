var angle = 0;
window.galleryspin = function(sign) {
    spinner = document.querySelector("#spinner");
    if (!sign) {
        angle = angle + 72;
    } else {
        angle = angle - 72;
    }
    spinner.setAttribute("style", "-webkit-transform: rotateY(" + angle + "deg); -moz-transform: rotateY(" + angle + "deg); transform: rotateY(" + angle + "deg);");
}
