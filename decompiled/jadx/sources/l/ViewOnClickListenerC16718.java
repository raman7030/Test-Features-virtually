package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܽܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8B6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC16718 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f51342;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f51343;

    public /* synthetic */ ViewOnClickListenerC16718(int i, Object obj) {
        this.f51342 = i;
        this.f51343 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f51342;
        Object obj = this.f51343;
        switch (i) {
            case 0:
                ActivityC16012.m37839((ActivityC16012) obj);
                break;
            case 1:
                int i2 = ActivityC14903.f45464;
                ((ActivityC14903) obj).finish();
                break;
            case 2:
                C3612.m11075((C3612) obj);
                break;
            default:
                AbstractViewOnClickListenerC16235.m38200((AbstractViewOnClickListenerC16235) obj);
                break;
        }
    }
}
