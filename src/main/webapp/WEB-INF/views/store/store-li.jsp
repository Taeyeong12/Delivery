<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fm" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<li>
		<%-- <a href="${store_admin }/detail/${storeList.id }"> --%>
		
		<div class="img_box">
			<a href="${pageContext.request.contextPath}/store/detail/${storeList.id}">
				<img src="${storeList.storeImg}" alt="이미지">
			</a>
		</div>

		<div class="info_box">
		
		<h2>
			<a href="${pageContext.request.contextPath}/store/detail/${storeList.id}">
				${storeList.storeName}
			</a>
		</h2>
			
		<a href="${pageContext.request.contextPath}/store/detail/${storeList.id}">
<%-- 				<span>
					<span>평점 ${storeList.score }</span> 
					
					<span class="score_box">
						<c:forEach begin="0" end="4" var="i">
							<c:if test="${Math.round(storeList.score) > i }">
								<i class="far fas fa-star"></i>
							</c:if>
							<c:if test="${Math.round(storeList.score) <= i }">
								<i class="far fa-star"></i>
							</c:if>
						</c:forEach>
					</span>
				</span> --%>
				
<%-- 			<span>
				 <span>리뷰 ${storeList.reviewCount }</span> 
				<span>사장님 댓글 ${storeList.bossCommentCount }</span>ㅇ
			</span> --%>
			
			<span>
				<span>최소주문금액 <fm:formatNumber value="${storeList.minDelivery }" pattern="###,###" />원</span>
				<span>배달팁 <fm:formatNumber value="${storeList.deliveryTip }" pattern="###,###" />원</span>
			</span>
			<span>배달시간 ${storeList.deliveryTime }분</span>
			</a>
		</div>
		
		
<%-- 	<c:if test="${!storeList.isOpen}">
		<div class="is_open">
			<a href="/store/detail/${storeList.id }">지금은 준비중입니다</a>
		</div>
	</c:if> --%>
</li>