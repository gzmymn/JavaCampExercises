package day4_Homework3;

import java.time.LocalDate;

import day4_Homework3.adapters.MernisServiceAdapter;
import day4_Homework3.concrete.CampaignManager;
import day4_Homework3.concrete.GameManager;
import day4_Homework3.concrete.GamerManager;
import day4_Homework3.concrete.SalesManager;
import day4_Homework3.entities.Campaign;
import day4_Homework3.entities.Game;
import day4_Homework3.entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		//OYUN OLUÞTURMA
		Game game1 = new Game(1, "Sky Soldier", "War", 300);
		
		GameManager gameManager = new GameManager();
		//OYUN EKLEME
		gameManager.add(game1);
		//OYUN SÝLME
		gameManager.delete(game1);
		//OYUN GÜNCELLEME
		gameManager.update(game1);
		
		
		
		//OYUNCU OLUÞTURMA
		Gamer gamer1 = new Gamer(1, "Gizem", "Yaman", "1234567", LocalDate.of(1995, 5, 5), "gzm");
		
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		
		//OYUNCU EKLEME
		gamerManager.add(gamer1);
		//OYUNCU SÝLME
		gameManager.delete(game1);
		//OYUNCU GÜNCELLEME
		gameManager.update(game1);
		
		//KAMPANYA OLUÞTURMA
		Campaign campaign1 = new Campaign(1, "May opportunity", 50);
		
		CampaignManager campaignManager = new CampaignManager();
		
		//KAMPANYA EKLEME
		campaignManager.add(campaign1, game1);
		//KAMPANYA SÝLME
		campaignManager.delete(campaign1, game1);
		//KAMPANYA GÜNCELLEME
		campaignManager.update(campaign1, game1);

		
		//SATIÞ ÝÞLEMLERÝ
        SalesManager salesManager = new SalesManager();
        //STANDART SATIÞ
        salesManager.StandartSales(game1, gamer1);
        //KAMPANYALI SATIÞ
        salesManager.CampaignSales(game1, gamer1, campaign1);
	}

}
