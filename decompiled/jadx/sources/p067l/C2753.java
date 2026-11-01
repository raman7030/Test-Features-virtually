package p067l;

import android.os.Handler;

/* JADX INFO: renamed from: l.֡۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: L8RI */
/* JADX INFO: loaded from: classes2.dex */
public final class C2753 {

    /* JADX INFO: renamed from: ֫ */
    public final Handler f4638;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC7448 f4639;

    /* JADX INFO: renamed from: ۧ */
    public static void m4301(C2753 c2753, C5713 c5713) {
        synchronized (c5713) {
        }
        InterfaceC7448 interfaceC7448 = c2753.f4639;
        String str = C5792.f14228;
        interfaceC7448.mo17210(c5713);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4309(C5713 c5713) {
        synchronized (c5713) {
        }
        Handler handler = this.f4638;
        if (handler != null) {
            handler.post(new RunnableC4457(1, this, c5713));
        }
    }

    public C2753(Handler handler, InterfaceC7448 interfaceC7448) {
        if (interfaceC7448 != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f4638 = handler;
        this.f4639 = interfaceC7448;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m4314(C5713 c5713) {
        Handler handler = this.f4638;
        if (handler != null) {
            handler.post(new RunnableC15855(1, this, c5713));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m4296(C2753 c2753, C5713 c5713) {
        InterfaceC7448 interfaceC7448 = c2753.f4639;
        String str = C5792.f14228;
        interfaceC7448.mo17208(c5713);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4307(final String str, final long j, final long j2) {
        Handler handler = this.f4638;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.ᩴ۫֫
                @Override // java.lang.Runnable
                public final void run() {
                    C2753.m4294(this.f62481, str, j, j2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m4294(C2753 c2753, String str, long j, long j2) {
        InterfaceC7448 interfaceC7448 = c2753.f4639;
        String str2 = C5792.f14228;
        interfaceC7448.mo17206(str, j, j2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4310(C10307 c10307, C15100 c15100) {
        Handler handler = this.f4638;
        if (handler != null) {
            handler.post(new RunnableC10492(this, c10307, c15100, 1));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m4297(C2753 c2753, C10307 c10307, C15100 c15100) {
        InterfaceC7448 interfaceC7448 = c2753.f4639;
        String str = C5792.f14228;
        interfaceC7448.mo17203(c10307, c15100);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4303(final long j) {
        Handler handler = this.f4638;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.ۘ۫֫
                @Override // java.lang.Runnable
                public final void run() {
                    C2753.m4291(this.f15360, j);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m4291(C2753 c2753, long j) {
        InterfaceC7448 interfaceC7448 = c2753.f4639;
        String str = C5792.f14228;
        interfaceC7448.mo17199(j);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4304(final long j, final int i, final long j2) {
        Handler handler = this.f4638;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.ۖ۫֫
                @Override // java.lang.Runnable
                public final void run() {
                    C2753.m4290(this.f10800, i, j, j2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m4290(C2753 c2753, int i, long j, long j2) {
        InterfaceC7448 interfaceC7448 = c2753.f4639;
        String str = C5792.f14228;
        interfaceC7448.mo17200(j, i, j2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4306(String str) {
        Handler handler = this.f4638;
        if (handler != null) {
            handler.post(new RunnableC17196(1, this, str));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m4293(C2753 c2753, String str) {
        InterfaceC7448 interfaceC7448 = c2753.f4639;
        String str2 = C5792.f14228;
        interfaceC7448.mo17205(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4311(final boolean z) {
        Handler handler = this.f4638;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.᩵۫֫
                @Override // java.lang.Runnable
                public final void run() {
                    C2753.m4298(this.f65549, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m4298(C2753 c2753, boolean z) {
        InterfaceC7448 interfaceC7448 = c2753.f4639;
        String str = C5792.f14228;
        interfaceC7448.mo17204(z);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m4312(Exception exc) {
        Handler handler = this.f4638;
        if (handler != null) {
            handler.post(new RunnableC24771(1, this, exc));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m4299(C2753 c2753, Exception exc) {
        InterfaceC7448 interfaceC7448 = c2753.f4639;
        String str = C5792.f14228;
        interfaceC7448.mo17201(exc);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4305(Exception exc) {
        Handler handler = this.f4638;
        if (handler != null) {
            handler.post(new RunnableC10376(1, this, exc));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m4292(C2753 c2753, Exception exc) {
        InterfaceC7448 interfaceC7448 = c2753.f4639;
        String str = C5792.f14228;
        interfaceC7448.mo17209(exc);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4308(C3424 c3424) {
        Handler handler = this.f4638;
        if (handler != null) {
            handler.post(new RunnableC22022(1, this, c3424));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m4295(C2753 c2753, C3424 c3424) {
        InterfaceC7448 interfaceC7448 = c2753.f4639;
        String str = C5792.f14228;
        interfaceC7448.mo17202(c3424);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m4313(C3424 c3424) {
        Handler handler = this.f4638;
        if (handler != null) {
            handler.post(new RunnableC8625(1, this, c3424));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m4300(C2753 c2753, C3424 c3424) {
        InterfaceC7448 interfaceC7448 = c2753.f4639;
        String str = C5792.f14228;
        interfaceC7448.mo17207(c3424);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4302(int i) {
        Handler handler = this.f4638;
        if (handler != null) {
            handler.post(new RunnableC4026(i, 1, this));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m4289(C2753 c2753, int i) {
        InterfaceC7448 interfaceC7448 = c2753.f4639;
        String str = C5792.f14228;
        interfaceC7448.mo17198(i);
    }
}
