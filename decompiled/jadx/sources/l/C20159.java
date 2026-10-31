package l;

import android.net.Uri;
import android.os.Build;
import java.util.List;

/* JADX INFO: renamed from: l.᩶۫, reason: contains not printable characters */
/* JADX INFO: compiled from: U9SU */
/* JADX INFO: loaded from: classes4.dex */
public final class C20159 {
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m46407(Uri uri) {
        if (Build.VERSION.SDK_INT < 24) {
            List<String> pathSegments = uri.getPathSegments();
            return pathSegments.size() >= 2 && "tree".equals(pathSegments.get(0));
        }
        return C22275.m50008(uri);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m46406(Uri uri) {
        return C21570.m48733(uri);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Uri m46405(Uri uri, String str) {
        return C21570.m48734(uri, str);
    }
}
