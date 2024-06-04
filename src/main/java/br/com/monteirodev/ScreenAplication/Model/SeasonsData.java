package br.com.monteirodev.ScreenAplication.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record SeasonsData(Integer Season,
                          List <SeasonsData> Episodes
                          ) {
}
