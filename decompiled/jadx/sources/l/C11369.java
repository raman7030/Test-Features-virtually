package l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۨ֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes3.dex */
public final class C11369 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f34021;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C17925 f34022;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Set f34023 = Collections.newSetFromMap(new IdentityHashMap());

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28127(C17925 c17925) {
        synchronized (this) {
            if (!this.f34021) {
                this.f34022 = c17925;
            } else {
                c17925.f54753.m38742();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28129(C17925 c17925) {
        synchronized (this) {
            if (this.f34022 == c17925) {
                this.f34022 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9958 m28125(Closeable closeable) throws InterruptedIOException {
        C9958 c9958 = new C9958(this, closeable);
        synchronized (this) {
            if (!this.f34021) {
                this.f34023.add(c9958);
                return c9958;
            }
            InterruptedIOException interruptedIOException = new InterruptedIOException("HLS thumbnail generation was canceled");
            try {
                c9958.close();
                throw interruptedIOException;
            } catch (IOException e) {
                interruptedIOException.addSuppressed(e);
                throw interruptedIOException;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28128() throws InterruptedIOException {
        synchronized (this) {
            if (this.f34021 || Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException("HLS thumbnail generation was canceled");
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28126() {
        synchronized (this) {
            if (this.f34021) {
                return;
            }
            this.f34021 = true;
            C17925 c17925 = this.f34022;
            ArrayList arrayList = new ArrayList(this.f34023);
            if (c17925 != null) {
                c17925.f54753.m38742();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0349.m1793((C9958) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28124(C11369 c11369, C9958 c9958) {
        synchronized (c11369) {
            c11369.f34023.remove(c9958);
        }
    }
}
