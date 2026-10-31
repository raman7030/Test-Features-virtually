package l;

/* JADX INFO: renamed from: l.ۡ᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OBBX */
/* JADX INFO: loaded from: classes3.dex */
public final class C9215 extends AbstractC11849 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C9215 f27905 = new C9215();

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final int mo7129() {
        return 4;
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final String mo7130(AbstractC10438 abstractC10438) {
        return AbstractC11849.m28959(abstractC10438.m13993()) + ", " + abstractC10438.mo13992();
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ۧ */
    public final String mo7133(AbstractC10438 abstractC10438) {
        return abstractC10438.mo13988();
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo7134(AbstractC4793 abstractC4793) {
        if (!(abstractC4793 instanceof C18115)) {
            return false;
        }
        C18115 c18115 = (C18115) abstractC4793;
        int iM42241 = c18115.m42241(0);
        int iM42242 = c18115.m42241(1);
        if (!AbstractC11849.m28960(iM42241) || !AbstractC11849.m28960(iM42242) || !(c18115.m42239(0) instanceof C22390) || !(c18115.m42239(1) instanceof C4751)) {
            return false;
        }
        C20069 c20069M13993 = c18115.m13993();
        int size = c20069M13993.size();
        if (size == 0) {
            return true;
        }
        return AbstractC11849.m28953(c20069M13993.m46253()) && AbstractC11849.m28960(size) && AbstractC11849.m28960(c20069M13993.m41004get(0).m48652()) && AbstractC11849.m28954(c20069M13993);
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final void mo7132(C18241 c18241, AbstractC10438 abstractC10438) {
        C18115 c18115 = (C18115) abstractC10438;
        short sM42241 = (short) c18115.m42241(0);
        short sM42242 = (short) c18115.m42241(1);
        C20069 c20069M13993 = abstractC10438.m13993();
        short sM48652 = c20069M13993.size() > 0 ? (short) c20069M13993.m41004get(0).m48652() : (short) 0;
        c18241.m42511(AbstractC11849.m28950(abstractC10438, c20069M13993.m46253()));
        c18241.m42511(sM42241);
        c18241.m42511(sM48652);
        c18241.m42511(sM42242);
    }
}
