package p067l;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.᩷ۛ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 08RN */
/* JADX INFO: loaded from: classes5.dex */
public final class C22025 implements InterfaceC21354 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C4590 f69324;

    /* JADX INFO: renamed from: ᩶ */
    public InterfaceC2577 f69325;

    /* JADX INFO: renamed from: ᩸ */
    public final C16658 f69326;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f69327;

    public C22025(C4590 c4590, C16658 c16658) {
        this.f69324 = c4590;
        this.f69326 = c16658;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m49622(C22025 c22025, C10307 c10307) {
        C4590 c4590 = c22025.f69324;
        if (c4590.f10295 == 0 || c22025.f69327) {
            return;
        }
        Looper looper = c4590.f10307;
        looper.getClass();
        c22025.f69325 = c4590.m9676(looper, c22025.f69326, c10307, false);
        c4590.f10291.add(c22025);
    }

    @Override // p067l.InterfaceC21354
    /* JADX INFO: renamed from: ֫ */
    public final void mo38722() {
        Handler handler = this.f69324.f10294;
        handler.getClass();
        C5792.m12999(handler, new Runnable() { // from class: l.᩻ۛ֫
            @Override // java.lang.Runnable
            public final void run() {
                C22025.m49621(this.f78203);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m49621(C22025 c22025) {
        if (c22025.f69327) {
            return;
        }
        InterfaceC2577 interfaceC2577 = c22025.f69325;
        if (interfaceC2577 != null) {
            interfaceC2577.mo3885(c22025.f69326);
        }
        c22025.f69324.f10291.remove(c22025);
        c22025.f69327 = true;
    }
}
