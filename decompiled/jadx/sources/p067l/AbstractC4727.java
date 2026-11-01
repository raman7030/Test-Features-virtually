package p067l;

import android.app.Application;
import android.net.Uri;
import android.provider.DocumentsContract;

/* JADX INFO: renamed from: l.ۖۧ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: P57G */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4727 {
    /* JADX INFO: renamed from: ֫ */
    public abstract String mo10018();

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC4727 m10017(Application application, Uri uri) {
        String strM48723 = C1842.m48723(uri);
        if (DocumentsContract.isDocumentUri(application, uri)) {
            strM48723 = DocumentsContract.getDocumentId(uri);
        }
        if (strM48723 == null) {
            throw new IllegalArgumentException("Could not get document ID from Uri: " + uri);
        }
        Uri uriM48722 = C1842.m48722(uri, strM48723);
        if (uriM48722 == null) {
            throw new NullPointerException("Failed to build documentUri from a tree: " + uri);
        }
        return new C6068(application, uriM48722);
    }
}
