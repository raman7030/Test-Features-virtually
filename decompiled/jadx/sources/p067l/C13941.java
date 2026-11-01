package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5BL */
/* JADX INFO: loaded from: classes4.dex */
public final class C13941 extends AbstractC10588 {

    /* JADX INFO: renamed from: ۜ */
    public ArrayList f39326;

    /* JADX INFO: renamed from: ᩷ */
    public ArrayList f39327;

    /* JADX INFO: renamed from: ᩻ */
    public C23329 f39328;

    @Override // p067l.AbstractC10588
    /* JADX INFO: renamed from: ֫ */
    public final void mo5551(AbstractC17054 abstractC17054) {
        ArrayList arrayList = this.f39327;
        ArrayList arrayList2 = this.f39326;
        int size = arrayList2.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Integer) arrayList2.get(i)).intValue();
        }
        int size2 = arrayList.size();
        C3644[] c3644Arr = new C3644[size2];
        for (int i2 = 0; i2 < size2; i2++) {
            c3644Arr[i2] = ((C23329) arrayList.get(i2)).m51953();
        }
        abstractC17054.mo30329(this.f39328.m51953(), iArr, c3644Arr);
        m24382(abstractC17054);
    }
}
