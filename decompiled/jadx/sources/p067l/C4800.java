package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۖ۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: VB8B */
/* JADX INFO: loaded from: classes2.dex */
public final class C4800 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ AbstractC17043 f10885;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ActivityC18686 f10886;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ InterfaceC6141 f10887;

    public C4800(ActivityC18686 activityC18686, AbstractC17043 abstractC17043, InterfaceC6141 interfaceC6141) {
        this.f10886 = activityC18686;
        this.f10885 = abstractC17043;
        this.f10887 = interfaceC6141;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f10886, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        this.f10885.m38668(this.f10887.mo13935());
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C22682.m50793(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f10886.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
