package l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۤۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T4F2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10241 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f30866;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C3185 f30867;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C12357 f30868;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f30869 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22235 f30870;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f30871;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public EnumC13499 f30872;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f30873;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f30874;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13062 f30875;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C12357 f30876;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final synchronized C10338 m25938() {
        this.f30876.m13925();
        while (this.f30873.isEmpty() && this.f30872 == null) {
            try {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            } catch (Throwable th) {
                this.f30876.m29977();
                throw th;
            }
        }
        this.f30876.m29977();
        if (this.f30873.isEmpty()) {
            throw new C11111(this.f30872);
        }
        return (C10338) this.f30873.removeFirst();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m25941() {
        if (this.f30872 != null) {
            return false;
        }
        C13062 c13062 = this.f30875;
        if (c13062.f39089 || c13062.f39088) {
            C3185 c3185 = this.f30867;
            if ((c3185.f10049 || c3185.f10048) && this.f30874) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m25943(EnumC13499 enumC13499) {
        if (this.f30872 == null) {
            this.f30872 = enumC13499;
            notifyAll();
        }
    }

    public C10241(int i, C22235 c22235, boolean z, boolean z2, C10338 c10338) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f30873 = arrayDeque;
        this.f30876 = new C12357(this);
        this.f30868 = new C12357(this);
        this.f30872 = null;
        if (c22235 == null) {
            throw new NullPointerException("connection == null");
        }
        this.f30871 = i;
        this.f30870 = c22235;
        this.f30866 = c22235.f72149.m6393();
        C13062 c13062 = new C13062(this, c22235.f72140.m6393());
        this.f30875 = c13062;
        C3185 c3185 = new C3185(this);
        this.f30867 = c3185;
        c13062.f39089 = z2;
        c3185.f10049 = z;
        if (c10338 != null) {
            arrayDeque.add(c10338);
        }
        if (m25944() && c10338 != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!m25944() && c10338 == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m25944() {
        return this.f30870.f72158 == ((this.f30871 & 1) == 1);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1274 m25945() {
        return this.f30875;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5508 m25942() {
        synchronized (this) {
            if (!this.f30874 && !m25944()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f30867;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25937(EnumC13499 enumC13499) {
        if (m25933(enumC13499)) {
            this.f30870.f72147.m16815(this.f30871, enumC13499);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m25940(EnumC13499 enumC13499) {
        if (m25933(enumC13499)) {
            this.f30870.m49935(this.f30871, enumC13499);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m25933(EnumC13499 enumC13499) {
        synchronized (this) {
            if (this.f30872 != null) {
                return false;
            }
            if (this.f30875.f39089 && this.f30867.f10049) {
                return false;
            }
            this.f30872 = enumC13499;
            notifyAll();
            this.f30870.m49934(this.f30871);
            return true;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25935(ArrayList arrayList) {
        boolean zM25941;
        synchronized (this) {
            this.f30874 = true;
            this.f30873.add(C20032.m46178(arrayList));
            zM25941 = m25941();
            notifyAll();
        }
        if (zM25941) {
            return;
        }
        this.f30870.m49934(this.f30871);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25936(InterfaceC6171 interfaceC6171, int i) {
        this.f30875.m31631(interfaceC6171, i);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m25946() {
        boolean zM25941;
        synchronized (this) {
            this.f30875.f39089 = true;
            zM25941 = m25941();
            notifyAll();
        }
        if (zM25941) {
            return;
        }
        this.f30870.m49934(this.f30871);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0018  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25934() {
        boolean z;
        boolean zM25941;
        synchronized (this) {
            C13062 c13062 = this.f30875;
            if (c13062.f39089 || !c13062.f39088) {
                z = false;
            } else {
                C3185 c3185 = this.f30867;
                if (c3185.f10049 || c3185.f10048) {
                    z = true;
                } else {
                    z = false;
                }
            }
            zM25941 = m25941();
        }
        if (z) {
            m25937(EnumC13499.CANCEL);
        } else {
            if (zM25941) {
                return;
            }
            this.f30870.m49934(this.f30871);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m25939() throws IOException {
        C3185 c3185 = this.f30867;
        if (c3185.f10048) {
            throw new IOException("stream closed");
        }
        if (c3185.f10049) {
            throw new IOException("stream finished");
        }
        if (this.f30872 != null) {
            throw new C11111(this.f30872);
        }
    }
}
