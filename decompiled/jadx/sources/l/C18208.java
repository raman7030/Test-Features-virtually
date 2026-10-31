package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ᩳᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J4DP */
/* JADX INFO: loaded from: classes5.dex */
public final class C18208 implements InterfaceC1274 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InputStream f56599;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15384 f56600;

    public C18208(C15384 c15384, InputStream inputStream) {
        this.f56600 = c15384;
        this.f56599 = inputStream;
    }

    @Override // l.InterfaceC1274
    /* JADX INFO: renamed from: ۧ */
    public final long mo4334(C12521 c12521, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException(C16014.m37865(j, "byteCount < 0: "));
        }
        if (j == 0) {
            return 0L;
        }
        try {
            this.f56600.mo20332();
            C18914 c18914M30705 = c12521.m30705(1);
            int i = this.f56599.read(c18914M30705.f59596, c18914M30705.f59597, (int) Math.min(j, 8192 - c18914M30705.f59597));
            if (i == -1) {
                return -1L;
            }
            c18914M30705.f59597 += i;
            long j2 = i;
            c12521.f37625 += j2;
            return j2;
        } catch (AssertionError e) {
            if (e.getCause() == null || e.getMessage() == null || !e.getMessage().contains("getsockname failed")) {
                throw e;
            }
            throw new IOException(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f56599.close();
    }

    @Override // l.InterfaceC1274
    /* JADX INFO: renamed from: ۢ */
    public final C15384 mo4333() {
        return this.f56600;
    }

    public final String toString() {
        return "source(" + this.f56599 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
