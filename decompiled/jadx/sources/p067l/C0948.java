package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.֫᩻ */
/* JADX INFO: compiled from: 45OX */
/* JADX INFO: loaded from: classes3.dex */
public final class C0948 extends C3395 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C1718 f9898;

    public C0948(C1718 c1718) {
        this.f9898 = c1718;
    }

    @Override // p067l.InterfaceC1927
    public final void onAnimationEnd() {
        View view;
        C1718 c1718 = this.f9898;
        if (c1718.f57245 && (view = c1718.f57247) != null) {
            view.setTranslationY(0.0f);
            c1718.f57241.setTranslationY(0.0f);
        }
        c1718.f57241.setVisibility(8);
        c1718.f57241.m38708(false);
        c1718.f57237 = null;
        InterfaceC1088 interfaceC1088 = c1718.f57239;
        if (interfaceC1088 != null) {
            ((C1740) interfaceC1088).mo16327(c1718.f57240);
            c1718.f57240 = null;
            c1718.f57239 = null;
        }
        C1364 c1364 = c1718.f57232;
        if (c1364 != null) {
            C1717.m43585(c1364);
        }
    }
}
