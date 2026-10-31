package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۚۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AP3 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5111 {
    @Deprecated
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m14656(InterfaceC0877 interfaceC0877, Consumer consumer) {
        LongConsumer c17811;
        if (consumer instanceof LongConsumer) {
            c17811 = (LongConsumer) consumer;
        } else {
            C11003.requireNonNull(consumer);
            c17811 = new C17811(consumer);
        }
        return interfaceC0877.tryAdvance(c17811);
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14655(InterfaceC0877 interfaceC0877, Consumer consumer) {
        LongConsumer c17811;
        if (consumer instanceof LongConsumer) {
            c17811 = (LongConsumer) consumer;
        } else {
            C11003.requireNonNull(consumer);
            c17811 = new C17811(consumer);
        }
        interfaceC0877.forEachRemaining(c17811);
    }
}
