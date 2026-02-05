def call(String imageName, String dockerfilePath) {
    sh "docker build -t ${imageName} -f ${dockerfilePath} ."
}
