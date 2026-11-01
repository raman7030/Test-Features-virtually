package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.ۖ۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8BB */
/* JADX INFO: loaded from: classes3.dex */
public final class C4634 extends C20855 {

    /* JADX INFO: renamed from: ֫֫ */
    public final C5738 f10387;

    public C4634(C5738 c5738, InputStream inputStream) {
        super(inputStream);
        this.f10387 = c5738;
    }

    @Override // p067l.C20855, java.io.FilterInputStream, java.io.InputStream
    public final int read() throws ZipException {
        try {
            return super.read();
        } catch (IOException e) {
            C4809.m10150(e, this.f10387);
            throw null;
        }
    }

    @Override // p067l.C20855, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws ZipException {
        try {
            return super.read(bArr, i, i2);
        } catch (IOException e) {
            C4809.m10150(e, this.f10387);
            throw null;
        }
    }

    @Override // p067l.C20855, java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws ZipException {
        try {
            return super.skip(j);
        } catch (IOException e) {
            C4809.m10150(e, this.f10387);
            throw null;
        }
    }
}
