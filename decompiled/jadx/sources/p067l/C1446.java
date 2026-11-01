package p067l;

import android.content.Context;
import android.os.Process;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.۫ۙ */
/* JADX INFO: compiled from: 165Z */
/* JADX INFO: loaded from: classes3.dex */
public class C1446 {
    /* JADX INFO: renamed from: ֫ */
    public void mo31707(EnumC5044 enumC5044, int i, int i2, C15376 c15376) {
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m31704(boolean z) {
        if (z) {
            return;
        }
        m31698();
        throw null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m31706(Object obj) {
        if (obj == null) {
            return;
        }
        m31698();
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m31699(Object obj) {
        if (obj != null) {
            return;
        }
        m31698();
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m31701(Object obj, boolean z) {
        if (z) {
            return;
        }
        m31702(String.valueOf(obj));
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m31703(String str, boolean z) {
        if (z) {
            return;
        }
        m31702(str);
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m31705(boolean z, Supplier supplier) {
        if (z) {
            return;
        }
        m31702((String) supplier.get());
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m31697(Context context, String str) {
        int iM49169;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strM49171 = C1856.m49171(str);
            if (strM49171 != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && C12826.equals(packageName2, packageName)) {
                    iM49169 = C1856.m49170(context, strM49171, packageName, iMyUid);
                } else {
                    iM49169 = C1856.m49169(context, strM49171, packageName);
                }
                if (iM49169 != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m31700(Object obj, Supplier supplier) {
        if (obj != null) {
            return;
        }
        m31702((String) supplier.get());
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m31698() {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m31702(String str) {
        throw new AssertionError(str);
    }
}
