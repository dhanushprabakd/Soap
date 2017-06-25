
package trng.soap.service.stock;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebService//(name = "StockPrice", targetNamespace = "http://trng.soap.service/StockPrice/")
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL)
public interface StockPrice {


    /**
     * 
     * @param parameters
     * @return
     *     returns trng.soap.service.stock.GetStockPriceResponse
     */
    @WebMethod(action = "http://trng.soap.service/StockPrice/getStockPrice")
    @WebResult(name = "GetStockPriceResponse", targetNamespace = "http://trng.soap.service/StockPriceResponse", partName = "parameters")
    public GetStockPriceResponse getStockPrice(
        @WebParam(name = "GetStockPriceRequest", targetNamespace = "http://www.example.org/StockPriceRequest", partName = "parameters")
        GetStockPriceRequest parameters);

}