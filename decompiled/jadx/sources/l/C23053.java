package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.᩺ܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: BBEN */
/* JADX INFO: loaded from: classes.dex */
public final class C23053 extends AbstractC11849 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C23053 f74166 = new C23053();

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final int mo7129() {
        return 2;
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final String mo7130(AbstractC10438 abstractC10438) {
        C20069 c20069M13993 = abstractC10438.m13993();
        return c20069M13993.m41004get(0).m48644() + ", " + c20069M13993.m41004get(1).m48644() + ", " + abstractC10438.mo13992();
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ۧ */
    public final String mo7133(AbstractC10438 abstractC10438) {
        return abstractC10438.mo13988();
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo7134(AbstractC4793 abstractC4793) {
        C20069 c20069M13993 = abstractC4793.m13993();
        if (!(abstractC4793 instanceof C21727) || c20069M13993.size() != 2 || !AbstractC11849.m28957(c20069M13993.m41004get(0).m48652()) || !AbstractC11849.m28957(c20069M13993.m41004get(1).m48652())) {
            return false;
        }
        C21727 c21727 = (C21727) abstractC4793;
        if (!AbstractC11849.m28960(c21727.m49054())) {
            return false;
        }
        AbstractC13717 abstractC13717M49053 = c21727.m49053();
        return (abstractC13717M49053 instanceof C12512) || (abstractC13717M49053 instanceof C8985);
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final BitSet mo7131(AbstractC4793 abstractC4793) {
        C20069 c20069M13993 = abstractC4793.m13993();
        BitSet bitSet = new BitSet(2);
        bitSet.set(0, AbstractC11849.m28957(c20069M13993.m41004get(0).m48652()));
        bitSet.set(1, AbstractC11849.m28957(c20069M13993.m41004get(1).m48652()));
        return bitSet;
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final void mo7132(C18241 c18241, AbstractC10438 abstractC10438) {
        C20069 c20069M13993 = abstractC10438.m13993();
        AbstractC11849.m28951((InterfaceC5813) c18241, AbstractC11849.m28950(abstractC10438, AbstractC11849.m28955(c20069M13993.m41004get(0).m48652(), c20069M13993.m41004get(1).m48652())), (short) ((C21727) abstractC10438).m49054());
    }
}
