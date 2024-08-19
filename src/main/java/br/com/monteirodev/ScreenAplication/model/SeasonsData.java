package br.com.monteirodev.ScreenAplication.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record SeasonsData(Integer Season,
                          String Title,
                          List <SeasonsData> episodes
                          ) {
}
