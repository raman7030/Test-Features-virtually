package p067l;

import android.net.Uri;
import android.os.Build;
import java.util.List;

/* JADX INFO: renamed from: l.ܳܶܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: K17L */
/* JADX INFO: loaded from: classes4.dex */
public final class C16253 {
    /* JADX INFO: renamed from: ܿ */
    public static String m37022(Uri uri) {
        if (!"content".equals(uri.getScheme())) {
            return null;
        }
        List<String> pathSegments = uri.getPathSegments();
        if ((pathSegments.size() != 2 && pathSegments.size() != 4) || !pathSegments.get(0).equals("tree")) {
            return null;
        }
        String str = pathSegments.get(1);
        int iIndexOf = str.indexOf(58);
        int iIndexOf2 = str.indexOf(47);
        if (iIndexOf == -1 || (iIndexOf2 != -1 && iIndexOf2 < iIndexOf)) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    /* JADX INFO: renamed from: ۧ */
    public static Uri m37020(Uri uri) {
        if ("content".equals(uri.getScheme())) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() == 2) {
                if (pathSegments.get(0).equals("tree")) {
                    return new Uri.Builder().scheme("content").authority(uri.getAuthority()).appendPath("tree").appendPath(pathSegments.get(1)).appendPath("document").appendPath(pathSegments.get(1)).build();
                }
            } else if (pathSegments.size() == 4 && pathSegments.get(0).equals("tree") && pathSegments.get(2).equals("document")) {
                return uri;
            }
        }
        throw new RuntimeException("Invalid tree uri: " + uri);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00af  */
    /* JADX INFO: renamed from: ֫ */
    public static Uri m37018(Uri uri) {
        Uri.Builder builderAppendPath;
        if ("content".equals(uri.getScheme())) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() == 2) {
                if (pathSegments.get(0).equals("tree")) {
                    builderAppendPath = new Uri.Builder().scheme("content").authority(uri.getAuthority()).appendPath("tree").appendPath(pathSegments.get(1)).appendPath("document").appendPath(pathSegments.get(1)).appendPath("children");
                } else {
                    builderAppendPath = null;
                }
            } else if (pathSegments.size() == 4 && pathSegments.get(0).equals("tree") && pathSegments.get(2).equals("document")) {
                builderAppendPath = new Uri.Builder().scheme("content").authority(uri.getAuthority()).appendPath("tree").appendPath(pathSegments.get(1)).appendPath("document").appendPath(pathSegments.get(3)).appendPath("children");
            } else {
                builderAppendPath = null;
            }
            if (builderAppendPath != null) {
                if (Build.VERSION.SDK_INT > 30 && "com.android.externalstorage.documents".equals(uri.getAuthority())) {
                    builderAppendPath.appendQueryParameter("manage", "1");
                }
                return builderAppendPath.build();
            }
        }
        throw new RuntimeException("Invalid tree uri: " + uri);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Uri m37019(String str, boolean z) {
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("content").authority("com.android.externalstorage.documents").appendPath("tree").appendPath(str);
        if (z) {
            builderAppendPath.appendPath("document").appendPath(str);
        }
        return builderAppendPath.build();
    }

    /* JADX INFO: renamed from: ᩳ */
    public static Uri m37023(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return null;
        }
        String strM38720 = pathSegments.get(1);
        String strM38721 = pathSegments.get(3);
        if (strM38720.endsWith("/")) {
            strM38720 = C17073.m38720(1, 0, strM38720);
        }
        if (strM38721.endsWith("/")) {
            strM38721 = C17073.m38720(1, 0, strM38721);
        }
        if (strM38721.length() <= strM38720.length()) {
            return null;
        }
        int iLastIndexOf = strM38721.lastIndexOf(47);
        return new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).appendPath("tree").appendPath(strM38720).appendPath("document").appendPath(iLastIndexOf < strM38720.length() ? strM38720 : strM38721.substring(0, iLastIndexOf)).build();
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m37021(Uri uri) {
        String strM37022 = m37022(uri);
        if (strM37022 == null) {
            String path = uri.getPath();
            C12826.requireNonNull(path);
            return C15993.m36343(path);
        }
        List<String> pathSegments = uri.getPathSegments();
        String strSubstring = pathSegments.size() == 2 ? pathSegments.get(1).substring(strM37022.length() + 1) : pathSegments.get(3).substring(strM37022.length() + 1);
        if (strSubstring.endsWith("/")) {
            strSubstring = C17073.m38720(1, 0, strSubstring);
        }
        return strSubstring.isEmpty() ? strM37022 : strSubstring.substring(strSubstring.lastIndexOf(47) + 1);
    }
}
