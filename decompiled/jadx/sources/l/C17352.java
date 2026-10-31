package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܿ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17352 {
    public static void $default$forEachRemaining(InterfaceC14529 interfaceC14529, IntConsumer intConsumer) {
        C11003.requireNonNull(intConsumer);
        while (interfaceC14529.hasNext()) {
            intConsumer.accept(interfaceC14529.nextInt());
        }
    }

    public static Integer $default$next(InterfaceC14529 interfaceC14529) {
        if (AbstractC15920.a) {
            AbstractC15920.a(interfaceC14529.getClass(), "{0} calling PrimitiveIterator.OfInt.nextInt()");
            throw null;
        }
        return Integer.valueOf(interfaceC14529.nextInt());
    }
}
