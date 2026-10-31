package l;

import android.content.Context;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: P55W */
/* JADX INFO: loaded from: classes2.dex */
public final class C1732 extends C18291 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17254 f5979;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1732(C17254 c17254, Context context, C3060 c3060, View view) {
        super(context, c3060, view, true, R.attr.MT_Protector, 0);
        this.f5979 = c17254;
        m42630(8388613);
        m42633(c17254.f52888);
    }

    @Override // l.C18291
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void mo5782() {
        C17254 c17254 = this.f5979;
        if (c17254.f26497 != null) {
            c17254.f26497.close();
        }
        c17254.f52899 = null;
        super.mo5782();
    }
}
