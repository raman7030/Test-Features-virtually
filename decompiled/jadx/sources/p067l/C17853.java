package p067l;

import android.os.Build;
import com.umeng.commonsdk.statistics.noise.Defcon;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܽ֡ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D18B */
/* JADX INFO: loaded from: classes4.dex */
public final class C17853 {

    /* JADX INFO: renamed from: ۜ */
    public static final AbstractC17043 f53278;

    /* JADX INFO: renamed from: ۡ */
    public static boolean f53279;

    /* JADX INFO: renamed from: ۢ */
    public static final AbstractC17043 f53280;

    /* JADX INFO: renamed from: ۧ */
    public static final AbstractC17043 f53281;

    /* JADX INFO: renamed from: ܳ */
    public static AbstractC17043 f53282;

    /* JADX INFO: renamed from: ܽ */
    public static final AbstractC17043 f53283;

    /* JADX INFO: renamed from: ᩳ */
    public static final AbstractC17043 f53285;

    /* JADX INFO: renamed from: ᩷ */
    public static final AbstractC17043 f53286;

    /* JADX INFO: renamed from: ᩻ */
    public static final AbstractC17043 f53287 = C18524.m42109(C18524.m42101(), new String[0]);

    /* JADX INFO: renamed from: ܿ */
    public static final AbstractC17043 f53284 = C18524.m42107(C7050.m16219());

    /* JADX INFO: renamed from: ֫ */
    public static final AbstractC17043 f53277 = C18524.m42107(C7050.m16229());

    /* JADX INFO: renamed from: ֫ */
    public static void m40535() {
        Iterator it = f53280.mo25500(true).iterator();
        while (it.hasNext()) {
            ((AbstractC17043) it.next()).mo25503();
        }
        Iterator it2 = f53281.mo25500(true).iterator();
        while (it2.hasNext()) {
            ((AbstractC17043) it2.next()).mo25503();
        }
        f53279 = true;
    }

    static {
        File externalCacheDir = C7050.m16232().getExternalCacheDir();
        if (externalCacheDir == null) {
            externalCacheDir = C7050.m16229();
        }
        AbstractC17043 abstractC17043M42107 = C18524.m42107(externalCacheDir);
        f53283 = abstractC17043M42107;
        File externalFilesDir = C7050.m16232().getExternalFilesDir(null);
        if (externalFilesDir == null) {
            externalFilesDir = C7050.m16219();
        }
        AbstractC17043 abstractC17043M42108 = C18524.m42107(externalFilesDir);
        f53285 = abstractC17043M42108;
        AbstractC17043 abstractC17043M38684 = abstractC17043M42108.m38684("temp");
        f53278 = abstractC17043M38684;
        f53280 = abstractC17043M38684.m38684("CleanOnExit");
        f53281 = abstractC17043M42107.m38684("CleanOnExit");
        f53286 = abstractC17043M42107.m38684("temp");
        f53279 = true;
    }

