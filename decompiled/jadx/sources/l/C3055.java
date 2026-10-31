package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۗۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes3.dex */
public final class C3055 extends C21645 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12392 f9602;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3055(C12392 c12392, C10817 c10817) {
        super(R.string.MT_Protector, R.drawable.MT_Protector, c10817);
        this.f9602 = c12392;
    }

    @Override // l.C21645, l.C22350, l.AbstractC2867
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo8780(C12392 c12392, boolean z, boolean z2, int i, int i2) {
        C12392 c12393 = this.f9602;
        if (c12393.f37205 == null || !z) {
            return false;
        }
        C6870 c6870 = c12393.f37235;
        c12393.f37255 = (c12393.f37245.f73267 && c6870.m18575()) ? c6870.m18588(i, i2) : null;
        return (c12393.f37255 == null || c12393.f37255.m34927().m49200() == null) ? false : true;
    }
}
