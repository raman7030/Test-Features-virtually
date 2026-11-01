package p067l;

import android.content.pm.PackageInfo;
import android.os.Environment;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵۠ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAOC */
/* JADX INFO: loaded from: classes4.dex */
public final class C20754 {
    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m46862(C14717 c14717) {
        return m46863(c14717, "Android/data/");
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m46860() {
        return m46861("Android/data/");
    }

    /* JADX INFO: renamed from: ۧ */
    public static ArrayList m46866(C14717 c14717) {
        return m46863(c14717, "Android/obb/");
    }

    /* JADX INFO: renamed from: ۧ */
    public static ArrayList m46864() {
        return m46861("Android/obb/");
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m46863(C14717 c14717, String str) {
        ArrayList arrayListM46865 = m46865(str);
        for (int i = 0; i < arrayListM46865.size(); i++) {
            C20083 c20083 = (C20083) arrayListM46865.get(i);
            File file = new File(c14717.mo25505(), c20083.f62174);
            StringBuilder sbM17248 = C7470.m17248(str);
            sbM17248.append(c20083.f62174);
            String string = sbM17248.toString();
            arrayListM46865.set(i, new C14717(file, string, string, new C6671(-1L, c20083.f62173, true)));
        }
        return arrayListM46865;
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m46861(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = m46865(str).iterator();
        while (it.hasNext()) {
            arrayList.add(((C20083) it.next()).f62174);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۧ */
    public static ArrayList m46865(String str) {
        ArrayList arrayList = new ArrayList();
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        for (PackageInfo packageInfo : C7050.m16217().getInstalledPackages(0)) {
            StringBuilder sbM17248 = C7470.m17248(str);
            sbM17248.append(packageInfo.packageName);
            File file = new File(externalStorageDirectory, sbM17248.toString());
            if (file.isDirectory()) {
                arrayList.add(new C20083(file.lastModified(), packageInfo.packageName));
            }
        }
        return arrayList;
    }
}
