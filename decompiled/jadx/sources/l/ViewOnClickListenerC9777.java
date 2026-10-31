package l;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۢᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N15M */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC9777 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206 f29561;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f29562;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29563;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f29564;

    public /* synthetic */ ViewOnClickListenerC9777(Object obj, Object obj2, DialogInterfaceC0206 dialogInterfaceC0206, int i) {
        this.f29563 = i;
        this.f29564 = obj;
        this.f29562 = obj2;
        this.f29561 = dialogInterfaceC0206;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f29563) {
            case 0:
                C23932 c23932 = (C23932) this.f29564;
                TextView textView = (TextView) this.f29562;
                Object tag = view.getTag();
                if (tag != null) {
                    c23932.f77612 = tag.toString();
                    textView.setVisibility(8);
                    this.f29561.m1446().callOnClick();
                }
                break;
            default:
                C5156.m14734((C2334) this.f29564, (C5156) this.f29562, this.f29561);
                break;
        }
    }
}
