package l;

import android.widget.ImageView;

/* JADX INFO: renamed from: l.ᩳ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V933 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18289 implements InterfaceC13041 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12002 f56859;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ImageView f56860;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC14760 f56861;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206 f56862;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21236 f56863;

    public /* synthetic */ C18289(C12002 c12002, ImageView imageView, InterfaceC14760 interfaceC14760, C21236 c21236, DialogInterfaceC0206 dialogInterfaceC0206) {
        this.f56859 = c12002;
        this.f56860 = imageView;
        this.f56861 = interfaceC14760;
        this.f56863 = c21236;
        this.f56862 = dialogInterfaceC0206;
    }

    @Override // l.InterfaceC13041
    public final void accept(Object obj) {
        C12002 c12002 = this.f56859;
        c12002.f35933 = (EnumC21999) obj;
        this.f56860.setImageBitmap(this.f56861.mo32433(c12002));
        C21236 c21236 = this.f56863;
        if (c21236.mo48205()) {
            c21236.m48206();
            ((DialogInterfaceC0206) c21236.mo15808()).m1441(false);
        }
        this.f56862.dismiss();
    }
}
