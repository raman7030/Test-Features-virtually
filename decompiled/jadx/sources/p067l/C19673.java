package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ᩳᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J4DP */
/* JADX INFO: loaded from: classes5.dex */
public final class C19673 implements InterfaceC3579 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ InputStream f59812;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C16989 f59813;

    public C19673(C16989 c16989, InputStream inputStream) {
        this.f59813 = c16989;
        this.f59812 = inputStream;
    }

    @Override // p067l.InterfaceC3579
    /* JADX INFO: renamed from: ۧ */
    public final long mo6580(C14268 c14268, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException(C17588.m40051(j, "byteCount < 0: "));
        }
        if (j == 0) {
            return 0L;
        }
        try {
            this.f59813.mo22309();
            C20344 c20344M32779 = c14268.m32779(1);
            int i = this.f59812.read(c20344M32779.f62827, c20344M32779.f62828, (int) Math.min(j, 8192 - c20344M32779.f62828));
            if (i == -1) {
                return -1L;
            }
            c20344M32779.f62828 += i;
            long j2 = i;
            c14268.f40649 += j2;
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
        this.f59812.close();
    }

    @Override // p067l.InterfaceC3579
    /* JADX INFO: renamed from: ۢ */
    public final C16989 mo6579() {
        return this.f59813;
    }

    public final String toString() {
        return "source(" + this.f59812 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
