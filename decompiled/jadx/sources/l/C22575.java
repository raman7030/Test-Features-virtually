package l;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩹᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7JN */
/* JADX INFO: loaded from: classes.dex */
public final class C22575 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f72984;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f72985;

    public C22575() {
        try {
            InputStream resourceAsStream = C20459.class.getResourceAsStream("/assets/icons");
            try {
                C12951 c12951 = new C12951(C8152.m21623(resourceAsStream));
                int i = c12951.readInt();
                this.f72985 = new HashMap(i);
                for (int i2 = 0; i2 < i; i2++) {
                    this.f72985.put(c12951.m31506(), new int[]{c12951.readInt(), c12951.readInt()});
                }
                this.f72984 = c12951.m31496();
                resourceAsStream.close();
            } catch (Throwable th) {
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m50560(String str, boolean z) {
        int i;
        int[] iArr = (int[]) this.f72985.get(str);
        if (iArr == null || (i = iArr[!z ? 1 : 0]) == -1) {
            return null;
        }
        byte[] bArr = this.f72984;
        if (i >= bArr.length) {
            return "";
        }
        int i2 = i;
        while (i2 < bArr.length && bArr[i2] != 0) {
            i2++;
        }
        if (bArr[i2] != 0) {
            i2++;
        }
        return new String(bArr, i, i2 - i, StandardCharsets.UTF_8);
    }
}
