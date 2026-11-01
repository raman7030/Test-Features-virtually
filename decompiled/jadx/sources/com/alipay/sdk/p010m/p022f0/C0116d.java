package com.alipay.sdk.p010m.p022f0;

import java.util.Map;
import p067l.ConcurrentMapC12768;

/* JADX INFO: renamed from: com.alipay.sdk.m.f0.d */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0116d {

    /* JADX INFO: renamed from: a */
    public static final Map f463a = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: com.alipay.sdk.m.f0.d$a */
    /* JADX INFO: compiled from: N673 */
    public class a {

        /* JADX INFO: renamed from: a */
        public String f464a;

        /* JADX INFO: renamed from: b */
        public long f465b;

        /* JADX INFO: renamed from: c */
        public long f466c;
    }

    /* JADX INFO: renamed from: a */
    public static String m638a(String str) {
        Map map;
        a aVar;
        String str2;
        if (str == null || (map = f463a) == null || (aVar = (a) map.get(str)) == null) {
            return null;
        }
        if (m641a(aVar.f465b, aVar.f466c) && (str2 = aVar.f464a) != null) {
            return str2;
        }
        map.remove(str);
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static void m639a(String str, String str2) {
        m640a(str, str2, 86400000L);
    }

    /* JADX INFO: renamed from: a */
    public static void m640a(String str, String str2, long j) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        if (j == 0) {
            j = 86400000;
        }
        Map map = f463a;
        a aVar = (a) map.get(str);
        if (aVar == null) {
            aVar = new a();
        }
        aVar.f464a = str2;
        aVar.f466c = j;
        aVar.f465b = System.currentTimeMillis();
        map.put(str, aVar);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m641a(long j, long j2) {
        return System.currentTimeMillis() - j < j2;
    }
}
