package l;

import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩹֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21962 {
    public static void $default$forEach(Iterable iterable, Consumer consumer) {
        C11003.requireNonNull(consumer);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }
}
