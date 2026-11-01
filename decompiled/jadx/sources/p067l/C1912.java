package p067l;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.DocumentsContract;

/* JADX INFO: renamed from: l.᩸۫ */
/* JADX INFO: compiled from: U9SU */
/* JADX INFO: loaded from: classes4.dex */
public final class C1912 {
    /* JADX INFO: renamed from: ֫ */
    public static String m51079(Uri uri) {
        return DocumentsContract.getTreeDocumentId(uri);
    }

    /* JADX INFO: renamed from: ۧ */
    public static Uri m51081(String str, String str2) {
        return DocumentsContract.buildTreeDocumentUri(str, str2);
    }

    /* JADX INFO: renamed from: ۧ */
    public static Uri m51080(Uri uri, String str) {
        return DocumentsContract.buildDocumentUriUsingTree(uri, str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Uri m51078(String str, String str2) {
        return DocumentsContract.buildChildDocumentsUri(str, str2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Uri m51077(Uri uri, String str) {
        return DocumentsContract.buildChildDocumentsUriUsingTree(uri, str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Uri m51076(ContentResolver contentResolver, Uri uri, String str, String str2) {
        return DocumentsContract.createDocument(contentResolver, uri, str, str2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Uri m51075(ContentResolver contentResolver, Uri uri, String str) {
        return DocumentsContract.renameDocument(contentResolver, uri, str);
    }
}
