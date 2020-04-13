<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <c:if test="${empty place.city}">
        <title>Add</title>
    </c:if>
    <c:if test="${!empty place.city}">
    <title>Edit</title>
    </c:if>
</head>
<body>
<c:if test="${empty place.city}">
    <c:url value="/add" var="var"/>
</c:if>
<c:if test="${!empty place.city}">
    <c:url value="/edit" var="var"/>
</c:if>
<form action="${var}" method="POST">
    <c:if test="${!empty place.city}">
        <input type="hidden" name="id" value="${place.id}">
    </c:if>
    <label for="city">City</label>
    <input type="text" name="city" id="city">
    <label for="street">Street</label>
    <input type="text" name="street" id="street">
    <label for="building">Building</label>
    <input type="text" name="building" id="building">
    <label for="latitude">Latitude</label>
    <input type="text" name="latitude" id="latitude">
    <label for="longitude">Longitude</label>
    <input type="text" name="longitude" id="longitude">
    <c:if test="${empty place.city}">
        <input type="submit" value="Add new place">
    </c:if>
    <c:if test="${!empty place.city}">
        <input type="submit" value="Edit place">
    </c:if>
</form>
</body>
</html>
