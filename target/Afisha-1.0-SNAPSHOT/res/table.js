$('document').ready(async function(){
    const data = await fetch("localhost:8888/list")
        .then(r => r.response)
        .then(r => {
            var data = JSON.parse(r);
            var out = ''; //Объявление строки
            for (var key in data){
                out+='<div class="single-goods">';
                out+='<div class="single-item">';
                out+='<div class="single-item-wrap">';
                out+='<img src="'+data[key].image+'">';
                out+='<div class="single-item-inner">';
                out+='<div class="single-heading">';
                out+='<h3>'+data[key]['name']+'</h3>';
                out+='<p>'+data[key]['date']+'</p>';
                out+='<p>'+data[key]['city']+'&nbsp;'+data[key]['street']+'&nbsp;'+data[key]['building']+'</p>';
                out+='</div>';
                out+='<ul>';
                out+='<li><span class="colortext">Тип мероприятия: </span>'+data[key]['type']+'</li>';
                out+='<li><span class="colortext">О мероприятии: </span>'+data[key]['description']+'</li>';
                out+='</ul>';
                out+='</div>';
                out+='<a href=""></a>';
                out+='</div>';
                out+='</div>';
                out+='</div>';
            }
            $('#goods').html(out); //Отправка строки на вывод
        });
});