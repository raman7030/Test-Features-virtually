package p067l;

import android.content.Context;
import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.֫ۢ */
/* JADX INFO: compiled from: P55W */
/* JADX INFO: loaded from: classes2.dex */
public final class C0928 extends C1749 {

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ C1698 f8756;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0928(C1698 c1698, Context context, C0994 c0994, View view) {
        super(context, c0994, view, true, R.attr.MT_Protector, 0);
        this.f8756 = c1698;
        m44890(8388613);
        m44893(c1698.f56070);
    }

    @Override // p067l.C1749
    /* JADX INFO: renamed from: ܿ */
    public final void mo7992() {
        C1698 c1698 = this.f8756;
        if (c1698.f29422 != null) {
            c1698.f29422.close();
        }
        c1698.f56081 = null;
        super.mo7992();
    }
}
