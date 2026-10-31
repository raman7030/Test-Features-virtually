package l;

import java.util.UUID;

/* JADX INFO: renamed from: l.ۗۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7U3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3175 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC10942 f9985 = new ConcurrentMapC10942();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m9731(AbstractC13301 abstractC13301) {
        String string = UUID.randomUUID().toString();
        f9985.put(string, abstractC13301);
        C4925.m14324().postDelayed(new RunnableC3505(1, string), ((long) 10) * 1000);
        return string;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Object m9733(String str) {
        ConcurrentMapC10942 concurrentMapC10942 = f9985;
        Object obj = concurrentMapC10942.get(str);
        if (obj != null) {
            concurrentMapC10942.remove(str);
        }
        return obj;
    }
}
