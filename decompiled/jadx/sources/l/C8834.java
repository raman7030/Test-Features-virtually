package l;

import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: renamed from: l.ۡۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9I0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8834 extends C16614 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C16614 f26906;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final SecretKey f26907;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15888 f26908;

    public C8834(C15888 c15888, C16614 c16614, SecretKey secretKey) {
        this.f26908 = c15888;
        this.f26906 = c16614;
        this.f26907 = secretKey;
    }

    @Override // l.C16614, l.InterfaceC0446
    /* JADX INFO: renamed from: ܽ */
    public final void mo2003(C0097 c0097) {
        C16614 c16614 = this.f26906;
        C0097 c0098 = new C0097(c16614.mo3029());
        c16614.mo2003(c0098);
        byte[] bArrM26081 = c0098.m26081();
        int iM26091 = c0098.m26091();
        C15888 c15888 = this.f26908;
        byte[] bArrM37664 = c15888.m37664();
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArrM37664, 0, bArrM37664.length);
        C8854 c8854 = new C8854(((C23670) c16614.mo3028()).m52203(), iM26091, bArrM37664);
        byte[] bArrM37658 = C15888.m37658(c8854);
        try {
            C2215 c2215 = c15888.f49103;
            String strM1879 = c15888.f49101.m1879();
            c2215.getClass();
            InterfaceC3791 interfaceC3791M9432 = C3085.m9432(strM1879);
            interfaceC3791M9432.mo11448(EnumC18608.ENCRYPT, this.f26907.getEncoded(), gCMParameterSpec);
            interfaceC3791M9432.mo11449(bArrM37658);
            byte[] bArrMo11450 = interfaceC3791M9432.mo11450(iM26091, bArrM26081);
            if (bArrMo11450.length != iM26091 + 16) {
                throw new IllegalStateException("Invalid length for cipherText after encryption.");
            }
            byte[] bArrM22873 = c8854.m22873();
            System.arraycopy(bArrMo11450, iM26091, bArrM22873, 0, bArrM22873.length);
            c8854.m22874(c0097);
            c0097.m26077(iM26091, bArrMo11450);
        } catch (C8024 e) {
            C15888.f49100.mo7079(c16614.mo3028(), "Security exception while encrypting packet << {} >>");
            throw new C10951(e);
        }
    }

    @Override // l.AbstractC0803
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC5037 mo3028() {
        return (C23670) this.f26906.mo3028();
    }

    @Override // l.C16614
    /* JADX INFO: renamed from: ܿ */
    public final int mo7975() {
        return this.f26906.mo7975();
    }

    @Override // l.AbstractC0803
    /* JADX INFO: renamed from: ܽ */
    public final int mo3029() {
        return this.f26906.mo3029() + 52;
    }

    @Override // l.C16614
    public final String toString() {
        return "Encrypted[" + this.f26906.toString() + "]";
    }

    @Override // l.C16614
    /* JADX INFO: renamed from: ܳ */
    public final C16614 mo7973() {
        return this.f26906.mo7973();
    }
}
