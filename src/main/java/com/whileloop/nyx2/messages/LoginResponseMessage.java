/*
 * The MIT License
 *
 * Copyright 2019 Team whileLOOP.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.whileloop.nyx2.messages;

import com.whileloop.sendit.messages.SMessage;
import java.util.UUID;

/**
 *
 * @author sulochana
 */
public class LoginResponseMessage extends SMessage {

    public enum ResponseType {

        SUCCESS,
        INVALID_CREDENTIALS,
        AUTH_TOKEN_EXPIRED,
        INTERNAL_ERROR
    }

    private final ResponseType response;
    private UUID agentUUID;
    private String authToken;

    public LoginResponseMessage(ResponseType response) {
        this.response = response;
    }

    public ResponseType getResponse() {
        return response;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public UUID getAgentUUID() {
        return agentUUID;
    }

    public void setAgentUUID(UUID agentUUID) {
        this.agentUUID = agentUUID;
    }

}
