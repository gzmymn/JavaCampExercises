package day4_Homework3.concrete;

import day4_Homework3.abstracts.SalesService;
import day4_Homework3.entities.Campaign;
import day4_Homework3.entities.Game;
import day4_Homework3.entities.Gamer;

public class SalesManager implements SalesService {

	@Override
	public void StandartSales(Game game, Gamer gamer) {
		
		System.out.println(game.getGameName() + " " + "oyunu" + " " + gamer.getFirstName() + " " + gamer.getLastName() + "taraf�ndan" + " " + game.getGamePrice() + "Tl'ye sat�n al�nm��t�r." + '\n');
	}

	@Override
	public void CampaignSales(Game game, Gamer gamer, Campaign campaign) {
		
		double campaignPrice = (double) (game.getGamePrice() - ((game.getGamePrice() * campaign.getDiscountRate()) / 100)); //Kampanyal� fiyat hesaplama

        System.out.println(game.getGameName() + " oyunu "  + campaign.getCampaignName() + " kampanyas� ile %" + campaign.getDiscountRate() + " indirimle " +
            gamer.getFirstName() + " " + gamer.getLastName() + " taraf�ndan " + " - "+  campaignPrice + " TL'ye sat�n al�nm��t�r." + '\n'); 
		
	}

}
