package p067l;

import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: renamed from: l.ۡۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9I0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10764 extends C18158 {

    /* JADX INFO: renamed from: ܳ */
    public final C18158 f29830;

    /* JADX INFO: renamed from: ܿ */
    public final SecretKey f29831;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C17468 f29832;

    public C10764(C17468 c17468, C18158 c18158, SecretKey secretKey) {
        this.f29832 = c17468;
        this.f29830 = c18158;
        this.f29831 = secretKey;
    }

    @Override // p067l.C18158, p067l.InterfaceC2792
    /* JADX INFO: renamed from: ܽ */
    public final void mo4380(C2460 c2460) {
        C18158 c18158 = this.f29830;
        C2460 c2461 = new C2460(c18158.mo5342());
        c18158.mo4380(c2461);
        byte[] bArrM28106 = c2461.m28106();
        int iM28116 = c2461.m28116();
        C17468 c17468 = this.f29832;
        byte[] bArrM39836 = c17468.m39836();
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArrM39836, 0, bArrM39836.length);
        C10783 c10783 = new C10783(((C24864) c18158.mo5341()).m54606(), iM28116, bArrM39836);
        byte[] bArrM39830 = C17468.m39830(c10783);
        try {
            C4473 c4473 = c17468.f52243;
            String strM4270 = c17468.f52241.m4270();
            c4473.getClass();
            InterfaceC5971 interfaceC5971M11475 = C5300.m11475(strM4270);
            interfaceC5971M11475.mo13384(EnumC20053.ENCRYPT, this.f29831.getEncoded(), gCMParameterSpec);
            interfaceC5971M11475.mo13385(bArrM39830);
            byte[] bArrMo13386 = interfaceC5971M11475.mo13386(iM28116, bArrM28106);
            if (bArrMo13386.length != iM28116 + 16) {
                throw new IllegalStateException("Invalid length for cipherText after encryption.");
            }
            byte[] bArrM24844 = c10783.m24844();
            System.arraycopy(bArrMo13386, iM28116, bArrM24844, 0, bArrM24844.length);
            c10783.m24845(c2460);
            c2460.m28102(iM28116, bArrMo13386);
        } catch (C9994 e) {
            C17468.f52240.mo9174(c18158.mo5341(), "Security exception while encrypting packet << {} >>");
            throw new C12776(e);
        }
    }

    @Override // p067l.AbstractC3131
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC7155 mo5341() {
        return (C24864) this.f29830.mo5341();
    }

    @Override // p067l.C18158
    /* JADX INFO: renamed from: ܿ */
    public final int mo10023() {
        return this.f29830.mo10023();
    }

    @Override // p067l.AbstractC3131
    /* JADX INFO: renamed from: ܽ */
    public final int mo5342() {
        return this.f29830.mo5342() + 52;
    }

    @Override // p067l.C18158
    public final String toString() {
        return "Encrypted[" + this.f29830.toString() + "]";
    }

    @Override // p067l.C18158
    /* JADX INFO: renamed from: ܳ */
    public final C18158 mo10021() {
        return this.f29830.mo10021();
    }
}
