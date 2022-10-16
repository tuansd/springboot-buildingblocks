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