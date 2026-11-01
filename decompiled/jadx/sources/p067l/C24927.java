package p067l;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: l.᩻ܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q69A */
/* JADX INFO: loaded from: classes.dex */
public final class C24927 implements InterfaceC1666 {

    /* JADX INFO: renamed from: ᩸ */
    public final Rect f79606 = new Rect();

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C2798 f79607;

    public C24927(C2798 c2798) {
        this.f79607 = c2798;
    }

    @Override // p067l.InterfaceC1666
    public final C1914 onApplyWindowInsets(View view, C1914 c1914) {
        C1914 c1914M43570 = C1717.m43570(view, c1914);
        if (c1914M43570.m51178()) {
            return c1914M43570;
        }
        int iM51172 = c1914M43570.m51172();
        Rect rect = this.f79606;
        rect.left = iM51172;
        rect.top = c1914M43570.m51174();
        rect.right = c1914M43570.m51182();
        rect.bottom = c1914M43570.m51183();
        C2798 c2798 = this.f79607;
        int childCount = c2798.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C1914 c1914M43545 = C1717.m43545(c2798.getChildAt(i), c1914M43570);
            rect.left = Math.min(c1914M43545.m51172(), rect.left);
            rect.top = Math.min(c1914M43545.m51174(), rect.top);
            rect.right = Math.min(c1914M43545.m51182(), rect.right);
            rect.bottom = Math.min(c1914M43545.m51183(), rect.bottom);
        }
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        C2019 c2019 = new C2019(c1914M43570);
        c2019.m54783(C1388.m29403(i2, i3, i4, i5));
        return c2019.m54780();
    }
}
