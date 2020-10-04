<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>급여 설정</title>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<!-- <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.css">
<script src="https://cdn.datatables.net/t/bs-3.3.6/jqc-1.12.0,dt-1.10.11/datatables.min.js"></script> -->
<!-- data table에서 jquery를 사용하기 때문에 가져옵니다.-->
<!-- data table -->
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.css">
<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.js"></script>


    
<style>

      /* 급여명세서 */
    
      .board-list{ margin: 40px auto;}
     
        #list-table td{
           cursor: pointer;
        }

      .tabType1 {
         height: 50px;
         text-align: center;
         font-family: 'S-CoreDream-6Bold';
      }
      
      .tabType1 li {
         display: inline-block;
         width: 199px;
         height: 48px;
         margin-left: -4px;
         border: 1px solid #c4c4c4;
         border-left-width: 0;
      }
      
      .tabType1 li:first-child {
         margin-left: 0;
         border-left-width: 1px;
      }
      
      .tabType1 li a {
         display: block;
         height: 48px;
         text-align: center;
         line-height: 48px;
         font-size: 14px;
         color: #3A3847;
      }
      
      .tabType1 li.on {
        position: relative;
         border-color: #c4c4c4;
         background: #589168;
      }
      
      .tabType1 li.on a {
         color: #fff;
      }
      
      #list-table{
         width:1100px;
      
      }
       
       th{
          background-color: bcdeb0;   
       }
      th:nth-of-type(5) { display: none; 
            
      }   
      
      #memberno{
         display: none;
         
      }
      
      
      #month{
	   	width: 150px;
	   }
      
    
      
      
</style>
<!-- <link rel="stylesheet" href="https://cdn.datatables.net/t/bs-3.3.6/jqc-1.12.0,dt-1.10.11/datatables.min.css"/> --> 
   
    <script>
        jQuery(function($){
            $("#list-table").DataTable();
            
        });
        
       
    </script>

</head>
<body>

   <!-- ------------------------- header ---------------------------- -->
   <jsp:include page="/WEB-INF/views/common/header.jsp" />

   <!-- ------------------------- main ---------------------------- -->
   <section class="ftco-section">
      <div class="overlay"></div>
      <div class="container">

         <div class="row justify-content-center pb-5">
            <div class="col-md-7 heading-section text-center fadeInUp">
               <span class="subheading">SALARY</span>
               <h2>급여 명세서</h2>
            </div>
         </div>

         <!-- ------------------------- side menu ---------------------------- -->
          <ul class="tabType1">
           <li><a href="${contextPath}/pay/insertPay">급여설정</a></li>
            <li class="on"><a href="${contextPath}/management/payStubList">급여 명세서</a></li>
           <li><a href="${contextPath}/management/requestPayStub">정정 신청</a></li>
          </ul>
         <!-- ------------------------- side menu ---------------------------- -->


       		<div class="container board-list">
            
              <div style="height:530px">
              		
              		
                  <table class="table table-hover tabType1 table-striped" id="list-table">
                  	<select id="month" class="custom-select custom-select-sm" >
						  <option id="all">월별 검색</option>
						  <option value="01">01</option>
						  <option value="02">02</option>
						  <option value="03">03</option>
						  <option value="04">04</option>
						  <option value="05">05</option>
						  <option value="06">06</option>
						  <option value="07">07</option>
						  <option value="08">08</option>
						  <option value="09">09</option>
						  <option value="10">10</option>
						  <option value="11">11</option>
						  <option value="12">12</option>
					</select>
                     <thead>
                          <tr>
                              <th>글번호 </th>
                              <th>가게 상호명</th>                              
                              <th>알바생이름</th>                            
                              <th>급여명세서 작성일</th>                            
                              <th >멤버번호</th>                            
                              
                          </tr>
                      </thead>
                       <tbody>
                         <c:choose>
                            <c:when test="${empty paystubList }">
                               <tr>
                               <td colspan="5">알바생이 없습니다.</td>
                               </tr>
                            </c:when>
                            
                            <c:otherwise>
                               
                               
                              <c:forEach var="paystub" items="${paystubList}">
                                    <tr>
                                    
                                       <td>${paystub.payNo }</td>
                                       <td>${paystub.storeName }</td>
                                       <td>${paystub.memberName }</td>
                                       <td>${paystub.payCreateDate }</td>
                                       <td id="memberno">${ paystub.memberNo}</td>
                                       
                                       
                                    
                                    </tr>
                              
                              </c:forEach>
                             
                              
                            </c:otherwise>
                         </c:choose>
                      
                      
                      </tbody>
                  </table>
              </div>
  	</div>
          <%--     
              로그인이 되어있는 경우에만 글쓰기 버튼 보이게 하기
              <c:if test="${!empty loginMember}">
                <a class="btn btn-primary float-right" href="../${boardList[0].boardType}/insert">글쓰기</a>
            </c:if> --%>
               
       
                </div>
                
           
 
   </section>
   
   <script >
      $(function(){
         $("#list-table td").on("click",function(){
            console.log("클릭됨");
            
            var payNo = $(this).parent().children().eq(0).text();
            ///am1/management/payStubList/1?=500
            var payboardUrl="${contextPath}/management/bills/" + payNo;
            location.href=payboardUrl;
            
         

         });
      });
      
      
      /* 월별 조회 */
      $("#month").change(function(){
     	 var month=$(this).val();
     	 
     	 console.log(month);
     	 
     	 
     	 if($("#all").prop("selected")){
     		location.href="${contextPath}/management/payStubList";
     	 }
     	 
     	 $.ajax({
     		 url:"selectPaystub",
     		 data:{"month":month},
     		 dataType: "json",
     		 type : "GET",		 
     		 success:function(list){
     			$tbody = $("#list-table > tbody");
     			 console.log("list : "+list);
     			 console.log($tbody);
     			
     			
     			$tbody.html("");
     			var payNo;
     			 $.each(list, function(index, item){
    					$tr = $("<tr>");
    					$td1 = $("<td>").text(item.payNo);
    					$td2 = $("<td>").text(item.storeName);
    					$td3 = $("<td>").text(item.memberName);
    					$td4 = $("<td>").text(item.payCreateDate);

    					$tr.append($td1, $td2, $td3, $td4);
            			$tbody.append($tr);
            			payNo = item.payNo;
     			 });
     			 
     			 $tr.on("click",function(){
     				var payboardUrl="${contextPath}/management/bills/" + payNo;
     	            location.href=payboardUrl;
     			 });
     	            
     			 
     			
     		 },error:function(){
     			console.log("ajax 통신실패");
     		 }
     	 });
      });
      
   </script>


   <!-- ------------------------- footer ---------------------------- -->
   <jsp:include page="/WEB-INF/views/common/footer.jsp" />
   
   

</body>
</html>