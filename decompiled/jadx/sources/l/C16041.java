package l;

/* JADX INFO: renamed from: l.ܺܺܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6VC */
/* JADX INFO: loaded from: classes4.dex */
public final class C16041 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f49464;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f49465;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f49466;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f49467;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f49468;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f49469;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f49470;

    public C16041(int[] iArr, long j) {
        this.f49469 = iArr;
        this.f49465 = j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37920(C12164 c12164) {
        int iM29611 = c12164.m29611();
        if ((iM29611 & 1) != 0) {
            if (!this.f49464) {
                this.f49466 = true;
            } else if (!this.f49470) {
                this.f49468 = true;
            }
        }
        if ((iM29611 & 2) != 0 && !this.f49470) {
            this.f49468 = true;
        }
        if ((iM29611 & 4) != 0) {
            this.f49470 = true;
        }
        this.f49467 = (int) c12164.m29609();
        this.f49464 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m37921(long j) {
        boolean z = this.f49466;
        long j2 = this.f49465;
        if (!z || ((int) (j2 >> 32)) == ((int) (j >> 32))) {
            return !this.f49468 || ((int) j2) == ((int) j);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m37922(long j) {
        long j2 = this.f49470 ? this.f49467 : (int) j;
        return (j2 & 4294967295L) | (j2 << 32);
    }
}
