package l;

import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ܰ᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V933 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC14117 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21236 f42595;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC14760 f42596;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ImageView f42597;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12002 f42598;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12002 f42599;

    public /* synthetic */ ViewOnClickListenerC14117(C12002 c12002, C12002 c12003, ImageView imageView, InterfaceC14760 interfaceC14760, C21236 c21236) {
        this.f42598 = c12002;
        this.f42599 = c12003;
        this.f42597 = imageView;
        this.f42596 = interfaceC14760;
        this.f42595 = c21236;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C12002 c12002 = this.f42599;
        int i = c12002.f35932;
        C12002 c12003 = this.f42598;
        c12003.f35932 = i;
        c12003.f35933 = c12002.f35933;
        c12003.f35934 = c12002.f35934;
        this.f42597.setImageBitmap(this.f42596.mo32433(c12003));
        C21236 c21236 = this.f42595;
        if (c21236.mo48205()) {
            c21236.m48206();
            ((DialogInterfaceC0206) c21236.mo15808()).m1441(false);
        }
    }
}
