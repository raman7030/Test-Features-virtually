package com.alipay.sdk.m.f0;

import java.util.Map;
import l.ConcurrentMapC10942;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class d {
    public static final Map a = new ConcurrentMapC10942();

    /* JADX INFO: compiled from: N673 */
    public class a {
        public String a;
        public long b;
        public long c;
    }

    public static String a(String str) {
        Map map;
        a aVar;
        String str2;
        if (str == null || (map = a) == null || (aVar = (a) map.get(str)) == null) {
            return null;
        }
        if (a(aVar.b, aVar.c) && (str2 = aVar.a) != null) {
            return str2;
        }
        map.remove(str);
        return null;
    }

    public static void a(String str, String str2) {
        a(str, str2, 86400000L);
    }

    public static void a(String str, String str2, long j) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        if (j == 0) {
            j = 86400000;
        }
        Map map = a;
        a aVar = (a) map.get(str);
        if (aVar == null) {
            aVar = new a();
        }
        aVar.a = str2;
        aVar.c = j;
        aVar.b = System.currentTimeMillis();
        map.put(str, aVar);
    }

    public static boolean a(long j, long j2) {
        return System.currentTimeMillis() - j < j2;
    }
}
