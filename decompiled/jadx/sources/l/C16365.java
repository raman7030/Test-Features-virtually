package l;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.ܽۗ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H74H */
/* JADX INFO: loaded from: classes4.dex */
public final class C16365 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f50353 = new ArrayDeque();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f50354 = new ArrayDeque();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C10722 m38529() {
        C10722 c10722 = (C10722) this.f50354.removeFirst();
        this.f50353.push(c10722);
        return c10722;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10722 m38528() {
        return (C10722) this.f50354.peekFirst();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m38527() {
        return this.f50354.isEmpty();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38526(int i, int i2, long j) {
        C10722 c10722;
        ArrayDeque arrayDeque = this.f50353;
        if (!arrayDeque.isEmpty()) {
            c10722 = (C10722) arrayDeque.pop();
        } else {
            c10722 = new C10722();
            c10722.f32308 = j;
            c10722.f32307 = i;
            c10722.f32309 = i2;
        }
        c10722.f32308 = j;
        c10722.f32307 = i;
        c10722.f32309 = i2;
        this.f50354.addLast(c10722);
    }
}
