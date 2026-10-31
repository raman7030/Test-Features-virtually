package l;

import android.app.Application;
import android.net.Uri;
import android.provider.DocumentsContract;

/* JADX INFO: renamed from: l.ۖۧ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: P57G */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2482 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract String mo7970();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC2482 m7969(Application application, Uri uri) {
        String strM46406 = C20159.m46406(uri);
        if (DocumentsContract.isDocumentUri(application, uri)) {
            strM46406 = DocumentsContract.getDocumentId(uri);
        }
        if (strM46406 == null) {
            throw new IllegalArgumentException("Could not get document ID from Uri: " + uri);
        }
        Uri uriM46405 = C20159.m46405(uri, strM46406);
        if (uriM46405 == null) {
            throw new NullPointerException("Failed to build documentUri from a tree: " + uri);
        }
        return new C3893(application, uriM46405);
    }
}
