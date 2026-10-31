package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.᩷ᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BHG */
/* JADX INFO: loaded from: classes4.dex */
public final class C21043 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public BitSet f67898;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public BitSet f67899;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f67900;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9048 f67901;

    public C21043(C9048 c9048, int i) {
        this.f67901 = c9048;
        this.f67900 = i;
        this.f67899 = new BitSet(c9048.f27439);
        this.f67898 = new BitSet(c9048.f27439);
        c9048.f27443 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m47878() {
        return this.f67900;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m47882(int i) {
        this.f67899.set(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47879(int i) {
        this.f67898.set(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21064 m47881() {
        BitSet bitSet = this.f67898;
        C21064 c21064 = new C21064(bitSet.size());
        for (int iNextSetBit = bitSet.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1)) {
            c21064.add(this.f67901.m23358(iNextSetBit).m38911().get(0));
        }
        c21064.mo20349();
        return c21064;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47880(C12533 c12533, int[] iArr) {
        BitSet bitSet = this.f67898;
        for (int iNextSetBit = bitSet.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1)) {
            C9048 c9048 = this.f67901;
            int i = c9048.m23358(iNextSetBit).m38911().get(0);
            C12533 c12533M30750 = c12533.m30750(this.f67900, iNextSetBit);
            if (c12533M30750 != null) {
                c9048.m23350(i, -1, null, c12533M30750, iArr);
            } else {
                C13573.m32627(iNextSetBit, iArr);
            }
        }
    }
}
