package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܶۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes.dex */
public final class C16791 extends AbstractC9542 {

    /* JADX INFO: renamed from: ᩹۟᩵, reason: not valid java name and contains not printable characters */
    private static final short[] f82235;

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ ActivityC18686 f49480;

    /* JADX INFO: renamed from: ܳ */
    public boolean f49481;

    /* JADX INFO: renamed from: ᩻ */
    public String f49482;

    static {
        ApplicationC14266.m56479(115);
        f82235 = new short[]{331, -17774, -17791, -17792, -17776, -17739, -17766, -17761, -17770, -17725, -17725, -17725, -17725, -17725, -17725, -17698, -17725, -17725, -17725, -17725, -17698, -17725, -17725, -17725, -17725, -17698, -17725, -17725, -17725, -17725, -17698, -17725, -17725, -17725, -17725, -17725, -17725, -17725, -17725, -17725, -17725, -17725, -17726, -17725, -17725, -17725, -17725, -17725, -17725, -17698, -17725, -17725, -17725, -17725, -17698, -17725, -17725, -17725, -17725, -17698, -17725, -17725, -17725, -17725, -17698, -17725, -17725, -17725, -17725, -17725, -17725, -17725, -17725, -17725, -17725, -17725, -17725, 6435, 16491, 16489, 16500, 16497, 16510, 16504, 16495, 16459, 16506, 16495, 16499};
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public native void mo3402();

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public native void mo3405();

    public C16791(ActivityC18686 activityC18686) {
        this.f49480 = activityC18686;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        boolean z = exc instanceof C14662;
        ActivityC18686 activityC18686 = this.f49480;
        if (z) {
            activityC18686.finish();
        } else {
            activityC18686.m12260((Throwable) exc, true);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f49480.m12277(R.id.MT_Protector).setVisibility(8);
    }
}
