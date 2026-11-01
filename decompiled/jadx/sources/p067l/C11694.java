package p067l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۢ᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 17L3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11694 {

    /* JADX INFO: renamed from: ֫ */
    public static final byte[] f32600 = {74, 77, 1, 0};

    /* JADX INFO: renamed from: ֫ */
    public static void m26860(InterfaceC22097 interfaceC22097) throws IOException {
        InputStream inputStreamNewInputStream = C18743.newInputStream(interfaceC22097, new InterfaceC24778[0]);
        try {
            byte[] bArr = new byte[4];
            C23461.m52184(inputStreamNewInputStream, bArr, 4);
            byte b = bArr[0];
            byte[] bArr2 = f32600;
            if (b != bArr2[0] || bArr[1] != bArr2[1]) {
                throw new IOException("Invalid JMOD file: " + interfaceC22097.toString());
            }
            byte b2 = bArr[2];
            if (b2 <= 1 && (b2 != 1 || bArr[3] <= 0)) {
                if (inputStreamNewInputStream != null) {
                    inputStreamNewInputStream.close();
                }
            } else {
                throw new IOException("Unsupported jmod version: " + ((int) bArr[2]) + "." + ((int) bArr[3]) + " in " + interfaceC22097.toString());
            }
        } catch (Throwable th) {
            if (inputStreamNewInputStream != null) {
                try {
                    inputStreamNewInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
