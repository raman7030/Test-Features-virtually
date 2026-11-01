package p067l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܿۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1PV */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18763 {
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static void m42786(InterfaceC3360 interfaceC3360, Consumer consumer) {
        C12826.requireNonNull(consumer);
        interfaceC3360.forEach(consumer instanceof IntConsumer ? (IntConsumer) consumer : new C5499(1, consumer));
    }
}
