package p067l;

import java.util.Arrays;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;

/* JADX INFO: renamed from: l.ۢۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X7XP */
/* JADX INFO: loaded from: classes4.dex */
public final class C11396 extends AbstractC10725 {
    @Override // p067l.AbstractC10725
    /* JADX INFO: renamed from: ܳ */
    public final String mo24663() {
        return EdDSAParameterSpec.Ed448;
    }

    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ܽ */
    public final int mo26346() {
        return 57;
    }

    @Override // p067l.AbstractC10725
    /* JADX INFO: renamed from: ᩻ */
    public final String mo24664() {
        return "ssh-ed448";
    }

    public C11396(C23780 c23780) {
        super(c23780, null, null);
    }

    public C11396(C23780 c23780, byte[] bArr) {
        super(c23780, bArr, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC19442 m26345(C23780 c23780, C17823 c17823) throws C14392 {
        byte[][] bArrM40453 = c17823.m40453(4, "invalid key format");
        C11396 c11396 = new C11396(c23780, bArrM40453[1], Arrays.copyOf(bArrM40453[2], 57));
        c11396.f59222 = C20764.m46882(bArrM40453[3]);
        c11396.f59223 = 0;
        return c11396;
    }
}
