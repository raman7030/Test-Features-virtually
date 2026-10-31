package l;

import java.security.SignatureException;

/* JADX INFO: renamed from: l.۫ۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7UY */
/* JADX INFO: loaded from: classes4.dex */
public final class C12114 extends AbstractC9998 {
    @Override // l.AbstractC9998
    /* JADX INFO: renamed from: ֫ */
    public final String mo8965() {
        return "ecdsa-sha2-nistp521";
    }

    @Override // l.InterfaceC17944
    public final void update(byte[] bArr) throws SignatureException {
        this.f30124.update(bArr);
    }
}
