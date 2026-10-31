package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۢ᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 17L3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9812 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f29649 = {74, 77, 1, 0};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24845(InterfaceC20758 interfaceC20758) throws IOException {
        InputStream inputStreamNewInputStream = C17229.newInputStream(interfaceC20758, new InterfaceC23579[0]);
        try {
            byte[] bArr = new byte[4];
            C22194.m49857(inputStreamNewInputStream, bArr, 4);
            byte b = bArr[0];
            byte[] bArr2 = f29649;
            if (b != bArr2[0] || bArr[1] != bArr2[1]) {
                throw new IOException("Invalid JMOD file: " + interfaceC20758.toString());
            }
            byte b2 = bArr[2];
            if (b2 <= 1 && (b2 != 1 || bArr[3] <= 0)) {
                if (inputStreamNewInputStream != null) {
                    inputStreamNewInputStream.close();
                }
            } else {
                throw new IOException("Unsupported jmod version: " + ((int) bArr[2]) + "." + ((int) bArr[3]) + " in " + interfaceC20758.toString());
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
