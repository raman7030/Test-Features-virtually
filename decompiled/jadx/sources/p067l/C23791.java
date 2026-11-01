package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩹᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes.dex */
public final class C23791 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ActivityC4030 f75651;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ boolean f75652;

    public C23791(ActivityC4030 activityC4030, boolean z) {
        this.f75651 = activityC4030;
        this.f75652 = z;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f75651, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        this.f75651.f8840.m22067(this.f75652);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f75651.f8840.m22058() == 0) {
            C22682.m50793(R.string.MT_Protector);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f75651.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
