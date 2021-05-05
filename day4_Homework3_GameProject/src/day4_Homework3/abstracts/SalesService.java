package day4_Homework3.abstracts;

import day4_Homework3.entities.Campaign;
import day4_Homework3.entities.Game;
import day4_Homework3.entities.Gamer;

public interface SalesService {

	void StandartSales(Game game, Gamer gamer);
    void CampaignSales(Game game, Gamer gamer, Campaign campaign);
}
