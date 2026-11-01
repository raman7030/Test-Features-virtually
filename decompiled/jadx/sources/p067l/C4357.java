package p067l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.֫᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O3Z6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4357 extends C9541 {

    /* JADX INFO: renamed from: ᩳ */
    public BitSet f9758;

    public C4357(int i) {
        this.f9758 = new BitSet(i);
    }

    @Override // p067l.C9541
    /* JADX INFO: renamed from: ܽ */
    public final void mo8998(int i) {
        this.f9758.set(i);
    }

    @Override // p067l.C9541, p067l.InterfaceC15575
    /* JADX INFO: renamed from: ۧ */
    public final int mo8997(int i) {
        int i2 = 0;
        for (int i3 = this.f26232[super.mo22240(i) - 1]; i3 < i; i3++) {
            i2 = this.f9758.get(i3) ? ((i2 / 8) * 8) + 8 : i2 + 1;
        }
        return i2 + 1;
    }
}
