package p067l;

/* JADX INFO: renamed from: l.᩸ܳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77JV */
/* JADX INFO: loaded from: classes5.dex */
public class C22940 extends C23610 {

    /* JADX INFO: renamed from: ܳ */
    public final int f72177;

    /* JADX INFO: renamed from: ܿ */
    public final int f72178;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC1489 f72179;

    @Override // p067l.C23610, p067l.AbstractC5094
    /* JADX INFO: renamed from: ֫ */
    public boolean mo10847(C14146 c14146, boolean z, boolean z2, int i, int i2) {
        return true;
    }

    public C22940(int i, int i2, InterfaceC1489 interfaceC1489) {
        super(14);
        this.f72177 = i;
        this.f72178 = i2;
        this.f72179 = interfaceC1489;
    }

    @Override // p067l.C23610
    /* JADX INFO: renamed from: ܳ */
    public final int mo51258() {
        return this.f72177;
    }

    @Override // p067l.C23610
    /* JADX INFO: renamed from: ܿ */
    public final int mo51259() {
        return this.f72178;
    }

    @Override // p067l.C23610, p067l.AbstractC5094
    /* JADX INFO: renamed from: ֫ */
    public final void mo10846(C14146 c14146) {
        this.f72179.accept(c14146);
    }
}
