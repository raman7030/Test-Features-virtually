package l;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: l.۟ᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6S3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7660 implements Closeable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f23645;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2037 f23646;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Closeable f23647;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f23648;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final FutureC3575 f23649 = new FutureC3575();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m20460() {
        if (!this.f23645 && !this.f23648) {
            this.f23645 = true;
            try {
                C1802.f6209.execute(new Runnable() { // from class: l.ܰᩴᩳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C7660 c7660 = this.f42375;
                        c7660.getClass();
                        try {
                            c7660.close();
                        } catch (IOException unused) {
                        }
                    }
                });
            } catch (RuntimeException unused) {
                this.f23645 = false;
            }
        }
    }

    public C7660(C2037 c2037, Closeable closeable) {
        this.f23646 = c2037;
        this.f23647 = closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean z;
        synchronized (this) {
            z = this.f23648;
            this.f23648 = true;
        }
        if (!z) {
            try {
                this.f23647.close();
                this.f23649.m10912((Object) null);
            } catch (Throwable th) {
                try {
                    this.f23649.m10914(th);
                } catch (Throwable th2) {
                    C2037.m6625(this.f23646, this);
                    throw th2;
                }
            }
            C2037.m6625(this.f23646, this);
        }
        try {
            this.f23649.m10930();
        } catch (C13452 e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (!(cause instanceof Error)) {
                throw new IOException("Input close failed", cause);
            }
            throw ((Error) cause);
        }
    }
}
