package p067l;

/* JADX INFO: renamed from: l.ۤۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6MB */
/* JADX INFO: loaded from: classes3.dex */
public final class C11970 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩶ */
    public final int f33369;

    /* JADX INFO: renamed from: ᩸ */
    public final byte[] f33370;

    /* JADX INFO: renamed from: ᩹ */
    public final C23369 f33371;

    public C11970(byte[] bArr, int i, C23369 c23369) {
        this.f33370 = bArr;
        this.f33369 = i;
        this.f33371 = c23369;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f33371.close();
    }
}
