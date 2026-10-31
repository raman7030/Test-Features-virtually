package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۡܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AQC */
/* JADX INFO: loaded from: classes4.dex */
public final class C9010 extends C9716 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC1790 f27369;

    @Override // l.C9716
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC16770 mo23255(char[] cArr, int i) {
        C9876.m24968(cArr.length, 0, i);
        return new C14653(cArr, 0, i, this.f29417, this.f27369);
    }

    public C9010(InterfaceC15194 interfaceC15194, long j, InterfaceC1790 interfaceC1790) {
        super(interfaceC15194, j, 341);
        this.f27369 = interfaceC1790;
    }

    @Override // l.C9716, l.InterfaceC15234
    public final Comparator getComparator() {
        return this.f27369;
    }

    @Override // l.C9716, l.InterfaceC16770, l.InterfaceC15234
    public final InterfaceC1790 getComparator() {
        return this.f27369;
    }
}
