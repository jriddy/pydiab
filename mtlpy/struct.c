#include <stdio.h>

typedef struct endpoint {
    char host[128];
    unsigned int port;
} endpoint;


endpoint host_and_port() {
    endpoint ep = { "localhost", 7777 };
    return ep;
}


int main() {
    endpoint ep = host_and_port();
    printf("host: %s, port: %d\n", ep.host, ep.port);
}
