package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۤۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12099 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ AbstractC17043 f33820;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ActivityC18686 f33821;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C18229 f33822;

    public C12099(ActivityC18686 activityC18686, AbstractC17043 abstractC17043, C18229 c18229) {
        this.f33821 = activityC18686;
        this.f33820 = abstractC17043;
        this.f33822 = c18229;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22242(this.f33821);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws C20807 {
        ActivityC18686 activityC18686 = this.f33821;
        C14149.m32616(this.f33820, activityC18686.f55801.m29402());
        activityC18686.f55791 = true;
        activityC18686.m42567(false);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        int iIndexOf;
        ActivityC18686 activityC18686 = this.f33821;
        AbstractC7291 abstractC7291M5172 = activityC18686.m5172();
        if (abstractC7291M5172.m16796() || (iIndexOf = activityC18686.f55797.indexOf(this.f33822)) == -1) {
            return;
        }
        C7089 c7089 = new C7089();
        AbstractC16003 abstractC16003 = (AbstractC16003) activityC18686.f55797.set(iIndexOf, c7089);
        AbstractC18413 abstractC18413M16810 = abstractC7291M5172.m16810();
        abstractC18413M16810.m41919(0, 0);
        abstractC18413M16810.mo41931(abstractC16003);
        abstractC18413M16810.m41923(c7089, "000000-0000-0000-0000-000000000001");
        abstractC18413M16810.mo41930();
        activityC18686.f55784.remove("000000-0000-0000-0000-000000000002");
        if (activityC18686.f55794 != null) {
            activityC18686.f55794.notifyItemChanged(iIndexOf);
        }
        C12828 c12828M42601 = activityC18686.m42601();
        abstractC16003.m36366(c12828M42601).m29395();
        C7836.m18119(abstractC16003.m36369(c12828M42601).m29402()).m12892((InterfaceC22729) new C14110());
        abstractC16003.m36359(c12828M42601).m29395();
        activityC18686.m42576();
        ActivityC18686.m42582(activityC18686);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f33821.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f33821.f55779 = false;
        m22249();
    }
}
