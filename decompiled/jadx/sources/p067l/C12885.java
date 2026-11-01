package p067l;

/* JADX INFO: renamed from: l.ۧܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12885 extends AbstractC4838 {

    /* JADX INFO: renamed from: c */
    public final Object[] f36240c;

    public C12885(InterfaceC7324 interfaceC7324, Object[] objArr) {
        super(interfaceC7324);
        this.f36240c = objArr;
    }

    public C12885(C12885 c12885, InterfaceC7324 interfaceC7324, int i) {
        super(c12885, interfaceC7324, i);
        this.f36240c = c12885.f36240c;
    }

    @Override // p067l.AbstractC4838
    /* JADX INFO: renamed from: b */
    public final AbstractC4838 mo10265b(int i, int i2) {
        return new C12885(this, this.f11003a.mo3496a(i), i2);
    }

    @Override // p067l.AbstractC4838
    /* JADX INFO: renamed from: a */
    public final void mo10264a() {
        this.f11003a.mo3498k(this.f36240c, this.f11004b);
    }
}
