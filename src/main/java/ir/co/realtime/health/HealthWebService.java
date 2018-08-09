package ir.co.realtime.health;

import javax.xml.ws.Endpoint;

// https://www.javaworld.com/article/3215966/java-language/web-services-in-java-se-part-2-creating-soap-web-services.html

public class HealthWebService {

    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9901/insert", new HealthInsertImpl());
    }
}
