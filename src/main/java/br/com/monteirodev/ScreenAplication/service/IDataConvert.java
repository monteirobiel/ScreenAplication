package br.com.monteirodev.ScreenAplication.service;

public interface IDataConvert {
  <T> T  getData (String json, Class<T> clazz);
}
