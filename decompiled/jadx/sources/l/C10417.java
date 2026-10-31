package l;

/* JADX INFO: renamed from: l.ۤܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BF0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10417 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f31313;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f31314;

    public C10417(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("startPc < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("lineNumber < 0");
        }
        this.f31314 = i;
        this.f31313 = i2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m26258() {
        return this.f31314;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m26257() {
        return this.f31313;
    }
}
