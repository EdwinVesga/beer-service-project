package com.evesga.beerserviceproject.web.bootstrap;

import com.evesga.beerserviceproject.web.domain.Beer;
import com.evesga.beerserviceproject.web.repository.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    @Autowired
    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if(beerRepository.count() == 0) {
            beerRepository.save(Beer.builder()
                            .beerName("Mango Bobs")
                            .beerStyle("IPA")
                            .minOnHand(12)
                            .quantityToBrew(200)
                            .upc(337010000001L)
                            .price(BigDecimal.valueOf(12.95))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Galaxy Cat")
                    .beerStyle("PALE_ALE")
                    .minOnHand(12)
                    .quantityToBrew(200)
                    .upc(337010000002L)
                    .price(BigDecimal.valueOf(11.95))
                    .build());
        }

        System.out.println("Loaded Beers: " + beerRepository.count());
    }
}
