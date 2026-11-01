package com.alipay.sdk.p010m.p053v;

import android.text.TextUtils;
import com.alipay.sdk.p010m.p055w.C0234b;
import com.alipay.sdk.p010m.p057x.C0237a;
import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.alipay.sdk.m.v.b */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0231b {

    /* JADX INFO: renamed from: a */
    public EnumC0230a f1063a;

    /* JADX INFO: renamed from: b */
    public String f1064b;

    /* JADX INFO: renamed from: c */
    public String[] f1065c;

    public C0231b(String str) {
        this.f1064b = str;
    }

    /* JADX INFO: renamed from: a */
    public static void m1077a(C0231b c0231b) {
        String[] strArrM1082c = c0231b.m1082c();
        if (strArrM1082c.length == 3 && TextUtils.equals("tid", strArrM1082c[0])) {
            C0237a c0237aM1142a = C0237a.m1142a(C0234b.m1121c().m1125b());
            if (TextUtils.isEmpty(strArrM1082c[1]) || TextUtils.isEmpty(strArrM1082c[2])) {
                return;
            }
            c0237aM1142a.m1143a(strArrM1082c[1], strArrM1082c[2]);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String[] m1079b(String str) {
        ArrayList arrayList = new ArrayList();
        int iIndexOf = str.indexOf(40);
        int iLastIndexOf = str.lastIndexOf(41);
        if (iIndexOf == -1 || iLastIndexOf == -1 || iLastIndexOf <= iIndexOf) {
            return null;
        }
        for (String str2 : str.substring(iIndexOf + 1, iLastIndexOf).split("' *, *'", -1)) {
            arrayList.add(str2.trim().replaceAll("'", "").replaceAll("\"", ""));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: c */
    public String[] m1082c() {
        return this.f1065c;
    }

    public C0231b(String str, EnumC0230a enumC0230a) {
        this.f1064b = str;
        this.f1063a = enumC0230a;
    }

    /* JADX INFO: renamed from: a */
    public static List m1076a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null) {
            String[] strArrM1078a = m1078a(jSONObject.optString("name", ""));
            for (int i = 0; i < strArrM1078a.length; i++) {
                EnumC0230a enumC0230aM1074a = EnumC0230a.m1074a(strArrM1078a[i]);
                if (enumC0230aM1074a != EnumC0230a.None) {
                    C0231b c0231b = new C0231b(strArrM1078a[i], enumC0230aM1074a);
                    c0231b.f1065c = m1079b(strArrM1078a[i]);
                    arrayList.add(c0231b);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public String m1081b() {
        return this.f1064b;
    }

    /* JADX INFO: renamed from: a */
    public static String[] m1078a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split(C0249l.f1196b);
    }

    /* JADX INFO: renamed from: a */
    public EnumC0230a m1080a() {
        return this.f1063a;
    }
}
