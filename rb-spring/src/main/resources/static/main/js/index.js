//控制导航栏居中
function index_navigation(){

    var index_nav=document.getElementById('index_navigation');
    //获取需要鼠标滚动的主题内容DIV
    var index_nav_width=index_nav.offsetWidth;
    //获取实际页面需要的left
    var page_left=(document.documentElement.clientWidth-index_nav_width)/2;
    index_nav.style.left=page_left+'px';
}

//控制导航栏底部灰色条的变化
function change_index_navigation(){
    //导航栏元件
    var index_nav = document.getElementById('index_navigation');
    //获取需要鼠标滚动的主题内容DIV
    var index_main = document.getElementById('index_main')
    //获取需要鼠标滚动的主题内容DIV到顶部的距离
    var index_main_top = window.pageYOffset || document.documentElement.scrollTop || document.body.scrollTop;
    if ((index_main_top) > 0) {
        index_nav.style.borderBottom = '3px solid #E9E9EE';

    } else {
        index_nav.style.borderBottom = '';

    }
}
function index_main(){
    var index_main=document.getElementById('index_main');
    var index_main_width=index_main.offsetWidth;
    //获取实际页面需要的left
    var page_left=(document.documentElement.clientWidth-index_main_width)/2;
    index_main.style.left=page_left+'px';
}




