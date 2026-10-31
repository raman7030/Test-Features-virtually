package l;

import android.content.pm.PackageInfo;
import android.os.Environment;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵۠ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAOC */
/* JADX INFO: loaded from: classes4.dex */
public final class C19345 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m44568(C12993 c12993) {
        return m44569(c12993, "Android/data/");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m44566() {
        return m44567("Android/data/");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m44572(C12993 c12993) {
        return m44569(c12993, "Android/obb/");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m44570() {
        return m44567("Android/obb/");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m44569(C12993 c12993, String str) {
        ArrayList arrayListM44571 = m44571(str);
        for (int i = 0; i < arrayListM44571.size(); i++) {
            C18639 c18639 = (C18639) arrayListM44571.get(i);
            File file = new File(c12993.mo23554(), c18639.f58951);
            StringBuilder sbM15339 = C5368.m15339(str);
            sbM15339.append(c18639.f58951);
            String string = sbM15339.toString();
            arrayListM44571.set(i, new C12993(file, string, string, new C4527(-1L, c18639.f58950, true)));
        }
        return arrayListM44571;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m44567(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = m44571(str).iterator();
        while (it.hasNext()) {
            arrayList.add(((C18639) it.next()).f58951);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m44571(String str) {
        ArrayList arrayList = new ArrayList();
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        for (PackageInfo packageInfo : C4925.m14320().getInstalledPackages(0)) {
            StringBuilder sbM15339 = C5368.m15339(str);
            sbM15339.append(packageInfo.packageName);
            File file = new File(externalStorageDirectory, sbM15339.toString());
            if (file.isDirectory()) {
                arrayList.add(new C18639(file.lastModified(), packageInfo.packageName));
            }
        }
        return arrayList;
    }
}
