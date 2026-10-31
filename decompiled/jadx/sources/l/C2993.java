package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۗۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76ZW */
/* JADX INFO: loaded from: classes2.dex */
public final class C2993 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f9441;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f9442;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int[] f9440 = new int[16];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C19927[] f9439 = new C19927[16];

    public C2993(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative text length");
        }
        this.f9442 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9131(int i, C19927 c19927) {
        C11003.requireNonNull(c19927);
        int i2 = this.f9442;
        C11003.checkFromToIndex(i, i, i2);
        if (c19927.m45903() != i2) {
            throw new IllegalArgumentException("Index and dependency lengths differ");
        }
        int i3 = this.f9441;
        if (i3 == this.f9440.length) {
            long jMax = ((long) i3) + ((long) Math.max(16, i3 >>> 1));
            int i4 = (int) jMax;
            if (jMax != i4) {
                throw new ArithmeticException();
            }
            this.f9440 = Arrays.copyOf(this.f9440, i4);
            this.f9439 = (C19927[]) Arrays.copyOf(this.f9439, i4);
        }
        int[] iArr = this.f9440;
        int i5 = this.f9441;
        iArr[i5] = i;
        this.f9439[i5] = c19927;
        this.f9441 = i5 + 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12165 m9130(EnumC21338 enumC21338) {
        C11003.requireNonNull(enumC21338);
        return new C12165(this, enumC21338);
    }
}
