package br.com.monteirodev.ScreenAplication.Service;

public interface IDataConvert {
  <T> T  getData (String json, Class<T> clazz);
}
