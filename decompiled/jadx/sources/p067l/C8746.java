package p067l;

import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: l.ۜۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8746 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ boolean f23695;

    /* JADX INFO: renamed from: ܳ */
    public boolean f23696;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ List f23697;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ ActivityC18686 f23698;

    public C8746(ActivityC18686 activityC18686, List list, boolean z) {
        this.f23698 = activityC18686;
        this.f23697 = list;
        this.f23695 = z;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f23698, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws C7760, IOException {
        C20856 c20856 = this.f23698.f55802;
        C12826.requireNonNull(c20856);
        c20856.m47117(this.f23697);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        this.f23696 = true;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        ActivityC18686.m42522(this.f23698, exc);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
        if (this.f23696) {
            this.f23698.m42533(this.f23695, false);
        }
    }
}
