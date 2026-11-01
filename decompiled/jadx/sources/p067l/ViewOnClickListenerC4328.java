package p067l;

import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.֫᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V933 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC4328 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C22551 f9653;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ InterfaceC16397 f9654;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C13776 f9655;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ ImageView f9656;

    public /* synthetic */ ViewOnClickListenerC4328(C13776 c13776, ImageView imageView, InterfaceC16397 interfaceC16397, C22551 c22551) {
        this.f9655 = c13776;
        this.f9656 = imageView;
        this.f9654 = interfaceC16397;
        this.f9653 = c22551;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC22606 abstractC22606 = C21265.f66848;
        int iMo9513 = abstractC22606.mo9513();
        C13776 c13776 = this.f9655;
        c13776.f38942 = iMo9513;
        c13776.f38944 = EnumC8411.m19595(abstractC22606);
        this.f9656.setImageBitmap(this.f9654.mo34535(c13776));
        C22551 c22551 = this.f9653;
        if (c22551.mo50536()) {
            c22551.m50537();
            ((DialogInterfaceC2564) c22551.mo17723()).m3854(false);
        }
    }
}
