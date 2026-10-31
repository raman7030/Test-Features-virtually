package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class e {
    public static Map a;
    public static final String[] b = {"AD1", "AD2", "AD3", "AD8", "AD9", "AD10", "AD11", "AD12", "AD14", "AD15", "AD16", "AD18", "AD20", "AD21", "AD23", "AD24", "AD26", "AD27", "AD28", "AD29", "AD30", "AD31", "AD34", "AA1", "AA2", "AA3", "AA4", "AC4", "AC10", "AE1", "AE2", "AE3", "AE4", "AE5", "AE6", "AE7", "AE8", "AE9", "AE10", "AE11", "AE12", "AE13", "AE14", "AE15"};

    public static String a(Map map) {
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
                str3 = com.alipay.sdk.m.w.a.p;
            }
            sb.append(str3);
            sb.append(str);
            sb.append("=");
            sb.append(str2);
            stringBuffer.append(sb.toString());
        }
        return stringBuffer.toString();
    }

    public static synchronized Map a(Context context, Map map) {
        if (a == null) {
            c(context, map);
        }
        a.putAll(d.b(context));
        return a;
    }

    public static synchronized void a() {
        a = null;
    }

    public static synchronized String b(Context context, Map map) {
        TreeMap treeMap;
        a(context, map);
        treeMap = new TreeMap();
        for (String str : b) {
            if (a.containsKey(str)) {
                treeMap.put(str, (String) a.get(str));
            }
        }
        return com.alipay.sdk.m.e0.b.a(a(treeMap));
    }

    public static synchronized void c(Context context, Map map) {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.putAll(b.a(context, map));
        a.putAll(d.a(context));
        a.putAll(c.a(context));
        a.putAll(a.a(context, map));
    }
}
