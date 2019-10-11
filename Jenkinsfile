pipeline{
agent any 
 tools {
        maven "maven"   
    }    
stages{

stage('clean and build'){
steps{
       sh 'mvn clean package'
}

}

stage("SonarQube analysis") {
       
            steps {
              withSonarQubeEnv('sonar') {
                sh 'mvn sonar:sonar'
              }
            }
          }
 stage("nexus"){
  steps{
   nexusArtifactUploader artifacts: [[artifactId: 'DevOps_list', classifier: '', file: '/var/lib/jenkins/workspace/falcons_dynamic/target/DevOps_list-DEVOPS_1.0.war', type: 'war']], credentialsId: 'nexus-credentials', groupId: 'falcons123', nexusUrl: 'ec2-18-224-155-110.us-east-2.compute.amazonaws.com:8081/nexus', nexusVersion: 'nexus2', protocol: 'http', repository: 'devopstraining', version: 'devops_1.0'
  }
 }
 stage("deploy"){
  steps{
   deploy adapters: [tomcat8(credentialsId: '5fd75889-3d4f-4807-b450-10d731be1fd5', path: '', url: 'http://3.16.163.67:8090')], contextPath: 'falconweb', onFailure: false, war: '**/target/*.war'
  }
 }
}
}
