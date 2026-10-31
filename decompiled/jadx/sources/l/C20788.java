package l;

import java.util.Arrays;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;

/* JADX INFO: renamed from: l.᩷ۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E7WQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20788 extends AbstractC8793 {
    @Override // l.AbstractC8793
    /* JADX INFO: renamed from: ܳ */
    public final String mo22693() {
        return EdDSAParameterSpec.Ed25519;
    }

    @Override // l.AbstractC17965
    /* JADX INFO: renamed from: ܽ */
    public final int mo24336() {
        return 32;
    }

    @Override // l.AbstractC8793
    /* JADX INFO: renamed from: ᩻ */
    public final String mo22694() {
        return OpenSSHPublicKeyUtil.ED_25519;
    }

    public C20788(C22529 c22529) {
        super(c22529, null, null);
    }

    public C20788(C22529 c22529, byte[] bArr) {
        super(c22529, bArr, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC17965 m47588(C22529 c22529, C16261 c16261) throws C12651 {
        byte[][] bArrM38239 = c16261.m38239(4, "invalid key format");
        C20788 c20788 = new C20788(c22529, bArrM38239[1], Arrays.copyOf(bArrM38239[2], 32));
        c20788.f56025 = C19356.m44588(bArrM38239[3]);
        c20788.f56026 = 0;
        return c20788;
    }
}
