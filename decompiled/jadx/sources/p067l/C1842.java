package p067l;

import android.net.Uri;
import android.os.Build;
import java.util.List;

/* JADX INFO: renamed from: l.᩶۫ */
/* JADX INFO: compiled from: U9SU */
/* JADX INFO: loaded from: classes4.dex */
public final class C1842 {
    /* JADX INFO: renamed from: ۧ */
    public static boolean m48724(Uri uri) {
        if (Build.VERSION.SDK_INT < 24) {
            List<String> pathSegments = uri.getPathSegments();
            return pathSegments.size() >= 2 && "tree".equals(pathSegments.get(0));
        }
        return C1947.m52336(uri);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m48723(Uri uri) {
        return C1912.m51079(uri);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Uri m48722(Uri uri, String str) {
        return C1912.m51080(uri, str);
    }
}
