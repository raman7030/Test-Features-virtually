package l;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;

/* JADX INFO: renamed from: l.᩻ܶܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: M54P */
/* JADX INFO: loaded from: classes.dex */
public final class C23782 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    @SuppressLint({"StaticFieldLeak"})
    public static final Application f76977 = C4925.m14335();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final ContentResolver f76978 = C4925.m14336();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m52459(Uri uri) {
        return m52453(uri, "_display_name");
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m52457(Uri uri) {
        return "vnd.android.document/directory".equals(m52453(uri, "mime_type"));
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m52462(Uri uri) {
        String strM52453 = m52453(uri, "mime_type");
        return ("vnd.android.document/directory".equals(strM52453) || TextUtils.isEmpty(strM52453)) ? false : true;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static long m52455(Uri uri) {
        return m52451(0L, uri, "last_modified");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long m52461(Uri uri) {
        return m52451(0L, uri, "_size");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m52454(Uri uri) {
        return f76977.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(m52453(uri, "mime_type"));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m52456(Uri uri) {
        if (f76977.checkCallingOrSelfUriPermission(uri, 2) == 0) {
            String strM52453 = m52453(uri, "mime_type");
            int iM52451 = (int) m52451(0, uri, "flags");
            if (!TextUtils.isEmpty(strM52453)) {
                if ((iM52451 & 4) != 0) {
                    return true;
                }
                if ("vnd.android.document/directory".equals(strM52453) && (iM52451 & 8) != 0) {
                    return true;
                }
                if (!TextUtils.isEmpty(strM52453) && (iM52451 & 2) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m52460(Uri uri) {
        try {
            Cursor cursorQuery = f76978.query(uri, new String[]{"document_id"}, null, null, null);
            try {
                C11003.requireNonNull(cursorQuery);
                boolean z = cursorQuery.getCount() > 0;
                cursorQuery.close();
                return z;
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            e.toString();
            return false;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m52458(Uri uri) {
        try {
            return DocumentsContract.deleteDocument(f76978, uri);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Uri m52452(Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(f76978, uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m52453(Uri uri, String str) {
        try {
            Cursor cursorQuery = f76978.query(uri, new String[]{str}, null, null, null);
            try {
                C11003.requireNonNull(cursorQuery);
                if (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) {
                    cursorQuery.close();
                    return null;
                }
                String string = cursorQuery.getString(0);
                cursorQuery.close();
                return string;
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            e.toString();
            return null;
        }
        e.toString();
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m52451(long j, Uri uri, String str) {
        try {
            Cursor cursorQuery = f76978.query(uri, new String[]{str}, null, null, null);
            try {
                C11003.requireNonNull(cursorQuery);
                if (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) {
                    cursorQuery.close();
                    return j;
                }
                long j2 = cursorQuery.getLong(0);
                cursorQuery.close();
                return j2;
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            e.toString();
            return j;
        }
        e.toString();
        return j;
    }
}
