package p067l;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.ܽۗ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H74H */
/* JADX INFO: loaded from: classes4.dex */
public final class C17921 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayDeque f53526 = new ArrayDeque();

    /* JADX INFO: renamed from: ۧ */
    public final ArrayDeque f53527 = new ArrayDeque();

    /* JADX INFO: renamed from: ܽ */
    public final C12558 m40746() {
        C12558 c12558 = (C12558) this.f53527.removeFirst();
        this.f53526.push(c12558);
        return c12558;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C12558 m40745() {
        return (C12558) this.f53527.peekFirst();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m40744() {
        return this.f53527.isEmpty();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40743(int i, int i2, long j) {
        C12558 c12558;
        ArrayDeque arrayDeque = this.f53526;
        if (!arrayDeque.isEmpty()) {
            c12558 = (C12558) arrayDeque.pop();
        } else {
            c12558 = new C12558();
            c12558.f35282 = j;
            c12558.f35281 = i;
            c12558.f35283 = i2;
        }
        c12558.f35282 = j;
        c12558.f35281 = i;
        c12558.f35283 = i2;
        this.f53527.addLast(c12558);
    }
}
