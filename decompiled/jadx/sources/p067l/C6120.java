package p067l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۘ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6120 {
    public static void $default$forEachRemaining(InterfaceC20202 interfaceC20202, IntConsumer intConsumer) {
        while (interfaceC20202.tryAdvance(intConsumer)) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m13915b(InterfaceC20202 interfaceC20202, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return interfaceC20202.tryAdvance((IntConsumer) consumer);
        }
        if (AbstractC17499.f52319a) {
            AbstractC17499.m39858a(interfaceC20202.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        C12826.requireNonNull(consumer);
        return interfaceC20202.tryAdvance((IntConsumer) new C7955(consumer, 0));
    }

    /* JADX INFO: renamed from: a */
    public static void m13914a(InterfaceC20202 interfaceC20202, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            interfaceC20202.forEachRemaining((IntConsumer) consumer);
        } else {
            if (AbstractC17499.f52319a) {
                AbstractC17499.m39858a(interfaceC20202.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            C12826.requireNonNull(consumer);
            interfaceC20202.forEachRemaining((IntConsumer) new C7955(consumer, 0));
        }
    }
}
