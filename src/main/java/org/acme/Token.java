package org.acme;


public class Token {
    private String tokenId;
    private boolean isUsed;

    public Token(String tokenId, boolean isUsed) {
        this.tokenId = tokenId;
        this.isUsed = isUsed;
    }

    public String getTokenId() {
        return tokenId;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void markAsUsed() {
        this.isUsed = true;
    }
}


