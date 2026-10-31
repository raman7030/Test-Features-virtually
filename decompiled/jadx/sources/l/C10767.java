package l;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۧۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B74E */
/* JADX INFO: loaded from: classes3.dex */
public final class C10767 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final ThreadPoolExecutor f32416 = new ThreadPoolExecutor(0, 4, 10, TimeUnit.SECONDS, new SynchronousQueue());

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ThreadPoolExecutor m26979() {
        return f32416;
    }
}
