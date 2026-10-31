package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4Y9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10828 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f32571;

    public C10828(ArrayList arrayList) {
        this.f32571 = new int[arrayList.size()];
        int iMo3974 = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            this.f32571[i] = iMo3974;
            iMo3974 += ((InterfaceC22677) arrayList.get(i)).mo3974();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m27073(int i, boolean z) {
        int iBinarySearch = Arrays.binarySearch(this.f32571, i);
        if (iBinarySearch >= 0) {
            return iBinarySearch;
        }
        if (z) {
            throw new C1655(null, "No instruction at offset %d", Integer.valueOf(i));
        }
        return (~iBinarySearch) - 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m27072(int i) {
        if (i >= 0) {
            int[] iArr = this.f32571;
            if (i < iArr.length) {
                return iArr[i];
            }
        }
        throw new C7796(null, "Instruction index out of bounds: %d", Integer.valueOf(i));
    }
}
