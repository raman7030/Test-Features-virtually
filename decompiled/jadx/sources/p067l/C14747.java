package p067l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.۬ۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47VB */
/* JADX INFO: loaded from: classes4.dex */
public final class C14747 extends AbstractC21454 {
    @Override // p067l.AbstractC21454
    /* JADX INFO: renamed from: ֫ */
    public final void mo11615(C9383 c9383, AbstractC21178 abstractC21178) {
        super.mo11615(c9383, abstractC21178);
        C17823 c17823 = new C17823();
        C10054 c10054 = new C10054(c17823);
        c10054.m23425();
        c17823.m40448((byte) 98);
        c17823.m40459(abstractC21178.f66555);
        byte[] bArr = C20764.f65273;
        Charset charset = StandardCharsets.UTF_8;
        c17823.m40470("subsystem".getBytes(charset));
        c17823.m40448(m48591() ? (byte) 1 : (byte) 0);
        c17823.m40470("sftp".getBytes(charset));
        m48589(c10054);
    }
}
