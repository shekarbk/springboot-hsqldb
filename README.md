Simple CRUD operation for PetStore using HSQL Embedded DB

REST API's:
GET:
http://localhost:8080/pets 
</br>
POST:
http://localhost:8080/pets
{
        "id": 1,
        "name": "Lucy",
        "age": 3,
        "color": "brown"
    }
</br>
GET:        
http://localhost:8080/pets/2
</br>
DELETE:
http://localhost:8080/pets/3
</br>
PUT:
http://localhost:8080/pets/1
{
        "id": 1,
        "name": "Lilly",
        "age": 3,
        "color": "white"
    }
