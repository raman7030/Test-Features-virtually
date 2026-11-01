package p067l;

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
public final class C13173 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f37018;

    /* JADX INFO: renamed from: ۧ */
    public C19404 f37019;

    /* JADX INFO: renamed from: ܽ */
    public final Set f37020 = Collections.newSetFromMap(new IdentityHashMap());

    /* JADX INFO: renamed from: ֫ */
    public final void m30171(C19404 c19404) {
        synchronized (this) {
            if (!this.f37018) {
                this.f37019 = c19404;
            } else {
                c19404.f57950.m40967();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m30173(C19404 c19404) {
        synchronized (this) {
            if (this.f37019 == c19404) {
                this.f37019 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11832 m30169(Closeable closeable) throws InterruptedIOException {
        C11832 c11832 = new C11832(this, closeable);
        synchronized (this) {
            if (!this.f37018) {
                this.f37020.add(c11832);
                return c11832;
            }
            InterruptedIOException interruptedIOException = new InterruptedIOException("HLS thumbnail generation was canceled");
            try {
                c11832.close();
                throw interruptedIOException;
            } catch (IOException e) {
                interruptedIOException.addSuppressed(e);
                throw interruptedIOException;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m30172() throws InterruptedIOException {
        synchronized (this) {
            if (this.f37018 || Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException("HLS thumbnail generation was canceled");
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30170() {
        synchronized (this) {
            if (this.f37018) {
                return;
            }
            this.f37018 = true;
            C19404 c19404 = this.f37019;
            ArrayList arrayList = new ArrayList(this.f37020);
            if (c19404 != null) {
                c19404.f57950.m40967();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C2700.m4192((C11832) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m30168(C13173 c13173, C11832 c11832) {
        synchronized (c13173) {
            c13173.f37020.remove(c11832);
        }
    }
}
