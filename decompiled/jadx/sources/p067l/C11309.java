package p067l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۢۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11309 {
    public static IntConsumer $default$andThen(final IntConsumer intConsumer, final IntConsumer intConsumer2) {
        C12826.requireNonNull(intConsumer2);
        return new IntConsumer() { // from class: l.᩹ۛᩴ
            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer3) {
                return C11309.$default$andThen(this, intConsumer3);
            }

            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                intConsumer.accept(i);
                intConsumer2.accept(i);
            }
        };
    }
}
