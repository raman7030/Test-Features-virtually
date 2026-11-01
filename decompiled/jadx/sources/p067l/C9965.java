package p067l;

import android.os.SystemClock;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.۠ۛܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4QU */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9965 implements LongConsumer {
    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        SystemClock.sleep(j);
    }

    public /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C4603.$default$andThen(this, longConsumer);
    }
}
