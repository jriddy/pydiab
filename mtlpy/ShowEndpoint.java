final class Endpoint {
    private String host;
    private int port;

    public Endpoint(String host, int port) { setHost(host); setPort(port); }
    public String getHost() { return host; }
    public void setHost(String host) { this.host = host; }
    public int getPort() { return port; }
    public void setPort(int port) { this.port = port; }
}

public class ShowEndpoint {
    private static Endpoint hostAndPort() {
        return new Endpoint("localhost", 2345);
    }

    public static void main(String[] args) {
        Endpoint ep = hostAndPort();
        System.out.format("host: %s, port: %d", ep.getHost(), ep.getPort());
    }
}
