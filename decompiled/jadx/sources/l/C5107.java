package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ۚۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BH0 */
/* JADX INFO: loaded from: classes3.dex */
public final enum C5107 extends EnumC0873 {
    public /* synthetic */ C5107() {
        this("UNSPECIFIED", 2);
    }

    public C5107(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC0873
    /* JADX INFO: renamed from: ֫ */
    public int mo1286(BitSet bitSet, int i) {
        return bitSet.nextClearBit(i);
    }
}
