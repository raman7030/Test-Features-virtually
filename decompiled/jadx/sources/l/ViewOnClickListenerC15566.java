package l;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: l.ܶ᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC15566 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f47974;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f47975;

    public /* synthetic */ ViewOnClickListenerC15566(int i, Object obj) {
        this.f47974 = i;
        this.f47975 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f47974;
        Object obj = this.f47975;
        switch (i) {
            case 0:
                ((ActivityC6604) obj).m18117();
                break;
            case 1:
                int i2 = ActivityC14946.f45553;
                ((ActivityC14946) obj).finish();
                break;
            case 2:
                C3612.m11076((C3612) obj, view);
                break;
            case 3:
                ((PopupWindow) obj).dismiss();
                break;
            default:
                int i3 = ActivityC18827.f59388;
                ((ActivityC18827) obj).finish();
                break;
        }
    }
}
