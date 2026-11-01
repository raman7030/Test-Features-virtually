package p067l;

import java.util.UUID;

/* JADX INFO: renamed from: l.ۗۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7U3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5386 {

    /* JADX INFO: renamed from: ֫ */
    public static final ConcurrentMapC12768 f12787 = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: ֫ */
    public static String m11775(AbstractC15010 abstractC15010) {
        String string = UUID.randomUUID().toString();
        f12787.put(string, abstractC15010);
        C7050.m16221().postDelayed(new RunnableC5700(1, string), ((long) 10) * 1000);
        return string;
    }

    /* JADX INFO: renamed from: ۧ */
    public static Object m11777(String str) {
        ConcurrentMapC12768 concurrentMapC12768 = f12787;
        Object obj = concurrentMapC12768.get(str);
        if (obj != null) {
            concurrentMapC12768.remove(str);
        }
        return obj;
    }
}
