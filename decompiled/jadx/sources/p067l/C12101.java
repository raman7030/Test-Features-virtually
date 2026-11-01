package p067l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۤۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T4F2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12101 {

    /* JADX INFO: renamed from: ֫ */
    public long f33827;

    /* JADX INFO: renamed from: ۜ */
    public final C5395 f33828;

    /* JADX INFO: renamed from: ۡ */
    public final C14112 f33829;

    /* JADX INFO: renamed from: ۢ */
    public long f33830 = 0;

    /* JADX INFO: renamed from: ۧ */
    public final C23500 f33831;

    /* JADX INFO: renamed from: ܳ */
    public final int f33832;

    /* JADX INFO: renamed from: ܽ */
    public EnumC15197 f33833;

    /* JADX INFO: renamed from: ܿ */
    public final ArrayDeque f33834;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f33835;

    /* JADX INFO: renamed from: ᩷ */
    public final C14782 f33836;

    /* JADX INFO: renamed from: ᩻ */
    public final C14112 f33837;

    /* JADX INFO: renamed from: ۜ */
    public final synchronized C12194 m27960() {
        this.f33837.m15805();
        while (this.f33834.isEmpty() && this.f33833 == null) {
            try {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            } catch (Throwable th) {
                this.f33837.m32038();
                throw th;
            }
        }
        this.f33837.m32038();
        if (this.f33834.isEmpty()) {
            throw new C12928(this.f33833);
        }
        return (C12194) this.f33834.removeFirst();
    }

    /* JADX INFO: renamed from: ܳ */
    public final synchronized boolean m27963() {
        if (this.f33833 != null) {
            return false;
        }
        C14782 c14782 = this.f33836;
        if (c14782.f42137 || c14782.f42136) {
            C5395 c5395 = this.f33828;
            if ((c5395.f12853 || c5395.f12852) && this.f33835) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    public final synchronized void m27965(EnumC15197 enumC15197) {
        if (this.f33833 == null) {
            this.f33833 = enumC15197;
            notifyAll();
        }
    }

    public C12101(int i, C23500 c23500, boolean z, boolean z2, C12194 c12194) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f33834 = arrayDeque;
        this.f33837 = new C14112(this);
        this.f33829 = new C14112(this);
        this.f33833 = null;
        if (c23500 == null) {
            throw new NullPointerException("connection == null");
        }
        this.f33832 = i;
        this.f33831 = c23500;
        this.f33827 = c23500.f74874.m8550();
        C14782 c14782 = new C14782(this, c23500.f74865.m8550());
        this.f33836 = c14782;
        C5395 c5395 = new C5395(this);
        this.f33828 = c5395;
        c14782.f42137 = z2;
        c5395.f12853 = z;
        if (c12194 != null) {
            arrayDeque.add(c12194);
        }
        if (m27966() && c12194 != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!m27966() && c12194 == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m27966() {
        return this.f33831.f74883 == ((this.f33832 & 1) == 1);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC3579 m27967() {
        return this.f33836;
    }

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC7603 m27964() {
        synchronized (this) {
            if (!this.f33835 && !m27966()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f33828;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27959(EnumC15197 enumC15197) {
        if (m27955(enumC15197)) {
            this.f33831.f74872.m18742(this.f33832, enumC15197);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m27962(EnumC15197 enumC15197) {
        if (m27955(enumC15197)) {
            this.f33831.m52263(this.f33832, enumC15197);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private boolean m27955(EnumC15197 enumC15197) {
        synchronized (this) {
            if (this.f33833 != null) {
                return false;
            }
            if (this.f33836.f42137 && this.f33828.f12853) {
                return false;
            }
            this.f33833 = enumC15197;
            notifyAll();
            this.f33831.m52262(this.f33832);
            return true;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27957(ArrayList arrayList) {
        boolean zM27963;
        synchronized (this) {
            this.f33835 = true;
            this.f33834.add(C21407.m48494(arrayList));
            zM27963 = m27963();
            notifyAll();
        }
        if (zM27963) {
            return;
        }
        this.f33831.m52262(this.f33832);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27958(InterfaceC8233 interfaceC8233, int i) {
        this.f33836.m33718(interfaceC8233, i);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m27968() {
        boolean zM27963;
        synchronized (this) {
            this.f33836.f42137 = true;
            zM27963 = m27963();
            notifyAll();
        }
        if (zM27963) {
            return;
        }
        this.f33831.m52262(this.f33832);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0018  */
    /* JADX INFO: renamed from: ֫ */
    public final void m27956() {
        boolean z;
        boolean zM27963;
        synchronized (this) {
            C14782 c14782 = this.f33836;
            if (c14782.f42137 || !c14782.f42136) {
                z = false;
            } else {
                C5395 c5395 = this.f33828;
                if (c5395.f12853 || c5395.f12852) {
                    z = true;
                } else {
                    z = false;
                }
            }
            zM27963 = m27963();
        }
        if (z) {
            m27959(EnumC15197.CANCEL);
        } else {
            if (zM27963) {
                return;
            }
            this.f33831.m52262(this.f33832);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m27961() throws IOException {
        C5395 c5395 = this.f33828;
        if (c5395.f12852) {
            throw new IOException("stream closed");
        }
        if (c5395.f12853) {
            throw new IOException("stream finished");
        }
        if (this.f33833 != null) {
            throw new C12928(this.f33833);
        }
    }
}
