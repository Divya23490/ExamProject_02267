package org.acme.service;

import org.acme.Utils.HelperAttributes;
import org.acme.Domain.Token;

import java.time.LocalDate;
import java.util.*;

public class TokenManagementServices {
    private List<Token> tokenList = new ArrayList<>();
    public List<Token> generateTokens(Token objT) {
        // Check here how many token customer want to generate
        if (objT.getTokenCount() <= HelperAttributes.MAX_TOKEN_REQ){
            int tokenUnused = validateToken(objT.getCustomerID());
            if (tokenUnused <= HelperAttributes.MAX_UNUSED_TOKEN){
                for (int i = 0; i < objT.getTokenCount(); i++) {
                    int tokenId = tokenList.size() + 1;
                    Token token= new Token(tokenId,generateUniqueTokenId(),HelperAttributes.STATUS_UNUSED,LocalDate.now(), objT.getCustomerID());
                    tokenList.add(token);
                }
                return tokenList;
            }
        }
        return null;
    }

    public int validateToken(int cid) {
        return Math.toIntExact(tokenList.stream().filter(t -> t.getCustomerID() == cid && Objects.equals(t.getTokenStatus(), HelperAttributes.STATUS_UNUSED)).count());
    }

    private String generateUniqueTokenId() {
        return UUID.randomUUID().toString();
    }

}

