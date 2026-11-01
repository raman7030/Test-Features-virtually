package p067l;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۘ᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9O0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6332 {

    /* JADX INFO: renamed from: ܽ */
    public static final C1650 f16414 = C1650.m40511();

    /* JADX INFO: renamed from: ֫ */
    public static final Object f16412 = new Object();

    /* JADX INFO: renamed from: ۧ */
    public static C4991 f16413 = null;

    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:47:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x009c  */
    /* JADX WARN: Code duplicated, block: B:49:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:81:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public static void m14486(Context context, boolean z) {
        int i;
        File file;
        int i2;
        boolean z2;
        File file2;
        long length;
        boolean z3;
        File file3;
        C17730 c17730M40289;
        int i3;
        C17730 c17730;
        int i4;
        if (z || f16413 == null) {
            synchronized (f16412) {
                if (!z) {
                    if (f16413 != null) {
                        return;
                    }
                    i = Build.VERSION.SDK_INT;
                    if (i >= 28 && i != 30) {
                        file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length2 = file.length();
                        i2 = 0;
                        if (file.exists() || length2 <= 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                        length = file2.length();
                        if (file2.exists() || length <= 0) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        try {
                            long jM14484 = m14484(context);
                            file3 = new File(context.getFilesDir(), "profileInstalled");
                            if (file3.exists()) {
                                try {
                                    c17730M40289 = C17730.m40289(file3);
                                } catch (IOException unused) {
                                    m14485();
                                    return;
                                }
                            } else {
                                c17730M40289 = null;
                            }
                            if (c17730M40289 == null && c17730M40289.f52958 == jM14484 && (i4 = c17730M40289.f52959) != 2) {
                                i2 = i4;
                            } else if (z2) {
                                i2 = 1;
                            } else if (z3) {
                                i2 = 2;
                            }
                            if (z && z3 && i2 != 1) {
                                i2 = 2;
                            }
                            if (c17730M40289 == null && c17730M40289.f52959 == 2 && i2 == 1 && length2 < c17730M40289.f52957) {
                                i3 = 3;
                            } else {
                                i3 = i2;
                            }
                            c17730 = new C17730(1, i3, jM14484, length);
                            if (c17730M40289 != null || !c17730M40289.equals(c17730)) {
                                try {
                                    c17730.m40290(file3);
                                } catch (IOException unused2) {
                                }
                            }
                            m14485();
                            return;
                        } catch (PackageManager.NameNotFoundException unused3) {
                            m14485();
                            return;
                        }
                    }
                    m14485();
                    return;
                }
                i = Build.VERSION.SDK_INT;
                if (i >= 28) {
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length3 = file.length();
                    i2 = 0;
                    if (file.exists()) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists()) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    long jM14485 = m14484(context);
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        c17730M40289 = C17730.m40289(file3);
                    } else {
                        c17730M40289 = null;
                    }
                    if (c17730M40289 == null) {
                        if (z2) {
                            i2 = 1;
                        } else if (z3) {
                            i2 = 2;
                        }
                    } else if (z2) {
                        i2 = 1;
                    } else if (z3) {
                        i2 = 2;
                    }
                    if (z) {
                        i2 = 2;
                    }
                    if (c17730M40289 == null) {
                        i3 = i2;
                    } else {
                        i3 = i2;
                    }
                    c17730 = new C17730(1, i3, jM14485, length);
                    if (c17730M40289 != null) {
                        c17730.m40290(file3);
                    } else {
                        c17730.m40290(file3);
                    }
                    m14485();
                    return;
                }
                m14485();
                return;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4991 m14485() {
        C4991 c4991 = new C4991();
        f16413 = c4991;
        f16414.m40512(c4991);
        return f16413;
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m14484(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return C11026.m25422(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }
}
