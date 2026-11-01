package p067l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܿ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18860 {
    public static void $default$forEachRemaining(InterfaceC16177 interfaceC16177, IntConsumer intConsumer) {
        C12826.requireNonNull(intConsumer);
        while (interfaceC16177.hasNext()) {
            intConsumer.accept(interfaceC16177.nextInt());
        }
    }

    public static Integer $default$next(InterfaceC16177 interfaceC16177) {
        if (AbstractC17499.f52319a) {
            AbstractC17499.m39858a(interfaceC16177.getClass(), "{0} calling PrimitiveIterator.OfInt.nextInt()");
            throw null;
        }
        return Integer.valueOf(interfaceC16177.nextInt());
    }
}
