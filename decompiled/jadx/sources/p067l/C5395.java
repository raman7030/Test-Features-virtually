package p067l;

import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.ۗۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T4F2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5395 implements InterfaceC7603 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C12101 f12850;

    /* JADX INFO: renamed from: ᩶ */
    public final C14268 f12851 = new C14268();

    /* JADX INFO: renamed from: ᩸ */
    public boolean f12852;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f12853;

    public C5395(C12101 c12101) {
        this.f12850 = c12101;
    }

    @Override // p067l.InterfaceC7603
    /* JADX INFO: renamed from: ֫ */
    public final void mo10979(C14268 c14268, long j) {
        C14268 c14269 = this.f12851;
        c14269.mo10979(c14268, j);
        while (c14269.size() >= 16384) {
            m11843(false);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m11843(boolean z) {
        C12101 c12101;
        long jMin;
        C12101 c12102;
        synchronized (this.f12850) {
            this.f12850.f33829.m15805();
            while (true) {
                try {
                    c12101 = this.f12850;
                    if (c12101.f33827 > 0 || this.f12853 || this.f12852 || c12101.f33833 != null) {
                        break;
                    }
                    try {
                        c12101.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    this.f12850.f33829.m32038();
                    throw th;
                }
            }
            c12101.f33829.m32038();
            this.f12850.m27961();
            jMin = Math.min(this.f12850.f33827, this.f12851.size());
            c12102 = this.f12850;
            c12102.f33827 -= jMin;
        }
        c12102.f33829.m15805();
        try {
            C12101 c12103 = this.f12850;
            c12103.f33831.m52257(c12103.f33832, z && jMin == this.f12851.size(), this.f12851, jMin);
        } finally {
            this.f12850.f33829.m32038();
        }
    }

    @Override // p067l.InterfaceC7603, java.io.Flushable
    public final void flush() {
        synchronized (this.f12850) {
            this.f12850.m27961();
        }
        while (this.f12851.size() > 0) {
            m11843(false);
            this.f12850.f33831.f74872.flush();
        }
    }

    @Override // p067l.InterfaceC7603
    /* JADX INFO: renamed from: ۢ */
    public final C16989 mo10980() {
        return this.f12850.f33829;
    }

    @Override // p067l.InterfaceC7603, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f12850) {
            if (this.f12852) {
                return;
            }
            if (!this.f12850.f33828.f12853) {
                if (this.f12851.size() > 0) {
                    while (this.f12851.size() > 0) {
                        m11843(true);
                    }
                } else {
                    C12101 c12101 = this.f12850;
                    c12101.f33831.m52257(c12101.f33832, true, (C14268) null, 0L);
                }
            }
            synchronized (this.f12850) {
                this.f12852 = true;
            }
            this.f12850.f33831.f74872.flush();
            this.f12850.m27956();
        }
    }
}
