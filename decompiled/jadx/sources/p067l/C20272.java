package p067l;

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
public final class C20272 {

    /* JADX INFO: renamed from: ֫ */
    public static final C0907 f62650 = new C0907(50);

    /* JADX INFO: renamed from: ۧ */
    public static final C5265 f62651 = new C5265();

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
    /* JADX INFO: renamed from: ܽ */
    public static final C6190 m45791(AbstractC17043 abstractC17043) {
        PackageManager packageManagerM16217;
        AbstractC17043 abstractC17043M45786;
        AbstractC17043 abstractC17044;
        String strMo25505;
        PackageInfo packageArchiveInfo;
        String str;
        String str2;
        long longVersionCode;
        Drawable defaultActivityIcon;
        Bitmap bitmap;
        int width;
        int iMax;
        Drawable bitmapDrawable;
        C5265 c5265 = f62651;
        C13045.m29867(abstractC17043, "file");
        String str3 = abstractC17043.mo25505() + ":" + abstractC17043.mo25091() + ":" + abstractC17043.mo25101();
        C0907 c0907 = f62650;
        Object objM6785 = c0907.m6785(str3);
        AbstractC17043 abstractC17045 = null;
        if (objM6785 == null) {
            try {
                packageManagerM16217 = C7050.m16217();
                if (abstractC17043.m38646()) {
                    strMo25505 = abstractC17043.mo25495();
                    abstractC17044 = null;
                } else {
                    abstractC17043M45786 = m45786(abstractC17043);
                    if (abstractC17043M45786 == null) {
                        m45788(str3);
                        return null;
                    }
                    try {
                        abstractC17044 = abstractC17043M45786;
                        strMo25505 = abstractC17043M45786.mo25505();
                    } catch (Throwable th) {
                        th = th;
                        abstractC17045 = abstractC17043M45786;
                    }
                }
                try {
                    packageArchiveInfo = packageManagerM16217.getPackageArchiveInfo(strMo25505, 0);
                    if (packageArchiveInfo == null || !C13045.m29864((Object) strMo25505, (Object) abstractC17043.mo25495()) || (!(abstractC17043 instanceof C16433) && ((!(abstractC17043 instanceof C17182) || !C5235.m11295((CharSequence) strMo25505, (CharSequence) "download", true)) && (!(abstractC17043 instanceof C13102) || ((C13102) abstractC17043).m29977() || !C5235.m11301(strMo25505, "/data/"))))) {
                        if (packageArchiveInfo == null) {
                            ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
                            C13045.m29861(applicationInfo);
                            applicationInfo.publicSourceDir = strMo25505;
                            applicationInfo.sourceDir = strMo25505;
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
                            long jMo25101 = abstractC17043.mo25101();
                            int i = applicationInfo.targetSdkVersion;
                            int iM45785 = m45785(applicationInfo);
                            String strM45789 = m45789(applicationInfo);
                            c5265.m11381(str);
                            try {
                                C5995.m13438(applicationInfo.icon, str);
                                try {
                                    defaultActivityIcon = applicationInfo.loadIcon(packageManagerM16217);
                                    C13045.m29861(defaultActivityIcon);
                                } catch (Throwable unused) {
                                    defaultActivityIcon = C7050.m16217().getDefaultActivityIcon();
                                    C13045.m29861(defaultActivityIcon);
                                }
                                c5265.m11382(str);
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
                                        bitmapDrawable = new BitmapDrawable(C7050.m16235(), Bitmap.createScaledBitmap(bitmap, iRound, iRound2, true));
                                    }
                                    C13045.m29861((Object) str);
                                    C6190 c6190 = new C6190(str, strM45789, str4, j, jMo25101, i, iM45785, defaultActivityIcon, bitmapDrawable, applicationInfo.icon);
                                    c0907.m6786(str3, c6190);
                                    if (abstractC17044 != null) {
                                        abstractC17044.mo25503();
                                    }
                                    return c6190;
                                }
                                bitmapDrawable = defaultActivityIcon;
                                C13045.m29861((Object) str);
                                C6190 c6191 = new C6190(str, strM45789, str4, j, jMo25101, i, iM45785, defaultActivityIcon, bitmapDrawable, applicationInfo.icon);
                                c0907.m6786(str3, c6191);
                                if (abstractC17044 != null) {
                                    abstractC17044.mo25503();
                                }
                                return c6191;
                            } catch (Throwable th2) {
                                c5265.m11382(str);
                                throw th2;
                            }
                        }
                        m45788(str3);
                        if (abstractC17044 != null) {
                            abstractC17044.mo25503();
                        }
                        if (abstractC17045 != null) {
                            abstractC17045.mo25503();
                        }
                        throw th;
                    }
                    AbstractC17043 abstractC17043M45787 = m45786(abstractC17043);
                    if (abstractC17043M45787 != null) {
                        try {
                            strMo25505 = abstractC17043M45787.mo25505();
                            packageArchiveInfo = packageManagerM16217.getPackageArchiveInfo(strMo25505, 0);
                            abstractC17044 = abstractC17043M45787;
                            if (packageArchiveInfo == null) {
                                ApplicationInfo applicationInfo2 = packageArchiveInfo.applicationInfo;
                                C13045.m29861(applicationInfo2);
                                applicationInfo2.publicSourceDir = strMo25505;
                                applicationInfo2.sourceDir = strMo25505;
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
                                long jMo25102 = abstractC17043.mo25101();
                                int i2 = applicationInfo2.targetSdkVersion;
                                int iM45786 = m45785(applicationInfo2);
                                String strM457810 = m45789(applicationInfo2);
                                c5265.m11381(str);
                                C5995.m13438(applicationInfo2.icon, str);
                                defaultActivityIcon = applicationInfo2.loadIcon(packageManagerM16217);
                                C13045.m29861(defaultActivityIcon);
                                c5265.m11382(str);
                                if (defaultActivityIcon instanceof BitmapDrawable) {
                                    width = bitmap.getWidth();
                                    int height2 = bitmap.getHeight();
                                    if (width <= 0) {
                                    }
                                    C13045.m29861((Object) str);
                                    C6190 c6192 = new C6190(str, strM457810, str5, j2, jMo25102, i2, iM45786, defaultActivityIcon, bitmapDrawable, applicationInfo2.icon);
                                    c0907.m6786(str3, c6192);
                                    if (abstractC17044 != null) {
                                        abstractC17044.mo25503();
                                    }
                                    return c6192;
                                }
                                bitmapDrawable = defaultActivityIcon;
                                C13045.m29861((Object) str);
                                C6190 c6193 = new C6190(str, strM457810, str5, j2, jMo25102, i2, iM45786, defaultActivityIcon, bitmapDrawable, applicationInfo2.icon);
                                c0907.m6786(str3, c6193);
                                if (abstractC17044 != null) {
                                    abstractC17044.mo25503();
                                }
                                return c6193;
                            }
                            m45788(str3);
                            if (abstractC17044 != null) {
                                abstractC17044.mo25503();
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            abstractC17045 = abstractC17043M45787;
                        }
                        if (abstractC17045 != null) {
                            abstractC17045.mo25503();
                        }
                        throw th;
                    }
                    m45788(str3);
                    if (abstractC17044 != null) {
                        abstractC17044.mo25503();
                        return null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    abstractC17045 = abstractC17044;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } else {
            if (!(objM6785 instanceof Integer)) {
                return (C6190) objM6785;
            }
            Number number = (Number) objM6785;
            if (number.intValue() <= 3) {
                c0907.m6786(str3, Integer.valueOf(number.intValue() + 1));
                packageManagerM16217 = C7050.m16217();
                if (abstractC17043.m38646()) {
                    strMo25505 = abstractC17043.mo25495();
                    abstractC17044 = null;
                } else {
                    abstractC17043M45786 = m45786(abstractC17043);
                    if (abstractC17043M45786 == null) {
                        m45788(str3);
                        return null;
                    }
                    abstractC17044 = abstractC17043M45786;
                    strMo25505 = abstractC17043M45786.mo25505();
                }
                packageArchiveInfo = packageManagerM16217.getPackageArchiveInfo(strMo25505, 0);
                if (packageArchiveInfo == null) {
                    if (packageArchiveInfo == null) {
                        ApplicationInfo applicationInfo3 = packageArchiveInfo.applicationInfo;
                        C13045.m29861(applicationInfo3);
                        applicationInfo3.publicSourceDir = strMo25505;
                        applicationInfo3.sourceDir = strMo25505;
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
                        long jMo25103 = abstractC17043.mo25101();
                        int i3 = applicationInfo3.targetSdkVersion;
                        int iM45787 = m45785(applicationInfo3);
                        String strM457811 = m45789(applicationInfo3);
                        c5265.m11381(str);
                        C5995.m13438(applicationInfo3.icon, str);
                        defaultActivityIcon = applicationInfo3.loadIcon(packageManagerM16217);
                        C13045.m29861(defaultActivityIcon);
                        c5265.m11382(str);
                        if (defaultActivityIcon instanceof BitmapDrawable) {
                            width = bitmap.getWidth();
                            int height3 = bitmap.getHeight();
                            if (width <= 0) {
                            }
                            C13045.m29861((Object) str);
                            C6190 c6194 = new C6190(str, strM457811, str6, j3, jMo25103, i3, iM45787, defaultActivityIcon, bitmapDrawable, applicationInfo3.icon);
                            c0907.m6786(str3, c6194);
                            if (abstractC17044 != null) {
                                abstractC17044.mo25503();
                            }
                            return c6194;
                        }
                        bitmapDrawable = defaultActivityIcon;
                        C13045.m29861((Object) str);
                        C6190 c6195 = new C6190(str, strM457811, str6, j3, jMo25103, i3, iM45787, defaultActivityIcon, bitmapDrawable, applicationInfo3.icon);
                        c0907.m6786(str3, c6195);
                        if (abstractC17044 != null) {
                            abstractC17044.mo25503();
                        }
                        return c6195;
                    }
                    m45788(str3);
                    if (abstractC17044 != null) {
                        abstractC17044.mo25503();
                    }
                    if (abstractC17045 != null) {
                        abstractC17045.mo25503();
                    }
                    throw th;
                }
                if (packageArchiveInfo == null) {
                    ApplicationInfo applicationInfo4 = packageArchiveInfo.applicationInfo;
                    C13045.m29861(applicationInfo4);
                    applicationInfo4.publicSourceDir = strMo25505;
                    applicationInfo4.sourceDir = strMo25505;
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
                    long jMo25104 = abstractC17043.mo25101();
                    int i4 = applicationInfo4.targetSdkVersion;
                    int iM45788 = m45785(applicationInfo4);
                    String strM457812 = m45789(applicationInfo4);
                    c5265.m11381(str);
                    C5995.m13438(applicationInfo4.icon, str);
                    defaultActivityIcon = applicationInfo4.loadIcon(packageManagerM16217);
                    C13045.m29861(defaultActivityIcon);
                    c5265.m11382(str);
                    if (defaultActivityIcon instanceof BitmapDrawable) {
                        width = bitmap.getWidth();
                        int height4 = bitmap.getHeight();
                        if (width <= 0) {
                        }
                        C13045.m29861((Object) str);
                        C6190 c6196 = new C6190(str, strM457812, str7, j4, jMo25104, i4, iM45788, defaultActivityIcon, bitmapDrawable, applicationInfo4.icon);
                        c0907.m6786(str3, c6196);
                        if (abstractC17044 != null) {
                            abstractC17044.mo25503();
                        }
                        return c6196;
                    }
                    bitmapDrawable = defaultActivityIcon;
                    C13045.m29861((Object) str);
                    C6190 c6197 = new C6190(str, strM457812, str7, j4, jMo25104, i4, iM45788, defaultActivityIcon, bitmapDrawable, applicationInfo4.icon);
                    c0907.m6786(str3, c6197);
                    if (abstractC17044 != null) {
                        abstractC17044.mo25503();
                    }
                    return c6197;
                }
                m45788(str3);
                if (abstractC17044 != null) {
                    abstractC17044.mo25503();
                }
                if (abstractC17045 != null) {
                    abstractC17045.mo25503();
                }
                throw th;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static final void m45790(AbstractC17043 abstractC17043) {
        C13045.m29867(abstractC17043, "file");
        String str = abstractC17043.mo25505() + ":" + abstractC17043.mo25091() + ":" + abstractC17043.mo25101();
        f62650.m6790(str);
        C10140.m23622(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m45787() {
        C0907 c0907 = f62650;
        Set setEntrySet = c0907.m6787().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            if (((Map.Entry) obj).getValue() instanceof Integer) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c0907.m6790(((Map.Entry) it.next()).getKey());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45788(String str) {
        int iValueOf;
        C0907 c0907 = f62650;
        Object objM6785 = c0907.m6785(str);
        if (objM6785 instanceof Integer) {
            iValueOf = Integer.valueOf(((Number) objM6785).intValue() + 1);
        } else {
            iValueOf = 1;
        }
        c0907.m6786(str, iValueOf);
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m45789(ApplicationInfo applicationInfo) {
        String string;
        CharSequence charSequence = applicationInfo.nonLocalizedLabel;
        if (charSequence != null) {
            return charSequence.toString();
        }
        if (applicationInfo.labelRes != 0) {
            try {
                C19561 c19561 = new C19561(applicationInfo.sourceDir, new C17588(0));
                try {
                    C14281 c14281 = new C14281(0, new C24538(c19561.m44452(c19561.m44470("resources.arsc"), (C20689) null)));
                    int i = applicationInfo.labelRes;
                    if (((i >>> 24) & 255) == 1) {
                        string = C7050.m16235().getString(i);
                    } else {
                        TypedValue typedValue = new TypedValue();
                        c14281.m32842(i, typedValue, true);
                        string = typedValue.coerceToString().toString();
                    }
                    if (string != null) {
                        c19561.close();
                        return string;
                    }
                    C10027 c10027 = C10027.f27775;
                    c19561.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        C9731.m22755(c19561, th);
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
        C13045.m29865(str2, "packageName");
        return str2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static final int m45785(ApplicationInfo applicationInfo) {
        if (Build.VERSION.SDK_INT >= 24) {
            return applicationInfo.minSdkVersion;
        }
        try {
            C19561 c19561 = new C19561(applicationInfo.sourceDir);
            try {
                int iM52305 = C23527.m52305(C16820.m38138(c19561.m44452(c19561.m44470("AndroidManifest.xml"), (C20689) null)));
                c19561.close();
                return iM52305;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C9731.m22755(c19561, th);
                    throw th2;
                }
            }
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17043 m45786(final AbstractC17043 abstractC17043) throws Throwable {
        long j;
        try {
            C24618 c24618M38671 = abstractC17043.m38671("r");
            try {
                long length = c24618M38671.length();
                j = length - 22;
                long jMax = Math.max(0L, length - 65557);
                while (true) {
                    if (j < jMax) {
                        j = -1;
                        break;
                    }
                    c24618M38671.seek(j);
                    if (c24618M38671.readInt() == 101010256) {
                        break;
                    }
                    j--;
                }
                c24618M38671.close();
            } catch (Throwable th) {
                try {
                    c24618M38671.close();
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
            return (AbstractC17043) C4081.f8988.submit(new Callable() { // from class: l.ۖܶۡ
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    AbstractC17043 abstractC17043M38693 = C17853.f53277.m38693(".apk");
                    AbstractC17043 abstractC17044 = abstractC17043;
                    try {
                        if (abstractC17044.mo25101() > 1048576) {
                            C19561 c19561 = new C19561(abstractC17044);
                            try {
                                C10844 c10844 = new C10844(abstractC17043M38693);
                                try {
                                    c10844.m24999();
                                    C5738 c5738M44470 = c19561.m44470("resources.arsc");
                                    c19561.m44470("AndroidManifest.xml");
                                    HashSet hashSet = new HashSet();
                                    Iterator it = new C24538(c19561.m44452(c5738M44470, (C20689) null)).mo23906().iterator();
                                    while (it.hasNext()) {
                                        for (C24736 c24736 : ((C19372) it.next()).mo14714()) {
                                            String typeName = c24736.getTypeName();
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
                                            Iterator it2 = c24736.mo5201().iterator();
                                            while (it2.hasNext()) {
                                                Iterator it3 = ((C8445) it2.next()).mo20696().iterator();
                                                while (it3.hasNext()) {
                                                    for (C8643 c8643 : ((C13810) it3.next()).values()) {
                                                        if (c8643.mo7252()) {
                                                            try {
                                                                String value = c8643.mo7251().getValue();
                                                                C13045.m29865(value, "getValue(...)");
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
                                    Collection collectionM44469 = c19561.m44469();
                                    C13045.m29865(collectionM44469, "getEntries(...)");
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj : collectionM44469) {
                                        if (hashSet.contains(((C5738) obj).getName())) {
                                            arrayList.add(obj);
                                        }
                                    }
                                    Iterator it4 = arrayList.iterator();
                                    while (it4.hasNext()) {
                                        c10844.m24988((C5738) it4.next(), c19561);
                                    }
                                    C10027 c10027 = C10027.f27775;
                                    c10844.close();
                                    c19561.close();
                                    return abstractC17043M38693;
                                } catch (Throwable th3) {
                                    try {
                                        throw th3;
                                    } catch (Throwable th4) {
                                        C9731.m22755(c10844, th3);
                                        throw th4;
                                    }
                                }
                            } catch (Throwable th5) {
                                try {
                                    throw th5;
                                } catch (Throwable th6) {
                                    C9731.m22755(c19561, th5);
                                    throw th6;
                                }
                            }
                        }
                        abstractC17044.m38658(abstractC17043M38693, (C19056) null, (InterfaceC7717) null);
                        return abstractC17043M38693;
                    } catch (Throwable unused3) {
                        return null;
                    }
                }
            }).get();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            C13045.m29861(cause);
            throw cause;
        }
    }
}
