package l;

/* JADX INFO: renamed from: l.᩵᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48CR */
/* JADX INFO: loaded from: classes4.dex */
public final class C19666 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C21782 f63519;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC22487 f63520;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC21077[] f63521;

    /* JADX WARN: Multi-variable type inference failed */
    public C19666(C0614 c0614, int i, AbstractC22487 abstractC22487) {
        this.f63520 = abstractC22487;
        this.f63521 = new InterfaceC21077[i];
        for (int i2 = 0; i2 < i; i2++) {
            Object objMo19031 = abstractC22487.mo19031();
            ((C7216) c0614.f2370).m19307((AbstractC23898) objMo19031);
            this.f63521[i2] = objMo19031;
        }
        this.f63519 = new C21782(this.f63521);
    }
}
