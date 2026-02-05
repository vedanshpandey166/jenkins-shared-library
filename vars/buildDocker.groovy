def call(String imageName, String contextPath) {
    sh "docker build -t ${imageName} ${contextPath}"
}
