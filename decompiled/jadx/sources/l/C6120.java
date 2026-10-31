package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ۛܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OBBO */
/* JADX INFO: loaded from: classes3.dex */
public final class C6120 extends AbstractC11849 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C6120 f18757 = new C6120();

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final int mo7129() {
        return 2;
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final String mo7130(AbstractC10438 abstractC10438) {
        return abstractC10438.m13993().m41004get(0).m48644() + ", " + AbstractC11849.m28961(abstractC10438);
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ۧ */
    public final String mo7133(AbstractC10438 abstractC10438) {
        return AbstractC11849.m28958(abstractC10438);
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo7134(AbstractC4793 abstractC4793) {
        C20069 c20069M13993 = abstractC4793.m13993();
        if (!(abstractC4793 instanceof C5415) || c20069M13993.size() != 1 || !AbstractC11849.m28953(c20069M13993.m41004get(0).m48652())) {
            return false;
        }
        C5415 c5415 = (C5415) abstractC4793;
        if (c5415.m15498()) {
            return mo10098(c5415);
        }
        return true;
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
    public final boolean mo10098(C5415 c5415) {
        int iM15497 = c5415.m15497();
        return iM15497 != 0 && ((short) iM15497) == iM15497;
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final void mo7132(C18241 c18241, AbstractC10438 abstractC10438) {
        AbstractC11849.m28951((InterfaceC5813) c18241, AbstractC11849.m28950(abstractC10438, abstractC10438.m13993().m41004get(0).m48652()), (short) ((C5415) abstractC10438).m15497());
    }
}
