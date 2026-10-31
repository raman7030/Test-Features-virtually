package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.᩵۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1S8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19318 extends C3768 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C3545 f60742;

    public C19318(C3545 c3545, InputStream inputStream) {
        super(inputStream);
        this.f60742 = c3545;
    }

    @Override // l.C3768, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws ZipException {
        try {
            return super.read(bArr, i, i2);
        } catch (IOException e) {
            if (e instanceof EOFException) {
                return -1;
            }
            C2568.m8117(e, this.f60742);
            throw null;
        }
    }
}
