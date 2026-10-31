package l;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.᩷ۛ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 08RN */
/* JADX INFO: loaded from: classes5.dex */
public final class C20683 implements InterfaceC19977 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2338 f66642;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC0220 f66643;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C15036 f66644;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f66645;

    public C20683(C2338 c2338, C15036 c15036) {
        this.f66642 = c2338;
        this.f66644 = c15036;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47295(C20683 c20683, C8353 c8353) {
        C2338 c2338 = c20683.f66642;
        if (c2338.f7504 == 0 || c20683.f66645) {
            return;
        }
        Looper looper = c2338.f7516;
        looper.getClass();
        c20683.f66643 = c2338.m7605(looper, c20683.f66644, c8353, false);
        c2338.f7500.add(c20683);
    }

    @Override // l.InterfaceC19977
    /* JADX INFO: renamed from: ֫ */
    public final void mo36563() {
        Handler handler = this.f66642.f7503;
        handler.getClass();
        C3603.m11023(handler, new Runnable() { // from class: l.᩻ۛ֫
            @Override // java.lang.Runnable
            public final void run() {
                C20683.m47294(this.f75456);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47294(C20683 c20683) {
        if (c20683.f66645) {
            return;
        }
        InterfaceC0220 interfaceC0220 = c20683.f66643;
        if (interfaceC0220 != null) {
            interfaceC0220.mo1472(c20683.f66644);
        }
        c20683.f66642.f7500.remove(c20683);
        c20683.f66645 = true;
    }
}
