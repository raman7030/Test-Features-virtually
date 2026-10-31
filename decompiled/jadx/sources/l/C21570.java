package l;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.DocumentsContract;

/* JADX INFO: renamed from: l.᩸۫, reason: contains not printable characters */
/* JADX INFO: compiled from: U9SU */
/* JADX INFO: loaded from: classes4.dex */
public final class C21570 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m48733(Uri uri) {
        return DocumentsContract.getTreeDocumentId(uri);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Uri m48735(String str, String str2) {
        return DocumentsContract.buildTreeDocumentUri(str, str2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Uri m48734(Uri uri, String str) {
        return DocumentsContract.buildDocumentUriUsingTree(uri, str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Uri m48732(String str, String str2) {
        return DocumentsContract.buildChildDocumentsUri(str, str2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Uri m48731(Uri uri, String str) {
        return DocumentsContract.buildChildDocumentsUriUsingTree(uri, str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Uri m48730(ContentResolver contentResolver, Uri uri, String str, String str2) {
        return DocumentsContract.createDocument(contentResolver, uri, str, str2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Uri m48729(ContentResolver contentResolver, Uri uri, String str) {
        return DocumentsContract.renameDocument(contentResolver, uri, str);
    }
}
