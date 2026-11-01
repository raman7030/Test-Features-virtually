package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۛ᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8447 extends AbstractC24439 {

    /* JADX INFO: renamed from: ۜ */
    public int f22667;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ ActivityC8645 f22668;

    /* JADX INFO: renamed from: ᩷ */
    public C5584 f22669;

    /* JADX INFO: renamed from: ᩻ */
    public int f22670;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8447(ActivityC8645 activityC8645, ActivityC8645 activityC8646) {
        super(activityC8646);
        this.f22668 = activityC8645;
        this.f22667 = activityC8645.f23213.f78313.size();
        this.f22670 = 0;
    }

    @Override // p067l.AbstractC24439
    /* JADX INFO: renamed from: ֫ */
    public final String mo14037() {
        int i = this.f22670;
        if (i >= this.f22667) {
            return null;
        }
        C14971 c14971 = this.f22668.f23213.f78313;
        this.f22670 = i + 1;
        C5584 item = c14971.getItem(i);
        this.f22669 = item;
        return item.getValue();
    }

    @Override // p067l.AbstractC24439
    /* JADX INFO: renamed from: ֫ */
    public final void mo14039(String str) {
        this.f22669.m12357(str);
        this.f22668.f23213.f78333 = true;
    }

    @Override // p067l.AbstractC24439
    /* JADX INFO: renamed from: ֫ */
    public final void mo14038(int i) {
        if (i > 0) {
            Object[] objArr = {Integer.valueOf(i)};
            ActivityC8645 activityC8645 = this.f22668;
            C22682.m50795((CharSequence) activityC8645.getString(R.string.MT_Protector, objArr));
            activityC8645.f23216.notifyDataSetChanged();
            return;
        }
        C22682.m50793(R.string.MT_Protector);
    }
}
