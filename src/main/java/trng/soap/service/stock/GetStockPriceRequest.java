
package trng.soap.service.stock;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetStockPriceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetStockPriceRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stockId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStockPriceRequest", propOrder = {
    "stockId"
})
public class GetStockPriceRequest {

    @XmlElement(required = true)
    protected String stockId;

    /**
     * Gets the value of the stockId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockId() {
        return stockId;
    }

    /**
     * Sets the value of the stockId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockId(String value) {
        this.stockId = value;
    }

}
