## Fizz Buzz Example in Java 8 using JUnit 5

### Fizz Buzz is a game where
- if the number is divisible by 3, you say Fizz
- if the number is divisible by 5, you say Buzz
- if neither, you say the number




sudo useradd --home-dir /jenkins/jenkins_home --create-home --shell /bin/bash jenkins_user
sudo passwd jenkins_user
pass root12345

chown 1000 ./jenkins_home ????
jenkins_user user - uid 1000
docker  run  -u jenkins_user --hostname=jenkins --name=myjenkins  --rm   -p 8080:8080  --expose 8080  -p 50000:50000  --expose 50000  -v /jenkins/jenkins_home:/var/jenkins_home jenkins

sudo docker  run  -d -u root --hostname=jenkins --name=myjenkins     -p 8080:8080  --expose 8080  -p 50000:50000  --expose 50000  -v jenkins:/var/jenkins_home   --restart=always jenkins


sudo docker  run  -u root --hostname=jenkins --name=myjenkins  --rm   -p 8080:8080  --expose 8080  -p 50000:50000  --expose 50000  -v /jenkins:/var/jenkins_home  
cloudbees/jenkins-enterprise

