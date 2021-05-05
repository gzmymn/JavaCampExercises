package day4_Homework3.entities;

import day4_Homework3.abstracts.Entity;

public class Campaign implements Entity {

	private int campaignId;
	private String campaignName;
	private int discountRate;
	
	public Campaign(int campaignId, String campaignName, int discountRate) {
		
		this.setCampaignId(campaignId);
		this.setCampaignName(campaignName);
		this.setDiscountRate(discountRate);
	}

	public Campaign () {
		
	}
	
	public int getCampaignId() {
		return campaignId;
	}
	
	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}
	
	public String getCampaignName() {
		return campaignName;
	}
	
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	
	public int getDiscountRate() {
		return discountRate;
	}
	
	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	
}
