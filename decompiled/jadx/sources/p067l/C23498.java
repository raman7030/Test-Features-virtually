package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩹ۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes.dex */
public final class C23498 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ActivityC18686 f74859;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ AbstractC9381 f74860;

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
    }

    public C23498(ActivityC18686 activityC18686, C22103 c22103) {
        this.f74859 = activityC18686;
        this.f74860 = c22103;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        this.f74859.f55802.m47120(new C22828(this));
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        ActivityC18686 activityC18686 = this.f74859;
        if (activityC18686.f55796 || this.f74860.mo21805() == EnumC15415.DESTROYED) {
            return;
        }
        activityC18686.m12259(exc, (DialogInterface.OnDismissListener) null);
        C22682.m50800("编译器测试失败，请将该文件反馈给作者");
    }
}
