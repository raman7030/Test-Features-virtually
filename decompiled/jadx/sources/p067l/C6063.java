package p067l;

/* JADX INFO: renamed from: l.ۘۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: QAND */
/* JADX INFO: loaded from: classes3.dex */
public final class C6063 implements InterfaceC20145 {

    /* JADX INFO: renamed from: ᩶ */
    public final C14160 f15242;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC17797 f15244 = C3380.f6683;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC21152 f15243 = C7404.f19377;

    public C6063(C14160 c14160) {
        this.f15242 = c14160;
    }

    @Override // p067l.InterfaceC20145
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13686(InterfaceC20816 interfaceC20816, InterfaceC13575 interfaceC13575) {
        C25114 c25114 = new C25114();
        c25114.f80364 = C6733.f17479;
        Object objMo13686 = this.f15242.mo13686(new C4722(this, c25114, interfaceC20816), interfaceC13575);
        return objMo13686 == EnumC9061.COROUTINE_SUSPENDED ? objMo13686 : C10027.f27775;
    }
}
