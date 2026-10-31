package com.umeng.analytics.pro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: O4N1 */
/* JADX INFO: loaded from: classes.dex */
public class i {
    public static final int a = 2049;
    public static final int b = 2050;
    public static final int c = 1000;
    public static Context d = null;
    public static String e = null;
    public static final String f = "umeng+";
    public static final String g = "ek__id";
    public static final String h = "ek_key";
    public List i;
    public List j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f77935l;

    /* JADX INFO: compiled from: O4N1 */
    public enum a {
        AUTOPAGE,
        PAGE,
        BEGIN,
        END,
        NEWSESSION,
        INSTANTSESSIONBEGIN
    }

    /* JADX INFO: compiled from: O4N1 */
    public class b {
        public static final i a = new i();
    }

    public i() {
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = null;
        this.f77935l = new ArrayList();
    }

    public static i a(Context context) {
        i iVar = b.a;
        if (d == null && context != null) {
            d = context.getApplicationContext();
            iVar.k();
        }
        return iVar;
    }

    private void k() {
        synchronized (this) {
            l();
            this.i.clear();
            this.f77935l.clear();
            this.j.clear();
        }
    }

    private Cursor a(String str, SQLiteDatabase sQLiteDatabase, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        if (sQLiteDatabase == null) {
            return null;
        }
        try {
            if (sQLiteDatabase.isOpen()) {
                return sQLiteDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void a() {
        this.i.clear();
    }

    public void b() {
        this.f77935l.clear();
    }

    public boolean c() {
        return this.f77935l.isEmpty();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0099, code lost:
    
        if (r2 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a1, code lost:
    
        if (r2 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a3, code lost:
    
        r2.endTransaction();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(JSONArray jSONArray) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseA = g.a(d).a();
                try {
                    try {
                        sQLiteDatabaseA.beginTransaction();
                        for (int i = 0; i < jSONArray.length(); i++) {
                            try {
                                JSONObject jSONObject = jSONArray.getJSONObject(i);
                                ContentValues contentValues = new ContentValues();
                                String strOptString = jSONObject.optString("__i");
                                if (TextUtils.isEmpty(strOptString) || "-1".equals(strOptString)) {
                                    strOptString = u.a().b();
                                    if (TextUtils.isEmpty(strOptString)) {
                                        strOptString = "-1";
                                    }
                                }
                                contentValues.put("__i", strOptString);
                                contentValues.put("__e", jSONObject.optString("id"));
                                contentValues.put("__t", Integer.valueOf(jSONObject.optInt("__t")));
                                contentValues.put("__av", UMUtils.getAppVersionName(d));
                                contentValues.put("__vc", UMUtils.getAppVersionCode(d));
                                jSONObject.remove("__i");
                                jSONObject.remove("__t");
                                contentValues.put("__s", c(jSONObject.toString()));
                                sQLiteDatabaseA.insert(e.b.a, null, contentValues);
                            } catch (Exception unused) {
                            }
                        }
                        sQLiteDatabaseA.setTransactionSuccessful();
                        sQLiteDatabaseA.endTransaction();
                    } catch (SQLiteDatabaseCorruptException unused2) {
                        sQLiteDatabase = sQLiteDatabaseA;
                        try {
                            h.a(d);
                        } finally {
                            if (sQLiteDatabase != null) {
                                try {
                                    sQLiteDatabase.endTransaction();
                                } catch (Throwable unused3) {
                                }
                            }
                            g.a(d).b();
                        }
                    }
                } catch (Throwable unused4) {
                    sQLiteDatabase = sQLiteDatabaseA;
                }
            } catch (Throwable unused5) {
            }
        } catch (SQLiteDatabaseCorruptException unused6) {
        } catch (Throwable unused7) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        if (r0 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        if (r0 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        r0.endTransaction();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(String str, String str2, int i) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseA = g.a(d).a();
                try {
                    sQLiteDatabaseA.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("__i", str);
                    String strC = c(str2);
                    if (!TextUtils.isEmpty(strC)) {
                        contentValues.put("__a", strC);
                        contentValues.put("__t", Integer.valueOf(i));
                        contentValues.put("__av", UMUtils.getAppVersionName(d));
                        contentValues.put("__vc", UMUtils.getAppVersionCode(d));
                        sQLiteDatabaseA.insert(e.a.a, null, contentValues);
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                    sQLiteDatabaseA.endTransaction();
                } catch (SQLiteDatabaseCorruptException unused) {
                    sQLiteDatabase = sQLiteDatabaseA;
                    try {
                        h.a(d);
                    } finally {
                        if (sQLiteDatabase != null) {
                            try {
                                sQLiteDatabase.endTransaction();
                            } catch (Throwable unused2) {
                            }
                        }
                        g.a(d).b();
                    }
                } catch (Throwable unused3) {
                    sQLiteDatabase = sQLiteDatabaseA;
                }
            } catch (Throwable unused4) {
            }
        } catch (SQLiteDatabaseCorruptException unused5) {
        } catch (Throwable unused6) {
        }
        return false;
    }

    public void d() {
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            try {
                try {
                    sQLiteDatabaseA = g.a(d).a();
                    sQLiteDatabaseA.beginTransaction();
                    String strC = u.a().c();
                    if (!TextUtils.isEmpty(strC)) {
                        String[] strArr = {"", "-1"};
                        for (int i = 0; i < 2; i++) {
                            sQLiteDatabaseA.execSQL("update __et set __i=\"" + strC + "\" where __i=\"" + strArr[i] + "\"");
                        }
                        sQLiteDatabaseA.setTransactionSuccessful();
                    } else {
                        try {
                            sQLiteDatabaseA.endTransaction();
                        } catch (Throwable unused) {
                        }
                        g.a(d).b();
                    }
                } finally {
                    if (sQLiteDatabaseA != null) {
                        try {
                            sQLiteDatabaseA.endTransaction();
                        } catch (Throwable unused2) {
                        }
                    }
                    g.a(d).b();
                }
            } catch (SQLiteDatabaseCorruptException unused3) {
                h.a(d);
            } catch (Throwable unused4) {
                if (sQLiteDatabaseA != null) {
                }
            }
        } catch (Throwable unused5) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
    
        if (r2 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
    
        if (r2 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        r2.endTransaction();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(String str, JSONObject jSONObject, a aVar) {
        if (jSONObject == null) {
            return false;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseA = g.a(d).a();
                try {
                    sQLiteDatabaseA.beginTransaction();
                    if (aVar == a.BEGIN) {
                        long jLongValue = ((Long) jSONObject.opt("__e")).longValue();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("__ii", str);
                        contentValues.put("__e", String.valueOf(jLongValue));
                        contentValues.put("__av", UMUtils.getAppVersionName(d));
                        contentValues.put("__vc", UMUtils.getAppVersionCode(d));
                        sQLiteDatabaseA.insert(e.d.a, null, contentValues);
                    } else if (aVar == a.INSTANTSESSIONBEGIN) {
                        b(str, jSONObject, sQLiteDatabaseA);
                    } else if (aVar == a.END) {
                        a(str, jSONObject, sQLiteDatabaseA);
                    } else if (aVar == a.PAGE) {
                        a(str, jSONObject, sQLiteDatabaseA, "__a");
                    } else if (aVar == a.AUTOPAGE) {
                        a(str, jSONObject, sQLiteDatabaseA, e.d.a.c);
                    } else if (aVar == a.NEWSESSION) {
                        c(str, jSONObject, sQLiteDatabaseA);
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                    sQLiteDatabaseA.endTransaction();
                } catch (SQLiteDatabaseCorruptException unused) {
                    sQLiteDatabase = sQLiteDatabaseA;
                    try {
                        h.a(d);
                    } finally {
                        if (sQLiteDatabase != null) {
                            try {
                                sQLiteDatabase.endTransaction();
                            } catch (Throwable unused2) {
                            }
                        }
                        g.a(d).b();
                    }
                } catch (Throwable unused3) {
                    sQLiteDatabase = sQLiteDatabaseA;
                }
            } catch (Throwable unused4) {
            }
        } catch (SQLiteDatabaseCorruptException unused5) {
        } catch (Throwable unused6) {
        }
        return false;
    }

    private void a(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        try {
            long jLongValue = ((Long) jSONObject.opt(e.d.a.g)).longValue();
            Object objOpt = jSONObject.opt(e.d.a.h);
            long jLongValue2 = (objOpt == null || !(objOpt instanceof Long)) ? 0L : ((Long) objOpt).longValue();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("__sp");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("__pp");
            String strC = "";
            String strC2 = (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() <= 0) ? "" : c(jSONObjectOptJSONObject.toString());
            if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.length() > 0) {
                strC = c(jSONObjectOptJSONObject2.toString());
            }
            sQLiteDatabase.execSQL("update __sd set __f=\"" + jLongValue + "\", __g=\"" + jLongValue2 + "\", __sp=\"" + strC2 + "\", __pp=\"" + strC + "\" where __ii=\"" + str + "\"");
        } catch (Throwable unused) {
        }
    }

    private void b(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        try {
            long jLongValue = ((Long) jSONObject.get("__e")).longValue();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("__sp");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("__pp");
            String strC = "";
            String strC2 = (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() <= 0) ? "" : c(jSONObjectOptJSONObject.toString());
            if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.length() > 0) {
                strC = c(jSONObjectOptJSONObject2.toString());
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("__ii", str);
            contentValues.put("__e", String.valueOf(jLongValue));
            contentValues.put("__sp", strC2);
            contentValues.put("__pp", strC);
            contentValues.put("__av", UMGlobalContext.getInstance(d).getAppVersion());
            contentValues.put("__vc", UMUtils.getAppVersionCode(d));
            sQLiteDatabase.insert(e.c.a, null, contentValues);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0049 A[Catch: Exception -> 0x004c, TRY_LEAVE, TryCatch #1 {Exception -> 0x004c, blocks: (B:17:0x0044, B:19:0x0049), top: B:31:0x0044 }] */
    public long a(String str) throws Throwable {
        SQLiteDatabase sQLiteDatabaseA;
        Cursor cursorA = null;
        long j = 0;
        try {
            try {
                sQLiteDatabaseA = g.a(d).a();
                try {
                    sQLiteDatabaseA.beginTransaction();
                    cursorA = a(e.d.a, sQLiteDatabaseA, new String[]{e.d.a.g}, "__ii=? ", new String[]{str}, null, null, null, null);
                    if (cursorA != null) {
                        cursorA.moveToFirst();
                        j = cursorA.getLong(cursorA.getColumnIndex(e.d.a.g));
                    }
                    if (cursorA != null) {
                        cursorA.close();
                    }
                } catch (Exception unused) {
                    if (cursorA != null) {
                        cursorA.close();
                    }
                    if (sQLiteDatabaseA != null) {
                    }
                    g.a(d).b();
                    return j;
                } catch (Throwable th) {
                    th = th;
                    if (cursorA != null) {
                        try {
                            cursorA.close();
                            if (sQLiteDatabaseA != null) {
                                sQLiteDatabaseA.endTransaction();
                            }
                        } catch (Exception unused2) {
                            g.a(d).b();
                            throw th;
                        }
                    } else if (sQLiteDatabaseA != null) {
                        sQLiteDatabaseA.endTransaction();
                    }
                    g.a(d).b();
                    throw th;
                }
            } catch (Exception unused3) {
            }
        } catch (Exception unused4) {
            sQLiteDatabaseA = null;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabaseA = null;
        }
        sQLiteDatabaseA.endTransaction();
        g.a(d).b();
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0115  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    private void c(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        Cursor cursor;
        JSONObject jSONObject2;
        String str2;
        Cursor cursor2;
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(e.d.a.e);
            if (jSONObjectOptJSONObject != null) {
                jSONObject2 = jSONObjectOptJSONObject;
                Cursor cursorA = a(e.d.a, sQLiteDatabase, new String[]{e.d.a.e}, "__ii=? ", new String[]{str}, null, null, null, null);
                if (cursorA != null) {
                    String strD = null;
                    while (cursorA.moveToNext()) {
                        try {
                            strD = d(cursorA.getString(cursorA.getColumnIndex(e.d.a.e)));
                        } catch (Throwable unused) {
                            cursor = cursorA;
                            if (cursor != null) {
                                cursor.close();
                                return;
                            }
                            return;
                        }
                    }
                    String str3 = strD;
                    cursor2 = cursorA;
                    str2 = str3;
                } else {
                    cursor2 = cursorA;
                    str2 = null;
                }
            } else {
                jSONObject2 = jSONObjectOptJSONObject;
                str2 = null;
                cursor2 = null;
            }
            if (jSONObject2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    if (!TextUtils.isEmpty(str2)) {
                        jSONArray = new JSONArray(str2);
                    }
                    jSONArray.put(jSONObject2);
                    String strC = c(jSONArray.toString());
                    if (!TextUtils.isEmpty(strC)) {
                        sQLiteDatabase.execSQL("update  __sd set __d=\"" + strC + "\" where __ii=\"" + str + "\"");
                    }
                } catch (Throwable unused2) {
                    cursor = cursor2;
                    if (cursor != null) {
                        cursor.close();
                        return;
                    }
                    return;
                }
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(e.d.a.d);
            if (jSONObjectOptJSONObject2 != null) {
                String strC2 = c(jSONObjectOptJSONObject2.toString());
                if (!TextUtils.isEmpty(strC2)) {
                    sQLiteDatabase.execSQL("update  __sd set __c=\"" + strC2 + "\" where __ii=\"" + str + "\"");
                }
            }
            sQLiteDatabase.execSQL("update  __sd set __f=\"" + String.valueOf(jSONObject.optLong(e.d.a.g)) + "\" where __ii=\"" + str + "\"");
            if (cursor2 != null) {
                cursor2.close();
            }
        } catch (Throwable unused3) {
            cursor = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0056 A[Catch: all -> 0x00db, LOOP:1: B:53:0x0050->B:23:0x0056, LOOP_END, TryCatch #1 {all -> 0x00db, blocks: (B:21:0x0050, B:23:0x0056, B:24:0x0063, B:26:0x006e, B:27:0x0073, B:34:0x0082, B:36:0x0088, B:38:0x008e, B:40:0x0094, B:42:0x00a2, B:39:0x0091), top: B:53:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x006e A[Catch: all -> 0x00db, TryCatch #1 {all -> 0x00db, blocks: (B:21:0x0050, B:23:0x0056, B:24:0x0063, B:26:0x006e, B:27:0x0073, B:34:0x0082, B:36:0x0088, B:38:0x008e, B:40:0x0094, B:42:0x00a2, B:39:0x0091), top: B:53:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x007d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0081  */
    /* JADX WARN: Code duplicated, block: B:38:0x008e A[Catch: all -> 0x00db, TRY_ENTER, TryCatch #1 {all -> 0x00db, blocks: (B:21:0x0050, B:23:0x0056, B:24:0x0063, B:26:0x006e, B:27:0x0073, B:34:0x0082, B:36:0x0088, B:38:0x008e, B:40:0x0094, B:42:0x00a2, B:39:0x0091), top: B:53:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a2 A[Catch: all -> 0x00db, TRY_LEAVE, TryCatch #1 {all -> 0x00db, blocks: (B:21:0x0050, B:23:0x0056, B:24:0x0063, B:26:0x006e, B:27:0x0073, B:34:0x0082, B:36:0x0088, B:38:0x008e, B:40:0x0094, B:42:0x00a2, B:39:0x0091), top: B:53:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0050 A[EXC_TOP_SPLITTER, LOOP:1: B:53:0x0050->B:23:0x0056, LOOP_START, PHI: r13
      0x0050: PHI (r13v2 java.lang.String) = (r13v7 java.lang.String), (r13v3 java.lang.String) binds: [B:20:0x004e, B:23:0x0056] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x00a2, please report this as an issue */
    private void a(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase, String str2) {
        JSONArray jSONArray;
        JSONArray jSONArrayOptJSONArray;
        Cursor cursorA;
        JSONArray jSONArray2;
        int i;
        String strC;
        JSONObject jSONObject2;
        Cursor cursor = null;
        strD = null;
        String strD = null;
        try {
            if ("__a".equals(str2)) {
                jSONArrayOptJSONArray = jSONObject.optJSONArray("__a");
                if (jSONArrayOptJSONArray == null) {
                    return;
                }
                if (jSONArrayOptJSONArray.length() <= 0) {
                    return;
                }
            } else {
                if (e.d.a.c.equals(str2)) {
                    jSONArrayOptJSONArray = jSONObject.optJSONArray(e.d.a.c);
                    if (jSONArrayOptJSONArray == null) {
                        return;
                    }
                    if (jSONArrayOptJSONArray.length() <= 0) {
                        return;
                    }
                } else {
                    jSONArray = null;
                }
                cursorA = a(e.d.a, sQLiteDatabase, new String[]{str2}, "__ii=? ", new String[]{str}, null, null, null, null);
                if (cursorA != null) {
                    while (cursorA.moveToNext()) {
                        try {
                            strD = d(cursorA.getString(cursorA.getColumnIndex(str2)));
                        } catch (Throwable unused) {
                            cursor = cursorA;
                            if (cursor != null) {
                                cursor.close();
                                return;
                            }
                            return;
                        }
                    }
                }
                jSONArray2 = new JSONArray();
                if (!TextUtils.isEmpty(strD)) {
                    jSONArray2 = new JSONArray(strD);
                }
                if (jSONArray2.length() > 1000) {
                    if (cursorA != null) {
                        cursorA.close();
                        return;
                    }
                    return;
                }
                for (i = 0; i < jSONArray.length(); i++) {
                    try {
                        jSONObject2 = jSONArray.getJSONObject(i);
                        if (jSONObject2 != null) {
                            jSONArray2.put(jSONObject2);
                        }
                    } catch (JSONException unused2) {
                    }
                }
                strC = c(jSONArray2.toString());
                if (!TextUtils.isEmpty(strC)) {
                    sQLiteDatabase.execSQL("update __sd set " + str2 + "=\"" + strC + "\" where __ii=\"" + str + "\"");
                }
                if (cursorA != null) {
                    cursorA.close();
                }
            }
            jSONArray = jSONArrayOptJSONArray;
            cursorA = a(e.d.a, sQLiteDatabase, new String[]{str2}, "__ii=? ", new String[]{str}, null, null, null, null);
            if (cursorA != null) {
                while (cursorA.moveToNext()) {
                    strD = d(cursorA.getString(cursorA.getColumnIndex(str2)));
                }
            }
            jSONArray2 = new JSONArray();
            if (!TextUtils.isEmpty(strD)) {
                jSONArray2 = new JSONArray(strD);
            }
            if (jSONArray2.length() > 1000) {
                if (cursorA != null) {
                    cursorA.close();
                    return;
                }
                return;
            }
            while (i < jSONArray.length()) {
                jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null) {
                    jSONArray2.put(jSONObject2);
                }
            }
            strC = c(jSONArray2.toString());
            if (!TextUtils.isEmpty(strC)) {
                sQLiteDatabase.execSQL("update __sd set " + str2 + "=\"" + strC + "\" where __ii=\"" + str + "\"");
            }
            if (cursorA != null) {
                cursorA.close();
            }
        } catch (Throwable unused3) {
        }
    }

    public boolean e() {
        return this.i.isEmpty();
    }

    public JSONObject a(boolean z) {
        a();
        this.j.clear();
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            a(jSONObject, z);
            b(jSONObject, (String) null);
            a(jSONObject, (String) null);
            return jSONObject;
        }
        String strA = a(jSONObject, z);
        if (!TextUtils.isEmpty(strA)) {
            b(jSONObject, strA);
            a(jSONObject, strA);
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0065  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090 A[EXC_TOP_SPLITTER, PHI: r0 r2
      0x0090: PHI (r0v4 org.json.JSONObject) = (r0v3 org.json.JSONObject), (r0v6 org.json.JSONObject) binds: [B:27:0x007d, B:34:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r2v5 android.database.sqlite.SQLiteDatabase) = (r2v4 android.database.sqlite.SQLiteDatabase), (r2v6 android.database.sqlite.SQLiteDatabase) binds: [B:27:0x007d, B:34:0x008e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public JSONObject f() {
        JSONObject jSONObject;
        SQLiteDatabase sQLiteDatabaseA;
        Cursor cursor = null;
        jSONObject = null;
        jSONObject = null;
        jSONObject = null;
        JSONObject jSONObject2 = null;
        cursor = null;
        cursor = null;
        Cursor cursor2 = null;
        if (this.f77935l.isEmpty()) {
            return null;
        }
        try {
            sQLiteDatabaseA = g.a(d).a();
            try {
                sQLiteDatabaseA.beginTransaction();
                Cursor cursorA = a(e.c.a, sQLiteDatabaseA, null, "__ii=? ", new String[]{(String) this.f77935l.get(0)}, null, null, null, null);
                if (cursorA != null) {
                    try {
                        if (cursorA.moveToNext()) {
                            JSONObject jSONObject3 = new JSONObject();
                            try {
                                String string = cursorA.getString(cursorA.getColumnIndex("__av"));
                                String string2 = cursorA.getString(cursorA.getColumnIndex("__vc"));
                                jSONObject3.put("__av", string);
                                jSONObject3.put("__vc", string2);
                                jSONObject2 = jSONObject3;
                            } catch (SQLiteDatabaseCorruptException unused) {
                                jSONObject2 = jSONObject3;
                                jSONObject = jSONObject2;
                                cursor2 = cursorA;
                                try {
                                    h.a(d);
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    if (sQLiteDatabaseA != null) {
                                        try {
                                            sQLiteDatabaseA.endTransaction();
                                        } catch (Throwable unused2) {
                                        }
                                    }
                                    jSONObject2 = jSONObject;
                                } finally {
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    if (sQLiteDatabaseA != null) {
                                        try {
                                            sQLiteDatabaseA.endTransaction();
                                        } catch (Throwable unused3) {
                                        }
                                    }
                                    g.a(d).b();
                                }
                            } catch (Throwable unused4) {
                                jSONObject2 = jSONObject3;
                                jSONObject = jSONObject2;
                                cursor = cursorA;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (sQLiteDatabaseA != null) {
                                    sQLiteDatabaseA.endTransaction();
                                }
                                jSONObject2 = jSONObject;
                            }
                        }
                        sQLiteDatabaseA.setTransactionSuccessful();
                        if (cursorA != null) {
                            cursorA.close();
                        }
                        try {
                            sQLiteDatabaseA.endTransaction();
                        } catch (Throwable unused5) {
                        }
                    } catch (SQLiteDatabaseCorruptException unused6) {
                    } catch (Throwable unused7) {
                    }
                } else {
                    sQLiteDatabaseA.setTransactionSuccessful();
                    if (cursorA != null) {
                        cursorA.close();
                    }
                    sQLiteDatabaseA.endTransaction();
                }
            } catch (SQLiteDatabaseCorruptException unused8) {
                jSONObject = null;
            } catch (Throwable unused9) {
                jSONObject = null;
            }
        } catch (SQLiteDatabaseCorruptException unused10) {
            jSONObject = null;
            sQLiteDatabaseA = null;
        } catch (Throwable unused11) {
            jSONObject = null;
            sQLiteDatabaseA = null;
        }
        return jSONObject2;
    }

    public JSONObject b(boolean z) {
        JSONObject jSONObject = new JSONObject();
        b(jSONObject, z);
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x016f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r13v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r2v2, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, org.json.JSONArray] */
    private void a(JSONObject jSONObject, String str) {
        SQLiteDatabase sQLiteDatabaseA;
        ?? length = 0;
        length = 0;
        length = 0;
        length = 0;
        length = 0;
        length = 0;
        try {
            try {
                sQLiteDatabaseA = g.a(d).a();
                try {
                    sQLiteDatabaseA.beginTransaction();
                    Cursor cursorA = !TextUtils.isEmpty(str) ? a(e.b.a, sQLiteDatabaseA, null, "__i=? ", new String[]{str}, null, null, null, null) : a(e.b.a, sQLiteDatabaseA, null, null, null, null, null, null, null);
                    if (cursorA != null) {
                        try {
                            ?? jSONObject2 = new JSONObject();
                            ?? jSONObject3 = new JSONObject();
                            String strB = u.a().b();
                            while (cursorA.moveToNext()) {
                                int i = cursorA.getInt(cursorA.getColumnIndex("__t"));
                                String string = cursorA.getString(cursorA.getColumnIndex("__i"));
                                String string2 = cursorA.getString(cursorA.getColumnIndex("__s"));
                                if (TextUtils.isEmpty(string) || "-1".equals(string)) {
                                    if (!TextUtils.isEmpty(strB)) {
                                        string = strB;
                                    }
                                }
                                this.j.add(Integer.valueOf(cursorA.getInt(0)));
                                if (i != 2049) {
                                    if (i == 2050 && !TextUtils.isEmpty(string2)) {
                                        JSONObject jSONObject4 = new JSONObject(d(string2));
                                        JSONArray jSONArrayOptJSONArray = jSONObject3.has(string) ? jSONObject3.optJSONArray(string) : new JSONArray();
                                        jSONArrayOptJSONArray.put(jSONObject4);
                                        jSONObject3.put(string, jSONArrayOptJSONArray);
                                    }
                                } else if (!TextUtils.isEmpty(string2)) {
                                    JSONObject jSONObject5 = new JSONObject(d(string2));
                                    JSONArray jSONArrayOptJSONArray2 = jSONObject2.has(string) ? jSONObject2.optJSONArray(string) : new JSONArray();
                                    jSONArrayOptJSONArray2.put(jSONObject5);
                                    jSONObject2.put(string, jSONArrayOptJSONArray2);
                                }
                            }
                            if (jSONObject2.length() > 0) {
                                ?? jSONArray = new JSONArray();
                                Iterator<String> itKeys = jSONObject2.keys();
                                while (itKeys.hasNext()) {
                                    JSONObject jSONObject6 = new JSONObject();
                                    String next = itKeys.next();
                                    jSONObject6.put(next, new JSONArray(jSONObject2.optString(next)));
                                    if (jSONObject6.length() > 0) {
                                        jSONArray.put(jSONObject6);
                                    }
                                }
                                if (jSONArray.length() > 0) {
                                    jSONObject.put("ekv", jSONArray);
                                }
                            }
                            length = jSONObject3.length();
                            if (length > 0) {
                                length = new JSONArray();
                                Iterator<String> itKeys2 = jSONObject3.keys();
                                while (itKeys2.hasNext()) {
                                    JSONObject jSONObject7 = new JSONObject();
                                    String next2 = itKeys2.next();
                                    jSONObject7.put(next2, new JSONArray(jSONObject3.optString(next2)));
                                    if (jSONObject7.length() > 0) {
                                        length.put(jSONObject7);
                                    }
                                }
                                if (length.length() > 0) {
                                    jSONObject.put(d.T, length);
                                }
                            }
                            sQLiteDatabaseA.setTransactionSuccessful();
                            if (cursorA != null) {
                                cursorA.close();
                            }
                        } catch (SQLiteDatabaseCorruptException unused) {
                            length = cursorA;
                            h.a(d);
                            if (length != 0) {
                                length.close();
                            }
                            if (sQLiteDatabaseA != null) {
                            }
                            g.a(d).b();
                        } catch (Throwable unused2) {
                            length = cursorA;
                            h.a(d);
                            if (length != 0) {
                                length.close();
                            }
                            if (sQLiteDatabaseA != null) {
                            }
                            g.a(d).b();
                        }
                    } else {
                        sQLiteDatabaseA.setTransactionSuccessful();
                        if (cursorA != null) {
                            cursorA.close();
                        }
                    }
                } catch (SQLiteDatabaseCorruptException unused3) {
                } catch (Throwable unused4) {
                }
            } catch (Throwable th) {
                if (length != 0) {
                    length.close();
                }
                if (sQLiteDatabaseA != null) {
                    try {
                        sQLiteDatabaseA.endTransaction();
                    } catch (Throwable unused5) {
                    }
                }
                g.a(d).b();
                throw th;
            }
        } catch (SQLiteDatabaseCorruptException unused6) {
            sQLiteDatabaseA = null;
        } catch (Throwable unused7) {
            sQLiteDatabaseA = null;
        }
        try {
            sQLiteDatabaseA.endTransaction();
        } catch (Throwable unused8) {
        }
        g.a(d).b();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0071  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [org.json.JSONObject] */
    private void b(JSONObject jSONObject, String str) {
        SQLiteDatabase sQLiteDatabaseA;
        ?? jSONArray = 0;
        jSONArray = 0;
        jSONArray = 0;
        jSONArray = 0;
        jSONArray = 0;
        jSONArray = 0;
        try {
            try {
                sQLiteDatabaseA = g.a(d).a();
                try {
                    sQLiteDatabaseA.beginTransaction();
                    Cursor cursorA = !TextUtils.isEmpty(str) ? a(e.a.a, sQLiteDatabaseA, null, "__i=? ", new String[]{str}, null, null, null, null) : a(e.a.a, sQLiteDatabaseA, null, null, null, null, null, null, null);
                    if (cursorA != null) {
                        try {
                            jSONArray = new JSONArray();
                            while (cursorA.moveToNext()) {
                                String string = cursorA.getString(cursorA.getColumnIndex("__a"));
                                if (!TextUtils.isEmpty(string)) {
                                    jSONArray.put(new JSONObject(d(string)));
                                }
                            }
                            if (jSONArray.length() > 0) {
                                jSONObject.put(d.O, jSONArray);
                            }
                            sQLiteDatabaseA.setTransactionSuccessful();
                            if (cursorA != null) {
                                cursorA.close();
                            }
                        } catch (SQLiteDatabaseCorruptException unused) {
                            jSONArray = cursorA;
                            h.a(d);
                            if (jSONArray != 0) {
                                jSONArray.close();
                            }
                            if (sQLiteDatabaseA != null) {
                            }
                            g.a(d).b();
                        } catch (Throwable unused2) {
                            jSONArray = cursorA;
                            h.a(d);
                            if (jSONArray != 0) {
                                jSONArray.close();
                            }
                            if (sQLiteDatabaseA != null) {
                            }
                            g.a(d).b();
                        }
                    } else {
                        sQLiteDatabaseA.setTransactionSuccessful();
                        if (cursorA != null) {
                            cursorA.close();
                        }
                    }
                } catch (SQLiteDatabaseCorruptException unused3) {
                } catch (Throwable unused4) {
                }
            } catch (Throwable th) {
                if (jSONArray != 0) {
                    jSONArray.close();
                }
                if (sQLiteDatabaseA != null) {
                    try {
                        sQLiteDatabaseA.endTransaction();
                    } catch (Throwable unused5) {
                    }
                }
                g.a(d).b();
                throw th;
            }
        } catch (SQLiteDatabaseCorruptException unused6) {
            sQLiteDatabaseA = null;
        } catch (Throwable unused7) {
            sQLiteDatabaseA = null;
        }
        try {
            sQLiteDatabaseA.endTransaction();
        } catch (Throwable unused8) {
        }
        g.a(d).b();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0065  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090 A[EXC_TOP_SPLITTER, PHI: r0 r2
      0x0090: PHI (r0v4 org.json.JSONObject) = (r0v3 org.json.JSONObject), (r0v6 org.json.JSONObject) binds: [B:27:0x007d, B:34:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r2v5 android.database.sqlite.SQLiteDatabase) = (r2v4 android.database.sqlite.SQLiteDatabase), (r2v6 android.database.sqlite.SQLiteDatabase) binds: [B:27:0x007d, B:34:0x008e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public JSONObject g() {
        JSONObject jSONObject;
        SQLiteDatabase sQLiteDatabaseA;
        Cursor cursor = null;
        jSONObject = null;
        jSONObject = null;
        jSONObject = null;
        JSONObject jSONObject2 = null;
        cursor = null;
        cursor = null;
        Cursor cursor2 = null;
        if (this.i.isEmpty()) {
            return null;
        }
        try {
            sQLiteDatabaseA = g.a(d).a();
            try {
                sQLiteDatabaseA.beginTransaction();
                Cursor cursorA = a(e.d.a, sQLiteDatabaseA, null, "__ii=? ", new String[]{(String) this.i.get(0)}, null, null, null, null);
                if (cursorA != null) {
                    try {
                        if (cursorA.moveToNext()) {
                            JSONObject jSONObject3 = new JSONObject();
                            try {
                                String string = cursorA.getString(cursorA.getColumnIndex("__av"));
                                String string2 = cursorA.getString(cursorA.getColumnIndex("__vc"));
                                jSONObject3.put("__av", string);
                                jSONObject3.put("__vc", string2);
                                jSONObject2 = jSONObject3;
                            } catch (SQLiteDatabaseCorruptException unused) {
                                jSONObject2 = jSONObject3;
                                jSONObject = jSONObject2;
                                cursor2 = cursorA;
                                try {
                                    h.a(d);
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    if (sQLiteDatabaseA != null) {
                                        try {
                                            sQLiteDatabaseA.endTransaction();
                                        } catch (Throwable unused2) {
                                        }
                                    }
                                    jSONObject2 = jSONObject;
                                } finally {
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    if (sQLiteDatabaseA != null) {
                                        try {
                                            sQLiteDatabaseA.endTransaction();
                                        } catch (Throwable unused3) {
                                        }
                                    }
                                    g.a(d).b();
                                }
                            } catch (Throwable unused4) {
                                jSONObject2 = jSONObject3;
                                jSONObject = jSONObject2;
                                cursor = cursorA;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (sQLiteDatabaseA != null) {
                                    sQLiteDatabaseA.endTransaction();
                                }
                                jSONObject2 = jSONObject;
                            }
                        }
                        sQLiteDatabaseA.setTransactionSuccessful();
                        if (cursorA != null) {
                            cursorA.close();
                        }
                        try {
                            sQLiteDatabaseA.endTransaction();
                        } catch (Throwable unused5) {
                        }
                    } catch (SQLiteDatabaseCorruptException unused6) {
                    } catch (Throwable unused7) {
                    }
                } else {
                    sQLiteDatabaseA.setTransactionSuccessful();
                    if (cursorA != null) {
                        cursorA.close();
                    }
                    sQLiteDatabaseA.endTransaction();
                }
            } catch (SQLiteDatabaseCorruptException unused8) {
                jSONObject = null;
            } catch (Throwable unused9) {
                jSONObject = null;
            }
        } catch (SQLiteDatabaseCorruptException unused10) {
            jSONObject = null;
            sQLiteDatabaseA = null;
        } catch (Throwable unused11) {
            jSONObject = null;
            sQLiteDatabaseA = null;
        }
        return jSONObject2;
    }

    private JSONArray b(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optLong("duration") > 0) {
                jSONArray2.put(jSONObjectOptJSONObject);
            }
        }
        return jSONArray2;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0236 A[EXC_TOP_SPLITTER, PHI: r0 r10 r12
      0x0236: PHI (r0v6 java.lang.String) = (r0v2 java.lang.String), (r0v3 java.lang.String), (r0v37 java.lang.String), (r0v37 java.lang.String) binds: [B:91:0x0225, B:97:0x0234, B:83:0x020f, B:84:0x0211] A[DONT_GENERATE, DONT_INLINE]
      0x0236: PHI (r10v6 android.database.Cursor) = 
      (r10v3 android.database.Cursor)
      (r10v4 android.database.Cursor)
      (r10v34 android.database.Cursor)
      (r10v34 android.database.Cursor)
     binds: [B:91:0x0225, B:97:0x0234, B:83:0x020f, B:84:0x0211] A[DONT_GENERATE, DONT_INLINE]
      0x0236: PHI (r12v6 android.database.sqlite.SQLiteDatabase) = 
      (r12v3 android.database.sqlite.SQLiteDatabase)
      (r12v4 android.database.sqlite.SQLiteDatabase)
      (r12v7 android.database.sqlite.SQLiteDatabase)
      (r12v7 android.database.sqlite.SQLiteDatabase)
     binds: [B:91:0x0225, B:97:0x0234, B:83:0x020f, B:84:0x0211] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0222  */
    /* JADX WARN: Code duplicated, block: B:96:0x0231  */
    private String a(JSONObject jSONObject, boolean z) {
        Cursor cursorA;
        SQLiteDatabase sQLiteDatabaseA;
        JSONArray jSONArray;
        String str;
        String str2 = null;
        try {
            try {
                sQLiteDatabaseA = g.a(d).a();
                try {
                    sQLiteDatabaseA.beginTransaction();
                    cursorA = a(e.d.a, sQLiteDatabaseA, null, null, null, null, null, null, null);
                    if (cursorA != null) {
                        try {
                            JSONArray jSONArray2 = new JSONArray();
                            while (true) {
                                if (!cursorA.moveToNext()) {
                                    cursorA = cursorA;
                                    jSONArray = jSONArray2;
                                    break;
                                }
                                JSONObject jSONObject2 = new JSONObject();
                                String string = cursorA.getString(cursorA.getColumnIndex(e.d.a.g));
                                String string2 = cursorA.getString(cursorA.getColumnIndex("__e"));
                                String string3 = cursorA.getString(cursorA.getColumnIndex(e.d.a.h));
                                String string4 = cursorA.getString(cursorA.getColumnIndex("__ii"));
                                try {
                                    if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                                        str = string4;
                                        cursorA = cursorA;
                                        jSONArray = jSONArray2;
                                    } else {
                                        if (Long.parseLong(string) - Long.parseLong(string2) > 0) {
                                            String string5 = cursorA.getString(cursorA.getColumnIndex("__a"));
                                            String string6 = cursorA.getString(cursorA.getColumnIndex(e.d.a.c));
                                            String string7 = cursorA.getString(cursorA.getColumnIndex(e.d.a.d));
                                            String string8 = cursorA.getString(cursorA.getColumnIndex(e.d.a.e));
                                            this.i.add(string4);
                                            String string9 = cursorA.getString(cursorA.getColumnIndex("__sp"));
                                            String string10 = cursorA.getString(cursorA.getColumnIndex("__pp"));
                                            jSONObject2.put("id", string4);
                                            jSONObject2.put(d.p, string2);
                                            jSONObject2.put(d.q, string);
                                            str = string4;
                                            if (FieldManager.allow(com.umeng.commonsdk.utils.d.E)) {
                                                try {
                                                    if (Long.parseLong(string3) <= 0) {
                                                        jSONObject2.put("duration", Long.parseLong(string) - Long.parseLong(string2));
                                                    } else {
                                                        jSONObject2.put("duration", Long.parseLong(string3));
                                                        jSONObject2.put(d.s, Long.parseLong(string) - Long.parseLong(string2));
                                                    }
                                                } catch (SQLiteDatabaseCorruptException unused) {
                                                    cursorA = cursorA;
                                                    str2 = str;
                                                    h.a(d);
                                                    if (cursorA != null) {
                                                        cursorA.close();
                                                    }
                                                    if (sQLiteDatabaseA != null) {
                                                        sQLiteDatabaseA.endTransaction();
                                                    }
                                                    g.a(d).b();
                                                    return str2;
                                                } catch (Throwable unused2) {
                                                    cursorA = cursorA;
                                                    str2 = str;
                                                    h.a(d);
                                                    if (cursorA != null) {
                                                        cursorA.close();
                                                    }
                                                    if (sQLiteDatabaseA != null) {
                                                        sQLiteDatabaseA.endTransaction();
                                                    }
                                                    g.a(d).b();
                                                    return str2;
                                                }
                                            } else {
                                                jSONObject2.put("duration", Long.parseLong(string) - Long.parseLong(string2));
                                            }
                                            try {
                                                if (!TextUtils.isEmpty(string5)) {
                                                    jSONObject2.put(d.t, new JSONArray(d(string5)));
                                                }
                                                boolean z2 = UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.AUTO;
                                                if (!TextUtils.isEmpty(string6) && z2) {
                                                    JSONArray jSONArray3 = new JSONArray(d(string6));
                                                    JSONArray jSONArray4 = new JSONArray();
                                                    if (jSONArray3.length() > 0) {
                                                        jSONArray4 = b(jSONArray3);
                                                    }
                                                    jSONObject2.put(d.u, jSONArray4);
                                                }
                                                if (!TextUtils.isEmpty(string7)) {
                                                    jSONObject2.put(d.F, new JSONObject(d(string7)));
                                                }
                                                if (!TextUtils.isEmpty(string8)) {
                                                    jSONObject2.put(d.B, new JSONArray(d(string8)));
                                                }
                                                if (!TextUtils.isEmpty(string9)) {
                                                    jSONObject2.put(d.au, new JSONObject(d(string9)));
                                                }
                                                if (!TextUtils.isEmpty(string10)) {
                                                    jSONObject2.put(d.av, new JSONObject(d(string10)));
                                                }
                                                if (jSONObject2.length() > 0) {
                                                    jSONArray = jSONArray2;
                                                    jSONArray.put(jSONObject2);
                                                } else {
                                                    jSONArray = jSONArray2;
                                                }
                                            } catch (SQLiteDatabaseCorruptException unused3) {
                                                str2 = str;
                                                h.a(d);
                                                if (cursorA != null) {
                                                    cursorA.close();
                                                }
                                                if (sQLiteDatabaseA != null) {
                                                }
                                                g.a(d).b();
                                                return str2;
                                            } catch (Throwable unused4) {
                                                str2 = str;
                                                h.a(d);
                                                if (cursorA != null) {
                                                    cursorA.close();
                                                }
                                                if (sQLiteDatabaseA != null) {
                                                }
                                                g.a(d).b();
                                                return str2;
                                            }
                                        } else {
                                            str = string4;
                                            cursorA = cursorA;
                                            jSONArray = jSONArray2;
                                        }
                                        if (z) {
                                            str2 = str;
                                            break;
                                        }
                                    }
                                    jSONArray2 = jSONArray;
                                    cursorA = cursorA;
                                    str2 = str;
                                } catch (SQLiteDatabaseCorruptException unused5) {
                                    str = string4;
                                } catch (Throwable unused6) {
                                    str = string4;
                                }
                            }
                            try {
                                if (this.i.size() < 1) {
                                    cursorA.close();
                                    try {
                                        sQLiteDatabaseA.endTransaction();
                                    } catch (Throwable unused7) {
                                    }
                                    g.a(d).b();
                                    return str2;
                                }
                                if (jSONArray.length() > 0) {
                                    jSONObject.put(d.n, jSONArray);
                                }
                            } catch (SQLiteDatabaseCorruptException unused8) {
                                h.a(d);
                                if (cursorA != null) {
                                    cursorA.close();
                                }
                                if (sQLiteDatabaseA != null) {
                                }
                                g.a(d).b();
                                return str2;
                            } catch (Throwable unused9) {
                                h.a(d);
                                if (cursorA != null) {
                                    cursorA.close();
                                }
                                if (sQLiteDatabaseA != null) {
                                }
                                g.a(d).b();
                                return str2;
                            }
                        } catch (SQLiteDatabaseCorruptException unused10) {
                            cursorA = cursorA;
                        } catch (Throwable unused11) {
                            cursorA = cursorA;
                        }
                    } else {
                        cursorA = cursorA;
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                    if (cursorA != null) {
                        cursorA.close();
                    }
                } catch (SQLiteDatabaseCorruptException unused12) {
                    cursorA = null;
                } catch (Throwable unused13) {
                    cursorA = null;
                }
            } catch (Throwable th) {
                if (cursorA != null) {
                    cursorA.close();
                }
                if (sQLiteDatabaseA != null) {
                    try {
                        sQLiteDatabaseA.endTransaction();
                    } catch (Throwable unused14) {
                    }
                }
                g.a(d).b();
                throw th;
            }
        } catch (SQLiteDatabaseCorruptException unused15) {
            cursorA = null;
            sQLiteDatabaseA = null;
        } catch (Throwable unused16) {
            cursorA = null;
            sQLiteDatabaseA = null;
        }
        try {
            sQLiteDatabaseA.endTransaction();
        } catch (Throwable unused17) {
        }
        g.a(d).b();
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00af  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c9, code lost:
    
        if (r1 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d8, code lost:
    
        if (r1 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00da, code lost:
    
        r0 = r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String b(JSONObject jSONObject, boolean z) {
        ?? r13;
        SQLiteDatabase sQLiteDatabaseA;
        ?? r0 = 0;
        String string = null;
        r0 = 0;
        r0 = 0;
        r0 = 0;
        cursor = null;
        cursor = null;
        Cursor cursor = null;
        Cursor cursor2 = null;
        try {
            try {
                sQLiteDatabaseA = g.a(d).a();
                try {
                    sQLiteDatabaseA.beginTransaction();
                    Cursor cursorA = a(e.c.a, sQLiteDatabaseA, null, null, null, null, null, null, null);
                    if (cursorA != null) {
                        try {
                            JSONArray jSONArray = new JSONArray();
                            while (cursorA.moveToNext()) {
                                JSONObject jSONObject2 = new JSONObject();
                                String string2 = cursorA.getString(cursorA.getColumnIndex("__e"));
                                string = cursorA.getString(cursorA.getColumnIndex("__ii"));
                                this.f77935l.add(string);
                                String string3 = cursorA.getString(cursorA.getColumnIndex("__sp"));
                                String string4 = cursorA.getString(cursorA.getColumnIndex("__pp"));
                                if (!TextUtils.isEmpty(string3)) {
                                    jSONObject2.put(d.au, new JSONObject(d(string3)));
                                }
                                if (!TextUtils.isEmpty(string4)) {
                                    jSONObject2.put(d.av, new JSONObject(d(string4)));
                                }
                                if (!TextUtils.isEmpty(string2)) {
                                    jSONObject2.put("id", string);
                                    jSONObject2.put(d.p, string2);
                                    if (jSONObject2.length() > 0) {
                                        jSONArray.put(jSONObject2);
                                    }
                                    if (z) {
                                        break;
                                    }
                                }
                            }
                            r0 = string;
                            if (jSONArray.length() > 0) {
                                jSONObject.put(d.n, jSONArray);
                                r0 = string;
                            }
                            sQLiteDatabaseA.setTransactionSuccessful();
                            if (cursorA != null) {
                                cursorA.close();
                            }
                        } catch (SQLiteDatabaseCorruptException unused) {
                            r13 = r0;
                            cursor = cursorA;
                            h.a(d);
                            if (cursor != null) {
                                cursor.close();
                            }
                        } catch (Throwable unused2) {
                            r13 = r0;
                            cursor2 = cursorA;
                            h.a(d);
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                        }
                    } else {
                        sQLiteDatabaseA.setTransactionSuccessful();
                        if (cursorA != null) {
                            cursorA.close();
                        }
                    }
                } catch (SQLiteDatabaseCorruptException unused3) {
                    r13 = 0;
                } catch (Throwable unused4) {
                    r13 = 0;
                }
            } catch (Throwable th) {
                if (r0 != 0) {
                    r0.close();
                }
                if (sQLiteDatabaseA != null) {
                    try {
                        sQLiteDatabaseA.endTransaction();
                    } catch (Throwable unused5) {
                    }
                }
                g.a(d).b();
                throw th;
            }
        } catch (SQLiteDatabaseCorruptException unused6) {
            r13 = 0;
            sQLiteDatabaseA = null;
        } catch (Throwable unused7) {
            r13 = 0;
            sQLiteDatabaseA = null;
        }
        try {
            sQLiteDatabaseA.endTransaction();
        } catch (Throwable unused8) {
        }
        r13 = r0;
        g.a(d).b();
        return r13;
    }

    public void a(boolean z, boolean z2) {
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            try {
                try {
                    sQLiteDatabaseA = g.a(d).a();
                    sQLiteDatabaseA.beginTransaction();
                    if (!z2) {
                        int size = this.f77935l.size();
                        int i = 0;
                        if (size > 0) {
                            int i2 = 0;
                            while (i < size) {
                                String str = (String) this.f77935l.get(i);
                                if (str == null) {
                                    i2 = 1;
                                }
                                sQLiteDatabaseA.execSQL("delete from __is where __ii=\"" + str + "\"");
                                i++;
                            }
                            i = i2;
                        }
                        if (i != 0) {
                            sQLiteDatabaseA.execSQL("delete from __is where __ii is null");
                        }
                    } else if (z) {
                        sQLiteDatabaseA.execSQL("delete from __is");
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                } catch (Throwable unused) {
                    h.a(d);
                    if (sQLiteDatabaseA != null) {
                    }
                }
            } catch (SQLiteDatabaseCorruptException unused2) {
                h.a(d);
                if (sQLiteDatabaseA != null) {
                }
            }
            try {
                sQLiteDatabaseA.endTransaction();
            } catch (Throwable unused3) {
            }
        } finally {
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.endTransaction();
                } catch (Throwable unused4) {
                }
            }
            g.a(d).b();
        }
    }

    public void b(boolean z, boolean z2) {
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            try {
                try {
                    sQLiteDatabaseA = g.a(d).a();
                    sQLiteDatabaseA.beginTransaction();
                    if (z2) {
                        if (z) {
                            sQLiteDatabaseA.execSQL("delete from __sd");
                        }
                    } else if (this.i.size() > 0) {
                        for (int i = 0; i < this.i.size(); i++) {
                            sQLiteDatabaseA.execSQL("delete from __sd where __ii=\"" + ((String) this.i.get(i)) + "\"");
                        }
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                } finally {
                    if (sQLiteDatabaseA != null) {
                        try {
                            sQLiteDatabaseA.endTransaction();
                        } catch (Throwable unused) {
                        }
                    }
                    g.a(d).b();
                }
            } catch (SQLiteDatabaseCorruptException unused2) {
                h.a(d);
            } catch (Throwable unused3) {
                if (sQLiteDatabaseA != null) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    public void h() {
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            try {
                try {
                    sQLiteDatabaseA = g.a(d).a();
                    sQLiteDatabaseA.beginTransaction();
                    if (this.j.size() > 0) {
                        for (int i = 0; i < this.j.size(); i++) {
                            sQLiteDatabaseA.execSQL("delete from __et where rowid=" + this.j.get(i));
                        }
                    }
                    this.j.clear();
                    sQLiteDatabaseA.setTransactionSuccessful();
                } finally {
                    if (sQLiteDatabaseA != null) {
                        try {
                            sQLiteDatabaseA.endTransaction();
                        } catch (Throwable unused) {
                        }
                    }
                    g.a(d).b();
                }
            } catch (SQLiteDatabaseCorruptException unused2) {
                h.a(d);
            } catch (Throwable unused3) {
                if (sQLiteDatabaseA != null) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    public void i() {
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            try {
                try {
                    sQLiteDatabaseA = g.a(d).a();
                    sQLiteDatabaseA.beginTransaction();
                    sQLiteDatabaseA.execSQL("delete from __er");
                    sQLiteDatabaseA.setTransactionSuccessful();
                } finally {
                    if (sQLiteDatabaseA != null) {
                        try {
                            sQLiteDatabaseA.endTransaction();
                        } catch (Throwable unused) {
                        }
                    }
                    g.a(d).b();
                }
            } catch (SQLiteDatabaseCorruptException unused2) {
                h.a(d);
            } catch (Throwable unused3) {
                if (sQLiteDatabaseA != null) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    public void j() {
        SQLiteDatabase sQLiteDatabaseA;
        if (!TextUtils.isEmpty(this.k)) {
            try {
                sQLiteDatabaseA = g.a(d).a();
                try {
                    sQLiteDatabaseA.beginTransaction();
                    sQLiteDatabaseA.execSQL("delete from __er where __i=\"" + this.k + "\"");
                    sQLiteDatabaseA.execSQL("delete from __et where __i=\"" + this.k + "\"");
                    sQLiteDatabaseA.setTransactionSuccessful();
                } catch (SQLiteDatabaseCorruptException unused) {
                    try {
                        h.a(d);
                        if (sQLiteDatabaseA != null) {
                        }
                        g.a(d).b();
                        this.k = null;
                    } catch (Throwable th) {
                        if (sQLiteDatabaseA != null) {
                            try {
                                sQLiteDatabaseA.endTransaction();
                            } catch (Throwable unused2) {
                            }
                        }
                        g.a(d).b();
                        throw th;
                    }
                } catch (Throwable unused3) {
                    if (sQLiteDatabaseA != null) {
                    }
                    g.a(d).b();
                    this.k = null;
                }
            } catch (SQLiteDatabaseCorruptException unused4) {
                sQLiteDatabaseA = null;
            } catch (Throwable unused5) {
                sQLiteDatabaseA = null;
            }
            try {
                sQLiteDatabaseA.endTransaction();
            } catch (Throwable unused6) {
            }
            g.a(d).b();
        }
        this.k = null;
    }

    public void a(boolean z, String str) {
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            try {
                try {
                    sQLiteDatabaseA = g.a(d).a();
                    sQLiteDatabaseA.beginTransaction();
                    if (!TextUtils.isEmpty(str)) {
                        sQLiteDatabaseA.execSQL("delete from __er where __i=\"" + str + "\"");
                        sQLiteDatabaseA.execSQL("delete from __et where __i=\"" + str + "\"");
                        this.j.clear();
                        sQLiteDatabaseA.execSQL("delete from __sd where __ii=\"" + str + "\"");
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                } finally {
                    if (sQLiteDatabaseA != null) {
                        try {
                            sQLiteDatabaseA.endTransaction();
                        } catch (Throwable unused) {
                        }
                    }
                    g.a(d).b();
                }
            } catch (SQLiteDatabaseCorruptException unused2) {
                h.a(d);
            } catch (Throwable unused3) {
                if (sQLiteDatabaseA != null) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    public void b(String str) {
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            try {
                try {
                    sQLiteDatabaseA = g.a(d).a();
                    sQLiteDatabaseA.beginTransaction();
                    if (!TextUtils.isEmpty(str)) {
                        sQLiteDatabaseA.execSQL("delete from __is where __ii=\"" + str + "\"");
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                } finally {
                    if (sQLiteDatabaseA != null) {
                        try {
                            sQLiteDatabaseA.endTransaction();
                        } catch (Throwable unused) {
                        }
                    }
                    g.a(d).b();
                }
            } catch (SQLiteDatabaseCorruptException unused2) {
                h.a(d);
            } catch (Throwable unused3) {
                if (sQLiteDatabaseA != null) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    private void l() {
        try {
            if (TextUtils.isEmpty(e)) {
                String multiProcessSP = UMUtils.getMultiProcessSP(d, "ek__id");
                if (TextUtils.isEmpty(multiProcessSP)) {
                    multiProcessSP = PreferenceWrapper.getDefault(d).getString("ek__id", null);
                    if (TextUtils.isEmpty(multiProcessSP)) {
                        multiProcessSP = UMUtils.genId();
                    }
                    if (!TextUtils.isEmpty(multiProcessSP)) {
                        UMUtils.setMultiProcessSP(d, "ek__id", multiProcessSP);
                    }
                }
                if (!TextUtils.isEmpty(multiProcessSP)) {
                    String strSubstring = multiProcessSP.substring(1, 9);
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < strSubstring.length(); i++) {
                        char cCharAt = strSubstring.charAt(i);
                        if (Character.isDigit(cCharAt)) {
                            if (Integer.parseInt(Character.toString(cCharAt)) == 0) {
                                sb.append(0);
                            } else {
                                sb.append(10 - Integer.parseInt(Character.toString(cCharAt)));
                            }
                        } else {
                            sb.append(cCharAt);
                        }
                    }
                    e = sb.toString();
                }
                if (TextUtils.isEmpty(e)) {
                    return;
                }
                e += new StringBuilder(e).reverse().toString();
                String multiProcessSP2 = UMUtils.getMultiProcessSP(d, "ek_key");
                if (TextUtils.isEmpty(multiProcessSP2)) {
                    UMUtils.setMultiProcessSP(d, "ek_key", c("umeng+"));
                } else {
                    if ("umeng+".equals(d(multiProcessSP2))) {
                        return;
                    }
                    b(true, false);
                    a(true, false);
                    h();
                    i();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public String c(String str) {
        try {
            return TextUtils.isEmpty(e) ? str : Base64.encodeToString(DataHelper.encrypt(str.getBytes(), e.getBytes()), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    public String d(String str) {
        try {
            return TextUtils.isEmpty(e) ? str : new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), e.getBytes()));
        } catch (Exception unused) {
            if (Build.VERSION.SDK_INT >= 29 && !TextUtils.isEmpty(str)) {
                try {
                    new JSONObject(str);
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> UMStoreManager decrypt failed, return origin data.");
                    return str;
                } catch (Throwable unused2) {
                    return null;
                }
            }
            return null;
        }
    }
}
