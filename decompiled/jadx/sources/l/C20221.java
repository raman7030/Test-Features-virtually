package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.alipay.sdk.m.u0.b;
import com.umeng.commonsdk.statistics.idtracking.h;

/* JADX INFO: renamed from: l.᩶ܳ֨, reason: contains not printable characters */
/* JADX INFO: loaded from: classes4.dex */
public final class C20221 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static volatile C20221 f65411;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public BroadcastReceiver f65414;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C1170 f65412 = new C1170("udid");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C1170 f65413 = new C1170(h.d);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C1170 f65417 = new C1170("vaid");

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C1170 f65415 = new C1170("aaid");

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C15280 f65416 = new C15280();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C20221 m46454() {
        if (f65411 == null) {
            synchronized (C20221.class) {
                if (f65411 == null) {
                    f65411 = new C20221();
                }
            }
        }
        return f65411;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21632 m46455(Cursor cursor) {
        C21632 c21632 = new C21632();
        c21632.f69451 = null;
        c21632.f69452 = 0;
        c21632.f69453 = System.currentTimeMillis() + 86400000;
        if (!cursor.isClosed()) {
            cursor.moveToFirst();
            int columnIndex = cursor.getColumnIndex(b.d);
            if (columnIndex >= 0) {
                c21632.f69451 = cursor.getString(columnIndex);
            }
            int columnIndex2 = cursor.getColumnIndex("code");
            if (columnIndex2 >= 0) {
                c21632.f69452 = cursor.getInt(columnIndex2);
            }
            int columnIndex3 = cursor.getColumnIndex("expired");
            if (columnIndex3 >= 0) {
                c21632.f69453 = cursor.getLong(columnIndex3);
            }
        }
        return c21632;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private synchronized void m46456(Context context) {
        if (this.f65414 != null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.meizu.flyme.openid.ACTION_OPEN_ID_CHANGE");
        C22337 c22337 = new C22337();
        this.f65414 = c22337;
        context.registerReceiver(c22337, intentFilter, "com.meizu.flyme.openid.permission.OPEN_ID_CHANGE", null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m46457(Context context, C1170 c1170) throws Throwable {
        String str;
        Cursor cursorQuery;
        boolean zM46458;
        String str2;
        if (c1170.f4216 > System.currentTimeMillis()) {
            return c1170.f4217;
        }
        Cursor cursor = null;
        str = null;
        str = null;
        String str3 = null;
        cursor = null;
        if (!m46458(context, true)) {
            return null;
        }
        try {
            try {
                cursorQuery = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{c1170.f4218}, null);
                try {
                    if (cursorQuery != null) {
                        C21632 c21632M46455 = m46455(cursorQuery);
                        str3 = c21632M46455.f69451;
                        c1170.f4217 = str3;
                        c1170.f4216 = c21632M46455.f69453;
                        if (c21632M46455.f69452 != 1000) {
                            m46456(context);
                            if (!m46458(context, false)) {
                                zM46458 = m46458(context, true);
                                str2 = "not support, forceQuery isSupported: ";
                                str2.concat(String.valueOf(zM46458));
                            }
                        }
                    } else if (m46458(context, false)) {
                        zM46458 = m46458(context, true);
                        str2 = "forceQuery isSupported : ";
                        str2.concat(String.valueOf(zM46458));
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m46458(Context context, boolean z) {
        String str;
        C15280 c15280 = this.f65416;
        boolean z2 = false;
        if (c15280.m36286() && !z) {
            Boolean bool = c15280.f46879;
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
                if (c15280.m36286()) {
                    if (TextUtils.isEmpty(str) ? false : TextUtils.equals(c15280.f46878, str)) {
                        "use same version cache, safeVersion : ".concat(String.valueOf(str));
                        Boolean bool2 = c15280.f46879;
                        if (bool2 != null) {
                            return bool2.booleanValue();
                        }
                        return false;
                    }
                }
                c15280.f46878 = str;
                try {
                    try {
                        cursorQuery = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"supported"}, null);
                        if (cursorQuery == null) {
                            if (cursorQuery != null) {
                            }
                            "query support, result : ".concat(String.valueOf(z2));
                            c15280.f46879 = Boolean.valueOf(z2);
                            return z2;
                        }
                        C21632 c21632M46455 = m46455(cursorQuery);
                        if (1000 != c21632M46455.f69452 || "0".equals(c21632M46455.f69451)) {
                            z2 = true;
                        }
                    } catch (Exception e2) {
                        e2.getMessage();
                        if (cursorQuery != null) {
                        }
                    }
                    cursorQuery.close();
                    "query support, result : ".concat(String.valueOf(z2));
                    c15280.f46879 = Boolean.valueOf(z2);
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
