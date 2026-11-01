package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ܺܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAP5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17616 extends C10912 {

    /* JADX INFO: renamed from: ۬ */
    public final InterfaceC6713 f52648;

    @Override // p067l.C10912
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC18287 mo25174(int i, int[] iArr) {
        C11755.m26983(iArr.length, 0, i);
        return new C16275(iArr, 0, i, this.f30250, this.f52648);
    }

    public C17616(InterfaceC16750 interfaceC16750, long j, InterfaceC6713 interfaceC6713) {
        super(interfaceC16750, j, 341);
        this.f52648 = interfaceC6713;
    }

    @Override // p067l.C10912, p067l.InterfaceC16847
    public final Comparator getComparator() {
        return this.f52648;
    }

    @Override // p067l.C10912, p067l.InterfaceC18287, p067l.InterfaceC16847
    public final InterfaceC6713 getComparator() {
        return this.f52648;
    }
}
