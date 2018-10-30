package com.test.imp;

import org.springframework.security.crypto.password.PasswordEncoder;

public class CustomEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence charSequence) {
        System.out.println(charSequence);
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        System.out.println("charSequence" + charSequence);
        System.out.println(s);
        return true;
    }
}
