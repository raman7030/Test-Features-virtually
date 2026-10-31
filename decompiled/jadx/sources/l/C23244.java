package l;

/* JADX INFO: renamed from: l.᩺᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6VI */
/* JADX INFO: loaded from: classes.dex */
public final class C23244 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f74675;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f74676;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f74677;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f74678;

    public C23244(int i, int i2) {
        if (i < 0 || i2 < 1 || i2 > 4) {
            throw new IllegalArgumentException("Invalid syntax chunk plan");
        }
        this.f74678 = i;
        this.f74677 = i2;
        long j = i;
        long j2 = i2 * 2;
        int iMax = (int) Math.max(8192L, Math.min(65536L, ((j + j2) - 1) / j2));
        this.f74676 = iMax;
        this.f74675 = Math.max(1, (int) (((j + ((long) iMax)) - 1) / ((long) iMax)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m51564(int i) {
        C11003.checkIndex(i, this.f74675);
        return (int) Math.min(this.f74678, (((long) i) + 1) * ((long) this.f74676));
    }
}
