package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩻۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23702 {
    public static void $default$forEachRemaining(InterfaceC6769 interfaceC6769, LongConsumer longConsumer) {
        C11003.requireNonNull(longConsumer);
        while (interfaceC6769.hasNext()) {
            longConsumer.accept(interfaceC6769.nextLong());
        }
    }

    public static Long $default$next(InterfaceC6769 interfaceC6769) {
        if (AbstractC15920.a) {
            AbstractC15920.a(interfaceC6769.getClass(), "{0} calling PrimitiveIterator.OfLong.nextLong()");
            throw null;
        }
        return Long.valueOf(interfaceC6769.nextLong());
    }
}
