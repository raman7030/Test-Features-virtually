package p067l;

import java.util.Arrays;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;

/* JADX INFO: renamed from: l.᩷ۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E7WQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C22125 extends AbstractC10725 {
    @Override // p067l.AbstractC10725
    /* JADX INFO: renamed from: ܳ */
    public final String mo24663() {
        return EdDSAParameterSpec.Ed25519;
    }

    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ܽ */
    public final int mo26346() {
        return 32;
    }

    @Override // p067l.AbstractC10725
    /* JADX INFO: renamed from: ᩻ */
    public final String mo24664() {
        return OpenSSHPublicKeyUtil.ED_25519;
    }

    public C22125(C23780 c23780) {
        super(c23780, null, null);
    }

    public C22125(C23780 c23780, byte[] bArr) {
        super(c23780, bArr, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC19442 m49916(C23780 c23780, C17823 c17823) throws C14392 {
        byte[][] bArrM40453 = c17823.m40453(4, "invalid key format");
        C22125 c22125 = new C22125(c23780, bArrM40453[1], Arrays.copyOf(bArrM40453[2], 32));
        c22125.f59222 = C20764.m46882(bArrM40453[3]);
        c22125.f59223 = 0;
        return c22125;
    }
}
