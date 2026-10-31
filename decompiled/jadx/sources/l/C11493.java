package l;

import java.io.InterruptedIOException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۨۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 574A */
/* JADX INFO: loaded from: classes3.dex */
public final class C11493 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f34343;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashMap f34344 = new HashMap();

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        this.f34343 = true;
        notifyAll();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C10082 m28321(String str) {
        C12198 c12198;
        if (this.f34343) {
            throw new InterruptedIOException("HLS playlist cache coordinator was closed");
        }
        c12198 = (C12198) C13843.computeIfAbsent(this.f34344, str, new C12903());
        c12198.f36410++;
        return new C10082(this, c12198);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28319(C11493 c11493, C12198 c12198) {
        c11493.getClass();
        if (c12198.f36408 == null && c12198.f36409 == 0 && c12198.f36410 == 0) {
            C13843.remove(c11493.f34344, c12198.f36407, c12198);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterruptedIOException m28318(String str, InterruptedException interruptedException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException(str);
        if (interruptedException != null) {
            interruptedIOException.initCause(interruptedException);
        }
        return interruptedIOException;
    }
}
