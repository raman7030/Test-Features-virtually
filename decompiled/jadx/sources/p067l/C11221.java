package p067l;

/* JADX INFO: renamed from: l.ۢۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 274A */
/* JADX INFO: loaded from: classes3.dex */
public final class C11221 implements InterfaceC16716 {

    /* JADX INFO: renamed from: ۗ */
    public final InterfaceC16716 f31209;

    /* JADX INFO: renamed from: ۙ */
    public final C24905 f31210;

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC16716 f31211;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC24631 f31212;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f31213 = false;

    public C11221(C24905 c24905, InterfaceC16716 interfaceC16716, InterfaceC24631 interfaceC24631) {
        this.f31210 = c24905;
        this.f31209 = interfaceC16716;
        this.f31211 = interfaceC16716;
        this.f31212 = interfaceC24631;
    }

    public C11221(C24905 c24905, C23545 c23545, InterfaceC16716 interfaceC16716, C5781 c5781) {
        this.f31210 = c24905;
        this.f31209 = c23545;
        this.f31211 = interfaceC16716;
        this.f31212 = c5781;
    }

    public C11221(C24905 c24905, InterfaceC16716 interfaceC16716, InterfaceC16716 interfaceC16717, InterfaceC24631 interfaceC24631) {
        this.f31210 = c24905;
        this.f31209 = interfaceC16716;
        this.f31211 = interfaceC16717;
        this.f31212 = interfaceC24631;
    }

    @Override // p067l.InterfaceC16716
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC22753 mo8449() {
        return new C21950(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14900 m25969(C11221 c11221, C17762 c17762) {
        C21607 c21607 = new C21607();
        c21607.m48809(c17762);
        C5513 c5513 = new C5513();
        c5513.m12150(c17762);
        c5513.m12149(c11221.f31209);
        c5513.m12151(c21607);
        c5513.m12148(new C14403(6));
        c5513.m12147(2);
        c5513.m12152();
        return c5513.mo8449();
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC16716 m25970(C24905 c24905) {
        C17762 c17762M54691 = c24905.m54691();
        if (c17762M54691 == null) {
            return C17582.f52549;
        }
        C5513 c5513 = new C5513();
        c5513.m12150(c17762M54691);
        c5513.m12149((InterfaceC16716) null);
        c5513.m12151((C21607) null);
        c5513.m12148(new C15913());
        c5513.m12147(0);
        c5513.m12152();
        return c5513;
    }
}
