<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
<style>
header .admin_page_btn {
    font-size: 13px;
    position: absolute;
    right: 10px;
    top: 10px;
    font-weight: bold;
}

header .admin_page_btn a {
    border: 1px solid #ddd;
    border-radius: 10px;
    padding: 5px;
    background: #fff;
    font-size: 13px;
    display: block;
}
</style>
</head>
<body>
    <!-- <body> -->

    <header>
        <div id="header">
            <a href="<c:url value='/' />"><img alt="이미지" src="<c:url value='/resources/img/baemin.jpg' />"></a>

            <c:if test="${SPRING_SECURITY_CONTEXT != null }">
                로그인중            
            </c:if>

            <!-- 임시 -->
            <c:if test="${SPRING_SECURITY_CONTEXT.authentication.principal.user.role == 'ROLE_ADMIN' }"> 
                <div class="admin_page_btn">
                    <div>
                        <a href="<c:url value='/admin/main' />">사장님 페이지</a>
                    </div>
                </div>
            </c:if>
            <!-- 임시 -->
            
            <div class="menu_tab_box active">
                <div class="menu_tab">
                    <span> </span>
                    <span> </span>
                    <span> </span>
                </div>
            </div>
        </div>
    </header>
    <!-- 헤더 -->
</body>
</html>
