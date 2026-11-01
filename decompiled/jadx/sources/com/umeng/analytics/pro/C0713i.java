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
import com.umeng.commonsdk.utils.C0832d;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.umeng.analytics.pro.i */
/* JADX INFO: compiled from: O4N1 */
/* JADX INFO: loaded from: classes.dex */
public class C0713i {

    /* JADX INFO: renamed from: a */
    public static final int f2746a = 2049;

    /* JADX INFO: renamed from: b */
    public static final int f2747b = 2050;

    /* JADX INFO: renamed from: c */
    public static final int f2748c = 1000;

    /* JADX INFO: renamed from: d */
    public static Context f2749d = null;

    /* JADX INFO: renamed from: e */
    public static String f2750e = null;

    /* JADX INFO: renamed from: f */
    public static final String f2751f = "umeng+";

    /* JADX INFO: renamed from: g */
    public static final String f2752g = "ek__id";

    /* JADX INFO: renamed from: h */
    public static final String f2753h = "ek_key";

    /* JADX INFO: renamed from: i */
    public List f2754i;

    /* JADX INFO: renamed from: j */
    public List f2755j;

    /* JADX INFO: renamed from: k */
    public String f2756k;

    /* JADX INFO: renamed from: l */
    public List f2757l;

    /* JADX INFO: renamed from: com.umeng.analytics.pro.i$a */
    /* JADX INFO: compiled from: O4N1 */
    public enum a {
        AUTOPAGE,
        PAGE,
        BEGIN,
        END,
        NEWSESSION,
        INSTANTSESSIONBEGIN
    }

    /* JADX INFO: renamed from: com.umeng.analytics.pro.i$b */
    /* JADX INFO: compiled from: O4N1 */
    public class b {

        /* JADX INFO: renamed from: a */
        public static final C0713i f2765a = new C0713i();
    }

