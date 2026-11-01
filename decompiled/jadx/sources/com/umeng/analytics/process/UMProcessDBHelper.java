package com.umeng.analytics.process;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.umeng.analytics.pro.C0721q;
import com.umeng.common.C0743a;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.utils.FileLockCallback;
import com.umeng.commonsdk.utils.FileLockUtil;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class UMProcessDBHelper {
    public static UMProcessDBHelper mInstance;
    public Context mContext;
    public FileLockUtil mFileLock = new FileLockUtil();
    public InsertEventCallback ekvCallBack = new InsertEventCallback();

    private int getDataSource() {
        return 0;
    }

    public class InsertEventCallback implements FileLockCallback {
        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(File file, int i) {
            return false;
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(String str) {
            return false;
        }

        public InsertEventCallback() {
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(String str, Object obj) throws Throwable {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            if (str.startsWith(InterfaceC0736a.f2997c)) {
                str = str.replaceFirst(InterfaceC0736a.f2997c, "");
            }
            UMProcessDBHelper.this.insertEvents(str.replace(InterfaceC0736a.f2998d, ""), (JSONArray) obj);
            return true;
        }
    }

    public UMProcessDBHelper() {
    }

    public UMProcessDBHelper(Context context) {
        C0743a.m2698a().m2701a(context);
    }

    public static UMProcessDBHelper getInstance(Context context) {
        if (mInstance == null) {
            synchronized (UMProcessDBHelper.class) {
                if (mInstance == null) {
                    mInstance = new UMProcessDBHelper(context);
                }
            }
        }
        UMProcessDBHelper uMProcessDBHelper = mInstance;
        uMProcessDBHelper.mContext = context;
        return uMProcessDBHelper;
    }

    public void createDBByProcess(String str) {
        try {
            C0738c.m2690a(this.mContext).m2692a(str);
            C0738c.m2690a(this.mContext).m2693b(str);
        } catch (Exception unused) {
        }
    }

    public void insertEventsInSubProcess(String str, JSONArray jSONArray) throws Throwable {
        if (AnalyticsConstants.SUB_PROCESS_EVENT && !TextUtils.isEmpty(str)) {
            File file = new File(C0737b.m2689b(this.mContext, str));
            if (file.exists()) {
                this.mFileLock.doFileOperateion(file, this.ekvCallBack, jSONArray);
            } else {
                insertEvents(str, jSONArray);
            }
        }
    }

    public void insertEvents(String str, JSONArray jSONArray) throws Throwable {
        if (AnalyticsConstants.SUB_PROCESS_EVENT && !TextUtils.isEmpty(str)) {
            insertEvents_(str, datasAdapter(str, jSONArray));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processToMain(String str) throws Throwable {
        if (dbIsExists(str)) {
            List eventByProcess = readEventByProcess(str);
            if (!eventByProcess.isEmpty() && insertEvents_(InterfaceC0736a.f3002h, eventByProcess)) {
                deleteEventDatas(str, null, eventByProcess);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0182  */
    /* JADX WARN: Code duplicated, block: B:80:0x0187 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public JSONObject readMainEvents(long j, List list) throws Throwable {
        SQLiteDatabase sQLiteDatabaseM2692a;
        Cursor cursor;
        JSONArray jSONArray;
        JSONObject jSONObject = new JSONObject();
        Cursor cursorQuery = null;
        cursorQuery = null;
        cursorQuery = null;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                sQLiteDatabaseM2692a = C0738c.m2690a(this.mContext).m2692a(InterfaceC0736a.f3002h);
                try {
                    sQLiteDatabaseM2692a.beginTransaction();
                    cursorQuery = sQLiteDatabaseM2692a.query(InterfaceC0736a.a.f3003a, null, null, null, null, null, null);
                    if (cursorQuery != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        String str = "";
                        while (cursorQuery.moveToNext()) {
                            int i = cursorQuery.getInt(cursorQuery.getColumnIndex("id"));
                            int i2 = cursorQuery.getInt(cursorQuery.getColumnIndex("__t"));
                            String string = cursorQuery.getString(cursorQuery.getColumnIndex("__i"));
                            String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("__s"));
                            String string3 = cursorQuery.getString(cursorQuery.getColumnIndex(InterfaceC0736a.a.f3008f));
                            String string4 = cursorQuery.getString(cursorQuery.getColumnIndex("__av"));
                            if (!TextUtils.isEmpty(string)) {
                                if (TextUtils.isEmpty(str)) {
                                    str = string4;
                                }
                                if (!TextUtils.isEmpty(string2) && i2 == 2049) {
                                    JSONObject jSONObject3 = new JSONObject(C0743a.m2698a().m2702b(string2));
                                    String strOptString = jSONObject3.optString("pn");
                                    if (TextUtils.isEmpty(strOptString) || "unknown".equals(strOptString)) {
                                        jSONObject3.put("pn", this.mContext.getPackageName() + ":" + string3);
                                    }
                                    if (jSONObject2.has(string)) {
                                        jSONArray = jSONObject2.optJSONArray(string);
                                    } else {
                                        jSONArray = new JSONArray();
                                    }
                                    if (C0721q.m2611a(jSONObject3) + C0721q.m2610a(jSONArray) > j || !str.equalsIgnoreCase(string4)) {
                                        break;
                                        break;
                                    }
                                    list.add(Integer.valueOf(i));
                                    jSONArray.put(jSONObject3);
                                    jSONObject2.put(string, jSONArray);
                                }
                            }
                        }
                        if (jSONObject2.length() > 0) {
                            JSONArray jSONArray2 = new JSONArray();
                            Iterator<String> itKeys = jSONObject2.keys();
                            while (itKeys.hasNext()) {
                                JSONObject jSONObject4 = new JSONObject();
                                String next = itKeys.next();
                                jSONObject4.put(next, new JSONArray(jSONObject2.optString(next)));
                                if (jSONObject4.length() > 0) {
                                    jSONArray2.put(jSONObject4);
                                }
                            }
                            if (jSONArray2.length() > 0) {
                                jSONObject.put("ekv", jSONArray2);
                            }
                        }
                    }
                    sQLiteDatabaseM2692a.setTransactionSuccessful();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    sQLiteDatabaseM2692a.endTransaction();
                } catch (Exception unused) {
                    cursor = cursorQuery;
                    sQLiteDatabase = sQLiteDatabaseM2692a;
                    try {
                        UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 构建子进程事件数据异常，清除数据库数据。");
                        sQLiteDatabase.execSQL("delete from __et_p");
                        sQLiteDatabase.setTransactionSuccessful();
                        if (cursor != null) {
                            cursor.close();
                        }
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th) {
                        th = th;
                        Cursor cursor2 = cursor;
                        sQLiteDatabaseM2692a = sQLiteDatabase;
                        cursorQuery = cursor2;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (sQLiteDatabaseM2692a != null) {
                            try {
                                sQLiteDatabaseM2692a.endTransaction();
                            } catch (Throwable unused2) {
                            }
                        }
                        C0738c.m2690a(this.mContext).m2693b(InterfaceC0736a.f3002h);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (sQLiteDatabaseM2692a != null) {
                        sQLiteDatabaseM2692a.endTransaction();
                    }
                    C0738c.m2690a(this.mContext).m2693b(InterfaceC0736a.f3002h);
                    throw th;
                }
            } catch (Throwable unused3) {
            }
        } catch (Exception unused4) {
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabaseM2692a = null;
        }
        C0738c.m2690a(this.mContext).m2693b(InterfaceC0736a.f3002h);
        return jSONObject;
    }

    public void deleteMainProcessEventDatasByIds(List list) {
        SQLiteDatabase sQLiteDatabaseM2692a = null;
        try {
            sQLiteDatabaseM2692a = C0738c.m2690a(this.mContext).m2692a(InterfaceC0736a.f3002h);
            sQLiteDatabaseM2692a.beginTransaction();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sQLiteDatabaseM2692a.delete(InterfaceC0736a.a.f3003a, "id=?", new String[]{String.valueOf((Integer) it.next())});
            }
            sQLiteDatabaseM2692a.setTransactionSuccessful();
        } catch (Exception unused) {
            if (sQLiteDatabaseM2692a != null) {
            }
            C0738c.m2690a(this.mContext).m2693b(InterfaceC0736a.f3002h);
        } catch (Throwable th) {
            if (sQLiteDatabaseM2692a != null) {
                sQLiteDatabaseM2692a.endTransaction();
            }
            C0738c.m2690a(this.mContext).m2693b(InterfaceC0736a.f3002h);
            throw th;
        }
        sQLiteDatabaseM2692a.endTransaction();
        C0738c.m2690a(this.mContext).m2693b(InterfaceC0736a.f3002h);
    }

    public void deleteEventDatas(String str, String str2, List list) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase sQLiteDatabaseM2692a = C0738c.m2690a(this.mContext).m2692a(str);
            try {
                sQLiteDatabaseM2692a.beginTransaction();
                int size = list.size();
                if (size > 0) {
                    for (int i = 0; i < size; i++) {
                        sQLiteDatabaseM2692a.execSQL("delete from __et_p where rowid=" + ((C0735a) list.get(i)).f2986a);
                    }
                } else {
                    sQLiteDatabaseM2692a.delete(InterfaceC0736a.a.f3003a, null, null);
                }
                sQLiteDatabaseM2692a.setTransactionSuccessful();
                sQLiteDatabaseM2692a.endTransaction();
            } catch (Exception unused) {
                sQLiteDatabase = sQLiteDatabaseM2692a;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                }
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = sQLiteDatabaseM2692a;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                }
                C0738c.m2690a(this.mContext).m2693b(str);
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
        C0738c.m2690a(this.mContext).m2693b(str);
    }

    private boolean insertEvents_(String str, List list) throws Throwable {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return true;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase sQLiteDatabaseM2692a = C0738c.m2690a(this.mContext).m2692a(str);
            try {
                try {
                    sQLiteDatabaseM2692a.beginTransaction();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C0735a c0735a = (C0735a) it.next();
                        try {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("__i", c0735a.f2987b);
                            contentValues.put("__e", c0735a.f2988c);
                            contentValues.put("__t", Integer.valueOf(c0735a.f2990e));
                            contentValues.put(InterfaceC0736a.a.f3008f, c0735a.f2991f);
                            contentValues.put("__av", c0735a.f2992g);
                            contentValues.put("__vc", c0735a.f2993h);
                            contentValues.put("__s", c0735a.f2989d);
                            sQLiteDatabaseM2692a.insert(InterfaceC0736a.a.f3003a, null, contentValues);
                        } catch (Exception unused) {
                        }
                    }
                    sQLiteDatabaseM2692a.setTransactionSuccessful();
                    try {
                        sQLiteDatabaseM2692a.endTransaction();
                    } catch (Throwable unused2) {
                    }
                    C0738c.m2690a(this.mContext).m2693b(str);
                    return true;
                } catch (Exception unused3) {
                    sQLiteDatabase = sQLiteDatabaseM2692a;
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Throwable unused4) {
                        }
                    }
                    C0738c.m2690a(this.mContext).m2693b(str);
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = sQLiteDatabaseM2692a;
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable unused5) {
                    }
                }
                C0738c.m2690a(this.mContext).m2693b(str);
                throw th;
            }
        } catch (Exception unused6) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private List datasAdapter(String str, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    C0735a c0735a = new C0735a();
                    c0735a.f2988c = jSONObject.optString("id");
                    c0735a.f2992g = UMUtils.getAppVersionName(this.mContext);
                    c0735a.f2993h = UMUtils.getAppVersionCode(this.mContext);
                    c0735a.f2987b = jSONObject.optString("__i");
                    c0735a.f2990e = jSONObject.optInt("__t");
                    c0735a.f2991f = str;
                    if (jSONObject.has("ds")) {
                        jSONObject.remove("ds");
                    }
                    jSONObject.put("ds", getDataSource());
                    jSONObject.remove("__i");
                    jSONObject.remove("__t");
                    c0735a.f2989d = C0743a.m2698a().m2700a(jSONObject.toString());
                    jSONObject.remove("ds");
                    arrayList.add(c0735a);
                } catch (Exception unused) {
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0084 A[Catch: Exception -> 0x0087, TRY_LEAVE, TryCatch #6 {Exception -> 0x0087, blocks: (B:30:0x007f, B:32:0x0084), top: B:54:0x007f }] */
    /* JADX WARN: Code duplicated, block: B:39:0x009a A[Catch: Exception -> 0x009d, TRY_LEAVE, TryCatch #1 {Exception -> 0x009d, blocks: (B:37:0x0095, B:39:0x009a), top: B:48:0x0095 }] */
    public JSONObject readVersionInfoFromColumId(Integer num) throws Throwable {
        Throwable th;
        SQLiteDatabase sQLiteDatabaseM2692a;
        JSONObject jSONObject;
        Cursor cursor = null;
        jSONObject = null;
        JSONObject jSONObject2 = null;
        JSONObject jSONObject3 = null;
        cursor = null;
        cursor = null;
        Cursor cursor2 = null;
        try {
            sQLiteDatabaseM2692a = C0738c.m2690a(this.mContext).m2692a(InterfaceC0736a.f3002h);
            try {
                sQLiteDatabaseM2692a.beginTransaction();
                Cursor cursorQuery = sQLiteDatabaseM2692a.query(InterfaceC0736a.a.f3003a, null, "rowid=?", new String[]{String.valueOf(num)}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        try {
                            if (cursorQuery.moveToNext()) {
                                JSONObject jSONObject4 = new JSONObject();
                                try {
                                    String string = cursorQuery.getString(cursorQuery.getColumnIndex("__av"));
                                    String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("__vc"));
                                    if (!TextUtils.isEmpty(string)) {
                                        jSONObject4.put("__av", string);
                                    }
                                    if (!TextUtils.isEmpty(string2)) {
                                        jSONObject4.put("__vc", string2);
                                    }
                                    jSONObject3 = jSONObject4;
                                } catch (Exception unused) {
                                    jSONObject2 = jSONObject4;
                                    JSONObject jSONObject5 = jSONObject2;
                                    cursor2 = cursorQuery;
                                    jSONObject = jSONObject5;
                                    if (cursor2 != null) {
                                        try {
                                            cursor2.close();
                                            if (sQLiteDatabaseM2692a != null) {
                                                sQLiteDatabaseM2692a.endTransaction();
                                            }
                                        } catch (Exception unused2) {
                                            C0738c.m2690a(this.mContext).m2693b(InterfaceC0736a.f3002h);
                                            return jSONObject;
                                        }
                                    } else if (sQLiteDatabaseM2692a != null) {
                                        sQLiteDatabaseM2692a.endTransaction();
                                    }
                                    C0738c.m2690a(this.mContext).m2693b(InterfaceC0736a.f3002h);
                                    return jSONObject;
                                }
                            }
                        } catch (Exception unused3) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            try {
                                cursor.close();
                                if (sQLiteDatabaseM2692a != null) {
                                    sQLiteDatabaseM2692a.endTransaction();
                                }
                            } catch (Exception unused4) {
                                C0738c.m2690a(this.mContext).m2693b(InterfaceC0736a.f3002h);
                                throw th;
                            }
                        } else if (sQLiteDatabaseM2692a != null) {
                            sQLiteDatabaseM2692a.endTransaction();
                        }
                        C0738c.m2690a(this.mContext).m2693b(InterfaceC0736a.f3002h);
                        throw th;
                    }
                }
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Exception unused5) {
                    }
                }
                sQLiteDatabaseM2692a.endTransaction();
                C0738c.m2690a(this.mContext).m2693b(InterfaceC0736a.f3002h);
                return jSONObject3;
            } catch (Exception unused6) {
                jSONObject = null;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception unused7) {
            jSONObject = null;
            sQLiteDatabaseM2692a = null;
        } catch (Throwable th4) {
            th = th4;
            sQLiteDatabaseM2692a = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a4 A[Catch: Exception -> 0x00a7, TRY_LEAVE, TryCatch #4 {Exception -> 0x00a7, blocks: (B:22:0x009f, B:24:0x00a4), top: B:38:0x009f }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.umeng.analytics.process.UMProcessDBHelper$1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v7 */
    private List readEventByProcess(String str) throws Throwable {
        SQLiteDatabase sQLiteDatabaseM2692a;
        ArrayList arrayList = new ArrayList();
        ?? r1 = 0;
        cursor = null;
        r1 = 0;
        Cursor cursor = null;
        try {
            try {
                sQLiteDatabaseM2692a = C0738c.m2690a(this.mContext).m2692a(str);
                try {
                    sQLiteDatabaseM2692a.beginTransaction();
                    Cursor cursorQuery = sQLiteDatabaseM2692a.query(InterfaceC0736a.a.f3003a, null, null, null, null, null, null);
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            try {
                                C0735a c0735a = new C0735a();
                                c0735a.f2986a = cursorQuery.getInt(0);
                                c0735a.f2987b = cursorQuery.getString(cursorQuery.getColumnIndex("__i"));
                                c0735a.f2988c = cursorQuery.getString(cursorQuery.getColumnIndex("__e"));
                                c0735a.f2989d = cursorQuery.getString(cursorQuery.getColumnIndex("__s"));
                                c0735a.f2990e = cursorQuery.getInt(cursorQuery.getColumnIndex("__t"));
                                c0735a.f2991f = cursorQuery.getString(cursorQuery.getColumnIndex(InterfaceC0736a.a.f3008f));
                                c0735a.f2992g = cursorQuery.getString(cursorQuery.getColumnIndex("__av"));
                                c0735a.f2993h = cursorQuery.getString(cursorQuery.getColumnIndex("__vc"));
                                arrayList.add(c0735a);
                            } catch (Exception unused) {
                                cursor = cursorQuery;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (sQLiteDatabaseM2692a != null) {
                                }
                                C0738c.m2690a(this.mContext).m2693b(str);
                                return arrayList;
                            } catch (Throwable th) {
                                th = th;
                                r1 = cursorQuery;
                                if (r1 != 0) {
                                    try {
                                        r1.close();
                                        if (sQLiteDatabaseM2692a != null) {
                                            sQLiteDatabaseM2692a.endTransaction();
                                        }
                                    } catch (Exception unused2) {
                                        C0738c.m2690a(this.mContext).m2693b(str);
                                        throw th;
                                    }
                                } else if (sQLiteDatabaseM2692a != null) {
                                    sQLiteDatabaseM2692a.endTransaction();
                                }
                                C0738c.m2690a(this.mContext).m2693b(str);
                                throw th;
                            }
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Exception unused3) {
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception unused4) {
            }
        } catch (Exception unused5) {
            sQLiteDatabaseM2692a = null;
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabaseM2692a = null;
        }
        sQLiteDatabaseM2692a.endTransaction();
        C0738c.m2690a(this.mContext).m2693b(str);
        return arrayList;
    }

    private boolean dbIsExists(String str) {
        try {
            return new File(C0737b.m2689b(this.mContext, str)).exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.umeng.analytics.process.UMProcessDBHelper$a */
    public class C0735a implements Serializable {

        /* JADX INFO: renamed from: a */
        public int f2986a;

        /* JADX INFO: renamed from: b */
        public String f2987b;

        /* JADX INFO: renamed from: c */
        public String f2988c;

        /* JADX INFO: renamed from: d */
        public String f2989d;

        /* JADX INFO: renamed from: e */
        public int f2990e;

        /* JADX INFO: renamed from: f */
        public String f2991f;

        /* JADX INFO: renamed from: g */
        public String f2992g;

        /* JADX INFO: renamed from: h */
        public String f2993h;

        public C0735a() {
        }
    }

    public class ProcessToMainCallback implements FileLockCallback {
        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(File file, int i) {
            return false;
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(String str, Object obj) {
            return false;
        }

        public ProcessToMainCallback() {
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(String str) throws Throwable {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            if (str.startsWith(InterfaceC0736a.f2997c)) {
                str = str.replaceFirst(InterfaceC0736a.f2997c, "");
            }
            UMProcessDBHelper.this.processToMain(str.replace(InterfaceC0736a.f2998d, ""));
            return true;
        }
    }

    public void processDBToMain() {
        try {
            DBFileTraversalUtil.traverseDBFiles(C0737b.m2687a(this.mContext), new ProcessToMainCallback(), new DBFileTraversalUtil.InterfaceC0732a() { // from class: com.umeng.analytics.process.UMProcessDBHelper.1
                @Override // com.umeng.analytics.process.DBFileTraversalUtil.InterfaceC0732a
                /* JADX INFO: renamed from: a */
                public void mo2685a() {
                    if (AnalyticsConstants.SUB_PROCESS_EVENT) {
                        UMWorkDispatch.sendEvent(UMProcessDBHelper.this.mContext, UMProcessDBDatasSender.UM_PROCESS_CONSTRUCTMESSAGE, UMProcessDBDatasSender.getInstance(UMProcessDBHelper.this.mContext), null);
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    private boolean processIsService(Context context) {
        try {
            return context.getPackageManager().getServiceInfo(new ComponentName(context, this.mContext.getClass()), 0) != null;
        } catch (Exception unused) {
        }
    }
}
