def call() {
    sh """
        docker compose pull
        docker compose down || true
        docker compose up -d
    """
}
