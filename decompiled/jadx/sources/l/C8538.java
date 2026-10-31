package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۡ֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 47G4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8538 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f26097;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C6421 f26099;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Throwable f26101;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f26102;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f26103;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f26104;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f26105;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public volatile EnumC15592 f26098 = EnumC15592.UNKNOWN;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Object f26100 = new Object();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC15592 m22225() {
        return this.f26098;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22226() {
        synchronized (this.f26100) {
            this.f26098 = EnumC15592.UNKNOWN;
            this.f26099 = null;
            this.f26101 = null;
            this.f26102++;
            this.f26105 = false;
            this.f26104 = 0L;
            this.f26100.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9244 m22224(C0776 c0776, C7832 c7832) {
        Throwable th;
        C6421 c6421M2958;
        boolean z;
        while (c7832.f24235.m31075(c7832.f24236)) {
            EnumC15592 enumC15592 = this.f26098;
            EnumC15592 enumC15593 = EnumC15592.UNKNOWN;
            if (enumC15592 != enumC15593) {
                return new C9244(enumC15592, false);
            }
            synchronized (this.f26100) {
                if (!c7832.f24235.m31075(c7832.f24236)) {
                    return new C9244(enumC15593, true);
                }
                EnumC15592 enumC15594 = this.f26098;
                if (enumC15594 != enumC15593) {
                    return new C9244(enumC15594, false);
                }
                if (this.f26105) {
                    long j = this.f26104;
                    while (this.f26105 && this.f26104 == j) {
                        try {
                            this.f26100.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            throw new IOException("Interrupted while waiting for SMB protocol probing", e);
                        }
                    }
                    if (!c7832.f24235.m31075(c7832.f24236)) {
                        return new C9244(EnumC15592.UNKNOWN, true);
                    }
                    EnumC15592 enumC15595 = this.f26098;
                    EnumC15592 enumC15596 = EnumC15592.UNKNOWN;
                    if (enumC15595 != enumC15596) {
                        return new C9244(enumC15595, false);
                    }
                    C6421 c6421 = this.f26099;
                    if (c6421 != null && this.f26097 == j) {
                        if (c6421.m17749() != null) {
                            m22223(this.f26099.m17749());
                            throw null;
                        }
                        if (this.f26099.m17751() != enumC15596) {
                            return new C9244(this.f26099.m17751(), false);
                        }
                    }
                    Throwable th2 = this.f26101;
                    if (th2 != null && this.f26103 == j) {
                        m22223(th2);
                        throw null;
                    }
                    return new C9244(enumC15596, true);
                }
                this.f26105 = true;
                long j2 = this.f26102 + 1;
                this.f26102 = j2;
                this.f26104 = j2;
                try {
                    c6421M2958 = c0776.m2958();
                    th = null;
                } catch (Throwable th3) {
                    th = th3;
                    c6421M2958 = null;
                }
                synchronized (this.f26100) {
                    z = this.f26102 != j2;
                    if (!z) {
                        this.f26099 = c6421M2958;
                        this.f26097 = j2;
                        this.f26101 = th;
                        this.f26103 = j2;
                        if (th == null && c6421M2958 != null && c6421M2958.m17751() != EnumC15592.UNKNOWN) {
                            this.f26098 = c6421M2958.m17751();
                        }
                    }
                    if (this.f26104 == j2) {
                        this.f26105 = false;
                        this.f26104 = 0L;
                    }
                    this.f26100.notifyAll();
                }
                if (z) {
                    return new C9244(EnumC15592.UNKNOWN, true);
                }
                if (th != null) {
                    m22223(th);
                    throw null;
                }
                if (c6421M2958.m17749() != null) {
                    m22223(c6421M2958.m17749());
                    throw null;
                }
                if (c6421M2958.m17751() != EnumC15592.UNKNOWN) {
                    return new C9244(c6421M2958.m17751(), false);
                }
            }
        }
        return new C9244(EnumC15592.UNKNOWN, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22223(Throwable th) throws IOException {
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        throw new IOException("SMB protocol probing failed", th);
    }
}
