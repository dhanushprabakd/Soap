package trng.loan.eligibility.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(endpointInterface = "trng.loan.eligibility.service.LoanEligibilityService")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public class LoanEligibilityServiceImpl implements LoanEligibilityService {

	@WebMethod(action = "http://www.example.org/LoanEligibilityService/getLoanEligibility")
	@WebResult(name = "LoanEligibilityResponse", targetNamespace = "")
	@RequestWrapper(localName = "getLoanEligibility", targetNamespace = "http://www.example.org/LoanEligibilityService/", className = "trng.loan.eligibility.service.GetLoanEligibility")
	@ResponseWrapper(localName = "getLoanEligibilityResponse", targetNamespace = "http://www.example.org/LoanEligibilityService/", className = "trng.loan.eligibility.service.GetLoanEligibilityResponse")
	public LoanEligibilityResponseType getLoanEligibility( @WebParam(name = "LoanEligibilityRequest", targetNamespace = "") LoanEligibilityRequestType loanEligibilityRequest){
		LoanEligibilityResponseType value = new LoanEligibilityResponseType();

	/*	int year = loanEligibilityRequest.getDob().getYear();
		int month = loanEligibilityRequest.getDob().getMonth();
		int day = loanEligibilityRequest.getDob().getDay();
		LocalDate birthdate = LocalDate.of(year,month,day);
		LocalDate now = LocalDate.now();
		Period p = Period.between(birthdate, now);
		int age = p.getYears();*/
		int age = 30;
		if(age < 20){
			value.setEligibilityCode("100");
			value.setEligibilityMessage("Not Eligible");
			return value;
		}else if ((age > 20 && age < 25) && loanEligibilityRequest.getAnnualSalary() > 60000 && loanEligibilityRequest.getAmount() < 20000){
			value.setEligibilityCode("200");
			value.setEligibilityMessage("Eligible");
			return value;
		}else if ((age > 25 && age < 30) && loanEligibilityRequest.getAnnualSalary() > 80000 && loanEligibilityRequest.getAmount() < 20000){
			value.setEligibilityCode("200");
			value.setEligibilityMessage("Eligible");
			return value;
		}else if ((age > 30 && age < 50) && loanEligibilityRequest.getAnnualSalary() > 100000 && loanEligibilityRequest.getAmount() < 50000){
			value.setEligibilityCode("200");
			value.setEligibilityMessage("Eligible");
			return value;
		}else{
			value.setEligibilityCode("100");
			value.setEligibilityMessage("Not Eligible");
			return value;
		}
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
}

}
