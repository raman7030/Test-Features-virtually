package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۤۜۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes3.dex */
public final class C11992 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ ActivityC18686 f33434;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ boolean f33435;

    /* JADX INFO: renamed from: ܳ */
    public C24164 f33436;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ C13607 f33437;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C16408 f33438;

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
    }

    public C11992(C16408 c16408, ActivityC18686 activityC18686, boolean z, C13607 c13607) {
        this.f33438 = c16408;
        this.f33434 = activityC18686;
        this.f33435 = z;
        this.f33437 = c13607;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C24164 c24164 = new C24164(this.f33434);
        c24164.m53440(R.string.MT_Protector);
        c24164.m53431(C7050.m16203(R.string.MT_Protector, 0));
        c24164.mo51878((Runnable) null);
        c24164.mo51883();
        this.f33436 = c24164;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C14003 c14003 = new C14003(this);
        C16408 c16408 = this.f33438;
        C13196 c13196 = new C13196(c16408.f48224);
        boolean z = this.f33435;
        C13607 c13607 = this.f33437;
        if (z) {
            int i = c13607.f38281;
            if (i == 0) {
                C8242.m19021(c16408.f48224, c13607.f38279, c14003);
                return;
            } else if (i == 1) {
                C8242.m19024(c16408.f48224, c13196, c13607.f38279, c13607.f38282, c13607.f38280, c14003);
                return;
            } else {
                if (i != 2) {
                    return;
                }
                C8242.m19022(c16408.f48224, c13196, c13607.f38279, c13607.f38282, c13607.f38278, c14003);
                return;
            }
        }
        int i2 = c13607.f38281;
        if (i2 == 0) {
            C8242.m19031(c16408.f48224, c13607.f38279, c14003);
        } else {
            if (i2 != 1) {
                return;
            }
            C8242.m19023(c16408.f48224, c13196, c13607.f38279, c13607.f38282, c14003);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f33434.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f33436.m53442();
    }
}
