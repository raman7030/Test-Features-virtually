package l;

/* JADX INFO: renamed from: l.ۤۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6MB */
/* JADX INFO: loaded from: classes3.dex */
public final class C10103 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f30410;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] f30411;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C22097 f30412;

    public C10103(byte[] bArr, int i, C22097 c22097) {
        this.f30411 = bArr;
        this.f30410 = i;
        this.f30412 = c22097;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f30412.close();
    }
}
