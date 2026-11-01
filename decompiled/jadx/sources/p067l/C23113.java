package p067l;

/* JADX INFO: renamed from: l.᩸᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N44J */
/* JADX INFO: loaded from: classes.dex */
public final class C23113 extends AbstractC5678 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C15065 f72627;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C4036 f72628;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C12622 f72629;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C4036 f72630;

    @Override // p067l.AbstractC5678
    /* JADX INFO: renamed from: ۧ */
    public final void mo12657() {
        Object obj = this.f72630.f8849;
        C1446.m31704(((C7019) obj).f18287.m45780() % 2 == 0);
        ((C7019) obj).f18287.m45777(Integer.valueOf(this.f72627.f43029.m7054()));
        mo12658();
    }

    @Override // p067l.AbstractC5678
    /* JADX INFO: renamed from: ܽ */
    public final void mo12658() {
        C4968 c4968 = this.f72629.f35424;
        if (c4968 != null) {
            this.f72627.m34461(c4968, this.f72628, 2);
        }
    }

    @Override // p067l.AbstractC5678
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo12659() {
        return this.f72629.f35424 != null;
    }

    @Override // p067l.AbstractC5678
    /* JADX INFO: renamed from: ֫ */
    public final void mo12656() {
        C4968 c4968 = this.f72629.f35424;
        if (c4968 == null || (c4968.f11317 & 131072) == 0) {
            return;
        }
        ((C7019) this.f72630.f8849).f18285 = null;
    }

    public C23113(C15065 c15065, C4036 c4036, C12622 c12622, C4036 c4037) {
        this.f72627 = c15065;
        this.f72630 = c4036;
        this.f72629 = c12622;
        this.f72628 = c4037;
    }
}
