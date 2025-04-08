def download(repo)
{
  git "https://github.com/IntelliqDevops/${repo}"
}
def build()
{
  sh 'mvn package'
}
def deploy()
{
  sh 'scp /var/lib/jenkins/workspace/sharedlib'
}
