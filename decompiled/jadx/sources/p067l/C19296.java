package p067l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ᩳۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VCBM */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19296 implements LongConsumer {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Consumer f57646;

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.f57646.accept(Long.valueOf(j));
    }

    public /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C4603.$default$andThen(this, longConsumer);
    }
}
