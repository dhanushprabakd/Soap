
package trng.soap.service.stock;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the trng.soap.service.stock package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetStockPriceRequest_QNAME = new QName("http://www.example.org/StockPriceRequest", "GetStockPriceRequest");
    private final static QName _StockPrice_QNAME = new QName("http://trng.soap.service/StockPrice", "StockPrice");
    private final static QName _GetStockPriceResponse_QNAME = new QName("http://trng.soap.service/StockPriceResponse", "GetStockPriceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: trng.soap.service.stock
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StockPrice_Type }
     * 
     */
    public StockPrice_Type createStockPrice_Type() {
        return new StockPrice_Type();
    }

    /**
     * Create an instance of {@link GetStockPriceRequest }
     * 
     */
    public GetStockPriceRequest createGetStockPriceRequest() {
        return new GetStockPriceRequest();
    }

    /**
     * Create an instance of {@link GetStockPriceResponse }
     * 
     */
    public GetStockPriceResponse createGetStockPriceResponse() {
        return new GetStockPriceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStockPriceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/StockPriceRequest", name = "GetStockPriceRequest")
    public JAXBElement<GetStockPriceRequest> createGetStockPriceRequest(GetStockPriceRequest value) {
        return new JAXBElement<GetStockPriceRequest>(_GetStockPriceRequest_QNAME, GetStockPriceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockPrice_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://trng.soap.service/StockPrice", name = "StockPrice")
    public JAXBElement<StockPrice_Type> createStockPrice(StockPrice_Type value) {
        return new JAXBElement<StockPrice_Type>(_StockPrice_QNAME, StockPrice_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStockPriceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://trng.soap.service/StockPriceResponse", name = "GetStockPriceResponse")
    public JAXBElement<GetStockPriceResponse> createGetStockPriceResponse(GetStockPriceResponse value) {
        return new JAXBElement<GetStockPriceResponse>(_GetStockPriceResponse_QNAME, GetStockPriceResponse.class, null, value);
    }

}
