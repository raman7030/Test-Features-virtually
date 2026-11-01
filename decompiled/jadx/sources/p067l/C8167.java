package p067l;

import java.io.BufferedOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۛܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: F70U */
/* JADX INFO: loaded from: classes2.dex */
public final class C8167 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f21541;

    /* JADX INFO: renamed from: ۜ */
    public final AbstractC17043 f21542;

    /* JADX INFO: renamed from: ۧ */
    public C10771 f21543;

    /* JADX INFO: renamed from: ܳ */
    public Throwable f21544;

    /* JADX INFO: renamed from: ܽ */
    public boolean f21545;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f21547;

    /* JADX INFO: renamed from: ᩷ */
    public final C24260 f21548;

    /* JADX INFO: renamed from: ᩻ */
    public EnumC12191 f21549 = EnumC12191.PENDING;

    /* JADX INFO: renamed from: ܿ */
    public long f21546 = Long.MIN_VALUE;

    public C8167(C24260 c24260, AbstractC17043 abstractC17043) {
        this.f21548 = c24260;
        this.f21542 = abstractC17043;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final BufferedOutputStream m18951() throws IOException {
        synchronized (C24260.class) {
            m18940();
        }
        C24260.m53569(this.f21542, "Hex pending state file is unsafe");
        return new BufferedOutputStream(this.f21542.mo25506(false));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18945(C10771 c10771) {
        synchronized (C24260.class) {
            m18940();
            if (this.f21543 != null) {
                throw new IllegalStateException("Hex checkpoint view is already installed");
            }
            this.f21543 = c10771;
            this.f21546 = c10771.m24813();
            this.f21541 = true;
            C24260.class.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18943(long j) {
        synchronized (C24260.class) {
            m18940();
            this.f21546 = j;
            this.f21541 = true;
            C24260.class.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m18947() {
        long j;
        synchronized (C24260.class) {
            if (!this.f21541) {
                throw new IllegalStateException("Hex checkpoint generation is unavailable");
            }
            j = this.f21546;
        }
        return j;
    }

    /* JADX INFO: renamed from: ܳ */
    public final C10771 m18948() {
        C10771 c10771;
        synchronized (C24260.class) {
            m18940();
            c10771 = this.f21543;
            if (c10771 == null) {
                throw new IOException("Hex checkpoint view is unavailable");
            }
            this.f21543 = null;
        }
        return c10771;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m18950() {
        synchronized (C24260.class) {
            m18940();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18946(boolean z) {
        synchronized (C24260.class) {
            m18940();
            if (!this.f21542.mo25093() || this.f21542.m38691()) {
                throw new IOException("Hex pending state file is unavailable");
            }
            if (!this.f21542.mo25502(this.f21548.f76866)) {
                throw new IOException("Unable to commit pending hex checkpoint");
            }
            C15525.remove(C24260.f76861, this.f21548.f76869, this);
            this.f21549 = EnumC12191.COMMITTED;
            C24260.class.notifyAll();
        }
        if (z) {
            C24260.m53582(this.f21548);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0061 A[Catch: all -> 0x0081, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x0016, B:11:0x001e, B:14:0x0024, B:22:0x0036, B:24:0x003a, B:31:0x004e, B:25:0x0040, B:32:0x005b, B:34:0x0061, B:36:0x0065, B:38:0x006a, B:37:0x0068, B:40:0x0070, B:42:0x0074, B:43:0x0077, B:44:0x007a, B:45:0x007f, B:30:0x004b, B:20:0x0031), top: B:52:0x0003, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0065 A[Catch: all -> 0x0081, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x0016, B:11:0x001e, B:14:0x0024, B:22:0x0036, B:24:0x003a, B:31:0x004e, B:25:0x0040, B:32:0x005b, B:34:0x0061, B:36:0x0065, B:38:0x006a, B:37:0x0068, B:40:0x0070, B:42:0x0074, B:43:0x0077, B:44:0x007a, B:45:0x007f, B:30:0x004b, B:20:0x0031), top: B:52:0x0003, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0068 A[Catch: all -> 0x0081, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x0016, B:11:0x001e, B:14:0x0024, B:22:0x0036, B:24:0x003a, B:31:0x004e, B:25:0x0040, B:32:0x005b, B:34:0x0061, B:36:0x0065, B:38:0x006a, B:37:0x0068, B:40:0x0070, B:42:0x0074, B:43:0x0077, B:44:0x007a, B:45:0x007f, B:30:0x004b, B:20:0x0031), top: B:52:0x0003, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0070 A[Catch: all -> 0x0081, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x0016, B:11:0x001e, B:14:0x0024, B:22:0x0036, B:24:0x003a, B:31:0x004e, B:25:0x0040, B:32:0x005b, B:34:0x0061, B:36:0x0065, B:38:0x006a, B:37:0x0068, B:40:0x0070, B:42:0x0074, B:43:0x0077, B:44:0x007a, B:45:0x007f, B:30:0x004b, B:20:0x0031), top: B:52:0x0003, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0074 A[Catch: all -> 0x0081, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x0016, B:11:0x001e, B:14:0x0024, B:22:0x0036, B:24:0x003a, B:31:0x004e, B:25:0x0040, B:32:0x005b, B:34:0x0061, B:36:0x0065, B:38:0x006a, B:37:0x0068, B:40:0x0070, B:42:0x0074, B:43:0x0077, B:44:0x007a, B:45:0x007f, B:30:0x004b, B:20:0x0031), top: B:52:0x0003, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0077 A[Catch: all -> 0x0081, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x0016, B:11:0x001e, B:14:0x0024, B:22:0x0036, B:24:0x003a, B:31:0x004e, B:25:0x0040, B:32:0x005b, B:34:0x0061, B:36:0x0065, B:38:0x006a, B:37:0x0068, B:40:0x0070, B:42:0x0074, B:43:0x0077, B:44:0x007a, B:45:0x007f, B:30:0x004b, B:20:0x0031), top: B:52:0x0003, inners: #2 }] */
    /* JADX INFO: renamed from: ֫ */
    public final void m18944(Throwable th) {
        Throwable th2;
        EnumC12191 enumC12191;
        synchronized (C24260.class) {
            boolean z = C24260.f76861.get(this.f21548.f76869) == this;
            C10771 c10771 = this.f21543;
            IOException e = null;
            this.f21543 = null;
            if (c10771 != null) {
                try {
                    c10771.close();
                } catch (IOException e2) {
                    e = e2;
                }
            }
            e = null;
            try {
                C24260.m53579(this.f21542);
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
                    if (this.f21545) {
                        this.f21548.m53571();
                    } else {
                        this.f21548.m53572();
                    }
                } catch (IOException e4) {
                    if (e == null) {
                        e = e4;
                    } else {
                        e.addSuppressed(e4);
                    }
                }
                C15525.remove(C24260.f76861, this.f21548.f76869, this);
                if (this.f21549 == EnumC12191.PENDING) {
                    if (this.f21547) {
                        enumC12191 = EnumC12191.DISCARDED;
                    } else {
                        enumC12191 = EnumC12191.FAILED;
                    }
                    this.f21549 = enumC12191;
                    this.f21544 = th;
                }
                if (e != null) {
                    th2 = this.f21544;
                    if (th2 == null) {
                        this.f21544 = e;
                    } else {
                        th2.addSuppressed(e);
                    }
                }
                C24260.class.notifyAll();
            } else {
                if (this.f21549 == EnumC12191.PENDING) {
                    if (this.f21547) {
                        enumC12191 = EnumC12191.DISCARDED;
                    } else {
                        enumC12191 = EnumC12191.FAILED;
                    }
                    this.f21549 = enumC12191;
                    this.f21544 = th;
                }
                if (e != null) {
                    th2 = this.f21544;
                    if (th2 == null) {
                        this.f21544 = e;
                    } else {
                        th2.addSuppressed(e);
                    }
                }
                C24260.class.notifyAll();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC12191 m18942(InterfaceC18588 interfaceC18588) {
        EnumC12191 enumC12191;
        synchronized (C24260.class) {
            while (this.f21549 == EnumC12191.PENDING) {
                C24260.m53570(interfaceC18588);
                try {
                    C24260.class.wait(100L);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new IOException("Interrupted while waiting for hex checkpoint", e);
                }
            }
            C24260.m53570(interfaceC18588);
            enumC12191 = this.f21549;
        }
        return enumC12191;
    }

    /* JADX INFO: renamed from: ֫ */
    public final IOException m18941() {
        IOException iOException;
        synchronized (C24260.class) {
            iOException = new IOException(this.f21549 == EnumC12191.DISCARDED ? "Hex checkpoint write was discarded" : "Hex checkpoint write failed");
            Throwable th = this.f21544;
            if (th != null) {
                iOException.initCause(th);
            }
        }
        return iOException;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m18949() {
        return this.f21549 == EnumC12191.PENDING && !this.f21547;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m18939(C8167 c8167) {
        if (c8167.f21549 == EnumC12191.PENDING) {
            c8167.f21549 = EnumC12191.SUPERSEDED;
            C10771 c10771 = c8167.f21543;
            IOException e = null;
            c8167.f21543 = null;
            if (c10771 != null) {
                try {
                    c10771.close();
                } catch (IOException e2) {
                    e = e2;
                }
            }
            if (e != null) {
                Throwable th = c8167.f21544;
                if (th == null) {
                    c8167.f21544 = e;
                } else {
                    th.addSuppressed(e);
                }
            }
            C24260.class.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18937(C8167 c8167, boolean z) {
        c8167.f21547 = true;
        c8167.f21545 = z | c8167.f21545;
        C10771 c10771 = c8167.f21543;
        IOException e = null;
        c8167.f21543 = null;
        if (c10771 != null) {
            try {
                c10771.close();
            } catch (IOException e2) {
                e = e2;
            }
        }
        if (e != null) {
            Throwable th = c8167.f21544;
            if (th == null) {
                c8167.f21544 = e;
            } else {
                th.addSuppressed(e);
            }
        }
        C24260.class.notifyAll();
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m18940() throws IOException {
        if (this.f21549 != EnumC12191.PENDING || this.f21547 || C24260.f76861.get(this.f21548.f76869) != this) {
            throw new IOException("Hex checkpoint write was canceled");
        }
    }
}
