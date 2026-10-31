package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩹ۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes.dex */
public final class C22232 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f72134;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC7379 f72135;

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
    }

    public C22232(ActivityC17169 activityC17169, C20765 c20765) {
        this.f72134 = activityC17169;
        this.f72135 = c20765;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        this.f72134.f52621.m44824(new C21527(this));
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        ActivityC17169 activityC17169 = this.f72134;
        if (activityC17169.f52615 || this.f72135.mo19832() == EnumC13728.DESTROYED) {
            return;
        }
        activityC17169.m10223(exc, (DialogInterface.OnDismissListener) null);
        C21374.m48464("编译器测试失败，请将该文件反馈给作者");
    }
}
