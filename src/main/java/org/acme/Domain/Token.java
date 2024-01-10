package org.acme.Domain;


import java.time.LocalDate;

public class Token {
    private int tokenID;
    private String token;
    private String tokenStatus;
    private LocalDate tokenCreateDate;
    private int customerID;
    private int tokenCount;

    public Token(int tokenID, String token, String tokenStatus, LocalDate tokenCreateDate, int customerID) {
        this.tokenID = tokenID;
        this.token = token;
        this.tokenStatus = tokenStatus;
        this.tokenCreateDate = tokenCreateDate;
        this.customerID = customerID;
    }

    public int getTokenID() {
        return tokenID;
    }

    public void setTokenID(int tokenID) {
        this.tokenID = tokenID;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTokenStatus() {
        return tokenStatus;
    }

    public void setTokenStatus(String tokenStatus) {
        this.tokenStatus = tokenStatus;
    }

    public LocalDate getTokenCreateDate() {
        return tokenCreateDate;
    }

    public void setTokenCreateDate(LocalDate tokenCreateDate) {
        this.tokenCreateDate = tokenCreateDate;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public Token(){}
    public Token(int customerID,int tokenCount) {
        this.customerID = customerID;
        this.tokenCount = tokenCount;
    }
    public Token(int tokenID, String token, String tokenStatus) {
        this.tokenID = tokenID;
        this.token = token;
        this.tokenStatus = tokenStatus;
    }

    public int getTokenCount() {
        return tokenCount;
    }

    public void setTokenCount(int tokenCount) {
        this.tokenCount = tokenCount;
    }
}


