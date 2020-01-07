<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DOTA confirm page</title>
</head>
<body>
Hello ${dota2.userID}. Welcome to DOTA2
<br><br>
Nick Name : ${dota2.nickName}
<br><br>
Your Fav Position : ${dota2.role}
<br><br>
Coupon Applied : ${dota2.couponCode}
<br><br>
Current MMR : ${dota2.MMR}
<br><br>
Hero Type : ${dota2.heroType}
<br><br>
Reached Medal Options :
<ul>
<jstl:forEach var="temp" items="${dota2.reachedMedals}">
<li>${temp}</li>
</jstl:forEach>
</ul>
</body>
</html>