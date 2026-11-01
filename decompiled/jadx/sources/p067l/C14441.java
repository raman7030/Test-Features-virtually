package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۫᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14441 extends AbstractC18877 {

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ ActivityC22429 f41268;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14441(ActivityC22429 activityC22429, ActivityC22429 activityC224210, boolean z) {
        super(activityC224210, z);
        this.f41268 = activityC22429;
    }

    @Override // p067l.AbstractC18877
    /* JADX INFO: renamed from: ֫ */
    public final void mo7882(C19548 c19548, String str) {
        ActivityC22429 activityC22429 = this.f41268;
        activityC22429.f70775.f60047 = true;
        activityC22429.f70775.f60062 = 0;
        activityC22429.f70775.f60070 = new int[activityC22429.f70775.f60056.length];
        for (int i = 0; i < activityC22429.f70775.f60056.length; i++) {
            if (c19548.m44389(activityC22429.f70775.f60056[i].m30317())) {
                int[] iArr = activityC22429.f70775.f60070;
                C19746 c19746 = activityC22429.f70775;
                int i2 = c19746.f60062;
                c19746.f60062 = i2 + 1;
                iArr[i2] = i;
            }
        }
        activityC22429.setTitle(activityC22429.getString(R.string.MT_Protector, str));
        activityC22429.f70774.notifyDataSetChanged();
    }

    @Override // p067l.AbstractC18877
    /* JADX INFO: renamed from: ֫ */
    public final void mo7881() {
        ActivityC22429 activityC22429 = this.f41268;
        activityC22429.f70775.f60047 = false;
        activityC22429.m12277(R.string.MT_Protector);
        activityC22429.f70774.notifyDataSetChanged();
    }
}
