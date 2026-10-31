package l;

import java.io.IOException;
import java.security.MessageDigest;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ܽۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: RAQH */
/* JADX INFO: loaded from: classes4.dex */
public final class C16398 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C1315 f50460 = new C1315(1000);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final AbstractC15440 f50461;

    static {
        AbstractC15440 abstractC15440M36526 = C16293.f50117.m36526("encoding");
        f50461 = abstractC15440M36526;
        if (abstractC15440M36526.mo23120()) {
            try {
                C12951 c12951M31485 = C12951.m31485(abstractC15440M36526.m36506());
                int iM31494 = c12951M31485.m31494();
                for (int i = 0; i < iM31494; i++) {
                    f50460.m4554(c12951M31485.m31506(), c12951M31485.m31506());
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38654(String str, String str2) {
        C1315 c1315 = f50460;
        c1315.m4554(str, str2);
        C10130 c10130 = new C10130();
        LinkedHashMap linkedHashMapM4555 = c1315.m4555();
        c10130.mo13231(linkedHashMapM4555.size());
        for (Map.Entry entry : linkedHashMapM4555.entrySet()) {
            c10130.m25439((String) entry.getKey());
            c10130.m25439((String) entry.getValue());
        }
        AbstractC15440 abstractC15440 = f50461;
        synchronized (abstractC15440) {
            try {
                abstractC15440.m36502(c10130.m25429());
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m38652(int i, byte[] bArr) {
        if (i == 0) {
            return null;
        }
        MessageDigest messageDigestM34526 = C14460.m34526();
        messageDigestM34526.update(bArr, 0, i);
        return (String) f50460.m4553(C14460.m34531(messageDigestM34526.digest()));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38653(String str, int i, byte[] bArr) {
        if (i != 0) {
            MessageDigest messageDigestM34526 = C14460.m34526();
            messageDigestM34526.update(bArr, 0, i);
            m38654(C14460.m34531(messageDigestM34526.digest()), str);
        }
    }
}
