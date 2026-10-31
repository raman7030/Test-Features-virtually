package l;

import java.io.BufferedOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۛܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: F70U */
/* JADX INFO: loaded from: classes2.dex */
public final class C6101 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f18686;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f18687;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C8841 f18688;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Throwable f18689;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f18690;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f18692;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C23034 f18693;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public EnumC10335 f18694 = EnumC10335.PENDING;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f18691 = Long.MIN_VALUE;

    public C6101(C23034 c23034, AbstractC15440 abstractC15440) {
        this.f18693 = c23034;
        this.f18687 = abstractC15440;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final BufferedOutputStream m17020() throws IOException {
        synchronized (C23034.class) {
            m17009();
        }
        C23034.m51176(this.f18687, "Hex pending state file is unsafe");
        return new BufferedOutputStream(this.f18687.mo23555(false));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17014(C8841 c8841) {
        synchronized (C23034.class) {
            m17009();
            if (this.f18688 != null) {
                throw new IllegalStateException("Hex checkpoint view is already installed");
            }
            this.f18688 = c8841;
            this.f18691 = c8841.m22843();
            this.f18686 = true;
            C23034.class.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17012(long j) {
        synchronized (C23034.class) {
            m17009();
            this.f18691 = j;
            this.f18686 = true;
            C23034.class.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m17016() {
        long j;
        synchronized (C23034.class) {
            if (!this.f18686) {
                throw new IllegalStateException("Hex checkpoint generation is unavailable");
            }
            j = this.f18691;
        }
        return j;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C8841 m17017() {
        C8841 c8841;
        synchronized (C23034.class) {
            m17009();
            c8841 = this.f18688;
            if (c8841 == null) {
                throw new IOException("Hex checkpoint view is unavailable");
            }
            this.f18688 = null;
        }
        return c8841;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m17019() {
        synchronized (C23034.class) {
            m17009();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17015(boolean z) {
        synchronized (C23034.class) {
            m17009();
            if (!this.f18687.mo23119() || this.f18687.m36533()) {
                throw new IOException("Hex pending state file is unavailable");
            }
            if (!this.f18687.mo23551(this.f18693.f74128)) {
                throw new IOException("Unable to commit pending hex checkpoint");
            }
            C13843.remove(C23034.f74123, this.f18693.f74131, this);
            this.f18694 = EnumC10335.COMMITTED;
            C23034.class.notifyAll();
        }
        if (z) {
            C23034.m51189(this.f18693);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0061 A[Catch: all -> 0x0081, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x0016, B:11:0x001e, B:14:0x0024, B:22:0x0036, B:24:0x003a, B:31:0x004e, B:25:0x0040, B:32:0x005b, B:34:0x0061, B:36:0x0065, B:38:0x006a, B:37:0x0068, B:40:0x0070, B:42:0x0074, B:43:0x0077, B:44:0x007a, B:45:0x007f, B:30:0x004b, B:20:0x0031), top: B:52:0x0003, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0065 A[Catch: all -> 0x0081, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x0016, B:11:0x001e, B:14:0x0024, B:22:0x0036, B:24:0x003a, B:31:0x004e, B:25:0x0040, B:32:0x005b, B:34:0x0061, B:36:0x0065, B:38:0x006a, B:37:0x0068, B:40:0x0070, B:42:0x0074, B:43:0x0077, B:44:0x007a, B:45:0x007f, B:30:0x004b, B:20:0x0031), top: B:52:0x0003, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0068 A[Catch: all -> 0x0081, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x0016, B:11:0x001e, B:14:0x0024, B:22:0x0036, B:24:0x003a, B:31:0x004e, B:25:0x0040, B:32:0x005b, B:34:0x0061, B:36:0x0065, B:38:0x006a, B:37:0x0068, B:40:0x0070, B:42:0x0074, B:43:0x0077, B:44:0x007a, B:45:0x007f, B:30:0x004b, B:20:0x0031), top: B:52:0x0003, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0070 A[Catch: all -> 0x0081, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x0016, B:11:0x001e, B:14:0x0024, B:22:0x0036, B:24:0x003a, B:31:0x004e, B:25:0x0040, B:32:0x005b, B:34:0x0061, B:36:0x0065, B:38:0x006a, B:37:0x0068, B:40:0x0070, B:42:0x0074, B:43:0x0077, B:44:0x007a, B:45:0x007f, B:30:0x004b, B:20:0x0031), top: B:52:0x0003, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0074 A[Catch: all -> 0x0081, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x0016, B:11:0x001e, B:14:0x0024, B:22:0x0036, B:24:0x003a, B:31:0x004e, B:25:0x0040, B:32:0x005b, B:34:0x0061, B:36:0x0065, B:38:0x006a, B:37:0x0068, B:40:0x0070, B:42:0x0074, B:43:0x0077, B:44:0x007a, B:45:0x007f, B:30:0x004b, B:20:0x0031), top: B:52:0x0003, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0077 A[Catch: all -> 0x0081, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x0016, B:11:0x001e, B:14:0x0024, B:22:0x0036, B:24:0x003a, B:31:0x004e, B:25:0x0040, B:32:0x005b, B:34:0x0061, B:36:0x0065, B:38:0x006a, B:37:0x0068, B:40:0x0070, B:42:0x0074, B:43:0x0077, B:44:0x007a, B:45:0x007f, B:30:0x004b, B:20:0x0031), top: B:52:0x0003, inners: #2 }] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17013(Throwable th) {
        Throwable th2;
        EnumC10335 enumC10335;
        synchronized (C23034.class) {
            boolean z = C23034.f74123.get(this.f18693.f74131) == this;
            C8841 c8841 = this.f18688;
            IOException e = null;
            this.f18688 = null;
            if (c8841 != null) {
                try {
                    c8841.close();
                } catch (IOException e2) {
                    e = e2;
                }
            }
            e = null;
            try {
                C23034.m51186(this.f18687);
            } catch (IOException e3) {
                e = e3;
            }
            if (e == null) {
                e = e;
            } else if (e != null) {
                e.addSuppressed(e);
            }
            if (z) {
                try {
                    if (this.f18690) {
                        this.f18693.m51178();
                    } else {
                        this.f18693.m51179();
                    }
                } catch (IOException e4) {
                    if (e == null) {
                        e = e4;
                    } else {
                        e.addSuppressed(e4);
                    }
                }
                C13843.remove(C23034.f74123, this.f18693.f74131, this);
                if (this.f18694 == EnumC10335.PENDING) {
                    if (this.f18692) {
                        enumC10335 = EnumC10335.DISCARDED;
                    } else {
                        enumC10335 = EnumC10335.FAILED;
                    }
                    this.f18694 = enumC10335;
                    this.f18689 = th;
                }
                if (e != null) {
                    th2 = this.f18689;
                    if (th2 == null) {
                        this.f18689 = e;
                    } else {
                        th2.addSuppressed(e);
                    }
                }
                C23034.class.notifyAll();
            } else {
                if (this.f18694 == EnumC10335.PENDING) {
                    if (this.f18692) {
                        enumC10335 = EnumC10335.DISCARDED;
                    } else {
                        enumC10335 = EnumC10335.FAILED;
                    }
                    this.f18694 = enumC10335;
                    this.f18689 = th;
                }
                if (e != null) {
                    th2 = this.f18689;
                    if (th2 == null) {
                        this.f18689 = e;
                    } else {
                        th2.addSuppressed(e);
                    }
                }
                C23034.class.notifyAll();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC10335 m17011(InterfaceC17066 interfaceC17066) {
        EnumC10335 enumC10335;
        synchronized (C23034.class) {
            while (this.f18694 == EnumC10335.PENDING) {
                C23034.m51177(interfaceC17066);
                try {
                    C23034.class.wait(100L);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new IOException("Interrupted while waiting for hex checkpoint", e);
                }
            }
            C23034.m51177(interfaceC17066);
            enumC10335 = this.f18694;
        }
        return enumC10335;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final IOException m17010() {
        IOException iOException;
        synchronized (C23034.class) {
            iOException = new IOException(this.f18694 == EnumC10335.DISCARDED ? "Hex checkpoint write was discarded" : "Hex checkpoint write failed");
            Throwable th = this.f18689;
            if (th != null) {
                iOException.initCause(th);
            }
        }
        return iOException;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m17018() {
        return this.f18694 == EnumC10335.PENDING && !this.f18692;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m17008(C6101 c6101) {
        if (c6101.f18694 == EnumC10335.PENDING) {
            c6101.f18694 = EnumC10335.SUPERSEDED;
            C8841 c8841 = c6101.f18688;
            IOException e = null;
            c6101.f18688 = null;
            if (c8841 != null) {
                try {
                    c8841.close();
                } catch (IOException e2) {
                    e = e2;
                }
            }
            if (e != null) {
                Throwable th = c6101.f18689;
                if (th == null) {
                    c6101.f18689 = e;
                } else {
                    th.addSuppressed(e);
                }
            }
            C23034.class.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17006(C6101 c6101, boolean z) {
        c6101.f18692 = true;
        c6101.f18690 = z | c6101.f18690;
        C8841 c8841 = c6101.f18688;
        IOException e = null;
        c6101.f18688 = null;
        if (c8841 != null) {
            try {
                c8841.close();
            } catch (IOException e2) {
                e = e2;
            }
        }
        if (e != null) {
            Throwable th = c6101.f18689;
            if (th == null) {
                c6101.f18689 = e;
            } else {
                th.addSuppressed(e);
            }
        }
        C23034.class.notifyAll();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m17009() throws IOException {
        if (this.f18694 != EnumC10335.PENDING || this.f18692 || C23034.f74123.get(this.f18693.f74131) != this) {
            throw new IOException("Hex checkpoint write was canceled");
        }
    }
}
