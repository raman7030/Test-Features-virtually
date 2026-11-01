package p067l;

/* JADX INFO: renamed from: l.۫ᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6RY */
/* JADX INFO: loaded from: classes3.dex */
public final class C14343 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸ */
    public byte[] f41020;

    /* JADX INFO: renamed from: ᩹ */
    public C7479 f41021;

    public C14343(byte[] bArr, C7479 c7479) {
        this.f41020 = bArr;
        this.f41021 = c7479;
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m32941() {
        byte[] bArr = this.f41020;
        if (bArr != null) {
            return bArr;
        }
        throw new IllegalStateException("Fragment record is closed");
    }

    /* JADX INFO: renamed from: ۧ */
    public final C7479 m32942(long j) {
        m32941();
        C7479 c7479 = this.f41021;
        if (c7479 == null) {
            return null;
        }
        return c7479.m17259(j);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f41020 = null;
        C7479 c7479 = this.f41021;
        this.f41021 = null;
        if (c7479 != null) {
            c7479.close();
        }
    }
}
