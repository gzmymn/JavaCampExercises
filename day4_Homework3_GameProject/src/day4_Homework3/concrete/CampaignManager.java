package day4_Homework3.concrete;

import day4_Homework3.abstracts.CampaignService;
import day4_Homework3.entities.Campaign;
import day4_Homework3.entities.Game;

public class CampaignManager implements CampaignService{

	

	@Override
	public void add(Campaign campaign, Game game) {
		System.out.println("%"+ campaign.getDiscountRate() + " discount added to the game: " + game.getGameName() + " with " + campaign.getCampaignName());
		 
	}

	@Override
	public void delete(Campaign campaign, Game game) {
		System.out.println("Campaign is over : " + campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign, Game game) {
		System.out.println("%"+ campaign.getDiscountRate() + " discount updated to the game: " + game.getGameName() + " with " + campaign.getCampaignName());
		
	}

}
