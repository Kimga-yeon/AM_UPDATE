<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

<head>
<jsp:include page="/WEB-INF/views/common/header.jsp" />


<style>
    	.pagination {
            justify-content: center;
        }
        #searchForm{
            position: relative;
        }
        #searchForm>*{
            top : 0;
        }
        
        
</style>        

</head>

<body class="">
	<div class="wrapper">

		<div class="main-panel">

			<!-- End Navbar -->
			<div class="content">
				<div class="row">
					<div class="col-md-12">
						<div class="card ">
							<div class="card-header">
								<h4 class="card-title">사장 회원 조회</h4>
							</div>
							<div class="card-body">
								<table class="table tablesorter " id="">
									<thead class=" text-primary">
										<tr>
											<th>이름</th>
											<th>이메일</th>
											<th>상호명</th>
											<th>가게주소</th>
											<th>전화번호</th>
											<th>가입일</th>
											<th class="text-center">회원상태</th>
										</tr>
									</thead>
									<tbody>
										<c:choose>
											<c:when test="${empty storeList}">
												<tr>
													<td colspan="6">존재하는 회원이 없습니다.</td>
												</tr>
											</c:when>
											<c:otherwise>
												<c:forEach var="store" items="${storeList}">
													<tr>
														<td>${store.memberName }</td>
														<td>${store.memberEmail }</td>
														<td>${store.storeName}</td>
														<td>${store.storeAddress}</td>
														<td>${store.storePhone}</td>
														<td>${store.memberEnrollDate}</td>
														<td class="text-center">${store.memberStatus}</td>

													</tr>
												</c:forEach>
											</c:otherwise>
										</c:choose>
									</tbody>
								</table>
							</div>
						</div>
						
						
										<!--------------------------------- 페이징바  ---------------------------------->
      	
      	<%-- 검색 파라미터가 포함된 url 생성 --%>
      <%-- 	<c:url var="searchParameter" value="${pInfo.boardType}">
      		<c:if test="${! empty paramValues.ct }">
      			<c:forEach var="ctName" items="${paramValues.ct}">
      				<c:param name="ct" value="${ctName }"/>
      			</c:forEach>
      		</c:if>
      		
      		<c:if test="${! empty param.sVal }">
      			<c:param name="sKey" value="${param.sKey }"/>
      			<c:param name="sKey" value="${param.sVal }"/>
      		</c:if>
      	</c:url>
      	
      	<c:choose>
      		검색 조건 존재하는 경우(파라미터 cp가 쿼리스트링 제일 마지막에 추가될 수 있도록 '&'기호 추가
      		<c:when test="${! empty paramValues.ct || ! empty param.sVal }">
      			<c:set var="url" value="${searchParameter }&cp="/>
 			    <c:set var="listUrl" value="../search/${url}${pInfo.currentPage }" scope="session"/>
      			
      		</c:when>
      		
      		검색 조건이 존재하지 않는 경우(파라미터 cp가 쿼리스트링 제일 마지막에 추가될 수 있도록 '?'기호 추가
      		<c:otherwise>
      			<c:set var="url" value="${searchParameter}?cp="/>
      			<c:set var="listUrl" value="../list/${url}${pInfo.currentPage }" scope="session"/>
      		</c:otherwise>
      	</c:choose>
      	
	      
		<div class="my-4">
            <ul class="pagination">
            	<c:if test="${pInfo.currentPage > pInfo.pagingBarSize }">	
	                <li>
	                	<!-- 맨 처음으로(<<) -->
	                    <a class="page-link text-primary" href="${url}1">&lt;&lt;</a>
	                </li>
	                
	                <li>
	                	<!-- 이전으로(<) -->
	                	<!-- prev 생성 식 : (현재 페이지 - 1) / 페이징바 사이즈(10) * 10 -->
	                	<!-- fmt태그를 이용한 소수점 제거 -->
	                	<fmt:parseNumber var="operand1" value="${(pInfo.currentPage -1)/pInfo.pagingBarSize}" integerOnly="true"/>
	                	<c:set var="prev" value="${operand1 * 10 }"></c:set>
                   		<a class="page-link text-primary" href="${url}${prev}">&lt;</a>
	                </li>
                </c:if>
                
                <!-- 10개의 페이지 목록 -->
                <c:forEach var="p" begin="${pInfo.startPage }" end="${pInfo.endPage }">
                	<c:choose>
                		<c:when test="${p == pInfo.currentPage}">
            				<li><a class="page-link">${p }</a></li>
                		</c:when>
                		<c:otherwise>
		               		<li>
		               			<a class="page-link text-primary" href="${pInfo.boardType }?cp=${p}">${p}</a>
		               			<a class="page-link text-primary" href="${url}${p}">${p}</a>
		                	</li>
                		</c:otherwise>
					</c:choose>               
                </c:forEach>
                
                
                
                <!-- 다음 페이지로(>) -->
                <!-- next 생성 식 : (현재 페이지 + 9) / 10 * 10 + 1 -->
                <c:if test="${pInfo.maxPage > pInfo.endPage}">
	                <li>
	                	<fmt:parseNumber var="operand2" value="${(pInfo.currentPage + pInfo.pagingBarSize - 1)/pInfo.pagingBarSize} " integerOnly="true"/>
	                	<c:set var="next" value="${operand2 * pInfo.pagingBarSize + 1 }"/>
						<a class="page-link text-primary" href="${url}${next}">&gt;</a>
	                </li>
	                
	                <!-- 맨 끝으로(>>) -->
	                <li>
	                    <a class="page-link text-primary" href="${url}${pInfo.maxPage}">&gt;&gt;</a>
	                </li>
                </c:if>
            </ul>
        </div>	     

        <div>
           <div  class="text-center" id="searchForm" style="margin-bottom:50px;">
                <select name="sKey" class="form-control" style="width:100px; display: inline-block; background-color: #344675">
                    <option value="name">이름</option>
                    <option value="storeName">가게이름</option>
                    <option value="address">지역</option>
                </select>
                <input type="text" name="sVal" class="form-control" style="width:25%; display: inline-block;">
                <button class="form-control btn btn-primary" id="searchBtn" type="button" style="width:100px; display: inline-block;">검색</button>
            </div>
            
            
        </div>
   	
	</div>
						 --%>
						
					</div>
					<div class="col-md-12">
						<div class="card  card-plain">
							<div class="card-header">
								<h4 class="card-title">알바 회원 조회</h4>
							</div>
							<div class="card-body">
								<table class="table tablesorter " id="">
									<thead class=" text-primary">
										<tr>
											<th>이름</th>
											<th>이메일</th>
											<th>상호명</th>
											<th>전화번호</th>
											<th>가입일</th>
											<th class="text-center">회원상태</th>
										</tr>
									</thead>
									<tbody>
										<c:choose>
											<c:when test="${empty storeList}">
												<tr>
													<td colspan="7">존재하는 회원이 없습니다.</td>
												</tr>
											</c:when>
											<c:otherwise>
												<c:forEach var="employee" items="${employeeList}">
													<tr>
														<td>${employee.memberName }</td>
														<td>${employee.memberEmail }</td>
														<td>${employee.storeName}</td>
														<td>${employee.memberPhone}</td>
														<td>${employee.memberEnrollDate}</td>
														<td class="text-center">${employee.memberStatus}</td>

													</tr>
												</c:forEach>
											</c:otherwise>
										</c:choose>

									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
			
			
			
			

	
	
	

			</div>
		</div>
	</body>


</html>