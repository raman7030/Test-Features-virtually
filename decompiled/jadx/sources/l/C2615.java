package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۖܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4646 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2615 extends AbstractC17370 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC8259 f8249;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2615(ActivityC8259 activityC8259, ActivityC8259 activityC82510, boolean z) {
        super(activityC82510, z);
        this.f8249 = activityC8259;
    }

    @Override // l.AbstractC17370
    /* JADX INFO: renamed from: ֫ */
    public final void mo5652(C18076 c18076, String str) {
        ActivityC8259 activityC8259 = this.f8249;
        activityC8259.f25415.f4345 = true;
        activityC8259.f25415.f4342 = 0;
        int size = activityC8259.f25415.f4340.f46672.size();
        for (int i = 0; i < size; i++) {
            if (c18076.m42137(activityC8259.f25415.f4340.f46672.m47858(i))) {
                int[] iArr = activityC8259.f25415.f4344;
                C1203 c1203 = activityC8259.f25415;
                int i2 = c1203.f4342;
                c1203.f4342 = i2 + 1;
                iArr[i2] = i;
            }
        }
        activityC8259.setTitle(activityC8259.getString(R.string.MT_Protector, str));
        activityC8259.f25417.notifyDataSetChanged();
    }

    @Override // l.AbstractC17370
    /* JADX INFO: renamed from: ֫ */
    public final void mo5651() {
        ActivityC8259 activityC8259 = this.f8249;
        activityC8259.f25415.f4345 = false;
        activityC8259.setTitle(activityC8259.f25415.f4346);
        activityC8259.f25417.notifyDataSetChanged();
    }
}
