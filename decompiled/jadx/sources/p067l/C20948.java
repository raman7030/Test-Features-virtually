package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩵ܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4646 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20948 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ActivityC10218 f65828;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ boolean f65829;

    public C20948(ActivityC10218 activityC10218, boolean z) {
        this.f65828 = activityC10218;
        this.f65829 = z;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f65828, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws IOException {
        ActivityC10218 activityC10218 = this.f65828;
        byte[] bArrM38145 = activityC10218.f28325.f7109.m38145();
        AbstractC17043 abstractC17043 = activityC10218.f28325.f7116;
        abstractC17043.getClass();
        abstractC17043.m38655(new C4975(0, bArrM38145));
        activityC10218.f28325.f7110 = false;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f65829) {
            this.f65828.finish();
        } else {
            C22682.m50793(R.string.MT_Protector);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f65828.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
