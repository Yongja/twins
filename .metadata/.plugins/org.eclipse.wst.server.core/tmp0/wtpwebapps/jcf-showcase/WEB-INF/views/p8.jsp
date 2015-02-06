<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description" content="jcf showcase">
		<meta name="author" content="jcf">
		<title>JCF Showcase</title>

		<!-- Le styles -->
		<link href="assets/bootstrap/css/bootstrap.css" rel="stylesheet">
		<link href="assets/bootstrap/css/bootstrap-responsive.css" rel="stylesheet">
		<link href="assets/bootstrap/css/docs.css" rel="stylesheet">
		<link href="assets/bootstrap/css/prettify.css" rel="stylesheet">
		<link rel="stylesheet" href="assets/css/jquery-ui-1.9.2.custom.css" />

		<!-- 공통 lib-->
		<script src="lib/jquery-1.9.0.js"></script>
		<script src="lib/jquery-ui-1.9.2.custom.js"></script>
		<script src="assets/bootstrap/js/bootstrap.js"></script>
		<script src="assets/bootstrap/js/prettify.js"></script>
		<script src="assets/bootstrap/js/application.js"></script>
		<script src="js/p8.js"></script>
	</head>
	<!-- <script type="text/javascript" src="https://maps.google.com/maps/api/js?v=3&sensor=false&language=ko"></script> -->
	<script type="text/javascript" src="https://maps.google.com/maps/api/js?sensor=true"></script>
	<body data-spy="scroll" data-target=".bs-docs-sidebar">

		<!-- Navbar -->
		<div class="navbar navbar-inverse navbar-fixed-top">
			<div class="navbar-inner">
				<div class="container">
					<button type="button" class="btn btn-navbar" data-toggle="collapse"
						data-target=".nav-collapse">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="brand" href="/jcf-showcase/index.html">JCF-Showcase</a>
					<div class="nav-collapse collapse">
						<ul class="nav">
							<li class=""><a href="/jcf-showcase/index.html">Home</a></li>
							<li class=""><a href="/jcf-showcase/openpage.do?viewname=p1">JCF SUA</a></li>
							<li class=""><a href="/jcf-showcase/openpage.do?viewname=p2">파일업로드/다운로드</a>
							<li class=""><a href="/jcf-showcase/openpage.do?viewname=p3">대용량조회</a></li>
							<li class=""><a href="/jcf-showcase/openpage.do?viewname=p4">예외 및 메시지처리</a></li>
							<li class=""><a href="/jcf-showcase/openpage.do?viewname=p5">JCF Query</a></li>
							<li class=""><a href="/jcf-showcase/openpage.do?viewname=p6">활용 CASE</a></li>
							<li class=""><a href="#">JCF-IAM(개발예정)</a></li>
							<li class=""><a href="/jcf-showcase/openpage.do?viewname=p7">YONG-DEV</a></li>
							<li class="active"><a href="/jcf-showcase/openpage.do?viewname=p8">전국요양병원현황</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<!-- Subhead -->
		<header id="overview"> </header>

		<div class="container">
			<!-- Docs nav -->
			<div class="row">
				<div class="span1 bs-docs-sidebar">
					<ul class="nav nav-list bs-docs-sidenav">
						<li><a href="#p81"> <i class="icon-chevron-right"></i>Sample 예제</a></li>
					</ul>
				</div>
				<div class="span11">
					<!-- Request Mapping -->
					<section id="p81">
	         			<div class="page-header">
							<h3>전국 요양병원 현황</h3>
							<p>
								전국 요양병원 현황(요양병원명,주소,연락처)을 제공합니다.<br/>
						 
							</p>
						</div>
						<section id="p81_1">
							<h4>List 조회</h4>
								<table class="table table-striped">
									<thead>
										<tr>
											<th>구분</th>
											<th>병원명</th>
											<th>위도</th>
											<th>요양병상수</th>
											<th>소재지지번주소</th>
											<th>경도</th>
											<th>근무시간</th>											
											<th>소재지도로명주소</th>											
											<th>소재지우편번호</th>											
											<th>진료과목</th>											
											<th>ID</th>											
											<th>연락처</th>			
											<th>지도(위치)</th>								
										</tr>
									</thead>
									<tbody>
									</tbody>
								</table>
						</section>
						
						
										
						<section id="p82">
							<h4 id="headings">지도</h4>
							<br/><br/>
							<form id="p82_1_Form"   class="form-horizontal"  method="post"  enctype="multipart/form-data">
								<div class="bs-docs-example" id="p82_1"><br/>
									<input type="hidden" name="applyId" id="p82_1_applyId"  />
									<div class="control-group">
										<label class="control-label" for="p82_4_iframe">위치:</label>
										<div id='map_canvas' style='width:300px;height:300px;'></div>
									</div>
									
									<br/>
								</div>
							</form>
						</section>
					</section>
				</div>
			</div>
		</div>

		<!-- Footer -->
		<footer class="footer">
			<div class="container">
		 		<p>Homepage : <a href="http://jcf.daewoobrenic.co.kr/blog/">JCF Blog</a></p>
        		<p>E-Mail : <a href="mailto:jcf@disc.co.kr">jcf@disc.co.kr</a></p>
        		<p>Copyright © 2013 Daewoo Information Systems Co., Ltd..</p>
			</div>
		</footer>

		<!-- Analytics -->
		<script>
			var _gauges = _gauges || [];
			(function() {
				var t = document.createElement('script');
				t.type = 'text/javascript';
				t.async = true;
				t.id = 'gauges-tracker';
				t.setAttribute('data-site-id', '4f0dc9fef5a1f55508000013');
				t.src = '//secure.gaug.es/track.js';
				var s = document.getElementsByTagName('script')[0];
				s.parentNode.insertBefore(t, s);
			})();
		</script>
	</body>
</html>