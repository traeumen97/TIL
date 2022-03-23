var svg1 = new Vivus('svg1');
new Vivus('svg2',{type:'oneByOne'});

$(window).scroll(function(){
	if($(this).scrollTop() > $('#svg1').offset().top - $(this).height()){
		svg1.play();
	}else{
		svg1.reset();
	}
});