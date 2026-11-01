package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۤ᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12430 extends AbstractC24439 {

    /* JADX INFO: renamed from: ۜ */
    public C13266 f34752;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ ActivityC22429 f34753;

    /* JADX INFO: renamed from: ᩻ */
    public int f34754;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12430(ActivityC22429 activityC22429, ActivityC22429 activityC224210) {
        super(activityC224210);
        this.f34753 = activityC22429;
        this.f34754 = 0;
    }

    @Override // p067l.AbstractC24439
    /* JADX INFO: renamed from: ֫ */
    public final String mo14037() {
        int i = this.f34754;
        ActivityC22429 activityC22429 = this.f34753;
        if (i >= activityC22429.f70775.f60056.length) {
            return null;
        }
        C13266[] c13266Arr = activityC22429.f70775.f60056;
        int i2 = this.f34754;
        this.f34754 = i2 + 1;
        C13266 c13266 = c13266Arr[i2];
        this.f34752 = c13266;
        return c13266.m30317();
    }

    @Override // p067l.AbstractC24439
    /* JADX INFO: renamed from: ֫ */
    public final void mo14039(String str) {
        this.f34752.m30316(str);
        ActivityC22429.f70770 = true;
    }

    @Override // p067l.AbstractC24439
    /* JADX INFO: renamed from: ֫ */
    public final void mo14038(int i) {
        if (i > 0) {
            Object[] objArr = {Integer.valueOf(i)};
            ActivityC22429 activityC22429 = this.f34753;
            C22682.m50795((CharSequence) activityC22429.getString(R.string.MT_Protector, objArr));
            activityC22429.f70774.notifyDataSetChanged();
            return;
        }
        C22682.m50793(R.string.MT_Protector);
    }
}
