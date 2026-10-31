package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.۟ܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9P6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7506 extends C9453 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C3545 f23097;

    public C7506(C3545 c3545, InputStream inputStream) {
        super(inputStream);
        this.f23097 = c3545;
    }

    @Override // l.C9453, java.io.InputStream
    public final int read() throws ZipException {
        try {
            return super.read();
        } catch (IOException e) {
            C2568.m8117(e, this.f23097);
            throw null;
        }
    }

    @Override // l.C9453, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws ZipException {
        try {
            return super.read(bArr, i, i2);
        } catch (IOException e) {
            C2568.m8117(e, this.f23097);
            throw null;
        }
    }
}
