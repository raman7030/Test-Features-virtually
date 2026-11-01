package p067l;

import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ܰ᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V933 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC15786 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C22551 f45681;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC16397 f45682;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ ImageView f45683;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C13776 f45684;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C13776 f45685;

    public /* synthetic */ ViewOnClickListenerC15786(C13776 c13776, C13776 c13777, ImageView imageView, InterfaceC16397 interfaceC16397, C22551 c22551) {
        this.f45684 = c13776;
        this.f45685 = c13777;
        this.f45683 = imageView;
        this.f45682 = interfaceC16397;
        this.f45681 = c22551;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C13776 c13776 = this.f45685;
        int i = c13776.f38942;
        C13776 c13777 = this.f45684;
        c13777.f38942 = i;
        c13777.f38943 = c13776.f38943;
        c13777.f38944 = c13776.f38944;
        this.f45683.setImageBitmap(this.f45682.mo34535(c13777));
        C22551 c22551 = this.f45681;
        if (c22551.mo50536()) {
            c22551.m50537();
            ((DialogInterfaceC2564) c22551.mo17723()).m3854(false);
        }
    }
}
