package p067l;

/* JADX INFO: renamed from: l.۫ᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14325 extends AbstractC25014 {

    /* JADX INFO: renamed from: b */
    public long f40951b;

    /* JADX INFO: renamed from: c */
    public long f40952c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C18999 f40953d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14325(C18999 c18999, InterfaceC2925 interfaceC2925) {
        super(interfaceC2925);
        this.f40953d = c18999;
        this.f40951b = c18999.f56646s;
        long j = c18999.f56647t;
        this.f40952c = j < 0 ? C14849.FOREVER_NS : j;
    }

    @Override // p067l.AbstractC25014, p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        this.f79851a.mo4231c(AbstractC23592.m52399a(j, this.f40953d.f56646s, this.f40952c));
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        long j = this.f40951b;
        if (j == 0) {
            long j2 = this.f40952c;
            if (j2 > 0) {
                this.f40952c = j2 - 1;
                this.f79851a.accept(obj);
                return;
            }
            return;
        }
        this.f40951b = j - 1;
    }

    @Override // p067l.AbstractC25014, p067l.InterfaceC2925
    /* JADX INFO: renamed from: f */
    public final boolean mo4233f() {
        return this.f40952c == 0 || this.f79851a.mo4233f();
    }
}
