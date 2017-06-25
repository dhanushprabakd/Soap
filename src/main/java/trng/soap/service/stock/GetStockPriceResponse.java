
package trng.soap.service.stock;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetStockPriceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetStockPriceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stockPrice" type="{http://trng.soap.service/StockPrice}StockPrice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStockPriceResponse", namespace = "http://trng.soap.service/StockPriceResponse", propOrder = {
    "stockPrice"
})
public class GetStockPriceResponse {

    protected StockPrice_Type stockPrice;

    /**
     * Gets the value of the stockPrice property.
     * 
     * @return
     *     possible object is
     *     {@link StockPrice_Type }
     *     
     */
    public StockPrice_Type getStockPrice() {
        return stockPrice;
    }

    /**
     * Sets the value of the stockPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockPrice_Type }
     *     
     */
    public void setStockPrice(StockPrice_Type value) {
        this.stockPrice = value;
    }

}
