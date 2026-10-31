package l;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: l.ᩴܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 316P */
/* JADX INFO: loaded from: classes4.dex */
public final class C18838 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C1315 f59422 = new C1315(50);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C3048 f59423 = new C3048();

    /* JADX WARN: Code duplicated, block: B:100:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:111:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:114:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0062 A[Catch: all -> 0x01b8, TryCatch #2 {all -> 0x01b8, blocks: (B:12:0x0058, B:14:0x0062, B:15:0x0068, B:17:0x006e), top: B:116:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0068 A[Catch: all -> 0x01b8, TryCatch #2 {all -> 0x01b8, blocks: (B:12:0x0058, B:14:0x0062, B:15:0x0068, B:17:0x006e), top: B:116:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x006e A[Catch: all -> 0x01b8, TRY_LEAVE, TryCatch #2 {all -> 0x01b8, blocks: (B:12:0x0058, B:14:0x0062, B:15:0x0068, B:17:0x006e), top: B:116:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d0 A[DONT_INVERT, PHI: r7 r8 r10
      0x00d0: PHI (r7v5 java.lang.String) = 
      (r7v4 java.lang.String)
      (r7v4 java.lang.String)
      (r7v4 java.lang.String)
      (r7v4 java.lang.String)
      (r7v4 java.lang.String)
      (r7v14 java.lang.String)
     binds: [B:23:0x0080, B:25:0x008a, B:35:0x00a0, B:37:0x00a9, B:39:0x00b1, B:47:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r8v4 l.ܶ᩵ܿ) = (r8v2 l.ܶ᩵ܿ), (r8v2 l.ܶ᩵ܿ), (r8v2 l.ܶ᩵ܿ), (r8v2 l.ܶ᩵ܿ), (r8v2 l.ܶ᩵ܿ), (r8v5 l.ܶ᩵ܿ) binds: [B:23:0x0080, B:25:0x008a, B:35:0x00a0, B:37:0x00a9, B:39:0x00b1, B:47:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r10v1 android.content.pm.PackageInfo) = 
      (r10v0 android.content.pm.PackageInfo)
      (r10v0 android.content.pm.PackageInfo)
      (r10v0 android.content.pm.PackageInfo)
      (r10v0 android.content.pm.PackageInfo)
      (r10v0 android.content.pm.PackageInfo)
      (r10v6 android.content.pm.PackageInfo)
     binds: [B:23:0x0080, B:25:0x008a, B:35:0x00a0, B:37:0x00a9, B:39:0x00b1, B:47:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d2 A[Catch: all -> 0x01b2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x01b2, blocks: (B:22:0x007c, B:24:0x0082, B:26:0x008c, B:40:0x00b3, B:42:0x00b9, B:29:0x0091, B:31:0x0095, B:34:0x009e, B:36:0x00a2, B:38:0x00ab, B:51:0x00d2, B:55:0x00db, B:58:0x00ec, B:60:0x00f3, B:63:0x00fd, B:68:0x0126, B:98:0x0193, B:71:0x012e, B:74:0x0138, B:78:0x0145, B:81:0x014e, B:84:0x015d, B:87:0x0165, B:89:0x016e, B:92:0x0175, B:93:0x0185, B:94:0x018a, B:95:0x018b, B:96:0x0190, B:103:0x01ae, B:104:0x01b1, B:62:0x00f9, B:64:0x010e, B:67:0x011b), top: B:113:0x007c, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00db A[Catch: all -> 0x01b2, TRY_ENTER, TryCatch #0 {all -> 0x01b2, blocks: (B:22:0x007c, B:24:0x0082, B:26:0x008c, B:40:0x00b3, B:42:0x00b9, B:29:0x0091, B:31:0x0095, B:34:0x009e, B:36:0x00a2, B:38:0x00ab, B:51:0x00d2, B:55:0x00db, B:58:0x00ec, B:60:0x00f3, B:63:0x00fd, B:68:0x0126, B:98:0x0193, B:71:0x012e, B:74:0x0138, B:78:0x0145, B:81:0x014e, B:84:0x015d, B:87:0x0165, B:89:0x016e, B:92:0x0175, B:93:0x0185, B:94:0x018a, B:95:0x018b, B:96:0x0190, B:103:0x01ae, B:104:0x01b1, B:62:0x00f9, B:64:0x010e, B:67:0x011b), top: B:113:0x007c, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f3 A[Catch: all -> 0x01b2, TryCatch #0 {all -> 0x01b2, blocks: (B:22:0x007c, B:24:0x0082, B:26:0x008c, B:40:0x00b3, B:42:0x00b9, B:29:0x0091, B:31:0x0095, B:34:0x009e, B:36:0x00a2, B:38:0x00ab, B:51:0x00d2, B:55:0x00db, B:58:0x00ec, B:60:0x00f3, B:63:0x00fd, B:68:0x0126, B:98:0x0193, B:71:0x012e, B:74:0x0138, B:78:0x0145, B:81:0x014e, B:84:0x015d, B:87:0x0165, B:89:0x016e, B:92:0x0175, B:93:0x0185, B:94:0x018a, B:95:0x018b, B:96:0x0190, B:103:0x01ae, B:104:0x01b1, B:62:0x00f9, B:64:0x010e, B:67:0x011b), top: B:113:0x007c, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f9 A[Catch: all -> 0x01b2, TryCatch #0 {all -> 0x01b2, blocks: (B:22:0x007c, B:24:0x0082, B:26:0x008c, B:40:0x00b3, B:42:0x00b9, B:29:0x0091, B:31:0x0095, B:34:0x009e, B:36:0x00a2, B:38:0x00ab, B:51:0x00d2, B:55:0x00db, B:58:0x00ec, B:60:0x00f3, B:63:0x00fd, B:68:0x0126, B:98:0x0193, B:71:0x012e, B:74:0x0138, B:78:0x0145, B:81:0x014e, B:84:0x015d, B:87:0x0165, B:89:0x016e, B:92:0x0175, B:93:0x0185, B:94:0x018a, B:95:0x018b, B:96:0x0190, B:103:0x01ae, B:104:0x01b1, B:62:0x00f9, B:64:0x010e, B:67:0x011b), top: B:113:0x007c, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x012d A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:71:0x012e A[Catch: all -> 0x01b2, TryCatch #0 {all -> 0x01b2, blocks: (B:22:0x007c, B:24:0x0082, B:26:0x008c, B:40:0x00b3, B:42:0x00b9, B:29:0x0091, B:31:0x0095, B:34:0x009e, B:36:0x00a2, B:38:0x00ab, B:51:0x00d2, B:55:0x00db, B:58:0x00ec, B:60:0x00f3, B:63:0x00fd, B:68:0x0126, B:98:0x0193, B:71:0x012e, B:74:0x0138, B:78:0x0145, B:81:0x014e, B:84:0x015d, B:87:0x0165, B:89:0x016e, B:92:0x0175, B:93:0x0185, B:94:0x018a, B:95:0x018b, B:96:0x0190, B:103:0x01ae, B:104:0x01b1, B:62:0x00f9, B:64:0x010e, B:67:0x011b), top: B:113:0x007c, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0142 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C4021 m43525(AbstractC15440 abstractC15440) {
        PackageManager packageManagerM14320;
        AbstractC15440 abstractC15440M43520;
        AbstractC15440 abstractC15441;
        String strMo23554;
        PackageInfo packageArchiveInfo;
        String str;
        String str2;
        long longVersionCode;
        Drawable defaultActivityIcon;
        Bitmap bitmap;
        int width;
        int iMax;
        Drawable bitmapDrawable;
        C3048 c3048 = f59423;
        C11233.m27805(abstractC15440, "file");
        String str3 = abstractC15440.mo23554() + ":" + abstractC15440.mo23117() + ":" + abstractC15440.mo23127();
        C1315 c1315 = f59422;
        Object objM4553 = c1315.m4553(str3);
        AbstractC15440 abstractC15442 = null;
        if (objM4553 == null) {
            try {
                packageManagerM14320 = C4925.m14320();
                if (abstractC15440.m36488()) {
                    strMo23554 = abstractC15440.mo23544();
                    abstractC15441 = null;
                } else {
                    abstractC15440M43520 = m43520(abstractC15440);
                    if (abstractC15440M43520 == null) {
                        m43522(str3);
                        return null;
                    }
                    try {
                        abstractC15441 = abstractC15440M43520;
                        strMo23554 = abstractC15440M43520.mo23554();
                    } catch (Throwable th) {
                        th = th;
                        abstractC15442 = abstractC15440M43520;
                    }
                }
                try {
                    packageArchiveInfo = packageManagerM14320.getPackageArchiveInfo(strMo23554, 0);
                    if (packageArchiveInfo == null || !C11233.m27802((Object) strMo23554, (Object) abstractC15440.mo23544()) || (!(abstractC15440 instanceof C14798) && ((!(abstractC15440 instanceof C15587) || !C3016.m9237((CharSequence) strMo23554, (CharSequence) "download", true)) && (!(abstractC15440 instanceof C11293) || ((C11293) abstractC15440).m27916() || !C3016.m9243(strMo23554, "/data/"))))) {
                        if (packageArchiveInfo == null) {
                            ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
                            C11233.m27799(applicationInfo);
                            applicationInfo.publicSourceDir = strMo23554;
                            applicationInfo.sourceDir = strMo23554;
                            str = applicationInfo.packageName;
                            str2 = packageArchiveInfo.versionName;
                            if (str2 == null) {
                                str2 = "null";
                            }
                            String str4 = str2;
                            if (Build.VERSION.SDK_INT >= 28) {
                                longVersionCode = packageArchiveInfo.getLongVersionCode();
                            } else {
                                longVersionCode = packageArchiveInfo.versionCode;
                            }
                            long j = longVersionCode;
                            long jMo23127 = abstractC15440.mo23127();
                            int i = applicationInfo.targetSdkVersion;
                            int iM43519 = m43519(applicationInfo);
                            String strM43523 = m43523(applicationInfo);
                            c3048.m9339(str);
                            try {
                                C3816.m11502(applicationInfo.icon, str);
                                try {
                                    defaultActivityIcon = applicationInfo.loadIcon(packageManagerM14320);
                                    C11233.m27799(defaultActivityIcon);
                                } catch (Throwable unused) {
                                    defaultActivityIcon = C4925.m14320().getDefaultActivityIcon();
                                    C11233.m27799(defaultActivityIcon);
                                }
                                c3048.m9340(str);
                                if ((defaultActivityIcon instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) defaultActivityIcon).getBitmap()) != null) {
                                    width = bitmap.getWidth();
                                    int height = bitmap.getHeight();
                                    if (width <= 0 && height > 0 && (iMax = Math.max(width, height)) > 512) {
                                        float f = 512.0f / iMax;
                                        float f2 = width * f;
                                        if (Float.isNaN(f2)) {
                                            throw new IllegalArgumentException("Cannot round NaN value.");
                                        }
                                        int iRound = Math.round(f2);
                                        if (iRound < 1) {
                                            iRound = 1;
                                        }
                                        float f3 = height * f;
                                        if (Float.isNaN(f3)) {
                                            throw new IllegalArgumentException("Cannot round NaN value.");
                                        }
                                        int iRound2 = Math.round(f3);
                                        if (iRound2 < 1) {
                                            iRound2 = 1;
                                        }
                                        bitmapDrawable = new BitmapDrawable(C4925.m14338(), Bitmap.createScaledBitmap(bitmap, iRound, iRound2, true));
                                    }
                                    C11233.m27799((Object) str);
                                    C4021 c4021 = new C4021(str, strM43523, str4, j, jMo23127, i, iM43519, defaultActivityIcon, bitmapDrawable, applicationInfo.icon);
                                    c1315.m4554(str3, c4021);
                                    if (abstractC15441 != null) {
                                        abstractC15441.mo23552();
                                    }
                                    return c4021;
                                }
                                bitmapDrawable = defaultActivityIcon;
                                C11233.m27799((Object) str);
                                C4021 c4022 = new C4021(str, strM43523, str4, j, jMo23127, i, iM43519, defaultActivityIcon, bitmapDrawable, applicationInfo.icon);
                                c1315.m4554(str3, c4022);
                                if (abstractC15441 != null) {
                                    abstractC15441.mo23552();
                                }
                                return c4022;
                            } catch (Throwable th2) {
                                c3048.m9340(str);
                                throw th2;
                            }
                        }
                        m43522(str3);
                        if (abstractC15441 != null) {
                            abstractC15441.mo23552();
                        }
                        if (abstractC15442 != null) {
                            abstractC15442.mo23552();
                        }
                        throw th;
                    }
                    AbstractC15440 abstractC15440M43521 = m43520(abstractC15440);
                    if (abstractC15440M43521 != null) {
                        try {
                            strMo23554 = abstractC15440M43521.mo23554();
                            packageArchiveInfo = packageManagerM14320.getPackageArchiveInfo(strMo23554, 0);
                            abstractC15441 = abstractC15440M43521;
                            if (packageArchiveInfo == null) {
                                ApplicationInfo applicationInfo2 = packageArchiveInfo.applicationInfo;
                                C11233.m27799(applicationInfo2);
                                applicationInfo2.publicSourceDir = strMo23554;
                                applicationInfo2.sourceDir = strMo23554;
                                str = applicationInfo2.packageName;
                                str2 = packageArchiveInfo.versionName;
                                if (str2 == null) {
                                    str2 = "null";
                                }
                                String str5 = str2;
                                if (Build.VERSION.SDK_INT >= 28) {
                                    longVersionCode = packageArchiveInfo.getLongVersionCode();
                                } else {
                                    longVersionCode = packageArchiveInfo.versionCode;
                                }
                                long j2 = longVersionCode;
                                long jMo23128 = abstractC15440.mo23127();
                                int i2 = applicationInfo2.targetSdkVersion;
                                int iM435110 = m43519(applicationInfo2);
                                String strM43524 = m43523(applicationInfo2);
                                c3048.m9339(str);
                                C3816.m11502(applicationInfo2.icon, str);
                                defaultActivityIcon = applicationInfo2.loadIcon(packageManagerM14320);
                                C11233.m27799(defaultActivityIcon);
                                c3048.m9340(str);
                                if (defaultActivityIcon instanceof BitmapDrawable) {
                                    width = bitmap.getWidth();
                                    int height2 = bitmap.getHeight();
                                    if (width <= 0) {
                                    }
                                    C11233.m27799((Object) str);
                                    C4021 c4023 = new C4021(str, strM43524, str5, j2, jMo23128, i2, iM435110, defaultActivityIcon, bitmapDrawable, applicationInfo2.icon);
                                    c1315.m4554(str3, c4023);
                                    if (abstractC15441 != null) {
                                        abstractC15441.mo23552();
                                    }
                                    return c4023;
                                }
                                bitmapDrawable = defaultActivityIcon;
                                C11233.m27799((Object) str);
                                C4021 c4024 = new C4021(str, strM43524, str5, j2, jMo23128, i2, iM435110, defaultActivityIcon, bitmapDrawable, applicationInfo2.icon);
                                c1315.m4554(str3, c4024);
                                if (abstractC15441 != null) {
                                    abstractC15441.mo23552();
                                }
                                return c4024;
                            }
                            m43522(str3);
                            if (abstractC15441 != null) {
                                abstractC15441.mo23552();
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            abstractC15442 = abstractC15440M43521;
                        }
                        if (abstractC15442 != null) {
                            abstractC15442.mo23552();
                        }
                        throw th;
                    }
                    m43522(str3);
                    if (abstractC15441 != null) {
                        abstractC15441.mo23552();
                        return null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    abstractC15442 = abstractC15441;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } else {
            if (!(objM4553 instanceof Integer)) {
                return (C4021) objM4553;
            }
            Number number = (Number) objM4553;
            if (number.intValue() <= 3) {
                c1315.m4554(str3, Integer.valueOf(number.intValue() + 1));
                packageManagerM14320 = C4925.m14320();
                if (abstractC15440.m36488()) {
                    strMo23554 = abstractC15440.mo23544();
                    abstractC15441 = null;
                } else {
                    abstractC15440M43520 = m43520(abstractC15440);
                    if (abstractC15440M43520 == null) {
                        m43522(str3);
                        return null;
                    }
                    abstractC15441 = abstractC15440M43520;
                    strMo23554 = abstractC15440M43520.mo23554();
                }
                packageArchiveInfo = packageManagerM14320.getPackageArchiveInfo(strMo23554, 0);
                if (packageArchiveInfo == null) {
                    if (packageArchiveInfo == null) {
                        ApplicationInfo applicationInfo3 = packageArchiveInfo.applicationInfo;
                        C11233.m27799(applicationInfo3);
                        applicationInfo3.publicSourceDir = strMo23554;
                        applicationInfo3.sourceDir = strMo23554;
                        str = applicationInfo3.packageName;
                        str2 = packageArchiveInfo.versionName;
                        if (str2 == null) {
                            str2 = "null";
                        }
                        String str6 = str2;
                        if (Build.VERSION.SDK_INT >= 28) {
                            longVersionCode = packageArchiveInfo.getLongVersionCode();
                        } else {
                            longVersionCode = packageArchiveInfo.versionCode;
                        }
                        long j3 = longVersionCode;
                        long jMo23129 = abstractC15440.mo23127();
                        int i3 = applicationInfo3.targetSdkVersion;
                        int iM435111 = m43519(applicationInfo3);
                        String strM43525 = m43523(applicationInfo3);
                        c3048.m9339(str);
                        C3816.m11502(applicationInfo3.icon, str);
                        defaultActivityIcon = applicationInfo3.loadIcon(packageManagerM14320);
                        C11233.m27799(defaultActivityIcon);
                        c3048.m9340(str);
                        if (defaultActivityIcon instanceof BitmapDrawable) {
                            width = bitmap.getWidth();
                            int height3 = bitmap.getHeight();
                            if (width <= 0) {
                            }
                            C11233.m27799((Object) str);
                            C4021 c4025 = new C4021(str, strM43525, str6, j3, jMo23129, i3, iM435111, defaultActivityIcon, bitmapDrawable, applicationInfo3.icon);
                            c1315.m4554(str3, c4025);
                            if (abstractC15441 != null) {
                                abstractC15441.mo23552();
                            }
                            return c4025;
                        }
                        bitmapDrawable = defaultActivityIcon;
                        C11233.m27799((Object) str);
                        C4021 c4026 = new C4021(str, strM43525, str6, j3, jMo23129, i3, iM435111, defaultActivityIcon, bitmapDrawable, applicationInfo3.icon);
                        c1315.m4554(str3, c4026);
                        if (abstractC15441 != null) {
                            abstractC15441.mo23552();
                        }
                        return c4026;
                    }
                    m43522(str3);
                    if (abstractC15441 != null) {
                        abstractC15441.mo23552();
                    }
                    if (abstractC15442 != null) {
                        abstractC15442.mo23552();
                    }
                    throw th;
                }
                if (packageArchiveInfo == null) {
                    ApplicationInfo applicationInfo4 = packageArchiveInfo.applicationInfo;
                    C11233.m27799(applicationInfo4);
                    applicationInfo4.publicSourceDir = strMo23554;
                    applicationInfo4.sourceDir = strMo23554;
                    str = applicationInfo4.packageName;
                    str2 = packageArchiveInfo.versionName;
                    if (str2 == null) {
                        str2 = "null";
                    }
                    String str7 = str2;
                    if (Build.VERSION.SDK_INT >= 28) {
                        longVersionCode = packageArchiveInfo.getLongVersionCode();
                    } else {
                        longVersionCode = packageArchiveInfo.versionCode;
                    }
                    long j4 = longVersionCode;
                    long jMo231210 = abstractC15440.mo23127();
                    int i4 = applicationInfo4.targetSdkVersion;
                    int iM435112 = m43519(applicationInfo4);
                    String strM43526 = m43523(applicationInfo4);
                    c3048.m9339(str);
                    C3816.m11502(applicationInfo4.icon, str);
                    defaultActivityIcon = applicationInfo4.loadIcon(packageManagerM14320);
                    C11233.m27799(defaultActivityIcon);
                    c3048.m9340(str);
                    if (defaultActivityIcon instanceof BitmapDrawable) {
                        width = bitmap.getWidth();
                        int height4 = bitmap.getHeight();
                        if (width <= 0) {
                        }
                        C11233.m27799((Object) str);
                        C4021 c4027 = new C4021(str, strM43526, str7, j4, jMo231210, i4, iM435112, defaultActivityIcon, bitmapDrawable, applicationInfo4.icon);
                        c1315.m4554(str3, c4027);
                        if (abstractC15441 != null) {
                            abstractC15441.mo23552();
                        }
                        return c4027;
                    }
                    bitmapDrawable = defaultActivityIcon;
                    C11233.m27799((Object) str);
                    C4021 c4028 = new C4021(str, strM43526, str7, j4, jMo231210, i4, iM435112, defaultActivityIcon, bitmapDrawable, applicationInfo4.icon);
                    c1315.m4554(str3, c4028);
                    if (abstractC15441 != null) {
                        abstractC15441.mo23552();
                    }
                    return c4028;
                }
                m43522(str3);
                if (abstractC15441 != null) {
                    abstractC15441.mo23552();
                }
                if (abstractC15442 != null) {
                    abstractC15442.mo23552();
                }
                throw th;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final void m43524(AbstractC15440 abstractC15440) {
        C11233.m27805(abstractC15440, "file");
        String str = abstractC15440.mo23554() + ":" + abstractC15440.mo23117() + ":" + abstractC15440.mo23127();
        f59422.m4558(str);
        C8177.m21653(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m43521() {
        C1315 c1315 = f59422;
        Set setEntrySet = c1315.m4555().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            if (((Map.Entry) obj).getValue() instanceof Integer) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c1315.m4558(((Map.Entry) it.next()).getKey());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43522(String str) {
        int iValueOf;
        C1315 c1315 = f59422;
        Object objM4553 = c1315.m4553(str);
        if (objM4553 instanceof Integer) {
            iValueOf = Integer.valueOf(((Number) objM4553).intValue() + 1);
        } else {
            iValueOf = 1;
        }
        c1315.m4554(str, iValueOf);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m43523(ApplicationInfo applicationInfo) {
        String string;
        CharSequence charSequence = applicationInfo.nonLocalizedLabel;
        if (charSequence != null) {
            return charSequence.toString();
        }
        if (applicationInfo.labelRes != 0) {
            try {
                C18090 c18090 = new C18090(applicationInfo.sourceDir, new C16014(0));
                try {
                    C12534 c12534 = new C12534(0, new C23326(c18090.m42193(c18090.m42211("resources.arsc"), (C19277) null)));
                    int i = applicationInfo.labelRes;
                    if (((i >>> 24) & 255) == 1) {
                        string = C4925.m14338().getString(i);
                    } else {
                        TypedValue typedValue = new TypedValue();
                        c12534.m30770(i, typedValue, true);
                        string = typedValue.coerceToString().toString();
                    }
                    if (string != null) {
                        c18090.close();
                        return string;
                    }
                    C8058 c8058 = C8058.f24861;
                    c18090.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        C7746.m20774(c18090, th);
                        throw th2;
                    }
                }
            } catch (Exception unused) {
            }
        }
        String str = applicationInfo.name;
        if (str != null) {
            return str;
        }
        String str2 = applicationInfo.packageName;
        C11233.m27803(str2, "packageName");
        return str2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int m43519(ApplicationInfo applicationInfo) {
        if (Build.VERSION.SDK_INT >= 24) {
            return applicationInfo.minSdkVersion;
        }
        try {
            C18090 c18090 = new C18090(applicationInfo.sourceDir);
            try {
                int iM49977 = C22263.m49977(C15206.m35978(c18090.m42193(c18090.m42211("AndroidManifest.xml"), (C19277) null)));
                c18090.close();
                return iM49977;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C7746.m20774(c18090, th);
                    throw th2;
                }
            }
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m43520(final AbstractC15440 abstractC15440) throws Throwable {
        long j;
        try {
            C23411 c23411M36513 = abstractC15440.m36513("r");
            try {
                long length = c23411M36513.length();
                j = length - 22;
                long jMax = Math.max(0L, length - 65557);
                while (true) {
                    if (j < jMax) {
                        j = -1;
                        break;
                    }
                    c23411M36513.seek(j);
                    if (c23411M36513.readInt() == 101010256) {
                        break;
                    }
                    j--;
                }
                c23411M36513.close();
            } catch (Throwable th) {
                try {
                    c23411M36513.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            j = -1;
        }
        if (j == -1) {
            return null;
        }
        try {
            return (AbstractC15440) C1802.f6209.submit(new Callable() { // from class: l.ۖܶۡ
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    AbstractC15440 abstractC15440M36535 = C16293.f50110.m36535(".apk");
                    AbstractC15440 abstractC15441 = abstractC15440;
                    try {
                        if (abstractC15441.mo23127() > 1048576) {
                            C18090 c18090 = new C18090(abstractC15441);
                            try {
                                C8918 c8918 = new C8918(abstractC15440M36535);
                                try {
                                    c8918.m23025();
                                    C3545 c3545M42211 = c18090.m42211("resources.arsc");
                                    c18090.m42211("AndroidManifest.xml");
                                    HashSet hashSet = new HashSet();
                                    Iterator it = new C23326(c18090.m42193(c3545M42211, (C19277) null)).mo21936().iterator();
                                    while (it.hasNext()) {
                                        for (C23535 c23535 : ((C17891) it.next()).mo12850()) {
                                            String typeName = c23535.getTypeName();
                                            if (typeName != null) {
                                                switch (typeName.hashCode()) {
                                                    case -891985903:
                                                        if (typeName.equals("string")) {
                                                        }
                                                        break;
                                                    case -475309713:
                                                        if (typeName.equals("plurals")) {
                                                        }
                                                        break;
                                                    case 3355:
                                                        if (typeName.equals("id")) {
                                                        }
                                                        break;
                                                    case 3004913:
                                                        if (typeName.equals("attr")) {
                                                        }
                                                        break;
                                                    case 3029738:
                                                        if (typeName.equals("bool")) {
                                                        }
                                                        break;
                                                    case 109780401:
                                                        if (typeName.equals("style")) {
                                                        }
                                                        break;
                                                    case 1958052158:
                                                        if (typeName.equals("integer")) {
                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            Iterator it2 = c23535.mo2872().iterator();
                                            while (it2.hasNext()) {
                                                Iterator it3 = ((C6393) it2.next()).mo18746().iterator();
                                                while (it3.hasNext()) {
                                                    for (C6602 c6602 : ((C12038) it3.next()).values()) {
                                                        if (c6602.mo5009()) {
                                                            try {
                                                                String value = c6602.mo5008().getValue();
                                                                C11233.m27803(value, "getValue(...)");
                                                                hashSet.add(value);
                                                            } catch (Exception unused2) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    hashSet.add("AndroidManifest.xml");
                                    hashSet.add("resources.arsc");
                                    Collection collectionM42210 = c18090.m42210();
                                    C11233.m27803(collectionM42210, "getEntries(...)");
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj : collectionM42210) {
                                        if (hashSet.contains(((C3545) obj).getName())) {
                                            arrayList.add(obj);
                                        }
                                    }
                                    Iterator it4 = arrayList.iterator();
                                    while (it4.hasNext()) {
                                        c8918.m23014((C3545) it4.next(), c18090);
                                    }
                                    C8058 c8058 = C8058.f24861;
                                    c8918.close();
                                    c18090.close();
                                    return abstractC15440M36535;
                                } catch (Throwable th3) {
                                    try {
                                        throw th3;
                                    } catch (Throwable th4) {
                                        C7746.m20774(c8918, th3);
                                        throw th4;
                                    }
                                }
                            } catch (Throwable th5) {
                                try {
                                    throw th5;
                                } catch (Throwable th6) {
                                    C7746.m20774(c18090, th5);
                                    throw th6;
                                }
                            }
                        }
                        abstractC15441.m36500(abstractC15440M36535, (C17558) null, (InterfaceC5627) null);
                        return abstractC15440M36535;
                    } catch (Throwable unused3) {
                        return null;
                    }
                }
            }).get();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            C11233.m27799(cause);
            throw cause;
        }
    }
}
