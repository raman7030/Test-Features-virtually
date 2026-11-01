package p067l;

/* JADX INFO: renamed from: l.᩺᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6TD */
/* JADX INFO: loaded from: classes.dex */
public final class C24441 {

    /* JADX INFO: renamed from: ֫ */
    public final C13773 f77379;

    /* JADX INFO: renamed from: ۜ */
    public final int f77380;

    /* JADX INFO: renamed from: ۧ */
    public final long f77381;

    /* JADX INFO: renamed from: ܳ */
    public final C13773 f77382;

    /* JADX INFO: renamed from: ܽ */
    public final long f77383;

    /* JADX INFO: renamed from: ܿ */
    public C22902 f77384;

    /* JADX INFO: renamed from: ᩳ */
    public volatile long f77385 = -1;

    /* JADX INFO: renamed from: ᩻ */
    public final C7205 f77386;

    public C24441(int i, long j, long j2, C7205 c7205, C13773 c13773, C13773 c13774) {
        if (i >= 0) {
            long j3 = i;
            if (((long) c13773.m31402()) + j3 <= 2147483647L && j3 + ((long) c13774.m31402()) <= 2147483647L) {
                if (c13773.f38940 != c13774.f38940 || c13773.f38937 != c13774.f38937 || c13773.f38938 != c13774.f38938) {
                    throw new IllegalArgumentException("History fragments belong to different text stores");
                }
                this.f77380 = i;
                this.f77383 = j;
                this.f77381 = j2;
                C12826.requireNonNull(c7205);
                this.f77386 = c7205;
                this.f77382 = c13773;
                this.f77379 = c13774;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid history text range");
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m53928() {
        return this.f77382.m31402() == 0 && this.f77379.m31402() == 0;
    }
}
