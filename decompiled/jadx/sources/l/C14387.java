package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܳ۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14387 implements InterfaceC21403 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19328 f43349;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f43350;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22933 f43351;

    public C14387(C19328 c19328, C22933 c22933, ActivityC17169 activityC17169) {
        this.f43349 = c19328;
        this.f43351 = c22933;
        this.f43350 = activityC17169;
    }

    @Override // l.InterfaceC21403
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo22513() {
        return this.f43351.m51053();
    }

    @Override // l.InterfaceC21403
    /* JADX INFO: renamed from: ܽ */
    public final ActivityC17169 mo22516() {
        return this.f43350;
    }

    @Override // l.InterfaceC21403
    /* JADX INFO: renamed from: ۧ */
    public final void mo22515(int i) {
        this.f43351.m51045(i);
    }

    @Override // l.InterfaceC21403
    /* JADX INFO: renamed from: ֫ */
    public final void mo22512(int i, int i2) {
        this.f43350.m10218(R.string.MT_Protector, C4925.m14306(R.string.MT_Protector, Integer.valueOf(i2), Integer.valueOf(i)), false);
        C19328 c19328 = this.f43349;
        for (C23560 c23560 : c19328.f60758) {
            if (c23560.f75636) {
                c23560.f75635 = c23560.f75634;
                c23560.f75636 = false;
            }
        }
        c19328.f60764 = false;
        c19328.m44547();
        c19328.f60765.notifyDataSetChanged();
    }

    @Override // l.InterfaceC21403
    /* JADX INFO: renamed from: ۧ */
    public final void mo22514() {
        this.f43351.m51051();
    }
}
