package p067l;

/* JADX INFO: renamed from: l.᩵᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48CR */
/* JADX INFO: loaded from: classes4.dex */
public final class C21059 {

    /* JADX INFO: renamed from: ֫ */
    public C23070 f66141;

    /* JADX INFO: renamed from: ۧ */
    public AbstractC23740 f66142;

    /* JADX INFO: renamed from: ܽ */
    public InterfaceC22400[] f66143;

    /* JADX WARN: Multi-variable type inference failed */
    public C21059(C2952 c2952, int i, AbstractC23740 abstractC23740) {
        this.f66142 = abstractC23740;
        this.f66143 = new InterfaceC22400[i];
        for (int i2 = 0; i2 < i; i2++) {
            Object objMo20988 = abstractC23740.mo20988();
            ((C9226) c2952.f5144).m21255((AbstractC25081) objMo20988);
            this.f66143[i2] = objMo20988;
        }
        this.f66141 = new C23070(this.f66143);
    }
}
