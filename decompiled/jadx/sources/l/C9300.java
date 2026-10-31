package l;

import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: renamed from: l.ۢۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: MBI9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9300 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20589[] f28186;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20630 f28187;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f28188;

    public C9300(C20630 c20630) {
        this.f28187 = c20630;
        ArrayList arrayListM47190 = c20630.m47190();
        this.f28188 = arrayListM47190;
        int size = arrayListM47190.size();
        this.f28186 = new C20589[size];
        for (int i = 0; i < size; i++) {
            C20589[] c20589Arr = this.f28186;
            C20589 c20589 = new C20589();
            c20589.f66282 = -1;
            c20589Arr[i] = c20589;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20589[] m23864() {
        InterfaceC9775 c4130;
        ArrayList arrayList = this.f28188;
        int size = arrayList.size();
        C20630 c20630 = this.f28187;
        C20589[] c20589Arr = this.f28186;
        C2244.m7433(c20630, c20589Arr);
        int size2 = arrayList.size();
        for (int i = 0; i < size2; i++) {
            int i2 = c20589Arr[i].f66282;
            if (i2 != -1) {
                ((C16395) arrayList.get(i2)).m38598((C16395) arrayList.get(i));
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            C20589 c20589 = c20589Arr[i3];
            if (size <= 3072) {
                c4130 = new C22746(size);
            } else {
                c4130 = new C4130();
            }
            c20589.f66281 = c4130;
        }
        int size3 = arrayList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            C16395 c16395 = (C16395) arrayList.get(i4);
            C20589 c205810 = c20589Arr[i4];
            BitSet bitSetM38624 = c16395.m38624();
            if (bitSetM38624.cardinality() > 1) {
                for (int iNextSetBit = bitSetM38624.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetM38624.nextSetBit(iNextSetBit + 1)) {
                    int i5 = iNextSetBit;
                    while (i5 != c205810.f66282 && i5 != -1) {
                        C20589 c205811 = c20589Arr[i5];
                        if (c205811.f66281.mo12406(i4)) {
                            break;
                        }
                        c205811.f66281.add(i4);
                        i5 = c205811.f66282;
                    }
                }
            }
        }
        return c20589Arr;
    }
}
