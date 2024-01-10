package org.acme;

public class TestDTUPay {
    public static void main(String[] args) {
        TokenManager tokenManager = new TokenManager();
        Customer customer = new Customer("John Doe", "Cust123", "BA789");

        System.out.println("Requesting 5 tokens:");
        customer.requestTokens(5, tokenManager).forEach(token ->
                System.out.println("Generated Token: " + token.getTokenId()));

        System.out.println("\nTotal unused tokens: " + customer.countUnusedTokens());
    }
}

