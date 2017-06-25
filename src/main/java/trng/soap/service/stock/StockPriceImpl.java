package trng.soap.service.stock;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;



@WebService(endpointInterface = "trng.soap.service.stock.StockPrice")
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL)
public class StockPriceImpl implements StockPrice {

	@WebMethod(action = "http://trng.soap.service/StockPrice/getStockPrice")
	@WebResult(name = "GetStockPriceResponse", targetNamespace = "http://trng.soap.service/StockPriceResponse", partName = "parameters")
	public GetStockPriceResponse getStockPrice(@WebParam(name = "GetStockPriceRequest", targetNamespace = "http://www.example.org/StockPriceRequest", partName = "parameters") GetStockPriceRequest parameters) {
		GetStockPriceResponse getStockPriceResponse = new GetStockPriceResponse();
		StockPrice_Type value = new StockPrice_Type();
		value.setPrice(56.45);
		value.setStockName("IMCS");
		getStockPriceResponse.setStockPrice(value);
		return getStockPriceResponse;
	}

}
