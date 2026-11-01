package bin.p000mt.plus;

import p067l.C13026;
import p067l.C19473;
import p067l.ConcurrentMapC12768;

/* JADX INFO: loaded from: classes.dex */
public class Features {

    /* JADX INFO: renamed from: ֫ */
    public static boolean f26;

    /* JADX INFO: renamed from: ۧ */
    public static boolean f27;

    /* JADX INFO: renamed from: ܽ */
    public static boolean f28;

    /* JADX INFO: renamed from: ᩳ */
    public static ConcurrentMapC12768 f29 = new ConcurrentMapC12768();

    public static native Object[] analyze(byte[] bArr);

    public static native boolean deleteFile(String str);

    public static native String getABI();

    public static native String uid2name(int i);

    static {
        System.loadLibrary("mt1");
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m54(int i) {
        String str = (String) C19473.computeIfAbsent(f29, Integer.valueOf(i), new C13026(0));
        if (str != null && i >= 20000 && !f27 && i < 30000) {
            f27 = true;
        }
        if (str != null && i >= 30000 && !f26 && i < 40000) {
            f26 = true;
        }
        if (str != null && i >= 99910000 && !f28 && i < 99920000) {
            f28 = true;
        }
        return str;
    }
}
