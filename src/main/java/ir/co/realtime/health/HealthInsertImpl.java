package ir.co.realtime.health;


import javax.jws.WebService;

@WebService(serviceName = "HealthInsert",
        endpointInterface = "ir.co.realtime.health.HealthInsert",
        targetNamespace = "http://health.realtime.co.ir/",
//        wsdlLocation = "WSImpl.wsdl",
        wsdlLocation = "HealthInsert.wsdl",
        portName = "put")
public class HealthInsertImpl implements HealthInsert {

    public String put(String xml) {
        System.out.println(xml);
        return "ok";
    }
}
