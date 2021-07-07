package com.orhanararat.service;

import com.orhanararat.model.CurrencyExchange;

public interface CurrencyExchangeService {
    public CurrencyExchange findCurrencyExchangeByFromAndTo(String from, String to);
}
