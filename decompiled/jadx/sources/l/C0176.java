package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֡ۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: N4I6 */
/* JADX INFO: loaded from: classes2.dex */
public class C0176 extends AbstractC10056 {
    @Override // l.AbstractC10056
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1313(C10720 c10720, C12172 c12172) {
        ArrayList arrayList = this.f30234;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC5116 abstractC5116M21243 = C7938.m21243(this.f30232, this.f30233);
            arrayList.set(i, abstractC5116M21243);
            abstractC5116M21243.m14657(c10720, i, c12172);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC5116 m1314(int i) {
        try {
            return (AbstractC5116) this.f30234.get(i);
        } catch (Exception e) {
            throw C16363.m38521("Error occured while retrieving the " + this.f30233.f45739 + " item at index " + i, e);
        }
    }
}
