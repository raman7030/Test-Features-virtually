package l;

/* JADX INFO: renamed from: l.ۗܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: MBBQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3298 extends AbstractC11849 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C3298 f10345 = new C3298();

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final int mo7129() {
        return 2;
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final String mo7130(AbstractC10438 abstractC10438) {
        return AbstractC11849.m28961(abstractC10438);
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ۧ */
    public final String mo7133(AbstractC10438 abstractC10438) {
        return AbstractC11849.m28958(abstractC10438);
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo7134(AbstractC4793 abstractC4793) {
        if (!(abstractC4793 instanceof C5415) || abstractC4793.m13993().size() != 0) {
            return false;
        }
        C5415 c5415 = (C5415) abstractC4793;
        if (c5415.m15498()) {
            return mo10098(c5415);
        }
        return true;
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo10098(C5415 c5415) {
        int iM15497 = c5415.m15497();
        return iM15497 != 0 && ((short) iM15497) == iM15497;
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final void mo7132(C18241 c18241, AbstractC10438 abstractC10438) {
        AbstractC11849.m28951((InterfaceC5813) c18241, AbstractC11849.m28950(abstractC10438, 0), (short) ((C5415) abstractC10438).m15497());
    }
}
