package com.alipay.apmobilesecuritysdk.p007d;

import android.content.Context;
import com.alipay.sdk.p010m.p020e0.C0110b;
import com.alipay.sdk.p010m.p055w.C0233a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.alipay.apmobilesecuritysdk.d.e */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0052e {

    /* JADX INFO: renamed from: a */
    public static Map f169a;

    /* JADX INFO: renamed from: b */
    public static final String[] f170b = {"AD1", "AD2", "AD3", "AD8", "AD9", "AD10", "AD11", "AD12", "AD14", "AD15", "AD16", "AD18", "AD20", "AD21", "AD23", "AD24", "AD26", "AD27", "AD28", "AD29", "AD30", "AD31", "AD34", "AA1", "AA2", "AA3", "AA4", "AC4", "AC10", "AE1", "AE2", "AE3", "AE4", "AE5", "AE6", "AE7", "AE8", "AE9", "AE10", "AE11", "AE12", "AE13", "AE14", "AE15"};

    /* JADX INFO: renamed from: a */
    public static String m307a(Map map) {
        if (map == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            String str = (String) arrayList.get(i);
            String str2 = (String) map.get(str);
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            StringBuilder sb = new StringBuilder();
            if (i != 0) {
                str3 = C0233a.f1084p;
            }
            sb.append(str3);
            sb.append(str);
            sb.append("=");
            sb.append(str2);
            stringBuffer.append(sb.toString());
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    public static synchronized Map m308a(Context context, Map map) {
        if (f169a == null) {
            m311c(context, map);
        }
        f169a.putAll(C0051d.m306b(context));
        return f169a;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m309a() {
        f169a = null;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized String m310b(Context context, Map map) {
        TreeMap treeMap;
        m308a(context, map);
        treeMap = new TreeMap();
        for (String str : f170b) {
            if (f169a.containsKey(str)) {
                treeMap.put(str, (String) f169a.get(str));
            }
        }
        return C0110b.m582a(m307a(treeMap));
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m311c(Context context, Map map) {
        TreeMap treeMap = new TreeMap();
        f169a = treeMap;
        treeMap.putAll(C0049b.m303a(context, map));
        f169a.putAll(C0051d.m305a(context));
        f169a.putAll(C0050c.m304a(context));
        f169a.putAll(C0048a.m302a(context, map));
    }
}
