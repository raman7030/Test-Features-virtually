package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۧܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: TAPG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11106 {
    @Deprecated
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m27536(InterfaceC16749 interfaceC16749, Consumer consumer) {
        IntConsumer c3294;
        if (consumer instanceof IntConsumer) {
            c3294 = (IntConsumer) consumer;
        } else {
            C11003.requireNonNull(consumer);
            c3294 = new C3294(1, consumer);
        }
        return interfaceC16749.tryAdvance(c3294);
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27535(InterfaceC16749 interfaceC16749, Consumer consumer) {
        IntConsumer c3294;
        if (consumer instanceof IntConsumer) {
            c3294 = (IntConsumer) consumer;
        } else {
            C11003.requireNonNull(consumer);
            c3294 = new C3294(1, consumer);
        }
        interfaceC16749.forEachRemaining(c3294);
    }
}
