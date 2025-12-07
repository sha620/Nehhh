def call (){
  sh "docker build -f ./Dockerfile-multi -t py-app:ll ."

}
