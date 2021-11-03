#Rest-сервис для хранения данных о книжной полке
В БД представлены две структуры данных: Авторы(authors) и Книги(books).

В сервисе реализованны команды: 
1) Получить все книги \
   Выполняется GET-запрос на URL-адрес \
   http://localhost:8080/books 
2) Получить книги определенного автора \
   Выполняется GET-запрос на URL-адрес \
   http://localhost:8080/books/{authorid} (прим. authorid - ID автора ) 
3) Добавить книгу 
   Выполняется POST-запрос на URL-адрес \
   http://localhost:8080/books 
   Пример запроса: \
   "bname": "Rock1", \
   "auid": 201, \
   "bcheck": true
4) Удалить книгу\
   Выполняется DELETE-запрос на URL-адрес
   http://localhost:8080/books/{booknumber} (прим. booknumber - номер книги на полке )
5) Редактировать данные о книге \
   Выполняется PUT-запрос на URL-адрес
   http://localhost:8080/books/{booknumber} (прим. booknumber - номер книги на полке ) 
   Пример запроса: \
   "bname": "Мастер и Маргарита", \
   "auid": 2012, \
   "bcheck": false 
6) Добавить автора \
   Выполняется POST-запрос на URL-адрес \
   http://localhost:8080/authors
   Пример запроса:  
   "firstname": "Михаил",  
   "patronymic": "Афанасьевич",\
   "secondname": "Булгаков", \
   "date": "03.05.1891", \
   "biography": "From Russia"
7) Удалить автора \ 
   Выполняется DELETE-запрос на URL-адрес \
   http://localhost:8080/authorid/{booknumber} (прим. authorid - ID автора )
   