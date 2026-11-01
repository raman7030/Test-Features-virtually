package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۘܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4646 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6195 extends AbstractC24439 {

    /* JADX INFO: renamed from: ۜ */
    public C5584 f15587;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ ActivityC10218 f15588;

    /* JADX INFO: renamed from: ᩷ */
    public C14971 f15589;

    /* JADX INFO: renamed from: ᩻ */
    public int f15590;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6195(ActivityC10218 activityC10218, ActivityC10218 activityC10219) {
        super(activityC10219);
        this.f15588 = activityC10218;
        this.f15589 = activityC10218.f28325.f7109.f49796;
        this.f15590 = 0;
    }

    @Override // p067l.AbstractC24439
    /* JADX INFO: renamed from: ֫ */
    public final String mo14037() {
        int i = this.f15590;
        C14971 c14971 = this.f15589;
        if (i >= c14971.size()) {
            return null;
        }
        int i2 = this.f15590;
        this.f15590 = i2 + 1;
        C5584 item = c14971.getItem(i2);
        this.f15587 = item;
        return item.getValue();
    }

    @Override // p067l.AbstractC24439
    /* JADX INFO: renamed from: ֫ */
    public final void mo14039(String str) {
        this.f15587.m12357(str);
        this.f15588.f28325.f7110 = true;
    }

    @Override // p067l.AbstractC24439
    /* JADX INFO: renamed from: ֫ */
    public final void mo14038(int i) {
        if (i > 0) {
            Object[] objArr = {Integer.valueOf(i)};
            ActivityC10218 activityC10218 = this.f15588;
            C22682.m50795((CharSequence) activityC10218.getString(R.string.MT_Protector, objArr));
            activityC10218.f28327.notifyDataSetChanged();
            return;
        }
        C22682.m50793(R.string.MT_Protector);
    }
}
