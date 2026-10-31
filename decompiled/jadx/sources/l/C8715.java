package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡۜۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8715 implements InterfaceC21403 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15063 f26523;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f26524;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22933 f26525;

    public C8715(C15063 c15063, C22933 c22933, ActivityC17169 activityC17169) {
        this.f26523 = c15063;
        this.f26525 = c22933;
        this.f26524 = activityC17169;
    }

    @Override // l.InterfaceC21403
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo22513() {
        return this.f26525.m51053();
    }

    @Override // l.InterfaceC21403
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ActivityC17169 mo22516() {
        return this.f26524;
    }

    @Override // l.InterfaceC21403
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo22515(int i) {
        this.f26525.m51045(i);
    }

    @Override // l.InterfaceC21403
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo22512(int i, int i2) {
        this.f26524.m10218(R.string.MT_Protector, C4925.m14306(R.string.MT_Protector, Integer.valueOf(i2), Integer.valueOf(i)), false);
        C15063 c15063 = this.f26523;
        for (C15769 c15769 : c15063.f45998) {
            if (c15769.f48614) {
                c15769.f48613 = c15769.f48612;
                c15769.f48614 = false;
            }
        }
        c15063.f46000 = false;
        c15063.m35630();
        c15063.f45999.notifyDataSetChanged();
    }

    @Override // l.InterfaceC21403
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo22514() {
        this.f26525.m51051();
    }
}
