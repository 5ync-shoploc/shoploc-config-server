package com.shoploc.shoplocconfigserver;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.springframework.boot.SpringApplication;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mockStatic;

class ShoplocConfigServerApplicationMainTest {

    @Test
    void mainStartsSpringApplication() {
        try (MockedStatic<SpringApplication> spring = mockStatic(SpringApplication.class)) {
            ShoplocConfigServerApplication.main(new String[]{});

            spring.verify(() -> SpringApplication.run(eq(ShoplocConfigServerApplication.class), any(String[].class)));
        }
    }
}
