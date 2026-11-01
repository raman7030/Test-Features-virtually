package p067l;

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

/* JADX INFO: renamed from: l.᩶ܳ֨, reason: contains not printable characters */
/* JADX INFO: loaded from: classes4.dex */
public final class C21586 {

    /* JADX INFO: renamed from: ᩻ */
    public static volatile C21586 f68059;

    /* JADX INFO: renamed from: ܳ */
    public BroadcastReceiver f68062;

    /* JADX INFO: renamed from: ֫ */
    public C3480 f68060 = new C3480("udid");

    /* JADX INFO: renamed from: ۧ */
    public C3480 f68061 = new C3480(C0809h.f3437d);

    /* JADX INFO: renamed from: ᩳ */
    public C3480 f68065 = new C3480("vaid");

    /* JADX INFO: renamed from: ܽ */
    public C3480 f68063 = new C3480("aaid");

    /* JADX INFO: renamed from: ܿ */
    public C16890 f68064 = new C16890();

    /* JADX INFO: renamed from: ֫ */
    public static final C21586 m48774() {
        if (f68059 == null) {
            synchronized (C21586.class) {
                if (f68059 == null) {
                    f68059 = new C21586();
                }
            }
        }
        return f68059;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22927 m48775(Cursor cursor) {
        C22927 c22927 = new C22927();
        c22927.f72154 = null;
        c22927.f72155 = 0;
        c22927.f72156 = System.currentTimeMillis() + 86400000;
        if (!cursor.isClosed()) {
            cursor.moveToFirst();
            int columnIndex = cursor.getColumnIndex(C0226b.f1011d);
            if (columnIndex >= 0) {
                c22927.f72154 = cursor.getString(columnIndex);
            }
            int columnIndex2 = cursor.getColumnIndex("code");
            if (columnIndex2 >= 0) {
                c22927.f72155 = cursor.getInt(columnIndex2);
            }
            int columnIndex3 = cursor.getColumnIndex("expired");
            if (columnIndex3 >= 0) {
                c22927.f72156 = cursor.getLong(columnIndex3);
            }
        }
        return c22927;
    }

    /* JADX INFO: renamed from: ֫ */
    private synchronized void m48776(Context context) {
        if (this.f68062 != null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.meizu.flyme.openid.ACTION_OPEN_ID_CHANGE");
        C23597 c23597 = new C23597();
        this.f68062 = c23597;
        context.registerReceiver(c23597, intentFilter, "com.meizu.flyme.openid.permission.OPEN_ID_CHANGE", null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m48777(Context context, C3480 c3480) throws Throwable {
        String str;
        Cursor cursorQuery;
        boolean zM48778;
        String str2;
        if (c3480.f6985 > System.currentTimeMillis()) {
            return c3480.f6986;
        }
        Cursor cursor = null;
        str = null;
        str = null;
        String str3 = null;
        cursor = null;
        if (!m48778(context, true)) {
            return null;
        }
        try {
            try {
                cursorQuery = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{c3480.f6987}, null);
                try {
                    if (cursorQuery != null) {
                        C22927 c22927M48775 = m48775(cursorQuery);
                        str3 = c22927M48775.f72154;
                        c3480.f6986 = str3;
                        c3480.f6985 = c22927M48775.f72156;
                        if (c22927M48775.f72155 != 1000) {
                            m48776(context);
                            if (!m48778(context, false)) {
                                zM48778 = m48778(context, true);
                                str2 = "not support, forceQuery isSupported: ";
                                str2.concat(String.valueOf(zM48778));
                            }
                        }
                    } else if (m48778(context, false)) {
                        zM48778 = m48778(context, true);
                        str2 = "forceQuery isSupported : ";
                        str2.concat(String.valueOf(zM48778));
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return str3;
                } catch (Exception e) {
                    e = e;
                    str = str3;
                    cursor = cursorQuery;
                    e.getMessage();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return str;
                } catch (Throwable th) {
                    th = th;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursorQuery = cursor;
            }
        } catch (Exception e2) {
            e = e2;
            str = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m48778(Context context, boolean z) {
        String str;
        C16890 c16890 = this.f68064;
        boolean z2 = false;
        if (c16890.m38447() && !z) {
            Boolean bool = c16890.f50006;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider("com.meizu.flyme.openidsdk", 0);
            Cursor cursorQuery = null;
            String str2 = (providerInfoResolveContentProvider == null || (providerInfoResolveContentProvider.applicationInfo.flags & 1) == 0) ? null : providerInfoResolveContentProvider.packageName;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(str2, 0);
                    str = packageInfo != null ? packageInfo.versionName : null;
                } catch (Exception e) {
                    e.getMessage();
                }
                if (c16890.m38447()) {
                    if (TextUtils.isEmpty(str) ? false : TextUtils.equals(c16890.f50005, str)) {
                        "use same version cache, safeVersion : ".concat(String.valueOf(str));
                        Boolean bool2 = c16890.f50006;
                        if (bool2 != null) {
                            return bool2.booleanValue();
                        }
                        return false;
                    }
                }
                c16890.f50005 = str;
                try {
                    try {
                        cursorQuery = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"supported"}, null);
                        if (cursorQuery == null) {
                            if (cursorQuery != null) {
                            }
                            "query support, result : ".concat(String.valueOf(z2));
                            c16890.f50006 = Boolean.valueOf(z2);
                            return z2;
                        }
                        C22927 c22927M48775 = m48775(cursorQuery);
                        if (1000 != c22927M48775.f72155 || "0".equals(c22927M48775.f72154)) {
                            z2 = true;
                        }
                    } catch (Exception e2) {
                        e2.getMessage();
                        if (cursorQuery != null) {
                        }
                    }
                    cursorQuery.close();
                    "query support, result : ".concat(String.valueOf(z2));
                    c16890.f50006 = Boolean.valueOf(z2);
                    return z2;
                } catch (Throwable th) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            }
        }
        return false;
    }
}
