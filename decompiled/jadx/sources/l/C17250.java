package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܿۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1PV */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17250 {
    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40537(InterfaceC1043 interfaceC1043, Consumer consumer) {
        C11003.requireNonNull(consumer);
        interfaceC1043.forEach(consumer instanceof IntConsumer ? (IntConsumer) consumer : new C3294(1, consumer));
    }
}
