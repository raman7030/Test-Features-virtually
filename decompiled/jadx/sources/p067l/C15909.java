package p067l;

/* JADX INFO: renamed from: l.ܳۗ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: F8T9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15909 {

    /* JADX INFO: renamed from: ֫ */
    public final long f46017;

    /* JADX INFO: renamed from: ۜ */
    public final boolean f46018;

    /* JADX INFO: renamed from: ۢ */
    public final long f46019;

    /* JADX INFO: renamed from: ۧ */
    public final long f46020;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f46021;

    /* JADX INFO: renamed from: ܽ */
    public final C17474 f46022;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f46023;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f46024;

    /* JADX INFO: renamed from: ᩷ */
    public final long f46025;

    /* JADX INFO: renamed from: ᩻ */
    public final boolean f46026;

    public C15909(C17474 c17474, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        C23877.m52957(!z5 || z3);
        C23877.m52957(!z4 || z3);
        if (z2 && (z3 || z4 || z5)) {
            z6 = false;
        }
        C23877.m52957(z6);
        this.f46022 = c17474;
        this.f46019 = j;
        this.f46025 = j2;
        this.f46020 = j3;
        this.f46017 = j4;
        this.f46018 = z;
        this.f46023 = z2;
        this.f46021 = z3;
        this.f46026 = z4;
        this.f46024 = z5;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C15909 m36025(long j) {
        if (j == this.f46019) {
            return this;
        }
        return new C15909(this.f46022, j, this.f46025, this.f46020, this.f46017, this.f46018, this.f46023, this.f46021, this.f46026, this.f46024);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15909 m36024(long j) {
        if (j == this.f46025) {
            return this;
        }
        return new C15909(this.f46022, this.f46019, j, this.f46020, this.f46017, this.f46018, this.f46023, this.f46021, this.f46026, this.f46024);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C15909.class == obj.getClass()) {
            C15909 c15909 = (C15909) obj;
            if (this.f46019 == c15909.f46019 && this.f46025 == c15909.f46025 && this.f46020 == c15909.f46020 && this.f46017 == c15909.f46017 && this.f46018 == c15909.f46018 && this.f46023 == c15909.f46023 && this.f46021 == c15909.f46021 && this.f46026 == c15909.f46026 && this.f46024 == c15909.f46024 && C12826.equals(this.f46022, c15909.f46022)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f46022.hashCode() + 527) * 31) + ((int) this.f46019)) * 31) + ((int) this.f46025)) * 31) + ((int) this.f46020)) * 31) + ((int) this.f46017)) * 31) + (this.f46018 ? 1 : 0)) * 31) + (this.f46023 ? 1 : 0)) * 31) + (this.f46021 ? 1 : 0)) * 31) + (this.f46026 ? 1 : 0)) * 31) + (this.f46024 ? 1 : 0);
    }
}
