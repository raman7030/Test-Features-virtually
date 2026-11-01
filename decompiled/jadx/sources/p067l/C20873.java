package p067l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩵۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C20873 {
    public static void $default$forEachRemaining(InterfaceC2766 interfaceC2766, LongConsumer longConsumer) {
        while (interfaceC2766.tryAdvance(longConsumer)) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m47165b(InterfaceC2766 interfaceC2766, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return interfaceC2766.tryAdvance((LongConsumer) consumer);
        }
        if (AbstractC17499.f52319a) {
            AbstractC17499.m39858a(interfaceC2766.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        C12826.requireNonNull(consumer);
        return interfaceC2766.tryAdvance((LongConsumer) new C18841(consumer, 0));
    }

    /* JADX INFO: renamed from: a */
    public static void m47164a(InterfaceC2766 interfaceC2766, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            interfaceC2766.forEachRemaining((LongConsumer) consumer);
        } else {
            if (AbstractC17499.f52319a) {
                AbstractC17499.m39858a(interfaceC2766.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            C12826.requireNonNull(consumer);
            interfaceC2766.forEachRemaining((LongConsumer) new C18841(consumer, 0));
        }
    }
}
