package p067l;

import android.view.Menu;
import android.view.MenuItem;

/* JADX INFO: renamed from: l.ᩳܳ */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes5.dex */
public final class C1740 implements InterfaceC1088 {

    /* JADX INFO: renamed from: ֫ */
    public C1158 f59566;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ LayoutInflaterFactory2C1110 f59567;

    public C1740(LayoutInflaterFactory2C1110 layoutInflaterFactory2C1110, C1158 c1158) {
        this.f59567 = layoutInflaterFactory2C1110;
        this.f59566 = c1158;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m44482(AbstractC1018 abstractC1018, Menu menu) {
        return this.f59566.m19646(abstractC1018, menu);
    }

    @Override // p067l.InterfaceC1088
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo16328(AbstractC1018 abstractC1018, Menu menu) {
        C1717.m43585(this.f59567.f19686);
        return this.f59566.mo16328(abstractC1018, menu);
    }

    @Override // p067l.InterfaceC1088
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo16329(AbstractC1018 abstractC1018, MenuItem menuItem) {
        return this.f59566.mo16329(abstractC1018, menuItem);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, l.۠ܿ] */
    @Override // p067l.InterfaceC1088
    /* JADX INFO: renamed from: ֫ */
    public final void mo16327(AbstractC1018 abstractC1018) {
        this.f59566.mo16327(abstractC1018);
        LayoutInflaterFactory2C1110 layoutInflaterFactory2C1110 = this.f59567;
        if (layoutInflaterFactory2C1110.f19658 != null) {
            layoutInflaterFactory2C1110.f19661.getDecorView().removeCallbacks(layoutInflaterFactory2C1110.f19695);
        }
        if (layoutInflaterFactory2C1110.f19678 != null) {
            C1612 c1612 = layoutInflaterFactory2C1110.f19672;
            if (c1612 != null) {
                c1612.m38758();
            }
            C1612 c1612M43544 = C1717.m43544(layoutInflaterFactory2C1110.f19678);
            c1612M43544.m38759(0.0f);
            layoutInflaterFactory2C1110.f19672 = c1612M43544;
            c1612M43544.m38762(new C1670(this));
        }
        ?? r0 = layoutInflaterFactory2C1110.f19692;
        if (r0 != 0) {
            r0.onSupportActionModeFinished(layoutInflaterFactory2C1110.f19670);
        }
        layoutInflaterFactory2C1110.f19670 = null;
        C1717.m43585(layoutInflaterFactory2C1110.f19686);
        layoutInflaterFactory2C1110.m17358();
    }
}
