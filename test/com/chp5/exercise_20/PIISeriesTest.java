package com.chp5.exercise_20;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PIISeriesTest {

    PIISeries piiSeries;

    @BeforeEach
    void setUp() {
        piiSeries = new PIISeries();
    }

    @Test
    void caculatePiSeries() {
        piiSeries.caculatePiSeries();

    }
}