package l;

import android.os.Handler;
import android.os.Looper;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܳۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AN5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14463 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f44330 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C7124 f44332 = new C7124(new C17992());

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Handler f44331 = new HandlerC17286(Looper.getMainLooper());

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m34557(String str) {
        if (str.startsWith("/system/") || str.startsWith("/data/")) {
            return false;
        }
        return C16999.m39887(str) || C19739.m45449(str) != null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34553(String str) {
        if (str == null) {
            return;
        }
        synchronized (C14463.class) {
            C7124 c7124 = f44332;
            c7124.remove(str);
            c7124.add(str);
            Handler handler = f44331;
            if (!handler.hasMessages(0)) {
                handler.sendEmptyMessageDelayed(0, 2000L);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m34558(String str) {
        String strM39731 = AbstractC16891.m39731(str);
        while (strM39731.length() > 1 && strM39731.endsWith("/")) {
            strM39731 = C15472.m36561(1, 0, strM39731);
        }
        return strM39731;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34554(String str, boolean z) {
        String strM34558 = m34558(str);
        if ((z && !m34556(strM34558)) || !m34557(strM34558)) {
            strM34558 = null;
        }
        m34553(strM34558);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m34551(String str, EnumC16580 enumC16580, boolean z) {
        String strM34558 = m34558(str);
        if (enumC16580 != EnumC16580.NONE && ((enumC16580 != EnumC16580.EXACT || !z || m34556(strM34558)) && m34557(strM34558))) {
            if (enumC16580 != EnumC16580.TREE) {
                return strM34558;
            }
            if (!m34558(strM34558).equalsIgnoreCase(m34558("/sdcard"))) {
                if (!m34558(strM34558).equalsIgnoreCase(m34558(m34558(C16293.f50120.mo23554())))) {
                    C4216 c4216M45449 = C19739.m45449(strM34558);
                    if (c4216M45449 == null) {
                        return strM34558;
                    }
                    if (!m34558(strM34558).equalsIgnoreCase(m34558(m34558(c4216M45449.f13687.getPath())))) {
                        return strM34558;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m34556(String str) {
        if (str.toLowerCase(Locale.ROOT).contains("download")) {
            return true;
        }
        String strM7304 = C2204.m7304(str);
        if (strM7304 != null) {
            return strM7304.startsWith("image") || strM7304.startsWith("video") || strM7304.startsWith("audio");
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34555(AbstractC15440 abstractC15440) {
        m34554(abstractC15440.mo23554(), true);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m34560(String str) {
        m34553(m34551(str, EnumC16580.EXACT, true));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m34559(String str) {
        m34553(m34551(str, EnumC16580.TREE, false));
    }
}
