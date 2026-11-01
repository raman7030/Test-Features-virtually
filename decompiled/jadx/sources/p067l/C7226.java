package p067l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۚۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AP3 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7226 {
    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    public static boolean m16564(InterfaceC3202 interfaceC3202, Consumer consumer) {
        LongConsumer c19296;
        if (consumer instanceof LongConsumer) {
            c19296 = (LongConsumer) consumer;
        } else {
            C12826.requireNonNull(consumer);
            c19296 = new C19296(consumer);
        }
        return interfaceC3202.tryAdvance(c19296);
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static void m16563(InterfaceC3202 interfaceC3202, Consumer consumer) {
        LongConsumer c19296;
        if (consumer instanceof LongConsumer) {
            c19296 = (LongConsumer) consumer;
        } else {
            C12826.requireNonNull(consumer);
            c19296 = new C19296(consumer);
        }
        interfaceC3202.forEachRemaining(c19296);
    }
}
