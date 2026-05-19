
# Mern
## Requst and response
Request 
DNS lookup
HTTP request
web server
database
HTTP Responce
server render
## http
get
post
put
delete
patch
### status codes 
200-success
201-
13 may 2026
# html
## ANCHOR TAG
HREF- FOR LINK 
## list 
li for list
ul for unordered list
ol for ordered list
## table
table head-th
table row-tr
table body-tbody
table cell td
table footer -tfoot
row span- for row height
column span for column length



## forms 
form tag- form, action- /name, methord- put/post/get/delete/patch, enctype,auto compelete,target,
input tag-type- fie type, id ,required, name
label tag- for-id
button- type - submit
## cementic tags
header
navigation
article
section
aside
footer
### why cementic tags 
accessibility-easy accesibilty
seo
readable
Browser features
## Media elements
### image
src- image link
alt- alternate text
height-width
### video
controls- add controls 
autoplay- autoplays the video when accessed
muted- by default the video will be muted if this attribute is there
loop- the video will run on loop
width- height-  it manages the size of the video
source src-video link
       typevideo type-video.mp4
### audio
src-audio link
controls- add controls 
autoplay- autoplays the audio when accessed
muted- by default the audio will be muted if this attribute is there
### iframe
to embedd an website on our page
## meta and head element 
charset UTF 8- it is used to show emojis, symbols and hindi texts
viewport meta- it is used to adjust the website according to the device used
descriptions-{google search descriptons}- how will your wesite ill be shown in google search
open graph- it is used to speify how your link will be shown in whatsapp linkdin etc
## div and span
div is used for full width
spam is wide according to content 
 ## buttons scripts and entities
- button- reset, submit 
# Git
- it is a version control system that keeps a record of all the changes that are made on the file by the proggramersi
- In git eviroment the things are stored in .git file the viersion are stored in filess the gti file is not visible to the user
- .git keeps the trckrecord of what changes are made, manages and stores the changes
- there are three stages in github- 
       1. {Branches}- at last in git we store tings in branch 
       2. Git- Staging 
       3. garbage-  
- writing code
- initiallising git( creating a git enviroment in a folder(in enviroment then a folder is generated known as git) )
- adding our files on git 
## cloning and pulling
lets consider when we have published a website and we deleted the code now the code is available on the git not with the local admin now if we want to add smeting in the code we'll follow following steps 
- first we will vreate a new gt initiallised folder in our local system 
- we'll clone the whole git folder on our folder 
- then we'll pull the brnch into the kitchen to the edit 
## conflict resolution
- when there is problem in merging multiple branches due to defrences in things
# Practical
1. git init- initialises git enviroment 
2. git status - for current git status
3. LIK
for cloning a remote respository:
1. git clone repo link
## collabration
1. add collabrators
2. clone things into local system of collabrators
## conflicts resolution
1. either we accept current changes
2. either we accept incomming changes
3. 
###### PS C:\Users\shahm\OneDrive\Documents\New folder\mt1> git remote add origin git@github.com:Moxshahhh/respository.git
>> git branch -M main
>> git push -u origin main
error: remote origin already exists.
Enumerating objects: 8, done.
Counting objects: 100% (8/8), done.
Delta compression using up to 8 threads
Compressing objects: 100% (8/8), done.
Writing objects: 100% (8/8), 1.27 MiB | 960.00 KiB/s, done.
Total 8 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (1/1), done.
To https://github.com/Moxshahhh/respository.git
 * [new branch]      main -> main
branch 'main' set up to track 'origin/main'.
PS C:\Users\shahm\OneDrive\Documents\New folder\mt1> cd MT1/
cd : Cannot find path 'C:\Users\shahm\OneDrive\Documents\New folder\mt1\MT1\' because it does not exist.
At line:1 char:1
+ cd MT1/
+ ~~~~~~~
    + CategoryInfo          : ObjectNotFound: (C:\Users\shahm\...folder\mt1\MT1\:String) [Set-Location], ItemNotFo 
   undException
    + FullyQualifiedErrorId : PathNotFound,Microsoft.PowerShell.Commands.SetLocationCommand
 
PS C:\Users\shahm\OneDrive\Documents\New folder\mt1> cd MT1 /
Set-Location : A positional parameter cannot be found that accepts argument '/'.
At line:1 char:1
+ cd MT1 /
+ ~~~~~~~~
    + CategoryInfo          : InvalidArgument: (:) [Set-Location], ParameterBindingException
    + FullyQualifiedErrorId : PositionalParameterNotFound,Microsoft.PowerShell.Commands.SetLocationCommand
 
PS C:\Users\shahm\OneDrive\Documents\New folder\mt1> ls


    Directory: C:\Users\shahm\OneDrive\Documents\New folder\mt1


Mode                 LastWriteTime         Length Name                                                             
----                 -------------         ------ ----                                                             
-a---l        13-05-2026     13:00            261 antshant.html                                                    
-a---l        14-05-2026     12:52        1347222 Chhota-Bheem-Title.mp3                                           
-a---l        14-05-2026     13:25           1530 index.html                                                       
-a---l        16-05-2026     09:27           1621 java.md                                                          
-a---l        14-05-2026     09:09            413 Main.java                                                        
-a---l        18-05-2026     13:18           3245 mern.md                                                          


PS C:\Users\shahm\OneDrive\Documents\New folder\mt1> git checkout antshant
error: pathspec 'antshant' did not match any file(s) known to git
PS C:\Users\shahm\OneDrive\Documents\New folder\mt1> 