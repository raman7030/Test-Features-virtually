package p067l;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import bin.p000mt.plus.Features;
import com.alipay.sdk.app.OpenAuthTask;
import com.alipay.sdk.p010m.p039o.C0180b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩺֨ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85H5 */
/* JADX INFO: loaded from: classes.dex */
public final class C23904 {

    /* JADX INFO: renamed from: ֫ */
    public static final ArrayList f75900 = new ArrayList();

    static {
        for (int i = 0; i < 5000; i++) {
            try {
                String strM54 = Features.m54(i);
                if (strM54 != null) {
                    f75900.add(new C13176(i, strM54));
                }
            } catch (Throwable unused) {
            }
        }
        for (int i2 = OpenAuthTask.f239OK; i2 < 10000; i2++) {
            try {
                String strM55 = Features.m54(i2);
                if (strM55 != null) {
                    f75900.add(new C13176(i2, strM55));
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static List m52982() {
        return C21562.unmodifiableList(f75900);
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m52981() {
        int i;
        String strM54;
        String strM55;
        String strM56;
        ArrayList arrayList = new ArrayList();
        try {
            List<PackageInfo> installedPackages = C7050.m16217().getInstalledPackages(0);
            ArrayList arrayList2 = f75900;
            C20125 c20125 = new C20125(arrayList2.size() + installedPackages.size());
            arrayList.addAll(arrayList2);
            for (PackageInfo packageInfo : installedPackages) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if (applicationInfo != null && (i = applicationInfo.uid) >= 10000 && !c20125.contains(i)) {
                    try {
                        String strM57 = Features.m54(applicationInfo.uid);
                        if (strM57 != null) {
                            c20125.add(applicationInfo.uid);
                            arrayList.add(new C13176(applicationInfo.uid, strM57, packageInfo, 0));
                        }
                        if (Features.f27 && !c20125.contains(applicationInfo.uid + 10000) && (strM56 = Features.m54(applicationInfo.uid + 10000)) != null) {
                            c20125.add(applicationInfo.uid + 10000);
                            arrayList.add(new C13176(applicationInfo.uid + 10000, strM56, packageInfo, 0));
                        }
                        if (Features.f26 && !c20125.contains(applicationInfo.uid + C0180b.f790j0) && (strM55 = Features.m54(applicationInfo.uid + C0180b.f790j0)) != null) {
                            c20125.add(applicationInfo.uid + C0180b.f790j0);
                            arrayList.add(new C13176(applicationInfo.uid + C0180b.f790j0, strM55, packageInfo, 0));
                        }
                        if (Features.f28 && !c20125.contains(applicationInfo.uid + 99900000) && (strM54 = Features.m54(applicationInfo.uid + 99900000)) != null) {
                            c20125.add(applicationInfo.uid + 99900000);
                            arrayList.add(new C13176(applicationInfo.uid + 99900000, strM54, packageInfo, 0));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        } catch (RuntimeException unused2) {
        }
        Collections.sort(arrayList, C10162.comparingInt(new C7811(0)));
        return arrayList;
    }
}
