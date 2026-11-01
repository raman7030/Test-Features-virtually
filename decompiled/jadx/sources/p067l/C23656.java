package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩹ܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: H4EU */
/* JADX INFO: loaded from: classes.dex */
public final class C23656 implements InterfaceC3579 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C6892 f75280;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC3579 f75281;

    public C23656(C6892 c6892, InterfaceC3579 interfaceC3579) {
        this.f75280 = c6892;
        this.f75281 = interfaceC3579;
    }

    @Override // p067l.InterfaceC3579
    /* JADX INFO: renamed from: ۧ */
    public final long mo6580(C14268 c14268, long j) throws IOException {
        C6892 c6892 = this.f75280;
        c6892.m15805();
        try {
            try {
                long jMo6580 = ((C19673) this.f75281).mo6580(c14268, 8192L);
                c6892.m15802(true);
                return jMo6580;
            } catch (IOException e) {
                if (!c6892.m15803()) {
                    throw e;
                }
                throw c6892.mo15801(e);
            }
        } catch (Throwable th) {
            c6892.m15802(false);
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C6892 c6892 = this.f75280;
        try {
            try {
                ((C19673) this.f75281).close();
                c6892.m15802(true);
            } catch (IOException e) {
                if (!c6892.m15803()) {
                    throw e;
                }
                throw c6892.mo15801(e);
            }
        } catch (Throwable th) {
            c6892.m15802(false);
            throw th;
        }
    }

    @Override // p067l.InterfaceC3579
    /* JADX INFO: renamed from: ۢ */
    public final C16989 mo6579() {
        return this.f75280;
    }

    public final String toString() {
        return "AsyncTimeout.source(" + this.f75281 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
