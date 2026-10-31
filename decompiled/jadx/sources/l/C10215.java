package l;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import java.io.File;

/* JADX INFO: renamed from: l.ۤۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1X2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10215 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Configuration f30685;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final DisplayMetrics f30686;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final PackageInfo f30687;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Configuration m25637(C10215 c10215) {
        c10215.getClass();
        return new Configuration(c10215.f30685);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static DisplayMetrics m25639(C10215 c10215) {
        c10215.getClass();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.setTo(c10215.f30686);
        return displayMetrics;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10215 m25638(Context context, File file) throws PackageManager.NameNotFoundException {
        PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getPath(), 4239);
        if (packageArchiveInfo == null || packageArchiveInfo.applicationInfo == null) {
            throw new PackageManager.NameNotFoundException(file.getPath());
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.setTo(context.getResources().getDisplayMetrics());
        return new C10215(C5981.m16786(packageArchiveInfo), displayMetrics, new Configuration(context.getResources().getConfiguration()));
    }

    public C10215(PackageInfo packageInfo, DisplayMetrics displayMetrics, Configuration configuration) {
        this.f30687 = packageInfo;
        this.f30686 = displayMetrics;
        this.f30685 = configuration;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static PackageInfo m25640(C10215 c10215) {
        return C5981.m16786(c10215.f30687);
    }
}
