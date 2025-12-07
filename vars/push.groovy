def call(String id, String image) {
  withCredentials([usernamePassword(
                credentialsId: "vic",
                usernameVariable: "user",
                passwordVariable: "pass"
                )]){
                    sh "docker login -u ${env.user} -p ${env.pass}"
                    sh "docker image tag py-app:ll ${env.user}/py-app:ll"
                    sh "docker push ${env.user}/py-app:ll"
                }
}
