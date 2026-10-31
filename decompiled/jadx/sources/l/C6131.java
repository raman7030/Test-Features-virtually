package l;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ۛܶ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E734 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6131 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final String[] f18769 = {"name", Name.LENGTH, "last_touch_timestamp"};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20744 f18770;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f18771;

    public C6131(C20744 c20744) {
        this.f18770 = c20744;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17052(long j) {
        C20744 c20744 = this.f18770;
        try {
            String hexString = Long.toHexString(j);
            this.f18771 = "ExoPlayerCacheFileMetadata" + hexString;
            if (C9455.m24300(c20744.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = c20744.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    C9455.m24301(writableDatabase, 2, hexString);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f18771);
                    writableDatabase.execSQL("CREATE TABLE " + this.f18771 + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e) {
            throw new C6632(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17054(String str, long j, long j2) {
        this.f18771.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f18770.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put(Name.LENGTH, Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow(this.f18771, null, contentValues);
        } catch (SQLException e) {
            throw new C6632(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17053(String str) {
        this.f18771.getClass();
        try {
            this.f18770.getWritableDatabase().delete(this.f18771, "name = ?", new String[]{str});
        } catch (SQLException e) {
            throw new C6632(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17055(Set set) {
        this.f18771.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f18770.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f18771, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new C6632(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap m17051() {
        try {
            this.f18771.getClass();
            Cursor cursorQuery = this.f18770.getReadableDatabase().query(this.f18771, f18769, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    string.getClass();
                    map.put(string, new C10365(cursorQuery.getLong(1), cursorQuery.getLong(2)));
                }
                cursorQuery.close();
                return map;
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
        } catch (SQLException e) {
            throw new C6632(e);
        }
    }
}
