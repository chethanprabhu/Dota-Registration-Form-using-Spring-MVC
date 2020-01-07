<%@ taglib uri="http://www.springframework.org/tags/form" prefix="lola" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>dota2</title>
<style>
	.error{
	color:red;
	}
</style>
</head>
<body>
Dota 2 Form. (*) marked fields are required
<br><br>
<lola:form action="confirmMe" modelAttribute="dota2">
USER-ID(*): <lola:input path="userID"/>
<lola:errors path="userID" cssClass="error"></lola:errors>
<br><br>
Nick Name: <lola:input path="nickName"/>
<lola:errors path="nickName" cssClass="error"></lola:errors>
<br><br>
Coupon Code: <lola:input path="couponCode"/>
<lola:errors path="couponCode" cssClass="error"></lola:errors>
<br><br>
Current MMR: <lola:input path="MMR"/>
<lola:errors path="MMR" cssClass="error"></lola:errors>
<br><br>
Position Type:
<lola:select path="role">
<lola:options items="${dota2.roleMap}"/>
</lola:select>
<br><br>
Preferred Hero Type: <lola:radiobuttons path="heroType" items="${dota2.heroTypeOptions}"/>
<br><br>
Reached Medals: <lola:checkboxes items="${dota2.reachedMedalsOptions}" path="reachedMedals"/>
<br><br> 
<input type="submit" value="GGWP">
</lola:form>

</body>
</html>