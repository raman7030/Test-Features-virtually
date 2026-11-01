package p067l;

import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.ۤۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAPK */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C12117 {
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static boolean m28010(InterfaceC8093 interfaceC8093, int i) {
        return interfaceC8093.mo11886(C5065.m10799(i));
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static boolean m28011(InterfaceC8093 interfaceC8093, Character ch) {
        return interfaceC8093.mo11886(ch.charValue());
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC8093 m28009(InterfaceC8093 interfaceC8093, IntPredicate intPredicate) {
        InterfaceC8093 c6752;
        if (intPredicate instanceof InterfaceC8093) {
            c6752 = (InterfaceC8093) intPredicate;
        } else {
            C12826.requireNonNull(intPredicate);
            c6752 = new C6752(intPredicate);
        }
        return interfaceC8093.mo11885(c6752);
    }

    /* JADX INFO: renamed from: ۧ */
    public static InterfaceC8093 m28012(InterfaceC8093 interfaceC8093, IntPredicate intPredicate) {
        InterfaceC8093 c6752;
        if (intPredicate instanceof InterfaceC8093) {
            c6752 = (InterfaceC8093) intPredicate;
        } else {
            C12826.requireNonNull(intPredicate);
            c6752 = new C6752(intPredicate);
        }
        return interfaceC8093.mo11887(c6752);
    }
}
