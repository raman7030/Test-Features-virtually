package p067l;

/* JADX INFO: renamed from: l.۟֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8OV */
/* JADX INFO: loaded from: classes3.dex */
public final class C9133 extends AbstractC25127 {
    public C9133(C11157 c11157, long j, long j2) {
        super(new C13058(), new C15167(c11157), j, j + 1, 0L, j2, 188L, 1000);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m21076(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
