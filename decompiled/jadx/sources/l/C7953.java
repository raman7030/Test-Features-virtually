package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.۠ۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6MY */
/* JADX INFO: loaded from: classes3.dex */
public final class C7953 extends Reader {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C3720 f24593;

    public C7953(InputStream inputStream, Charset charset, C1143 c1143) {
        this.f24593 = new C3720(C11936.m29120(inputStream, charset, c1143));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m21263() {
        int iM11311 = this.f24593.m11311();
        if (iM11311 != 2) {
            return iM11311 != 3 ? "\n" : "\r\n";
        }
        return "\r";
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) {
        return this.f24593.read(cArr, i, i2);
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f24593.close();
    }
}
