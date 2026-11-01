package p067l;

/* JADX INFO: renamed from: l.ܶ᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N44J */
/* JADX INFO: loaded from: classes4.dex */
public final class C17076 extends AbstractC5678 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C15065 f50481;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C4022 f50482;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C4036 f50483;

    @Override // p067l.AbstractC5678
    /* JADX INFO: renamed from: ۧ */
    public final void mo12657() {
        mo12658();
        Object obj = this.f50483.f8849;
        C1446.m31704(((C7019) obj).f18287.m45780() % 2 == 0);
        ((C7019) obj).f18287.m45777(Integer.valueOf(this.f50481.f43029.m7054()));
    }

    @Override // p067l.AbstractC5678
    /* JADX INFO: renamed from: ܽ */
    public final void mo12658() {
        C15065 c15065 = this.f50481;
        if (c15065.f43029.m7069()) {
            C4022 c4022 = this.f50482;
            c4022.mo8027();
            c15065.f43029.m7062(195);
            C7690 c7690 = c15065.f43029.f7742;
            int i = c4022.f8792;
            int i2 = c7690.f20160 - 1;
            c7690.f20160 = i2;
            C1446.m31704(c7690.f20162[i2] == i);
            c7690.f20162[c7690.f20160] = -1;
        }
    }

    public C17076(C15065 c15065, C4036 c4036, C4022 c4022) {
        this.f50481 = c15065;
        this.f50483 = c4036;
        this.f50482 = c4022;
    }
}
