def call(String imageName, String credentialsId) {
    withCredentials([
        usernamePassword(
            credentialsId: credentialsId,
            usernameVariable: 'DockerHubUser',
            passwordVariable: 'DockerHubPass'
        )
    ]) {
        sh """
            docker login -u \$DockerHubUser -p \$DockerHubPass
            docker tag $imageName \$DockerHubUser/$imageName:latest
            docker push \$DockerHubUser/$imageName:latest
        """
    }
}
