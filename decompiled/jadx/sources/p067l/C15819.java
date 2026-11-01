package p067l;

import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ܰ᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5QL */
/* JADX INFO: loaded from: classes4.dex */
public final class C15819 extends AbstractC5289 {

    /* JADX INFO: renamed from: ۗ */
    public final C21677 f45797;

    /* JADX INFO: renamed from: ۤ */
    public final C23648 f45798;

    /* JADX INFO: renamed from: ۫ */
    public final boolean f45799;

    /* JADX INFO: renamed from: ۬ */
    public byte[] f45800;

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final void mo5192(C3948 c3948) {
    }

    public C15819(C21677 c21677, boolean z, C23648 c23648) {
        super(1, -1);
        if (c21677 == null) {
            throw new NullPointerException("code == null");
        }
        this.f45797 = c21677;
        this.f45799 = z;
        this.f45798 = c23648;
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final EnumC5960 mo5191() {
        return EnumC5960.TYPE_DEBUG_INFO_ITEM;
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۧ */
    public final void mo5195(C6630 c6630, int i) {
        try {
            byte[] bArrM35896 = m35896(c6630.m18447(), null, null, false);
            this.f45800 = bArrM35896;
            m11431(bArrM35896.length);
        } catch (RuntimeException e) {
            throw C10101.m23569("...while placing debug info for " + this.f45798.mo4819(), e);
        }
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۢ */
    public final String mo5193() {
        throw new RuntimeException("unsupported");
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m35897(C3948 c3948, C19705 c19705) {
        m35896(c3948, ASN1Dump.TAB, c19705, false);
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۧ */
    public final void mo5194(C3948 c3948, C19705 c19705) {
        if (c19705.m44765()) {
            c19705.m44762(m11433() + " debug info");
            m35896(c3948, null, c19705, true);
        }
        c19705.m44764(this.f45800);
    }

    /* JADX INFO: renamed from: ֫ */
    private byte[] m35896(C3948 c3948, String str, C19705 c19705, boolean z) {
        C21677 c21677 = this.f45797;
        C22268 c22268M48924 = c21677.m48924();
        C4162 c4162M48926 = c21677.m48926();
        C5583 c5583M48927 = c21677.m48927();
        C24537 c24537 = new C24537(c22268M48924, c4162M48926, c3948, c5583M48927.m12353(), c5583M48927.m12356(), this.f45799, this.f45798);
        if (c19705 == null) {
            return c24537.m54126();
        }
        return c24537.m54127(str, c19705, z);
    }
}