    public C0713i() {
        this.f2754i = new ArrayList();
        this.f2755j = new ArrayList();
        this.f2756k = null;
        this.f2757l = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static C0713i m2480a(Context context) {
        C0713i c0713i = b.f2765a;
        if (f2749d == null && context != null) {
            f2749d = context.getApplicationContext();
            c0713i.m2490k();
        }
        return c0713i;
    }

    /* JADX INFO: renamed from: k */
    private void m2490k() {
        synchronized (this) {
            m2491l();
            this.f2754i.clear();
            this.f2757l.clear();
            this.f2755j.clear();
        }
    }

    /* JADX INFO: renamed from: a */
    private Cursor m2479a(String str, SQLiteDatabase sQLiteDatabase, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
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

    /* JADX INFO: renamed from: a */
    public void m2494a() {
        this.f2754i.clear();
    }

    /* JADX INFO: renamed from: b */
    public void m2501b() {
        this.f2757l.clear();
    }

    /* JADX INFO: renamed from: c */
    public boolean m2505c() {
        return this.f2757l.isEmpty();
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
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m2495a(JSONArray jSONArray) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM2467a = C0711g.m2466a(f2749d).m2467a();
                try {
                    try {
                        sQLiteDatabaseM2467a.beginTransaction();
                        for (int i = 0; i < jSONArray.length(); i++) {
                            try {
                                JSONObject jSONObject = jSONArray.getJSONObject(i);
                                ContentValues contentValues = new ContentValues();
                                String strOptString = jSONObject.optString("__i");
                                if (TextUtils.isEmpty(strOptString) || "-1".equals(strOptString)) {
                                    strOptString = C0725u.m2637a().m2649b();
                                    if (TextUtils.isEmpty(strOptString)) {
                                        strOptString = "-1";
                                    }
                                }
                                contentValues.put("__i", strOptString);
                                contentValues.put("__e", jSONObject.optString("id"));
                                contentValues.put("__t", Integer.valueOf(jSONObject.optInt("__t")));
                                contentValues.put("__av", UMUtils.getAppVersionName(f2749d));
                                contentValues.put("__vc", UMUtils.getAppVersionCode(f2749d));
                                jSONObject.remove("__i");
                                jSONObject.remove("__t");
                                contentValues.put("__s", m2504c(jSONObject.toString()));
                                sQLiteDatabaseM2467a.insert(C0709e.b.f2687a, null, contentValues);
                            } catch (Exception unused) {
                            }
                        }
                        sQLiteDatabaseM2467a.setTransactionSuccessful();
                        sQLiteDatabaseM2467a.endTransaction();
                    } catch (SQLiteDatabaseCorruptException unused2) {
                        sQLiteDatabase = sQLiteDatabaseM2467a;
                        try {
                            C0712h.m2472a(f2749d);
                        } finally {
                            if (sQLiteDatabase != null) {
                                try {
                                    sQLiteDatabase.endTransaction();
                                } catch (Throwable unused3) {
                                }
                            }
                            C0711g.m2466a(f2749d).m2468b();
                        }
                    }
                } catch (Throwable unused4) {
                    sQLiteDatabase = sQLiteDatabaseM2467a;
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
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m2498a(String str, String str2, int i) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM2467a = C0711g.m2466a(f2749d).m2467a();
                try {
                    sQLiteDatabaseM2467a.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("__i", str);
                    String strM2504c = m2504c(str2);
                    if (!TextUtils.isEmpty(strM2504c)) {
                        contentValues.put("__a", strM2504c);
                        contentValues.put("__t", Integer.valueOf(i));
                        contentValues.put("__av", UMUtils.getAppVersionName(f2749d));
                        contentValues.put("__vc", UMUtils.getAppVersionCode(f2749d));
                        sQLiteDatabaseM2467a.insert(C0709e.a.f2676a, null, contentValues);
                    }
                    sQLiteDatabaseM2467a.setTransactionSuccessful();
                    sQLiteDatabaseM2467a.endTransaction();
                } catch (SQLiteDatabaseCorruptException unused) {
                    sQLiteDatabase = sQLiteDatabaseM2467a;
                    try {
                        C0712h.m2472a(f2749d);
                    } finally {
                        if (sQLiteDatabase != null) {
                            try {
                                sQLiteDatabase.endTransaction();
                            } catch (Throwable unused2) {
                            }
                        }
                        C0711g.m2466a(f2749d).m2468b();
                    }
                } catch (Throwable unused3) {
                    sQLiteDatabase = sQLiteDatabaseM2467a;
                }
            } catch (Throwable unused4) {
            }
        } catch (SQLiteDatabaseCorruptException unused5) {
        } catch (Throwable unused6) {
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void m2507d() {
        SQLiteDatabase sQLiteDatabaseM2467a = null;
        try {
            try {
                try {
                    sQLiteDatabaseM2467a = C0711g.m2466a(f2749d).m2467a();
                    sQLiteDatabaseM2467a.beginTransaction();
                    String strM2653c = C0725u.m2637a().m2653c();
                    if (!TextUtils.isEmpty(strM2653c)) {
                        String[] strArr = {"", "-1"};
                        for (int i = 0; i < 2; i++) {
                            sQLiteDatabaseM2467a.execSQL("update __et set __i=\"" + strM2653c + "\" where __i=\"" + strArr[i] + "\"");
                        }
                        sQLiteDatabaseM2467a.setTransactionSuccessful();
                    } else {
                        try {
                            sQLiteDatabaseM2467a.endTransaction();
                        } catch (Throwable unused) {
                        }
                        C0711g.m2466a(f2749d).m2468b();
                    }
                } finally {
                    if (sQLiteDatabaseM2467a != null) {
                        try {
                            sQLiteDatabaseM2467a.endTransaction();
                        } catch (Throwable unused2) {
                        }
                    }
                    C0711g.m2466a(f2749d).m2468b();
                }
            } catch (SQLiteDatabaseCorruptException unused3) {
                C0712h.m2472a(f2749d);
            } catch (Throwable unused4) {
                if (sQLiteDatabaseM2467a != null) {
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
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m2499a(String str, JSONObject jSONObject, a aVar) {
        if (jSONObject == null) {
            return false;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM2467a = C0711g.m2466a(f2749d).m2467a();
                try {
                    sQLiteDatabaseM2467a.beginTransaction();
                    if (aVar == a.BEGIN) {
                        long jLongValue = ((Long) jSONObject.opt("__e")).longValue();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("__ii", str);
                        contentValues.put("__e", String.valueOf(jLongValue));
                        contentValues.put("__av", UMUtils.getAppVersionName(f2749d));
                        contentValues.put("__vc", UMUtils.getAppVersionCode(f2749d));
                        sQLiteDatabaseM2467a.insert(C0709e.d.f2713a, null, contentValues);
                    } else if (aVar == a.INSTANTSESSIONBEGIN) {
                        m2487b(str, jSONObject, sQLiteDatabaseM2467a);
                    } else if (aVar == a.END) {
                        m2482a(str, jSONObject, sQLiteDatabaseM2467a);
                    } else if (aVar == a.PAGE) {
                        m2483a(str, jSONObject, sQLiteDatabaseM2467a, "__a");
                    } else if (aVar == a.AUTOPAGE) {
                        m2483a(str, jSONObject, sQLiteDatabaseM2467a, C0709e.d.a.f2716c);
                    } else if (aVar == a.NEWSESSION) {
                        m2489c(str, jSONObject, sQLiteDatabaseM2467a);
                    }
                    sQLiteDatabaseM2467a.setTransactionSuccessful();
                    sQLiteDatabaseM2467a.endTransaction();
                } catch (SQLiteDatabaseCorruptException unused) {
                    sQLiteDatabase = sQLiteDatabaseM2467a;
                    try {
                        C0712h.m2472a(f2749d);
                    } finally {
                        if (sQLiteDatabase != null) {
                            try {
                                sQLiteDatabase.endTransaction();
                            } catch (Throwable unused2) {
                            }
                        }
                        C0711g.m2466a(f2749d).m2468b();
                    }
                } catch (Throwable unused3) {
                    sQLiteDatabase = sQLiteDatabaseM2467a;
                }
            } catch (Throwable unused4) {
            }
        } catch (SQLiteDatabaseCorruptException unused5) {
        } catch (Throwable unused6) {
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private void m2482a(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        try {
            long jLongValue = ((Long) jSONObject.opt(C0709e.d.a.f2720g)).longValue();
            Object objOpt = jSONObject.opt(C0709e.d.a.f2721h);
            long jLongValue2 = (objOpt == null || !(objOpt instanceof Long)) ? 0L : ((Long) objOpt).longValue();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("__sp");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("__pp");
            String strM2504c = "";
            String strM2504c2 = (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() <= 0) ? "" : m2504c(jSONObjectOptJSONObject.toString());
            if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.length() > 0) {
                strM2504c = m2504c(jSONObjectOptJSONObject2.toString());
            }
            sQLiteDatabase.execSQL("update __sd set __f=\"" + jLongValue + "\", __g=\"" + jLongValue2 + "\", __sp=\"" + strM2504c2 + "\", __pp=\"" + strM2504c + "\" where __ii=\"" + str + "\"");
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    private void m2487b(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        try {
            long jLongValue = ((Long) jSONObject.get("__e")).longValue();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("__sp");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("__pp");
            String strM2504c = "";
            String strM2504c2 = (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() <= 0) ? "" : m2504c(jSONObjectOptJSONObject.toString());
            if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.length() > 0) {
                strM2504c = m2504c(jSONObjectOptJSONObject2.toString());
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("__ii", str);
            contentValues.put("__e", String.valueOf(jLongValue));
            contentValues.put("__sp", strM2504c2);
            contentValues.put("__pp", strM2504c);
            contentValues.put("__av", UMGlobalContext.getInstance(f2749d).getAppVersion());
            contentValues.put("__vc", UMUtils.getAppVersionCode(f2749d));
            sQLiteDatabase.insert(C0709e.c.f2700a, null, contentValues);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0049 A[Catch: Exception -> 0x004c, TRY_LEAVE, TryCatch #1 {Exception -> 0x004c, blocks: (B:17:0x0044, B:19:0x0049), top: B:31:0x0044 }] */
    /* JADX INFO: renamed from: a */
    public long m2492a(String str) throws Throwable {
        SQLiteDatabase sQLiteDatabaseM2467a;
        Cursor cursorM2479a = null;
        long j = 0;
        try {
            try {
                sQLiteDatabaseM2467a = C0711g.m2466a(f2749d).m2467a();
                try {
                    sQLiteDatabaseM2467a.beginTransaction();
                    cursorM2479a = m2479a(C0709e.d.f2713a, sQLiteDatabaseM2467a, new String[]{C0709e.d.a.f2720g}, "__ii=? ", new String[]{str}, null, null, null, null);
                    if (cursorM2479a != null) {
                        cursorM2479a.moveToFirst();
                        j = cursorM2479a.getLong(cursorM2479a.getColumnIndex(C0709e.d.a.f2720g));
                    }
                    if (cursorM2479a != null) {
                        cursorM2479a.close();
                    }
                } catch (Exception unused) {
                    if (cursorM2479a != null) {
                        cursorM2479a.close();
                    }
                    if (sQLiteDatabaseM2467a != null) {
                    }
                    C0711g.m2466a(f2749d).m2468b();
                    return j;
                } catch (Throwable th) {
                    th = th;
                    if (cursorM2479a != null) {
                        try {
                            cursorM2479a.close();
                            if (sQLiteDatabaseM2467a != null) {
                                sQLiteDatabaseM2467a.endTransaction();
                            }
                        } catch (Exception unused2) {
                            C0711g.m2466a(f2749d).m2468b();
                            throw th;
                        }
                    } else if (sQLiteDatabaseM2467a != null) {
                        sQLiteDatabaseM2467a.endTransaction();
                    }
                    C0711g.m2466a(f2749d).m2468b();
                    throw th;
                }
            } catch (Exception unused3) {
            }
        } catch (Exception unused4) {
            sQLiteDatabaseM2467a = null;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabaseM2467a = null;
        }
        sQLiteDatabaseM2467a.endTransaction();
        C0711g.m2466a(f2749d).m2468b();
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0115  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    private void m2489c(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        Cursor cursor;
        JSONObject jSONObject2;
        String str2;
        Cursor cursor2;
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(C0709e.d.a.f2718e);
            if (jSONObjectOptJSONObject != null) {
                jSONObject2 = jSONObjectOptJSONObject;
                Cursor cursorM2479a = m2479a(C0709e.d.f2713a, sQLiteDatabase, new String[]{C0709e.d.a.f2718e}, "__ii=? ", new String[]{str}, null, null, null, null);
                if (cursorM2479a != null) {
                    String strM2506d = null;
                    while (cursorM2479a.moveToNext()) {
                        try {
                            strM2506d = m2506d(cursorM2479a.getString(cursorM2479a.getColumnIndex(C0709e.d.a.f2718e)));
                        } catch (Throwable unused) {
                            cursor = cursorM2479a;
                            if (cursor != null) {
                                cursor.close();
                                return;
                            }
                            return;
                        }
                    }
                    String str3 = strM2506d;
                    cursor2 = cursorM2479a;
                    str2 = str3;
                } else {
                    cursor2 = cursorM2479a;
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
                    String strM2504c = m2504c(jSONArray.toString());
                    if (!TextUtils.isEmpty(strM2504c)) {
                        sQLiteDatabase.execSQL("update  __sd set __d=\"" + strM2504c + "\" where __ii=\"" + str + "\"");
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
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(C0709e.d.a.f2717d);
            if (jSONObjectOptJSONObject2 != null) {
                String strM2504c2 = m2504c(jSONObjectOptJSONObject2.toString());
                if (!TextUtils.isEmpty(strM2504c2)) {
                    sQLiteDatabase.execSQL("update  __sd set __c=\"" + strM2504c2 + "\" where __ii=\"" + str + "\"");
                }
            }
            sQLiteDatabase.execSQL("update  __sd set __f=\"" + String.valueOf(jSONObject.optLong(C0709e.d.a.f2720g)) + "\" where __ii=\"" + str + "\"");
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
    /* JADX INFO: renamed from: a */
    private void m2483a(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase, String str2) {
        JSONArray jSONArray;
        JSONArray jSONArrayOptJSONArray;
        Cursor cursorM2479a;
        JSONArray jSONArray2;
        int i;
        String strM2504c;
        JSONObject jSONObject2;
        Cursor cursor = null;
        strM2506d = null;
        String strM2506d = null;
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
                if (C0709e.d.a.f2716c.equals(str2)) {
                    jSONArrayOptJSONArray = jSONObject.optJSONArray(C0709e.d.a.f2716c);
                    if (jSONArrayOptJSONArray == null) {
                        return;
                    }
                    if (jSONArrayOptJSONArray.length() <= 0) {
                        return;
                    }
                } else {
                    jSONArray = null;
                }
                cursorM2479a = m2479a(C0709e.d.f2713a, sQLiteDatabase, new String[]{str2}, "__ii=? ", new String[]{str}, null, null, null, null);
                if (cursorM2479a != null) {
                    while (cursorM2479a.moveToNext()) {
                        try {
                            strM2506d = m2506d(cursorM2479a.getString(cursorM2479a.getColumnIndex(str2)));
                        } catch (Throwable unused) {
                            cursor = cursorM2479a;
                            if (cursor != null) {
                                cursor.close();
                                return;
                            }
                            return;
                        }
                    }
                }
                jSONArray2 = new JSONArray();
                if (!TextUtils.isEmpty(strM2506d)) {
                    jSONArray2 = new JSONArray(strM2506d);
                }
                if (jSONArray2.length() > 1000) {
                    if (cursorM2479a != null) {
                        cursorM2479a.close();
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
                strM2504c = m2504c(jSONArray2.toString());
                if (!TextUtils.isEmpty(strM2504c)) {
                    sQLiteDatabase.execSQL("update __sd set " + str2 + "=\"" + strM2504c + "\" where __ii=\"" + str + "\"");
                }
                if (cursorM2479a != null) {
                    cursorM2479a.close();
                }
            }
            jSONArray = jSONArrayOptJSONArray;
            cursorM2479a = m2479a(C0709e.d.f2713a, sQLiteDatabase, new String[]{str2}, "__ii=? ", new String[]{str}, null, null, null, null);
            if (cursorM2479a != null) {
                while (cursorM2479a.moveToNext()) {
                    strM2506d = m2506d(cursorM2479a.getString(cursorM2479a.getColumnIndex(str2)));
                }
            }
            jSONArray2 = new JSONArray();
            if (!TextUtils.isEmpty(strM2506d)) {
                jSONArray2 = new JSONArray(strM2506d);
            }
            if (jSONArray2.length() > 1000) {
                if (cursorM2479a != null) {
                    cursorM2479a.close();
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
            strM2504c = m2504c(jSONArray2.toString());
            if (!TextUtils.isEmpty(strM2504c)) {
                sQLiteDatabase.execSQL("update __sd set " + str2 + "=\"" + strM2504c + "\" where __ii=\"" + str + "\"");
            }
            if (cursorM2479a != null) {
                cursorM2479a.close();
            }
        } catch (Throwable unused3) {
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m2508e() {
        return this.f2754i.isEmpty();
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m2493a(boolean z) {
        m2494a();
        this.f2755j.clear();
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            m2481a(jSONObject, z);
            m2488b(jSONObject, (String) null);
            m2484a(jSONObject, (String) null);
            return jSONObject;
        }
        String strM2481a = m2481a(jSONObject, z);
        if (!TextUtils.isEmpty(strM2481a)) {
            m2488b(jSONObject, strM2481a);
            m2484a(jSONObject, strM2481a);
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0065  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090 A[EXC_TOP_SPLITTER, PHI: r0 r2
      0x0090: PHI (r0v4 org.json.JSONObject) = (r0v3 org.json.JSONObject), (r0v6 org.json.JSONObject) binds: [B:27:0x007d, B:34:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r2v5 android.database.sqlite.SQLiteDatabase) = (r2v4 android.database.sqlite.SQLiteDatabase), (r2v6 android.database.sqlite.SQLiteDatabase) binds: [B:27:0x007d, B:34:0x008e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public JSONObject m2509f() {
        JSONObject jSONObject;
        SQLiteDatabase sQLiteDatabaseM2467a;
        Cursor cursor = null;
        jSONObject = null;
        jSONObject = null;
        jSONObject = null;
        JSONObject jSONObject2 = null;
        cursor = null;
        cursor = null;
        Cursor cursor2 = null;
        if (this.f2757l.isEmpty()) {
            return null;
        }
        try {
            sQLiteDatabaseM2467a = C0711g.m2466a(f2749d).m2467a();
            try {
                sQLiteDatabaseM2467a.beginTransaction();
                Cursor cursorM2479a = m2479a(C0709e.c.f2700a, sQLiteDatabaseM2467a, null, "__ii=? ", new String[]{(String) this.f2757l.get(0)}, null, null, null, null);
                if (cursorM2479a != null) {
                    try {
                        if (cursorM2479a.moveToNext()) {
                            JSONObject jSONObject3 = new JSONObject();
                            try {
                                String string = cursorM2479a.getString(cursorM2479a.getColumnIndex("__av"));
                                String string2 = cursorM2479a.getString(cursorM2479a.getColumnIndex("__vc"));
                                jSONObject3.put("__av", string);
                                jSONObject3.put("__vc", string2);
                                jSONObject2 = jSONObject3;
                            } catch (SQLiteDatabaseCorruptException unused) {
                                jSONObject2 = jSONObject3;
                                jSONObject = jSONObject2;
                                cursor2 = cursorM2479a;
                                try {
                                    C0712h.m2472a(f2749d);
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    if (sQLiteDatabaseM2467a != null) {
                                        try {
                                            sQLiteDatabaseM2467a.endTransaction();
                                        } catch (Throwable unused2) {
                                        }
                                    }
                                    jSONObject2 = jSONObject;
                                } finally {
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    if (sQLiteDatabaseM2467a != null) {
                                        try {
                                            sQLiteDatabaseM2467a.endTransaction();
                                        } catch (Throwable unused3) {
                                        }
                                    }
                                    C0711g.m2466a(f2749d).m2468b();
                                }
                            } catch (Throwable unused4) {
                                jSONObject2 = jSONObject3;
                                jSONObject = jSONObject2;
                                cursor = cursorM2479a;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (sQLiteDatabaseM2467a != null) {
                                    sQLiteDatabaseM2467a.endTransaction();
                                }
                                jSONObject2 = jSONObject;
                            }
                        }
                        sQLiteDatabaseM2467a.setTransactionSuccessful();
                        if (cursorM2479a != null) {
                            cursorM2479a.close();
                        }
                        try {
                            sQLiteDatabaseM2467a.endTransaction();
                        } catch (Throwable unused5) {
                        }
                    } catch (SQLiteDatabaseCorruptException unused6) {
                    } catch (Throwable unused7) {
                    }
                } else {
                    sQLiteDatabaseM2467a.setTransactionSuccessful();
                    if (cursorM2479a != null) {
                        cursorM2479a.close();
                    }
                    sQLiteDatabaseM2467a.endTransaction();
                }
            } catch (SQLiteDatabaseCorruptException unused8) {
                jSONObject = null;
            } catch (Throwable unused9) {
                jSONObject = null;
            }
        } catch (SQLiteDatabaseCorruptException unused10) {
            jSONObject = null;
            sQLiteDatabaseM2467a = null;
        } catch (Throwable unused11) {
            jSONObject = null;
            sQLiteDatabaseM2467a = null;
        }
        return jSONObject2;
    }

    /* JADX INFO: renamed from: b */
    public JSONObject m2500b(boolean z) {
        JSONObject jSONObject = new JSONObject();
        m2485b(jSONObject, z);
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
    /* JADX INFO: renamed from: a */
    private void m2484a(JSONObject jSONObject, String str) {
        SQLiteDatabase sQLiteDatabaseM2467a;
        ?? length = 0;
        length = 0;
        length = 0;
        length = 0;
        length = 0;
        length = 0;
        try {
            try {
                sQLiteDatabaseM2467a = C0711g.m2466a(f2749d).m2467a();
                try {
                    sQLiteDatabaseM2467a.beginTransaction();
                    Cursor cursorM2479a = !TextUtils.isEmpty(str) ? m2479a(C0709e.b.f2687a, sQLiteDatabaseM2467a, null, "__i=? ", new String[]{str}, null, null, null, null) : m2479a(C0709e.b.f2687a, sQLiteDatabaseM2467a, null, null, null, null, null, null, null);
                    if (cursorM2479a != null) {
                        try {
                            ?? jSONObject2 = new JSONObject();
                            ?? jSONObject3 = new JSONObject();
                            String strM2649b = C0725u.m2637a().m2649b();
                            while (cursorM2479a.moveToNext()) {
                                int i = cursorM2479a.getInt(cursorM2479a.getColumnIndex("__t"));
                                String string = cursorM2479a.getString(cursorM2479a.getColumnIndex("__i"));
                                String string2 = cursorM2479a.getString(cursorM2479a.getColumnIndex("__s"));
                                if (TextUtils.isEmpty(string) || "-1".equals(string)) {
                                    if (!TextUtils.isEmpty(strM2649b)) {
                                        string = strM2649b;
                                    }
                                }
                                this.f2755j.add(Integer.valueOf(cursorM2479a.getInt(0)));
                                if (i != 2049) {
                                    if (i == 2050 && !TextUtils.isEmpty(string2)) {
                                        JSONObject jSONObject4 = new JSONObject(m2506d(string2));
                                        JSONArray jSONArrayOptJSONArray = jSONObject3.has(string) ? jSONObject3.optJSONArray(string) : new JSONArray();
                                        jSONArrayOptJSONArray.put(jSONObject4);
                                        jSONObject3.put(string, jSONArrayOptJSONArray);
                                    }
                                } else if (!TextUtils.isEmpty(string2)) {
                                    JSONObject jSONObject5 = new JSONObject(m2506d(string2));
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
                                    jSONObject.put(C0708d.f2604T, length);
                                }
                            }
                            sQLiteDatabaseM2467a.setTransactionSuccessful();
                            if (cursorM2479a != null) {
                                cursorM2479a.close();
                            }
                        } catch (SQLiteDatabaseCorruptException unused) {
                            length = cursorM2479a;
                            C0712h.m2472a(f2749d);
                            if (length != 0) {
                                length.close();
                            }
                            if (sQLiteDatabaseM2467a != null) {
                            }
                            C0711g.m2466a(f2749d).m2468b();
                        } catch (Throwable unused2) {
                            length = cursorM2479a;
                            C0712h.m2472a(f2749d);
                            if (length != 0) {
                                length.close();
                            }
                            if (sQLiteDatabaseM2467a != null) {
                            }
                            C0711g.m2466a(f2749d).m2468b();
                        }
                    } else {
                        sQLiteDatabaseM2467a.setTransactionSuccessful();
                        if (cursorM2479a != null) {
                            cursorM2479a.close();
                        }
                    }
                } catch (SQLiteDatabaseCorruptException unused3) {
                } catch (Throwable unused4) {
                }
            } catch (Throwable th) {
                if (length != 0) {
                    length.close();
                }
                if (sQLiteDatabaseM2467a != null) {
                    try {
                        sQLiteDatabaseM2467a.endTransaction();
                    } catch (Throwable unused5) {
                    }
                }
                C0711g.m2466a(f2749d).m2468b();
                throw th;
            }
        } catch (SQLiteDatabaseCorruptException unused6) {
            sQLiteDatabaseM2467a = null;
        } catch (Throwable unused7) {
            sQLiteDatabaseM2467a = null;
        }
        try {
            sQLiteDatabaseM2467a.endTransaction();
        } catch (Throwable unused8) {
        }
        C0711g.m2466a(f2749d).m2468b();
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
    /* JADX INFO: renamed from: b */
    private void m2488b(JSONObject jSONObject, String str) {
        SQLiteDatabase sQLiteDatabaseM2467a;
        ?? jSONArray = 0;
        jSONArray = 0;
        jSONArray = 0;
        jSONArray = 0;
        jSONArray = 0;
        jSONArray = 0;
        try {
            try {
                sQLiteDatabaseM2467a = C0711g.m2466a(f2749d).m2467a();
                try {
                    sQLiteDatabaseM2467a.beginTransaction();
                    Cursor cursorM2479a = !TextUtils.isEmpty(str) ? m2479a(C0709e.a.f2676a, sQLiteDatabaseM2467a, null, "__i=? ", new String[]{str}, null, null, null, null) : m2479a(C0709e.a.f2676a, sQLiteDatabaseM2467a, null, null, null, null, null, null, null);
                    if (cursorM2479a != null) {
                        try {
                            jSONArray = new JSONArray();
                            while (cursorM2479a.moveToNext()) {
                                String string = cursorM2479a.getString(cursorM2479a.getColumnIndex("__a"));
                                if (!TextUtils.isEmpty(string)) {
                                    jSONArray.put(new JSONObject(m2506d(string)));
                                }
                            }
                            if (jSONArray.length() > 0) {
                                jSONObject.put(C0708d.f2599O, jSONArray);
                            }
                            sQLiteDatabaseM2467a.setTransactionSuccessful();
                            if (cursorM2479a != null) {
                                cursorM2479a.close();
                            }
                        } catch (SQLiteDatabaseCorruptException unused) {
                            jSONArray = cursorM2479a;
                            C0712h.m2472a(f2749d);
                            if (jSONArray != 0) {
                                jSONArray.close();
                            }
                            if (sQLiteDatabaseM2467a != null) {
                            }
                            C0711g.m2466a(f2749d).m2468b();
                        } catch (Throwable unused2) {
                            jSONArray = cursorM2479a;
                            C0712h.m2472a(f2749d);
                            if (jSONArray != 0) {
                                jSONArray.close();
                            }
                            if (sQLiteDatabaseM2467a != null) {
                            }
                            C0711g.m2466a(f2749d).m2468b();
                        }
                    } else {
                        sQLiteDatabaseM2467a.setTransactionSuccessful();
                        if (cursorM2479a != null) {
                            cursorM2479a.close();
                        }
                    }
                } catch (SQLiteDatabaseCorruptException unused3) {
                } catch (Throwable unused4) {
                }
            } catch (Throwable th) {
                if (jSONArray != 0) {
                    jSONArray.close();
                }
                if (sQLiteDatabaseM2467a != null) {
                    try {
                        sQLiteDatabaseM2467a.endTransaction();
                    } catch (Throwable unused5) {
                    }
                }
                C0711g.m2466a(f2749d).m2468b();
                throw th;
            }
        } catch (SQLiteDatabaseCorruptException unused6) {
            sQLiteDatabaseM2467a = null;
        } catch (Throwable unused7) {
            sQLiteDatabaseM2467a = null;
        }
        try {
            sQLiteDatabaseM2467a.endTransaction();
        } catch (Throwable unused8) {
        }
        C0711g.m2466a(f2749d).m2468b();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0065  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090 A[EXC_TOP_SPLITTER, PHI: r0 r2
      0x0090: PHI (r0v4 org.json.JSONObject) = (r0v3 org.json.JSONObject), (r0v6 org.json.JSONObject) binds: [B:27:0x007d, B:34:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r2v5 android.database.sqlite.SQLiteDatabase) = (r2v4 android.database.sqlite.SQLiteDatabase), (r2v6 android.database.sqlite.SQLiteDatabase) binds: [B:27:0x007d, B:34:0x008e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public JSONObject m2510g() {
        JSONObject jSONObject;
        SQLiteDatabase sQLiteDatabaseM2467a;
        Cursor cursor = null;
        jSONObject = null;
        jSONObject = null;
        jSONObject = null;
        JSONObject jSONObject2 = null;
        cursor = null;
        cursor = null;
        Cursor cursor2 = null;
        if (this.f2754i.isEmpty()) {
            return null;
        }
        try {
            sQLiteDatabaseM2467a = C0711g.m2466a(f2749d).m2467a();
            try {
                sQLiteDatabaseM2467a.beginTransaction();
                Cursor cursorM2479a = m2479a(C0709e.d.f2713a, sQLiteDatabaseM2467a, null, "__ii=? ", new String[]{(String) this.f2754i.get(0)}, null, null, null, null);
                if (cursorM2479a != null) {
                    try {
                        if (cursorM2479a.moveToNext()) {
                            JSONObject jSONObject3 = new JSONObject();
                            try {
                                String string = cursorM2479a.getString(cursorM2479a.getColumnIndex("__av"));
                                String string2 = cursorM2479a.getString(cursorM2479a.getColumnIndex("__vc"));
                                jSONObject3.put("__av", string);
                                jSONObject3.put("__vc", string2);
                                jSONObject2 = jSONObject3;
                            } catch (SQLiteDatabaseCorruptException unused) {
                                jSONObject2 = jSONObject3;
                                jSONObject = jSONObject2;
                                cursor2 = cursorM2479a;
                                try {
                                    C0712h.m2472a(f2749d);
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    if (sQLiteDatabaseM2467a != null) {
                                        try {
                                            sQLiteDatabaseM2467a.endTransaction();
                                        } catch (Throwable unused2) {
                                        }
                                    }
                                    jSONObject2 = jSONObject;
                                } finally {
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    if (sQLiteDatabaseM2467a != null) {
                                        try {
                                            sQLiteDatabaseM2467a.endTransaction();
                                        } catch (Throwable unused3) {
                                        }
                                    }
                                    C0711g.m2466a(f2749d).m2468b();
                                }
                            } catch (Throwable unused4) {
                                jSONObject2 = jSONObject3;
                                jSONObject = jSONObject2;
                                cursor = cursorM2479a;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (sQLiteDatabaseM2467a != null) {
                                    sQLiteDatabaseM2467a.endTransaction();
                                }
                                jSONObject2 = jSONObject;
                            }
                        }
                        sQLiteDatabaseM2467a.setTransactionSuccessful();
                        if (cursorM2479a != null) {
                            cursorM2479a.close();
                        }
                        try {
                            sQLiteDatabaseM2467a.endTransaction();
                        } catch (Throwable unused5) {
                        }
                    } catch (SQLiteDatabaseCorruptException unused6) {
                    } catch (Throwable unused7) {
                    }
                } else {
                    sQLiteDatabaseM2467a.setTransactionSuccessful();
                    if (cursorM2479a != null) {
                        cursorM2479a.close();
                    }
                    sQLiteDatabaseM2467a.endTransaction();
                }
            } catch (SQLiteDatabaseCorruptException unused8) {
                jSONObject = null;
            } catch (Throwable unused9) {
                jSONObject = null;
            }
        } catch (SQLiteDatabaseCorruptException unused10) {
            jSONObject = null;
            sQLiteDatabaseM2467a = null;
        } catch (Throwable unused11) {
            jSONObject = null;
            sQLiteDatabaseM2467a = null;
        }
        return jSONObject2;
    }

    /* JADX INFO: renamed from: b */
    private JSONArray m2486b(JSONArray jSONArray) {
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
    /* JADX INFO: renamed from: a */
    private String m2481a(JSONObject jSONObject, boolean z) {
        Cursor cursorM2479a;
        SQLiteDatabase sQLiteDatabaseM2467a;
        JSONArray jSONArray;
        String str;
        String str2 = null;
        try {
            try {
                sQLiteDatabaseM2467a = C0711g.m2466a(f2749d).m2467a();
                try {
                    sQLiteDatabaseM2467a.beginTransaction();
                    cursorM2479a = m2479a(C0709e.d.f2713a, sQLiteDatabaseM2467a, null, null, null, null, null, null, null);
                    if (cursorM2479a != null) {
                        try {
                            JSONArray jSONArray2 = new JSONArray();
                            while (true) {
                                if (!cursorM2479a.moveToNext()) {
                                    cursorM2479a = cursorM2479a;
                                    jSONArray = jSONArray2;
                                    break;
                                }
                                JSONObject jSONObject2 = new JSONObject();
                                String string = cursorM2479a.getString(cursorM2479a.getColumnIndex(C0709e.d.a.f2720g));
                                String string2 = cursorM2479a.getString(cursorM2479a.getColumnIndex("__e"));
                                String string3 = cursorM2479a.getString(cursorM2479a.getColumnIndex(C0709e.d.a.f2721h));
                                String string4 = cursorM2479a.getString(cursorM2479a.getColumnIndex("__ii"));
                                try {
                                    if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                                        str = string4;
                                        cursorM2479a = cursorM2479a;
                                        jSONArray = jSONArray2;
                                    } else {
                                        if (Long.parseLong(string) - Long.parseLong(string2) > 0) {
                                            String string5 = cursorM2479a.getString(cursorM2479a.getColumnIndex("__a"));
                                            String string6 = cursorM2479a.getString(cursorM2479a.getColumnIndex(C0709e.d.a.f2716c));
                                            String string7 = cursorM2479a.getString(cursorM2479a.getColumnIndex(C0709e.d.a.f2717d));
                                            String string8 = cursorM2479a.getString(cursorM2479a.getColumnIndex(C0709e.d.a.f2718e));
                                            this.f2754i.add(string4);
                                            String string9 = cursorM2479a.getString(cursorM2479a.getColumnIndex("__sp"));
                                            String string10 = cursorM2479a.getString(cursorM2479a.getColumnIndex("__pp"));
                                            jSONObject2.put("id", string4);
                                            jSONObject2.put(C0708d.f2660p, string2);
                                            jSONObject2.put(C0708d.f2661q, string);
                                            str = string4;
                                            if (FieldManager.allow(C0832d.f3591E)) {
                                                try {
                                                    if (Long.parseLong(string3) <= 0) {
                                                        jSONObject2.put("duration", Long.parseLong(string) - Long.parseLong(string2));
                                                    } else {
                                                        jSONObject2.put("duration", Long.parseLong(string3));
                                                        jSONObject2.put(C0708d.f2663s, Long.parseLong(string) - Long.parseLong(string2));
                                                    }
                                                } catch (SQLiteDatabaseCorruptException unused) {
                                                    cursorM2479a = cursorM2479a;
                                                    str2 = str;
                                                    C0712h.m2472a(f2749d);
                                                    if (cursorM2479a != null) {
                                                        cursorM2479a.close();
                                                    }
                                                    if (sQLiteDatabaseM2467a != null) {
                                                        sQLiteDatabaseM2467a.endTransaction();
                                                    }
                                                    C0711g.m2466a(f2749d).m2468b();
                                                    return str2;
                                                } catch (Throwable unused2) {
                                                    cursorM2479a = cursorM2479a;
                                                    str2 = str;
                                                    C0712h.m2472a(f2749d);
                                                    if (cursorM2479a != null) {
                                                        cursorM2479a.close();
                                                    }
                                                    if (sQLiteDatabaseM2467a != null) {
                                                        sQLiteDatabaseM2467a.endTransaction();
                                                    }
                                                    C0711g.m2466a(f2749d).m2468b();
                                                    return str2;
                                                }
                                            } else {
                                                jSONObject2.put("duration", Long.parseLong(string) - Long.parseLong(string2));
                                            }
                                            try {
                                                if (!TextUtils.isEmpty(string5)) {
                                                    jSONObject2.put(C0708d.f2664t, new JSONArray(m2506d(string5)));
                                                }
                                                boolean z2 = UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.AUTO;
                                                if (!TextUtils.isEmpty(string6) && z2) {
                                                    JSONArray jSONArray3 = new JSONArray(m2506d(string6));
                                                    JSONArray jSONArray4 = new JSONArray();
                                                    if (jSONArray3.length() > 0) {
                                                        jSONArray4 = m2486b(jSONArray3);
                                                    }
                                                    jSONObject2.put(C0708d.f2665u, jSONArray4);
                                                }
                                                if (!TextUtils.isEmpty(string7)) {
                                                    jSONObject2.put(C0708d.f2590F, new JSONObject(m2506d(string7)));
                                                }
                                                if (!TextUtils.isEmpty(string8)) {
                                                    jSONObject2.put(C0708d.f2586B, new JSONArray(m2506d(string8)));
                                                }
                                                if (!TextUtils.isEmpty(string9)) {
                                                    jSONObject2.put(C0708d.f2640au, new JSONObject(m2506d(string9)));
                                                }
                                                if (!TextUtils.isEmpty(string10)) {
                                                    jSONObject2.put(C0708d.f2641av, new JSONObject(m2506d(string10)));
                                                }
                                                if (jSONObject2.length() > 0) {
                                                    jSONArray = jSONArray2;
                                                    jSONArray.put(jSONObject2);
                                                } else {
                                                    jSONArray = jSONArray2;
                                                }
                                            } catch (SQLiteDatabaseCorruptException unused3) {
                                                str2 = str;
                                                C0712h.m2472a(f2749d);
                                                if (cursorM2479a != null) {
                                                    cursorM2479a.close();
                                                }
                                                if (sQLiteDatabaseM2467a != null) {
                                                }
                                                C0711g.m2466a(f2749d).m2468b();
                                                return str2;
                                            } catch (Throwable unused4) {
                                                str2 = str;
                                                C0712h.m2472a(f2749d);
                                                if (cursorM2479a != null) {
                                                    cursorM2479a.close();
                                                }
                                                if (sQLiteDatabaseM2467a != null) {
                                                }
                                                C0711g.m2466a(f2749d).m2468b();
                                                return str2;
                                            }
                                        } else {
                                            str = string4;
                                            cursorM2479a = cursorM2479a;
                                            jSONArray = jSONArray2;
                                        }
                                        if (z) {
                                            str2 = str;
                                            break;
                                        }
                                    }
                                    jSONArray2 = jSONArray;
                                    cursorM2479a = cursorM2479a;
                                    str2 = str;
                                } catch (SQLiteDatabaseCorruptException unused5) {
                                    str = string4;
                                } catch (Throwable unused6) {
                                    str = string4;
                                }
                            }
                            try {
                                if (this.f2754i.size() < 1) {
                                    cursorM2479a.close();
                                    try {
                                        sQLiteDatabaseM2467a.endTransaction();
                                    } catch (Throwable unused7) {
                                    }
                                    C0711g.m2466a(f2749d).m2468b();
                                    return str2;
                                }
                                if (jSONArray.length() > 0) {
                                    jSONObject.put(C0708d.f2658n, jSONArray);
                                }
                            } catch (SQLiteDatabaseCorruptException unused8) {
                                C0712h.m2472a(f2749d);
                                if (cursorM2479a != null) {
                                    cursorM2479a.close();
                                }
                                if (sQLiteDatabaseM2467a != null) {
                                }
                                C0711g.m2466a(f2749d).m2468b();
                                return str2;
                            } catch (Throwable unused9) {
                                C0712h.m2472a(f2749d);
                                if (cursorM2479a != null) {
                                    cursorM2479a.close();
                                }
                                if (sQLiteDatabaseM2467a != null) {
                                }
                                C0711g.m2466a(f2749d).m2468b();
                                return str2;
                            }
                        } catch (SQLiteDatabaseCorruptException unused10) {
                            cursorM2479a = cursorM2479a;
                        } catch (Throwable unused11) {
                            cursorM2479a = cursorM2479a;
                        }
                    } else {
                        cursorM2479a = cursorM2479a;
                    }
                    sQLiteDatabaseM2467a.setTransactionSuccessful();
                    if (cursorM2479a != null) {
                        cursorM2479a.close();
                    }
                } catch (SQLiteDatabaseCorruptException unused12) {
                    cursorM2479a = null;
                } catch (Throwable unused13) {
                    cursorM2479a = null;
                }
            } catch (Throwable th) {
                if (cursorM2479a != null) {
                    cursorM2479a.close();
                }
                if (sQLiteDatabaseM2467a != null) {
                    try {
                        sQLiteDatabaseM2467a.endTransaction();
                    } catch (Throwable unused14) {
                    }
                }
                C0711g.m2466a(f2749d).m2468b();
                throw th;
            }
        } catch (SQLiteDatabaseCorruptException unused15) {
            cursorM2479a = null;
            sQLiteDatabaseM2467a = null;
        } catch (Throwable unused16) {
            cursorM2479a = null;
            sQLiteDatabaseM2467a = null;
        }
        try {
            sQLiteDatabaseM2467a.endTransaction();
        } catch (Throwable unused17) {
        }
        C0711g.m2466a(f2749d).m2468b();
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
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String m2485b(JSONObject jSONObject, boolean z) {
        ?? r13;
        SQLiteDatabase sQLiteDatabaseM2467a;
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
                sQLiteDatabaseM2467a = C0711g.m2466a(f2749d).m2467a();
                try {
                    sQLiteDatabaseM2467a.beginTransaction();
                    Cursor cursorM2479a = m2479a(C0709e.c.f2700a, sQLiteDatabaseM2467a, null, null, null, null, null, null, null);
                    if (cursorM2479a != null) {
                        try {
                            JSONArray jSONArray = new JSONArray();
                            while (cursorM2479a.moveToNext()) {
                                JSONObject jSONObject2 = new JSONObject();
                                String string2 = cursorM2479a.getString(cursorM2479a.getColumnIndex("__e"));
                                string = cursorM2479a.getString(cursorM2479a.getColumnIndex("__ii"));
                                this.f2757l.add(string);
                                String string3 = cursorM2479a.getString(cursorM2479a.getColumnIndex("__sp"));
                                String string4 = cursorM2479a.getString(cursorM2479a.getColumnIndex("__pp"));
                                if (!TextUtils.isEmpty(string3)) {
                                    jSONObject2.put(C0708d.f2640au, new JSONObject(m2506d(string3)));
                                }
                                if (!TextUtils.isEmpty(string4)) {
                                    jSONObject2.put(C0708d.f2641av, new JSONObject(m2506d(string4)));
                                }
                                if (!TextUtils.isEmpty(string2)) {
                                    jSONObject2.put("id", string);
                                    jSONObject2.put(C0708d.f2660p, string2);
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
                                jSONObject.put(C0708d.f2658n, jSONArray);
                                r0 = string;
                            }
                            sQLiteDatabaseM2467a.setTransactionSuccessful();
                            if (cursorM2479a != null) {
                                cursorM2479a.close();
                            }
                        } catch (SQLiteDatabaseCorruptException unused) {
                            r13 = r0;
                            cursor = cursorM2479a;
                            C0712h.m2472a(f2749d);
                            if (cursor != null) {
                                cursor.close();
                            }
                        } catch (Throwable unused2) {
                            r13 = r0;
                            cursor2 = cursorM2479a;
                            C0712h.m2472a(f2749d);
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                        }
                    } else {
                        sQLiteDatabaseM2467a.setTransactionSuccessful();
                        if (cursorM2479a != null) {
                            cursorM2479a.close();
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
                if (sQLiteDatabaseM2467a != null) {
                    try {
                        sQLiteDatabaseM2467a.endTransaction();
                    } catch (Throwable unused5) {
                    }
                }
                C0711g.m2466a(f2749d).m2468b();
                throw th;
            }
        } catch (SQLiteDatabaseCorruptException unused6) {
            r13 = 0;
            sQLiteDatabaseM2467a = null;
        } catch (Throwable unused7) {
            r13 = 0;
            sQLiteDatabaseM2467a = null;
        }
        try {
            sQLiteDatabaseM2467a.endTransaction();
        } catch (Throwable unused8) {
        }
        r13 = r0;
        C0711g.m2466a(f2749d).m2468b();
        return r13;
    }

    /* JADX INFO: renamed from: a */
    public void m2497a(boolean z, boolean z2) {
        SQLiteDatabase sQLiteDatabaseM2467a = null;
        try {
            try {
                try {
                    sQLiteDatabaseM2467a = C0711g.m2466a(f2749d).m2467a();
                    sQLiteDatabaseM2467a.beginTransaction();
                    if (!z2) {
                        int size = this.f2757l.size();
                        int i = 0;
                        if (size > 0) {
                            int i2 = 0;
                            while (i < size) {
                                String str = (String) this.f2757l.get(i);
                                if (str == null) {
                                    i2 = 1;
                                }
                                sQLiteDatabaseM2467a.execSQL("delete from __is where __ii=\"" + str + "\"");
                                i++;
                            }
                            i = i2;
                        }
                        if (i != 0) {
                            sQLiteDatabaseM2467a.execSQL("delete from __is where __ii is null");
                        }
                    } else if (z) {
                        sQLiteDatabaseM2467a.execSQL("delete from __is");
                    }
                    sQLiteDatabaseM2467a.setTransactionSuccessful();
                } catch (Throwable unused) {
                    C0712h.m2472a(f2749d);
                    if (sQLiteDatabaseM2467a != null) {
                    }
                }
            } catch (SQLiteDatabaseCorruptException unused2) {
                C0712h.m2472a(f2749d);
                if (sQLiteDatabaseM2467a != null) {
                }
            }
            try {
                sQLiteDatabaseM2467a.endTransaction();
            } catch (Throwable unused3) {
            }
        } finally {
            if (sQLiteDatabaseM2467a != null) {
                try {
                    sQLiteDatabaseM2467a.endTransaction();
                } catch (Throwable unused4) {
                }
            }
            C0711g.m2466a(f2749d).m2468b();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2503b(boolean z, boolean z2) {
        SQLiteDatabase sQLiteDatabaseM2467a = null;
        try {
            try {
                try {
                    sQLiteDatabaseM2467a = C0711g.m2466a(f2749d).m2467a();
                    sQLiteDatabaseM2467a.beginTransaction();
                    if (z2) {
                        if (z) {
                            sQLiteDatabaseM2467a.execSQL("delete from __sd");
                        }
                    } else if (this.f2754i.size() > 0) {
                        for (int i = 0; i < this.f2754i.size(); i++) {
                            sQLiteDatabaseM2467a.execSQL("delete from __sd where __ii=\"" + ((String) this.f2754i.get(i)) + "\"");
                        }
                    }
                    sQLiteDatabaseM2467a.setTransactionSuccessful();
                } finally {
                    if (sQLiteDatabaseM2467a != null) {
                        try {
                            sQLiteDatabaseM2467a.endTransaction();
                        } catch (Throwable unused) {
                        }
                    }
                    C0711g.m2466a(f2749d).m2468b();
                }
            } catch (SQLiteDatabaseCorruptException unused2) {
                C0712h.m2472a(f2749d);
            } catch (Throwable unused3) {
                if (sQLiteDatabaseM2467a != null) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    /* JADX INFO: renamed from: h */
    public void m2511h() {
        SQLiteDatabase sQLiteDatabaseM2467a = null;
        try {
            try {
                try {
                    sQLiteDatabaseM2467a = C0711g.m2466a(f2749d).m2467a();
                    sQLiteDatabaseM2467a.beginTransaction();
                    if (this.f2755j.size() > 0) {
                        for (int i = 0; i < this.f2755j.size(); i++) {
                            sQLiteDatabaseM2467a.execSQL("delete from __et where rowid=" + this.f2755j.get(i));
                        }
                    }
                    this.f2755j.clear();
                    sQLiteDatabaseM2467a.setTransactionSuccessful();
                } finally {
                    if (sQLiteDatabaseM2467a != null) {
                        try {
                            sQLiteDatabaseM2467a.endTransaction();
                        } catch (Throwable unused) {
                        }
                    }
                    C0711g.m2466a(f2749d).m2468b();
                }
            } catch (SQLiteDatabaseCorruptException unused2) {
                C0712h.m2472a(f2749d);
            } catch (Throwable unused3) {
                if (sQLiteDatabaseM2467a != null) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    /* JADX INFO: renamed from: i */
    public void m2512i() {
        SQLiteDatabase sQLiteDatabaseM2467a = null;
        try {
            try {
                try {
                    sQLiteDatabaseM2467a = C0711g.m2466a(f2749d).m2467a();
                    sQLiteDatabaseM2467a.beginTransaction();
                    sQLiteDatabaseM2467a.execSQL("delete from __er");
                    sQLiteDatabaseM2467a.setTransactionSuccessful();
                } finally {
                    if (sQLiteDatabaseM2467a != null) {
                        try {
                            sQLiteDatabaseM2467a.endTransaction();
                        } catch (Throwable unused) {
                        }
                    }
                    C0711g.m2466a(f2749d).m2468b();
                }
            } catch (SQLiteDatabaseCorruptException unused2) {
                C0712h.m2472a(f2749d);
            } catch (Throwable unused3) {
                if (sQLiteDatabaseM2467a != null) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    /* JADX INFO: renamed from: j */
    public void m2513j() {
        SQLiteDatabase sQLiteDatabaseM2467a;
        if (!TextUtils.isEmpty(this.f2756k)) {
            try {
                sQLiteDatabaseM2467a = C0711g.m2466a(f2749d).m2467a();
                try {
                    sQLiteDatabaseM2467a.beginTransaction();
                    sQLiteDatabaseM2467a.execSQL("delete from __er where __i=\"" + this.f2756k + "\"");
                    sQLiteDatabaseM2467a.execSQL("delete from __et where __i=\"" + this.f2756k + "\"");
                    sQLiteDatabaseM2467a.setTransactionSuccessful();
                } catch (SQLiteDatabaseCorruptException unused) {
                    try {
                        C0712h.m2472a(f2749d);
                        if (sQLiteDatabaseM2467a != null) {
                        }
                        C0711g.m2466a(f2749d).m2468b();
                        this.f2756k = null;
                    } catch (Throwable th) {
                        if (sQLiteDatabaseM2467a != null) {
                            try {
                                sQLiteDatabaseM2467a.endTransaction();
                            } catch (Throwable unused2) {
                            }
                        }
                        C0711g.m2466a(f2749d).m2468b();
                        throw th;
                    }
                } catch (Throwable unused3) {
                    if (sQLiteDatabaseM2467a != null) {
                    }
                    C0711g.m2466a(f2749d).m2468b();
                    this.f2756k = null;
                }
            } catch (SQLiteDatabaseCorruptException unused4) {
                sQLiteDatabaseM2467a = null;
            } catch (Throwable unused5) {
                sQLiteDatabaseM2467a = null;
            }
            try {
                sQLiteDatabaseM2467a.endTransaction();
            } catch (Throwable unused6) {
            }
            C0711g.m2466a(f2749d).m2468b();
        }
        this.f2756k = null;
    }

    /* JADX INFO: renamed from: a */
    public void m2496a(boolean z, String str) {
        SQLiteDatabase sQLiteDatabaseM2467a = null;
        try {
            try {
                try {
                    sQLiteDatabaseM2467a = C0711g.m2466a(f2749d).m2467a();
                    sQLiteDatabaseM2467a.beginTransaction();
                    if (!TextUtils.isEmpty(str)) {
                        sQLiteDatabaseM2467a.execSQL("delete from __er where __i=\"" + str + "\"");
                        sQLiteDatabaseM2467a.execSQL("delete from __et where __i=\"" + str + "\"");
                        this.f2755j.clear();
                        sQLiteDatabaseM2467a.execSQL("delete from __sd where __ii=\"" + str + "\"");
                    }
                    sQLiteDatabaseM2467a.setTransactionSuccessful();
                } finally {
                    if (sQLiteDatabaseM2467a != null) {
                        try {
                            sQLiteDatabaseM2467a.endTransaction();
                        } catch (Throwable unused) {
                        }
                    }
                    C0711g.m2466a(f2749d).m2468b();
                }
            } catch (SQLiteDatabaseCorruptException unused2) {
                C0712h.m2472a(f2749d);
            } catch (Throwable unused3) {
                if (sQLiteDatabaseM2467a != null) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2502b(String str) {
        SQLiteDatabase sQLiteDatabaseM2467a = null;
        try {
            try {
                try {
                    sQLiteDatabaseM2467a = C0711g.m2466a(f2749d).m2467a();
                    sQLiteDatabaseM2467a.beginTransaction();
                    if (!TextUtils.isEmpty(str)) {
                        sQLiteDatabaseM2467a.execSQL("delete from __is where __ii=\"" + str + "\"");
                    }
                    sQLiteDatabaseM2467a.setTransactionSuccessful();
                } finally {
                    if (sQLiteDatabaseM2467a != null) {
                        try {
                            sQLiteDatabaseM2467a.endTransaction();
                        } catch (Throwable unused) {
                        }
                    }
                    C0711g.m2466a(f2749d).m2468b();
                }
            } catch (SQLiteDatabaseCorruptException unused2) {
                C0712h.m2472a(f2749d);
            } catch (Throwable unused3) {
                if (sQLiteDatabaseM2467a != null) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    /* JADX INFO: renamed from: l */
    private void m2491l() {
        try {
            if (TextUtils.isEmpty(f2750e)) {
                String multiProcessSP = UMUtils.getMultiProcessSP(f2749d, "ek__id");
                if (TextUtils.isEmpty(multiProcessSP)) {
                    multiProcessSP = PreferenceWrapper.getDefault(f2749d).getString("ek__id", null);
                    if (TextUtils.isEmpty(multiProcessSP)) {
                        multiProcessSP = UMUtils.genId();
                    }
                    if (!TextUtils.isEmpty(multiProcessSP)) {
                        UMUtils.setMultiProcessSP(f2749d, "ek__id", multiProcessSP);
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
                    f2750e = sb.toString();
                }
                if (TextUtils.isEmpty(f2750e)) {
                    return;
                }
                f2750e += new StringBuilder(f2750e).reverse().toString();
                String multiProcessSP2 = UMUtils.getMultiProcessSP(f2749d, "ek_key");
                if (TextUtils.isEmpty(multiProcessSP2)) {
                    UMUtils.setMultiProcessSP(f2749d, "ek_key", m2504c("umeng+"));
                } else {
                    if ("umeng+".equals(m2506d(multiProcessSP2))) {
                        return;
                    }
                    m2503b(true, false);
                    m2497a(true, false);
                    m2511h();
                    m2512i();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public String m2504c(String str) {
        try {
            return TextUtils.isEmpty(f2750e) ? str : Base64.encodeToString(DataHelper.encrypt(str.getBytes(), f2750e.getBytes()), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public String m2506d(String str) {
        try {
            return TextUtils.isEmpty(f2750e) ? str : new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), f2750e.getBytes()));
        } catch (Exception unused) {
            if (Build.VERSION.SDK_INT >= 29 && !TextUtils.isEmpty(str)) {
                try {
                    new JSONObject(str);
                    UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> UMStoreManager decrypt failed, return origin data.");
                    return str;
                } catch (Throwable unused2) {
                    return null;
                }
            }
            return null;
        }
    }
}
