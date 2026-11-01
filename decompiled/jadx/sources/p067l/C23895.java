package p067l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.᩺֨֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 07TI */
/* JADX INFO: loaded from: classes.dex */
public final class C23895 {

    /* JADX INFO: renamed from: ֫ */
    public final BitSet f75885;

    public C23895(BitSet bitSet) {
        this.f75885 = bitSet;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52979(char c) {
        if (c > 127) {
            throw new IllegalArgumentException("Can only match ASCII characters");
        }
        this.f75885.set(c);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52980(char c, char c2) {
        while (c <= c2) {
            m52979(c);
            c = (char) (c + 1);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15177 m52978() {
        return new C15177(this);
    }
}
