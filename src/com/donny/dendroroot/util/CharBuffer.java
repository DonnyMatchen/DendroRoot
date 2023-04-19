package com.donny.dendroroot.util;

import java.util.ArrayList;

public class CharBuffer {
    private final ArrayList<Character> BUFFER = new ArrayList<>();
    private final int SIZE;
    private final char[] MASTER;
    public CharBuffer(String master) {
        SIZE = master.length();
        MASTER = master.toCharArray();
    }

    public boolean check(char c) {
        BUFFER.add(c);
        if(BUFFER.size() > SIZE) {
            BUFFER.remove(0);
        }
        for(int i = 0; i < MASTER.length; i++) {
            if(MASTER[i] != BUFFER.get(i)) {
                return false;
            }
        }
        return true;
    }
}
