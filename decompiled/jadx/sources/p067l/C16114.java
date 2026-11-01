package p067l;

import android.os.Handler;
import android.os.Looper;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܳۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AN5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C16114 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f47424 = 0;

    /* JADX INFO: renamed from: ܽ */
    public static final C9139 f47426 = new C9139(new C19468());

    /* JADX INFO: renamed from: ۧ */
    public static final Handler f47425 = new HandlerC18797(Looper.getMainLooper());

    /* JADX INFO: renamed from: ܳ */
    public static boolean m36691(String str) {
        if (str.startsWith("/system/") || str.startsWith("/data/")) {
            return false;
        }
        return C18524.m42130(str) || C21129.m47753(str) != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36687(String str) {
        if (str == null) {
            return;
        }
        synchronized (C16114.class) {
            C9139 c9139 = f47426;
            c9139.remove(str);
            c9139.add(str);
            Handler handler = f47425;
            if (!handler.hasMessages(0)) {
                handler.sendEmptyMessageDelayed(0, 2000L);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m36692(String str) {
        String strM41972 = AbstractC18422.m41972(str);
        while (strM41972.length() > 1 && strM41972.endsWith("/")) {
            strM41972 = C17073.m38720(1, 0, strM41972);
        }
        return strM41972;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36688(String str, boolean z) {
        String strM36692 = m36692(str);
        if ((z && !m36690(strM36692)) || !m36691(strM36692)) {
            strM36692 = null;
        }
        m36687(strM36692);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m36685(String str, EnumC18126 enumC18126, boolean z) {
        String strM36692 = m36692(str);
        if (enumC18126 != EnumC18126.NONE && ((enumC18126 != EnumC18126.EXACT || !z || m36690(strM36692)) && m36691(strM36692))) {
            if (enumC18126 != EnumC18126.TREE) {
                return strM36692;
            }
            if (!m36692(strM36692).equalsIgnoreCase(m36692("/sdcard"))) {
                if (!m36692(strM36692).equalsIgnoreCase(m36692(m36692(C17853.f53287.mo25505())))) {
                    C6376 c6376M47753 = C21129.m47753(strM36692);
                    if (c6376M47753 == null) {
                        return strM36692;
                    }
                    if (!m36692(strM36692).equalsIgnoreCase(m36692(m36692(c6376M47753.f16500.getPath())))) {
                        return strM36692;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m36690(String str) {
        if (str.toLowerCase(Locale.ROOT).contains("download")) {
            return true;
        }
        String strM9383 = C4463.m9383(str);
        if (strM9383 != null) {
            return strM9383.startsWith("image") || strM9383.startsWith("video") || strM9383.startsWith("audio");
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36689(AbstractC17043 abstractC17043) {
        m36688(abstractC17043.mo25505(), true);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m36694(String str) {
        m36687(m36685(str, EnumC18126.EXACT, true));
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m36693(String str) {
        m36687(m36685(str, EnumC18126.TREE, false));
    }
}
