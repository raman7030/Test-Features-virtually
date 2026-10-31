package l;

import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۬۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C13138 {
    public static void forEachRemaining(Iterator it, Consumer consumer) {
        if (it instanceof InterfaceC12433) {
            ((InterfaceC12433) it).forEachRemaining(consumer);
            return;
        }
        C11003.requireNonNull(consumer);
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }
}
