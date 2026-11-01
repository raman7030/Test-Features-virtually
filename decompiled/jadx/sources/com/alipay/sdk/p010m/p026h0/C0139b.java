package com.alipay.sdk.p010m.p026h0;

import android.content.Context;
import com.alipay.sdk.p010m.p018d0.C0107b;
import com.alipay.sdk.p010m.p034l0.InterfaceC0165a;
import com.amazonaws.auth.AWS4Signer;
import com.umeng.analytics.pro.C0708d;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import org.json.JSONObject;
import p067l.C17588;

/* JADX INFO: renamed from: com.alipay.sdk.m.h0.b */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0139b {

    /* JADX INFO: renamed from: a */
    public File f477a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0165a f478b;

    public C0139b(String str, InterfaceC0165a interfaceC0165a) {
        this.f477a = null;
        this.f478b = null;
        this.f477a = new File(str);
        this.f478b = interfaceC0165a;
    }

    /* JADX INFO: renamed from: a */
    public static String m684a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "id");
            jSONObject.put(C0708d.f2599O, str);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m687a() {
        File file = this.f477a;
        if (file == null) {
            return;
        }
        if (file.exists() && this.f477a.isDirectory() && this.f477a.list().length != 0) {
            ArrayList arrayList = new ArrayList();
            for (String str : this.f477a.list()) {
                arrayList.add(str);
            }
            Collections.sort(arrayList);
            String str2 = (String) arrayList.get(arrayList.size() - 1);
            int size = arrayList.size();
            if (str2.equals(m686b())) {
                if (arrayList.size() < 2) {
                    return;
                }
                str2 = (String) arrayList.get(arrayList.size() - 2);
                size--;
            }
            if (!this.f478b.logCollect(m684a(C0107b.m573a(this.f477a.getAbsolutePath(), str2)))) {
                size--;
            }
            for (int i = 0; i < size; i++) {
                new File(this.f477a, (String) arrayList.get(i)).delete();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m688a(Context context) {
        new Thread(new RunnableC0140c(this)).start();
    }

    /* JADX INFO: renamed from: b */
    public static String m686b() {
        return C17588.m40053(new SimpleDateFormat(AWS4Signer.DATE_PATTERN).format(Calendar.getInstance().getTime()), ".log");
    }
}
