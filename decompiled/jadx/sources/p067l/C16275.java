package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ܳܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAP5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16275 extends C18958 {

    /* JADX INFO: renamed from: ۬ */
    public final InterfaceC6713 f47848;

    public C16275(int[] iArr, int i, int i2, int i3, InterfaceC6713 interfaceC6713) {
        super(i, i2, i3 | 20, iArr);
        this.f47848 = interfaceC6713;
    }

    @Override // p067l.C18958
    /* JADX INFO: renamed from: ֫ */
    public final C18958 mo37075(int i, int i2) {
        return new C16275(this.f56510, i, i2, this.f56511, this.f47848);
    }

    @Override // p067l.C18958, p067l.InterfaceC16847
    public final Comparator getComparator() {
        return this.f47848;
    }

    @Override // p067l.C18958, p067l.InterfaceC18287, p067l.InterfaceC16847
    public final InterfaceC6713 getComparator() {
        return this.f47848;
    }
}
