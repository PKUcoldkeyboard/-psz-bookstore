//轮播图控制

//隐藏轮播图文字
function pic_hide(id) {
    document.getElementById(id).style = "opacity:0; top:193px; visibility:hidden;";
}
//显示轮播图文字
function pic_show(id) {
    document.getElementById(id).style = "opacity:1; top:163px; visibility:visible;";
}
//切换到第一张轮播图的文字
function prologueTo1() {
    pic_hide("prologue2");
    pic_hide("prologue3");
    pic_show("prologue1");
}
//切换到第二张轮播图的文字
function prologueTo2() {
    pic_hide("prologue1");
    pic_hide("prologue3");
    pic_show("prologue2");
}
//切换到第三张轮播图的文字
function prologueTo3() {
    pic_hide("prologue1");
    pic_hide("prologue2");
    pic_show("prologue3");
}
//切换到第一张轮播图
function picTo1() {
    prologueTo1();
    document.getElementById("pic_state").value = "1";
}
//切换到第二张轮播图
function picTo2() {
    prologueTo2();
    document.getElementById("pic_state").value = "2";
}
//切换到第三张轮播图
function picTo3() {
    prologueTo3();
    document.getElementById("pic_state").value = "3";
}
//切换到上一张轮播图
function picToPre() {
    var state = document.getElementById("pic_state").value;
    if (state == "1") {
        picTo3();
    } else if (state == "2") {
        picTo1();
    } else {
        picTo2();
    }
}
//切换到下一张轮播图
function picToNext() {
    var state = document.getElementById("pic_state").value;
    if (state == "1") {
        picTo2();
    } else if (state == "2") {
        picTo3();
    } else {
        picTo1();
    }
}


var inte;
//自动开始轮播
inte = window.setInterval(function(){ picToNext() }, 5000);

//重置轮播图循环时间
function resetInterval() {
    window.clearInterval(inte);
    inte = window.setInterval(function() { picToNext(); }, 5000);
}