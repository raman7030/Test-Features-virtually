package l;

import java.util.HashMap;
import org.bouncycastle.crypto.generators.SCrypt;

/* JADX INFO: renamed from: l.ۨۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7W8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11594 implements InterfaceC1737 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f34570;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f34571;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f34572;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte[] f34573;

    @Override // l.InterfaceC1737
    /* JADX INFO: renamed from: ֫ */
    public final void mo5811(byte[] bArr) throws C12651 {
        throw new C12651("initWithOpenSSHv1KDFOptions() not supported");
    }

    @Override // l.InterfaceC1737
    /* JADX INFO: renamed from: ֫ */
    public final void mo5810(HashMap map) throws C12651 {
        throw new C12651("initWithPPKv3Header() not supported");
    }

    @Override // l.InterfaceC1737
    /* JADX INFO: renamed from: ۧ */
    public final void mo5813(byte[] bArr) throws C12651 {
        try {
            C5244 c5244 = new C5244(bArr);
            if (!c5244.m15141()) {
                throw new C1010();
            }
            C5244[] c5244ArrM15136 = c5244.m15136();
            if (c5244ArrM15136.length < 4 || c5244ArrM15136.length > 5) {
                throw new C1010();
            }
            if (!c5244ArrM15136[0].m15135()) {
                throw new C1010();
            }
            if (!c5244ArrM15136[1].m15137()) {
                throw new C1010();
            }
            if (!c5244ArrM15136[2].m15137()) {
                throw new C1010();
            }
            if (!c5244ArrM15136[3].m15137()) {
                throw new C1010();
            }
            if (c5244ArrM15136.length > 4 && !c5244ArrM15136[4].m15137()) {
                throw new C1010();
            }
            this.f34573 = c5244ArrM15136[0].m15134();
            this.f34571 = C5244.m15131(c5244ArrM15136[1].m15134());
            this.f34570 = C5244.m15131(c5244ArrM15136[2].m15134());
            this.f34572 = C5244.m15131(c5244ArrM15136[3].m15134());
        } catch (Exception | LinkageError e) {
            if (e instanceof C12651) {
                throw ((C12651) e);
            }
            if (!(e instanceof C1010) && !(e instanceof ArithmeticException)) {
                throw new C12651("scrypt unavailable", e);
            }
            throw new C12651("invalid ASN1", e);
        }
    }

    @Override // l.InterfaceC1737
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo5812(int i, byte[] bArr) {
        return SCrypt.generate(bArr, this.f34573, this.f34571, this.f34570, this.f34572, i);
    }
}
