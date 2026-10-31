package com.alipay.sdk.m.u0;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class b {
    public static final String b = "VMS_IDLG_SDK_DB";
    public static final String c = "content://com.vivo.vms.IdProvider/IdentifierId";
    public static final String d = "value";
    public static final String e = "OAID";
    public static final String f = "AAID";
    public static final String g = "VAID";
    public static final String h = "OAIDSTATUS";
    public static final int i = 0;
    public static final int j = 1;
    public static final int k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f77916l = 4;
    public Context a;

    public b(Context context) {
        this.a = context;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    public String a(int i2, String str) {
        Uri uri;
        Uri uri2;
        Cursor cursorQuery;
        String string = null;
        if (i2 == 0) {
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID");
        } else if (i2 == 1) {
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + str);
        } else {
            if (i2 != 2) {
                if (i2 != 4) {
                    uri2 = null;
                } else {
                    uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAIDSTATUS");
                }
                cursorQuery = this.a.getContentResolver().query(uri2, null, null, null, null);
                if (cursorQuery != null) {
                    string = cursorQuery.moveToNext() ? cursorQuery.getString(cursorQuery.getColumnIndex(d)) : null;
                    cursorQuery.close();
                }
                return string;
            }
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/AAID_" + str);
        }
        uri2 = uri;
        cursorQuery = this.a.getContentResolver().query(uri2, null, null, null, null);
        if (cursorQuery != null) {
            if (cursorQuery.moveToNext()) {
            }
            cursorQuery.close();
        }
        return string;
    }
}
