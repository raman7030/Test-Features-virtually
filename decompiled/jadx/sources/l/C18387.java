package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ᩳ᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: CBHG */
/* JADX INFO: loaded from: classes5.dex */
public final class C18387 extends AbstractC11849 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C18387 f57102 = new C18387();

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final int mo7129() {
        return 3;
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final String mo7130(AbstractC10438 abstractC10438) {
        return abstractC10438.m13993().m41004get(0).m48644() + ", " + abstractC10438.mo13992();
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ۧ */
    public final String mo7133(AbstractC10438 abstractC10438) {
        return abstractC10438.mo13988();
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo7134(AbstractC4793 abstractC4793) {
        C21480 c21480M41004get;
        if (!(abstractC4793 instanceof C21727)) {
            return false;
        }
        C20069 c20069M13993 = abstractC4793.m13993();
        int size = c20069M13993.size();
        if (size == 1) {
            c21480M41004get = c20069M13993.m41004get(0);
        } else {
            if (size != 2) {
                return false;
            }
            c21480M41004get = c20069M13993.m41004get(0);
            if (c21480M41004get.m48652() != c20069M13993.m41004get(1).m48652()) {
                return false;
            }
        }
        if (!AbstractC11849.m28953(c21480M41004get.m48652())) {
            return false;
        }
        AbstractC13717 abstractC13717M49053 = ((C21727) abstractC4793).m49053();
        return (abstractC13717M49053 instanceof C12512) || (abstractC13717M49053 instanceof C8985) || (abstractC13717M49053 instanceof C13217);
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final BitSet mo7131(AbstractC4793 abstractC4793) {
        C20069 c20069M13993 = abstractC4793.m13993();
        int size = c20069M13993.size();
        BitSet bitSet = new BitSet(size);
        boolean zM28953 = AbstractC11849.m28953(c20069M13993.m41004get(0).m48652());
        if (size == 1) {
            bitSet.set(0, zM28953);
            return bitSet;
        }
        if (c20069M13993.m41004get(0).m48652() == c20069M13993.m41004get(1).m48652()) {
            bitSet.set(0, zM28953);
            bitSet.set(1, zM28953);
        }
        return bitSet;
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final void mo7132(C18241 c18241, AbstractC10438 abstractC10438) {
        C20069 c20069M13993 = abstractC10438.m13993();
        AbstractC11849.m28952(c18241, AbstractC11849.m28950(abstractC10438, c20069M13993.m41004get(0).m48652()), ((C21727) abstractC10438).m49054());
    }
}
