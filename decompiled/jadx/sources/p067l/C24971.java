package p067l;

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
public final class C24971 {

    /* JADX INFO: renamed from: ֫ */
    @SuppressLint({"StaticFieldLeak"})
    public static final Application f79729 = C7050.m16232();

    /* JADX INFO: renamed from: ۧ */
    public static final ContentResolver f79730 = C7050.m16233();

    /* JADX INFO: renamed from: ܿ */
    public static String m54868(Uri uri) {
        return m54862(uri, "_display_name");
    }

    /* JADX INFO: renamed from: ܳ */
    public static boolean m54866(Uri uri) {
        return "vnd.android.document/directory".equals(m54862(uri, "mime_type"));
    }

    /* JADX INFO: renamed from: ᩻ */
    public static boolean m54871(Uri uri) {
        String strM54862 = m54862(uri, "mime_type");
        return ("vnd.android.document/directory".equals(strM54862) || TextUtils.isEmpty(strM54862)) ? false : true;
    }

    /* JADX INFO: renamed from: ۜ */
    public static long m54864(Uri uri) {
        return m54860(0L, uri, "last_modified");
    }

    /* JADX INFO: renamed from: ᩷ */
    public static long m54870(Uri uri) {
        return m54860(0L, uri, "_size");
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m54863(Uri uri) {
        return f79729.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(m54862(uri, "mime_type"));
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m54865(Uri uri) {
        if (f79729.checkCallingOrSelfUriPermission(uri, 2) == 0) {
            String strM54862 = m54862(uri, "mime_type");
            int iM54860 = (int) m54860(0, uri, "flags");
            if (!TextUtils.isEmpty(strM54862)) {
                if ((iM54860 & 4) != 0) {
                    return true;
                }
                if ("vnd.android.document/directory".equals(strM54862) && (iM54860 & 8) != 0) {
                    return true;
                }
                if (!TextUtils.isEmpty(strM54862) && (iM54860 & 2) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m54869(Uri uri) {
        try {
            Cursor cursorQuery = f79730.query(uri, new String[]{"document_id"}, null, null, null);
            try {
                C12826.requireNonNull(cursorQuery);
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

    /* JADX INFO: renamed from: ܽ */
    public static boolean m54867(Uri uri) {
        try {
            return DocumentsContract.deleteDocument(f79730, uri);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Uri m54861(Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(f79730, uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m54862(Uri uri, String str) {
        try {
            Cursor cursorQuery = f79730.query(uri, new String[]{str}, null, null, null);
            try {
                C12826.requireNonNull(cursorQuery);
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

    /* JADX INFO: renamed from: ֫ */
    public static long m54860(long j, Uri uri, String str) {
        try {
            Cursor cursorQuery = f79730.query(uri, new String[]{str}, null, null, null);
            try {
                C12826.requireNonNull(cursorQuery);
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
