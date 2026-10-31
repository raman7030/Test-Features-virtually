package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.֫᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O3Z6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2092 extends C7547 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public BitSet f6974;

    public C2092(int i) {
        this.f6974 = new BitSet(i);
    }

    @Override // l.C7547
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo6872(int i) {
        this.f6974.set(i);
    }

    @Override // l.C7547, l.InterfaceC13896
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo6871(int i) {
        int i2 = 0;
        for (int i3 = this.f23319[super.mo20264(i) - 1]; i3 < i; i3++) {
            i2 = this.f6974.get(i3) ? ((i2 / 8) * 8) + 8 : i2 + 1;
        }
        return i2 + 1;
    }
}
