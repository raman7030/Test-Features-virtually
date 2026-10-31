package l;

import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ۢܶܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N4Y9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9672 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final boolean f29273;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static HashSet f29274;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static HashMap f29275;

    static {
        f29273 = Build.VERSION.SDK_INT >= 30 && Environment.isExternalStorageManager();
        f29275 = new HashMap();
        f29274 = new HashSet();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m24603() {
        if (f29273) {
            return false;
        }
        return C4925.f15523.getBoolean("use_external_storage_api", Build.VERSION.SDK_INT < 30);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m24600(File file) {
        String path = file.getPath();
        C4216 c4216M45449 = C19739.m45449(path);
        if (c4216M45449 == null) {
            return null;
        }
        if (!m24603()) {
            return new C11293(file, false);
        }
        Uri uriM24601 = m24601(c4216M45449);
        if (uriM24601 == null) {
            return null;
        }
        String path2 = c4216M45449.f13687.getPath();
        if (path.length() == path2.length()) {
            return new C6849(file, uriM24601);
        }
        String strSubstring = path.substring(path2.length() + 1);
        String strM34871 = C14609.m34871(uriM24601);
        if (strM34871 == null) {
            throw new RuntimeException("Invalid tree uri: " + uriM24601);
        }
        String strSubstring2 = strSubstring.startsWith("/") ? strSubstring.substring(1) : strSubstring;
        if (strSubstring2.endsWith("/")) {
            strSubstring2 = C15472.m36561(1, 0, strSubstring2);
        }
        if (strSubstring2.isEmpty()) {
            throw new IllegalArgumentException("Invalid Child name: ".concat(strSubstring));
        }
        List<String> pathSegments = uriM24601.getPathSegments();
        Uri.Builder builderAppendPath = new Uri.Builder().scheme(uriM24601.getScheme()).authority(uriM24601.getAuthority()).appendPath("tree").appendPath(pathSegments.get(1)).appendPath("document");
        String strSubstring3 = pathSegments.size() == 2 ? pathSegments.get(1).substring(strM34871.length() + 1) : pathSegments.get(3).substring(strM34871.length() + 1);
        if (!strSubstring3.isEmpty()) {
            strSubstring2 = strSubstring3.endsWith("/") ? strSubstring3.concat(strSubstring2) : C22870.m50967(strSubstring3, "/", strSubstring2);
        }
        return new C6849(file, builderAppendPath.appendPath(strM34871 + ":" + strSubstring2).build());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Uri m24601(C4216 c4216) {
        boolean z;
        String path = c4216.f13687.getPath();
        HashMap map = f29275;
        Uri uri = (Uri) map.get(path);
        if (uri != null) {
            return uri;
        }
        Uri uriM34868 = C14609.m34868(c4216.f13688 + ":", true);
        HashSet hashSet = f29274;
        if (hashSet.contains(uriM34868)) {
            return null;
        }
        boolean z2 = false;
        try {
            Cursor cursorQuery = C4925.m14335().getContentResolver().query(C14609.m34869(uriM34868), new String[]{"document_id"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    z = cursorQuery.getCount() > 0;
                } catch (Throwable th) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            z2 = z;
        } catch (Throwable unused) {
        }
        if (!z2) {
            hashSet.add(uriM34868);
            return null;
        }
        map.put(path, uriM34868);
        return uriM34868;
    }
}
