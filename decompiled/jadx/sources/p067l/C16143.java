package p067l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ܳۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 36B9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16143 extends AbstractC23402 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ int f47495;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C22180 f47496;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ int f47497;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ BitSet f47498;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16143(C22180 c22180, C14645 c14645, int i, int i2, BitSet bitSet, int i3) {
        super(c14645, i);
        this.f47496 = c22180;
        this.f47495 = i2;
        this.f47498 = bitSet;
        this.f47497 = i3;
    }

    @Override // p067l.AbstractC23402
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9671(C20168 c20168) {
        C22180 c22180 = this.f47496;
        C14645 c14645 = c22180.f70171;
        int iM45631 = c20168.m45631();
        int i = this.f47495;
        if (iM45631 >= i) {
            m6947();
            return null;
        }
        BitSet bitSet = this.f47498;
        if (bitSet != null && !bitSet.get((c20168.m45631() - this.f47497) / 2)) {
            C11096 c11096 = new C11096(c14645, EnumC3167.f5839, c20168.m45631());
            c20168.m45623(2);
            return c11096;
        }
        AbstractC11508 abstractC11508M26561 = AbstractC11508.m26561(c14645, c20168);
        int iM45632 = c20168.m45631();
        if (iM45632 > i || iM45632 < 0) {
            throw new C17034(null, "The last instruction in method %s is truncated", c22180.f70174);
        }
        return abstractC11508M26561;
    }
}
