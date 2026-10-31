package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ܳܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAP5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14632 extends C17455 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC4571 f44741;

    public C14632(int[] iArr, int i, int i2, int i3, InterfaceC4571 interfaceC4571) {
        super(i, i2, i3 | 20, iArr);
        this.f44741 = interfaceC4571;
    }

    @Override // l.C17455
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17455 mo34928(int i, int i2) {
        return new C14632(this.f53322, i, i2, this.f53323, this.f44741);
    }

    @Override // l.C17455, l.InterfaceC15234
    public final Comparator getComparator() {
        return this.f44741;
    }

    @Override // l.C17455, l.InterfaceC16749, l.InterfaceC15234
    public final InterfaceC4571 getComparator() {
        return this.f44741;
    }
}
