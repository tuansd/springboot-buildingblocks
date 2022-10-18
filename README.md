![image](https://user-images.githubusercontent.com/109632850/196317963-27cc625f-ed9c-4169-845c-d775e4d3ce8e.png)
![image](https://user-images.githubusercontent.com/109632850/196353696-a82783e2-f495-4031-a63c-64afa6faeb76.png)


# additional comments: SpringBoot - Building RESTful API Webservices using Spring Data JPA, database H2, and test on Postman
- GET getAllUsers // [http://localhost:8080/users](http://localhost:8080/users)
- POST createUser
- GET getUserById // http://localhost:8080/users/101
- PUT updateUser
- DEL deleteUserById
- GET getUserByUsername // http://localhost:8080/users/byusername/kreddy

# Database h2: http://localhost:8080/h2-console
# CLI: for git
- git merge 01-ground-zero-base
- git checkout -b "02-Hello-World"
- git add .
- git commit -am "first commit"
- git show-branch
- git push
# CLI: new branch
- git push --set-upstream origin 02-Hello-World

# CLI: git merge
- git checkout main
- git merge 02-Hello-World
- git push
