package p067l;

import android.os.Build;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.EnumSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.֡֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 289S */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2440 {

    /* JADX INFO: renamed from: ۙ */
    public final long f3766;

    /* JADX INFO: renamed from: ᩶ */
    public final long f3767;

    /* JADX INFO: renamed from: ᩸ */
    public final EnumC23366 f3768;

    /* JADX INFO: renamed from: ᩹ */
    public final C16953 f3769;

    public AbstractC2440(C16953 c16953, C6485 c6485) {
        this.f3768 = c16953.m38537().m54564().m49973();
        this.f3769 = c16953;
        this.f3767 = c16953.m38541();
        this.f3766 = c6485.m14887();
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC23366 m3426() {
        return this.f3768;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18158 m3425(C18158 c18158, EnumSet enumSet) throws Throwable {
        Throwable interruptedIOException;
        try {
            try {
                C18158 c18159 = (C18158) this.f3769.m38535(c18158, false).get(this.f3766, TimeUnit.MILLISECONDS);
                C24864 c24864 = (C24864) c18159.mo5341();
                if (enumSet.contains(EnumC9460.m21963(c24864.m54605()))) {
                    return c18159;
                }
                throw new C19876(c24864, "expected=" + enumSet);
            } catch (InterruptedException e) {
                InterruptedIOException interruptedIOException2 = new InterruptedIOException();
                interruptedIOException2.initCause(e);
                throw interruptedIOException2;
            } catch (ExecutionException e2) {
                throw new IOException(e2);
            } catch (TimeoutException e3) {
                if (Build.VERSION.SDK_INT >= 26) {
                    interruptedIOException = C20547.m46452();
                } else {
                    interruptedIOException = new InterruptedIOException("InterruptedByTimeout");
                }
                interruptedIOException.initCause(e3);
                throw interruptedIOException;
            }
        } catch (IOException e4) {
            throw e4;
        } catch (Exception e5) {
            throw new IOException(e5);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m3427() {
        return this.f3767;
    }
}
