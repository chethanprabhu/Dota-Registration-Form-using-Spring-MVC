package spring;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import validation.Coupon;

public class Dota2 {
	@NotNull(message = "required")
	@Size(min = 1,message = "required")
	public String userID;
	public String role;
	public String heroType;
	public String reachedMedals;
	
	@Coupon(value="DOTA", message = "must start with DOTA")
	private String couponCode;
	
	@Pattern(regexp = "[a-zA-Z]+",message = "must contain alphabets only")
	public String nickName;
	
	@Min(value = 1000, message="must be greater than 1000")
	@Max(value= 9999, message="must be less than 9999")
	public int MMR;
	
	public LinkedHashMap<String, String> roleMap;
	public LinkedHashMap<String, String> heroTypeOptions;
	public LinkedHashMap<String, String> reachedMedalsOptions;
	
	public Dota2 () {
//		Adding these options through JSP page
//		Position Type<lola:select path="role">
//			 <lola:option value="Hard Support"></lola:option>
//			 <lola:option value="Soft Support"></lola:option>
//			 <lola:option value="Mid Lane"></lola:option>
//			 <lola:option value="Offlane"></lola:option>
//			 <lola:option value="Safe Lane"></lola:option>
//		 </lola:select>
		roleMap = new LinkedHashMap<>();
		roleMap.put("Hard Support", "Hard Support");
		roleMap.put("Soft Support", "Soft Support");
		roleMap.put("Mid Lane", "Mid Lane");
		roleMap.put("Off Lane", "Off Lane");
		roleMap.put("Safe Lane", "Safe Lane");
		
		heroTypeOptions = new LinkedHashMap<String, String>();
		heroTypeOptions.put("Strength", "Strength");
		heroTypeOptions.put("Agility", "Agility");
		heroTypeOptions.put("Intelligence", "Intelligence");
		
		reachedMedalsOptions = new LinkedHashMap<String, String>();
		reachedMedalsOptions.put("Herald", "Herald");
		reachedMedalsOptions.put("Guardian", "Guardian");
		reachedMedalsOptions.put("Crusader", "Crusader");
		reachedMedalsOptions.put("Archon", "Archon");
		reachedMedalsOptions.put("Legend", "Legend");
		reachedMedalsOptions.put("Ancient", "Ancient");
		reachedMedalsOptions.put("Immortal", "Immortal");
	}
	

	public String getCouponCode() {
		return couponCode;
	}


	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public int getMMR() {
		return MMR;
	}

	public void setMMR(int mMR) {
		MMR = mMR;
	}

	
	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getReachedMedals() {
		return reachedMedals;
	}

	public void setReachedMedals(String reachedMedals) {
		this.reachedMedals = reachedMedals;
	}


	public LinkedHashMap<String, String> getReachedMedalsOptions() {
		return reachedMedalsOptions;
	}


	public void setReachedMedalsOptions(LinkedHashMap<String, String> reachedMedalsOptions) {
		this.reachedMedalsOptions = reachedMedalsOptions;
	}


	public String getHeroType() {
		return heroType;
	}


	public void setHeroType(String heroType) {
		this.heroType = heroType;
	}


	public LinkedHashMap<String, String> getHeroTypeOptions() {
		return heroTypeOptions;
	}


	public void setHeroTypeOptions(LinkedHashMap<String, String> heroTypeOptions) {
		this.heroTypeOptions = heroTypeOptions;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}

	public LinkedHashMap<String, String> getRoleMap() {
		return roleMap;
	}

	public void setRoleMap(LinkedHashMap<String, String> roleMap) {
		this.roleMap = roleMap;
	}


	public String getUserID() {
		return userID;
	}


	public void setUserID(String userID) {
		this.userID = userID;
	}

	
	
}
