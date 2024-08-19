package br.com.monteirodev.ScreenAplication.main;

import br.com.monteirodev.ScreenAplication.model.Episode;
import br.com.monteirodev.ScreenAplication.model.EpisodeData;
import br.com.monteirodev.ScreenAplication.model.SeasonsData;
import br.com.monteirodev.ScreenAplication.model.SeriesData;
import br.com.monteirodev.ScreenAplication.service.ConsumptionAPI;
import br.com.monteirodev.ScreenAplication.service.DataConvert;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

        private Scanner scanner = new Scanner(System.in);
        private ConsumptionAPI comsumption = new ConsumptionAPI();
        private DataConvert convert = new DataConvert();

        private final String ADDRESS = "https://www.omdbapi.com/?t=";
        private final String API_KEY = "&apikey=6585022c";

        public void showMenu(){
            System.out.println("Type your serie name");
            var serieName = scanner.nextLine();
            var json = comsumption.getData(ADDRESS + serieName.replace(" ", "+") + API_KEY);
            SeriesData data = convert.getData(json, SeriesData.class);
            System.out.println(data);

            List <SeasonsData> seasons = new ArrayList<>();

		for (int i = 1; i<= data.totalSeasons(); i++) {
			json = comsumption.getData(ADDRESS + serieName.replace(" ", "+") + "&season=" + i + API_KEY);
			SeasonsData seasonsData = convert.getData(json, SeasonsData.class);
			seasons.add(seasonsData);
			seasons.forEach(System.out::println);
		}
        seasons.forEach(t -> t.episodes().forEach(e -> System.out.println(e.Title())));
        seasons.forEach(System.out::println);


//        List<String> names = Arrays.asList("Jaque", "Iasmim", "paulo", "rodrigo", "nico");
//        names.stream()
//                .sorted()
//                .limit(3)
//                .filter(n -> n.startsWith("n"))
//                .map(n -> n.toUpperCase())
//                .forEach(System.out::println);


            List<Episode> episodes
        }
    }

