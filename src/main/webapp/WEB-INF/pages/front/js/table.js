$('document').ready(function(){
    loadGoods();
});


function timestampToDate(ts) {
    var d = new Date();
    d.setTime(ts);
    return ('0' + d.getDate()).slice(-2) + '/' + ('0' + (d.getMonth() + 1)).slice(-2) + '/' + d.getFullYear();
}
function loadGoods() {
  $.getJSON('http://localhost:8888/', function (data) {
      //const responseData = JSON.parse(data);
        var out = ''; //Объявление строки
      $(data.response).each(function (data) {
          //console.log(this.name_event, this.genre_event, this.datetime_end_event, this.datetime_end_event, this.location, this.metadata_event, this.adults_only, this.active, this.rating, this.id);
              out+='<div class="single-goods">';
              out+='<div class="single-item">';
              out+='<div class="single-item-wrap">';
              out+='<img src="poster/'+this.name_event+'.jpg">';
              out+='<div class="single-item-inner">';
              out+='<div class="single-heading">';
              out+='<h3>'+this.name_event+'</h3>';
              out+='<p>'+(timestampToDate(this.datetime_end_event))+'</p>';
              out+='<p>'+this.location.city+' '+this.location.street+' '+this.location.building+'</p>';
              out+='</div>';
              out+='<ul>';
              out+='<li><span class="colortext">Тип мероприятия: </span>'+this.genre_event.name_genre+'</li>';
              out+='<li><span class="colortext">О мероприятии: </span>'+this.metadata_event+'</li>';
              out+='</ul>';
              out+='</div>';
              out+='<a href=""></a>';
              out+='</div>';
              out+='</div>';
              out+='</div>';
            $('#goods').html(out);  //Отправка строки на вывод
          //$('body').append(this.name_event + '<br/>' + this.genre_event + '<br/>' + this.datetime_end_event + '<br/>' + this.datetime_end_event + '<br/>' + this.location + '<br/>' + this.metadata_event + '<br/>' + this.adults_only + '<br/>' + this.active + '<br/>' + this.rating + '<br/>' + this.id + '<br/>')
      })
    })

  }
