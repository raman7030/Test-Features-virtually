package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۨ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K3Y5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13716 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ AbstractActivityC5549 f38709;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ boolean[] f38710;

    public C13716(AbstractActivityC5549 abstractActivityC5549, boolean[] zArr) {
        this.f38709 = abstractActivityC5549;
        this.f38710 = zArr;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f38709, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws C3924 {
        boolean[] zArr = this.f38710;
        C13215.m30217(zArr[0], zArr[1], zArr[2], zArr[3], zArr[4]);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C22682.m50793(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f38709.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
