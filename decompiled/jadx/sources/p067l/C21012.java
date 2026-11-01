package p067l;

/* JADX INFO: renamed from: l.᩵ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21012 extends AbstractC3400 {

    /* JADX INFO: renamed from: b */
    public long f65952b;

    /* JADX INFO: renamed from: c */
    public long f65953c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C14975 f65954d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21012(C14975 c14975, InterfaceC2925 interfaceC2925) {
        super(interfaceC2925);
        this.f65954d = c14975;
        this.f65952b = c14975.f42782s;
        long j = c14975.f42783t;
        this.f65953c = j < 0 ? C14849.FOREVER_NS : j;
    }

    @Override // p067l.AbstractC3400, p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        this.f6750a.mo4231c(AbstractC23592.m52399a(j, this.f65954d.f42782s, this.f65953c));
    }

    @Override // p067l.InterfaceC12274, p067l.InterfaceC2925
    public final void accept(int i) {
        long j = this.f65952b;
        if (j == 0) {
            long j2 = this.f65953c;
            if (j2 > 0) {
                this.f65953c = j2 - 1;
                this.f6750a.accept(i);
                return;
            }
            return;
        }
        this.f65952b = j - 1;
    }

    @Override // p067l.AbstractC3400, p067l.InterfaceC2925
    /* JADX INFO: renamed from: f */
    public final boolean mo4233f() {
        return this.f65953c == 0 || this.f6750a.mo4233f();
    }
}
