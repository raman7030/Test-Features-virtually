package l;

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
public abstract class AbstractC0076 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f992;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f993;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC22094 f994;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C15346 f995;

    public AbstractC0076(C15346 c15346, C4332 c4332) {
        this.f994 = c15346.m36379().m52161().m47645();
        this.f995 = c15346;
        this.f993 = c15346.m36383();
        this.f992 = c4332.m13023();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC22094 m1030() {
        return this.f994;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16614 m1029(C16614 c16614, EnumSet enumSet) throws Throwable {
        Throwable interruptedIOException;
        try {
            try {
                C16614 c16615 = (C16614) this.f995.m36377(c16614, false).get(this.f992, TimeUnit.MILLISECONDS);
                C23670 c23670 = (C23670) c16615.mo3028();
                if (enumSet.contains(EnumC7462.m19988(c23670.m52202()))) {
                    return c16615;
                }
                throw new C18422(c23670, "expected=" + enumSet);
            } catch (InterruptedException e) {
                InterruptedIOException interruptedIOException2 = new InterruptedIOException();
                interruptedIOException2.initCause(e);
                throw interruptedIOException2;
            } catch (ExecutionException e2) {
                throw new IOException(e2);
            } catch (TimeoutException e3) {
                if (Build.VERSION.SDK_INT >= 26) {
                    interruptedIOException = C19128.m44158();
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

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m1031() {
        return this.f993;
    }
}
