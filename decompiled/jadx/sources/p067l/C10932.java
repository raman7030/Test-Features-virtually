package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۡܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AQC */
/* JADX INFO: loaded from: classes4.dex */
public final class C10932 extends C11603 {

    /* JADX INFO: renamed from: ۬ */
    public final InterfaceC4070 f30303;

    @Override // p067l.C11603
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC18307 mo25199(char[] cArr, int i) {
        C11755.m26983(cArr.length, 0, i);
        return new C16295(cArr, 0, i, this.f32366, this.f30303);
    }

    public C10932(InterfaceC16809 interfaceC16809, long j, InterfaceC4070 interfaceC4070) {
        super(interfaceC16809, j, 341);
        this.f30303 = interfaceC4070;
    }

    @Override // p067l.C11603, p067l.InterfaceC16847
    public final Comparator getComparator() {
        return this.f30303;
    }

    @Override // p067l.C11603, p067l.InterfaceC18307, p067l.InterfaceC16847
    public final InterfaceC4070 getComparator() {
        return this.f30303;
    }
}
