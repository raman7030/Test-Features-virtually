package l;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import com.google.android.material.badge.BadgeState;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۜ᩵ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77BV */
/* JADX INFO: loaded from: classes2.dex */
public final class C6970 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f21484 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C20844 f21485 = C20844.f67485;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static List f21486;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static long f21487;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14730 m18838(InterfaceC17889 interfaceC17889) {
        String str;
        int iMo9351 = f21485.mo9351(interfaceC17889);
        switch (iMo9351) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                str = "full";
                break;
            case 7:
            case 8:
            case 10:
            case 11:
                str = BadgeState.BADGE_RESOURCE_TAG;
                break;
            case 9:
            default:
                str = null;
                break;
        }
        if (str == null || !m18842(interfaceC17889, iMo9351)) {
            return null;
        }
        return new C14730(str, m18836(interfaceC17889, iMo9351));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C23903 m18841(String str) {
        String str2;
        ApplicationInfo applicationInfo;
        Bitmap bitmapM40790;
        C9555 c9555M18837 = m18837(str);
        if (c9555M18837 != null) {
            C20844 c20844 = f21485;
            int iMo9351 = c20844.mo9351(c9555M18837);
            switch (iMo9351) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    str2 = "full";
                    break;
                case 7:
                case 8:
                case 10:
                case 11:
                    str2 = BadgeState.BADGE_RESOURCE_TAG;
                    break;
                case 9:
                default:
                    str2 = null;
                    break;
            }
            if (str2 != null && m18842(c9555M18837, iMo9351)) {
                boolean zM18839 = false;
                if ("full".equals(str2)) {
                    C11813 c11813Mo9350 = c20844.mo9350((AbstractC16891) null, c9555M18837, iMo9351);
                    String strM18836 = m18836(c9555M18837, iMo9351);
                    if (iMo9351 == 1 || iMo9351 == 2) {
                        zM18839 = m18839(c11813Mo9350, C19883.f64215.f64250);
                    } else if (iMo9351 == 4) {
                        zM18839 = m18839(c11813Mo9350, C19883.f64188.f64250);
                    } else if (iMo9351 == 5) {
                        zM18839 = m18839(c11813Mo9350, C19883.f64205.f64250);
                    }
                    if (zM18839) {
                        return new C23903("damaged", null, strM18836);
                    }
                    if (!m18839(c11813Mo9350, c9555M18837.mo36973().m7317().f64250)) {
                        return new C23903("png", m18840(c11813Mo9350.m28877()), strM18836);
                    }
                } else {
                    String strM18837 = m18836(c9555M18837, iMo9351);
                    if (iMo9351 != 7) {
                        if (iMo9351 != 8) {
                            if (iMo9351 != 10) {
                                if (iMo9351 == 11 && strM18837 != null && (bitmapM40790 = C17447.m40790(c9555M18837.mo24433())) != null) {
                                    return new C23903("png", m18840(m18834(new BitmapDrawable(C4925.m14338(), bitmapM40790))), strM18837);
                                }
                            } else if (strM18837 != null) {
                                return m18843(strM18837);
                            }
                        } else if (strM18837 != null) {
                            String path = c9555M18837.getPath();
                            File file = new File(path, "base.apk");
                            if (!file.exists()) {
                                File[] fileArrListFiles = new File(path).listFiles();
                                if (fileArrListFiles != null) {
                                    File fileM18835 = m18835(fileArrListFiles);
                                    if (fileM18835 == null) {
                                        for (File file2 : fileArrListFiles) {
                                            File file3 = new File(file2, "base.apk");
                                            if (file2.isDirectory() && file3.exists()) {
                                                fileM18835 = file3;
                                            }
                                        }
                                    }
                                    if (fileM18835 == null) {
                                        for (File file4 : fileArrListFiles) {
                                            if (!file4.isDirectory() || (fileM18835 = m18835(file4.listFiles())) == null) {
                                            }
                                        }
                                    }
                                    file = fileM18835;
                                } else if (Build.VERSION.SDK_INT >= 34) {
                                    long jUptimeMillis = SystemClock.uptimeMillis();
                                    if (f21486 == null || jUptimeMillis - f21487 > 10000) {
                                        try {
                                            f21486 = (List) C5378.stream(C4925.m14320().getInstalledPackages(0)).map(new C16599(2)).filter(new C17553(0)).collect(C22976.toList());
                                        } catch (RuntimeException unused) {
                                            f21486 = Collections.EMPTY_LIST;
                                        }
                                        f21487 = jUptimeMillis;
                                    }
                                    Iterator it = f21486.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            String str3 = (String) it.next();
                                            if (str3.startsWith(path)) {
                                                File file5 = new File(str3);
                                                if (file5.exists()) {
                                                    file = file5;
                                                }
                                            }
                                        } else {
                                            file = null;
                                        }
                                    }
                                } else {
                                    file = null;
                                }
                            }
                            if (file == null) {
                                return null;
                            }
                            try {
                                PackageManager packageManagerM14320 = C4925.m14320();
                                PackageInfo packageArchiveInfo = packageManagerM14320.getPackageArchiveInfo(file.getPath(), 1);
                                if (packageArchiveInfo != null && (applicationInfo = packageArchiveInfo.applicationInfo) != null) {
                                    applicationInfo.publicSourceDir = file.getPath();
                                    applicationInfo.sourceDir = file.getPath();
                                    C3816.m11502(applicationInfo.icon, applicationInfo.packageName);
                                    return new C23903("png", m18840(m18834(applicationInfo.loadIcon(packageManagerM14320))), strM18837);
                                }
                                return null;
                            } catch (Throwable unused2) {
                                return null;
                            }
                        }
                    } else if (strM18837 != null) {
                        return m18843(strM18837);
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9555 m18837(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C2499 c2499 = C2499.f7958;
        InterfaceC17889 interfaceC17889Mo7638 = c2499.mo7638(str);
        if (interfaceC17889Mo7638 != null || str.endsWith("/")) {
            return (C9555) interfaceC17889Mo7638;
        }
        return (C9555) c2499.mo7638(str.concat("/"));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b A[RETURN] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m18842(InterfaceC17889 interfaceC17889, int i) {
        SharedPreferences sharedPreferences;
        if (i == 0) {
            return false;
        }
        AbstractC15440 abstractC15440Mo24433 = interfaceC17889.mo24433();
        switch (i) {
            case 1:
                if (interfaceC17889.getSize() > 268435456) {
                    return false;
                }
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 11:
                break;
            case 7:
            case 8:
            case 10:
                return true;
            case 9:
            default:
                return false;
        }
        abstractC15440Mo24433.getClass();
        if (!(abstractC15440Mo24433 instanceof C6849) || (sharedPreferences = ApplicationC20075.f65010) == null || sharedPreferences.getBoolean("external_storage_thumb_enable", true)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m18839(C11813 c11813, C11813 c11814) {
        if (c11813 == c11814) {
            return true;
        }
        return (c11813 == null || c11814 == null || c11813.m28877() != c11814.m28877()) ? false : true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m18836(InterfaceC17889 interfaceC17889, int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 11:
                C20844 c20844 = C20844.f67485;
                String path = interfaceC17889.getPath();
                long size = interfaceC17889.getSize();
                long time = interfaceC17889.getTime();
                int i2 = C13110.f39245;
                return C14460.m34530(path + size + time).toLowerCase();
            case 7:
                return interfaceC17889.getName();
            case 8:
                return interfaceC17889.getPath();
            case 10:
                if (interfaceC17889 instanceof C9555) {
                    try {
                        C4027 c4027M24434 = ((C9555) interfaceC17889).m24434();
                        Uri uri = c4027M24434 == null ? null : c4027M24434.f12779;
                        if (uri != null) {
                            int i3 = C18844.f59431;
                            if (uri.getAuthority().endsWith(".MTDataFilesProvider")) {
                                return C18844.m43539(uri);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                    break;
                }
            case 9:
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C23903 m18843(String str) {
        try {
            PackageInfo packageInfo = C4925.m14320().getPackageInfo(str, 1);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                C3816.m11502(applicationInfo.icon, str);
            }
            return new C23903("png", m18840(m18834(RunnableC5974.m16749(packageInfo))), str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static File m18835(File[] fileArr) {
        if (fileArr == null) {
            return null;
        }
        for (File file : fileArr) {
            if (file.isFile() && file.getName().toLowerCase().endsWith(".apk")) {
                return file;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m18840(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m18834(Drawable drawable) {
        int iM27878 = C11266.m27878(32.0f);
        int iM27879 = C11266.m27878(15.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM27878, iM27878, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect rectCopyBounds = drawable.copyBounds();
        drawable.setBounds(iM27879, iM27879, iM27878, iM27878);
        drawable.draw(canvas);
        drawable.setBounds(rectCopyBounds);
        return bitmapCreateBitmap;
    }
}
