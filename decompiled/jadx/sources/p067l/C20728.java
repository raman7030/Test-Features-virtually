package p067l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.᩵۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1S8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20728 extends C5949 {

    /* JADX INFO: renamed from: ۛ */
    public final C5738 f63972;

    public C20728(C5738 c5738, InputStream inputStream) {
        super(inputStream);
        this.f63972 = c5738;
    }

    @Override // p067l.C5949, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws ZipException {
        try {
            return super.read(bArr, i, i2);
        } catch (IOException e) {
            if (e instanceof EOFException) {
                return -1;
            }
            C4809.m10150(e, this.f63972);
            throw null;
        }
    }
}
