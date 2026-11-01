package p067l;

import android.content.Context;
import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۛ᩷ */
/* JADX INFO: compiled from: P55W */
/* JADX INFO: loaded from: classes3.dex */
public final class C1154 extends C1749 {

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ C1698 f22333;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1154(C1698 c1698, Context context, SubMenuC1819 subMenuC1819, View view) {
        super(context, subMenuC1819, view, false, R.attr.MT_Protector, 0);
        this.f22333 = c1698;
        if (!((C1134) subMenuC1819.getItem()).m18392()) {
            View view2 = c1698.f56079;
            m44891(view2 == null ? (View) c1698.f29426 : view2);
        }
        m44893(c1698.f56070);
    }

    @Override // p067l.C1749
    /* JADX INFO: renamed from: ܿ */
    public final void mo7992() {
        C1698 c1698 = this.f22333;
        c1698.f56083 = null;
        c1698.f56074 = 0;
        super.mo7992();
    }
}
