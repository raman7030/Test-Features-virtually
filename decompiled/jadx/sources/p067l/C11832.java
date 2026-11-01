package p067l;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۤ֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes3.dex */
public final class C11832 implements Closeable {

    /* JADX INFO: renamed from: ۗ */
    public final Closeable f33025;

    /* JADX INFO: renamed from: ۙ */
    public final C13173 f33026;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f33027;

    /* JADX INFO: renamed from: ᩸ */
    public Throwable f33028;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f33029;

    public C11832(C13173 c13173, Closeable closeable) {
        this.f33026 = c13173;
        this.f33025 = closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this) {
            if (this.f33029) {
                m27128();
                return;
            }
            if (this.f33027) {
                boolean z = false;
                while (!this.f33029) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
                m27128();
                return;
            }
            this.f33027 = true;
            try {
                this.f33025.close();
                synchronized (this) {
                    this.f33028 = null;
                    this.f33029 = true;
                    notifyAll();
                }
            } catch (Throwable th) {
                synchronized (this) {
                    this.f33028 = th;
                    this.f33029 = true;
                    notifyAll();
                }
            }
            C13173.m30168(this.f33026, this);
            m27128();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m27128() throws IOException {
        Throwable th = this.f33028;
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
