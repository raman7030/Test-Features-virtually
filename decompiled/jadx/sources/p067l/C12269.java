package p067l;

/* JADX INFO: renamed from: l.ۤܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BF0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12269 {

    /* JADX INFO: renamed from: ֫ */
    public final int f34278;

    /* JADX INFO: renamed from: ۧ */
    public final int f34279;

    public C12269(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("startPc < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("lineNumber < 0");
        }
        this.f34279 = i;
        this.f34278 = i2;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m28287() {
        return this.f34279;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m28286() {
        return this.f34278;
    }
}
