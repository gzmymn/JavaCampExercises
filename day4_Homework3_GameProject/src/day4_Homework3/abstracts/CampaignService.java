package day4_Homework3.abstracts;

import day4_Homework3.entities.Campaign;
import day4_Homework3.entities.Game;

public interface CampaignService {

	void add(Campaign campaign, Game game);
	void delete(Campaign campaign, Game game);
	void update(Campaign campaign, Game game);
}
