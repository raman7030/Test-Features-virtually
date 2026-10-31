package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۤܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C10425 implements InterfaceC16610 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C5402 f31327;

    public C10425(LayoutInflaterFactory2C5402 layoutInflaterFactory2C5402) {
        this.f31327 = layoutInflaterFactory2C5402;
    }

    @Override // l.InterfaceC16610
    public final C21610 onApplyWindowInsets(View view, C21610 c21610) {
        int iM48826 = c21610.m48826();
        int iM15430 = this.f31327.m15430(c21610);
        if (iM48826 != iM15430) {
            int iM48824 = c21610.m48824();
            int iM48834 = c21610.m48834();
            int iM48835 = c21610.m48835();
            C23726 c23726 = new C23726(c21610);
            c23726.m52376(C11007.m27341(iM48824, iM15430, iM48834, iM48835));
            c21610 = c23726.m52373();
        }
        return C17648.m41324(view, c21610);
    }
}
