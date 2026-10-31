package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: l.֨᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36TA */
/* JADX INFO: loaded from: classes2.dex */
public final class C1352 extends Reader {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C11936 f4904;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f4905;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C5377 f4906;

    /* JADX WARN: Code duplicated, block: B:41:0x004d A[DONT_GENERATE] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1352 m4716(InputStream inputStream, C1143 c1143) throws Throwable {
        Throwable e;
        C5377 c5377M3921;
        C11936 c11936 = null;
        boolean z = false;
        try {
            c5377M3921 = c1143.m3921(49152L);
            try {
                z = true;
                C11936 c11936M29122 = C11936.m29122(new GZIPInputStream(inputStream, 1024), c1143);
                try {
                    return new C1352(c11936M29122, c5377M3921);
                } catch (IOException | Error | RuntimeException e2) {
                    e = e2;
                    c11936 = c11936M29122;
                    try {
                        if (c11936 != null) {
                            c11936.close();
                        } else {
                            if (!z) {
                                inputStream.close();
                            } else if (c5377M3921 != null) {
                            }
                            throw e;
                        }
                        if (c5377M3921 != null) {
                        }
                    } catch (IOException e3) {
                        e.addSuppressed(e3);
                    } finally {
                        if (c5377M3921 != null) {
                            c5377M3921.close();
                        }
                    }
                    throw e;
                }
            } catch (IOException e4) {
                e = e4;
            } catch (Error e5) {
                e = e5;
            } catch (RuntimeException e6) {
                e = e6;
            }
        } catch (IOException | Error | RuntimeException e7) {
            e = e7;
            c5377M3921 = null;
        }
    }

    public C1352(C11936 c11936, C5377 c5377) {
        this.f4904 = c11936;
        this.f4906 = c5377;
    }

    @Override // java.io.Reader
    public final int read() {
        return this.f4904.read();
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) {
        return this.f4904.read(cArr, i, i2);
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C5377 c5377 = this.f4906;
        if (this.f4905) {
            return;
        }
        this.f4905 = true;
        try {
            this.f4904.close();
        } finally {
            c5377.close();
        }
    }
}
