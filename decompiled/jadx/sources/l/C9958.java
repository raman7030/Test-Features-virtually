package l;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۤ֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes3.dex */
public final class C9958 implements Closeable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Closeable f30068;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11369 f30069;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f30070;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Throwable f30071;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f30072;

    public C9958(C11369 c11369, Closeable closeable) {
        this.f30069 = c11369;
        this.f30068 = closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this) {
            if (this.f30072) {
                m25111();
                return;
            }
            if (this.f30070) {
                boolean z = false;
                while (!this.f30072) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
                m25111();
                return;
            }
            this.f30070 = true;
            try {
                this.f30068.close();
                synchronized (this) {
                    this.f30071 = null;
                    this.f30072 = true;
                    notifyAll();
                }
            } catch (Throwable th) {
                synchronized (this) {
                    this.f30071 = th;
                    this.f30072 = true;
                    notifyAll();
                }
            }
            C11369.m28124(this.f30069, this);
            m25111();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m25111() throws IOException {
        Throwable th = this.f30071;
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        if (th != null) {
            throw new IOException("Failed to close HLS thumbnail resource", th);
        }
    }
}
