package l;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۘ᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9O0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4170 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C16278 f13601 = C16278.m38297();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Object f13599 = new Object();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C2759 f13600 = null;

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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12611(Context context, boolean z) {
        int i;
        File file;
        int i2;
        boolean z2;
        File file2;
        long length;
        boolean z3;
        File file3;
        C16163 c16163M38097;
        int i3;
        C16163 c16163;
        int i4;
        if (z || f13600 == null) {
            synchronized (f13599) {
                if (!z) {
                    if (f13600 != null) {
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
                            long jM12609 = m12609(context);
                            file3 = new File(context.getFilesDir(), "profileInstalled");
                            if (file3.exists()) {
                                try {
                                    c16163M38097 = C16163.m38097(file3);
                                } catch (IOException unused) {
                                    m12610();
                                    return;
                                }
                            } else {
                                c16163M38097 = null;
                            }
                            if (c16163M38097 == null && c16163M38097.f49792 == jM12609 && (i4 = c16163M38097.f49793) != 2) {
                                i2 = i4;
                            } else if (z2) {
                                i2 = 1;
                            } else if (z3) {
                                i2 = 2;
                            }
                            if (z && z3 && i2 != 1) {
                                i2 = 2;
                            }
                            if (c16163M38097 == null && c16163M38097.f49793 == 2 && i2 == 1 && length2 < c16163M38097.f49791) {
                                i3 = 3;
                            } else {
                                i3 = i2;
                            }
                            c16163 = new C16163(1, i3, jM12609, length);
                            if (c16163M38097 != null || !c16163M38097.equals(c16163)) {
                                try {
                                    c16163.m38098(file3);
                                } catch (IOException unused2) {
                                }
                            }
                            m12610();
                            return;
                        } catch (PackageManager.NameNotFoundException unused3) {
                            m12610();
                            return;
                        }
                    }
                    m12610();
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
                    long jM126010 = m12609(context);
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        c16163M38097 = C16163.m38097(file3);
                    } else {
                        c16163M38097 = null;
                    }
                    if (c16163M38097 == null) {
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
                    if (c16163M38097 == null) {
                        i3 = i2;
                    } else {
                        i3 = i2;
                    }
                    c16163 = new C16163(1, i3, jM126010, length);
                    if (c16163M38097 != null) {
                        c16163.m38098(file3);
                    } else {
                        c16163.m38098(file3);
                    }
                    m12610();
                    return;
                }
                m12610();
                return;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2759 m12610() {
        C2759 c2759 = new C2759();
        f13600 = c2759;
        f13601.m38298(c2759);
        return f13600;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m12609(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return C9109.m23475(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }
}
