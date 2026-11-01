package p067l;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.alipay.sdk.p010m.p052u0.C0226b;

/* JADX INFO: renamed from: l.᩻۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1U8 */
/* JADX INFO: loaded from: classes.dex */
public final class C24906 implements InterfaceC10825 {

    /* JADX INFO: renamed from: ֫ */
    public Object f79538;

    public /* synthetic */ C24906(Object obj) {
        this.f79538 = obj;
    }

    @Override // p067l.InterfaceC10825
    /* JADX INFO: renamed from: ֫ */
    public void mo3627(C5187 c5187) {
        c5187.m48104((C17529) this.f79538);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0054  */
    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    /* JADX INFO: renamed from: ֫ */
    public String m54693(int i, String str) {
        Uri uri;
        Uri uri2;
        Cursor cursorQuery;
        String string = null;
        if (i == 0) {
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID");
        } else if (i == 1) {
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + str);
        } else if (i == 2) {
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/AAID_" + str);
        } else {
            if (i != 4) {
                uri2 = null;
            } else {
                uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAIDSTATUS");
            }
            cursorQuery = ((Context) this.f79538).getContentResolver().query(uri2, null, null, null, null);
            if (cursorQuery != null) {
                string = cursorQuery.moveToNext() ? cursorQuery.getString(cursorQuery.getColumnIndex(C0226b.f1011d)) : null;
                cursorQuery.close();
            }
            return string;
        }
        uri2 = uri;
        cursorQuery = ((Context) this.f79538).getContentResolver().query(uri2, null, null, null, null);
        if (cursorQuery != null) {
            if (cursorQuery.moveToNext()) {
            }
            cursorQuery.close();
        }
        return string;
    }
}
