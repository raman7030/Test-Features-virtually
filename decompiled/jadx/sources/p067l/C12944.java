package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۧܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZAO9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C12944 {
    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    public static boolean m29674(InterfaceC18307 interfaceC18307, Consumer consumer) {
        InterfaceC24857 c8764;
        if (consumer instanceof InterfaceC24857) {
            c8764 = (InterfaceC24857) consumer;
        } else {
            C12826.requireNonNull(consumer);
            c8764 = new C8764(consumer);
        }
        return interfaceC18307.tryAdvance((Object) c8764);
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static void m29673(InterfaceC18307 interfaceC18307, Consumer consumer) {
        InterfaceC24857 c8764;
        if (consumer instanceof InterfaceC24857) {
            c8764 = (InterfaceC24857) consumer;
        } else {
            C12826.requireNonNull(consumer);
            c8764 = new C8764(consumer);
        }
        interfaceC18307.forEachRemaining((Object) c8764);
    }
}
