package br.com.monteirodev.ScreenAplication.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record SeriesData ( String Title,
                           int totalSeasons,
                           String imdbRating){
}
