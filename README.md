# REST API using Java and Spring boot, Spring Web,Spring Data JPA, H2 Database
- get
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
# Database h2: http://localhost:8080/h2-console
# Git branch:
- 01-ground-zero-base
- 02-Hello-World
- 03-JPA-UserMgmtService-base
- 04-ExceptionHandling-ResponseStatusCodes