package p067l;

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
import bin.p000mt.plus.R;
import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: l.ۛۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5T2 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8046 implements Runnable {

    /* JADX INFO: renamed from: ֫֫ */
    public static long f21180;

    /* JADX INFO: renamed from: ۗ */
    public static C14081 f21181;

    /* JADX INFO: renamed from: ۙ */
    public static C14081 f21182;

    /* JADX INFO: renamed from: ۛ */
    public static Paint f21183;

    /* JADX INFO: renamed from: ۜᩳ۟, reason: not valid java name and contains not printable characters */
    private static final short[] f82018;

    /* JADX INFO: renamed from: ۟ */
    public static int f21184;

    /* JADX INFO: renamed from: ۤ */
    public static C14081 f21185;

    /* JADX INFO: renamed from: ۨ */
    public static C0907 f21186;

    /* JADX INFO: renamed from: ۫ */
    public static C14081 f21187;

    /* JADX INFO: renamed from: ۬ */
    public static C14081 f21188;

    /* JADX INFO: renamed from: ܰ */
    public static int f21189;

    /* JADX INFO: renamed from: ᩶ */
    public static Paint f21190;

    /* JADX INFO: renamed from: ᩸ */
    public static Paint f21191;

    /* JADX INFO: renamed from: ᩹ */
    public static ColorMatrixColorFilter f21192;

    /* JADX INFO: renamed from: ᩺ */
    public static List f21193;

    @Override // java.lang.Runnable
    public native void run();

    static {
        ApplicationC14266.m56479(68);
        f82018 = new short[]{9005, -28321, -28292, -28292, -28317, -28298, -28319, -28302, -28300, -28319, -28298, -28298, -28290, -28298, -28291, -28313, -28355, -28313, -28309, -28313};
        new RunnableC8046().run();
    }

    /* JADX INFO: renamed from: ֫ */
    public static Bitmap m18673(AbstractC22606 abstractC22606, int i) {
        return m18672(f21181, abstractC22606, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Bitmap m18670(int i) {
        return m18672(f21182, C21265.f66820, i);
    }

    /* JADX INFO: renamed from: ۧ */
    public static Bitmap m18681(AbstractC22606 abstractC22606, int i) {
        return m18672(f21188, abstractC22606, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Bitmap m18671(int i, int i2, boolean z) {
        C14081 c14081 = z ? f21187 : f21185;
        Boolean boolValueOf = c14081.f39900;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(C23223.f72981);
        }
        Paint paint = boolValueOf.booleanValue() ? f21183 : f21191;
        paint.setColor(i);
        int i3 = c14081.f39901;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (c14081.f39898) {
            int i4 = c14081.f39901 / 2;
            int i5 = i4 - c14081.f39903;
            float f = i4;
            canvas.drawCircle(f, f, i5, paint);
        } else {
            int i6 = c14081.f39903;
            float f2 = i6;
            float f3 = c14081.f39901 - i6;
            float f4 = c14081.f39902;
            canvas.drawRoundRect(f2, f2, f3, f3, f4, f4, paint);
        }
        Drawable drawableM16202 = C7050.m16202(i2);
        int i7 = c14081.f39901;
        int i8 = c14081.f39904;
        int i9 = (i7 - i8) / 2;
        int i10 = i8 + i9;
        if (C9464.m21977(i) > 220) {
            drawableM16202.setTint(-12895429);
        } else {
            drawableM16202.setTint(-1);
        }
        drawableM16202.setBounds(i9, i9, i10, i10);
        drawableM16202.setAlpha((c14081.f39899 || !C23223.m51768()) ? 255 : 200);
        drawableM16202.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Bitmap m18672(C14081 c14081, AbstractC22606 abstractC22606, int i) {
        int iMo9511 = abstractC22606.mo9511();
        int iMo9512 = abstractC22606.mo9512();
        Boolean boolValueOf = c14081.f39900;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(C23223.f72981);
        }
        Paint paint = boolValueOf.booleanValue() ? f21183 : f21191;
        paint.setColor(iMo9511);
        int i2 = c14081.f39901;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (c14081.f39898) {
            int i3 = c14081.f39901 / 2;
            int i4 = i3 - c14081.f39903;
            float f = i3;
            canvas.drawCircle(f, f, i4, paint);
        } else {
            int i5 = c14081.f39903;
            float f2 = i5;
            float f3 = c14081.f39901 - i5;
            float f4 = c14081.f39902;
            canvas.drawRoundRect(f2, f2, f3, f3, f4, f4, paint);
        }
        Drawable drawableM16202 = C7050.m16202(i);
        int i6 = c14081.f39901;
        int i7 = c14081.f39904;
        int i8 = (i6 - i7) / 2;
        int i9 = i7 + i8;
        drawableM16202.setBounds(i8, i8, i9, i9);
        drawableM16202.setTint(iMo9512);
        drawableM16202.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC0923 m18678(String str) {
        InterfaceC0923 interfaceC0923 = (InterfaceC0923) f21186.m6785(str);
        if (interfaceC0923 != null) {
            return interfaceC0923;
        }
        try {
            PackageManager packageManagerM16217 = C7050.m16217();
            PackageInfo packageInfo = packageManagerM16217.getPackageInfo(str, 1);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                C5995.m13438(applicationInfo.icon, str);
            }
            C12070 c12070 = new C12070(C21265.f66817, packageInfo.applicationInfo.loadIcon(packageManagerM16217));
            f21186.m6786(str, c12070);
            return c12070;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC0923 m18679(C13596 c13596, String str) {
        InterfaceC0923 interfaceC0923 = (InterfaceC0923) f21186.m6785("apks:".concat(str));
        if (interfaceC0923 != null) {
            return interfaceC0923;
        }
        try {
            C12070 c12070 = new C12070(C21265.f66873, c13596.m30927());
            f21186.m6786("apks:".concat(str), c12070);
            return c12070;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static InterfaceC0923 m18682(String str) {
        InterfaceC0923 interfaceC0923 = (InterfaceC0923) f21186.m6785(str);
        if (interfaceC0923 != null) {
            return interfaceC0923;
        }
        File file = new File(str, "base.apk");
        if (!file.exists()) {
            file = null;
        }
        if (file == null) {
            File[] fileArrListFiles = new File(str).listFiles();
            if (fileArrListFiles != null) {
                file = m18677(fileArrListFiles);
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
                        if (file4.isDirectory() && (file = m18677(file4.listFiles())) != null) {
                            break;
                        }
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 34) {
                if (SystemClock.uptimeMillis() - f21180 > 10000) {
                    int i = 0;
                    f21193 = (List) C7480.stream(C7050.m16217().getInstalledPackages(0)).map(new C6705(i)).filter(new C5364(i)).collect(C24205.toList());
                    f21180 = SystemClock.uptimeMillis();
                }
                for (String str2 : f21193) {
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
                PackageManager packageManagerM16217 = C7050.m16217();
                PackageInfo packageArchiveInfo = packageManagerM16217.getPackageArchiveInfo(file.getPath(), 1);
                if (packageArchiveInfo != null) {
                    ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
                    applicationInfo.publicSourceDir = file.getPath();
                    applicationInfo.sourceDir = file.getPath();
                    C5995.m13438(applicationInfo.icon, applicationInfo.packageName);
                    C12070 c12070 = new C12070(C21265.f66817, applicationInfo.loadIcon(packageManagerM16217));
                    f21186.m6786(str, c12070);
                    return c12070;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static File m18677(File[] fileArr) {
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
    public static BitmapDrawable m18676(Drawable drawable) {
        int iM29939 = C13076.m29939(50.0f);
        Resources resourcesM16235 = C7050.m16235();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM29939, iM29939, Bitmap.Config.ARGB_8888);
        Rect rectCopyBounds = drawable.copyBounds();
        drawable.setBounds(0, 0, iM29939, iM29939);
        drawable.draw(new Canvas(bitmapCreateBitmap));
        drawable.setBounds(rectCopyBounds);
        return new BitmapDrawable(resourcesM16235, bitmapCreateBitmap);
    }

    /* JADX INFO: renamed from: ֫ */
    public static BitmapDrawable m18675(PackageInfo packageInfo) {
        BitmapDrawable bitmapDrawableM18676;
        String str = C16111.m36658(packageInfo.packageName).substring(0, 24) + Long.toHexString(packageInfo.lastUpdateTime);
        Bitmap bitmapM33864 = C14828.m33864(str);
        if (bitmapM33864 != null) {
            return new BitmapDrawable(C7050.m16235(), bitmapM33864);
        }
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        if (applicationInfo != null) {
            C5995.m13438(applicationInfo.icon, packageInfo.packageName);
        }
        try {
            bitmapDrawableM18676 = m18676(packageInfo.applicationInfo.loadIcon(C7050.m16217()));
        } catch (Throwable unused) {
            bitmapDrawableM18676 = m18676(C7050.m16202(R.drawable.MT_Protector));
        }
        C14828.m33866(str, bitmapDrawableM18676.getBitmap());
        return bitmapDrawableM18676;
    }
}
