package p067l;

/* JADX INFO: renamed from: l.ۜۢܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7704 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8723 {

    /* JADX INFO: renamed from: ֫ */
    public final C19452 f23643;

    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC21800 f23644;

    /* JADX INFO: renamed from: ۧ */
    public final int f23645;

    /* JADX INFO: renamed from: ܳ */
    public final int f23646;

    /* JADX INFO: renamed from: ܽ */
    public final int f23647;

    /* JADX INFO: renamed from: ܿ */
    public final C11209 f23648;

    /* JADX INFO: renamed from: ᩳ */
    public final C24320 f23649;

    /* JADX INFO: renamed from: ᩻ */
    public final int f23650;

    public C8723(InterfaceC21800 interfaceC21800, C24320 c24320, C11209 c11209, C19452 c19452, int i, int i2) {
        C12826.requireNonNull(interfaceC21800, "textOwner");
        this.f23644 = interfaceC21800;
        this.f23649 = c24320;
        C12826.requireNonNull(c11209, "store");
        this.f23648 = c11209;
        C12826.requireNonNull(c19452, "contexts");
        this.f23643 = c19452;
        this.f23650 = interfaceC21800.mo28581();
        int length = interfaceC21800.length();
        this.f23646 = length;
        C12826.checkFromToIndex(i, i2, length);
        if (c11209.m25889() != length || c19452.m44259() != i2 - i || !c19452.m44256(c19452.m44259(), c24320.f77059)) {
            throw new IllegalArgumentException("Syntax consumer context differs from display");
        }
        this.f23647 = i;
        this.f23645 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8723 m20168(InterfaceC9768 interfaceC9768, C24320 c24320, C11209 c11209, C19452 c19452) {
        return new C8723(interfaceC9768, c24320, c11209, c19452, 0, interfaceC9768.length());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8723 m20169(InterfaceC9768 interfaceC9768, C24320 c24320, C11209 c11209, C19452 c19452, int i, int i2) {
        return new C8723(interfaceC9768, c24320, c11209, c19452, i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m20177(InterfaceC9768 interfaceC9768, C24320 c24320) {
        return this.f23644 == interfaceC9768 && this.f23649 == c24320 && this.f23650 == interfaceC9768.mo28581() && this.f23646 == interfaceC9768.length();
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m20178() {
        return this.f23646;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m20180(int i, int i2) {
        int i3 = this.f23646;
        C12826.checkFromToIndex(i, i2, i3);
        int i4 = this.f23645;
        int i5 = this.f23647;
        if (i < i2) {
            return i5 <= i && i2 <= i4;
        }
        if (i3 == 0) {
            return i5 == 0 && i4 == 0;
        }
        if (i < i3) {
            return i5 <= i && i < i4;
        }
        return i4 == i3 && i5 < i4;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m20174(int i) {
        C12826.checkIndex(i, this.f23646);
        m20173(i, i + 1);
        return this.f23643.m44254(i - this.f23647);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m20175(int i, int i2) {
        m20173(i, i2);
        int i3 = this.f23647;
        C19452 c19452 = this.f23643;
        if (i == i2) {
            int i4 = this.f23646;
            if (i4 == 0) {
                return 0;
            }
            if (i >= i4) {
                i--;
            }
            return c19452.m44254(i - i3);
        }
        return c19452.m44255(i - i3, i2 - i3);
    }

    /* JADX INFO: renamed from: ܽ */
    public final C16689 m20183(int i, int i2) {
        return this.f23643.m44264(m20175(i, i2));
    }

    /* JADX INFO: renamed from: ܽ */
    public final C16689 m20182(int i) {
        return this.f23643.m44264(i);
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m20184(int i) {
        return this.f23643.m44261(i) + this.f23647;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m20185(int i) {
        return this.f23643.m44262(i) + this.f23647;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m20179(int i) {
        return this.f23643.m44260(i);
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m20181(int i) {
        C12826.checkIndex(i, this.f23646);
        m20173(i, i + 1);
        return this.f23648.m25892(i).m51556();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11209 m20176() {
        return this.f23648;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ */
    public void m20173(int i, int i2) {
        if (!m20180(i, i2)) {
            throw new IllegalStateException("Syntax context is unknown outside coverage");
        }
    }
}
