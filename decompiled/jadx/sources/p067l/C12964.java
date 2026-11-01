package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۧܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: JAPX */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C12964 {
    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    public static boolean m29728(InterfaceC18327 interfaceC18327, Consumer consumer) {
        InterfaceC6278 c20360;
        if (consumer instanceof InterfaceC6278) {
            c20360 = (InterfaceC6278) consumer;
        } else {
            C12826.requireNonNull(consumer);
            c20360 = new C20360(consumer);
        }
        return interfaceC18327.tryAdvance((Object) c20360);
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static void m29727(InterfaceC18327 interfaceC18327, Consumer consumer) {
        InterfaceC6278 c20360;
        if (consumer instanceof InterfaceC6278) {
            c20360 = (InterfaceC6278) consumer;
        } else {
            C12826.requireNonNull(consumer);
            c20360 = new C20360(consumer);
        }
        interfaceC18327.forEachRemaining((Object) c20360);
    }
}
