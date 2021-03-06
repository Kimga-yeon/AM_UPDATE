<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    
    <c:set var="contextPath" value="${pageContext.servletContext.contextPath}" scope="application"/>
    
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/animate.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/owl.carousel.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/owl.theme.default.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/magnific-popup.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/flaticon.css">
	<link rel="stylesheet" href="${contextPath}/resources/css/style.css">

	<style>
		.nav-top{font-family: 'S-CoreDream-4Regular' !important;}
		#ftco-navbar{font-family: 'S-CoreDream-6Bold' !important;}
	</style>
	
	<!-- sweetalert : alert창을 꾸밀 수 있게 해주는 라이브러리 https://sweetalert.js.org/ -->
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	
  </head>
  <body>
  
  	<c:if test="${!empty msg}">
		<script>
			swal({icon : "${status}",
				  title: "${msg}",
				  text : "${text}"});
		</script>
		<c:remove var="msg"/>
	</c:if>

 	<div class="wrap" >
		<div class="container">
			<div class="row">
			
				<div class="col-md-6 d-flex align-items-center">
					<p class="mb-0 phone pl-md-2 nav-top">
						<a href="${contextPath}/company/contact" class="mr-2"><span class="fa mr-1"></span>고객센터&nbsp;&nbsp;</a> 
						<a href="tel://12345678" class="mr-2"><span class="fa fa-phone mr-1"></span>+ 1234-5678</a> 
						<a href="mailto:AlbeitManagement@gmail.com"><span class="fa fa-paper-plane mr-1"></span> AlbeitManagement@gmail.com</a>
					</p>
				</div>

				<div class="col-md-6 d-flex justify-content-md-end">
					<p class="mb-0 phone pl-md-2 nav-top">
					
					<c:choose>
	            		<c:when test="${empty loginMember}"> 
							<a href="${contextPath}/member/login"><span class="fa" id="nav-first"></span>로그인</a>
	            			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<a href="${contextPath}/member/signUp"><span class="fa"></span>회원가입</a>
	            		</c:when>
	            		<c:otherwise>
	            			<a href="${contextPath}/member/updateMember"><span class="fa" id="nav-first"></span>${loginMember.memberName} 님</a>
	            			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	            			<a href="${contextPath}/member/logout"><span class="fa" id="nav-first"></span>로그아웃</a>
	            		</c:otherwise>
            		</c:choose>
			
					</p>
				</div>
				
			</div>
		</div>
	</div>
    
	  <nav class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light" id="ftco-navbar">
	    <div class="container">
	      <a class="navbar-brand" href="${contextPath}"><img src="${contextPath}/resources/images/main_logo_employee.png" width="70%"> </a>
	      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
	        <span class="oi oi-menu"></span>Menu
	      </button>
	
	      <div class="collapse navbar-collapse" id="ftco-nav">
	        <ul class="navbar-nav ml-auto">
	          <li class="nav-item"><a href="${contextPath}/company/about" class="nav-link">About</a></li>
	          <li class="nav-item"><a href="${contextPath}/work/workList" class="nav-link">근무 스케줄</a></li>
	          <li class="nav-item"><a href="${contextPath}/pay/payList" class="nav-link">급여 명세서</a></li>
			  <li class="nav-item"><a href="${contextPath}/pay/correctionList" class="nav-link">급여 정정 신청</a></li>
			  <li class="nav-item"><a href="${contextPath}/member/updateMember" class="nav-link">My Page</a></li>
	        </ul>
	      </div>
	    </div>
	  </nav>
	  <!-- END nav -->
	  
	  <!-- Bootstrap core JS-->
	  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.bundle.min.js"></script>
	  <!-- Third party plugin JS-->
	  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>
	
	  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
	  <script type="text/javascript" src="${contextPath}/resources/js/jquery.animateNumber.min.js"></script>
	  <script type="text/javascript" src="${contextPath}/resources/js/jquery.easing.1.3.js"></script>
	  <script type="text/javascript" src="${contextPath}/resources/js/jquery.magnific-popup.min.js"></script>
	  <script type="text/javascript" src="${contextPath}/resources/js/jquery.stellar.min.js"></script>
	  <script type="text/javascript" src="${contextPath}/resources/js/jquery.waypoints.min.js"></script>
	  <script type="text/javascript" src="${contextPath}/resources/js/jquery-migrate-3.0.1.min.js"></script>
	  <script type="text/javascript" src="${contextPath}/resources/js/owl.carousel.min.js"></script>
	  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	  <script type="text/javascript" src="${contextPath}/resources/js/scrollax.min.js"></script>
	  
	  <script type="text/javascript" src="${contextPath}/resources/js/main.js"></script>
	  <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>
	  <script type="text/javascript" src="${contextPath}/resources/js/calendar.js"></script>
	 
  </body>
</html>