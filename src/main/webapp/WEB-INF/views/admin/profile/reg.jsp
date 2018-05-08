<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<main class="main">
<!--background-->
	<h1>profile reg page</h1>
	<div class="register-form-w3layouts">
		<!-- Form starts here -->
		<form action="#" method="post">
			<h3 class="sub-heading-agileits">Profile Details</h3>
			<div class="main-flex-w3ls-sectns">
				<div class="field-agileinfo-spc form-w3-agile-text1">
					<input type="text" name="name" placeholder="이름" required="">
				</div>
				<div class="field-agileinfo-spc form-w3-agile-text2">
					<select class="form-control" name="gender">
						<option>성별</option>
						<option value="남성">남성</option>
						<option value="여성">여성</option>
					</select>
				</div>
			</div>
			<div class="main-flex-w3ls-sectns">
				<div class="field-agileinfo-spc form-w3-agile-text1">
					<input id="datepicker1" name="birthday" type="text" placeholder="생년월일" value="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'mm/dd/yyyy';}"
					    required="">
				</div>
				<div class="field-agileinfo-spc form-w3-agile-text2">
					<input type="text" name="address" placeholder="주소" required="">
				</div>
			</div>
			<div class="main-flex-w3ls-sectns">
				<div class="field-agileinfo-spc form-w3-agile-text1">
					<input type="text" name="phone" placeholder="연락처" required="">
				</div>
				<div class="field-agileinfo-spc form-w3-agile-text2">
					<input type="email" name="email" placeholder="Email" required="">
				</div>
			</div>
			<div class="main-flex-w3ls-sectns">
				<div class="field-agileinfo-spc form-w3-agile-text1">
					<input type="text" name="school" placeholder="학교" required="">
				</div>
				<div class="field-agileinfo-spc form-w3-agile-text2">
					<input type="text" name="major" placeholder="전공" required="">
				</div>
			</div>
			<div class="clear"></div>
			<div>
				<h2 class="sub-heading-agileits">
					<span>Experience Details</span>
					<a href="">
						<img src="${root}/resource/images/ic_add_white_24dp_1x.png" alt="" class="add-image">
					</a>
					<a href="">
						<img src="${root}/resource/images/ic_remove_white_24dp_1x.png" alt="" class="remove-image">
					</a>
				</h2>
				<div>
					<div class="main-flex-w3ls-sectns">
						<div class="field-agileinfo-spc form-w3-agile-text1">
							<input type="text" name="company" placeholder="회사명" required="">
						</div>
						<div class="field-agileinfo-spc form-w3-agile-text2">
							<select class="form-control" name="inOffice">
								<option>재직여부</option>
								<option value="재직중">재직중</option>
								<option value="퇴사">퇴사</option>
							</select>
						</div>
					</div>
					<div class="main-flex-w3ls-sectns">
						<div class="field-agileinfo-spc form-w3-agile-text1">
							<input id="datepicker2" name="entDate" type="text" placeholder="입사일" value="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'mm/dd/yyyy';}"
							    required="">
						</div>
						<div class="field-agileinfo-spc form-w3-agile-text2">
							<input id="datepicker3" name="leavDate" type="text" placeholder="퇴사일" value="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'mm/dd/yyyy';}"
							    required="">
						</div>
					</div>
					<div class="main-flex-w3ls-sectns">
						<div class="field-agileinfo-spc form-w3-agile-text1">
							<input type="text" name="business" placeholder="담당업무" required="">
						</div>
						<div class="field-agileinfo-spc form-w3-agile-text2">
							<input type="text" name="position" placeholder="직급" required="">
						</div>
					</div>
					<div class="field-agileinfo-spc form-w3-agile-text">
						<textarea name="detail" placeholder="프로젝트 상세내역"></textarea>
					</div>
					<!-- <div class="radio-section">
						<h6>Taking any medications currently</h6>
						<ul class="radio-buttons-w3-agileits">
							<li>
								<input type="radio" id="a-option" name="selector1">
								<label for="a-option">Yes</label>
								<div class="check"></div>
							</li>
							<li>
								<input type="radio" id="b-option" name="selector1">
								<label for="b-option">No</label>
								<div class="check">
									<div class="inside"></div>
								</div>
							</li>
						</ul>
						<div class="clear"></div>
					</div>
					<div class="field-agileinfo-spc form-w3-agile-text">
						<textarea name="Message" placeholder="If you are taking please list them here.."></textarea>
					</div> -->
				</div>
			</div>
			<input type="submit" value="저장">
			<input type="reset" value="취소">
			<div class="clear"></div>
		</form>
		<!--// Form starts here -->
	</div>
	<!-- <h1 class="hidden">프로필 등록 페이지</h1>
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
			<div class="formCertificate">
				<table class="certificate-container">
					<span><input id="cert-name" name="cert-name" type="text" placeholder="자격증 명"/></span>
					<span><input id="cert-no" name="cert-no" type="text" placeholder="자격증 번호"/></span>
					<span><input id="cert-level" name="cert-level" type="text" placeholder="수준"/></span>
					<span><input id="cert-publisher" name="cert-publisher" type="text" placeholder="발행처"/></span>
					<span><input id="cert-pubDate" name="cert-pubDate" type="date"/></span>
				</table>
				<button>자격증 추가</button>
			</div>
		</section>
	</form> -->
</main>