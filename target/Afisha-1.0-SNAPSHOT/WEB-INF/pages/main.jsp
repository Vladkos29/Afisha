<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>PLACES</title>
    <link href="<c:url value="/res/style.css"/>" rel="stylesheet" type="text/css"/>
    <script src="<c:url value="https://api-maps.yandex.ru/2.1/?apikey=c9b0aaba-a5b4-489a-b2f3-c7e346004a1f&lang=ru_RU"/>" type="text/javascript"></script>
    <script src="<c:url value="/res/map.js"/>" type="text/javascript"></script>
</head>
<body>
<div id="map"></div>
<h2>Places</h2>
<table>
    <tr>
        <th>id</th>
        <th>city</th>
        <th>street</th>
        <th>building</th>
        <th>latitude</th>
        <th>longitude</th>
    </tr>
    <c:forEach var="place" items="${placesList}">
        <tr>
            <td>${place.id}</td>
            <td>${place.city}</td>
            <td>${place.street}</td>
            <td>${place.building}</td>
            <td>${place.latitude}</td>
            <td>${place.longitude}</td>
            <td>
                <a href="/edit/${place.id}">edit</a>
                <a href="/delete/${place.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
<h2>Add</h2>
<c:url value="/add" var="add"/>
<a href="${add}">Add new place</a>
<h2>Genres</h2>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
    </tr>
    <c:forEach var="genre" items="${genresList}">
        <tr>
            <td>${genre.id}</td>
            <td>${genre.name_genre}</td>
            <td>
                <a href="/edit/${genre.id}">edit</a>
                <a href="/delete/${genre.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
<h2>Places</h2>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>genre</th>
        <th>datetime_start</th>
        <th>datetime_end</th>
        <th>location</th>
        <th>metadata</th>
        <th>adults_only</th>
        <th>active</th>
        <th>rating</th>
    </tr>
    <c:forEach var="event" items="${eventsList}">
        <tr>
            <th>${event.id}</th>
            <td>${event.name_event}</td>
            <td>${event.genre_event}</td>
            <td>${event.datetime_start_event}</td>
            <td>${event.datetime_end_event}</td>
            <td>${event.location}</td>
            <td>${event.metadata_event}</td>
            <td>${event.adults_only}</td>
            <td>${event.active}</td>
            <td>${event.rating}</td>
            <td>
                <a href="/edit/${event.id}">edit</a>
                <a href="/delete/${event.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>