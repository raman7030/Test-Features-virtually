package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۖۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2351 {
    public static LongConsumer $default$andThen(final LongConsumer longConsumer, final LongConsumer longConsumer2) {
        C11003.requireNonNull(longConsumer2);
        return new LongConsumer() { // from class: l.ۗۛᩴ
            public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer3) {
                return C2351.$default$andThen(this, longConsumer3);
            }

            @Override // java.util.function.LongConsumer
            public final void accept(long j) {
                longConsumer.accept(j);
                longConsumer2.accept(j);
            }
        };
    }
}
