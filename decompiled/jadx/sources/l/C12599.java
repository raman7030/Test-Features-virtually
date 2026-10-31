package l;

/* JADX INFO: renamed from: l.۫ᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6RY */
/* JADX INFO: loaded from: classes3.dex */
public final class C12599 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f37993;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C5377 f37994;

    public C12599(byte[] bArr, C5377 c5377) {
        this.f37993 = bArr;
        this.f37994 = c5377;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m30864() {
        byte[] bArr = this.f37993;
        if (bArr != null) {
            return bArr;
        }
        throw new IllegalStateException("Fragment record is closed");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C5377 m30865(long j) {
        m30864();
        C5377 c5377 = this.f37994;
        if (c5377 == null) {
            return null;
        }
        return c5377.m15350(j);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f37993 = null;
        C5377 c5377 = this.f37994;
        this.f37994 = null;
        if (c5377 != null) {
            c5377.close();
        }
    }
}
