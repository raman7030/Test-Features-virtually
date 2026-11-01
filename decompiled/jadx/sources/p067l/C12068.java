package p067l;

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
public final class C12068 {

    /* JADX INFO: renamed from: ֫ */
    public final C2593 f33625;

    public C12068(C2593 c2593) {
        this.f33625 = c2593;
    }

    /* JADX INFO: renamed from: ֫ */
    public final List m27638() {
        int iIndexOf;
        this.f33625.getClass();
        Application applicationM16232 = C7050.m16232();
        ApplicationInfo applicationInfo = applicationM16232.getApplicationInfo();
        TreeSet<String> treeSet = new TreeSet();
        m27636(treeSet, applicationInfo.dataDir);
        if (Build.VERSION.SDK_INT >= 24) {
            m27636(treeSet, applicationInfo.deviceProtectedDataDir);
            m27636(treeSet, applicationM16232.createDeviceProtectedStorageContext().getDataDir().getPath());
        }
        String packageName = applicationM16232.getPackageName();
        String str = applicationInfo.dataDir;
        m27636(treeSet, C21466.m48631("/data/data/", packageName));
        m27636(treeSet, C21466.m48631("/data/user/0/", packageName));
        m27636(treeSet, C21466.m48631("/data/user_de/0/", packageName));
        if (str != null && str.startsWith("/data/user/") && (iIndexOf = str.indexOf(47, 11)) > 11) {
            String strSubstring = str.substring(11, iIndexOf);
            m27636(treeSet, C20865.m47154("/data/user/", strSubstring, "/", packageName));
            m27636(treeSet, C20865.m47154("/data/user_de/", strSubstring, "/", packageName));
        }
        m27637(treeSet, applicationM16232.getExternalFilesDirs(null), applicationM16232.getPackageName());
        m27637(treeSet, applicationM16232.getExternalCacheDirs(), applicationM16232.getPackageName());
        File file = applicationInfo.sourceDir == null ? null : new File(applicationInfo.sourceDir);
        String parent = file == null ? null : file.getParent();
        m27636(treeSet, parent);
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                String str2 = strArr[i];
                File file2 = str2 == null ? null : new File(str2);
                m27636(treeSet, file2 == null ? null : file2.getParent());
            }
        }
        String str3 = applicationInfo.nativeLibraryDir;
        if (str3 != null && (parent == null || !C14059.m31906(str3, parent))) {
            m27636(treeSet, applicationInfo.nativeLibraryDir);
        }
        ArrayList arrayList = new ArrayList();
        for (String str4 : treeSet) {
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    arrayList.add(str4);
                    break;
                }
            } while (!C14059.m31906(str4, (String) it.next()));
        }
        return C21562.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27637(TreeSet treeSet, File[] fileArr, String str) {
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
            m27636(treeSet, path);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27636(TreeSet treeSet, String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        try {
            String strM31907 = C14059.m31907(str, "managedPath");
            if ("/".equals(strM31907)) {
                return;
            }
            treeSet.add(strM31907);
        } catch (C5276 unused) {
        }
    }
}
