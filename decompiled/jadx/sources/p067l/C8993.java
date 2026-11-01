package p067l;

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
public final class C8993 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f24364 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final C22179 f24365 = C22179.f70167;

    /* JADX INFO: renamed from: ܽ */
    public static List f24366;

    /* JADX INFO: renamed from: ᩳ */
    public static long f24367;

    /* JADX INFO: renamed from: ֫ */
    public static C16368 m20792(InterfaceC19370 interfaceC19370) {
        String str;
        int iMo11393 = f24365.mo11393(interfaceC19370);
        switch (iMo11393) {
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
        if (str == null || !m20796(interfaceC19370, iMo11393)) {
            return null;
        }
        return new C16368(str, m20790(interfaceC19370, iMo11393));
    }

    /* JADX INFO: renamed from: ۧ */
    public static C25086 m20795(String str) {
        String str2;
        ApplicationInfo applicationInfo;
        Bitmap bitmapM43048;
        C11450 c11450M20791 = m20791(str);
        if (c11450M20791 != null) {
            C22179 c22179 = f24365;
            int iMo11393 = c22179.mo11393(c11450M20791);
            switch (iMo11393) {
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
            if (str2 != null && m20796(c11450M20791, iMo11393)) {
                boolean zM20793 = false;
                if ("full".equals(str2)) {
                    C13596 c13596Mo11392 = c22179.mo11392((AbstractC18422) null, c11450M20791, iMo11393);
                    String strM20790 = m20790(c11450M20791, iMo11393);
                    if (iMo11393 == 1 || iMo11393 == 2) {
                        zM20793 = m20793(c13596Mo11392, C21265.f66851.f66886);
                    } else if (iMo11393 == 4) {
                        zM20793 = m20793(c13596Mo11392, C21265.f66824.f66886);
                    } else if (iMo11393 == 5) {
                        zM20793 = m20793(c13596Mo11392, C21265.f66841.f66886);
                    }
                    if (zM20793) {
                        return new C25086("damaged", null, strM20790);
                    }
                    if (!m20793(c13596Mo11392, c11450M20791.mo39139().m9396().f66886)) {
                        return new C25086("png", m20794(c13596Mo11392.m30926()), strM20790);
                    }
                } else {
                    String strM20791 = m20790(c11450M20791, iMo11393);
                    if (iMo11393 != 7) {
                        if (iMo11393 != 8) {
                            if (iMo11393 != 10) {
                                if (iMo11393 == 11 && strM20791 != null && (bitmapM43048 = C18950.m43048(c11450M20791.mo26445())) != null) {
                                    return new C25086("png", m20794(m20788(new BitmapDrawable(C7050.m16235(), bitmapM43048))), strM20791);
                                }
                            } else if (strM20791 != null) {
                                return m20797(strM20791);
                            }
                        } else if (strM20791 != null) {
                            String path = c11450M20791.getPath();
                            File file = new File(path, "base.apk");
                            if (!file.exists()) {
                                File[] fileArrListFiles = new File(path).listFiles();
                                if (fileArrListFiles != null) {
                                    File fileM20789 = m20789(fileArrListFiles);
                                    if (fileM20789 == null) {
                                        for (File file2 : fileArrListFiles) {
                                            File file3 = new File(file2, "base.apk");
                                            if (file2.isDirectory() && file3.exists()) {
                                                fileM20789 = file3;
                                            }
                                        }
                                    }
                                    if (fileM20789 == null) {
                                        for (File file4 : fileArrListFiles) {
                                            if (!file4.isDirectory() || (fileM20789 = m20789(file4.listFiles())) == null) {
                                            }
                                        }
                                    }
                                    file = fileM20789;
                                } else if (Build.VERSION.SDK_INT >= 34) {
                                    long jUptimeMillis = SystemClock.uptimeMillis();
                                    if (f24366 == null || jUptimeMillis - f24367 > 10000) {
                                        try {
                                            f24366 = (List) C7480.stream(C7050.m16217().getInstalledPackages(0)).map(new C18144(2)).filter(new C19051(0)).collect(C24205.toList());
                                        } catch (RuntimeException unused) {
                                            f24366 = Collections.EMPTY_LIST;
                                        }
                                        f24367 = jUptimeMillis;
                                    }
                                    Iterator it = f24366.iterator();
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
                                PackageManager packageManagerM16217 = C7050.m16217();
                                PackageInfo packageArchiveInfo = packageManagerM16217.getPackageArchiveInfo(file.getPath(), 1);
                                if (packageArchiveInfo != null && (applicationInfo = packageArchiveInfo.applicationInfo) != null) {
                                    applicationInfo.publicSourceDir = file.getPath();
                                    applicationInfo.sourceDir = file.getPath();
                                    C5995.m13438(applicationInfo.icon, applicationInfo.packageName);
                                    return new C25086("png", m20794(m20788(applicationInfo.loadIcon(packageManagerM16217))), strM20791);
                                }
                                return null;
                            } catch (Throwable unused2) {
                                return null;
                            }
                        }
                    } else if (strM20791 != null) {
                        return m20797(strM20791);
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11450 m20791(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C4744 c4744 = C4744.f10749;
        InterfaceC19370 interfaceC19370Mo9709 = c4744.mo9709(str);
        if (interfaceC19370Mo9709 != null || str.endsWith("/")) {
            return (C11450) interfaceC19370Mo9709;
        }
        return (C11450) c4744.mo9709(str.concat("/"));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b A[RETURN] */
    /* JADX INFO: renamed from: ۧ */
    public static boolean m20796(InterfaceC19370 interfaceC19370, int i) {
        SharedPreferences sharedPreferences;
        if (i == 0) {
            return false;
        }
        AbstractC17043 abstractC17043Mo26445 = interfaceC19370.mo26445();
        switch (i) {
            case 1:
                if (interfaceC19370.getSize() > 268435456) {
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
        abstractC17043Mo26445.getClass();
        if (!(abstractC17043Mo26445 instanceof C8878) || (sharedPreferences = ApplicationC21448.f67650) == null || sharedPreferences.getBoolean("external_storage_thumb_enable", true)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m20793(C13596 c13596, C13596 c13597) {
        if (c13596 == c13597) {
            return true;
        }
        return (c13596 == null || c13597 == null || c13596.m30926() != c13597.m30926()) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m20790(InterfaceC19370 interfaceC19370, int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 11:
                C22179 c22179 = C22179.f70167;
                String path = interfaceC19370.getPath();
                long size = interfaceC19370.getSize();
                long time = interfaceC19370.getTime();
                int i2 = C14828.f42297;
                return C16111.m36664(path + size + time).toLowerCase();
            case 7:
                return interfaceC19370.getName();
            case 8:
                return interfaceC19370.getPath();
            case 10:
                if (interfaceC19370 instanceof C11450) {
                    try {
                        C6196 c6196M26446 = ((C11450) interfaceC19370).m26446();
                        Uri uri = c6196M26446 == null ? null : c6196M26446.f15594;
                        if (uri != null) {
                            int i3 = C20278.f62659;
                            if (uri.getAuthority().endsWith(".MTDataFilesProvider")) {
                                return C20278.m45805(uri);
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

    /* JADX INFO: renamed from: ܽ */
    public static C25086 m20797(String str) {
        try {
            PackageInfo packageInfo = C7050.m16217().getPackageInfo(str, 1);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                C5995.m13438(applicationInfo.icon, str);
            }
            return new C25086("png", m20794(m20788(RunnableC8046.m18675(packageInfo))), str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static File m20789(File[] fileArr) {
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

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m20794(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: ֫ */
    public static Bitmap m20788(Drawable drawable) {
        int iM29939 = C13076.m29939(32.0f);
        int iM299310 = C13076.m29939(15.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM29939, iM29939, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect rectCopyBounds = drawable.copyBounds();
        drawable.setBounds(iM299310, iM299310, iM29939, iM29939);
        drawable.draw(canvas);
        drawable.setBounds(rectCopyBounds);
        return bitmapCreateBitmap;
    }
}
