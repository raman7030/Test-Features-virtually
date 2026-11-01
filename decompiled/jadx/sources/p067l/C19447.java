package p067l;

import android.content.pm.PackageInfo;
import android.graphics.drawable.ColorDrawable;

/* JADX INFO: renamed from: l.ᩳۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes4.dex */
public final class C19447 {

    /* JADX INFO: renamed from: ֫ */
    public final String f59238;

    /* JADX INFO: renamed from: ۧ */
    public boolean f59239;

    /* JADX INFO: renamed from: ܳ */
    public final String f59240;

    /* JADX INFO: renamed from: ܽ */
    public final C0878 f59241 = new C0878(new ColorDrawable(0));

    /* JADX INFO: renamed from: ܿ */
    public final PackageInfo f59242;

    /* JADX INFO: renamed from: ᩳ */
    public final String f59243;

    public C19447(PackageInfo packageInfo) {
        this.f59242 = packageInfo;
        this.f59238 = C6860.m15721(packageInfo);
        this.f59240 = packageInfo.packageName;
        this.f59243 = packageInfo.versionName + "   " + C24158.m53411(C18524.m42109(packageInfo.applicationInfo.sourceDir, new String[0]).mo25101());
    }
}
