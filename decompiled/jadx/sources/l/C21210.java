package l;

/* JADX INFO: renamed from: l.᩷᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBEF */
/* JADX INFO: loaded from: classes5.dex */
public final class C21210 extends AbstractC11849 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C21210 f68344 = new C21210();

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final int mo7129() {
        return 3;
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
        if (!(abstractC4793 instanceof C21727)) {
            return false;
        }
        C21727 c21727 = (C21727) abstractC4793;
        int iM49054 = c21727.m49054();
        AbstractC13717 abstractC13717M49053 = c21727.m49053();
        if (!AbstractC11849.m28960(iM49054)) {
            return false;
        }
        if (!(abstractC13717M49053 instanceof C22390) && !(abstractC13717M49053 instanceof C12512) && !(abstractC13717M49053 instanceof C23801)) {
            return false;
        }
        C20069 c20069M13993 = c21727.m13993();
        c20069M13993.size();
        if (c20069M13993.size() != 0) {
            return AbstractC11849.m28954(c20069M13993) && AbstractC11849.m28960(c20069M13993.m41004get(0).m48652()) && AbstractC11849.m28953(c20069M13993.m46253());
        }
        return true;
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final void mo7132(C18241 c18241, AbstractC10438 abstractC10438) {
        C20069 c20069M13993 = abstractC10438.m13993();
        int iM49054 = ((C21727) abstractC10438).m49054();
        int iM48652 = c20069M13993.size() != 0 ? c20069M13993.m41004get(0).m48652() : 0;
        c18241.m42511(AbstractC11849.m28950(abstractC10438, c20069M13993.m46253()));
        c18241.m42511((short) iM49054);
        c18241.m42511((short) iM48652);
    }
}
