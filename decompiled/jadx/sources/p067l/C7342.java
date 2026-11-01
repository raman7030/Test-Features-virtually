package p067l;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Environment;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚ۠ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: C9A2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7342 {
    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m17025(C14717 c14717) {
        return m17026(c14717, "Android/data/");
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m17023() {
        return m17024("Android/data/");
    }

    /* JADX INFO: renamed from: ۧ */
    public static ArrayList m17029(C14717 c14717) {
        return m17026(c14717, "Android/obb/");
    }

    /* JADX INFO: renamed from: ۧ */
    public static ArrayList m17027() {
        return m17024("Android/obb/");
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m17026(C14717 c14717, String str) {
        ArrayList arrayListM17028 = m17028(str);
        for (int i = 0; i < arrayListM17028.size(); i++) {
            C2647 c2647 = (C2647) arrayListM17028.get(i);
            File file = new File(c14717.mo25505(), c2647.f4426);
            StringBuilder sbM17248 = C7470.m17248(str);
            sbM17248.append(c2647.f4426);
            String string = sbM17248.toString();
            arrayListM17028.set(i, new C14717(file, string, string, new C6671(-1L, c2647.f4425, true)));
        }
        return arrayListM17028;
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m17024(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = m17028(str).iterator();
        while (it.hasNext()) {
            arrayList.add(((C2647) it.next()).f4426);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۧ */
    public static ArrayList m17028(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : C14717.f41955.keySet()) {
            if (str2.startsWith(str) && new C16433(new Uri.Builder().scheme("content").authority("com.android.externalstorage.documents").appendPath("tree").appendPath("primary:".concat(str2)).appendPath("document").appendPath("primary:".concat(str2)).build()).mo25094()) {
                String strSubstring = str2.substring(str.length());
                if (strSubstring.endsWith("/")) {
                    strSubstring = C17073.m38720(1, 0, strSubstring);
                }
                if (strSubstring.indexOf(47) == -1) {
                    arrayList.add(strSubstring);
                    arrayList2.add(new C2647(new File(Environment.getExternalStorageDirectory(), str.concat(strSubstring)).lastModified(), strSubstring));
                }
            }
        }
        HashSet hashSet = new HashSet(arrayList);
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        for (PackageInfo packageInfo : C7050.m16217().getInstalledPackages(0)) {
            StringBuilder sbM17248 = C7470.m17248(str);
            sbM17248.append(packageInfo.packageName);
            File file = new File(externalStorageDirectory, sbM17248.toString());
            if (!hashSet.contains(packageInfo.packageName) && file.isDirectory()) {
                arrayList2.add(new C2647(file.lastModified(), packageInfo.packageName));
            }
        }
        return arrayList2;
    }
}
