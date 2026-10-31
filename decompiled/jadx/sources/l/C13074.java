package l;

/* JADX INFO: renamed from: l.۬ۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BCI */
/* JADX INFO: loaded from: classes4.dex */
public final class C13074 extends AbstractC23822 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10711 f39149;

    public C13074(InterfaceC10711 interfaceC10711) {
        super("Exceptions");
        try {
            if (interfaceC10711.mo26891()) {
                throw new C19653("exceptions.isMutable()", null);
            }
            this.f39149 = interfaceC10711;
        } catch (NullPointerException unused) {
            throw new NullPointerException("exceptions == null");
        }
    }

    @Override // l.InterfaceC12575
    /* JADX INFO: renamed from: ֫ */
    public final int mo9828() {
        return (this.f39149.size() * 2) + 8;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10711 m31684() {
        return this.f39149;
    }
}
