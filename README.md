# EvoRestFullWeather
Demo Microservice Weather

Упрощенная демонстрация работы микросервиса Weather для проекта weather

Получаем текущие значения погоды по координатам и сохраняем значения в БД.
Запрашиваем погоду по названию города и получаем запись из БД.

GET http://localhost:80/weather/55.75/37.61

responce:
{"id":1,"coord":{"lat":55.75,"lon":37.61},"base":"stations","main":{"temp":300.17,"feels_like":300.59,"temp_min":298.57,"temp_max":300.97,"pressure":1011,"humidity":50,"sea_level":1011,"grnd_level":993},"visibility":10000,"wind":{"speed":2.61,"deg":140,"gust":2.85},"dt":1717334168,"sys":{"type":2,"id":2000314,"country":"RU","sunrise":1717289528,"sunset":1717351403},"timezone":10800,"weatherId":0,"name":"Moscow","cod":200,"createdAt":"2024-06-02T13:16:13.699420Z","weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":{"all":63}}

GET http://localhost:80/weather/Moscow

responce:
{"id":1,"coord":{"lat":55.75,"lon":37.61},"base":"stations","main":{"temp":300.17,"feels_like":300.59,"temp_min":298.57,"temp_max":300.97,"pressure":1011,"humidity":50,"sea_level":1011,"grnd_level":993},"visibility":10000,"wind":{"speed":2.61,"deg":140,"gust":2.85},"dt":1717334168,"sys":{"type":2,"id":2000314,"country":"RU","sunrise":1717289528,"sunset":1717351403},"timezone":10800,"weatherId":0,"name":"Moscow","cod":200,"createdAt":"2024-06-02T13:16:13.699420Z","weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":{"all":63}}
