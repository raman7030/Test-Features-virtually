package p067l;

import android.widget.ImageView;

/* JADX INFO: renamed from: l.ᩳ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V933 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19751 implements InterfaceC1489 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C13776 f60077;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ ImageView f60078;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ InterfaceC16397 f60079;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ DialogInterfaceC2564 f60080;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C22551 f60081;

    public /* synthetic */ C19751(C13776 c13776, ImageView imageView, InterfaceC16397 interfaceC16397, C22551 c22551, DialogInterfaceC2564 dialogInterfaceC2564) {
        this.f60077 = c13776;
        this.f60078 = imageView;
        this.f60079 = interfaceC16397;
        this.f60081 = c22551;
        this.f60080 = dialogInterfaceC2564;
    }

    @Override // p067l.InterfaceC1489
    public final void accept(Object obj) {
        C13776 c13776 = this.f60077;
        c13776.f38943 = (EnumC23276) obj;
        this.f60078.setImageBitmap(this.f60079.mo34535(c13776));
        C22551 c22551 = this.f60081;
        if (c22551.mo50536()) {
            c22551.m50537();
            ((DialogInterfaceC2564) c22551.mo17723()).m3854(false);
        }
        this.f60080.dismiss();
    }
}
