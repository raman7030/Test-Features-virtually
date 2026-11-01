package p067l;

import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ۧ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V933 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC13046 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C22551 f36679;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC16397 f36680;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ ImageView f36681;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractActivityC5549 f36682;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C13776 f36683;

    public /* synthetic */ ViewOnClickListenerC13046(AbstractActivityC5549 abstractActivityC5549, C13776 c13776, ImageView imageView, InterfaceC16397 interfaceC16397, C22551 c22551) {
        this.f36682 = abstractActivityC5549;
        this.f36683 = c13776;
        this.f36681 = imageView;
        this.f36680 = interfaceC16397;
        this.f36679 = c22551;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DialogInterfaceOnClickListenerC5863 dialogInterfaceOnClickListenerC5863 = new DialogInterfaceOnClickListenerC5863(this.f36682, false);
        C13776 c13776 = this.f36683;
        dialogInterfaceOnClickListenerC5863.m13163(new C15977(c13776, this.f36681, this.f36680, this.f36679));
        dialogInterfaceOnClickListenerC5863.m13162(c13776.f38942);
    }
}
