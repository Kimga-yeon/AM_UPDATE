<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

<head>
<jsp:include page="/WEB-INF/views/common/header.jsp" />
</head>

<body class="">
	<div class="wrapper">

		<div class="main-panel">

			<!-- End Navbar -->
			<div class="content">
				<div class="row">
					<div class="col-md-8">
						<div class="card">
							<div class="card-header">
								<h5 class="title">관리자 정보 수정</h5>
							</div>
							<div class="card-body">
								<form action="${contextPath }/member/updateProfile" name="updateProfile" onsubmit="return validate();">
									<div class="row">

										<div class="col-md-5 pr-md-1">
											<div class="form-group">
												<label for="exampleInputEmail1"> Email address</label> <input
													type="email" class="form-control"
													value="${loginMember.memberEmail }" name="memberEmail">
											</div>
										</div>
									</div>
									<div class="row">
										<div class="col-md-5 pr-md-1">
											<div class="form-group">
												<label>Name</label> <input type="text" class="form-control"
													value="${loginMember.memberName }" name="memberName" >
											</div>
										</div>

										<div class="col-md-5 pr-md-1">
											<div class="form-group">
												<label>Phone</label> <input type="text" class="form-control"
													value="${loginMember.memberPhone }" name="memberPhone">
											</div>
										</div>
									</div>
									<div class="row">
									<div class="col-md-3">
											<div class="form-group">
												<label class="label" for="postcodify_search_button">우편번호</label> 
												<input type="text" class="form-control postcodify_postcode5" name="zipcode" id="post" value="${loginMember.zipcode }" required readonly>
											</div>
										</div>
				                        <div class="col-md-6">
				                        	<div class="form-group pt-3">
				                            	<button type="button" class="btn btn-primary checkBtn" id="postcodify_search_button">검색</button>
				                            </div>
				                        </div>
				                        </div>
				                        
				                        <div class="col-md-8">
											<div class="form-group">
												<label class="label" for="address1">도로명 주소</label> 
												<input type="text" class="form-control postcodify_address" name="adminAddress" id="address1" value="${loginMember.adminAddress }" required readonly>
											</div>
										</div>
										
										  <div class="col-md-8">
											<div class="form-group">
												<label class="label" for="address2">상세주소</label> 
												<input type="text" class="form-control postcodify_details" name="detailedAddress" id="address2" value="${loginMember.detailedAddress }" >
											</div>
										</div>
		
					                    <!-- jQuery와 postcodify 를 로딩한다. -->
					                    <script src="//d1p7wdleee1q2z.cloudfront.net/post/search.min.js"></script>
					                    <script>
					                        // 검색 단추를 누르면 팝업 레이어가 열리도록 설정한다.
					                        $(function(){
					                            $("#postcodify_search_button").postcodifyPopUp();
					                        });
					                    </script>
									
									</div>
									<div class="row">
										<div class="col-md-8">
											<div class="form-group">
												<label>About Me</label>
												<textarea rows="4" cols="80" class="form-control"
													placeholder="${loginMember.aboutMe }" name="aboutMe">"${loginMember.aboutMe }"  </textarea>
											</div>
										</div>
									</div>
								   <div class="card-footer">
										<button type="submit" class="btn btn-fill btn-primary">Save</button>
							       </div>
								</form>
							</div>
						</div>
					
					<div class="col-md-4">
						<div class="card card-user">
							<div class="card-body">
								<p class="card-text">
								<div class="author">
									<div class="block block-one"></div>
									<div class="block block-two"></div>
									<div class="block block-three"></div>
									<div class="block block-four"></div>
									<a href="javascript:void(0)"> <img class="avatar"
										src="${contextPath}/resources/assets/img/1.jpg" alt="...">
										<h5 class="title">Kim Ga Yeon</h5>
									</a>
									<p class="description">BackEnd Developer</p>
								</div>
								</p>
								<div class="card-description">A dream grands what one covets when awake <br>
								"꿈은 깨어 있을 때 원하던 것을 준다"</div>
							</div>
						
							<div class="card-footer">
								<div class="button-container">
									<button href="javascript:void(0)"
										class="btn btn-icon btn-round btn-facebook" >
										<i class="fab fa-facebook"></i>
									</button>
									<button href="javascript:void(0)"
										class="btn btn-icon btn-round btn-twitter" >
										<i class="fab fa-twitter"></i>
									</button>
									<button href="javascript:void(0)"
										class="btn btn-icon btn-round btn-google" onclick="window.open('https://github.com/Kimga-yeon')" >
										<i class="fab fa-google-plus"></i>
									</button>
								</div>
							</div>
							
							</div>
						</div>
					</div>
				</div>
			</div>

			<noscript>
				<img height="1" width="1" style="display: none"
					src="https://www.facebook.com/tr?id=111649226022273&ev=PageView&noscript=1" />
			</noscript>
		<jsp:include page="/WEB-INF/views/common/footer.jsp" />
		
</body>


</html>