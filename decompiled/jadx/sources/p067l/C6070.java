package p067l;

import javax.crypto.SecretKey;

/* JADX INFO: renamed from: l.ۘۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9HI */
/* JADX INFO: loaded from: classes3.dex */
public final class C6070 implements InterfaceC21493 {

    /* JADX INFO: renamed from: ᩶ */
    public static final InterfaceC4410 f15273 = C13128.m30022(C6070.class);

    /* JADX INFO: renamed from: ᩹ */
    public static final /* synthetic */ int f15274 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public C4473 f15275;

    public C6070(C4473 c4473) {
        this.f15275 = c4473;
    }

    @Override // p067l.InterfaceC21493
    /* JADX INFO: renamed from: ֫ */
    public final C18158 mo10526(C18158 c18158, SecretKey secretKey) {
        if (secretKey != null) {
            return new C4729(this, c18158, secretKey);
        }
        f15273.mo9195(((C24864) c18158.mo5341()).m54620(), "Not wrapping {} as signed, as no key is set.");
        return c18158;
    }
}
