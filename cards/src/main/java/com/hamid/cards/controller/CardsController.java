package com.hamid.cards.controller;

import com.hamid.cards.model.Cards;
import com.hamid.cards.model.Customer;
import com.hamid.cards.repository.CardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardsController {

    @Autowired
    private CardsRepository cardsRepository;

    @PostMapping("/myCards")
    public List<Cards> getCardsDetails(@RequestBody Customer customer) {
        List<Cards> cards = this.cardsRepository.findByCustomerId(customer.getCustomerId());
        if(cards != null && cards.size() > 1) {
            return cards;
        }
        return null;
    }
}
