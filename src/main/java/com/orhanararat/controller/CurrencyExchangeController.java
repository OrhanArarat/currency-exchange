package com.orhanararat.controller;

import com.orhanararat.model.CurrencyExchange;
import com.orhanararat.service.CurrencyExchangeService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequiredArgsConstructor
public class CurrencyExchangeController {

    private final Environment environment;
    private final CurrencyExchangeService currencyExchangeService;

    @GetMapping("currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange getCurrencyExchange(@PathVariable String from, @PathVariable String to) {
        return currencyExchangeService.findCurrencyExchangeByFromAndTo(from, to);
    }
}
