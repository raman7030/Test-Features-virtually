package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܽۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes4.dex */
public final class C16558 extends AbstractC0525 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC8092 f50874;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C8817 f50875;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16558(ActivityC8092 activityC8092) {
        super(true);
        this.f50874 = activityC8092;
        this.f50875 = C8817.m22787();
    }

    @Override // l.AbstractC0525
    /* JADX INFO: renamed from: ۧ */
    public final void mo1201() {
        ActivityC8092 activityC8092 = this.f50874;
        if (activityC8092.f24924 != null && activityC8092.f24924.m2038() == 0 && activityC8092.f24925.f7825.m15198()) {
            return;
        }
        if (this.f50875.m22793()) {
            C21374.m48465();
            activityC8092.finish();
        } else {
            C21374.m48457(R.string.MT_Protector);
        }
    }
}
