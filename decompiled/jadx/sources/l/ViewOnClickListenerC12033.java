package l;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: l.ۨ᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC12033 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f35998;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f35999;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f36000;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f36001;

    public /* synthetic */ ViewOnClickListenerC12033(Object obj, Object obj2, Object obj3, int i) {
        this.f36000 = i;
        this.f36001 = obj;
        this.f35999 = obj2;
        this.f35998 = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f36000) {
            case 0:
                C7799.m20825((C7799) this.f36001, (AbstractActivityC3346) this.f35999, (PopupWindow) this.f35998, view);
                break;
            default:
                C23354.m51765((C16298) this.f36001, (C23354) this.f35999, (DialogInterfaceC0206) this.f35998);
                break;
        }
    }
}
