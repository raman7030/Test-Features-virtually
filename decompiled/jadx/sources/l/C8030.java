package l;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.۠۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6ZH */
/* JADX INFO: loaded from: classes3.dex */
public final class C8030 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f24767 = 0;

    static {
        Uri.parse("*");
        Uri.parse("");
        new WeakHashMap();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static PackageInfo m21343() {
        if (Build.VERSION.SDK_INT >= 26) {
            return C11558.m28452();
        }
        try {
            return m21344();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static PackageInfo m21344() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }
}
