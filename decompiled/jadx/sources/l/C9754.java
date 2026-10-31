package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۢᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BHG */
/* JADX INFO: loaded from: classes3.dex */
public final class C9754 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6931 f29524;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f29525;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9048 f29526;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f29527 = new HashMap();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f29528;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f29529;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final BitSet f29530;

    public C9754(C9048 c9048, C6931 c6931, ArrayList arrayList) {
        this.f29526 = c9048;
        this.f29530 = new BitSet(c9048.f27439);
        this.f29524 = c6931;
        this.f29525 = arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24734(C16540 c16540) {
        C21064 c21064M47910;
        int i = 0;
        this.f29528 = c16540.m38911().get(0);
        int i2 = 1;
        int i3 = c16540.m38911().get(1);
        this.f29529 = i3;
        int iM24733 = m24733(i3);
        BitSet bitSet = this.f29530;
        int iNextSetBit = bitSet.nextSetBit(0);
        while (true) {
            ArrayList arrayList = this.f29525;
            C9048 c9048 = this.f29526;
            if (iNextSetBit >= 0) {
                bitSet.clear(iNextSetBit);
                int iIntValue = ((Integer) this.f29527.get(Integer.valueOf(iNextSetBit))).intValue();
                C16540 c16540M23358 = c9048.m23358(iNextSetBit);
                C21064 c21064M38911 = c16540M23358.m38911();
                int i4 = -1;
                if (C9048.m23356(c9048, c16540M23358)) {
                    int iM24734 = m24733(c21064M38911.get(i));
                    int i5 = c21064M38911.get(i2);
                    c21064M47910 = new C21064(2);
                    c21064M47910.add(iM24734);
                    c21064M47910.add(i5);
                    c21064M47910.mo20349();
                } else {
                    C21043 c21043M23359 = C9048.m23359(c9048, iNextSetBit);
                    if (c21043M23359 != null) {
                        if (c21043M23359.f67900 != this.f29529) {
                            throw new RuntimeException("ret instruction returns to label " + C14712.m35006(c21043M23359.f67900) + " expected: " + C14712.m35006(this.f29529));
                        }
                        c21064M47910 = C21064.m47910(this.f29528);
                        i4 = this.f29528;
                    } else {
                        int iM38913 = c16540M23358.m38913();
                        int size = c21064M38911.size();
                        C21064 c21064 = new C21064(size);
                        for (int i6 = 0; i6 < size; i6++) {
                            int i7 = c21064M38911.get(i6);
                            int iM24735 = m24733(i7);
                            c21064.add(iM24735);
                            if (iM38913 == i7) {
                                i4 = iM24735;
                            }
                        }
                        c21064.mo20349();
                        c21064M47910 = c21064;
                    }
                }
                C2430 c2430M38916 = c16540M23358.m38916();
                int size2 = c2430M38916.size();
                int i8 = 0;
                for (int i9 = 0; i9 < size2; i9++) {
                    if (c2430M38916.m41001get(i9).m37484() != C12307.f36809) {
                        i8++;
                    }
                }
                if (i8 != size2) {
                    C2430 c2430 = new C2430(i8);
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < size2) {
                        AbstractC15834 abstractC15834M41001get = c2430M38916.m41001get(i10);
                        C2430 c2431 = c2430M38916;
                        int i12 = size2;
                        if (abstractC15834M41001get.m37484() != C12307.f36809) {
                            c2430.m40986(i11, abstractC15834M41001get);
                            i11++;
                        }
                        i10++;
                        c2430M38916 = c2431;
                        size2 = i12;
                    }
                    c2430.mo20349();
                    c2430M38916 = c2430;
                }
                c9048.m23355(new C16540(iIntValue, c2430M38916, c21064M47910, i4), (C21064) arrayList.get(iIntValue));
                if (C9048.m23356(c9048, c9048.m23358(iNextSetBit))) {
                    new C9754(c9048, this.f29524, arrayList).m24734(c9048.m23358(iIntValue));
                }
                i = 0;
                iNextSetBit = bitSet.nextSetBit(0);
                i2 = 1;
            } else {
                C9048.m23361(c9048, new C16540(c16540.mo2269(), c16540.m38916(), C21064.m47910(iM24733), iM24733), (C21064) arrayList.get(c16540.mo2269()));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m24733(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f29527;
        Integer num = (Integer) map.get(numValueOf);
        if (num != null) {
            return num.intValue();
        }
        int i2 = this.f29529;
        ArrayList arrayList = this.f29525;
        C21064 c21064 = (C21064) arrayList.get(i);
        if (c21064 == null || c21064.size() <= 0 || c21064.m47917() != i2) {
            return i;
        }
        int iMo18741 = this.f29524.mo18741();
        this.f29530.set(i);
        map.put(Integer.valueOf(i), Integer.valueOf(iMo18741));
        while (arrayList.size() <= iMo18741) {
            arrayList.add(null);
        }
        arrayList.set(iMo18741, (C21064) arrayList.get(i));
        return iMo18741;
    }
}
