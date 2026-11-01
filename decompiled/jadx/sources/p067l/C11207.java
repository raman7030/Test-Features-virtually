package p067l;

import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: renamed from: l.ۢۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: MBI9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11207 {

    /* JADX INFO: renamed from: ֫ */
    public final C21936[] f31135;

    /* JADX INFO: renamed from: ۧ */
    public final C21975 f31136;

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList f31137;

    public C11207(C21975 c21975) {
        this.f31136 = c21975;
        ArrayList arrayListM49517 = c21975.m49517();
        this.f31137 = arrayListM49517;
        int size = arrayListM49517.size();
        this.f31135 = new C21936[size];
        for (int i = 0; i < size; i++) {
            C21936[] c21936Arr = this.f31135;
            C21936 c21936 = new C21936();
            c21936.f68963 = -1;
            c21936Arr[i] = c21936;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C21936[] m25873() {
        InterfaceC11659 c6294;
        ArrayList arrayList = this.f31137;
        int size = arrayList.size();
        C21975 c21975 = this.f31136;
        C21936[] c21936Arr = this.f31135;
        C4501.m9515(c21975, c21936Arr);
        int size2 = arrayList.size();
        for (int i = 0; i < size2; i++) {
            int i2 = c21936Arr[i].f68963;
            if (i2 != -1) {
                ((C17950) arrayList.get(i2)).m40815((C17950) arrayList.get(i));
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            C21936 c21936 = c21936Arr[i3];
            if (size <= 3072) {
                c6294 = new C23986(size);
            } else {
                c6294 = new C6294();
            }
            c21936.f68962 = c6294;
        }
        int size3 = arrayList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            C17950 c17950 = (C17950) arrayList.get(i4);
            C21936 c21937 = c21936Arr[i4];
            BitSet bitSetM40841 = c17950.m40841();
            if (bitSetM40841.cardinality() > 1) {
                for (int iNextSetBit = bitSetM40841.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetM40841.nextSetBit(iNextSetBit + 1)) {
                    int i5 = iNextSetBit;
                    while (i5 != c21937.f68963 && i5 != -1) {
                        C21936 c21938 = c21936Arr[i5];
                        if (c21938.f68962.mo14296(i4)) {
                            break;
                        }
                        c21938.f68962.add(i4);
                        i5 = c21938.f68963;
                    }
                }
            }
        }
        return c21936Arr;
    }
}
