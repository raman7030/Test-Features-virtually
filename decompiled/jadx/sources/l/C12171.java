package l;

import android.content.Context;
import android.os.Process;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.۫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 165Z */
/* JADX INFO: loaded from: classes3.dex */
public class C12171 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo29645(EnumC2815 enumC2815, int i, int i2, C13687 c13687) {
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29642(boolean z) {
        if (z) {
            return;
        }
        m29636();
        throw null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m29644(Object obj) {
        if (obj == null) {
            return;
        }
        m29636();
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29637(Object obj) {
        if (obj != null) {
            return;
        }
        m29636();
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29639(Object obj, boolean z) {
        if (z) {
            return;
        }
        m29640(String.valueOf(obj));
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29641(String str, boolean z) {
        if (z) {
            return;
        }
        m29640(str);
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29643(boolean z, Supplier supplier) {
        if (z) {
            return;
        }
        m29640((String) supplier.get());
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m29635(Context context, String str) {
        int iM46846;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strM46848 = C20450.m46848(str);
            if (strM46848 != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && C11003.equals(packageName2, packageName)) {
                    iM46846 = C20450.m46847(context, strM46848, packageName, iMyUid);
                } else {
                    iM46846 = C20450.m46846(context, strM46848, packageName);
                }
                if (iM46846 != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29638(Object obj, Supplier supplier) {
        if (obj != null) {
            return;
        }
        m29640((String) supplier.get());
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29636() {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29640(String str) {
        throw new AssertionError(str);
    }
}
