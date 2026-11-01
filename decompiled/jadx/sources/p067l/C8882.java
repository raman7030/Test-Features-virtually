package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۜܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 09LR */
/* JADX INFO: loaded from: classes3.dex */
public final class C8882 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ActivityC17598 f24079;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ boolean f24080;

    public C8882(ActivityC17598 activityC17598, boolean z) {
        this.f24079 = activityC17598;
        this.f24080 = z;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22244(this.f24079, R.string.MT_Protector, 100);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws IOException {
        ActivityC17598 activityC17598 = this.f24079;
        C11193 c11193 = new C11193(activityC17598.f52603.m38664());
        activityC17598.f52598.m34990(c11193);
        activityC17598.f52605.m38655(new C24975(0, c11193));
        activityC17598.f52599 = false;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C22682.m50793(R.string.MT_Protector);
        boolean z = this.f24080;
        ActivityC17598 activityC17598 = this.f24079;
        if (z) {
            activityC17598.finish();
        } else {
            activityC17598.f52598.m34991(false);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f24079.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
