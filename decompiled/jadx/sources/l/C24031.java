package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.᩻᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: DBFV */
/* JADX INFO: loaded from: classes.dex */
public final class C24031 extends AbstractC11849 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C24031 f77858 = new C24031();

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final int mo7129() {
        return 3;
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ۧ */
    public final String mo7133(AbstractC10438 abstractC10438) {
        return "";
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final String mo7130(AbstractC10438 abstractC10438) {
        C20069 c20069M13993 = abstractC10438.m13993();
        return c20069M13993.m41004get(0).m48644() + ", " + c20069M13993.m41004get(1).m48644();
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo7134(AbstractC4793 abstractC4793) {
        C20069 c20069M13993 = abstractC4793.m13993();
        return (abstractC4793 instanceof C18821) && c20069M13993.size() == 2 && AbstractC11849.m28960(c20069M13993.m41004get(0).m48652()) && AbstractC11849.m28960(c20069M13993.m41004get(1).m48652());
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final BitSet mo7131(AbstractC4793 abstractC4793) {
        C20069 c20069M13993 = abstractC4793.m13993();
        BitSet bitSet = new BitSet(2);
        bitSet.set(0, AbstractC11849.m28960(c20069M13993.m41004get(0).m48652()));
        bitSet.set(1, AbstractC11849.m28960(c20069M13993.m41004get(1).m48652()));
        return bitSet;
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final void mo7132(C18241 c18241, AbstractC10438 abstractC10438) {
        C20069 c20069M13993 = abstractC10438.m13993();
        short sM28950 = AbstractC11849.m28950(abstractC10438, 0);
        short sM48652 = (short) c20069M13993.m41004get(0).m48652();
        short sM48653 = (short) c20069M13993.m41004get(1).m48652();
        c18241.m42511(sM28950);
        c18241.m42511(sM48652);
        c18241.m42511(sM48653);
    }
}
