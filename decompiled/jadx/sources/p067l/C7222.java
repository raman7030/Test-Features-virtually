package p067l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ۚۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BH0 */
/* JADX INFO: loaded from: classes3.dex */
public final enum C7222 extends EnumC3198 {
    public /* synthetic */ C7222() {
        this("UNSPECIFIED", 2);
    }

    public C7222(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC3198
    /* JADX INFO: renamed from: ֫ */
    public int mo3694(BitSet bitSet, int i) {
        return bitSet.nextClearBit(i);
    }
}