    /* JADX INFO: renamed from: ܽ */
    public static AbstractC17043 m40542() {
        AbstractC17043 abstractC17043M38684 = f53282;
        AbstractC17043 abstractC17043 = f53287;
        if (abstractC17043M38684 == null) {
            abstractC17043M38684 = abstractC17043.m38684("MT2");
        }
        if (!m40539(abstractC17043M38684)) {
            abstractC17043M38684 = abstractC17043.m38684("MT2");
            if (m40539(abstractC17043M38684)) {
                f53282 = abstractC17043M38684;
                C23219.m51758();
            }
        }
        return abstractC17043M38684;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m40539(AbstractC17043 abstractC17043) {
        if (abstractC17043.mo25087()) {
            return true;
        }
        if (abstractC17043.mo25093()) {
            abstractC17043.mo25503();
        }
        return abstractC17043.mo25497();
    }

    /* JADX INFO: renamed from: ۧ */
    public static AbstractC17043 m40540(String str) {
        int i = C18524.f55316;
        boolean zEquals = "/sdcard".equals(str);
        AbstractC17043 abstractC17043 = f53287;
        if (zEquals || abstractC17043.mo25505().equals(str)) {
            return abstractC17043;
        }
        String str2 = abstractC17043.mo25505() + "/";
        if (str.startsWith(str2)) {
            return abstractC17043.m38684(str.substring(str2.length()));
        }
        if (str.startsWith("/sdcard/")) {
            return abstractC17043.m38684(str.substring(8));
        }
        return C18524.m42109(str, new String[0]);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m40534(String str) {
        String strSubstring;
        String string;
        AbstractC17043 abstractC17043M38684 = f53287;
        String strMo25505 = abstractC17043M38684.mo25505();
        if (str.equals("/sdcard") || str.startsWith("/sdcard/")) {
            String strM40544 = m40544(str);
            if (strM40544.equals("/sdcard")) {
                return strM40544;
            }
            strSubstring = strM40544.substring(8);
            strMo25505 = "/sdcard";
        } else {
            if (!str.equals(strMo25505)) {
                if (!str.startsWith(strMo25505 + "/")) {
                    return str;
                }
            }
            String strM40545 = m40544(str);
            if (strM40545.equals(strMo25505)) {
                return strM40545;
            }
            strSubstring = strM40545.substring(strMo25505.length() + 1);
        }
        StringBuilder sbM21133 = C9179.m21133(strMo25505, "/");
        String[] strArrSplit = strSubstring.split("/");
        StringBuilder sb = new StringBuilder(strSubstring.length());
        for (int i = 0; i < strArrSplit.length; i++) {
            String str2 = strArrSplit[i];
            String str3 = null;
            try {
                for (String str4 : abstractC17043M38684.mo29992()) {
                    if (str4.equals(str2)) {
                        str3 = str4;
                        break;
                    }
                    if (str3 == null && str4.equalsIgnoreCase(str2)) {
                        str3 = str4;
                    }
                }
            } catch (Exception unused) {
            }
            if (str3 == null) {
                if (sb.length() > 0) {
                    sb.append('/');
                }
                for (int i2 = i; i2 < strArrSplit.length; i2++) {
                    if (i2 > i) {
                        sb.append('/');
                    }
                    sb.append(strArrSplit[i2]);
                }
                string = sb.toString();
                sbM21133.append(string);
                return sbM21133.toString();
            }
            if (sb.length() > 0) {
                sb.append('/');
            }
            sb.append(str3);
            abstractC17043M38684 = abstractC17043M38684.m38684(str3);
        }
        string = sb.toString();
        sbM21133.append(string);
        return sbM21133.toString();
    }

    /* JADX INFO: renamed from: ܿ */
    public static String m40544(String str) {
        int length = str.length();
        while (length > 1 && str.charAt(length - 1) == '/') {
            length--;
        }
        return length == str.length() ? str : str.substring(0, length);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m40545(String str) {
        AbstractC17043 abstractC17043M40540 = m40540(str);
        if (!m40539(abstractC17043M40540)) {
            return false;
        }
        f53282 = abstractC17043M40540;
        C23219.m51758();
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m40543(String str) {
        f53282 = m40540(str);
        C23219.m51758();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m40541() {
        final boolean z = f53279;
        f53279 = false;
        C4081.f8987.execute(new Runnable() { // from class: l.֫֡ܿ
            @Override // java.lang.Runnable
            public final void run() {
                C17853.m40538(z);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m40538(boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (AbstractC17043 abstractC17043 : f53278.mo25500(true)) {
            if (Math.abs(jCurrentTimeMillis - abstractC17043.mo25091()) > Defcon.MILLIS_8_HOURS) {
                abstractC17043.mo25503();
                abstractC17043.mo25505();
            } else {
                arrayList.add(abstractC17043);
            }
        }
        if (z) {
            m40536(arrayList);
        }
        arrayList.clear();
        for (AbstractC17043 abstractC17044 : f53286.mo25500(true)) {
            if (Math.abs(jCurrentTimeMillis - abstractC17044.mo25091()) > Defcon.MILLIS_8_HOURS) {
                abstractC17044.mo25503();
                abstractC17044.mo25505();
            } else {
                arrayList.add(abstractC17044);
            }
        }
        if (z) {
            m40536(arrayList);
        }
        arrayList.clear();
        for (AbstractC17043 abstractC17045 : f53281.mo25500(true)) {
            if (Math.abs(jCurrentTimeMillis - abstractC17045.mo25091()) > Defcon.MILLIS_8_HOURS) {
                abstractC17045.mo25503();
                abstractC17045.mo25505();
            } else {
                arrayList.add(abstractC17045);
            }
        }
        if (z) {
            m40536(arrayList);
        }
        if (Build.VERSION.SDK_INT < 24) {
            AbstractC17043 abstractC17043M38684 = f53287.m38684("Android/mt_install_tmp.apk");
            if (abstractC17043M38684.mo25094()) {
                abstractC17043M38684.mo25503();
            }
        }
        if (C23219.m51754()) {
            try {
                int i = Integer.parseInt(C7050.f18355.getString("auto_clean_recycle_bin", "0"));
                if (i > 0) {
                    C23219.m51749(jCurrentTimeMillis - (((long) (i * 86400)) * 1000), false, new C12490(0), null);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m40536(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m40537((AbstractC17043) it.next(), arrayList2);
        }
        Iterator it2 = arrayList2.iterator();
        long j = 0;
        while (it2.hasNext()) {
            j += ((C19195) it2.next()).f57374;
        }
        long j2 = 209715200;
        if (j <= j2) {
            return;
        }
        Collections.sort(arrayList2);
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C19195 c19195 = (C19195) arrayList2.get(i);
            if (c19195.f57373.mo25503()) {
                c19195.f57373.mo25505();
                j -= c19195.f57374;
                if (j <= j2) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m40537(AbstractC17043 abstractC17043, ArrayList arrayList) {
        if (abstractC17043.mo25087()) {
            List listMo25500 = abstractC17043.mo25500(true);
            if (listMo25500.isEmpty()) {
                abstractC17043.mo25503();
                return;
            }
            Iterator it = listMo25500.iterator();
            while (it.hasNext()) {
                m40537((AbstractC17043) it.next(), arrayList);
            }
            return;
        }
        arrayList.add(new C19195(abstractC17043));
    }
}
