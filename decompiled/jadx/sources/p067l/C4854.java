package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۖܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4646 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4854 extends AbstractC18877 {

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ ActivityC10218 f11043;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4854(ActivityC10218 activityC10218, ActivityC10218 activityC10219, boolean z) {
        super(activityC10219, z);
        this.f11043 = activityC10218;
    }

    @Override // p067l.AbstractC18877
    /* JADX INFO: renamed from: ֫ */
    public final void mo7882(C19548 c19548, String str) {
        ActivityC10218 activityC10218 = this.f11043;
        activityC10218.f28325.f7114 = true;
        activityC10218.f28325.f7111 = 0;
        int size = activityC10218.f28325.f7109.f49796.size();
        for (int i = 0; i < size; i++) {
            if (c19548.m44389(activityC10218.f28325.f7109.f49796.m50188(i))) {
                int[] iArr = activityC10218.f28325.f7113;
                C3512 c3512 = activityC10218.f28325;
                int i2 = c3512.f7111;
                c3512.f7111 = i2 + 1;
                iArr[i2] = i;
            }
        }
        activityC10218.setTitle(activityC10218.getString(R.string.MT_Protector, str));
        activityC10218.f28327.notifyDataSetChanged();
    }

    @Override // p067l.AbstractC18877
    /* JADX INFO: renamed from: ֫ */
    public final void mo7881() {
        ActivityC10218 activityC10218 = this.f11043;
        activityC10218.f28325.f7114 = false;
        activityC10218.setTitle(activityC10218.f28325.f7115);
        activityC10218.f28327.notifyDataSetChanged();
    }
}
