package p067l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۧܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: TAPG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C12924 {
    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    public static boolean m29598(InterfaceC18287 interfaceC18287, Consumer consumer) {
        IntConsumer c5499;
        if (consumer instanceof IntConsumer) {
            c5499 = (IntConsumer) consumer;
        } else {
            C12826.requireNonNull(consumer);
            c5499 = new C5499(1, consumer);
        }
        return interfaceC18287.tryAdvance(c5499);
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static void m29597(InterfaceC18287 interfaceC18287, Consumer consumer) {
        IntConsumer c5499;
        if (consumer instanceof IntConsumer) {
            c5499 = (IntConsumer) consumer;
        } else {
            C12826.requireNonNull(consumer);
            c5499 = new C5499(1, consumer);
        }
        interfaceC18287.forEachRemaining(c5499);
    }
}
