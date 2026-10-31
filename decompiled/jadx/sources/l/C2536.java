package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2536 {
    public static void $default$forEachRemaining(InterfaceC15234 interfaceC15234, Consumer consumer) {
        while (interfaceC15234.tryAdvance(consumer)) {
        }
    }

    public static long $default$getExactSizeIfKnown(InterfaceC15234 interfaceC15234) {
        if ((interfaceC15234.characteristics() & 64) == 0) {
            return -1L;
        }
        return interfaceC15234.estimateSize();
    }

    public static boolean $default$hasCharacteristics(InterfaceC15234 interfaceC15234, int i) {
        return (interfaceC15234.characteristics() & i) == i;
    }

    public static Comparator $default$getComparator(InterfaceC15234 interfaceC15234) {
        throw new IllegalStateException();
    }
}
