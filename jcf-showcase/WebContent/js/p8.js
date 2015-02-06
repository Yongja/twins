var contextPath="/jcf-showcase/";

!function ($) {

	$(function(){
		$(function() {
			$.ajax({
				dataType : "json"
			  , contentType : "application/json+sua; charset=UTF-8"
			  , type : "POST"
              , url : contextPath +"sample/example/getWSList.do"
              , success : function(reponse, status, request){
            	  console.log("p8 pass");
            	
            	  var data = reponse.DS_OUT;
            	  console.log(data.length);
            	  console.log(data);
            	  var s = '';
            	  //var s2 = '<option  selected="selected">부서선택</option>';
            	  var obj;
            	  for(var i = 0, len = data.length; i < len; i++){
	      			  obj = data[i];
	      			  s += '<tr>';
	      			  s += '<td name="keyFlag"><u>' + obj.keyFlag + ' </></td>';
	      			  s += '<td>' + obj.HspName + '</td>';
	      			  s += '<td>' + obj.latitude + '</td>';
	      			  s += '<td>' + obj.HspConstant + '</td>';
	      			  s += '<td>' + obj.address + '</td>';
	      			  s += '<td>' + obj.longitude + '</td>';
	      			  s += '<td>' + obj.workTime + '</td>';	      			  
	      			  s += '<td>' + obj.roadAddress + '</td>';
	      			  s += '<td>' + obj.postCode + '</td>';	      			  
	      			  s += '<td>' + obj.parts + '</td>';
	      			  s += '<td>' + obj.id + '</td>';	      			  
		      		  s += '<td>' + obj.phoneNo + '</td>';	      			  
	      			  s += '</tr>';
            	  }

            	  $('#p81_1 table tbody').html(s);
              }
              , error : function(request, status, error){
            	  console.log("통신실패");
              }
			});
		});

		$('#p81_1 table').on('click' ,'td[name=keyFlag]', function(e){
			console.log("tt");
    		//e.preventDefault();
    		getApply($(e.target).text());
    	});
//
//        $('#p82_1_btn1').click(function(e){
//            $('#p82_1_applyId').val("");
//            $('#p82_1_applyName').val("");
//            $('#p82_1_phoneNum').val("");
//
//            var img='<label class="control-label" for="p21_2_param3">사진 업로드</label><div class="controls"><input type="file"  ame="dbFileId">';
//            $('#p82_1_pic').html(img);
//        });
//
//        $('#p82_1_btn2').click(function(e){
//        	document.getElementById("p62_1_Form").submit();
//        });
//        
//        $('#p82_1_btn3').click(function(e){
//        	WebServiceTemplete();
//        });
        
	});

}(window.jQuery);

function getApply(applyId) {
	//window.open("views/googlemap.html", "구굴맵", "", true);
	callGoogleMap();
	
//   var successData= "<div id='map_canvas' style='width:300px;height:300px;'></div>"
//	$('#p82_4_iframe').html(successData);
    
  }

/*
function getiFrameData(param1, param2, param3) {
	$('#p82_1_attchId').val(param1);
	$('#p82_1_attchFold').val(param2);
	$('#p82_1_attchName').val(param3);

	var successData="<div class='bs-docs-example-result'><p>파일 이름 : " + param3 +"<br/>업로드 경로 : " + param2 + "<br/>서버에 저장된 파일이름 : " + param1 + "</p></div>";

	$('#p82_4_iframe').html(successData);
}

function CategoryToUl(xml){
    var categories = xml.children('category');
    if (categories.length > 0)
    {
        var ul = $('<ul/>');
        categories.each(function(){
            var $this = $(this);
            var li = $('<li/>');
            var a = $('<a/>',{
                text: $this.children('title').text(),
                href: '#' + $this.children('catId').text()
            });
            li.append(a);
            li.append( CategoryToUl( $this ) );
            ul.append(li);
        });
        return ul;
    }
    return null;
}*/

//function WebServiceTemplete(){
// 
//        $.ajax({
//           type: "GET"
//           ,dataType: "xml"
//           ,url: "http://api.data.go.kr/openapi/4f43aaf7-f391-4048-9532-f102b5ae0bbf?serviceKey=63cKTXSSLIa5yUJDQDLxn6d1s2Kpt%2FIYLol74pJsclTueGpBjq6KHfoeFSCgJFAN2QvjlpZ0Y%2B2%2FYgPWjEg1%2Bw%3D%3D"
//           ,success: function(xml){
//                var xmlData = $(xml).find("info");
//                var listLength = xmlData.length;
//                alert(listLength);
//                if (listLength) {
//                    var contentStr = "";
//                    $(xmlData).each(function(){
//                        contentStr += "[기호"+ $(this).find("no").text() +"] "
//                                      + $(this).find("name").text() + "후보(" 
//                                      + $(this).find("job").text() + ")</br>";
//                    });
//                    $("#after").append(contentStr);
//                }
//            }
//         }); 
//    }

function callGoogleMap(){
	
	
		var latlng = new google.maps.LatLng(35.2059877, 129.0734742);
		var marker_name = "롯데 백화점";
		var marker_position = new google.maps.LatLng(35.2059877, 129.0734742);
		var myOptions = {       
			zoom: 15,       
			center: latlng,       
			mapTypeId: google.maps.MapTypeId.ROADMAP,
			zoomControl : true,
			streetViewControl : false,
			disableDoubleClickZoom : false,
			draggable  : false,
			scrollwheel : false,
			mapTypeControl : false,
			scaleControl : true,
			rotateControl : false,
			panControl : false	
		};     
		var map = new google.maps.Map(document.getElementById("map_canvas"),myOptions); 
		var marker = new google.maps.Marker({
				position : marker_position,
				map : map,
				title : marker_name
			});
	
}