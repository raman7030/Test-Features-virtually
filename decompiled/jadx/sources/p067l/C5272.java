package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۗۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes3.dex */
public final class C5272 extends C22940 {

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C14146 f12403;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5272(C14146 c14146, C12649 c12649) {
        super(R.string.MT_Protector, R.drawable.MT_Protector, c12649);
        this.f12403 = c14146;
    }

    @Override // p067l.C22940, p067l.C23610, p067l.AbstractC5094
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10847(C14146 c14146, boolean z, boolean z2, int i, int i2) {
        C14146 c14147 = this.f12403;
        if (c14147.f40222 == null || !z) {
            return false;
        }
        C8898 c8898 = c14147.f40252;
        c14147.f40272 = (c14147.f40262.f75992 && c8898.m20524()) ? c8898.m20537(i, i2) : null;
        return (c14147.f40272 == null || c14147.f40272.m37074().m51551() == null) ? false : true;
    }
}
