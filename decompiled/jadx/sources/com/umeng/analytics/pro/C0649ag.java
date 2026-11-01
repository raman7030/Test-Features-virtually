package com.umeng.analytics.pro;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: renamed from: com.umeng.analytics.pro.ag */
/* JADX INFO: compiled from: SAPF */
/* JADX INFO: loaded from: classes.dex */
public class C0649ag implements InterfaceC0730z {

    /* JADX INFO: renamed from: a */
    public static final String f2240a = "content://cn.nubia.provider.deviceid.dataid/oaid";

    @Override // com.umeng.analytics.pro.InterfaceC0730z
    /* JADX INFO: renamed from: a */
    public String mo2131a(Context context) {
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
