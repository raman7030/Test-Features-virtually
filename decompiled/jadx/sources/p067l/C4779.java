package p067l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4779 {
    public static void $default$forEachRemaining(InterfaceC16847 interfaceC16847, Consumer consumer) {
        while (interfaceC16847.tryAdvance(consumer)) {
        }
    }

    public static long $default$getExactSizeIfKnown(InterfaceC16847 interfaceC16847) {
        if ((interfaceC16847.characteristics() & 64) == 0) {
            return -1L;
        }
        return interfaceC16847.estimateSize();
    }

    public static boolean $default$hasCharacteristics(InterfaceC16847 interfaceC16847, int i) {
        return (interfaceC16847.characteristics() & i) == i;
    }

    public static Comparator $default$getComparator(InterfaceC16847 interfaceC16847) {
        throw new IllegalStateException();
    }
}
