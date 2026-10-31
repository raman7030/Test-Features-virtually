package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ܺܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAP5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16043 extends C8989 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC4571 f49484;

    @Override // l.C8989
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC16749 mo23230(int i, int[] iArr) {
        C9876.m24968(iArr.length, 0, i);
        return new C14632(iArr, 0, i, this.f27316, this.f49484);
    }

    public C16043(InterfaceC15132 interfaceC15132, long j, InterfaceC4571 interfaceC4571) {
        super(interfaceC15132, j, 341);
        this.f49484 = interfaceC4571;
    }

    @Override // l.C8989, l.InterfaceC15234
    public final Comparator getComparator() {
        return this.f49484;
    }

    @Override // l.C8989, l.InterfaceC16749, l.InterfaceC15234
    public final InterfaceC4571 getComparator() {
        return this.f49484;
    }
}
