def download(repo)
{
  git "https://github.com/IntelliqDevops/${repo}"
}
def build()
{
  sh 'mvn package'
}
def deploy(jobname,ip,context)
{
  sh 'scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:8080:/var/lib/tomcat10/webapps/${context}.war'
}
def testing(jobname)
{
  sh 'java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar'
}
