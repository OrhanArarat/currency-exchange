package com.orhanararat.service;

import com.orhanararat.model.CurrencyExchange;
import com.orhanararat.repository.CurrencyExchangeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CurrencyExchangeServiceImpl implements CurrencyExchangeService{

    private final CurrencyExchangeRepository repository;

    @Override
    public CurrencyExchange findCurrencyExchangeByFromAndTo(String from, String to) {
        Optional<CurrencyExchange> currency = repository.findCurrencyExchangeByFromAndTo(from, to);

        return currency.orElse(null);
    }
}
