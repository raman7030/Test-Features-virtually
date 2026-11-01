package p067l;

/* JADX INFO: renamed from: l.ܳۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 470W */
/* JADX INFO: loaded from: classes3.dex */
public final class C15940 {

    /* JADX INFO: renamed from: ֫ */
    public final C13221 f46128;

    /* JADX INFO: renamed from: ۜ */
    public final C11209 f46129;

    /* JADX INFO: renamed from: ۢ */
    public final long f46130;

    /* JADX INFO: renamed from: ۧ */
    public final C19452 f46131;

    /* JADX INFO: renamed from: ܳ */
    public final C17952 f46132;

    /* JADX INFO: renamed from: ܽ */
    public final int f46133;

    /* JADX INFO: renamed from: ܿ */
    public final C24320 f46134;

    /* JADX INFO: renamed from: ᩳ */
    public final C19294 f46135;

    /* JADX INFO: renamed from: ᩷ */
    public final int f46136;

    /* JADX INFO: renamed from: ᩻ */
    public final int f46137;

    public C15940(C24320 c24320, long j, int i, int i2, int i3, C11209 c11209, C19452 c19452, C17952 c17952, C13221 c13221, C19294 c19294) {
        C12826.requireNonNull(c24320, "program");
        this.f46134 = c24320;
        this.f46129 = c11209;
        this.f46131 = c19452;
        this.f46132 = c17952;
        this.f46128 = c13221;
        this.f46135 = c19294;
        if (c19294 != null && (c19294.f57640.m37665() != i || c19294.f57642.m40865() != c24320)) {
            throw new IllegalArgumentException("Window pending reuse identity differs");
        }
        if (i < 0 || i2 < 0 || i2 > i3 || i3 > i) {
            throw new IllegalArgumentException("Invalid syntax window result range");
        }
        int i4 = i3 - i2;
        if (c11209.m25889() != i4) {
            throw new IllegalArgumentException("Window style length differs from requested range");
        }
        if (c19452.m44259() != i4 || c19452.m44264(0) != c24320.f77059) {
            throw new IllegalArgumentException("Window context differs from requested range");
        }
        if (c13221.m30238() != c24320 || c13221.m30239() != i) {
            throw new IllegalArgumentException("Window checkpoint cache identity differs");
        }
        this.f46130 = j;
        this.f46136 = i;
        this.f46137 = i2;
        this.f46133 = i3;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C24320 m36196() {
        return this.f46134;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final long m36197() {
        return this.f46130;
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m36191() {
        return this.f46136;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m36193() {
        return this.f46137;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m36194() {
        return this.f46133;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C11209 m36198() {
        return this.f46129;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C19452 m36192() {
        return this.f46131;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13221 m36190() {
        return this.f46128;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C17952 m36195() {
        return this.f46132;
    }
}
