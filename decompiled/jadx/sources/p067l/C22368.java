package p067l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.᩷ᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BHG */
/* JADX INFO: loaded from: classes4.dex */
public final class C22368 {

    /* JADX INFO: renamed from: ֫ */
    public BitSet f70583;

    /* JADX INFO: renamed from: ۧ */
    public BitSet f70584;

    /* JADX INFO: renamed from: ܽ */
    public int f70585;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C10968 f70586;

    public C22368(C10968 c10968, int i) {
        this.f70586 = c10968;
        this.f70585 = i;
        this.f70584 = new BitSet(c10968.f30376);
        this.f70583 = new BitSet(c10968.f30376);
        c10968.f30380 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m50208() {
        return this.f70585;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m50212(int i) {
        this.f70584.set(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50209(int i) {
        this.f70583.set(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C22388 m50211() {
        BitSet bitSet = this.f70583;
        C22388 c22388 = new C22388(bitSet.size());
        for (int iNextSetBit = bitSet.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1)) {
            c22388.add(this.f70586.m25303(iNextSetBit).m41137().get(0));
        }
        c22388.mo22326();
        return c22388;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50210(C14280 c14280, int[] iArr) {
        BitSet bitSet = this.f70583;
        for (int iNextSetBit = bitSet.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1)) {
            C10968 c10968 = this.f70586;
            int i = c10968.m25303(iNextSetBit).m41137().get(0);
            C14280 c14280M32822 = c14280.m32822(this.f70585, iNextSetBit);
            if (c14280M32822 != null) {
                c10968.m25295(i, -1, null, c14280M32822, iArr);
            } else {
                C15268.m34739(iNextSetBit, iArr);
            }
        }
    }
}
