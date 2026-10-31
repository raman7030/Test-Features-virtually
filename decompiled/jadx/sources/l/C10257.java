package l;

import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.ۤۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAPK */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10257 {
    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m25988(InterfaceC6023 interfaceC6023, int i) {
        return interfaceC6023.mo9839(C2837.m8732(i));
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m25989(InterfaceC6023 interfaceC6023, Character ch) {
        return interfaceC6023.mo9839(ch.charValue());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC6023 m25987(InterfaceC6023 interfaceC6023, IntPredicate intPredicate) {
        InterfaceC6023 c4612;
        if (intPredicate instanceof InterfaceC6023) {
            c4612 = (InterfaceC6023) intPredicate;
        } else {
            C11003.requireNonNull(intPredicate);
            c4612 = new C4612(intPredicate);
        }
        return interfaceC6023.mo9838(c4612);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC6023 m25990(InterfaceC6023 interfaceC6023, IntPredicate intPredicate) {
        InterfaceC6023 c4612;
        if (intPredicate instanceof InterfaceC6023) {
            c4612 = (InterfaceC6023) intPredicate;
        } else {
            C11003.requireNonNull(intPredicate);
            c4612 = new C4612(intPredicate);
        }
        return interfaceC6023.mo9840(c4612);
    }
}
