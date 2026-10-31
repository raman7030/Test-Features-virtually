package l;

import android.os.Handler;

/* JADX INFO: renamed from: l.֡۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: L8RI */
/* JADX INFO: loaded from: classes2.dex */
public final class C0405 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Handler f1861;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5345 f1862;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m1909(C0405 c0405, C3519 c3519) {
        synchronized (c3519) {
        }
        InterfaceC5345 interfaceC5345 = c0405.f1862;
        String str = C3603.f11424;
        interfaceC5345.mo15302(c3519);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1917(C3519 c3519) {
        synchronized (c3519) {
        }
        Handler handler = this.f1861;
        if (handler != null) {
            handler.post(new RunnableC2198(1, this, c3519));
        }
    }

    public C0405(Handler handler, InterfaceC5345 interfaceC5345) {
        if (interfaceC5345 != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f1861 = handler;
        this.f1862 = interfaceC5345;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m1922(C3519 c3519) {
        Handler handler = this.f1861;
        if (handler != null) {
            handler.post(new RunnableC14191(1, this, c3519));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1904(C0405 c0405, C3519 c3519) {
        InterfaceC5345 interfaceC5345 = c0405.f1862;
        String str = C3603.f11424;
        interfaceC5345.mo15300(c3519);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1915(final String str, final long j, final long j2) {
        Handler handler = this.f1861;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.ᩴ۫֫
                @Override // java.lang.Runnable
                public final void run() {
                    C0405.m1902(this.f59258, str, j, j2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1902(C0405 c0405, String str, long j, long j2) {
        InterfaceC5345 interfaceC5345 = c0405.f1862;
        String str2 = C3603.f11424;
        interfaceC5345.mo15298(str, j, j2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1918(C8353 c8353, C13396 c13396) {
        Handler handler = this.f1861;
        if (handler != null) {
            handler.post(new RunnableC8548(this, c8353, c13396, 1));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1905(C0405 c0405, C8353 c8353, C13396 c13396) {
        InterfaceC5345 interfaceC5345 = c0405.f1862;
        String str = C3603.f11424;
        interfaceC5345.mo15295(c8353, c13396);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1911(final long j) {
        Handler handler = this.f1861;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.ۘ۫֫
                @Override // java.lang.Runnable
                public final void run() {
                    C0405.m1899(this.f12552, j);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1899(C0405 c0405, long j) {
        InterfaceC5345 interfaceC5345 = c0405.f1862;
        String str = C3603.f11424;
        interfaceC5345.mo15291(j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1912(final long j, final int i, final long j2) {
        Handler handler = this.f1861;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.ۖ۫֫
                @Override // java.lang.Runnable
                public final void run() {
                    C0405.m1898(this.f8009, i, j, j2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1898(C0405 c0405, int i, long j, long j2) {
        InterfaceC5345 interfaceC5345 = c0405.f1862;
        String str = C3603.f11424;
        interfaceC5345.mo15292(j, i, j2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1914(String str) {
        Handler handler = this.f1861;
        if (handler != null) {
            handler.post(new RunnableC15602(1, this, str));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1901(C0405 c0405, String str) {
        InterfaceC5345 interfaceC5345 = c0405.f1862;
        String str2 = C3603.f11424;
        interfaceC5345.mo15297(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1919(final boolean z) {
        Handler handler = this.f1861;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.᩵۫֫
                @Override // java.lang.Runnable
                public final void run() {
                    C0405.m1906(this.f62932, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1906(C0405 c0405, boolean z) {
        InterfaceC5345 interfaceC5345 = c0405.f1862;
        String str = C3603.f11424;
        interfaceC5345.mo15296(z);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m1920(Exception exc) {
        Handler handler = this.f1861;
        if (handler != null) {
            handler.post(new RunnableC23572(1, this, exc));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m1907(C0405 c0405, Exception exc) {
        InterfaceC5345 interfaceC5345 = c0405.f1862;
        String str = C3603.f11424;
        interfaceC5345.mo15293(exc);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1913(Exception exc) {
        Handler handler = this.f1861;
        if (handler != null) {
            handler.post(new RunnableC8425(1, this, exc));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1900(C0405 c0405, Exception exc) {
        InterfaceC5345 interfaceC5345 = c0405.f1862;
        String str = C3603.f11424;
        interfaceC5345.mo15301(exc);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1916(C1111 c1111) {
        Handler handler = this.f1861;
        if (handler != null) {
            handler.post(new RunnableC20679(1, this, c1111));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1903(C0405 c0405, C1111 c1111) {
        InterfaceC5345 interfaceC5345 = c0405.f1862;
        String str = C3603.f11424;
        interfaceC5345.mo15294(c1111);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m1921(C1111 c1111) {
        Handler handler = this.f1861;
        if (handler != null) {
            handler.post(new RunnableC6583(1, this, c1111));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m1908(C0405 c0405, C1111 c1111) {
        InterfaceC5345 interfaceC5345 = c0405.f1862;
        String str = C3603.f11424;
        interfaceC5345.mo15299(c1111);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1910(int i) {
        Handler handler = this.f1861;
        if (handler != null) {
            handler.post(new RunnableC1744(i, 1, this));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1897(C0405 c0405, int i) {
        InterfaceC5345 interfaceC5345 = c0405.f1862;
        String str = C3603.f11424;
        interfaceC5345.mo15290(i);
    }
}
