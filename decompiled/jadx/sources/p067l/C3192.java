package p067l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.֨ۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6VA */
/* JADX INFO: loaded from: classes2.dex */
public final class C3192 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f6188;

    /* JADX INFO: renamed from: ۧ */
    public C7216 f6189;

    /* JADX INFO: renamed from: ܽ */
    public Thread f6190 = Thread.currentThread();

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C7216 m5502(Closeable closeable) {
        C7216 c7216;
        c7216 = new C7216(closeable);
        if (this.f6188) {
            c7216.close();
            throw new InterruptedIOException("Text search canceled.");
        }
        this.f6189 = c7216;
        return c7216;
    }

    /* JADX INFO: renamed from: ܽ */
    public final synchronized boolean m5505() {
        return this.f6188;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final synchronized void m5506() {
        this.f6189 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5503() {
        C7216 c7216;
        synchronized (this) {
            this.f6188 = true;
            Thread thread = this.f6190;
            if (thread != null) {
                thread.interrupt();
            }
            c7216 = this.f6189;
            this.f6189 = null;
        }
        if (c7216 == null) {
            return;
        }
        try {
            c7216.close();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m5504() {
        C7216 c7216;
        synchronized (this) {
            this.f6190 = null;
            c7216 = this.f6189;
            this.f6189 = null;
        }
        if (c7216 == null) {
            return;
        }
        try {
            c7216.close();
        } catch (IOException unused) {
        }
    }
}
