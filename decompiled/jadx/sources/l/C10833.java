package l;

import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: renamed from: l.ۧۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8P4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10833 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Handler f32581;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16476 f32582;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27079(C10833 c10833, C3519 c3519) {
        synchronized (c3519) {
        }
        InterfaceC16476 interfaceC16476 = c10833.f32582;
        String str = C3603.f11424;
        interfaceC16476.mo38827(c3519);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27089(C3519 c3519) {
        synchronized (c3519) {
        }
        Handler handler = this.f32581;
        if (handler != null) {
            handler.post(new RunnableC2180(2, this, c3519));
        }
    }

    public C10833(Handler handler, InterfaceC16476 interfaceC16476) {
        if (interfaceC16476 != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f32581 = handler;
        this.f32582 = interfaceC16476;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m27093(C3519 c3519) {
        Handler handler = this.f32581;
        if (handler != null) {
            handler.post(new RunnableC12420(1, this, c3519));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m27083(C10833 c10833, C3519 c3519) {
        InterfaceC16476 interfaceC16476 = c10833.f32582;
        String str = C3603.f11424;
        interfaceC16476.mo38832(c3519);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27088(final String str, final long j, final long j2) {
        Handler handler = this.f32581;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.ܰ᩻ۧ
                @Override // java.lang.Runnable
                public final void run() {
                    C10833.m27078(this.f42701, str, j, j2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27078(C10833 c10833, String str, long j, long j2) {
        InterfaceC16476 interfaceC16476 = c10833.f32582;
        String str2 = C3603.f11424;
        interfaceC16476.mo38826(str, j, j2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27091(C8353 c8353, C13396 c13396) {
        Handler handler = this.f32581;
        if (handler != null) {
            handler.post(new RunnableC8928(this, c8353, c13396, 1));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27081(C10833 c10833, C8353 c8353, C13396 c13396) {
        InterfaceC16476 interfaceC16476 = c10833.f32582;
        String str = C3603.f11424;
        interfaceC16476.mo38831(c8353, c13396);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27084(final int i, final long j) {
        Handler handler = this.f32581;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.۟᩻ۧ
                @Override // java.lang.Runnable
                public final void run() {
                    C10833.m27082(i, j, this);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m27082(int i, long j, C10833 c10833) {
        InterfaceC16476 interfaceC16476 = c10833.f32582;
        String str = C3603.f11424;
        interfaceC16476.mo38829(i, j);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m27092(final int i, final long j) {
        Handler handler = this.f32581;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.֫ۜۧ
                @Override // java.lang.Runnable
                public final void run() {
                    C10833.m27074(i, j, this);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27074(int i, long j, C10833 c10833) {
        InterfaceC16476 interfaceC16476 = c10833.f32582;
        String str = C3603.f11424;
        interfaceC16476.mo38823(i, j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27090(C6404 c6404) {
        Handler handler = this.f32581;
        if (handler != null) {
            handler.post(new RunnableC20923(2, this, c6404));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27080(C10833 c10833, C6404 c6404) {
        InterfaceC16476 interfaceC16476 = c10833.f32582;
        String str = C3603.f11424;
        interfaceC16476.mo38828(c6404);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27086(final Object obj) {
        Handler handler = this.f32581;
        if (handler != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: l.᩺᩻ۧ
                @Override // java.lang.Runnable
                public final void run() {
                    C10833.m27076(this.f74951, obj, jElapsedRealtime);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27076(C10833 c10833, Object obj, long j) {
        InterfaceC16476 interfaceC16476 = c10833.f32582;
        String str = C3603.f11424;
        interfaceC16476.mo38824(j, obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27087(String str) {
        Handler handler = this.f32581;
        if (handler != null) {
            handler.post(new RunnableC18457(1, this, str));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27077(C10833 c10833, String str) {
        InterfaceC16476 interfaceC16476 = c10833.f32582;
        String str2 = C3603.f11424;
        interfaceC16476.mo38825(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27085(Exception exc) {
        Handler handler = this.f32581;
        if (handler != null) {
            handler.post(new RunnableC20553(2, this, exc));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27075(C10833 c10833, Exception exc) {
        InterfaceC16476 interfaceC16476 = c10833.f32582;
        String str = C3603.f11424;
        interfaceC16476.mo38830(exc);
    }
}
