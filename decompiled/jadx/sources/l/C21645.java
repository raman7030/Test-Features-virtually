package l;

/* JADX INFO: renamed from: l.᩸ܳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77JV */
/* JADX INFO: loaded from: classes5.dex */
public class C21645 extends C22350 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f69474;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f69475;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13041 f69476;

    @Override // l.C22350, l.AbstractC2867
    /* JADX INFO: renamed from: ֫ */
    public boolean mo8780(C12392 c12392, boolean z, boolean z2, int i, int i2) {
        return true;
    }

    public C21645(int i, int i2, InterfaceC13041 interfaceC13041) {
        super(14);
        this.f69474 = i;
        this.f69475 = i2;
        this.f69476 = interfaceC13041;
    }

    @Override // l.C22350
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int mo48910() {
        return this.f69474;
    }

    @Override // l.C22350
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int mo48911() {
        return this.f69475;
    }

    @Override // l.C22350, l.AbstractC2867
    /* JADX INFO: renamed from: ֫ */
    public final void mo8779(C12392 c12392) {
        this.f69476.accept(c12392);
    }
}
