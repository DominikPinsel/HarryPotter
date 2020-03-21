package com.pinsel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookStoreTests {

    private BookStore store;

    @Before
    public void InitializeStore() {
        store = new BookStore();
    }

    @Test
    public void WhenOneBookIsBoughtThenFullPrice() {
        store.BuyPartOne();
        assertEquals(8, store.Price(), 0);
    }

    @Test
    public void WhenTwoDifferentBooksAreBoughtThenFivePercentDiscount() {
        store.BuyPartOne();
        store.BuyPartTwo();

        assertEquals(15.2, store.Price(), 0.01);
    }

    @Test
    public void WhenTwoDifferentBooksAndOneDoubleAreBoughtThenTheFirstTwoGetFivePercentDiscount() {
        store.BuyPartOne();
        store.BuyPartTwo();
        store.BuyPartOne();

        assertEquals(23.2, store.Price(), 0.01);
    }

    @Test
    public void WhenThreeDifferentBooksAreBoughtThenTenPercentDiscount() {
        store.BuyPartOne();
        store.BuyPartTwo();
        store.BuyPartThree();

        assertEquals(21.6, store.Price(), 0.01);
    }

    @Test
    public void WhenFourDifferentBooksAreBoughtThenTenTwentyDiscount() {
        store.BuyPartOne();
        store.BuyPartTwo();
        store.BuyPartThree();
        store.BuyPartFour();

        assertEquals(25.6, store.Price(), 0.01);
    }

    @Test
    public void WhenFiveDifferentBooksAreBoughtThenTenTwentyFiveDiscount() {
        store.BuyPartOne();
        store.BuyPartTwo();
        store.BuyPartThree();
        store.BuyPartFour();
        store.BuyPartFive();

        assertEquals(30, store.Price(), 0.01);
    }

    @Test
    public void WhenAMixOfManyBooksIsBoughtThenTheDiscountsAreAppliedMultipleTimes() {
        store.BuyPartOne();
        store.BuyPartOne();
        store.BuyPartTwo();
        store.BuyPartTwo();
        store.BuyPartThree();
        store.BuyPartThree();
        store.BuyPartFour();
        store.BuyPartFive();

        assertEquals(51.2, store.Price(), 0.01);
    }

}
