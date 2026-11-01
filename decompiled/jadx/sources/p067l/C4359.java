package p067l;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import java.io.File;

/* JADX INFO: renamed from: l.֫᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19BY */
/* JADX INFO: loaded from: classes2.dex */
public final class C4359 {

    /* JADX INFO: renamed from: ֫ */
    public static final File f9760;

    /* JADX INFO: renamed from: ۧ */
    public static final boolean f9761;

    /* JADX INFO: renamed from: ܽ */
    public static C9543 f9762;

    /* JADX INFO: renamed from: ᩳ */
    public static long f9763;

    static {
        f9761 = Build.VERSION.SDK_INT >= 29 && C7050.m16200().targetSdkVersion >= 29;
        f9760 = new File(C7050.m16219(), "term/bin");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX INFO: renamed from: ۧ */
    public static C9543 m9006() {
        PackageInfo packageInfoM16201;
        C9543 c9543;
        C9543 c9544 = f9762;
        if (c9544 != null && c9544.m22251()) {
            return c9544;
        }
        if (SystemClock.uptimeMillis() - f9763 >= 5000) {
            f9763 = SystemClock.uptimeMillis();
            if (!f9761) {
                AbstractC17043 abstractC17043M38684 = C17853.f53284.m38684("term/version");
                File file = f9760;
                if (file.isDirectory() && abstractC17043M38684.mo25093()) {
                    try {
                        C14677 c14677M38686 = abstractC17043M38684.m38686();
                        c9543 = new C9543(c14677M38686.readInt(), c14677M38686.m33593(), null, file);
                    } catch (Exception unused) {
                        c9543 = null;
                    }
                } else {
                    c9543 = null;
                }
            } else {
                try {
                    packageInfoM16201 = C7050.m16201("bin.mt.termex");
                } catch (PackageManager.NameNotFoundException unused2) {
                    packageInfoM16201 = null;
                }
                if (packageInfoM16201 != null) {
                    c9543 = new C9543(packageInfoM16201.versionCode, packageInfoM16201.versionName, packageInfoM16201.applicationInfo.sourceDir, new File(packageInfoM16201.applicationInfo.nativeLibraryDir));
                } else {
                    c9543 = null;
                }
            }
            if (c9543 != null && c9543.m22251()) {
                f9762 = c9543;
                return c9543;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m9007() {
        f9763 = 0L;
        f9762 = null;
    }
}
