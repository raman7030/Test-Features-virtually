package p067l;

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
public final class C3318 {
    /* JADX INFO: renamed from: ֫ */
    public static List m5795(Set set, String str) {
        C21089 c21089 = null;
        try {
            try {
                C21089 c21089M12615 = C5665.m12615(false);
                if (!c21089M12615.m47661()) {
                    List list = Collections.EMPTY_LIST;
                    c21089M12615.m47686();
                    return list;
                }
                String path = new File(Environment.getExternalStorageDirectory(), str).getPath();
                ArrayList arrayList = new ArrayList();
                for (PackageInfo packageInfo : C7050.m16217().getInstalledPackages(0)) {
                    if (!set.contains(packageInfo.packageName)) {
                        arrayList.add(packageInfo.packageName);
                    }
                }
                boolean[] zArrM47659 = c21089M12615.m47659(path, arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < zArrM47659.length; i++) {
                    if (zArrM47659[i]) {
                        arrayList2.add((String) arrayList.get(i));
                    }
                }
                c21089M12615.m47686();
                return arrayList2;
            } catch (Exception unused) {
                List list2 = Collections.EMPTY_LIST;
                if (0 != 0) {
                    c21089.m47686();
                }
                return list2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                c21089.m47686();
            }
            throw th;
        }
    }
}
