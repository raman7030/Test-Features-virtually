package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩹᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7JN */
/* JADX INFO: loaded from: classes.dex */
public final class C23824 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f75711;

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f75712;

    public C23824() {
        try {
            InputStream resourceAsStream = C21813.class.getResourceAsStream("/assets/icons");
            try {
                C14677 c14677 = new C14677(C10116.m23592(resourceAsStream));
                int i = c14677.readInt();
                this.f75712 = new HashMap(i);
                for (int i2 = 0; i2 < i; i2++) {
                    this.f75712.put(c14677.m33593(), new int[]{c14677.readInt(), c14677.readInt()});
                }
                this.f75711 = c14677.m33583();
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

    /* JADX INFO: renamed from: ֫ */
    public final String m52902(String str, boolean z) {
        int i;
        int[] iArr = (int[]) this.f75712.get(str);
        if (iArr == null || (i = iArr[!z ? 1 : 0]) == -1) {
            return null;
        }
        byte[] bArr = this.f75711;
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
