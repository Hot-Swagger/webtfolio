<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<main class="main">
	<h1 class="hidden">프로필 등록 페이지</h1>
	<form>
		<section class="profile-detail">
			<h1>Edit Profile</h1>
			<table>
				<tr>
					<td>
						<label for="name">성명: </label>
					</td>
					<td>
						<input id="name" name="name" type="text" />
					</td>
				</tr>
				<tr>
					<td>
						<label for="gender">성별: </label>
					</td>
					<td>
						<select id="gender" name="gender">
							<option>남성</option>
							<option>여성</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>
						<label for="birthday">생년월일: </label>
					</td>
					<td>
						<input id="birthday" name="birthday" type="date"/>
					</td>
				</tr>
				<tr>
					<td>
						<label for="address">주소: </label>
					</td>
					<td>
						<input id="address" name="address" type="text"/>
					</td>
				</tr>
				<tr>
					<td>
						<label for="phone">연락처: </label>
					</td>
					<td>
						<input id="phone" name="phone" type="text" />
					</td>
				</tr>
				<tr>
					<td>
						<label for="email">E-mail: </label>
					</td>
					<td>
						<input id="email" name="email" type="text" />
					</td>
				</tr>
				<tr>
					<td>
						<label for="school">학교: </label>
					</td>
					<td>
						<input id="school" name="school" type="text"/>
					</td>
				</tr>
				<tr>
					<td>
						<label for="major">전공: </label>
					</td>
					<td>
						<input id="major" name="major" type="text"/>
					</td>
				</tr>
				<tr>
					<td>
				</tr>
			</table>
		</section>
	</form>
</main>