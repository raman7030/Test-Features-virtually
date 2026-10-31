package l;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import java.io.File;

/* JADX INFO: renamed from: l.֫᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19BY */
/* JADX INFO: loaded from: classes2.dex */
public final class C2094 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final File f6976;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final boolean f6977;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C7549 f6978;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static long f6979;

    static {
        f6977 = Build.VERSION.SDK_INT >= 29 && C4925.m14303().targetSdkVersion >= 29;
        f6976 = new File(C4925.m14322(), "term/bin");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C7549 m6880() {
        PackageInfo packageInfoM14304;
        C7549 c7549;
        C7549 c75410 = f6978;
        if (c75410 != null && c75410.m20275()) {
            return c75410;
        }
        if (SystemClock.uptimeMillis() - f6979 >= 5000) {
            f6979 = SystemClock.uptimeMillis();
            if (!f6977) {
                AbstractC15440 abstractC15440M36526 = C16293.f50117.m36526("term/version");
                File file = f6976;
                if (file.isDirectory() && abstractC15440M36526.mo23119()) {
                    try {
                        C12951 c12951M36528 = abstractC15440M36526.m36528();
                        c7549 = new C7549(c12951M36528.readInt(), c12951M36528.m31506(), null, file);
                    } catch (Exception unused) {
                        c7549 = null;
                    }
                } else {
                    c7549 = null;
                }
            } else {
                try {
                    packageInfoM14304 = C4925.m14304("bin.mt.termex");
                } catch (PackageManager.NameNotFoundException unused2) {
                    packageInfoM14304 = null;
                }
                if (packageInfoM14304 != null) {
                    c7549 = new C7549(packageInfoM14304.versionCode, packageInfoM14304.versionName, packageInfoM14304.applicationInfo.sourceDir, new File(packageInfoM14304.applicationInfo.nativeLibraryDir));
                } else {
                    c7549 = null;
                }
            }
            if (c7549 != null && c7549.m20275()) {
                f6978 = c7549;
                return c7549;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m6881() {
        f6979 = 0L;
        f6978 = null;
    }
}
