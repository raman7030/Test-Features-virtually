package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: l.֨᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36TA */
/* JADX INFO: loaded from: classes2.dex */
public final class C3654 extends Reader {

    /* JADX INFO: renamed from: ᩶ */
    public final C13713 f7674;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f7675;

    /* JADX INFO: renamed from: ᩹ */
    public final C7479 f7676;

    /* JADX WARN: Code duplicated, block: B:41:0x004d A[DONT_GENERATE] */
    /* JADX INFO: renamed from: ֫ */
    public static C3654 m6948(InputStream inputStream, C3455 c3455) throws Throwable {
        Throwable e;
        C7479 c7479M6162;
        C13713 c13713 = null;
        boolean z = false;
        try {
            c7479M6162 = c3455.m6162(49152L);
            try {
                z = true;
                C13713 c13713M31175 = C13713.m31175(new GZIPInputStream(inputStream, 1024), c3455);
                try {
                    return new C3654(c13713M31175, c7479M6162);
                } catch (IOException | Error | RuntimeException e2) {
                    e = e2;
                    c13713 = c13713M31175;
                    try {
                        if (c13713 != null) {
                            c13713.close();
                        } else {
                            if (!z) {
                                inputStream.close();
                            } else if (c7479M6162 != null) {
                            }
                            throw e;
                        }
                        if (c7479M6162 != null) {
                        }
                    } catch (IOException e3) {
                        e.addSuppressed(e3);
                    } finally {
                        if (c7479M6162 != null) {
                            c7479M6162.close();
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
            c7479M6162 = null;
        }
    }

    public C3654(C13713 c13713, C7479 c7479) {
        this.f7674 = c13713;
        this.f7676 = c7479;
    }

    @Override // java.io.Reader
    public final int read() {
        return this.f7674.read();
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) {
        return this.f7674.read(cArr, i, i2);
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C7479 c7479 = this.f7676;
        if (this.f7675) {
            return;
        }
        this.f7675 = true;
        try {
            this.f7674.close();
        } finally {
            c7479.close();
        }
    }
}
