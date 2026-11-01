package p067l;

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
public final class C8195 {

    /* JADX INFO: renamed from: ܽ */
    public static final String[] f21627 = {"name", Name.LENGTH, "last_touch_timestamp"};

    /* JADX INFO: renamed from: ֫ */
    public final C22083 f21628;

    /* JADX INFO: renamed from: ۧ */
    public String f21629;

    public C8195(C22083 c22083) {
        this.f21628 = c22083;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18983(long j) {
        C22083 c22083 = this.f21628;
        try {
            String hexString = Long.toHexString(j);
            this.f21629 = "ExoPlayerCacheFileMetadata" + hexString;
            if (C11354.m26310(c22083.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = c22083.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    C11354.m26311(writableDatabase, 2, hexString);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f21629);
                    writableDatabase.execSQL("CREATE TABLE " + this.f21629 + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e) {
            throw new C8671(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18985(String str, long j, long j2) {
        this.f21629.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f21628.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put(Name.LENGTH, Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow(this.f21629, null, contentValues);
        } catch (SQLException e) {
            throw new C8671(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18984(String str) {
        this.f21629.getClass();
        try {
            this.f21628.getWritableDatabase().delete(this.f21629, "name = ?", new String[]{str});
        } catch (SQLException e) {
            throw new C8671(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18986(Set set) {
        this.f21629.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f21628.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f21629, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new C8671(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final HashMap m18982() {
        try {
            this.f21629.getClass();
            Cursor cursorQuery = this.f21628.getReadableDatabase().query(this.f21629, f21627, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    string.getClass();
                    map.put(string, new C12219(cursorQuery.getLong(1), cursorQuery.getLong(2)));
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
            throw new C8671(e);
        }
    }
}
