package l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.֨ۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6VA */
/* JADX INFO: loaded from: classes2.dex */
public final class C0867 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f3415;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C5101 f3416;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Thread f3417 = Thread.currentThread();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C5101 m3188(Closeable closeable) {
        C5101 c5101;
        c5101 = new C5101(closeable);
        if (this.f3415) {
            c5101.close();
            throw new InterruptedIOException("Text search canceled.");
        }
        this.f3416 = c5101;
        return c5101;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m3191() {
        return this.f3415;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized void m3192() {
        this.f3416 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3189() {
        C5101 c5101;
        synchronized (this) {
            this.f3415 = true;
            Thread thread = this.f3417;
            if (thread != null) {
                thread.interrupt();
            }
            c5101 = this.f3416;
            this.f3416 = null;
        }
        if (c5101 == null) {
            return;
        }
        try {
            c5101.close();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m3190() {
        C5101 c5101;
        synchronized (this) {
            this.f3417 = null;
            c5101 = this.f3416;
            this.f3416 = null;
        }
        if (c5101 == null) {
            return;
        }
        try {
            c5101.close();
        } catch (IOException unused) {
        }
    }
}
