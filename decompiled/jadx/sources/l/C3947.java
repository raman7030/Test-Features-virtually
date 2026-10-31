package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۘ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3947 {
    public static void $default$forEachRemaining(InterfaceC18764 interfaceC18764, IntConsumer intConsumer) {
        while (interfaceC18764.tryAdvance(intConsumer)) {
        }
    }

    public static boolean b(InterfaceC18764 interfaceC18764, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return interfaceC18764.tryAdvance((IntConsumer) consumer);
        }
        if (AbstractC15920.a) {
            AbstractC15920.a(interfaceC18764.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        C11003.requireNonNull(consumer);
        return interfaceC18764.tryAdvance((IntConsumer) new C5878(consumer, 0));
    }

    public static void a(InterfaceC18764 interfaceC18764, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            interfaceC18764.forEachRemaining((IntConsumer) consumer);
        } else {
            if (AbstractC15920.a) {
                AbstractC15920.a(interfaceC18764.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            C11003.requireNonNull(consumer);
            interfaceC18764.forEachRemaining((IntConsumer) new C5878(consumer, 0));
        }
    }
}
