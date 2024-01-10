package org.acme;

import java.util.*;

public class TokenManager {
    private Map<String, Token> issuedTokens;

    public TokenManager() {
        issuedTokens = new HashMap<>();
    }

    public List<Token> generateTokens(int count) {
        List<Token> newTokens = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Token token = new Token(generateUniqueTokenId(), false);
            newTokens.add(token);
            issuedTokens.put(token.getTokenId(), token);
        }
        return newTokens;
    }

    public boolean validateToken(String tokenId) {
        Token token = issuedTokens.get(tokenId);
        return token != null && !token.isUsed();
    }

    private String generateUniqueTokenId() {
        return UUID.randomUUID().toString();
    }
}

