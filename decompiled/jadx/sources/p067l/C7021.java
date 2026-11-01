package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۙ᩷ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7021 extends C22940 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C4145 f18291;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C5680 f18292;

    @Override // p067l.AbstractC5094
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo10849() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7021(C5680 c5680, C21774 c21774, C4145 c4145) {
        super(R.string.MT_Protector, R.drawable.MT_Protector, c21774);
        this.f18292 = c5680;
        this.f18291 = c4145;
    }

    @Override // p067l.AbstractC5094
    /* JADX INFO: renamed from: ᩳ */
    public final void mo10850() {
        this.f18291.f9154 = false;
        C8362 c8362 = this.f18292.f13839;
        if (c8362.f22394) {
            c8362.f22377.invalidate();
        }
    }
}
