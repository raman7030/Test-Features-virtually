package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ܺ᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: CBAC */
/* JADX INFO: loaded from: classes4.dex */
public final class C16269 extends AbstractC11849 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C16269 f50039 = new C16269();

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final int mo7129() {
        return 5;
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final String mo7130(AbstractC10438 abstractC10438) {
        return abstractC10438.m13993().m41004get(0).m48644() + ", " + AbstractC11849.m28946((AbstractC1223) ((C21727) abstractC10438).m49053());
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ۧ */
    public final String mo7133(AbstractC10438 abstractC10438) {
        return AbstractC11849.m28947((AbstractC1223) ((C21727) abstractC10438).m49053(), 64);
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo7134(AbstractC4793 abstractC4793) {
        C20069 c20069M13993 = abstractC4793.m13993();
        if ((abstractC4793 instanceof C21727) && c20069M13993.size() == 1 && AbstractC11849.m28953(c20069M13993.m41004get(0).m48652())) {
            return ((C21727) abstractC4793).m49053() instanceof AbstractC5457;
        }
        return false;
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
        C20069 c20069M13993 = abstractC10438.m13993();
        long jMo2227 = ((AbstractC5457) ((C21727) abstractC10438).m49053()).mo2227();
        c18241.m42511(AbstractC11849.m28950(abstractC10438, c20069M13993.m41004get(0).m48652()));
        c18241.m42511((short) jMo2227);
        c18241.m42511((short) (jMo2227 >> 16));
        c18241.m42511((short) (jMo2227 >> 32));
        c18241.m42511((short) (jMo2227 >> 48));
    }
}
