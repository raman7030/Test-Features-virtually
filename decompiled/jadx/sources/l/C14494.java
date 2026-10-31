package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ܳۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 36B9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14494 extends AbstractC22132 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44394;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20846 f44395;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44396;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ BitSet f44397;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14494(C20846 c20846, C12918 c12918, int i, int i2, BitSet bitSet, int i3) {
        super(c12918, i);
        this.f44395 = c20846;
        this.f44394 = i2;
        this.f44397 = bitSet;
        this.f44396 = i3;
    }

    @Override // l.AbstractC22132
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7600(C18729 c18729) {
        C20846 c20846 = this.f44395;
        C12918 c12918 = c20846.f67489;
        int iM43364 = c18729.m43364();
        int i = this.f44394;
        if (iM43364 >= i) {
            m4715();
            return null;
        }
        BitSet bitSet = this.f44397;
        if (bitSet != null && !bitSet.get((c18729.m43364() - this.f44396) / 2)) {
            C9183 c9183 = new C9183(c12918, EnumC0841.f3065, c18729.m43364());
            c18729.m43356(2);
            return c9183;
        }
        AbstractC9617 abstractC9617M24548 = AbstractC9617.m24548(c12918, c18729);
        int iM43365 = c18729.m43364();
        if (iM43365 > i || iM43365 < 0) {
            throw new C15431(null, "The last instruction in method %s is truncated", c20846.f67492);
        }
        return abstractC9617M24548;
    }
}
