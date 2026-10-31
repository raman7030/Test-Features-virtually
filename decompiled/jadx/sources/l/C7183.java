package l;

import java.util.BitSet;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAJX */
/* JADX INFO: loaded from: classes2.dex */
public final class C7183 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final BitSet f21981;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m19201(C20630 c20630) {
        BitSet bitSet;
        C18658 c18658M48653;
        C18658 c18658M48654;
        C7183 c7183 = new C7183(c20630);
        int iM47186 = c20630.m47186();
        int i = 0;
        while (true) {
            bitSet = c7183.f21981;
            if (i >= iM47186) {
                break;
            }
            AbstractC14278 abstractC14278M47194 = c20630.m47194(i);
            if (abstractC14278M47194 != null && abstractC14278M47194.m34042().mo5255() == 0) {
                bitSet.set(i);
            }
            i++;
        }
        while (true) {
            int iNextSetBit = bitSet.nextSetBit(0);
            if (iNextSetBit < 0) {
                return;
            }
            bitSet.clear(iNextSetBit);
            C13532 c13532 = (C13532) c20630.m47194(iNextSetBit);
            c13532.m32570(c20630);
            C20069 c20069Mo29535 = c13532.mo29535();
            int size = c20069Mo29535.size();
            int i2 = -1;
            C21480 c21480 = null;
            for (int i3 = 0; i3 < size; i3++) {
                C21480 c21480M41004get = c20069Mo29535.m41004get(i3);
                if (c21480M41004get.mo5255() != 0) {
                    i2 = i3;
                    c21480 = c21480M41004get;
                }
            }
            if (c21480 != null) {
                C18658 c18658M48655 = c21480.m48653();
                InterfaceC1538 type = c21480.getType();
                boolean z = true;
                for (int i4 = 0; i4 < size; i4++) {
                    if (i4 != i2) {
                        C21480 c21480M41004get2 = c20069Mo29535.m41004get(i4);
                        if (c21480M41004get2.mo5255() != 0) {
                            z = z && (c18658M48655 == (c18658M48654 = c21480M41004get2.m48653()) || (c18658M48655 != null && c18658M48655.equals(c18658M48654)));
                            type = C22927.m51030(type, c21480M41004get2.getType());
                        }
                    }
                }
                if (type == null) {
                    StringBuilder sb = new StringBuilder();
                    for (int i5 = 0; i5 < size; i5++) {
                        sb.append(c20069Mo29535.m41004get(i5).toString());
                        sb.append(' ');
                    }
                    throw new RuntimeException("Couldn't map types in phi insn:" + ((Object) sb));
                }
                C18658 c18658 = z ? c18658M48655 : null;
                C21480 c21480M34042 = c13532.m34042();
                if (c21480M34042.m48637() != type || (c18658 != (c18658M48653 = c21480M34042.m48653()) && (c18658 == null || !c18658.equals(c18658M48653)))) {
                    c13532.m34041(C21480.m48636(c13532.m34042().m48652(), type, c18658));
                    List listM47199 = c20630.m47199(iNextSetBit);
                    int size2 = listM47199.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        AbstractC14278 abstractC14278 = (AbstractC14278) listM47199.get(i6);
                        C21480 c21480M34043 = abstractC14278.m34042();
                        if (c21480M34043 != null && (abstractC14278 instanceof C13532)) {
                            bitSet.set(c21480M34043.m48652());
                        }
                    }
                }
            }
        }
    }

    public C7183(C20630 c20630) {
        this.f21981 = new BitSet(c20630.m47186());
    }
}
