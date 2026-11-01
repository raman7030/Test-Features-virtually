package p067l;

/* JADX INFO: renamed from: l.ܺܺܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6VC */
/* JADX INFO: loaded from: classes4.dex */
public final class C17614 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f52628;

    /* JADX INFO: renamed from: ۧ */
    public final long f52629;

    /* JADX INFO: renamed from: ܳ */
    public boolean f52630;

    /* JADX INFO: renamed from: ܽ */
    public int f52631;

    /* JADX INFO: renamed from: ܿ */
    public boolean f52632;

    /* JADX INFO: renamed from: ᩳ */
    public final int[] f52633;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f52634;

    public C17614(int[] iArr, long j) {
        this.f52633 = iArr;
        this.f52629 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40107(C13929 c13929) {
        int iM31676 = c13929.m31676();
        if ((iM31676 & 1) != 0) {
            if (!this.f52628) {
                this.f52630 = true;
            } else if (!this.f52634) {
                this.f52632 = true;
            }
        }
        if ((iM31676 & 2) != 0 && !this.f52634) {
            this.f52632 = true;
        }
        if ((iM31676 & 4) != 0) {
            this.f52634 = true;
        }
        this.f52631 = (int) c13929.m31674();
        this.f52628 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m40108(long j) {
        boolean z = this.f52630;
        long j2 = this.f52629;
        if (!z || ((int) (j2 >> 32)) == ((int) (j >> 32))) {
            return !this.f52632 || ((int) j2) == ((int) j);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m40109(long j) {
        long j2 = this.f52634 ? this.f52631 : (int) j;
        return (j2 & 4294967295L) | (j2 << 32);
    }
}
