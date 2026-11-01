package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ۤܿ */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C1359 implements InterfaceC1666 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ LayoutInflaterFactory2C1110 f34291;

    public C1359(LayoutInflaterFactory2C1110 layoutInflaterFactory2C1110) {
        this.f34291 = layoutInflaterFactory2C1110;
    }

    @Override // p067l.InterfaceC1666
    public final C1914 onApplyWindowInsets(View view, C1914 c1914) {
        int iM51174 = c1914.m51174();
        int iM17341 = this.f34291.m17341(c1914);
        if (iM51174 != iM17341) {
            int iM51172 = c1914.m51172();
            int iM51182 = c1914.m51182();
            int iM51183 = c1914.m51183();
            C2019 c2019 = new C2019(c1914);
            c2019.m54783(C1388.m29403(iM51172, iM17341, iM51182, iM51183));
            c1914 = c2019.m54780();
        }
        return C1717.m43570(view, c1914);
    }
}
