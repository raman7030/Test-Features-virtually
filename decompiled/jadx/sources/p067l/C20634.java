package p067l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.᩵ۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BH0 */
/* JADX INFO: loaded from: classes5.dex */
public final enum C20634 extends EnumC3198 {
    public /* synthetic */ C20634() {
        this("EVEN", 0);
    }

    public C20634(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC3198
    /* JADX INFO: renamed from: ֫ */
    public int mo3694(BitSet bitSet, int i) {
        int iNextClearBit = bitSet.nextClearBit(i);
        while (!C16609.m37640(iNextClearBit)) {
            iNextClearBit = bitSet.nextClearBit(iNextClearBit + 1);
        }
        return iNextClearBit;
    }
}
