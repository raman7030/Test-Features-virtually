package p067l;

import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۬۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C14855 {
    public static void forEachRemaining(Iterator it, Consumer consumer) {
        if (it instanceof InterfaceC14185) {
            ((InterfaceC14185) it).forEachRemaining(consumer);
            return;
        }
        C12826.requireNonNull(consumer);
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }
}
