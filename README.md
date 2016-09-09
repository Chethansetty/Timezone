# Timezone
##Commands :
  Pull the image from the docker hub `docker pull chethan95/time`
  Download the helloworld.yml  `git clone https://github.com/Chethansetty/ymls.git`
  To Execute `sudo docker run -v  [downloaded helloworld.yml path]:/opt/myapp/yml  -p 8080:8080 -p 8081:8081  chethan95/time`

##view-output :
  `http://localhost:8080/hello-world`(by Default it is UTC timezone)
  For different timezones :queryparameter `name=<yourinput>` .For example :`http://localhost:8080/hello-world?name=EST` .
  Refer `http://joda-time.sourceforge.net/timezones.html` to find all valid timezones.



     
     
     
  
  
