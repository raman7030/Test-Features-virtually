package p067l;

import java.io.IOException;
import java.security.MessageDigest;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ܽۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: RAQH */
/* JADX INFO: loaded from: classes4.dex */
public final class C17953 {

    /* JADX INFO: renamed from: ֫ */
    public static final C0907 f53632 = new C0907(1000);

    /* JADX INFO: renamed from: ۧ */
    public static final AbstractC17043 f53633;

    static {
        AbstractC17043 abstractC17043M38684 = C17853.f53284.m38684("encoding");
        f53633 = abstractC17043M38684;
        if (abstractC17043M38684.mo25094()) {
            try {
                C14677 c14677M33572 = C14677.m33572(abstractC17043M38684.m38664());
                int iM33581 = c14677M33572.m33581();
                for (int i = 0; i < iM33581; i++) {
                    f53632.m6786(c14677M33572.m33593(), c14677M33572.m33593());
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m40870(String str, String str2) {
        C0907 c0907 = f53632;
        c0907.m6786(str, str2);
        C11996 c11996 = new C11996();
        LinkedHashMap linkedHashMapM6787 = c0907.m6787();
        c11996.mo15113(linkedHashMapM6787.size());
        for (Map.Entry entry : linkedHashMapM6787.entrySet()) {
            c11996.m27459((String) entry.getKey());
            c11996.m27459((String) entry.getValue());
        }
        AbstractC17043 abstractC17043 = f53633;
        synchronized (abstractC17043) {
            try {
                abstractC17043.m38660(c11996.m27449());
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m40868(int i, byte[] bArr) {
        if (i == 0) {
            return null;
        }
        MessageDigest messageDigestM36660 = C16111.m36660();
        messageDigestM36660.update(bArr, 0, i);
        return (String) f53632.m6785(C16111.m36665(messageDigestM36660.digest()));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m40869(String str, int i, byte[] bArr) {
        if (i != 0) {
            MessageDigest messageDigestM36660 = C16111.m36660();
            messageDigestM36660.update(bArr, 0, i);
            m40870(C16111.m36665(messageDigestM36660.digest()), str);
        }
    }
}
