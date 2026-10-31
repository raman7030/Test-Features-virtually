package com.alipay.sdk.m.c0;

import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class f {
    public Stack a = new Stack();

    public void a(e eVar) {
        this.a.push(eVar);
    }

    public boolean b() {
        return this.a.isEmpty();
    }

    public e c() {
        return (e) this.a.pop();
    }

    public void a() {
        if (b()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((e) it.next()).b();
        }
        this.a.clear();
    }
}
