package com.alipay.sdk.m.n0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.idtracking.h;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class f {
    public static volatile f g;
    public static boolean h;
    public BroadcastReceiver f;
    public a a = new a("udid");
    public a b = new a(h.d);
    public a d = new a("vaid");
    public a c = new a("aaid");
    public c e = new c();

    public static d a(Cursor cursor) {
        d dVar = new d(null, 0);
        if (cursor == null) {
            a("parseValue fail, cursor is null.");
            return dVar;
        }
        if (cursor.isClosed()) {
            a("parseValue fail, cursor is closed.");
            return dVar;
        }
        cursor.moveToFirst();
        int columnIndex = cursor.getColumnIndex(com.alipay.sdk.m.u0.b.d);
        if (columnIndex >= 0) {
            dVar.a = cursor.getString(columnIndex);
        } else {
            a("parseValue fail, index < 0.");
        }
        int columnIndex2 = cursor.getColumnIndex("code");
        if (columnIndex2 >= 0) {
            dVar.b = cursor.getInt(columnIndex2);
        } else {
            a("parseCode fail, index < 0.");
        }
        int columnIndex3 = cursor.getColumnIndex("expired");
        if (columnIndex3 >= 0) {
            dVar.c = cursor.getLong(columnIndex3);
            return dVar;
        }
        a("parseExpired fail, index < 0.");
        return dVar;
    }

    public static final f a() {
        if (g == null) {
            synchronized (f.class) {
                if (g == null) {
                    g = new f();
                }
            }
        }
        return g;
    }

    public static String a(PackageManager packageManager, String str) {
        ProviderInfo providerInfoResolveContentProvider;
        if (packageManager == null || (providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0)) == null || (providerInfoResolveContentProvider.applicationInfo.flags & 1) == 0) {
            return null;
        }
        return providerInfoResolveContentProvider.packageName;
    }

    public static void a(String str) {
    }

    public static void a(boolean z) {
        h = z;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0056 A[PHI: r7
      0x0056: PHI (r7v3 android.database.Cursor) = (r7v2 android.database.Cursor), (r7v4 android.database.Cursor) binds: [B:18:0x0054, B:12:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean a(Context context) {
        a("querySupport version : 1.0.8");
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"supported"}, null);
                if (cursorQuery != null) {
                    d dVarA = a(cursorQuery);
                    boolean z = 1000 != dVarA.b || "0".equals(dVarA.a);
                    cursorQuery.close();
                    return z;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Exception e) {
                a("querySupport, Exception : " + e.getMessage());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
            return false;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public static String b(PackageManager packageManager, String str) {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
            return null;
        } catch (Exception e) {
            a("getAppVersion, Exception : " + e.getMessage());
            return null;
        }
    }

    public final String a(Context context, a aVar) {
        String str;
        if (aVar == null) {
            str = "getId, openId = null.";
        } else {
            if (aVar.a()) {
                return aVar.b;
            }
            if (a(context, true)) {
                return b(context, aVar);
            }
            str = "getId, isSupported = false.";
        }
        a(str);
        return null;
    }

    public final boolean a(Context context, boolean z) {
        if (this.e.a() && !z) {
            return this.e.b();
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        String strA = a(packageManager, "com.meizu.flyme.openidsdk");
        if (TextUtils.isEmpty(strA)) {
            return false;
        }
        String strB = b(packageManager, strA);
        if (this.e.a() && this.e.a(strB)) {
            a("use same version cache, safeVersion : ".concat(String.valueOf(strB)));
            return this.e.b();
        }
        this.e.b(strB);
        boolean zA = a(context);
        a("query support, result : ".concat(String.valueOf(zA)));
        this.e.a(zA);
        return zA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.database.Cursor] */
    public final String b(Context context, a aVar) throws Throwable {
        String str;
        ?? Query;
        String str2;
        boolean zA;
        String str3;
        String str4;
        a("queryId : " + aVar.c);
        ?? r0 = 0;
        str = null;
        String str5 = null;
        String str6 = null;
        ?? r1 = 0;
        try {
            try {
                Query = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{aVar.c}, null);
                try {
                    if (Query != 0) {
                        d dVarA = a((Cursor) Query);
                        str4 = dVarA.a;
                        aVar.a(str4);
                        aVar.a(dVarA.c);
                        aVar.a(dVarA.b);
                        a(aVar.c + " errorCode : " + aVar.d);
                        if (dVarA.b != 1000) {
                            b(context);
                            if (!a(context, false)) {
                                str5 = str4;
                                str5 = str4;
                                zA = a(context, true);
                                str3 = "not support, forceQuery isSupported: ";
                                str6 = str4;
                                a(str3.concat(String.valueOf(zA)));
                                str5 = str6;
                            }
                        }
                    } else if (a(context, false)) {
                        zA = a(context, true);
                        str3 = "forceQuery isSupported : ";
                        a(str3.concat(String.valueOf(zA)));
                        str5 = str6;
                    }
                    if (Query == 0) {
                        return str5;
                    }
                } catch (Exception e) {
                    e = e;
                    str = str6;
                    r1 = Query;
                    a("queryId, Exception : " + e.getMessage());
                    r0 = r1;
                    str2 = str;
                    if (r1 != 0) {
                        Query = r1;
                        str5 = str;
                    }
                    return str2;
                } catch (Throwable th) {
                    th = th;
                    if (Query != 0) {
                        Query.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                Query = r0;
            }
        } catch (Exception e2) {
            e = e2;
            str = null;
        }
        Query.close();
        str2 = str5;
        r0 = str5;
        return str2;
    }

    public final synchronized void b(Context context) {
        if (this.f != null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.meizu.flyme.openid.ACTION_OPEN_ID_CHANGE");
        e eVar = new e();
        this.f = eVar;
        context.registerReceiver(eVar, intentFilter, "com.meizu.flyme.openid.permission.OPEN_ID_CHANGE", null);
    }
}
