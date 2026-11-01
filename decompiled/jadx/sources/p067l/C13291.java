package p067l;

import java.io.InterruptedIOException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۨۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 574A */
/* JADX INFO: loaded from: classes3.dex */
public final class C13291 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸ */
    public boolean f37340;

    /* JADX INFO: renamed from: ᩹ */
    public final HashMap f37341 = new HashMap();

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        this.f37340 = true;
        notifyAll();
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C11950 m30365(String str) {
        C13961 c13961;
        if (this.f37340) {
            throw new InterruptedIOException("HLS playlist cache coordinator was closed");
        }
        c13961 = (C13961) C15525.computeIfAbsent(this.f37341, str, new C14631());
        c13961.f39425++;
        return new C11950(this, c13961);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m30363(C13291 c13291, C13961 c13961) {
        c13291.getClass();
        if (c13961.f39423 == null && c13961.f39424 == 0 && c13961.f39425 == 0) {
            C15525.remove(c13291.f37341, c13961.f39422, c13961);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterruptedIOException m30362(String str, InterruptedException interruptedException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException(str);
        if (interruptedException != null) {
            interruptedIOException.initCause(interruptedException);
        }
        return interruptedIOException;
    }
}
