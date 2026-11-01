package p067l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ܳۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GBZW */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C15942 {
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static void m36199(InterfaceC24660 interfaceC24660, Consumer consumer) {
        LongConsumer c19296;
        if (consumer instanceof LongConsumer) {
            c19296 = (LongConsumer) consumer;
        } else {
            C12826.requireNonNull(consumer);
            c19296 = new C19296(consumer);
        }
        interfaceC24660.forEachRemaining(c19296);
    }
}
