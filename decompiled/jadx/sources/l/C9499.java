package l;

import java.util.Arrays;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;

/* JADX INFO: renamed from: l.ۢۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X7XP */
/* JADX INFO: loaded from: classes4.dex */
public final class C9499 extends AbstractC8793 {
    @Override // l.AbstractC8793
    /* JADX INFO: renamed from: ܳ */
    public final String mo22693() {
        return EdDSAParameterSpec.Ed448;
    }

    @Override // l.AbstractC17965
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int mo24336() {
        return 57;
    }

    @Override // l.AbstractC8793
    /* JADX INFO: renamed from: ᩻ */
    public final String mo22694() {
        return "ssh-ed448";
    }

    public C9499(C22529 c22529) {
        super(c22529, null, null);
    }

    public C9499(C22529 c22529, byte[] bArr) {
        super(c22529, bArr, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC17965 m24335(C22529 c22529, C16261 c16261) throws C12651 {
        byte[][] bArrM38239 = c16261.m38239(4, "invalid key format");
        C9499 c9499 = new C9499(c22529, bArrM38239[1], Arrays.copyOf(bArrM38239[2], 57));
        c9499.f56025 = C19356.m44588(bArrM38239[3]);
        c9499.f56026 = 0;
        return c9499;
    }
}
