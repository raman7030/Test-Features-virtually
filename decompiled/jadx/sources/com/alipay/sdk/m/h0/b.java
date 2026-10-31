package com.alipay.sdk.m.h0;

import android.content.Context;
import com.amazonaws.auth.AWS4Signer;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import l.C16014;
import org.json.JSONObject;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class b {
    public File a;
    public com.alipay.sdk.m.l0.a b;

    public b(String str, com.alipay.sdk.m.l0.a aVar) {
        this.a = null;
        this.b = null;
        this.a = new File(str);
        this.b = aVar;
    }

    public static String a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "id");
            jSONObject.put(com.umeng.analytics.pro.d.O, str);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public final synchronized void a() {
        File file = this.a;
        if (file == null) {
            return;
        }
        if (file.exists() && this.a.isDirectory() && this.a.list().length != 0) {
            ArrayList arrayList = new ArrayList();
            for (String str : this.a.list()) {
                arrayList.add(str);
            }
            Collections.sort(arrayList);
            String str2 = (String) arrayList.get(arrayList.size() - 1);
            int size = arrayList.size();
            if (str2.equals(b())) {
                if (arrayList.size() < 2) {
                    return;
                }
                str2 = (String) arrayList.get(arrayList.size() - 2);
                size--;
            }
            if (!this.b.logCollect(a(com.alipay.sdk.m.d0.b.a(this.a.getAbsolutePath(), str2)))) {
                size--;
            }
            for (int i = 0; i < size; i++) {
                new File(this.a, (String) arrayList.get(i)).delete();
            }
        }
    }

    public void a(Context context) {
        new Thread(new c(this)).start();
    }

    public static String b() {
        return C16014.m37867(new SimpleDateFormat(AWS4Signer.DATE_PATTERN).format(Calendar.getInstance().getTime()), ".log");
    }
}
