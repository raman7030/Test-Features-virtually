package p067l;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.۠۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6ZH */
/* JADX INFO: loaded from: classes3.dex */
public final class C10000 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f27681 = 0;

    static {
        Uri.parse("*");
        Uri.parse("");
        new WeakHashMap();
    }

    /* JADX INFO: renamed from: ֫ */
    public static PackageInfo m23309() {
        if (Build.VERSION.SDK_INT >= 26) {
            return C13353.m30498();
        }
        try {
            return m23310();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static PackageInfo m23310() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }
}
