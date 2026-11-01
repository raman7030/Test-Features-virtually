package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45FR */
/* JADX INFO: loaded from: classes3.dex */
public final class C5224 extends C12561 {

    /* JADX INFO: renamed from: ۜ */
    public ArrayList f12266;

    /* JADX INFO: renamed from: ᩷ */
    public ArrayList f12267;

    /* JADX INFO: renamed from: ᩻ */
    public ArrayList f12268;

    /* JADX INFO: renamed from: ֫ */
    public final void m11222(AbstractC17054 abstractC17054, boolean z) {
        ArrayList arrayList = this.f12267;
        int size = arrayList.size();
        C3644[] c3644Arr = new C3644[size];
        ArrayList arrayList2 = this.f12268;
        C3644[] c3644Arr2 = new C3644[arrayList2.size()];
        ArrayList arrayList3 = this.f12266;
        int[] iArr = new int[arrayList3.size()];
        for (int i = 0; i < size; i++) {
            c3644Arr[i] = ((C23329) arrayList.get(i)).m51953();
            c3644Arr2[i] = ((C23329) arrayList2.get(i)).m51953();
            iArr[i] = ((Integer) arrayList3.get(i)).intValue();
        }
        m39204(abstractC17054.mo29011(this.f35284, this.f35285, c3644Arr, c3644Arr2, iArr, this.f51590, z));
    }
}
