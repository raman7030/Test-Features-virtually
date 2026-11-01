package p067l;

import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܽ۠ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAXL */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC18065 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f53931;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractActivityC5549 f53932;

    public /* synthetic */ ViewOnClickListenerC18065(AbstractActivityC5549 abstractActivityC5549, int i) {
        this.f53931 = i;
        this.f53932 = abstractActivityC5549;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f53931) {
            case 0:
                ViewOnClickListenerC9062.m20968(this.f53932, false);
                break;
            default:
                this.f53932.m12253(R.string.MT_Protector, R.string.MT_Protector, false);
                break;
        }
    }
}
