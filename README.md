# Timezone
Commands :
  1)Pull the image from the docker hub-> docker pull chethan95/time
  2)Download the helloworld.yml -> git clone https://github.com/Chethansetty/ymls.git
  3)To Execute -> sudo docker run -v  [helloworld.yml path]:/opt/myapp/yml  -p 8080:8080 -p 8081:8081  chethan95/time

To view the output:
    ->localhost:8080/hello-world(by Default it is UTC timezone)
    ->For different timezone :queryparameter name=<yourinput> .For example : localhost:8080/hello-world?name=EST .
    ->Refer http://joda-time.sourceforge.net/timezones.html to pass parameters to get different timezone results.


To refer the source code :
     -> url :https://github.com/Chethansetty/Timezone
     
     
     
  
  
