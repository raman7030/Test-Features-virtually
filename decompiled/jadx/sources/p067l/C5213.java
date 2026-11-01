package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۗۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76ZW */
/* JADX INFO: loaded from: classes2.dex */
public final class C5213 {

    /* JADX INFO: renamed from: ܽ */
    public int f12240;

    /* JADX INFO: renamed from: ᩳ */
    public final int f12241;

    /* JADX INFO: renamed from: ۧ */
    public int[] f12239 = new int[16];

    /* JADX INFO: renamed from: ֫ */
    public C21307[] f12238 = new C21307[16];

    public C5213(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative text length");
        }
        this.f12241 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11182(int i, C21307 c21307) {
        C12826.requireNonNull(c21307);
        int i2 = this.f12241;
        C12826.checkFromToIndex(i, i, i2);
        if (c21307.m48216() != i2) {
            throw new IllegalArgumentException("Index and dependency lengths differ");
        }
        int i3 = this.f12240;
        if (i3 == this.f12239.length) {
            long jMax = ((long) i3) + ((long) Math.max(16, i3 >>> 1));
            int i4 = (int) jMax;
            if (jMax != i4) {
                throw new ArithmeticException();
            }
            this.f12239 = Arrays.copyOf(this.f12239, i4);
            this.f12238 = (C21307[]) Arrays.copyOf(this.f12238, i4);
        }
        int[] iArr = this.f12239;
        int i5 = this.f12240;
        iArr[i5] = i;
        this.f12238[i5] = c21307;
        this.f12240 = i5 + 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13930 m11181(EnumC22648 enumC22648) {
        C12826.requireNonNull(enumC22648);
        return new C13930(this, enumC22648);
    }
}
