<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/include/link.jsp"%>

<html>
<head>
<link rel="stylesheet" href="resources/css/login.css">

</head>
<body>
	<c:if test="${!empty loginFailMsg }">
	    <script type="text/javascript">
	        const msg = "${loginFailMsg}";
	        swal(msg);
	    </script>
	</c:if>
    <main>
        <div class="login_box">
        	
			<a href="/"><img alt="이미지" class="bm_img" src="<c:url value='/resources/img/bamin2.png' />"></a>    
            
            <form action="${pageContext.request.contextPath}/login" method="post">
	            <div class="input_aera"><input type="text" name="username"  value="" required placeholder="이메일을 입력해 주세요" maxlength="30" ></div>
	            <div class="input_aera"><input type="password" name="password" value="" required placeholder="비밀번호를 입력해 주세요" maxlength="30"></div>
 
				<input type="submit" value="로그인" class="login_btn" >
            
				<div class="box">
					<div class="continue_login">
						<label for="continue_login"> 
							<span>로그인 유지하기</span>
							<input type="checkbox" id="continue_login" name="remember-me" > 
							<i class="fas fa-check-square"></i>
						</label>
					</div>
					
		            <div>
		            	<span class="id_search"><a href="/find/id">아이디</a></span>
			            <span> ㅣ </span>
			            <span><a href="/find/password">비밀번호 찾기</a></span>
		            </div>
	            </div>
            </form>
            
			<div id="oauth_login">
				<div>				
					<a href="/oauth2/authorization/kakao"></a>
				</div>
 
				<div>
					<a href="/oauth2/authorization/naver"></a>
				</div>
				
				<div>
					<a href="/oauth2/authorization/google"></a>
				</div>
			</div>
			
			<div class="join"><a href="join" >회원 가입하러 가기</a></div>
        </div>
    </main>
    
    
</body>
</html>
