def call(def server, def port) {
    retry (3) {
        sleep 5
        httpRequest url:"http://${server}:${port}/health", validResponseCodes: '200', validResponseContent: '"status":"UP"'
    }
}