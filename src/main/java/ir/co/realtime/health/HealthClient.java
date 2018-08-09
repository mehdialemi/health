package ir.co.realtime.health;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class HealthClient {

    public static void main(String[] args) throws MalformedURLException {
            URL url = new URL("http://localhost:9901/insert?wsdl");
        QName qname = new QName("http://health.realtime.co.ir/",
                "HealthInsert");
        Service service = Service.create(url, qname);
        qname = new QName("http://health.realtime.co.ir/", "put");
        HealthInsert ws = service.getPort(qname, HealthInsert.class);
        System.out.println(ws.put("test"));
    }
}
