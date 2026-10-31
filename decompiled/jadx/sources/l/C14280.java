package l;

/* JADX INFO: renamed from: l.ܳۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 470W */
/* JADX INFO: loaded from: classes3.dex */
public final class C14280 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11419 f43036;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C9302 f43037;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long f43038;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17975 f43039;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C16397 f43040;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f43041;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C23097 f43042;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C17809 f43043;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f43044;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f43045;

    public C14280(C23097 c23097, long j, int i, int i2, int i3, C9302 c9302, C17975 c17975, C16397 c16397, C11419 c11419, C17809 c17809) {
        C11003.requireNonNull(c23097, "program");
        this.f43042 = c23097;
        this.f43037 = c9302;
        this.f43039 = c17975;
        this.f43040 = c16397;
        this.f43036 = c11419;
        this.f43043 = c17809;
        if (c17809 != null && (c17809.f54444.m35509() != i || c17809.f54446.m38649() != c23097)) {
            throw new IllegalArgumentException("Window pending reuse identity differs");
        }
        if (i < 0 || i2 < 0 || i2 > i3 || i3 > i) {
            throw new IllegalArgumentException("Invalid syntax window result range");
        }
        int i4 = i3 - i2;
        if (c9302.m23880() != i4) {
            throw new IllegalArgumentException("Window style length differs from requested range");
        }
        if (c17975.m42010() != i4 || c17975.m42015(0) != c23097.f74313) {
            throw new IllegalArgumentException("Window context differs from requested range");
        }
        if (c11419.m28194() != c23097 || c11419.m28195() != i) {
            throw new IllegalArgumentException("Window checkpoint cache identity differs");
        }
        this.f43038 = j;
        this.f43044 = i;
        this.f43045 = i2;
        this.f43041 = i3;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23097 m34063() {
        return this.f43042;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m34064() {
        return this.f43038;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m34058() {
        return this.f43044;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m34060() {
        return this.f43045;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m34061() {
        return this.f43041;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C9302 m34065() {
        return this.f43037;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17975 m34059() {
        return this.f43039;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11419 m34057() {
        return this.f43036;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C16397 m34062() {
        return this.f43040;
    }
}
