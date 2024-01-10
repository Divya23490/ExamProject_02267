package org.acme.Domain;

import org.acme.service.TokenManagementServices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customer {
//    private String name;
//    private String customerId;
//    private String bankAccountId;
//    private List<Token> tokens;
//
//    public Customer(String name, String customerId, String bankAccountId) {
//        this.name = name;
//        this.customerId = customerId;
//        this.bankAccountId = bankAccountId;
//        this.tokens = new ArrayList<>();
//    }
//
//    // Getters and setters omitted for brevity
//
//    public List<Token> requestTokens(int numberOfTokens, TokenManagementServices tokenManagementServices) {
//        if (canRequestTokens(numberOfTokens)) {
//            List<Token> newTokens = tokenManagementServices.generateTokens(numberOfTokens);
//            tokens.addAll(newTokens);
//            return newTokens;
//        }
//        return Collections.emptyList();
//    }
//
//    private boolean canRequestTokens(int numberOfTokens) {
//        long unusedTokensCount = tokens.stream().filter(token -> !token.isTokenStatus()).count();
//        return (unusedTokensCount == 0 || unusedTokensCount == 1) &&
//                (unusedTokensCount + numberOfTokens <= 6);
//    }
//
//    public int countUnusedTokens() {
//        return (int) tokens.stream().filter(token -> !token.isTokenStatus()).count();
//    }
}

