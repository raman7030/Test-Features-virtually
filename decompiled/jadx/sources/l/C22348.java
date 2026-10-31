package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.᩹ܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BAJ */
/* JADX INFO: loaded from: classes.dex */
public final class C22348 extends AbstractC11849 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C22348 f72415 = new C22348();

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final int mo7129() {
        return 1;
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final String mo7130(AbstractC10438 abstractC10438) {
        return abstractC10438.m13993().m41004get(0).m48644() + ", " + AbstractC11849.m28946((AbstractC1223) ((C21727) abstractC10438).m49053());
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ۧ */
    public final String mo7133(AbstractC10438 abstractC10438) {
        return AbstractC11849.m28947((AbstractC1223) ((C21727) abstractC10438).m49053(), 4);
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo7134(AbstractC4793 abstractC4793) {
        int iMo2231;
        C20069 c20069M13993 = abstractC4793.m13993();
        if ((abstractC4793 instanceof C21727) && c20069M13993.size() == 1 && AbstractC11849.m28957(c20069M13993.m41004get(0).m48652())) {
            AbstractC13717 abstractC13717M49053 = ((C21727) abstractC4793).m49053();
            if (abstractC13717M49053 instanceof AbstractC1223) {
                AbstractC1223 abstractC1223 = (AbstractC1223) abstractC13717M49053;
                if (abstractC1223.mo2230() && (iMo2231 = abstractC1223.mo2231()) >= -8 && iMo2231 <= 7) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final BitSet mo7131(AbstractC4793 abstractC4793) {
        C20069 c20069M13993 = abstractC4793.m13993();
        BitSet bitSet = new BitSet(1);
        bitSet.set(0, AbstractC11849.m28957(c20069M13993.m41004get(0).m48652()));
        return bitSet;
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final void mo7132(C18241 c18241, AbstractC10438 abstractC10438) {
        c18241.m42511(AbstractC11849.m28950(abstractC10438, AbstractC11849.m28955(abstractC10438.m13993().m41004get(0).m48652(), ((AbstractC1223) ((C21727) abstractC10438).m49053()).mo2231() & 15)));
    }
}
