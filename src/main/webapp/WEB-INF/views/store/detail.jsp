<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/link.jsp"%>


<link rel="stylesheet" href="<c:url value='/resources/css/modal.css'/>">
<link rel="stylesheet" href="<c:url value='/resources/css/store/detail.css'/>">

<%@ include file="/WEB-INF/views/include/header.jsp"%>


<!-- 메인 -->
<%@ include file="/WEB-INF/views/store/storeDetail.jsp"%>
<!-- 메인 -->

<!-- 푸터 -->
<%@ include file="/WEB-INF/views/include/footer.jsp"%>
<!-- 푸터 -->

<!-- 메뉴 모달 -->
<%@ include file="/WEB-INF/views/modal/modal_food.jsp"%>
<!-- 메뉴 모달 -->



<script type="text/javascript" src="<c:url value='/resources/js/store/storeDetail.js' />"></script>

</body>
</html>