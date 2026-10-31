package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.᩶ܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: JBFN */
/* JADX INFO: loaded from: classes5.dex */
public final class C20232 extends AbstractC11849 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C20232 f65442 = new C20232();

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final int mo7129() {
        return 1;
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ۧ */
    public final String mo7133(AbstractC10438 abstractC10438) {
        return "";
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final String mo7130(AbstractC10438 abstractC10438) {
        return abstractC10438.m13993().m41004get(0).m48644();
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo7134(AbstractC4793 abstractC4793) {
        C20069 c20069M13993 = abstractC4793.m13993();
        return (abstractC4793 instanceof C18821) && c20069M13993.size() == 1 && AbstractC11849.m28953(c20069M13993.m41004get(0).m48652());
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final BitSet mo7131(AbstractC4793 abstractC4793) {
        C20069 c20069M13993 = abstractC4793.m13993();
        BitSet bitSet = new BitSet(1);
        bitSet.set(0, AbstractC11849.m28953(c20069M13993.m41004get(0).m48652()));
        return bitSet;
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final void mo7132(C18241 c18241, AbstractC10438 abstractC10438) {
        c18241.m42511(AbstractC11849.m28950(abstractC10438, abstractC10438.m13993().m41004get(0).m48652()));
    }
}
