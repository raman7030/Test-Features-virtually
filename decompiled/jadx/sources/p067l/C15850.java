package p067l;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ܳ֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9QE */
/* JADX INFO: loaded from: classes4.dex */
public final class C15850 implements InterfaceC11138 {

    /* JADX INFO: renamed from: ᩸ */
    public TreeMap f45910 = new TreeMap();

    @Override // p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        return true;
    }

    @Override // p067l.InterfaceC11138
    public final InterfaceC11138 mergeFrom(byte[] bArr) throws C4293 {
        try {
            AbstractC9303 abstractC9303M21516 = AbstractC9303.m21516(false, 0, bArr.length, bArr);
            m35973(abstractC9303M21516);
            abstractC9303M21516.mo21522(0);
            return this;
        } catch (C4293 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C15850 m35968() {
        return new C15850();
    }

    /* JADX INFO: renamed from: ֫ */
    private C24568 m35969(int i) {
        if (i == 0) {
            return null;
        }
        Integer numValueOf = Integer.valueOf(i);
        TreeMap treeMap = this.f45910;
        C24568 c24568 = (C24568) treeMap.get(numValueOf);
        if (c24568 != null) {
            return c24568;
        }
        int i2 = C8475.f22740;
        C24568 c24568M54167 = C24568.m54167();
        treeMap.put(Integer.valueOf(i), c24568M54167);
        return c24568M54167;
    }

    @Override // p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C11158 build() {
        TreeMap treeMap = this.f45910;
        if (treeMap.isEmpty()) {
            return C11158.m25741();
        }
        TreeMap treeMap2 = new TreeMap();
        for (Map.Entry entry : treeMap.entrySet()) {
            treeMap2.put((Integer) entry.getKey(), ((C24568) entry.getValue()).m54168());
        }
        return new C11158(treeMap2, 0);
    }

    @Override // p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC10467 buildPartial() {
        return build();
    }

    public final Object clone() {
        int i = C11158.f30970;
        C15850 c15850M35968 = m35968();
        for (Map.Entry entry : this.f45910.entrySet()) {
            c15850M35968.f45910.put((Integer) entry.getKey(), ((C24568) entry.getValue()).clone());
        }
        return c15850M35968;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35974(C11158 c11158) {
        if (c11158 != C11158.m25741()) {
            for (Map.Entry entry : c11158.f30971.entrySet()) {
                m35972(((Integer) entry.getKey()).intValue(), (C8475) entry.getValue());
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35970(int i, int i2) {
        if (i <= 0) {
            throw new IllegalArgumentException(i + " is not a valid field number.");
        }
        m35969(i).m54174(i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35971(int i, AbstractC7962 abstractC7962) {
        if (i <= 0) {
            throw new IllegalArgumentException(i + " is not a valid field number.");
        }
        m35969(i).m54171(abstractC7962);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35972(int i, C8475 c8475) {
        if (i <= 0) {
            throw new IllegalArgumentException(i + " is not a valid field number.");
        }
        Integer numValueOf = Integer.valueOf(i);
        TreeMap treeMap = this.f45910;
        if (treeMap.containsKey(numValueOf)) {
            m35969(i).m54172(c8475);
            return;
        }
        if (i <= 0) {
            throw new IllegalArgumentException(i + " is not a valid field number.");
        }
        Integer numValueOf2 = Integer.valueOf(i);
        int i2 = C8475.f22740;
        C24568 c24568M54167 = C24568.m54167();
        c24568M54167.m54172(c8475);
        treeMap.put(numValueOf2, c24568M54167);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35973(AbstractC9303 abstractC9303) {
        int iMo21535;
        do {
            iMo21535 = abstractC9303.mo21535();
            if (iMo21535 == 0) {
                return;
            }
        } while (m35975(iMo21535, abstractC9303));
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m35975(int i, AbstractC9303 abstractC9303) throws C9637 {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            m35969(i2).m54174(abstractC9303.mo21525());
            return true;
        }
        if (i3 == 1) {
            m35969(i2).m54170(abstractC9303.mo21531());
            return true;
        }
        if (i3 == 2) {
            m35969(i2).m54171(abstractC9303.mo21534());
            return true;
        }
        if (i3 == 3) {
            int i4 = C11158.f30970;
            C15850 c15850 = new C15850();
            abstractC9303.mo21523(i2, c15850, C3860.f8347);
            m35969(i2).m54173(c15850.build());
            return true;
        }
        if (i3 == 4) {
            return false;
        }
        if (i3 == 5) {
            m35969(i2).m54169(abstractC9303.mo21544());
            return true;
        }
        throw C4293.m8708();
    }

    @Override // p067l.InterfaceC11138
    public final InterfaceC11138 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m35973(abstractC9303);
        return this;
    }

    @Override // p067l.InterfaceC11138
    public final InterfaceC11138 mergeFrom(InterfaceC10467 interfaceC10467) {
        if (interfaceC10467 instanceof C11158) {
            m35974((C11158) interfaceC10467);
            return this;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
