package com.umeng.analytics.pro;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: compiled from: SAPF */
/* JADX INFO: loaded from: classes.dex */
public class ag implements z {
    public static final String a = "content://cn.nubia.provider.deviceid.dataid/oaid";

    @Override // com.umeng.analytics.pro.z
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
