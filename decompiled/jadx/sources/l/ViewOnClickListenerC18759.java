package l;

import android.view.View;

/* JADX INFO: renamed from: l.ᩴ۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC18759 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f59265;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f59266;

    public /* synthetic */ ViewOnClickListenerC18759(int i, Object obj) {
        this.f59265 = i;
        this.f59266 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f59265;
        Object obj = this.f59266;
        switch (i) {
            case 0:
                C6058.m16913((C6058) obj);
                break;
            case 1:
                C4925.m14314((CharSequence) obj);
                break;
            case 2:
                ActivityC8848.m22857((ActivityC8848) obj);
                break;
            default:
                int i2 = ActivityC21414.f68968;
                ((ActivityC21414) obj).finish();
                break;
        }
    }
}
