package l;

import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: renamed from: l.۬ۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TBH1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12868 implements InterfaceC10752 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f38640;

    public C12868(ArrayList arrayList) {
        this.f38640 = arrayList;
    }

    @Override // l.InterfaceC10752
    /* JADX INFO: renamed from: ֫ */
    public final void mo24095(C16395 c16395, C16395 c16396) {
        ArrayList arrayListM38615 = c16395.m38615();
        if (arrayListM38615.size() == 1 && ((AbstractC14278) arrayListM38615.get(0)).mo29537() == C12307.f36802) {
            BitSet bitSet = (BitSet) c16395.m38624().clone();
            for (int iNextSetBit = bitSet.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1)) {
                ((C16395) this.f38640.get(iNextSetBit)).m38596(c16395.m38609(), c16395.m38623());
            }
        }
    }
}
