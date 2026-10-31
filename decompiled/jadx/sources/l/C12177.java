package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5BL */
/* JADX INFO: loaded from: classes4.dex */
public final class C12177 extends AbstractC8649 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ArrayList f36315;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f36316;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C22055 f36317;

    @Override // l.AbstractC8649
    /* JADX INFO: renamed from: ֫ */
    public final void mo3237(AbstractC15452 abstractC15452) {
        ArrayList arrayList = this.f36316;
        ArrayList arrayList2 = this.f36315;
        int size = arrayList2.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Integer) arrayList2.get(i)).intValue();
        }
        int size2 = arrayList.size();
        C1342[] c1342Arr = new C1342[size2];
        for (int i2 = 0; i2 < size2; i2++) {
            c1342Arr[i2] = ((C22055) arrayList.get(i2)).m49617();
        }
        abstractC15452.mo28285(this.f36317.m49617(), iArr, c1342Arr);
        m22413(abstractC15452);
    }
}
