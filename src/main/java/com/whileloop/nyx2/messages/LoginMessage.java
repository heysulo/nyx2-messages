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
import java.io.Console;
import java.util.UUID;

/**
 *
 * @author sulochana
 */
public class LoginMessage extends SMessage {

    private final UUID uuid;
    private String email;
    private String password;

    public LoginMessage() {
        this.uuid = UUID.randomUUID();
        getCredentialsFromUser();
    }

    public UUID getUuid() {
        return uuid;
    }

    private void getCredentialsFromUser() {
        Console console = System.console();
        if (console != null) {
            System.out.println("+------------------- Authentication Required -------------------+\n\n");
            this.email = console.readLine("Email Address: ");
            char[] pwd = console.readPassword("Password: ");
            this.password = new String(pwd);
            System.out.println("\n\n+---------------------------------------------------------------+");
        } else {
            System.err.println("Unable to access System Console.");
            throw new RuntimeException("System Console is required for user input");
        }

    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
