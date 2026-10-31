package l;

import android.net.Uri;
import android.os.Build;
import java.util.List;

/* JADX INFO: renamed from: l.ܳܶܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: K17L */
/* JADX INFO: loaded from: classes4.dex */
public final class C14609 {
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m34871(Uri uri) {
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Uri m34869(Uri uri) {
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Uri m34867(Uri uri) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Uri m34868(String str, boolean z) {
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("content").authority("com.android.externalstorage.documents").appendPath("tree").appendPath(str);
        if (z) {
            builderAppendPath.appendPath("document").appendPath(str);
        }
        return builderAppendPath.build();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Uri m34872(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return null;
        }
        String strM36561 = pathSegments.get(1);
        String strM36562 = pathSegments.get(3);
        if (strM36561.endsWith("/")) {
            strM36561 = C15472.m36561(1, 0, strM36561);
        }
        if (strM36562.endsWith("/")) {
            strM36562 = C15472.m36561(1, 0, strM36562);
        }
        if (strM36562.length() <= strM36561.length()) {
            return null;
        }
        int iLastIndexOf = strM36562.lastIndexOf(47);
        return new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).appendPath("tree").appendPath(strM36561).appendPath("document").appendPath(iLastIndexOf < strM36561.length() ? strM36561 : strM36562.substring(0, iLastIndexOf)).build();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m34870(Uri uri) {
        String strM34871 = m34871(uri);
        if (strM34871 == null) {
            String path = uri.getPath();
            C11003.requireNonNull(path);
            return C14336.m34210(path);
        }
        List<String> pathSegments = uri.getPathSegments();
        String strSubstring = pathSegments.size() == 2 ? pathSegments.get(1).substring(strM34871.length() + 1) : pathSegments.get(3).substring(strM34871.length() + 1);
        if (strSubstring.endsWith("/")) {
            strSubstring = C15472.m36561(1, 0, strSubstring);
        }
        return strSubstring.isEmpty() ? strM34871 : strSubstring.substring(strSubstring.lastIndexOf(47) + 1);
    }
}
