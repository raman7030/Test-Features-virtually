package p067l;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۢᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N15M */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC11661 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ DialogInterfaceC2564 f32513;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f32514;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f32515;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f32516;

    public /* synthetic */ ViewOnClickListenerC11661(Object obj, Object obj2, DialogInterfaceC2564 dialogInterfaceC2564, int i) {
        this.f32515 = i;
        this.f32516 = obj;
        this.f32514 = obj2;
        this.f32513 = dialogInterfaceC2564;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f32515) {
            case 0:
                C25114 c25114 = (C25114) this.f32516;
                TextView textView = (TextView) this.f32514;
                Object tag = view.getTag();
                if (tag != null) {
                    c25114.f80364 = tag.toString();
                    textView.setVisibility(8);
                    this.f32513.m3859().callOnClick();
                }
                break;
            default:
                C7269.m16642((C4587) this.f32516, (C7269) this.f32514, this.f32513);
                break;
        }
    }
}
