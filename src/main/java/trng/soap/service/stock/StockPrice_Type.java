
package trng.soap.service.stock;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StockPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StockPrice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stockName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockPrice", namespace = "http://trng.soap.service/StockPrice", propOrder = {
    "stockName",
    "price"
})
public class StockPrice_Type {

    @XmlElement(required = true)
    protected String stockName;
    protected double price;

    /**
     * Gets the value of the stockName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockName() {
        return stockName;
    }

    /**
     * Sets the value of the stockName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockName(String value) {
        this.stockName = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

}
