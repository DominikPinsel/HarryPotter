package com.pinsel;

import java.util.Stack;

public class BookStore {

    private Stack<String> bookSets;

    public BookStore() {
        bookSets = new Stack<>();
    }

    public void BuyPartOne() {
        AddToBookSet("1");
    }

    public void BuyPartTwo() {
        AddToBookSet("2");
    }

    public void BuyPartThree() {
        AddToBookSet("3");
    }

    public void BuyPartFour() {
        AddToBookSet("4");
    }

    public void BuyPartFive() {
        AddToBookSet("5");
    }

    private void AddToBookSet(String part) {
        for (var i = 0; i < bookSets.size(); i++) {
            var set = bookSets.get(i);
            if (!set.contains(part)) {
                bookSets.set(i, set + part);
                return;
            }
        }
        bookSets.add(part);
    }

    public double Price() {
        var price = 0.0;

        while (!bookSets.isEmpty()) {
            var set = bookSets.pop();
            switch (set.length()) {
                case 1:
                    price += 8;
                    break;
                case 2:
                    price += 8 * 2 * .95;
                    break;
                case 3:
                    price += 8 * 3 * .9;
                    break;
                case 4:
                    price += 8 * 4 * .8;
                    break;
                case 5:
                    price += 8 * 5 * .75;
                    break;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        return price;
    }

}
