package l;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.DocumentsContract;

/* JADX INFO: renamed from: l.᩹۫, reason: contains not printable characters */
/* JADX INFO: compiled from: U9SU */
/* JADX INFO: loaded from: classes.dex */
public final class C22275 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m50008(Uri uri) {
        return DocumentsContract.isTreeUri(uri);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m50007(ContentResolver contentResolver, Uri uri, Uri uri2) {
        return DocumentsContract.removeDocument(contentResolver, uri, uri2);
    }
}
