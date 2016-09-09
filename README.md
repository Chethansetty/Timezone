# Timezone
##Commands :
  1)Pull the image from the docker hub-> __docker pull chethan95/time__
  2)Download the helloworld.yml -> __git clone https://github.com/Chethansetty/ymls.git__
  3)To Execute ->__sudo docker run -v  [downloaded helloworld.yml path]:/opt/myapp/yml  -p 8080:8080 -p 8081:8081  chethan95/time__

##To view the output:
    1)http://localhost:8080/hello-world(by Default it is UTC timezone)
    2)For different timezones :queryparameter name=<yourinput> .For example :http://localhost:8080/hello-world?name=EST .
    3)Refer http://joda-time.sourceforge.net/timezones.html to find all valid timezones.



     
     
     
  
  
