package p067l;

import android.content.Context;
import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩸ܳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC22935 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f72171;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f72172;

    public /* synthetic */ ViewOnClickListenerC22935(int i, Object obj) {
        this.f72171 = i;
        this.f72172 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f72171) {
            case 0:
                ((AbstractActivityC5549) this.f72172).m12253(R.string.MT_Protector, R.string.MT_Protector, false);
                break;
            default:
                ActivityC12554.m28933((Context) ((ViewOnClickListenerC21674) this.f72172).f68276, C25165.m55220(), false);
                break;
        }
    }
}
