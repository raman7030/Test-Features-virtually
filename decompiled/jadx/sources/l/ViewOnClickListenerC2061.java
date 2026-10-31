package l;

import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.֫᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V933 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2061 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21236 f6869;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC14760 f6870;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12002 f6871;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ImageView f6872;

    public /* synthetic */ ViewOnClickListenerC2061(C12002 c12002, ImageView imageView, InterfaceC14760 interfaceC14760, C21236 c21236) {
        this.f6871 = c12002;
        this.f6872 = imageView;
        this.f6870 = interfaceC14760;
        this.f6869 = c21236;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC21294 abstractC21294 = C19883.f64212;
        int iMo7431 = abstractC21294.mo7431();
        C12002 c12002 = this.f6871;
        c12002.f35932 = iMo7431;
        c12002.f35934 = EnumC6357.m17652(abstractC21294);
        this.f6872.setImageBitmap(this.f6870.mo32433(c12002));
        C21236 c21236 = this.f6869;
        if (c21236.mo48205()) {
            c21236.m48206();
            ((DialogInterfaceC0206) c21236.mo15808()).m1441(false);
        }
    }
}
