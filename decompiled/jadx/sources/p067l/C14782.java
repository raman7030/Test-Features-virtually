package p067l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.۬ۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T4F2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14782 implements InterfaceC3579 {

    /* JADX INFO: renamed from: ۗ */
    public final C14268 f42132 = new C14268();

    /* JADX INFO: renamed from: ۙ */
    public final C14268 f42133 = new C14268();

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C12101 f42134;

    /* JADX INFO: renamed from: ᩶ */
    public final long f42135;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f42136;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f42137;

    public C14782(C12101 c12101, long j) {
        this.f42134 = c12101;
        this.f42135 = j;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Code duplicated, block: B:35:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x009c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x009d  */
    @Override // p067l.InterfaceC3579
    /* JADX INFO: renamed from: ۧ */
    public final long mo6580(C14268 c14268, long j) throws C12928 {
        EnumC15197 enumC15197;
        long jMo6580;
        while (true) {
            synchronized (this.f42134) {
                this.f42134.f33837.m15805();
                try {
                    C12101 c12101 = this.f42134;
                    enumC15197 = c12101.f33833;
                    if (enumC15197 == null) {
                        enumC15197 = null;
                    }
                    if (!this.f42136) {
                        c12101.f33834.isEmpty();
                        if (this.f42133.size() > 0) {
                            C14268 c14269 = this.f42133;
                            jMo6580 = c14269.mo6580(c14268, Math.min(8192L, c14269.size()));
                            C12101 c12102 = this.f42134;
                            long j2 = c12102.f33830 + jMo6580;
                            c12102.f33830 = j2;
                            if (enumC15197 != null || j2 < c12102.f33831.f74865.m8550() / 2) {
                                break;
                                break;
                            }
                            C12101 c12103 = this.f42134;
                            c12103.f33831.m52254(c12103.f33832, c12103.f33830);
                            this.f42134.f33830 = 0L;
                            break;
                        }
                        if (this.f42137 || enumC15197 != null) {
                            jMo6580 = -1;
                            break;
                        }
                        try {
                            this.f42134.wait();
                            this.f42134.f33837.m32038();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } else {
                        throw new IOException("stream closed");
                    }
                } catch (Throwable th) {
                    this.f42134.f33837.m32038();
                    throw th;
                }
            }
            if (jMo6580 != -1) {
                this.f42134.f33831.m52267(jMo6580);
                return jMo6580;
            }
            if (enumC15197 == null) {
                return -1L;
            }
            throw new C12928(enumC15197);
        }
        this.f42134.f33837.m32038();
        if (jMo6580 != -1) {
            this.f42134.f33831.m52267(jMo6580);
            return jMo6580;
        }
        if (enumC15197 == null) {
            return -1L;
        }
        throw new C12928(enumC15197);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33718(InterfaceC8233 interfaceC8233, long j) {
        boolean z;
        boolean z2;
        long size;
        while (j > 0) {
            synchronized (this.f42134) {
                z = this.f42137;
                z2 = this.f42133.size() + j > this.f42135;
            }
            if (z2) {
                interfaceC8233.skip(j);
                this.f42134.m27962(EnumC15197.FLOW_CONTROL_ERROR);
                return;
            }
            if (z) {
                interfaceC8233.skip(j);
                return;
            }
            long jMo6580 = interfaceC8233.mo6580(this.f42132, j);
            if (jMo6580 == -1) {
                throw new EOFException();
            }
            j -= jMo6580;
            synchronized (this.f42134) {
                if (this.f42136) {
                    size = this.f42132.size();
                    this.f42132.m32780();
                } else {
                    boolean z3 = this.f42133.size() == 0;
                    this.f42133.m32783((InterfaceC3579) this.f42132);
                    if (z3) {
                        this.f42134.notifyAll();
                    }
                    size = 0;
                }
            }
            if (size > 0) {
                this.f42134.f33831.m52267(size);
            }
        }
    }

    @Override // p067l.InterfaceC3579
    /* JADX INFO: renamed from: ۢ */
    public final C16989 mo6579() {
        return this.f42134.f33837;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long size;
        synchronized (this.f42134) {
            this.f42136 = true;
            size = this.f42133.size();
            this.f42133.m32780();
            this.f42134.f33834.isEmpty();
            this.f42134.notifyAll();
        }
        if (size > 0) {
            this.f42134.f33831.m52267(size);
        }
        this.f42134.m27956();
    }
}
