package p067l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩻۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24895 {
    public static void $default$forEachRemaining(InterfaceC8802 interfaceC8802, LongConsumer longConsumer) {
        C12826.requireNonNull(longConsumer);
        while (interfaceC8802.hasNext()) {
            longConsumer.accept(interfaceC8802.nextLong());
        }
    }

    public static Long $default$next(InterfaceC8802 interfaceC8802) {
        if (AbstractC17499.f52319a) {
            AbstractC17499.m39858a(interfaceC8802.getClass(), "{0} calling PrimitiveIterator.OfLong.nextLong()");
            throw null;
        }
        return Long.valueOf(interfaceC8802.nextLong());
    }
}
