package br.com.monteirodev.ScreenAplication.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record EpisodeData(String Title,
                          Integer Episode,
                          String imdbRating,
                          String Released) {
}
