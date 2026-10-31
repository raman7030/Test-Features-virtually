package l;

/* JADX INFO: renamed from: l.᩺᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6TD */
/* JADX INFO: loaded from: classes.dex */
public final class C23224 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11999 f74636;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f74637;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f74638;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C11999 f74639;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f74640;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C21605 f74641;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile long f74642 = -1;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C5089 f74643;

    public C23224(int i, long j, long j2, C5089 c5089, C11999 c11999, C11999 c119910) {
        if (i >= 0) {
            long j3 = i;
            if (((long) c11999.m29347()) + j3 <= 2147483647L && j3 + ((long) c119910.m29347()) <= 2147483647L) {
                if (c11999.f35930 != c119910.f35930 || c11999.f35927 != c119910.f35927 || c11999.f35928 != c119910.f35928) {
                    throw new IllegalArgumentException("History fragments belong to different text stores");
                }
                this.f74637 = i;
                this.f74640 = j;
                this.f74638 = j2;
                C11003.requireNonNull(c5089);
                this.f74643 = c5089;
                this.f74639 = c11999;
                this.f74636 = c119910;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid history text range");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51531() {
        return this.f74639.m29347() == 0 && this.f74636.m29347() == 0;
    }
}
