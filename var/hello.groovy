def call(String message = "Hello from Shared Library") {
    echo """
    -----------------------------
    Shared Library Invocation Log
    -----------------------------
    Payload: ${message}
    Status : Executed Successfully
    -----------------------------
    """
}
