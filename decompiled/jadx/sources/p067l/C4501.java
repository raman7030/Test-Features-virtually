package p067l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۖۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBDM */
/* JADX INFO: loaded from: classes2.dex */
public final class C4501 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f10102;

    /* JADX INFO: renamed from: ۧ */
    public final C10536[] f10103;

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList f10104;

    public C4501(C21975 c21975, C21936[] c21936Arr) {
        ArrayList arrayListM49517 = c21975.m49517();
        this.f10102 = arrayListM49517;
        this.f10103 = new C10536[arrayListM49517.size() + 2];
        this.f10104 = new ArrayList();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9515(C21975 c21975, C21936[] c21936Arr) {
        int i;
        C10536[] c10536Arr;
        int i2;
        C4501 c4501 = new C4501(c21975, c21936Arr);
        C17950 c17950M49522 = c21975.m49522();
        ArrayList arrayList = c4501.f10104;
        if (c17950M49522 != null) {
            arrayList.add(c17950M49522);
            c21936Arr[c17950M49522.m40826()].f68963 = c17950M49522.m40826();
        }
        c21975.m49503(new C17240(c4501));
        int size = arrayList.size() - 1;
        int i3 = size;
        while (true) {
            c10536Arr = c4501.f10103;
            if (i3 < 2) {
                break;
            }
            C17950 c17950 = (C17950) arrayList.get(i3);
            C10536 c10536 = c10536Arr[c17950.m40826()];
            BitSet bitSetM40841 = c17950.m40841();
            for (int iNextSetBit = bitSetM40841.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetM40841.nextSetBit(iNextSetBit + 1)) {
                C17950 c17951 = (C17950) c4501.f10102.get(iNextSetBit);
                if (c10536Arr[c17951.m40826()] != null && (i2 = c10536Arr[c4501.m9514(c17951).m40826()].f29160) < c10536.f29160) {
                    c10536.f29160 = i2;
                }
            }
            c10536Arr[((C17950) arrayList.get(c10536.f29160)).m40826()].f29158.add(c17950);
            C17950 c17952 = c10536.f29159;
            c10536.f29157 = c17952;
            ArrayList arrayList2 = c10536Arr[c17952.m40826()].f29158;
            while (!arrayList2.isEmpty()) {
                C17950 c17953 = (C17950) C6406.m14670(arrayList2, 1);
                C17950 c17950M9514 = c4501.m9514(c17953);
                if (c10536Arr[c17950M9514.m40826()].f29160 < c10536Arr[c17953.m40826()].f29160) {
                    c21936Arr[c17953.m40826()].f68963 = c17950M9514.m40826();
                } else {
                    c21936Arr[c17953.m40826()].f68963 = c10536.f29159.m40826();
                }
            }
            i3--;
        }
        for (i = 2; i <= size; i++) {
            C17950 c17954 = (C17950) arrayList.get(i);
            if (c21936Arr[c17954.m40826()].f68963 != ((C17950) arrayList.get(c10536Arr[c17954.m40826()].f29160)).m40826()) {
                c21936Arr[c17954.m40826()].f68963 = c21936Arr[c21936Arr[c17954.m40826()].f68963].f68963;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C17950 m9514(C17950 c17950) {
        int iM40826 = c17950.m40826();
        C10536[] c10536Arr = this.f10103;
        C10536 c10536 = c10536Arr[iM40826];
        if (c10536.f29157 == null) {
            return c17950;
        }
        if (c10536Arr[c10536Arr[c17950.m40826()].f29157.m40826()].f29157 != null) {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            arrayList.add(c17950);
            while (!arrayList.isEmpty()) {
                int size = arrayList.size() - 1;
                C10536 c10537 = c10536Arr[((C17950) arrayList.get(size)).m40826()];
                C17950 c17951 = c10537.f29157;
                C10536 c10538 = c10536Arr[c17951.m40826()];
                if (hashSet.add(c17951) && c10538.f29157 != null) {
                    arrayList.add(c17951);
                } else {
                    arrayList.remove(size);
                    if (c10538.f29157 != null) {
                        C17950 c17952 = c10538.f29161;
                        if (c10536Arr[c17952.m40826()].f29160 < c10536Arr[c10537.f29161.m40826()].f29160) {
                            c10537.f29161 = c17952;
                        }
                        c10537.f29157 = c10538.f29157;
                    }
                }
            }
        }
        return c10536.f29161;
    }
}
