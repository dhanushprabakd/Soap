
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
 *         &lt;element name="LoanEligibilityRequest" type="{http://www.example.org/LoanEligibilityService/}LoanEligibilityRequestType"/>
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
    "loanEligibilityRequest"
})
@XmlRootElement(name = "getLoanEligibility")
public class GetLoanEligibility {

    @XmlElement(name = "LoanEligibilityRequest", required = true)
    protected LoanEligibilityRequestType loanEligibilityRequest;

    /**
     * Gets the value of the loanEligibilityRequest property.
     * 
     * @return
     *     possible object is
     *     {@link LoanEligibilityRequestType }
     *     
     */
    public LoanEligibilityRequestType getLoanEligibilityRequest() {
        return loanEligibilityRequest;
    }

    /**
     * Sets the value of the loanEligibilityRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanEligibilityRequestType }
     *     
     */
    public void setLoanEligibilityRequest(LoanEligibilityRequestType value) {
        this.loanEligibilityRequest = value;
    }

}
