package l;

import android.content.pm.PackageInfo;
import android.os.Environment;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.֨۠ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D94N */
/* JADX INFO: loaded from: classes2.dex */
public final class C0999 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m3492(Set set, String str) {
        C19697 c19697 = null;
        try {
            try {
                C19697 c19697M10607 = C3468.m10607(false);
                if (!c19697M10607.m45364()) {
                    List list = Collections.EMPTY_LIST;
                    c19697M10607.m45389();
                    return list;
                }
                String path = new File(Environment.getExternalStorageDirectory(), str).getPath();
                ArrayList arrayList = new ArrayList();
                for (PackageInfo packageInfo : C4925.m14320().getInstalledPackages(0)) {
                    if (!set.contains(packageInfo.packageName)) {
                        arrayList.add(packageInfo.packageName);
                    }
                }
                boolean[] zArrM45362 = c19697M10607.m45362(path, arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < zArrM45362.length; i++) {
                    if (zArrM45362[i]) {
                        arrayList2.add((String) arrayList.get(i));
                    }
                }
                c19697M10607.m45389();
                return arrayList2;
            } catch (Exception unused) {
                List list2 = Collections.EMPTY_LIST;
                if (0 != 0) {
                    c19697.m45389();
                }
                return list2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                c19697.m45389();
            }
            throw th;
        }
    }
}
