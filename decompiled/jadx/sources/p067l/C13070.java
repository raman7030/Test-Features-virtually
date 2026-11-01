package p067l;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧ᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z754 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13070 implements InterfaceC19775 {

    /* JADX INFO: renamed from: ܿ */
    public static final String[] f36746 = {"id", "key", "metadata"};

    /* JADX INFO: renamed from: ֫ */
    public final C22083 f36747;

    /* JADX INFO: renamed from: ۧ */
    public String f36748;

    /* JADX INFO: renamed from: ܽ */
    public final SparseArray f36749 = new SparseArray();

    /* JADX INFO: renamed from: ᩳ */
    public String f36750;

    public C13070(C22083 c22083) {
        this.f36747 = c22083;
    }

    @Override // p067l.InterfaceC19775
    /* JADX INFO: renamed from: ֫ */
    public final void mo29928(long j) {
        String hexString = Long.toHexString(j);
        this.f36748 = hexString;
        this.f36750 = C21466.m48631("ExoPlayerCacheIndex", hexString);
    }

    @Override // p067l.InterfaceC19775
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo29933() throws C8671 {
        try {
            SQLiteDatabase readableDatabase = this.f36747.getReadableDatabase();
            String str = this.f36748;
            str.getClass();
            return C11354.m26310(readableDatabase, 1, str) != -1;
        } catch (SQLException e) {
            throw new C8671(e);
        }
    }

    @Override // p067l.InterfaceC19775
    public final void delete() throws C8671 {
        C22083 c22083 = this.f36747;
        String str = this.f36748;
        str.getClass();
        try {
            String strConcat = "ExoPlayerCacheIndex".concat(str);
            SQLiteDatabase writableDatabase = c22083.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                int i = C11354.f31645;
                try {
                    String str2 = C5792.f14228;
                    if (DatabaseUtils.queryNumEntries(writableDatabase, "sqlite_master", "tbl_name = ?", new String[]{"ExoPlayerVersions"}) > 0) {
                        writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                    }
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + strConcat);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (SQLException e) {
                    throw new C8671(e);
                }
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e2) {
            throw new C8671(e2);
        }
    }

    @Override // p067l.InterfaceC19775
    /* JADX INFO: renamed from: ֫ */
    public final void mo29930(HashMap map, SparseArray sparseArray) throws C8671 {
        C22083 c22083 = this.f36747;
        C23877.m52960(this.f36749.size() == 0);
        try {
            SQLiteDatabase readableDatabase = c22083.getReadableDatabase();
            String str = this.f36748;
            str.getClass();
            if (C11354.m26310(readableDatabase, 1, str) != 1) {
                SQLiteDatabase writableDatabase = c22083.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    m29926(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            SQLiteDatabase readableDatabase2 = c22083.getReadableDatabase();
            String str2 = this.f36750;
            str2.getClass();
            Cursor cursorQuery = readableDatabase2.query(str2, f36746, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    int i = cursorQuery.getInt(0);
                    String string = cursorQuery.getString(1);
                    string.getClass();
                    map.put(string, new C4352(i, string, C19104.m43403(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2))))));
                    sparseArray.put(i, string);
                } catch (Throwable th2) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
            cursorQuery.close();
        } catch (SQLiteException e) {
            map.clear();
            sparseArray.clear();
            throw new C8671(e);
        }
    }

    @Override // p067l.InterfaceC19775
    /* JADX INFO: renamed from: ۧ */
    public final void mo29934(HashMap map) throws C8671 {
        try {
            SQLiteDatabase writableDatabase = this.f36747.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                m29926(writableDatabase);
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    m29927(writableDatabase, (C4352) it.next());
                }
                writableDatabase.setTransactionSuccessful();
                this.f36749.clear();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new C8671(e);
        }
    }

    @Override // p067l.InterfaceC19775
    /* JADX INFO: renamed from: ֫ */
    public final void mo29929(HashMap map) throws C8671 {
        SparseArray sparseArray = this.f36749;
        if (sparseArray.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = this.f36747.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i = 0; i < sparseArray.size(); i++) {
                try {
                    C4352 c4352 = (C4352) sparseArray.valueAt(i);
                    if (c4352 == null) {
                        int iKeyAt = sparseArray.keyAt(i);
                        String str = this.f36750;
                        str.getClass();
                        writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                    } else {
                        m29927(writableDatabase, c4352);
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            writableDatabase.setTransactionSuccessful();
            sparseArray.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new C8671(e);
        }
    }

    @Override // p067l.InterfaceC19775
    /* JADX INFO: renamed from: ֫ */
    public final void mo29931(C4352 c4352) {
        this.f36749.put(c4352.f9744, c4352);
    }

    @Override // p067l.InterfaceC19775
    /* JADX INFO: renamed from: ֫ */
    public final void mo29932(C4352 c4352, boolean z) {
        int i = c4352.f9744;
        SparseArray sparseArray = this.f36749;
        if (z) {
            sparseArray.delete(i);
        } else {
            sparseArray.put(i, null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m29926(SQLiteDatabase sQLiteDatabase) throws C8671 {
        String str = this.f36748;
        str.getClass();
        C11354.m26311(sQLiteDatabase, 1, str);
        String str2 = this.f36750;
        str2.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
        sQLiteDatabase.execSQL("CREATE TABLE " + this.f36750 + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }

    /* JADX INFO: renamed from: ֫ */
    private void m29927(SQLiteDatabase sQLiteDatabase, C4352 c4352) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C19104.m43404(c4352.m8985(), new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(c4352.f9744));
        contentValues.put("key", c4352.f9745);
        contentValues.put("metadata", byteArray);
        String str = this.f36750;
        str.getClass();
        sQLiteDatabase.replaceOrThrow(str, null, contentValues);
    }
}
