package validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CouponValidator implements ConstraintValidator<Coupon, String>{

	public String couponPrefix;
	@Override
	public void initialize(Coupon coupon) {
		couponPrefix = coupon.value();
	}
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext message) {
		boolean result; 
		if(value != null) {
			result = value.startsWith(couponPrefix);
		} else {
			result =  true;
		}
		
		return result;
	}

}
