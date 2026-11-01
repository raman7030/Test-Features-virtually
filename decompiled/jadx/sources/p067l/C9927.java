package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.۠ۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6MY */
/* JADX INFO: loaded from: classes3.dex */
public final class C9927 extends Reader {

    /* JADX INFO: renamed from: ᩸ */
    public final C5904 f27506;

    public C9927(InputStream inputStream, Charset charset, C3455 c3455) {
        this.f27506 = new C5904(C13713.m31173(inputStream, charset, c3455));
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m23229() {
        int iM13258 = this.f27506.m13258();
        if (iM13258 != 2) {
            return iM13258 != 3 ? "\n" : "\r\n";
        }
        return "\r";
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) {
        return this.f27506.read(cArr, i, i2);
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f27506.close();
    }
}
