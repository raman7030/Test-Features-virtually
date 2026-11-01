package com.alipay.sdk.p010m.p017d;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.alipay.sdk.p010m.p015c.InterfaceC0089b;

/* JADX INFO: renamed from: com.alipay.sdk.m.d.e */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0101e implements InterfaceC0089b {

    /* JADX INFO: renamed from: a */
    public static final String f450a = "content://cn.nubia.provider.deviceid.dataid/oaid";

    @Override // com.alipay.sdk.p010m.p015c.InterfaceC0089b
    /* JADX INFO: renamed from: a */
    public String mo479a(Context context) {
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
