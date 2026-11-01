package p067l;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: l.ܶ᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC17163 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f51106;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f51107;

    public /* synthetic */ ViewOnClickListenerC17163(int i, Object obj) {
        this.f51106 = i;
        this.f51107 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f51106;
        Object obj = this.f51107;
        switch (i) {
            case 0:
                ((ActivityC8645) obj).m20069();
                break;
            case 1:
                int i2 = ActivityC16573.f48667;
                ((ActivityC16573) obj).finish();
                break;
            case 2:
                C5801.m13052((C5801) obj, view);
                break;
            case 3:
                ((PopupWindow) obj).dismiss();
                break;
            default:
                int i3 = ActivityC20262.f62617;
                ((ActivityC20262) obj).finish();
                break;
        }
    }
}
