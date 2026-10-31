package l;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.᩺᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V933 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC23290 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21236 f74774;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC14760 f74775;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ImageView f74776;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f74777;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12002 f74778;

    public /* synthetic */ ViewOnClickListenerC23290(AbstractActivityC3346 abstractActivityC3346, C12002 c12002, ImageView imageView, InterfaceC14760 interfaceC14760, C21236 c21236) {
        this.f74777 = abstractActivityC3346;
        this.f74778 = c12002;
        this.f74776 = imageView;
        this.f74775 = interfaceC14760;
        this.f74774 = c21236;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractActivityC3346 abstractActivityC3346 = this.f74777;
        C13132 c13132 = new C13132(abstractActivityC3346);
        c13132.setMotionEventSplittingEnabled(false);
        c13132.setLayoutManager(new C21354((Context) abstractActivityC3346, 5));
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44421(c13132);
        c13132.setAdapter(new C23933(new C18289(this.f74778, this.f74776, this.f74775, this.f74774, c19258BuildDialog.m44438())));
    }
}
