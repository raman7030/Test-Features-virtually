package p067l;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.᩺᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V933 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC24504 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C22551 f77519;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC16397 f77520;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ ImageView f77521;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractActivityC5549 f77522;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C13776 f77523;

    public /* synthetic */ ViewOnClickListenerC24504(AbstractActivityC5549 abstractActivityC5549, C13776 c13776, ImageView imageView, InterfaceC16397 interfaceC16397, C22551 c22551) {
        this.f77522 = abstractActivityC5549;
        this.f77523 = c13776;
        this.f77521 = imageView;
        this.f77520 = interfaceC16397;
        this.f77519 = c22551;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractActivityC5549 abstractActivityC5549 = this.f77522;
        C14849 c14849 = new C14849(abstractActivityC5549);
        c14849.setMotionEventSplittingEnabled(false);
        c14849.setLayoutManager(new C22663((Context) abstractActivityC5549, 5));
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46715(c14849);
        c14849.setAdapter(new C25115(new C19751(this.f77523, this.f77521, this.f77520, this.f77519, c20671BuildDialog.m46732())));
    }
}
