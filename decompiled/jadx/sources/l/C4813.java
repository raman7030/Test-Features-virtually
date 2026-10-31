package l;

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
public final class C4813 extends ContentProvider {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC10942 f15231 = new ConcurrentMapC10942();

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Uri m14028(String str, ActivityC0921 activityC0921, AbstractC13921 abstractC13921, String str2, boolean z) {
        C20336 c20336 = (C20336) f15231.put(str, new C20336(activityC0921, abstractC13921, str2, z));
        if (c20336 != null) {
            c20336.close();
        }
        return m14027(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Uri m14029(String str, ActivityC0921 activityC0921, AbstractC15440 abstractC15440) {
        C20336 c20336 = (C20336) f15231.put(str, new C20336(activityC0921, abstractC15440));
        if (c20336 != null) {
            c20336.close();
        }
        return m14027(str);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m14033(String str) {
        C20336 c20336;
        if (str == null || (c20336 = (C20336) f15231.remove(str)) == null) {
            return;
        }
        c20336.close();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m14032(String str) {
        C20336 c20336 = (C20336) f15231.get(str);
        if (c20336 != null) {
            c20336.m46663(false);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Uri m14027(String str) {
        return new Uri.Builder().scheme("content").authority("bin.mt.plus.html-preview").appendPath("html-preview").appendPath(str).appendPath("document.mhtml").build();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m14031(Uri uri, String str) {
        return (str == null || uri == null || !uri.equals(m14027(str))) ? false : true;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        if (m14030(uri) == null) {
            return null;
        }
        return "multipart/related";
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        if (!"r".equals(str)) {
            throw new FileNotFoundException("HTML preview provider is read-only");
        }
        C20336 c20336M14030 = m14030(uri);
        if (c20336M14030 == null) {
            throw new FileNotFoundException("Unknown HTML preview token");
        }
        return C20336.m46664(c20336M14030);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20336 m14030(Uri uri) {
        if (!"content".equals(uri.getScheme()) || !"bin.mt.plus.html-preview".equals(uri.getAuthority()) || uri.getQuery() != null || uri.getFragment() != null) {
            return null;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() != 3 || !"html-preview".equals(pathSegments.get(0)) || !"document.mhtml".equals(pathSegments.get(2))) {
            return null;
        }
        return (C20336) f15231.get(pathSegments.get(1));
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
