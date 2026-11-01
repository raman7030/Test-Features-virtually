package p067l;

import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: renamed from: l.۬ۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TBH1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14598 implements InterfaceC12587 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ArrayList f41684;

    public C14598(ArrayList arrayList) {
        this.f41684 = arrayList;
    }

    @Override // p067l.InterfaceC12587
    /* JADX INFO: renamed from: ֫ */
    public final void mo26104(C17950 c17950, C17950 c17951) {
        ArrayList arrayListM40832 = c17950.m40832();
        if (arrayListM40832.size() == 1 && ((AbstractC15938) arrayListM40832.get(0)).mo31602() == C14065.f39817) {
            BitSet bitSet = (BitSet) c17950.m40841().clone();
            for (int iNextSetBit = bitSet.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1)) {
                ((C17950) this.f41684.get(iNextSetBit)).m40813(c17950.m40826(), c17950.m40840());
            }
        }
    }
}
