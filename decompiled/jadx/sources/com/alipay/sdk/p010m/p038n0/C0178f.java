package com.alipay.sdk.p010m.p038n0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.alipay.sdk.p010m.p052u0.C0226b;
import com.umeng.commonsdk.statistics.idtracking.C0809h;

/* JADX INFO: renamed from: com.alipay.sdk.m.n0.f */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0178f {

    /* JADX INFO: renamed from: g */
    public static volatile C0178f f730g;

    /* JADX INFO: renamed from: h */
    public static boolean f731h;

    /* JADX INFO: renamed from: f */
    public BroadcastReceiver f737f;

    /* JADX INFO: renamed from: a */
    public C0173a f732a = new C0173a("udid");

    /* JADX INFO: renamed from: b */
    public C0173a f733b = new C0173a(C0809h.f3437d);

    /* JADX INFO: renamed from: d */
    public C0173a f735d = new C0173a("vaid");

    /* JADX INFO: renamed from: c */
    public C0173a f734c = new C0173a("aaid");

    /* JADX INFO: renamed from: e */
    public C0175c f736e = new C0175c();

    /* JADX INFO: renamed from: a */
    public static C0176d m813a(Cursor cursor) {
        C0176d c0176d = new C0176d(null, 0);
        if (cursor == null) {
            m816a("parseValue fail, cursor is null.");
            return c0176d;
        }
        if (cursor.isClosed()) {
            m816a("parseValue fail, cursor is closed.");
            return c0176d;
        }
        cursor.moveToFirst();
        int columnIndex = cursor.getColumnIndex(C0226b.f1011d);
        if (columnIndex >= 0) {
            c0176d.f727a = cursor.getString(columnIndex);
        } else {
            m816a("parseValue fail, index < 0.");
        }
        int columnIndex2 = cursor.getColumnIndex("code");
        if (columnIndex2 >= 0) {
            c0176d.f728b = cursor.getInt(columnIndex2);
        } else {
            m816a("parseCode fail, index < 0.");
        }
        int columnIndex3 = cursor.getColumnIndex("expired");
        if (columnIndex3 >= 0) {
            c0176d.f729c = cursor.getLong(columnIndex3);
            return c0176d;
        }
        m816a("parseExpired fail, index < 0.");
        return c0176d;
    }

    /* JADX INFO: renamed from: a */
    public static final C0178f m814a() {
        if (f730g == null) {
            synchronized (C0178f.class) {
                if (f730g == null) {
                    f730g = new C0178f();
                }
            }
        }
        return f730g;
    }

    /* JADX INFO: renamed from: a */
    public static String m815a(PackageManager packageManager, String str) {
        ProviderInfo providerInfoResolveContentProvider;
        if (packageManager == null || (providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0)) == null || (providerInfoResolveContentProvider.applicationInfo.flags & 1) == 0) {
            return null;
        }
        return providerInfoResolveContentProvider.packageName;
    }

    /* JADX INFO: renamed from: a */
    public static void m816a(String str) {
    }

    /* JADX INFO: renamed from: a */
    public static void m817a(boolean z) {
        f731h = z;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0056 A[PHI: r7
      0x0056: PHI (r7v3 android.database.Cursor) = (r7v2 android.database.Cursor), (r7v4 android.database.Cursor) binds: [B:18:0x0054, B:12:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    public static boolean m818a(Context context) {
        m816a("querySupport version : 1.0.8");
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"supported"}, null);
                if (cursorQuery != null) {
                    C0176d c0176dM813a = m813a(cursorQuery);
                    boolean z = 1000 != c0176dM813a.f728b || "0".equals(c0176dM813a.f727a);
                    cursorQuery.close();
                    return z;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Exception e) {
                m816a("querySupport, Exception : " + e.getMessage());
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

    /* JADX INFO: renamed from: b */
    public static String m819b(PackageManager packageManager, String str) {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
            return null;
        } catch (Exception e) {
            m816a("getAppVersion, Exception : " + e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m820a(Context context, C0173a c0173a) {
        String str;
        if (c0173a == null) {
            str = "getId, openId = null.";
        } else {
            if (c0173a.m800a()) {
                return c0173a.f720b;
            }
            if (m821a(context, true)) {
                return m822b(context, c0173a);
            }
            str = "getId, isSupported = false.";
        }
        m816a(str);
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m821a(Context context, boolean z) {
        if (this.f736e.m809a() && !z) {
            return this.f736e.m812b();
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        String strM815a = m815a(packageManager, "com.meizu.flyme.openidsdk");
        if (TextUtils.isEmpty(strM815a)) {
            return false;
        }
        String strM819b = m819b(packageManager, strM815a);
        if (this.f736e.m809a() && this.f736e.m810a(strM819b)) {
            m816a("use same version cache, safeVersion : ".concat(String.valueOf(strM819b)));
            return this.f736e.m812b();
        }
        this.f736e.m811b(strM819b);
        boolean zM818a = m818a(context);
        m816a("query support, result : ".concat(String.valueOf(zM818a)));
        this.f736e.m808a(zM818a);
        return zM818a;
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
    /* JADX INFO: renamed from: b */
    public final String m822b(Context context, C0173a c0173a) throws Throwable {
        String str;
        ?? Query;
        String str2;
        boolean zM821a;
        String str3;
        String str4;
        m816a("queryId : " + c0173a.f721c);
        ?? r0 = 0;
        str = null;
        String str5 = null;
        String str6 = null;
        ?? r1 = 0;
        try {
            try {
                Query = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{c0173a.f721c}, null);
                try {
                    if (Query != 0) {
                        C0176d c0176dM813a = m813a((Cursor) Query);
                        str4 = c0176dM813a.f727a;
                        c0173a.m799a(str4);
                        c0173a.m798a(c0176dM813a.f729c);
                        c0173a.m797a(c0176dM813a.f728b);
                        m816a(c0173a.f721c + " errorCode : " + c0173a.f722d);
                        if (c0176dM813a.f728b != 1000) {
                            m823b(context);
                            if (!m821a(context, false)) {
                                str5 = str4;
                                str5 = str4;
                                zM821a = m821a(context, true);
                                str3 = "not support, forceQuery isSupported: ";
                                str6 = str4;
                                m816a(str3.concat(String.valueOf(zM821a)));
                                str5 = str6;
                            }
                        }
                    } else if (m821a(context, false)) {
                        zM821a = m821a(context, true);
                        str3 = "forceQuery isSupported : ";
                        m816a(str3.concat(String.valueOf(zM821a)));
                        str5 = str6;
                    }
                    if (Query == 0) {
                        return str5;
                    }
                } catch (Exception e) {
                    e = e;
                    str = str6;
                    r1 = Query;
                    m816a("queryId, Exception : " + e.getMessage());
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

    /* JADX INFO: renamed from: b */
    public final synchronized void m823b(Context context) {
        if (this.f737f != null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.meizu.flyme.openid.ACTION_OPEN_ID_CHANGE");
        C0177e c0177e = new C0177e();
        this.f737f = c0177e;
        context.registerReceiver(c0177e, intentFilter, "com.meizu.flyme.openid.permission.OPEN_ID_CHANGE", null);
    }
}
