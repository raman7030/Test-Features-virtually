package p067l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.᩷ᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: EB24 */
/* JADX INFO: loaded from: classes5.dex */
public class C22358 implements InterfaceC10052 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractC9381 f70559;

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo8221(InterfaceC24784 interfaceC24784) {
    }

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ void mo8223(InterfaceC24784 interfaceC24784) {
    }

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ void mo8224(InterfaceC24784 interfaceC24784) {
    }

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ void mo8225(InterfaceC24784 interfaceC24784) {
    }

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ void mo8226(InterfaceC24784 interfaceC24784) {
    }

    @Override // p067l.InterfaceC10052
    /* JADX INFO: renamed from: ۧ */
    public final void mo8222(InterfaceC24784 interfaceC24784) {
        Handler handler;
        if (Build.VERSION.SDK_INT >= 28) {
            handler = C6894.m15808(Looper.getMainLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new RunnableC6264(), 500L);
        this.f70559.mo21807(this);
    }

    public C22358(C20346 c20346, AbstractC9381 abstractC9381) {
        this.f70559 = abstractC9381;
    }
}
