package p067l;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.util.List;

/* JADX INFO: renamed from: l.ۙᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J72H */
/* JADX INFO: loaded from: classes2.dex */
public final class C6943 extends ContentProvider {

    /* JADX INFO: renamed from: ᩸ */
    public static final ConcurrentMapC12768 f18064 = new ConcurrentMapC12768();

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Uri m15908(String str, ActivityC3244 activityC3244, AbstractC15599 abstractC15599, String str2, boolean z) {
        C21696 c21696 = (C21696) f18064.put(str, new C21696(activityC3244, abstractC15599, str2, z));
        if (c21696 != null) {
            c21696.close();
        }
        return m15907(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Uri m15909(String str, ActivityC3244 activityC3244, AbstractC17043 abstractC17043) {
        C21696 c21696 = (C21696) f18064.put(str, new C21696(activityC3244, abstractC17043));
        if (c21696 != null) {
            c21696.close();
        }
        return m15907(str);
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m15913(String str) {
        C21696 c21696;
        if (str == null || (c21696 = (C21696) f18064.remove(str)) == null) {
            return;
        }
        c21696.close();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m15912(String str) {
        C21696 c21696 = (C21696) f18064.get(str);
        if (c21696 != null) {
            c21696.m48986(false);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Uri m15907(String str) {
        return new Uri.Builder().scheme("content").authority("bin.mt.plus.html-preview").appendPath("html-preview").appendPath(str).appendPath("document.mhtml").build();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m15911(Uri uri, String str) {
        return (str == null || uri == null || !uri.equals(m15907(str))) ? false : true;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        if (m15910(uri) == null) {
            return null;
        }
        return "multipart/related";
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        if (!"r".equals(str)) {
            throw new FileNotFoundException("HTML preview provider is read-only");
        }
        C21696 c21696M15910 = m15910(uri);
        if (c21696M15910 == null) {
            throw new FileNotFoundException("Unknown HTML preview token");
        }
        return C21696.m48987(c21696M15910);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21696 m15910(Uri uri) {
        if (!"content".equals(uri.getScheme()) || !"bin.mt.plus.html-preview".equals(uri.getAuthority()) || uri.getQuery() != null || uri.getFragment() != null) {
            return null;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() != 3 || !"html-preview".equals(pathSegments.get(0)) || !"document.mhtml".equals(pathSegments.get(2))) {
            return null;
        }
        return (C21696) f18064.get(pathSegments.get(1));
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("HTML preview provider is read-only");
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("HTML preview provider is read-only");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("HTML preview provider is read-only");
    }
}
