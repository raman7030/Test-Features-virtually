package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩵۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C19470 {
    public static void $default$forEachRemaining(InterfaceC0418 interfaceC0418, LongConsumer longConsumer) {
        while (interfaceC0418.tryAdvance(longConsumer)) {
        }
    }

    public static boolean b(InterfaceC0418 interfaceC0418, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return interfaceC0418.tryAdvance((LongConsumer) consumer);
        }
        if (AbstractC15920.a) {
            AbstractC15920.a(interfaceC0418.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        C11003.requireNonNull(consumer);
        return interfaceC0418.tryAdvance((LongConsumer) new C17332(consumer, 0));
    }

    public static void a(InterfaceC0418 interfaceC0418, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            interfaceC0418.forEachRemaining((LongConsumer) consumer);
        } else {
            if (AbstractC15920.a) {
                AbstractC15920.a(interfaceC0418.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            C11003.requireNonNull(consumer);
            interfaceC0418.forEachRemaining((LongConsumer) new C17332(consumer, 0));
        }
    }
}
