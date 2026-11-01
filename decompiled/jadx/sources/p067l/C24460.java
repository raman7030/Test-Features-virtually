package p067l;

/* JADX INFO: renamed from: l.᩺᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6VI */
/* JADX INFO: loaded from: classes.dex */
public final class C24460 {

    /* JADX INFO: renamed from: ֫ */
    public final int f77418;

    /* JADX INFO: renamed from: ۧ */
    public final int f77419;

    /* JADX INFO: renamed from: ܽ */
    public final int f77420;

    /* JADX INFO: renamed from: ᩳ */
    public final int f77421;

    public C24460(int i, int i2) {
        if (i < 0 || i2 < 1 || i2 > 4) {
            throw new IllegalArgumentException("Invalid syntax chunk plan");
        }
        this.f77421 = i;
        this.f77420 = i2;
        long j = i;
        long j2 = i2 * 2;
        int iMax = (int) Math.max(8192L, Math.min(65536L, ((j + j2) - 1) / j2));
        this.f77419 = iMax;
        this.f77418 = Math.max(1, (int) (((j + ((long) iMax)) - 1) / ((long) iMax)));
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m53961(int i) {
        C12826.checkIndex(i, this.f77418);
        return (int) Math.min(this.f77421, (((long) i) + 1) * ((long) this.f77419));
    }
}
