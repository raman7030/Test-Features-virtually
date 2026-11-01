package p067l;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: l.ۨ᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC13805 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Object f39009;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f39010;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f39011;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f39012;

    public /* synthetic */ ViewOnClickListenerC13805(Object obj, Object obj2, Object obj3, int i) {
        this.f39011 = i;
        this.f39012 = obj;
        this.f39010 = obj2;
        this.f39009 = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f39011) {
            case 0:
                C9781.m22806((C9781) this.f39012, (AbstractActivityC5549) this.f39010, (PopupWindow) this.f39009, view);
                break;
            default:
                C24564.m54163((C17858) this.f39012, (C24564) this.f39010, (DialogInterfaceC2564) this.f39009);
                break;
        }
    }
}
