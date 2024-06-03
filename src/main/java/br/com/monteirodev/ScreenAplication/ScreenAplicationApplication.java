package br.com.monteirodev.ScreenAplication;

import br.com.monteirodev.ScreenAplication.Model.EpisodeData;
import br.com.monteirodev.ScreenAplication.Model.SeriesData;
import br.com.monteirodev.ScreenAplication.Service.ConsumptionAPI;
import br.com.monteirodev.ScreenAplication.Service.DataConvert;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenAplicationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenAplicationApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		var  consumptionAPI = new ConsumptionAPI();
		var json = consumptionAPI.getData("https://www.omdbapi.com/?t=gilmore+girls&apikey=9b4ee23");
		System.out.println(json);
		DataConvert convert = new DataConvert();
		SeriesData data = convert.getData (json, SeriesData.class);
		System.out.println(data);

		consumptionAPI.getData("https://www.omdbapi.com/?t=gilmore+girls&season=1&episode=2&apikey=9b4ee23");
		EpisodeData episodeData = convert.getData (json, EpisodeData.class);
		System.out.println(episodeData);
	}
}
