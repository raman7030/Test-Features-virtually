package l;

import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ۧ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V933 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC11234 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21236 f33679;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC14760 f33680;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ImageView f33681;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f33682;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12002 f33683;

    public /* synthetic */ ViewOnClickListenerC11234(AbstractActivityC3346 abstractActivityC3346, C12002 c12002, ImageView imageView, InterfaceC14760 interfaceC14760, C21236 c21236) {
        this.f33682 = abstractActivityC3346;
        this.f33683 = c12002;
        this.f33681 = imageView;
        this.f33680 = interfaceC14760;
        this.f33679 = c21236;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DialogInterfaceOnClickListenerC3677 dialogInterfaceOnClickListenerC3677 = new DialogInterfaceOnClickListenerC3677(this.f33682, false);
        C12002 c12002 = this.f33683;
        dialogInterfaceOnClickListenerC3677.m11203(new C14319(c12002, this.f33681, this.f33680, this.f33679));
        dialogInterfaceOnClickListenerC3677.m11202(c12002.f35932);
    }
}
