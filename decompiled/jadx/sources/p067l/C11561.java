package p067l;

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
public final class C11561 {

    /* JADX INFO: renamed from: ֫ */
    public static final boolean f32222;

    /* JADX INFO: renamed from: ۧ */
    public static HashSet f32223;

    /* JADX INFO: renamed from: ܽ */
    public static HashMap f32224;

    static {
        f32222 = Build.VERSION.SDK_INT >= 30 && Environment.isExternalStorageManager();
        f32224 = new HashMap();
        f32223 = new HashSet();
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m26617() {
        if (f32222) {
            return false;
        }
        return C7050.f18355.getBoolean("use_external_storage_api", Build.VERSION.SDK_INT < 30);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17043 m26614(File file) {
        String path = file.getPath();
        C6376 c6376M47753 = C21129.m47753(path);
        if (c6376M47753 == null) {
            return null;
        }
        if (!m26617()) {
            return new C13102(file, false);
        }
        Uri uriM26615 = m26615(c6376M47753);
        if (uriM26615 == null) {
            return null;
        }
        String path2 = c6376M47753.f16500.getPath();
        if (path.length() == path2.length()) {
            return new C8878(file, uriM26615);
        }
        String strSubstring = path.substring(path2.length() + 1);
        String strM37022 = C16253.m37022(uriM26615);
        if (strM37022 == null) {
            throw new RuntimeException("Invalid tree uri: " + uriM26615);
        }
        String strSubstring2 = strSubstring.startsWith("/") ? strSubstring.substring(1) : strSubstring;
        if (strSubstring2.endsWith("/")) {
            strSubstring2 = C17073.m38720(1, 0, strSubstring2);
        }
        if (strSubstring2.isEmpty()) {
            throw new IllegalArgumentException("Invalid Child name: ".concat(strSubstring));
        }
        List<String> pathSegments = uriM26615.getPathSegments();
        Uri.Builder builderAppendPath = new Uri.Builder().scheme(uriM26615.getScheme()).authority(uriM26615.getAuthority()).appendPath("tree").appendPath(pathSegments.get(1)).appendPath("document");
        String strSubstring3 = pathSegments.size() == 2 ? pathSegments.get(1).substring(strM37022.length() + 1) : pathSegments.get(3).substring(strM37022.length() + 1);
        if (!strSubstring3.isEmpty()) {
            strSubstring2 = strSubstring3.endsWith("/") ? strSubstring3.concat(strSubstring2) : C24104.m53357(strSubstring3, "/", strSubstring2);
        }
        return new C8878(file, builderAppendPath.appendPath(strM37022 + ":" + strSubstring2).build());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX INFO: renamed from: ۧ */
    public static Uri m26615(C6376 c6376) {
        boolean z;
        String path = c6376.f16500.getPath();
        HashMap map = f32224;
        Uri uri = (Uri) map.get(path);
        if (uri != null) {
            return uri;
        }
        Uri uriM37019 = C16253.m37019(c6376.f16501 + ":", true);
        HashSet hashSet = f32223;
        if (hashSet.contains(uriM37019)) {
            return null;
        }
        boolean z2 = false;
        try {
            Cursor cursorQuery = C7050.m16232().getContentResolver().query(C16253.m37020(uriM37019), new String[]{"document_id"}, null, null, null);
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
            hashSet.add(uriM37019);
            return null;
        }
        map.put(path, uriM37019);
        return uriM37019;
    }
}
