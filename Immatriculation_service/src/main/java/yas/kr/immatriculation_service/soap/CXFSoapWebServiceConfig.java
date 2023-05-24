package yas.kr.immatriculation_service.soap;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Configuration class for CXF SOAP Web Service
@Configuration
public class CXFSoapWebServiceConfig {

    @Autowired
    private Bus bus; // Autowired Bus object for CXF

    @Autowired
    private ImmatriculationSoapService immatriculationSoapService; // Autowired OwnerSoapService object

    @Bean
    public EndpointImpl endpoint() {
        // Create a new EndpointImpl object with the provided Bus and OwnerSoapService
        EndpointImpl endpoint = new EndpointImpl(bus, immatriculationSoapService);

        endpoint.publish("/owService"); // Publish the SOAP Web Service on the specified URL

        return endpoint; // Return the configured EndpointImpl object
    }

}
