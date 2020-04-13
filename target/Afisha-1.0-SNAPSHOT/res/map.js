ymaps.ready(init);

function init() {
    var myMap = new ymaps.Map("map", {
            center: [59.22, 39.89],
            zoom: 13
        }, {
            searchControlProvider: 'yandex#search'
        }),

        // Создаем геообъект с типом геометрии "Точка".
        myGeoObject = new ymaps.GeoObject({
            // Описание геометрии.
            geometry: {
                type: "Point",
                coordinates: [59.220257, 39.898799]
            },
            // Свойства.
            properties: {
                // Контент метки.
                iconContent: 'Метка',
                hintContent: 'Типа подпись'
            }
        })

    myMap.geoObjects
        .add(myGeoObject)
}