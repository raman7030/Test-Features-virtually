package com.alipay.sdk.p010m.p052u0;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: renamed from: com.alipay.sdk.m.u0.b */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0226b {

    /* JADX INFO: renamed from: b */
    public static final String f1009b = "VMS_IDLG_SDK_DB";

    /* JADX INFO: renamed from: c */
    public static final String f1010c = "content://com.vivo.vms.IdProvider/IdentifierId";

    /* JADX INFO: renamed from: d */
    public static final String f1011d = "value";

    /* JADX INFO: renamed from: e */
    public static final String f1012e = "OAID";

    /* JADX INFO: renamed from: f */
    public static final String f1013f = "AAID";

    /* JADX INFO: renamed from: g */
    public static final String f1014g = "VAID";

    /* JADX INFO: renamed from: h */
    public static final String f1015h = "OAIDSTATUS";

    /* JADX INFO: renamed from: i */
    public static final int f1016i = 0;

    /* JADX INFO: renamed from: j */
    public static final int f1017j = 1;

    /* JADX INFO: renamed from: k */
    public static final int f1018k = 2;

    /* JADX INFO: renamed from: l */
    public static final int f1019l = 4;

    /* JADX INFO: renamed from: a */
    public Context f1020a;

    public C0226b(Context context) {
        this.f1020a = context;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX INFO: renamed from: a */
    public String m1053a(int i, String str) {
        Uri uri;
        Uri uri2;
        Cursor cursorQuery;
        String string = null;
        if (i == 0) {
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID");
        } else if (i == 1) {
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + str);
        } else {
            if (i != 2) {
                if (i != 4) {
                    uri2 = null;
                } else {
                    uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAIDSTATUS");
                }
                cursorQuery = this.f1020a.getContentResolver().query(uri2, null, null, null, null);
                if (cursorQuery != null) {
                    string = cursorQuery.moveToNext() ? cursorQuery.getString(cursorQuery.getColumnIndex(f1011d)) : null;
                    cursorQuery.close();
                }
                return string;
            }
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/AAID_" + str);
        }
        uri2 = uri;
        cursorQuery = this.f1020a.getContentResolver().query(uri2, null, null, null, null);
        if (cursorQuery != null) {
            if (cursorQuery.moveToNext()) {
            }
            cursorQuery.close();
        }
        return string;
    }
}
