package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12702 extends AbstractC17370 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21107 f38240;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12702(ActivityC21107 activityC21107, ActivityC21107 activityC21108, boolean z) {
        super(activityC21108, z);
        this.f38240 = activityC21107;
    }

    @Override // l.AbstractC17370
    /* JADX INFO: renamed from: ֫ */
    public final void mo5652(C18076 c18076, String str) {
        ActivityC21107 activityC21107 = this.f38240;
        activityC21107.f68093.f56830 = true;
        activityC21107.f68093.f56845 = 0;
        activityC21107.f68093.f56853 = new int[activityC21107.f68093.f56839.length];
        for (int i = 0; i < activityC21107.f68093.f56839.length; i++) {
            if (c18076.m42137(activityC21107.f68093.f56839[i].m28273())) {
                int[] iArr = activityC21107.f68093.f56853;
                C18284 c18284 = activityC21107.f68093;
                int i2 = c18284.f56845;
                c18284.f56845 = i2 + 1;
                iArr[i2] = i;
            }
        }
        activityC21107.setTitle(activityC21107.getString(R.string.MT_Protector, str));
        activityC21107.f68092.notifyDataSetChanged();
    }

    @Override // l.AbstractC17370
    /* JADX INFO: renamed from: ֫ */
    public final void mo5651() {
        ActivityC21107 activityC21107 = this.f38240;
        activityC21107.f68093.f56830 = false;
        activityC21107.m10241(R.string.MT_Protector);
        activityC21107.f68092.notifyDataSetChanged();
    }
}
