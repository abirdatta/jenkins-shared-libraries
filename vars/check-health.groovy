def call(def server, def port) {
    retry (3) {
        sleep 5
        httpRequest authentication: '7b15314c-558e-417d-8ba4-81787fd71b35', url:"http://${server}:${port}/health", validResponseCodes: '200', validResponseContent: '"status":"UP"'
    }
}