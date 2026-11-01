package p067l;

import android.widget.PopupWindow;

/* JADX INFO: renamed from: l.֨ۖ */
/* JADX INFO: compiled from: 95GJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0883 implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C1898 f5764;

    public C0883(C1898 c1898) {
        this.f5764 = c1898;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C1898 c1898 = this.f5764;
        InterfaceC1233 interfaceC1233 = c1898.f71328;
        if (interfaceC1233 != null) {
            interfaceC1233.mo8467(c1898);
        }
    }
}
