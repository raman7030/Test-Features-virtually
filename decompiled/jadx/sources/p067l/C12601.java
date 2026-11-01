package p067l;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۧۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B74E */
/* JADX INFO: loaded from: classes3.dex */
public final class C12601 {

    /* JADX INFO: renamed from: ֫ */
    public static final ThreadPoolExecutor f35391 = new ThreadPoolExecutor(0, 4, 10, TimeUnit.SECONDS, new SynchronousQueue());

    /* JADX INFO: renamed from: ֫ */
    public static ThreadPoolExecutor m29024() {
        return f35391;
    }
}
