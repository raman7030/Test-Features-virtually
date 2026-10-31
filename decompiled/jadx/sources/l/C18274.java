package l;

import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.ᩳ᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: F4V4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18274 extends AbstractC18980 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f56817;

    public C18274() {
        super(EnumC1340.LOCAL);
    }

    public C18274(int i) {
        super(EnumC1340.LOCAL);
        this.f56817 = i;
    }

    @Override // l.AbstractC18980, l.AbstractC8396
    public final AbstractC8396 clone() {
        C18274 c18274 = new C18274(this.f56817);
        c18274.f25746 = this.f25746;
        return c18274;
    }

    @Override // l.AbstractC8396
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8396 mo6718(C1403 c1403) {
        return c1403.m4897(this);
    }

    @Override // l.AbstractC8396
    /* JADX INFO: renamed from: ܳ */
    public final String mo6719() {
        return am.av + this.f56817;
    }
}
