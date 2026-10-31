package l;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import bin.mt.plus.R;
import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: l.ۛۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5T2 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC5974 implements Runnable {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static long f18327;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static C12324 f18328;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12324 f18329;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static Paint f18330;

    /* JADX INFO: renamed from: ۜᩳ۟, reason: not valid java name and contains not printable characters */
    private static final short[] f18331;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static int f18332;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C12324 f18333;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C1315 f18334;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static C12324 f18335;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static C12324 f18336;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int f18337;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static Paint f18338;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static Paint f18339;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static ColorMatrixColorFilter f18340;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static List f18341;

    @Override // java.lang.Runnable
    public native void run();

    static {
        ApplicationC12518.m30701(68);
        f18331 = new short[]{9005, -28321, -28292, -28292, -28317, -28298, -28319, -28302, -28300, -28319, -28298, -28298, -28290, -28298, -28291, -28313, -28355, -28313, -28309, -28313};
        new RunnableC5974().run();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m16747(AbstractC21294 abstractC21294, int i) {
        return m16746(f18328, abstractC21294, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m16744(int i) {
        return m16746(f18329, C19883.f64184, i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Bitmap m16755(AbstractC21294 abstractC21294, int i) {
        return m16746(f18336, abstractC21294, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m16745(int i, int i2, boolean z) {
        C12324 c12324 = z ? f18335 : f18333;
        Boolean boolValueOf = c12324.f36886;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(C21943.f70270);
        }
        Paint paint = boolValueOf.booleanValue() ? f18330 : f18339;
        paint.setColor(i);
        int i3 = c12324.f36887;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (c12324.f36884) {
            int i4 = c12324.f36887 / 2;
            int i5 = i4 - c12324.f36889;
            float f = i4;
            canvas.drawCircle(f, f, i5, paint);
        } else {
            int i6 = c12324.f36889;
            float f2 = i6;
            float f3 = c12324.f36887 - i6;
            float f4 = c12324.f36888;
            canvas.drawRoundRect(f2, f2, f3, f3, f4, f4, paint);
        }
        Drawable drawableM14305 = C4925.m14305(i2);
        int i7 = c12324.f36887;
        int i8 = c12324.f36890;
        int i9 = (i7 - i8) / 2;
        int i10 = i8 + i9;
        if (C7466.m20002(i) > 220) {
            drawableM14305.setTint(-12895429);
        } else {
            drawableM14305.setTint(-1);
        }
        drawableM14305.setBounds(i9, i9, i10, i10);
        drawableM14305.setAlpha((c12324.f36885 || !C21943.m49431()) ? 255 : 200);
        drawableM14305.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m16746(C12324 c12324, AbstractC21294 abstractC21294, int i) {
        int iMo7429 = abstractC21294.mo7429();
        int iMo7430 = abstractC21294.mo7430();
        Boolean boolValueOf = c12324.f36886;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(C21943.f70270);
        }
        Paint paint = boolValueOf.booleanValue() ? f18330 : f18339;
        paint.setColor(iMo7429);
        int i2 = c12324.f36887;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (c12324.f36884) {
            int i3 = c12324.f36887 / 2;
            int i4 = i3 - c12324.f36889;
            float f = i3;
            canvas.drawCircle(f, f, i4, paint);
        } else {
            int i5 = c12324.f36889;
            float f2 = i5;
            float f3 = c12324.f36887 - i5;
            float f4 = c12324.f36888;
            canvas.drawRoundRect(f2, f2, f3, f3, f4, f4, paint);
        }
        Drawable drawableM14305 = C4925.m14305(i);
        int i6 = c12324.f36887;
        int i7 = c12324.f36890;
        int i8 = (i6 - i7) / 2;
        int i9 = i7 + i8;
        drawableM14305.setBounds(i8, i8, i9, i9);
        drawableM14305.setTint(iMo7430);
        drawableM14305.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC1629 m16752(String str) {
        InterfaceC1629 interfaceC1629 = (InterfaceC1629) f18334.m4553(str);
        if (interfaceC1629 != null) {
            return interfaceC1629;
        }
        try {
            PackageManager packageManagerM14320 = C4925.m14320();
            PackageInfo packageInfo = packageManagerM14320.getPackageInfo(str, 1);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                C3816.m11502(applicationInfo.icon, str);
            }
            C10208 c10208 = new C10208(C19883.f64181, packageInfo.applicationInfo.loadIcon(packageManagerM14320));
            f18334.m4554(str, c10208);
            return c10208;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC1629 m16753(C11813 c11813, String str) {
        InterfaceC1629 interfaceC1629 = (InterfaceC1629) f18334.m4553("apks:".concat(str));
        if (interfaceC1629 != null) {
            return interfaceC1629;
        }
        try {
            C10208 c10208 = new C10208(C19883.f64237, c11813.m28878());
            f18334.m4554("apks:".concat(str), c10208);
            return c10208;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC1629 m16756(String str) {
        InterfaceC1629 interfaceC1629 = (InterfaceC1629) f18334.m4553(str);
        if (interfaceC1629 != null) {
            return interfaceC1629;
        }
        File file = new File(str, "base.apk");
        if (!file.exists()) {
            file = null;
        }
        if (file == null) {
            File[] fileArrListFiles = new File(str).listFiles();
            if (fileArrListFiles != null) {
                file = m16751(fileArrListFiles);
                if (file == null) {
                    for (File file2 : fileArrListFiles) {
                        if (file2.isDirectory()) {
                            File file3 = new File(file2, "base.apk");
                            if (file3.exists()) {
                                file = file3;
                                break;
                            }
                        }
                    }
                }
                if (file == null) {
                    for (File file4 : fileArrListFiles) {
                        if (file4.isDirectory() && (file = m16751(file4.listFiles())) != null) {
                            break;
                        }
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 34) {
                if (SystemClock.uptimeMillis() - f18327 > 10000) {
                    int i = 0;
                    f18341 = (List) C5378.stream(C4925.m14320().getInstalledPackages(0)).map(new C4563(i)).filter(new C3152(i)).collect(C22976.toList());
                    f18327 = SystemClock.uptimeMillis();
                }
                for (String str2 : f18341) {
                    if (str2.startsWith(str)) {
                        File file5 = new File(str2);
                        if (file5.exists()) {
                            file = file5;
                            break;
                        }
                    }
                }
            }
        }
        if (file != null) {
            try {
                PackageManager packageManagerM14320 = C4925.m14320();
                PackageInfo packageArchiveInfo = packageManagerM14320.getPackageArchiveInfo(file.getPath(), 1);
                if (packageArchiveInfo != null) {
                    ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
                    applicationInfo.publicSourceDir = file.getPath();
                    applicationInfo.sourceDir = file.getPath();
                    C3816.m11502(applicationInfo.icon, applicationInfo.packageName);
                    C10208 c10208 = new C10208(C19883.f64181, applicationInfo.loadIcon(packageManagerM14320));
                    f18334.m4554(str, c10208);
                    return c10208;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static File m16751(File[] fileArr) {
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
    public static BitmapDrawable m16750(Drawable drawable) {
        int iM27878 = C11266.m27878(50.0f);
        Resources resourcesM14338 = C4925.m14338();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM27878, iM27878, Bitmap.Config.ARGB_8888);
        Rect rectCopyBounds = drawable.copyBounds();
        drawable.setBounds(0, 0, iM27878, iM27878);
        drawable.draw(new Canvas(bitmapCreateBitmap));
        drawable.setBounds(rectCopyBounds);
        return new BitmapDrawable(resourcesM14338, bitmapCreateBitmap);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static BitmapDrawable m16749(PackageInfo packageInfo) {
        BitmapDrawable bitmapDrawableM16750;
        String str = C14460.m34524(packageInfo.packageName).substring(0, 24) + Long.toHexString(packageInfo.lastUpdateTime);
        Bitmap bitmapM31773 = C13110.m31773(str);
        if (bitmapM31773 != null) {
            return new BitmapDrawable(C4925.m14338(), bitmapM31773);
        }
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        if (applicationInfo != null) {
            C3816.m11502(applicationInfo.icon, packageInfo.packageName);
        }
        try {
            bitmapDrawableM16750 = m16750(packageInfo.applicationInfo.loadIcon(C4925.m14320()));
        } catch (Throwable unused) {
            bitmapDrawableM16750 = m16750(C4925.m14305(R.drawable.MT_Protector));
        }
        C13110.m31775(str, bitmapDrawableM16750.getBitmap());
        return bitmapDrawableM16750;
    }
}
