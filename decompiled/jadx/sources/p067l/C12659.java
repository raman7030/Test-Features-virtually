package p067l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4Y9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12659 {

    /* JADX INFO: renamed from: ֫ */
    public final int[] f35547;

    public C12659(ArrayList arrayList) {
        this.f35547 = new int[arrayList.size()];
        int iMo6216 = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            this.f35547[i] = iMo6216;
            iMo6216 += ((InterfaceC23920) arrayList.get(i)).mo6216();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m29118(int i, boolean z) {
        int iBinarySearch = Arrays.binarySearch(this.f35547, i);
        if (iBinarySearch >= 0) {
            return iBinarySearch;
        }
        if (z) {
            throw new C3941(null, "No instruction at offset %d", Integer.valueOf(i));
        }
        return (~iBinarySearch) - 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m29117(int i) {
        if (i >= 0) {
            int[] iArr = this.f35547;
            if (i < iArr.length) {
                return iArr[i];
            }
        }
        throw new C9778(null, "Instruction index out of bounds: %d", Integer.valueOf(i));
    }
}
