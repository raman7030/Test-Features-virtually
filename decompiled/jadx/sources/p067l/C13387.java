package p067l;

import java.util.HashMap;
import org.bouncycastle.crypto.generators.SCrypt;

/* JADX INFO: renamed from: l.ۨۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7W8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13387 implements InterfaceC4019 {

    /* JADX INFO: renamed from: ֫ */
    public int f37568;

    /* JADX INFO: renamed from: ۧ */
    public int f37569;

    /* JADX INFO: renamed from: ܽ */
    public int f37570;

    /* JADX INFO: renamed from: ᩳ */
    public byte[] f37571;

    @Override // p067l.InterfaceC4019
    /* JADX INFO: renamed from: ֫ */
    public final void mo8021(byte[] bArr) throws C14392 {
        throw new C14392("initWithOpenSSHv1KDFOptions() not supported");
    }

    @Override // p067l.InterfaceC4019
    /* JADX INFO: renamed from: ֫ */
    public final void mo8020(HashMap map) throws C14392 {
        throw new C14392("initWithPPKv3Header() not supported");
    }

    @Override // p067l.InterfaceC4019
    /* JADX INFO: renamed from: ۧ */
    public final void mo8023(byte[] bArr) throws C14392 {
        try {
            C7352 c7352 = new C7352(bArr);
            if (!c7352.m17044()) {
                throw new C3328();
            }
            C7352[] c7352ArrM17039 = c7352.m17039();
            if (c7352ArrM17039.length < 4 || c7352ArrM17039.length > 5) {
                throw new C3328();
            }
            if (!c7352ArrM17039[0].m17038()) {
                throw new C3328();
            }
            if (!c7352ArrM17039[1].m17040()) {
                throw new C3328();
            }
            if (!c7352ArrM17039[2].m17040()) {
                throw new C3328();
            }
            if (!c7352ArrM17039[3].m17040()) {
                throw new C3328();
            }
            if (c7352ArrM17039.length > 4 && !c7352ArrM17039[4].m17040()) {
                throw new C3328();
            }
            this.f37571 = c7352ArrM17039[0].m17037();
            this.f37569 = C7352.m17034(c7352ArrM17039[1].m17037());
            this.f37568 = C7352.m17034(c7352ArrM17039[2].m17037());
            this.f37570 = C7352.m17034(c7352ArrM17039[3].m17037());
        } catch (Exception | LinkageError e) {
            if (e instanceof C14392) {
                throw ((C14392) e);
            }
            if (!(e instanceof C3328) && !(e instanceof ArithmeticException)) {
                throw new C14392("scrypt unavailable", e);
            }
            throw new C14392("invalid ASN1", e);
        }
    }

    @Override // p067l.InterfaceC4019
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo8022(int i, byte[] bArr) {
        return SCrypt.generate(bArr, this.f37571, this.f37569, this.f37568, this.f37570, i);
    }
}
