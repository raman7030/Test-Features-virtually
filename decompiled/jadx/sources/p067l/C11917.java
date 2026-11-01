package p067l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TBH1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11917 {

    /* JADX INFO: renamed from: ֫ */
    public final C23316 f33156;

    /* JADX INFO: renamed from: ֫ */
    public static C14735 m27231(C21975 c21975, boolean z) {
        int i;
        Iterator it;
        C9865 c9865M37648 = new C16609(c21975, new C11917(c21975, z).f33156).m37648();
        c21975.m49527();
        c21975.m49508(c9865M37648);
        ArrayList<C17950> arrayListM49517 = c21975.m49517();
        for (C17950 c17950 : arrayListM49517) {
            c17950.m40819(new C13928(arrayListM49517));
            c17950.m40810();
        }
        Iterator it2 = arrayListM49517.iterator();
        while (it2.hasNext()) {
            ((C17950) it2.next()).m40822();
        }
        int iM49529 = c21975.m49529();
        C17911 c17911 = new C17911(c21975.m49513());
        int iM49513 = c21975.m49513();
        int i2 = 0;
        while (true) {
            i = 1;
            if (i2 >= iM49513) {
                break;
            }
            if (i2 < iM49529) {
                c17911.mo23134(i2, (iM49513 - iM49529) + i2, 1);
            } else {
                c17911.mo23134(i2, i2 - iM49529, 1);
            }
            i2++;
        }
        c21975.m49508(c17911);
        c21975.m49503(new C14598(c21975.m49517()));
        ArrayList arrayListM49518 = c21975.m49517();
        C17950 c17950M49523 = c21975.m49523();
        BitSet bitSetM49501 = c21975.m49501();
        int iCardinality = bitSetM49501.cardinality();
        if (c17950M49523 != null && bitSetM49501.get(c17950M49523.m40826())) {
            iCardinality--;
        }
        C18759 c18759 = new C18759(iCardinality);
        Iterator it3 = arrayListM49518.iterator();
        int i3 = 0;
        while (it3.hasNext()) {
            C17950 c17951 = (C17950) it3.next();
            if (!bitSetM49501.get(c17951.m40826()) || c17951 == c17950M49523) {
                it = it3;
            } else {
                int i4 = i3 + 1;
                C22388 c22388M40831 = c17951.m40831();
                int iM40825 = c17951.m40825();
                C17950 c17950M49524 = c21975.m49523();
                int iM50242 = c22388M40831.m50242(c17950M49524 == null ? -1 : c17950M49524.m40824());
                if (iM50242 < 0) {
                    iM50242 = -1;
                }
                if (iM50242 >= 0) {
                    if (c22388M40831.size() > i) {
                        throw new RuntimeException("Exit predecessor must have no other successors".concat(C16351.m37153(c17951.m40824())));
                    }
                    c22388M40831 = C22388.f70620;
                    C5348 c5348Mo31602 = ((AbstractC15938) C20013.m45383(c17951.m40832(), i)).mo31602();
                    if (c5348Mo31602.m11601() != 2 && c5348Mo31602 != C14065.f39685) {
                        throw new RuntimeException("Exit predecessor must end in valid exit statement.");
                    }
                    iM40825 = -1;
                }
                c22388M40831.mo22326();
                int iM40824 = c17951.m40824();
                ArrayList arrayListM40832 = c17951.m40832();
                int size = arrayListM40832.size();
                C4678 c4678 = new C4678(size);
                int i5 = 0;
                while (i5 < size) {
                    c4678.m43246(i5, ((AbstractC15938) arrayListM40832.get(i5)).mo31603());
                    i5++;
                    it3 = it3;
                }
                it = it3;
                c4678.mo22326();
                c18759.m42780(i3, new C18088(iM40824, c4678, c22388M40831, iM40825));
                i3 = i4;
            }
            i = 1;
            it3 = it;
        }
        if (c17950M49523 == null || c17950M49523.m40832().isEmpty()) {
            return new C22646(new C14735(c18759, c21975.m49500(c21975.m49525()))).m50707();
        }
        throw new RuntimeException("Exit block must have no insns when leaving SSA form");
    }

    public C11917(C21975 c21975, boolean z) {
        this.f33156 = C6552.m14990(c21975);
    }
}
