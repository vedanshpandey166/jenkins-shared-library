def call(String repoUrl, String branch = "main") {
    echo "Cloning repository..."
    git url: repoUrl, branch: branch
}

