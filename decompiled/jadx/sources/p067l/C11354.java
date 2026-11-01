package p067l;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: renamed from: l.ۢ۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: L73P */
/* JADX INFO: loaded from: classes3.dex */
public final class C11354 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f31645 = 0;

    static {
        C18373.m41851("media3.database");
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m26311(SQLiteDatabase sQLiteDatabase, int i, String str) throws C8671 {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i));
            contentValues.put("instance_uid", str);
            contentValues.put("version", (Integer) 1);
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
        } catch (SQLException e) {
            throw new C8671(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m26310(SQLiteDatabase sQLiteDatabase, int i, String str) throws C8671 {
        try {
            String str2 = C5792.f14228;
            if (!(DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{"ExoPlayerVersions"}) > 0)) {
                return -1;
            }
            Cursor cursorQuery = sQLiteDatabase.query("ExoPlayerVersions", new String[]{"version"}, "feature = ? AND instance_uid = ?", new String[]{Integer.toString(i), str}, null, null, null);
            try {
                if (cursorQuery.getCount() != 0) {
                    cursorQuery.moveToNext();
                    int i2 = cursorQuery.getInt(0);
                    cursorQuery.close();
                    return i2;
                }
                cursorQuery.close();
                return -1;
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
            throw new C8671(e);
        } catch (SQLException e) {
            throw new C8671(e);
        }
    }
}
