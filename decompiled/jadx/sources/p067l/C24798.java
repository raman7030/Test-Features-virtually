package p067l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩻ۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1QN */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24798 {
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static Integer m54479(InterfaceC8705 interfaceC8705) {
        return Integer.valueOf(interfaceC8705.nextInt());
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static void m54480(InterfaceC8705 interfaceC8705, Consumer consumer) {
        IntConsumer c5499;
        if (consumer instanceof IntConsumer) {
            c5499 = (IntConsumer) consumer;
        } else {
            C12826.requireNonNull(consumer);
            c5499 = new C5499(1, consumer);
        }
        interfaceC8705.forEachRemaining(c5499);
    }
}
