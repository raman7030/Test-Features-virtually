package l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.᩷ᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: EB24 */
/* JADX INFO: loaded from: classes5.dex */
public class C21033 implements InterfaceC8085 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC7379 f67873;

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo6024(InterfaceC23586 interfaceC23586) {
    }

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ void mo6026(InterfaceC23586 interfaceC23586) {
    }

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ void mo6027(InterfaceC23586 interfaceC23586) {
    }

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ void mo6028(InterfaceC23586 interfaceC23586) {
    }

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ void mo6029(InterfaceC23586 interfaceC23586) {
    }

    @Override // l.InterfaceC8085
    /* JADX INFO: renamed from: ۧ */
    public final void mo6025(InterfaceC23586 interfaceC23586) {
        Handler handler;
        if (Build.VERSION.SDK_INT >= 28) {
            handler = C4762.m13928(Looper.getMainLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new RunnableC4099(), 500L);
        this.f67873.mo19834(this);
    }

    public C21033(C18916 c18916, AbstractC7379 abstractC7379) {
        this.f67873 = abstractC7379;
    }
}
