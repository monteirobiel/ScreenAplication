package br.com.monteirodev.ScreenAplication.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record SeriesData ( String Title,
                           int totalSeasons,
                           String imdbRating){
}
