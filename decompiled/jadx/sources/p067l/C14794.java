package p067l;

/* JADX INFO: renamed from: l.۬ۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BCI */
/* JADX INFO: loaded from: classes4.dex */
public final class C14794 extends AbstractC25009 {

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC12548 f42197;

    public C14794(InterfaceC12548 interfaceC12548) {
        super("Exceptions");
        try {
            if (interfaceC12548.mo28931()) {
                throw new C21047("exceptions.isMutable()", null);
            }
            this.f42197 = interfaceC12548;
        } catch (NullPointerException unused) {
            throw new NullPointerException("exceptions == null");
        }
    }

    @Override // p067l.InterfaceC14320
    /* JADX INFO: renamed from: ֫ */
    public final int mo11873() {
        return (this.f42197.size() * 2) + 8;
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC12548 m33772() {
        return this.f42197;
    }
}
