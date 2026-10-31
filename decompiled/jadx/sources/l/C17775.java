package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ᩳۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: G5CT */
/* JADX INFO: loaded from: classes4.dex */
public final class C17775 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m41633(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i > 0) {
            int i3 = inputStream.read(bArr, i2, i);
            if (i3 == -1) {
                throw new RuntimeException("unexpected EOF");
            }
            i2 += i3;
            i -= i3;
        }
        return bArr;
    }
}
