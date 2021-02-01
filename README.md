https://rubygarage.org/blog/most-basic-git-commands-with-examples

                 Git Cheat Sheet
Git: configurations
```
$ git config --global user.name "FirstName LastName"
$ git config --global user.email "your-email@email-provider.com"
$ git config --global color.ui true
$ git config --list
``` 
Git: starting a repository
```
$ git init
$ git status
```
*Git: staging files*
```
$ git add (file-name)
$ git add (file-name) < another-file-name) < yet-another-file-name)
$ git add .
$ git add --all
$ git add -A
$ git rm --cached (file-name)
$ git reset (file-name)
```
Git: committing to a repository
```
$ git commit —m "Add three files"
$ git reset -—soft HEADA
$ git commit —-amend -m center your message)
```
Git: pulling and pushing from and to repositories
```
$ git remote add origin <link>
$ git push -u origin master
$ git clone
$ git pull
```
Git: branching
```
$ git branch
$ git branch <
$ git checkout <
$ git merge < branch-name>
$ git checkout —b
```