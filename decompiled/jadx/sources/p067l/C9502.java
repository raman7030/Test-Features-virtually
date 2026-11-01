package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.۟ܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9P6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9502 extends C11352 {

    /* JADX INFO: renamed from: ۫ */
    public final C5738 f26009;

    public C9502(C5738 c5738, InputStream inputStream) {
        super(inputStream);
        this.f26009 = c5738;
    }

    @Override // p067l.C11352, java.io.InputStream
    public final int read() throws ZipException {
        try {
            return super.read();
        } catch (IOException e) {
            C4809.m10150(e, this.f26009);
            throw null;
        }
    }

    @Override // p067l.C11352, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws ZipException {
        try {
            return super.read(bArr, i, i2);
        } catch (IOException e) {
            C4809.m10150(e, this.f26009);
            throw null;
        }
    }
}
