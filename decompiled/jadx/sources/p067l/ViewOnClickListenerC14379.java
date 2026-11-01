package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.۫᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC14379 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f41098;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f41099;

    public /* synthetic */ ViewOnClickListenerC14379(int i, Object obj) {
        this.f41098 = i;
        this.f41099 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f41098;
        Object obj = this.f41099;
        switch (i) {
            case 0:
                C15957.m36237((C15957) obj);
                break;
            default:
                int i2 = ActivityC9368.f25528;
                ((ActivityC9368) obj).finish();
                break;
        }
    }
}
