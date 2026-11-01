package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ܳܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AQC */
/* JADX INFO: loaded from: classes5.dex */
public final class C16295 extends C18978 {

    /* JADX INFO: renamed from: ۬ */
    public final InterfaceC4070 f47893;

    public C16295(char[] cArr, int i, int i2, int i3, InterfaceC4070 interfaceC4070) {
        super(i, i2, cArr, i3 | 20);
        this.f47893 = interfaceC4070;
    }

    @Override // p067l.C18978
    /* JADX INFO: renamed from: ֫ */
    public final C18978 mo37089(int i, int i2) {
        return new C16295(this.f56600, i, i2, this.f56601, this.f47893);
    }

    @Override // p067l.C18978, p067l.InterfaceC16847
    public final Comparator getComparator() {
        return this.f47893;
    }

    @Override // p067l.C18978, p067l.InterfaceC18307, p067l.InterfaceC16847
    public final InterfaceC4070 getComparator() {
        return this.f47893;
    }
}
