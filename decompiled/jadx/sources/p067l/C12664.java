package p067l;

import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: renamed from: l.ۧۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8P4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12664 {

    /* JADX INFO: renamed from: ֫ */
    public final Handler f35557;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC18027 f35558;

    /* JADX INFO: renamed from: ֫ */
    public static void m29124(C12664 c12664, C5713 c5713) {
        synchronized (c5713) {
        }
        InterfaceC18027 interfaceC18027 = c12664.f35558;
        String str = C5792.f14228;
        interfaceC18027.mo41053(c5713);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29134(C5713 c5713) {
        synchronized (c5713) {
        }
        Handler handler = this.f35557;
        if (handler != null) {
            handler.post(new RunnableC4440(2, this, c5713));
        }
    }

    public C12664(Handler handler, InterfaceC18027 interfaceC18027) {
        if (interfaceC18027 != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f35557 = handler;
        this.f35558 = interfaceC18027;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m29138(C5713 c5713) {
        Handler handler = this.f35557;
        if (handler != null) {
            handler.post(new RunnableC14172(1, this, c5713));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m29128(C12664 c12664, C5713 c5713) {
        InterfaceC18027 interfaceC18027 = c12664.f35558;
        String str = C5792.f14228;
        interfaceC18027.mo41058(c5713);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29133(final String str, final long j, final long j2) {
        Handler handler = this.f35557;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.ܰ᩻ۧ
                @Override // java.lang.Runnable
                public final void run() {
                    C12664.m29123(this.f45790, str, j, j2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29123(C12664 c12664, String str, long j, long j2) {
        InterfaceC18027 interfaceC18027 = c12664.f35558;
        String str2 = C5792.f14228;
        interfaceC18027.mo41052(str, j, j2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29136(C10307 c10307, C15100 c15100) {
        Handler handler = this.f35557;
        if (handler != null) {
            handler.post(new RunnableC10854(this, c10307, c15100, 1));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29126(C12664 c12664, C10307 c10307, C15100 c15100) {
        InterfaceC18027 interfaceC18027 = c12664.f35558;
        String str = C5792.f14228;
        interfaceC18027.mo41057(c10307, c15100);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29129(final int i, final long j) {
        Handler handler = this.f35557;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.۟᩻ۧ
                @Override // java.lang.Runnable
                public final void run() {
                    C12664.m29127(i, j, this);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m29127(int i, long j, C12664 c12664) {
        InterfaceC18027 interfaceC18027 = c12664.f35558;
        String str = C5792.f14228;
        interfaceC18027.mo41055(i, j);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m29137(final int i, final long j) {
        Handler handler = this.f35557;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.֫ۜۧ
                @Override // java.lang.Runnable
                public final void run() {
                    C12664.m29119(i, j, this);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29119(int i, long j, C12664 c12664) {
        InterfaceC18027 interfaceC18027 = c12664.f35558;
        String str = C5792.f14228;
        interfaceC18027.mo41049(i, j);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29135(C8454 c8454) {
        Handler handler = this.f35557;
        if (handler != null) {
            handler.post(new RunnableC22254(2, this, c8454));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29125(C12664 c12664, C8454 c8454) {
        InterfaceC18027 interfaceC18027 = c12664.f35558;
        String str = C5792.f14228;
        interfaceC18027.mo41054(c8454);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29131(final Object obj) {
        Handler handler = this.f35557;
        if (handler != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: l.᩺᩻ۧ
                @Override // java.lang.Runnable
                public final void run() {
                    C12664.m29121(this.f77698, obj, jElapsedRealtime);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29121(C12664 c12664, Object obj, long j) {
        InterfaceC18027 interfaceC18027 = c12664.f35558;
        String str = C5792.f14228;
        interfaceC18027.mo41050(j, obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29132(String str) {
        Handler handler = this.f35557;
        if (handler != null) {
            handler.post(new RunnableC19910(1, this, str));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29122(C12664 c12664, String str) {
        InterfaceC18027 interfaceC18027 = c12664.f35558;
        String str2 = C5792.f14228;
        interfaceC18027.mo41051(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29130(Exception exc) {
        Handler handler = this.f35557;
        if (handler != null) {
            handler.post(new RunnableC21902(2, this, exc));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29120(C12664 c12664, Exception exc) {
        InterfaceC18027 interfaceC18027 = c12664.f35558;
        String str = C5792.f14228;
        interfaceC18027.mo41056(exc);
    }
}
