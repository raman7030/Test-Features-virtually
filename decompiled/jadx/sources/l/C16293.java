package l;

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
public final class C16293 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final AbstractC15440 f50111;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static boolean f50112;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final AbstractC15440 f50113;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final AbstractC15440 f50114;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 f50115;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final AbstractC15440 f50116;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final AbstractC15440 f50118;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final AbstractC15440 f50119;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final AbstractC15440 f50120 = C16999.m39866(C16999.m39858(), new String[0]);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final AbstractC15440 f50117 = C16999.m39864(C4925.m14322());

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC15440 f50110 = C16999.m39864(C4925.m14332());

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38320() {
        Iterator it = f50113.mo23549(true).iterator();
        while (it.hasNext()) {
            ((AbstractC15440) it.next()).mo23552();
        }
        Iterator it2 = f50114.mo23549(true).iterator();
        while (it2.hasNext()) {
            ((AbstractC15440) it2.next()).mo23552();
        }
        f50112 = true;
    }

    static {
        File externalCacheDir = C4925.m14335().getExternalCacheDir();
        if (externalCacheDir == null) {
            externalCacheDir = C4925.m14332();
        }
        AbstractC15440 abstractC15440M39864 = C16999.m39864(externalCacheDir);
        f50116 = abstractC15440M39864;
        File externalFilesDir = C4925.m14335().getExternalFilesDir(null);
        if (externalFilesDir == null) {
            externalFilesDir = C4925.m14322();
        }
        AbstractC15440 abstractC15440M39865 = C16999.m39864(externalFilesDir);
        f50118 = abstractC15440M39865;
        AbstractC15440 abstractC15440M36526 = abstractC15440M39865.m36526("temp");
        f50111 = abstractC15440M36526;
        f50113 = abstractC15440M36526.m36526("CleanOnExit");
        f50114 = abstractC15440M39864.m36526("CleanOnExit");
        f50119 = abstractC15440M39864.m36526("temp");
        f50112 = true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m38327() {
        AbstractC15440 abstractC15440M36526 = f50115;
        AbstractC15440 abstractC15440 = f50120;
        if (abstractC15440M36526 == null) {
            abstractC15440M36526 = abstractC15440.m36526("MT2");
        }
        if (!m38324(abstractC15440M36526)) {
            abstractC15440M36526 = abstractC15440.m36526("MT2");
            if (m38324(abstractC15440M36526)) {
                f50115 = abstractC15440M36526;
                C21939.m49421();
            }
        }
        return abstractC15440M36526;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m38324(AbstractC15440 abstractC15440) {
        if (abstractC15440.mo23113()) {
            return true;
        }
        if (abstractC15440.mo23119()) {
            abstractC15440.mo23552();
        }
        return abstractC15440.mo23546();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m38325(String str) {
        int i = C16999.f52136;
        boolean zEquals = "/sdcard".equals(str);
        AbstractC15440 abstractC15440 = f50120;
        if (zEquals || abstractC15440.mo23554().equals(str)) {
            return abstractC15440;
        }
        String str2 = abstractC15440.mo23554() + "/";
        if (str.startsWith(str2)) {
            return abstractC15440.m36526(str.substring(str2.length()));
        }
        if (str.startsWith("/sdcard/")) {
            return abstractC15440.m36526(str.substring(8));
        }
        return C16999.m39866(str, new String[0]);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m38319(String str) {
        String strSubstring;
        String string;
        AbstractC15440 abstractC15440M36526 = f50120;
        String strMo23554 = abstractC15440M36526.mo23554();
        if (str.equals("/sdcard") || str.startsWith("/sdcard/")) {
            String strM38329 = m38329(str);
            if (strM38329.equals("/sdcard")) {
                return strM38329;
            }
            strSubstring = strM38329.substring(8);
            strMo23554 = "/sdcard";
        } else {
            if (!str.equals(strMo23554)) {
                if (!str.startsWith(strMo23554 + "/")) {
                    return str;
                }
            }
            String strM383210 = m38329(str);
            if (strM383210.equals(strMo23554)) {
                return strM383210;
            }
            strSubstring = strM383210.substring(strMo23554.length() + 1);
        }
        StringBuilder sbM19190 = C7166.m19190(strMo23554, "/");
        String[] strArrSplit = strSubstring.split("/");
        StringBuilder sb = new StringBuilder(strSubstring.length());
        for (int i = 0; i < strArrSplit.length; i++) {
            String str2 = strArrSplit[i];
            String str3 = null;
            try {
                for (String str4 : abstractC15440M36526.mo27931()) {
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
                sbM19190.append(string);
                return sbM19190.toString();
            }
            if (sb.length() > 0) {
                sb.append('/');
            }
            sb.append(str3);
            abstractC15440M36526 = abstractC15440M36526.m36526(str3);
        }
        string = sb.toString();
        sbM19190.append(string);
        return sbM19190.toString();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m38329(String str) {
        int length = str.length();
        while (length > 1 && str.charAt(length - 1) == '/') {
            length--;
        }
        return length == str.length() ? str : str.substring(0, length);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m38330(String str) {
        AbstractC15440 abstractC15440M38325 = m38325(str);
        if (!m38324(abstractC15440M38325)) {
            return false;
        }
        f50115 = abstractC15440M38325;
        C21939.m49421();
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m38328(String str) {
        f50115 = m38325(str);
        C21939.m49421();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m38326() {
        final boolean z = f50112;
        f50112 = false;
        C1802.f6208.execute(new Runnable() { // from class: l.֫֡ܿ
            @Override // java.lang.Runnable
            public final void run() {
                C16293.m38323(z);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38323(boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (AbstractC15440 abstractC15440 : f50111.mo23549(true)) {
            if (Math.abs(jCurrentTimeMillis - abstractC15440.mo23117()) > Defcon.MILLIS_8_HOURS) {
                abstractC15440.mo23552();
                abstractC15440.mo23554();
            } else {
                arrayList.add(abstractC15440);
            }
        }
        if (z) {
            m38321(arrayList);
        }
        arrayList.clear();
        for (AbstractC15440 abstractC15441 : f50119.mo23549(true)) {
            if (Math.abs(jCurrentTimeMillis - abstractC15441.mo23117()) > Defcon.MILLIS_8_HOURS) {
                abstractC15441.mo23552();
                abstractC15441.mo23554();
            } else {
                arrayList.add(abstractC15441);
            }
        }
        if (z) {
            m38321(arrayList);
        }
        arrayList.clear();
        for (AbstractC15440 abstractC15442 : f50114.mo23549(true)) {
            if (Math.abs(jCurrentTimeMillis - abstractC15442.mo23117()) > Defcon.MILLIS_8_HOURS) {
                abstractC15442.mo23552();
                abstractC15442.mo23554();
            } else {
                arrayList.add(abstractC15442);
            }
        }
        if (z) {
            m38321(arrayList);
        }
        if (Build.VERSION.SDK_INT < 24) {
            AbstractC15440 abstractC15440M36526 = f50120.m36526("Android/mt_install_tmp.apk");
            if (abstractC15440M36526.mo23120()) {
                abstractC15440M36526.mo23552();
            }
        }
        if (C21939.m49417()) {
            try {
                int i = Integer.parseInt(C4925.f15523.getString("auto_clean_recycle_bin", "0"));
                if (i > 0) {
                    C21939.m49412(jCurrentTimeMillis - (((long) (i * 86400)) * 1000), false, new C10650(0), null);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38321(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m38322((AbstractC15440) it.next(), arrayList2);
        }
        Iterator it2 = arrayList2.iterator();
        long j = 0;
        while (it2.hasNext()) {
            j += ((C17705) it2.next()).f54182;
        }
        long j2 = 209715200;
        if (j <= j2) {
            return;
        }
        Collections.sort(arrayList2);
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C17705 c17705 = (C17705) arrayList2.get(i);
            if (c17705.f54181.mo23552()) {
                c17705.f54181.mo23554();
                j -= c17705.f54182;
                if (j <= j2) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38322(AbstractC15440 abstractC15440, ArrayList arrayList) {
        if (abstractC15440.mo23113()) {
            List listMo23549 = abstractC15440.mo23549(true);
            if (listMo23549.isEmpty()) {
                abstractC15440.mo23552();
                return;
            }
            Iterator it = listMo23549.iterator();
            while (it.hasNext()) {
                m38322((AbstractC15440) it.next(), arrayList);
            }
            return;
        }
        arrayList.add(new C17705(abstractC15440));
    }
}
