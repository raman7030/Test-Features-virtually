package l;

import android.content.Context;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P55W */
/* JADX INFO: loaded from: classes3.dex */
public final class C6296 extends C18291 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17254 f19462;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6296(C17254 c17254, Context context, SubMenuC19703 subMenuC19703, View view) {
        super(context, subMenuC19703, view, false, R.attr.MT_Protector, 0);
        this.f19462 = c17254;
        if (!((C5882) subMenuC19703.getItem()).m16466()) {
            View view2 = c17254.f52897;
            m42631(view2 == null ? (View) c17254.f26501 : view2);
        }
        m42633(c17254.f52888);
    }

    @Override // l.C18291
    /* JADX INFO: renamed from: ܿ */
    public final void mo5782() {
        C17254 c17254 = this.f19462;
        c17254.f52901 = null;
        c17254.f52892 = 0;
        super.mo5782();
    }
}
