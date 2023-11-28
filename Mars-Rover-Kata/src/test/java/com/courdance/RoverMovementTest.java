package com.courdance;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.assertEquals;



class RoverMovementTest {
    private Rover rover;

    @BeforeEach
    void initialize(){
        rover = new Rover();
    }

    @ParameterizedTest
    @CsvSource({
            "R , 0:0:E",
            "RR , 0:0:S",
            "RRR , 0:0:W",
            "RRRR, 0:0:N"


    })
    void rotate_right(String commands, String position){
        assertEquals(rover.execute(commands),(position));
    }

    @ParameterizedTest
    @CsvSource({
            "L , 0:0:W",
            "LL , 0:0:S",
            "LLL , 0:0:E",
            "LLLL, 0:0:N"


    })
    void rotate_left(String commands, String position){
        assertEquals(rover.execute(commands),(position));
    }


}
