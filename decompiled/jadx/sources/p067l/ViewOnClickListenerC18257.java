package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ܽܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8B6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC18257 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f54526;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f54527;

    public /* synthetic */ ViewOnClickListenerC18257(int i, Object obj) {
        this.f54526 = i;
        this.f54527 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f54526;
        Object obj = this.f54527;
        switch (i) {
            case 0:
                ActivityC17586.m40025((ActivityC17586) obj);
                break;
            case 1:
                int i2 = ActivityC16532.f48579;
                ((ActivityC16532) obj).finish();
                break;
            case 2:
                C5801.m13051((C5801) obj);
                break;
            default:
                AbstractViewOnClickListenerC17799.m40412((AbstractViewOnClickListenerC17799) obj);
                break;
        }
    }
}
