package one.digitalinnovation.parking.controller;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ParkingControllerTest {

    @LocalServerPort
    private int randonPort;

    @BeforeEach
    public void setUpTest() {

        System.out.println(randonPort);
        RestAssured.port = randonPort;
    }

    @Test
    void findAll() {
    }

    @Test
    void create() {
    }
}