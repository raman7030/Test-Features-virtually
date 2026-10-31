package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ܳܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AQC */
/* JADX INFO: loaded from: classes5.dex */
public final class C14653 extends C17476 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC1790 f44786;

    public C14653(char[] cArr, int i, int i2, int i3, InterfaceC1790 interfaceC1790) {
        super(i, i2, cArr, i3 | 20);
        this.f44786 = interfaceC1790;
    }

    @Override // l.C17476
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17476 mo34942(int i, int i2) {
        return new C14653(this.f53413, i, i2, this.f53414, this.f44786);
    }

    @Override // l.C17476, l.InterfaceC15234
    public final Comparator getComparator() {
        return this.f44786;
    }

    @Override // l.C17476, l.InterfaceC16770, l.InterfaceC15234
    public final InterfaceC1790 getComparator() {
        return this.f44786;
    }
}
