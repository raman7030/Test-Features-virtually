package p067l;

/* JADX INFO: renamed from: l.ᩳܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19590 extends AbstractC8094 {

    /* JADX INFO: renamed from: b */
    public long f59604b;

    /* JADX INFO: renamed from: c */
    public long f59605c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C20261 f59606d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19590(C20261 c20261, InterfaceC2925 interfaceC2925) {
        super(interfaceC2925);
        this.f59606d = c20261;
        this.f59604b = c20261.f62615s;
        long j = c20261.f62616t;
        this.f59605c = j < 0 ? C14849.FOREVER_NS : j;
    }

    @Override // p067l.AbstractC8094, p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        this.f21348a.mo4231c(AbstractC23592.m52399a(j, this.f59606d.f62615s, this.f59605c));
    }

    @Override // p067l.InterfaceC16336, p067l.InterfaceC2925
    public final void accept(long j) {
        long j2 = this.f59604b;
        if (j2 == 0) {
            long j3 = this.f59605c;
            if (j3 > 0) {
                this.f59605c = j3 - 1;
                this.f21348a.accept(j);
                return;
            }
            return;
        }
        this.f59604b = j2 - 1;
    }

    @Override // p067l.AbstractC8094, p067l.InterfaceC2925
    /* JADX INFO: renamed from: f */
    public final boolean mo4233f() {
        return this.f59605c == 0 || this.f21348a.mo4233f();
    }
}
