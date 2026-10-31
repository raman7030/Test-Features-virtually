package l;

import android.content.Context;
import android.content.pm.IPackageInstaller;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;

/* JADX INFO: renamed from: l.ۙ֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28BC */
/* JADX INFO: loaded from: classes2.dex */
public final class C4321 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static PackageInstaller m12975(IPackageInstaller iPackageInstaller, String str, String str2, int i) {
        int i2 = Build.VERSION.SDK_INT;
        Class cls = Integer.TYPE;
        if (i2 >= 31) {
            return (PackageInstaller) PackageInstaller.class.getConstructor(IPackageInstaller.class, String.class, String.class, cls).newInstance(iPackageInstaller, str, str2, Integer.valueOf(i));
        }
        return i2 >= 26 ? (PackageInstaller) PackageInstaller.class.getConstructor(IPackageInstaller.class, String.class, cls).newInstance(iPackageInstaller, str, Integer.valueOf(i)) : (PackageInstaller) PackageInstaller.class.getConstructor(Context.class, PackageManager.class, IPackageInstaller.class, String.class, cls).newInstance(C4925.m14335(), C4925.m14320(), iPackageInstaller, str, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static PackageInstaller.SessionParams m12974() throws IllegalAccessException {
        PackageInstaller.SessionParams sessionParams = new PackageInstaller.SessionParams(1);
        int iIntValue = ((Integer) PackageInstaller.SessionParams.class.getDeclaredField("installFlags").get(sessionParams)).intValue();
        int i = 1048710 | iIntValue;
        if (Build.VERSION.SDK_INT >= 34) {
            i = 17825926 | iIntValue;
        }
        if (Process.myUserHandle().hashCode() != 0) {
            i |= 64;
        }
        PackageInstaller.SessionParams.class.getDeclaredField("installFlags").set(sessionParams, Integer.valueOf(i));
        return sessionParams;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m12976(PackageInstaller.SessionParams sessionParams, String str, String str2) throws IllegalAccessException {
        if (str2.isEmpty()) {
            return str;
        }
        if (!C11356.m28105(str2)) {
            throw new IllegalArgumentException("Invalid installer package name");
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            sessionParams.setInstallerPackageName(str2);
            return str;
        }
        if (i < 28) {
            return str2;
        }
        PackageInstaller.SessionParams.class.getDeclaredField("installerPackageName").set(sessionParams, str2);
        return str;
    }
}
