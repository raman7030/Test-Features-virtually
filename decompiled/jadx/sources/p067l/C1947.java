package p067l;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.DocumentsContract;

/* JADX INFO: renamed from: l.᩹۫ */
/* JADX INFO: compiled from: U9SU */
/* JADX INFO: loaded from: classes.dex */
public final class C1947 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m52336(Uri uri) {
        return DocumentsContract.isTreeUri(uri);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m52335(ContentResolver contentResolver, Uri uri, Uri uri2) {
        return DocumentsContract.removeDocument(contentResolver, uri, uri2);
    }
}
