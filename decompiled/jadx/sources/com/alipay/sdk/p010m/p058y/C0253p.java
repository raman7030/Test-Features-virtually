package com.alipay.sdk.p010m.p058y;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.alipay.sdk.app.EnvUtils;
import com.alipay.sdk.p010m.p037n.C0170a;

/* JADX INFO: renamed from: com.alipay.sdk.m.y.p */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0253p {

    /* JADX INFO: renamed from: a */
    public static final String f1210a = "content://com.alipay.android.app.settings.data.ServerProvider/current_server";

    /* JADX INFO: renamed from: a */
    public static String m1241a() {
        return C0170a.f663b;
    }

    /* JADX INFO: renamed from: b */
    public static String m1243b(Context context) {
        if (EnvUtils.isPreSandBox()) {
            return C0170a.f664c;
        }
        if (EnvUtils.isNewSanBox()) {
            return C0170a.f665d;
        }
        if (context == null) {
            return C0170a.f662a;
        }
        String str = C0170a.f662a;
        return TextUtils.isEmpty(str) ? C0170a.f662a : str;
    }

    /* JADX INFO: renamed from: a */
    public static String m1242a(Context context) {
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse(f1210a), null, null, null, null);
        String string = null;
        if (cursorQuery != null && cursorQuery.getCount() > 0) {
            string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndex("url")) : null;
            cursorQuery.close();
        }
        return string;
    }
}
