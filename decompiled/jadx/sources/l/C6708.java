package l;

import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongUnaryOperator;

/* JADX INFO: renamed from: l.ۜۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public class C6708 {
    public static long updateAndGet(AtomicLong atomicLong, LongUnaryOperator longUnaryOperator) {
        long j;
        long jApplyAsLong;
        do {
            j = atomicLong.get();
            jApplyAsLong = longUnaryOperator.applyAsLong(j);
        } while (!atomicLong.compareAndSet(j, jApplyAsLong));
        return jApplyAsLong;
    }
}
