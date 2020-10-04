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
								<form action="${contextPath }/member/updateProfile" onsubmit="return validate();">
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
										<div class="col-md-12">
											<div class="form-group">
												<label>Address</label> <input type="text"
													class="form-control" value="${loginMember.adminAddress }" name="adminAddress">
											</div>
										</div>
									</div>
									<div class="row">
										<div class="col-md-4 pr-md-1">
											<div class="form-group">
												<label>City</label> <input type="text" class="form-control"
													placeholder="City">
											</div>
										</div>
										<div class="col-md-4 px-md-1">
											<div class="form-group">
												<label>Country</label> <input type="text"
													class="form-control" placeholder="Country">
											</div>
										</div>
										<div class="col-md-4 pl-md-1">
											<div class="form-group">
												<label>Postal Code</label> <input type="number"
													class="form-control" placeholder="ZIP Code">
											</div>
										</div>
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
										src="../assets/img/emilyz.jpg" alt="...">
										<h5 class="title">Mike Andrew</h5>
									</a>
									<p class="description">Ceo/Co-Founder</p>
								</div>
								</p>
								<div class="card-description">Do not be scared of the
									truth because we need to restart the human foundation in truth
									And I love you like Kanye loves Kanye I love Rick Owens’ bed
									design but the back is...</div>
							</div>
							<div class="card-footer">
								<div class="button-container">
									<button href="javascript:void(0)"
										class="btn btn-icon btn-round btn-facebook">
										<i class="fab fa-facebook"></i>
									</button>
									<button href="javascript:void(0)"
										class="btn btn-icon btn-round btn-twitter">
										<i class="fab fa-twitter"></i>
									</button>
									<button href="javascript:void(0)"
										class="btn btn-icon btn-round btn-google">
										<i class="fab fa-google-plus"></i>
									</button>
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