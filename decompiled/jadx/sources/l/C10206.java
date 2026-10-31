package l;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.ۤۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6ZJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10206 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0236 f30664;

    public C10206(C0236 c0236) {
        this.f30664 = c0236;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m25616() {
        int iIndexOf;
        this.f30664.getClass();
        Application applicationM14335 = C4925.m14335();
        ApplicationInfo applicationInfo = applicationM14335.getApplicationInfo();
        TreeSet<String> treeSet = new TreeSet();
        m25614(treeSet, applicationInfo.dataDir);
        if (Build.VERSION.SDK_INT >= 24) {
            m25614(treeSet, applicationInfo.deviceProtectedDataDir);
            m25614(treeSet, applicationM14335.createDeviceProtectedStorageContext().getDataDir().getPath());
        }
        String packageName = applicationM14335.getPackageName();
        String str = applicationInfo.dataDir;
        m25614(treeSet, C20094.m46315("/data/data/", packageName));
        m25614(treeSet, C20094.m46315("/data/user/0/", packageName));
        m25614(treeSet, C20094.m46315("/data/user_de/0/", packageName));
        if (str != null && str.startsWith("/data/user/") && (iIndexOf = str.indexOf(47, 11)) > 11) {
            String strSubstring = str.substring(11, iIndexOf);
            m25614(treeSet, C19462.m44858("/data/user/", strSubstring, "/", packageName));
            m25614(treeSet, C19462.m44858("/data/user_de/", strSubstring, "/", packageName));
        }
        m25615(treeSet, applicationM14335.getExternalFilesDirs(null), applicationM14335.getPackageName());
        m25615(treeSet, applicationM14335.getExternalCacheDirs(), applicationM14335.getPackageName());
        File file = applicationInfo.sourceDir == null ? null : new File(applicationInfo.sourceDir);
        String parent = file == null ? null : file.getParent();
        m25614(treeSet, parent);
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                String str2 = strArr[i];
                File file2 = str2 == null ? null : new File(str2);
                m25614(treeSet, file2 == null ? null : file2.getParent());
            }
        }
        String str3 = applicationInfo.nativeLibraryDir;
        if (str3 != null && (parent == null || !C12301.m29846(str3, parent))) {
            m25614(treeSet, applicationInfo.nativeLibraryDir);
        }
        ArrayList arrayList = new ArrayList();
        for (String str4 : treeSet) {
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    arrayList.add(str4);
                    break;
                }
            } while (!C12301.m29846(str4, (String) it.next()));
        }
        return C20195.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25615(TreeSet treeSet, File[] fileArr, String str) {
        if (fileArr == null) {
            return;
        }
        int length = fileArr.length;
        for (int i = 0; i < length; i++) {
            File file = fileArr[i];
            String path = null;
            File parentFile = file == null ? null : file.getParentFile();
            if (parentFile != null && str.equals(parentFile.getName())) {
                path = parentFile.getPath();
            } else if (file != null) {
                path = file.getPath();
            }
            m25614(treeSet, path);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25614(TreeSet treeSet, String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        try {
            String strM29847 = C12301.m29847(str, "managedPath");
            if ("/".equals(strM29847)) {
                return;
            }
            treeSet.add(strM29847);
        } catch (C3059 unused) {
        }
    }
}
