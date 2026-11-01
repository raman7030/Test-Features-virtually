package p067l;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: renamed from: l.᩶ᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 194E */
/* JADX INFO: loaded from: classes4.dex */
public final class C21717 {
    /* JADX INFO: renamed from: ֫ */
    public static int m49001(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver != null) {
            Cursor cursor = null;
            try {
                Cursor cursorQuery = contentResolver.query(Uri.parse("content://com.bbk.launcher2.settings/favorites"), null, null, null, null);
                if (cursorQuery != null) {
                    String strM49002 = m49002(context);
                    while (cursorQuery.moveToNext()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("title"));
                        if (!TextUtils.isEmpty(string) && string.equals(strM49002)) {
                            int i = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("shortcutPermission"));
                            if (i == 1 || i == 17) {
                                cursorQuery.close();
                                return -1;
                            }
                            if (i == 16) {
                                cursorQuery.close();
                                return 0;
                            }
                            if (i == 18) {
                                cursorQuery.close();
                                return 1;
                            }
                        }
                    }
                    cursorQuery.close();
                    return 2;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                    return 2;
                }
            } catch (Exception unused) {
                if (0 != 0) {
                    cursor.close();
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        }
        return 2;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m49002(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getApplicationContext().getPackageName(), 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.applicationInfo.loadLabel(packageManager).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }
}
