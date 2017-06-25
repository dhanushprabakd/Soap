
package trng.loan.eligibility.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoanEligibilityResponse" type="{http://www.example.org/LoanEligibilityService/}LoanEligibilityResponseType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "loanEligibilityResponse"
})
@XmlRootElement(name = "getLoanEligibilityResponse")
public class GetLoanEligibilityResponse {

    @XmlElement(name = "LoanEligibilityResponse", required = true)
    protected LoanEligibilityResponseType loanEligibilityResponse;

    /**
     * Gets the value of the loanEligibilityResponse property.
     * 
     * @return
     *     possible object is
     *     {@link LoanEligibilityResponseType }
     *     
     */
    public LoanEligibilityResponseType getLoanEligibilityResponse() {
        return loanEligibilityResponse;
    }

    /**
     * Sets the value of the loanEligibilityResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanEligibilityResponseType }
     *     
     */
    public void setLoanEligibilityResponse(LoanEligibilityResponseType value) {
        this.loanEligibilityResponse = value;
    }

}
