package p067l;

/* JADX INFO: renamed from: l.ۖ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5076 extends AbstractC8765 {

    /* JADX INFO: renamed from: b */
    public long f11896b;

    /* JADX INFO: renamed from: c */
    public long f11897c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C21840 f11898d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5076(C21840 c21840, InterfaceC2925 interfaceC2925) {
        super(interfaceC2925);
        this.f11898d = c21840;
        this.f11896b = c21840.f68723s;
        long j = c21840.f68724t;
        this.f11897c = j < 0 ? C14849.FOREVER_NS : j;
    }

    @Override // p067l.AbstractC8765, p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        this.f23785a.mo4231c(AbstractC23592.m52399a(j, this.f11898d.f68723s, this.f11897c));
    }

    @Override // p067l.InterfaceC7580, p067l.InterfaceC2925
    public final void accept(double d) {
        long j = this.f11896b;
        if (j == 0) {
            long j2 = this.f11897c;
            if (j2 > 0) {
                this.f11897c = j2 - 1;
                this.f23785a.accept(d);
                return;
            }
            return;
        }
        this.f11896b = j - 1;
    }

    @Override // p067l.AbstractC8765, p067l.InterfaceC2925
    /* JADX INFO: renamed from: f */
    public final boolean mo4233f() {
        return this.f11897c == 0 || this.f23785a.mo4233f();
    }
}
