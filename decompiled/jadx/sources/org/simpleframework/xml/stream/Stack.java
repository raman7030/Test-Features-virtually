package org.simpleframework.xml.stream;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class Stack extends ArrayList {
    public Stack(int i) {
        super(i);
    }

    public Object pop() {
        int size = size();
        if (size <= 0) {
            return null;
        }
        return remove(size - 1);
    }

    public Object top() {
        int size = size();
        if (size <= 0) {
            return null;
        }
        return get(size - 1);
    }

    public Object bottom() {
        if (size() <= 0) {
            return null;
        }
        return get(0);
    }

    public Object push(Object obj) {
        add(obj);
        return obj;
    }
}
