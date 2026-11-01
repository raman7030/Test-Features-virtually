package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۙ᩶ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7G8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7006 {
    /* JADX INFO: renamed from: ֫ */
    public static void m16116(String str, byte[] bArr) throws IOException {
        if (bArr.length + 1 > 4097) {
            throw new IOException(str.concat(" too long"));
        }
        for (byte b : bArr) {
            if (b == 0) {
                throw new IOException(str.concat(" contains NUL"));
            }
        }
    }
}
