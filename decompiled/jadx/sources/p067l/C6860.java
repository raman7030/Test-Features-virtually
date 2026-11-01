package p067l;

import android.content.pm.PackageInfo;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.ۙܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: E9SU */
/* JADX INFO: loaded from: classes2.dex */
public final class C6860 {

    /* JADX INFO: renamed from: ֫ */
    public static final AbstractC17043 f17836;

    /* JADX INFO: renamed from: ۧ */
    public static final ConcurrentMapC12768 f17837;

    static {
        AbstractC17043 abstractC17043M38684 = C17853.f53284.m38684("osmd");
        f17836 = abstractC17043M38684;
        f17837 = new ConcurrentMapC12768();
        try {
            C14677 c14677M38686 = abstractC17043M38684.m38686();
            byte[] bArr = c14677M38686.f41893;
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = (byte) (bArr[i] ^ (i * i));
            }
            while (c14677M38686.available() > 0) {
                C23395.m52059(c14677M38686, 41397);
                String strM33586 = c14677M38686.m33586();
                C21613 c21613 = new C21613(0);
                c21613.f68114 = c14677M38686.m33586();
                c21613.f68115 = c14677M38686.m33586();
                f17837.put(strM33586, c21613);
            }
        } catch (Exception unused) {
            f17837.clear();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m15722() {
        synchronized (C6860.class) {
            C11996 c11996 = new C11996();
            for (Map.Entry entry : f17837.entrySet()) {
                String str = (String) entry.getKey();
                C21613 c21613 = (C21613) entry.getValue();
                if (c21613.f68114 != null && str.length() + c21613.f68114.length() + c21613.f68115.length() < 1000) {
                    c11996.mo15113(41397);
                    c11996.m27462(str);
                    c11996.m27462(c21613.f68114);
                    c11996.m27462(c21613.f68115);
                }
            }
            byte[] bArrM27458 = c11996.m27458();
            int size = c11996.size();
            for (int i = 0; i < size; i++) {
                bArrM27458[i] = (byte) (bArrM27458[i] ^ (i * i));
            }
            try {
                f17836.m38661(bArrM27458, 0, size);
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m15721(PackageInfo packageInfo) {
        C21613 c21613 = (C21613) C19473.computeIfAbsent(f17837, packageInfo.packageName, new C22954());
        String str = Long.toHexString(packageInfo.lastUpdateTime) + ":" + Locale.getDefault().hashCode();
        if (str.equals(c21613.f68114)) {
            String str2 = c21613.f68115;
            C12826.requireNonNull(str2);
            return str2;
        }
        synchronized (c21613) {
            if (!str.equals(c21613.f68114)) {
                c21613.f68115 = String.valueOf(packageInfo.applicationInfo.loadLabel(C7050.m16217()));
                c21613.f68114 = str;
            }
        }
        C4081.m8188(new RunnableC23624(0), C6860.class, 1000L);
        return c21613.f68115;
    }
}
