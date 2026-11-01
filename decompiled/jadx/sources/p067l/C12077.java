package p067l;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import java.io.File;

/* JADX INFO: renamed from: l.ۤۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1X2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12077 {

    /* JADX INFO: renamed from: ֫ */
    public final Configuration f33646;

    /* JADX INFO: renamed from: ۧ */
    public final DisplayMetrics f33647;

    /* JADX INFO: renamed from: ܽ */
    public final PackageInfo f33648;

    /* JADX INFO: renamed from: ֫ */
    public static Configuration m27659(C12077 c12077) {
        c12077.getClass();
        return new Configuration(c12077.f33646);
    }

    /* JADX INFO: renamed from: ۧ */
    public static DisplayMetrics m27661(C12077 c12077) {
        c12077.getClass();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.setTo(c12077.f33647);
        return displayMetrics;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12077 m27660(Context context, File file) throws PackageManager.NameNotFoundException {
        PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getPath(), 4239);
        if (packageArchiveInfo == null || packageArchiveInfo.applicationInfo == null) {
            throw new PackageManager.NameNotFoundException(file.getPath());
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.setTo(context.getResources().getDisplayMetrics());
        return new C12077(C8053.m18712(packageArchiveInfo), displayMetrics, new Configuration(context.getResources().getConfiguration()));
    }

    public C12077(PackageInfo packageInfo, DisplayMetrics displayMetrics, Configuration configuration) {
        this.f33648 = packageInfo;
        this.f33647 = displayMetrics;
        this.f33646 = configuration;
    }

    /* JADX INFO: renamed from: ܽ */
    public static PackageInfo m27662(C12077 c12077) {
        return C8053.m18712(c12077.f33648);
    }
}
