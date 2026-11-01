package p067l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.ᩴ۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4CG0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20057 extends C19360 {

    /* JADX INFO: renamed from: ᩺ */
    public static final /* synthetic */ int f60941 = 0;

    /* JADX INFO: renamed from: ۨ */
    public final C5738 f60942;

    public C20057(C5738 c5738, InputStream inputStream, long j, byte b, int i) {
        super(inputStream, j, b, i);
        this.f60942 = c5738;
    }

    @Override // p067l.C19360, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws ZipException {
        try {
            return super.read(bArr, i, i2);
        } catch (IOException e) {
            if (e instanceof EOFException) {
                return -1;
            }
            C4809.m10150(e, this.f60942);
            throw null;
        }
    }
}
