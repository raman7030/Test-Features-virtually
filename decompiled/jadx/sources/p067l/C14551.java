package p067l;

import java.security.SignatureException;

/* JADX INFO: renamed from: l.۬ۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7V0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14551 extends AbstractC11870 {
    @Override // p067l.AbstractC11870
    /* JADX INFO: renamed from: ֫ */
    public final String mo11033() {
        return "ecdsa-sha2-nistp384";
    }

    @Override // p067l.InterfaceC19422
    public final void update(byte[] bArr) throws SignatureException {
        this.f33084.update(bArr);
    }
}
