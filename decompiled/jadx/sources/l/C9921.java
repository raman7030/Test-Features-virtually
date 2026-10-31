package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ۢ᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7BBQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9921 extends AbstractC11849 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C9921 f29995 = new C9921();

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final int mo7129() {
        return 4;
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final String mo7130(AbstractC10438 abstractC10438) {
        return AbstractC11849.m28956(m25030(abstractC10438.m13993())) + ", " + abstractC10438.mo13992();
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
        if (c18115.m42238() != 2) {
            return false;
        }
        return AbstractC11849.m28960(c18115.m42241(0)) && AbstractC11849.m28960(c18115.m42241(1)) && (c18115.m42239(0) instanceof C22390) && (c18115.m42239(1) instanceof C4751) && m25029(c18115.m13993()) >= 0;
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final BitSet mo7131(AbstractC4793 abstractC4793) {
        C20069 c20069M13993 = abstractC4793.m13993();
        int size = c20069M13993.size();
        BitSet bitSet = new BitSet(size);
        for (int i = 0; i < size; i++) {
            C21480 c21480M41004get = c20069M13993.m41004get(i);
            bitSet.set(i, AbstractC11849.m28957((c21480M41004get.m48645() + c21480M41004get.m48652()) - 1));
        }
        return bitSet;
    }

    @Override // l.AbstractC11849
    /* JADX INFO: renamed from: ֫ */
    public final void mo7132(C18241 c18241, AbstractC10438 abstractC10438) {
        C18115 c18115 = (C18115) abstractC10438;
        short sM42241 = (short) c18115.m42241(0);
        short sM42242 = (short) c18115.m42241(1);
        C20069 c20069M25030 = m25030(abstractC10438.m13993());
        int size = c20069M25030.size();
        int iM48652 = size > 0 ? c20069M25030.m41004get(0).m48652() : 0;
        int iM48653 = size > 1 ? c20069M25030.m41004get(1).m48652() : 0;
        int iM48654 = size > 2 ? c20069M25030.m41004get(2).m48652() : 0;
        int iM48655 = size > 3 ? c20069M25030.m41004get(3).m48652() : 0;
        short sM28950 = AbstractC11849.m28950(abstractC10438, AbstractC11849.m28955(size > 4 ? c20069M25030.m41004get(4).m48652() : 0, size));
        short sM28949 = AbstractC11849.m28949(iM48652, iM48653, iM48654, iM48655);
        c18241.m42511(sM28950);
        c18241.m42511(sM42241);
        c18241.m42511(sM28949);
        c18241.m42511(sM42242);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int m25029(C20069 c20069) {
        int size = c20069.size();
        if (size > 5) {
            return -1;
        }
        int iM48645 = 0;
        for (int i = 0; i < size; i++) {
            C21480 c21480M41004get = c20069.m41004get(i);
            iM48645 += c21480M41004get.m48645();
            if (!AbstractC11849.m28957((c21480M41004get.m48645() + c21480M41004get.m48652()) - 1)) {
                return -1;
            }
        }
        if (iM48645 <= 5) {
            return iM48645;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C20069 m25030(C20069 c20069) {
        int iM25029 = m25029(c20069);
        int size = c20069.size();
        if (iM25029 == size) {
            return c20069;
        }
        C20069 c200610 = new C20069(iM25029);
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C21480 c21480M41004get = c20069.m41004get(i2);
            c200610.m40988(i, c21480M41004get);
            if (c21480M41004get.m48645() == 2) {
                c200610.m40988(i + 1, C21480.m48631(c21480M41004get.m48652() + 1, C7573.f23406));
                i += 2;
            } else {
                i++;
            }
        }
        c200610.mo20349();
        return c200610;
    }
}
