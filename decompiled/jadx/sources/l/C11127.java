package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۧܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZAO9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11127 {
    @Deprecated
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m27612(InterfaceC16770 interfaceC16770, Consumer consumer) {
        InterfaceC23662 c6729;
        if (consumer instanceof InterfaceC23662) {
            c6729 = (InterfaceC23662) consumer;
        } else {
            C11003.requireNonNull(consumer);
            c6729 = new C6729(consumer);
        }
        return interfaceC16770.tryAdvance((Object) c6729);
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27611(InterfaceC16770 interfaceC16770, Consumer consumer) {
        InterfaceC23662 c6729;
        if (consumer instanceof InterfaceC23662) {
            c6729 = (InterfaceC23662) consumer;
        } else {
            C11003.requireNonNull(consumer);
            c6729 = new C6729(consumer);
        }
        interfaceC16770.forEachRemaining((Object) c6729);
    }
}
