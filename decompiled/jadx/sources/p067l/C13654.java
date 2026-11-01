package p067l;

import java.util.function.DoublePredicate;

/* JADX INFO: renamed from: l.ۨᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: JAPJ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C13654 {
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static boolean m31051(InterfaceC24382 interfaceC24382, double d) {
        return interfaceC24382.mo19088(C5065.m10797(d));
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static boolean m31052(InterfaceC24382 interfaceC24382, Float f) {
        return interfaceC24382.mo19088(f.floatValue());
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC24382 m31050(InterfaceC24382 interfaceC24382, DoublePredicate doublePredicate) {
        InterfaceC24382 c14324;
        if (doublePredicate instanceof InterfaceC24382) {
            c14324 = (InterfaceC24382) doublePredicate;
        } else {
            C12826.requireNonNull(doublePredicate);
            c14324 = new C14324(doublePredicate);
        }
        return interfaceC24382.mo19087(c14324);
    }

    /* JADX INFO: renamed from: ۧ */
    public static InterfaceC24382 m31053(InterfaceC24382 interfaceC24382, DoublePredicate doublePredicate) {
        InterfaceC24382 c14324;
        if (doublePredicate instanceof InterfaceC24382) {
            c14324 = (InterfaceC24382) doublePredicate;
        } else {
            C12826.requireNonNull(doublePredicate);
            c14324 = new C14324(doublePredicate);
        }
        return interfaceC24382.mo19086(c14324);
    }
}
