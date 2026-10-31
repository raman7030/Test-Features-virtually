package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.۬ۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T4F2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13062 implements InterfaceC1274 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C12521 f39084 = new C12521();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12521 f39085 = new C12521();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10241 f39086;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f39087;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f39088;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f39089;

    public C13062(C10241 c10241, long j) {
        this.f39086 = c10241;
        this.f39087 = j;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Code duplicated, block: B:35:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x009c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x009d  */
    @Override // l.InterfaceC1274
    /* JADX INFO: renamed from: ۧ */
    public final long mo4334(C12521 c12521, long j) throws C11111 {
        EnumC13499 enumC13499;
        long jMo4334;
        while (true) {
            synchronized (this.f39086) {
                this.f39086.f30876.m13925();
                try {
                    C10241 c10241 = this.f39086;
                    enumC13499 = c10241.f30872;
                    if (enumC13499 == null) {
                        enumC13499 = null;
                    }
                    if (!this.f39088) {
                        c10241.f30873.isEmpty();
                        if (this.f39085.size() > 0) {
                            C12521 c12522 = this.f39085;
                            jMo4334 = c12522.mo4334(c12521, Math.min(8192L, c12522.size()));
                            C10241 c10242 = this.f39086;
                            long j2 = c10242.f30869 + jMo4334;
                            c10242.f30869 = j2;
                            if (enumC13499 != null || j2 < c10242.f30870.f72140.m6393() / 2) {
                                break;
                                break;
                            }
                            C10241 c10243 = this.f39086;
                            c10243.f30870.m49926(c10243.f30871, c10243.f30869);
                            this.f39086.f30869 = 0L;
                            break;
                        }
                        if (this.f39089 || enumC13499 != null) {
                            jMo4334 = -1;
                            break;
                        }
                        try {
                            this.f39086.wait();
                            this.f39086.f30876.m29977();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } else {
                        throw new IOException("stream closed");
                    }
                } catch (Throwable th) {
                    this.f39086.f30876.m29977();
                    throw th;
                }
            }
            if (jMo4334 != -1) {
                this.f39086.f30870.m49939(jMo4334);
                return jMo4334;
            }
            if (enumC13499 == null) {
                return -1L;
            }
            throw new C11111(enumC13499);
        }
        this.f39086.f30876.m29977();
        if (jMo4334 != -1) {
            this.f39086.f30870.m49939(jMo4334);
            return jMo4334;
        }
        if (enumC13499 == null) {
            return -1L;
        }
        throw new C11111(enumC13499);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31631(InterfaceC6171 interfaceC6171, long j) {
        boolean z;
        boolean z2;
        long size;
        while (j > 0) {
            synchronized (this.f39086) {
                z = this.f39089;
                z2 = this.f39085.size() + j > this.f39087;
            }
            if (z2) {
                interfaceC6171.skip(j);
                this.f39086.m25940(EnumC13499.FLOW_CONTROL_ERROR);
                return;
            }
            if (z) {
                interfaceC6171.skip(j);
                return;
            }
            long jMo4334 = interfaceC6171.mo4334(this.f39084, j);
            if (jMo4334 == -1) {
                throw new EOFException();
            }
            j -= jMo4334;
            synchronized (this.f39086) {
                if (this.f39088) {
                    size = this.f39084.size();
                    this.f39084.m30706();
                } else {
                    boolean z3 = this.f39085.size() == 0;
                    this.f39085.m30709((InterfaceC1274) this.f39084);
                    if (z3) {
                        this.f39086.notifyAll();
                    }
                    size = 0;
                }
            }
            if (size > 0) {
                this.f39086.f30870.m49939(size);
            }
        }
    }

    @Override // l.InterfaceC1274
    /* JADX INFO: renamed from: ۢ */
    public final C15384 mo4333() {
        return this.f39086.f30876;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long size;
        synchronized (this.f39086) {
            this.f39088 = true;
            size = this.f39085.size();
            this.f39085.m30706();
            this.f39086.f30873.isEmpty();
            this.f39086.notifyAll();
        }
        if (size > 0) {
            this.f39086.f30870.m49939(size);
        }
        this.f39086.m25934();
    }
}
