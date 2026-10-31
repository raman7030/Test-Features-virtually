package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.֡ۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BH0 */
/* JADX INFO: loaded from: classes2.dex */
public final enum C0167 extends EnumC0873 {
    public /* synthetic */ C0167() {
        this("ODD", 1);
    }

    public C0167(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC0873
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int mo1286(BitSet bitSet, int i) {
        int iNextClearBit = bitSet.nextClearBit(i);
        while (C14984.m35484(iNextClearBit)) {
            iNextClearBit = bitSet.nextClearBit(iNextClearBit + 1);
        }
        return iNextClearBit;
    }
}
