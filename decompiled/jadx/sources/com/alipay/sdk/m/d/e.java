package com.alipay.sdk.m.d;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class e implements com.alipay.sdk.m.c.b {
    public static final String a = "content://cn.nubia.provider.deviceid.dataid/oaid";

    @Override // com.alipay.sdk.m.c.b
    public String a(Context context) {
        String string = null;
        if (context == null) {
            return null;
        }
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://cn.nubia.provider.deviceid.dataid/oaid"), null, null, null, null);
        if (cursorQuery != null) {
            string = cursorQuery.moveToNext() ? cursorQuery.getString(cursorQuery.getColumnIndex("device_ids_grndid")) : null;
            cursorQuery.close();
        }
        return string;
    }
}
