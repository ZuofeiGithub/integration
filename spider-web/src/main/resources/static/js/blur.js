var canvasWidth = window.innerWidth;
var canvasHeight = window.innerHeight;

var canvas = document.getElementById("canvas");
var context = canvas.getContext("2d");

canvas.width = canvasWidth;
canvas.height = canvasHeight;
var radius = 50;
var showing = true;
//剪辑区域
var clippingRegion = {x:-1,y:-1,r:radius};
var leftMargin = 0 , topMargin = 0;
var animation;
var image = new Image();
image.src = "/images/blur.jpg";
image.onload = function (ev) {
    $("#blur-div").css("width",canvasWidth+"px");
    $("#blur-div").css("height",canvasHeight+"px");
    $("#blur-image").css("width",image.width+"px");
    $("#blur-image").css("height",image.height+"px");

    leftMargin = (image.width - canvas.width)/2;
    topMargin = (image.height - canvas.height)/2;
    $("#blur-image").css("top","-"+topMargin+"px");
    $("#blur-image").css("left","-"+leftMargin+"px");
    initCanvas();
}

function initCanvas() {
    clippingRegion = {x:Math.random()*(canvas.width -2*radius)+radius,y:Math.random()*(canvas.height - 2*radius)+radius,r:radius}
    draw(image,clippingRegion);
}

function setClippingRegion(clippingRegion) {
    context.beginPath();
    context.arc(clippingRegion.x,clippingRegion.y,clippingRegion.r,0,Math.PI*2,false);
    context.clip();
}

function draw(image,clippingRegion) {
    context.clearRect(0,0,canvas.width,canvas.height);
    context.save();
    setClippingRegion(clippingRegion);
    // context.drawImage(image,0,0);
    context.drawImage(image,leftMargin,topMargin,canvas.width,canvas.height,0,0,canvas.width,canvas.height);
    context.restore();

}

function reset() {
    clearInterval(animation);
    showing = true;
    initCanvas()
}

function show() {
    if(showing){
        showing = false;
        animation = setInterval(function () {
            clippingRegion.r += 20;
            if(clippingRegion.r > 2*Math.max(canvas.width,canvas.height)){
                clearInterval(animation)
            }
            draw(image,clippingRegion);
        },30);
    }

}