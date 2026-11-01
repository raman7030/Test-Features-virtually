package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩸ܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: H4EU */
/* JADX INFO: loaded from: classes.dex */
public final class C22986 implements InterfaceC7603 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C6892 f72283;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC7603 f72284;

    public C22986(C6892 c6892, InterfaceC7603 interfaceC7603) {
        this.f72283 = c6892;
        this.f72284 = interfaceC7603;
    }

    @Override // p067l.InterfaceC7603
    /* JADX INFO: renamed from: ֫ */
    public final void mo10979(C14268 c14268, long j) throws IOException {
        C23026.m51409(c14268.f40649, 0L, j);
        while (true) {
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            C20344 c20344 = c14268.f40648;
            while (j2 < 65536) {
                j2 += (long) (c20344.f62828 - c20344.f62831);
                if (j2 >= j) {
                    j2 = j;
                    break;
                }
                c20344 = c20344.f62830;
            }
            C6892 c6892 = this.f72283;
            c6892.m15805();
            try {
                try {
                    ((C18331) this.f72284).mo10979(c14268, j2);
                    j -= j2;
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
    }

    @Override // p067l.InterfaceC7603, java.io.Flushable
    public final void flush() throws IOException {
        C6892 c6892 = this.f72283;
        c6892.m15805();
        try {
            try {
                ((C18331) this.f72284).flush();
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

    @Override // p067l.InterfaceC7603, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C6892 c6892 = this.f72283;
        c6892.m15805();
        try {
            try {
                ((C18331) this.f72284).close();
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

    @Override // p067l.InterfaceC7603
    /* JADX INFO: renamed from: ۢ */
    public final C16989 mo10980() {
        return this.f72283;
    }

    public final String toString() {
        return "AsyncTimeout.sink(" + this.f72284 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
