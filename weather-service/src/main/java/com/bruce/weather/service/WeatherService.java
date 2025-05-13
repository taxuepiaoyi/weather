package com.bruce.weather.service;

public interface WeatherService {
    /**
     * 获取天气信息
     * @param city
     * @return
     * @throws Exception
     */
    String getWeather(String city) throws Exception;
}
