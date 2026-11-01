package p067l;

import android.content.DialogInterface;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۧۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12771 implements InterfaceC14577 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ RunnableC16180 f35956;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ TextView f35957;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C16155 f35958;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C18483 f35959;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ DialogInterfaceC2564 f35960;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractActivityC5549 f35961;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ boolean f35962;

    @Override // p067l.InterfaceC14577
    public final void onCanceled() {
    }

    public C12771(boolean z, C16155 c16155, DialogInterfaceC2564 dialogInterfaceC2564, C18483 c18483, RunnableC16180 runnableC16180, TextView textView, AbstractActivityC5549 abstractActivityC5549) {
        this.f35962 = z;
        this.f35958 = c16155;
        this.f35960 = dialogInterfaceC2564;
        this.f35959 = c18483;
        this.f35956 = runnableC16180;
        this.f35957 = textView;
        this.f35961 = abstractActivityC5549;
    }

    @Override // p067l.InterfaceC14577
    /* JADX INFO: renamed from: ֫ */
    public final void mo6049(C13457 c13457, boolean z) throws Throwable {
        boolean z2 = this.f35962;
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f35960;
        if (!z2 || (this.f35958.m36759(dialogInterfaceC2564) && dialogInterfaceC2564.m3855())) {
            C21292.m48119(this.f35959);
            this.f35956.run();
            C22682.m50793(R.string.MT_Protector);
            dialogInterfaceC2564.dismiss();
        }
    }

    @Override // p067l.InterfaceC14577
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo6050(Exception exc) {
        boolean z = this.f35962;
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f35960;
        if (z && (!this.f35958.m36759(dialogInterfaceC2564) || !dialogInterfaceC2564.m3855())) {
            return true;
        }
        if (exc instanceof C23021) {
            C10792.m24863(this.f35957, (C23021) exc);
            dialogInterfaceC2564.m3860().setEnabled(false);
            return true;
        }
        if (!(exc instanceof C13907)) {
            this.f35961.m12259(exc, (DialogInterface.OnDismissListener) null);
            return true;
        }
        C22682.m50800(C7050.m16203(R.string.MT_Protector, ((C13907) exc).m31632()));
        return true;
    }
}
