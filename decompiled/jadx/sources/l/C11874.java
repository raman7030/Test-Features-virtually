package l;

import java.util.function.DoublePredicate;

/* JADX INFO: renamed from: l.ۨᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: JAPJ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11874 {
    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m29000(InterfaceC23162 interfaceC23162, double d) {
        return interfaceC23162.mo17154(C2837.m8730(d));
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m29001(InterfaceC23162 interfaceC23162, Float f) {
        return interfaceC23162.mo17154(f.floatValue());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC23162 m28999(InterfaceC23162 interfaceC23162, DoublePredicate doublePredicate) {
        InterfaceC23162 c12579;
        if (doublePredicate instanceof InterfaceC23162) {
            c12579 = (InterfaceC23162) doublePredicate;
        } else {
            C11003.requireNonNull(doublePredicate);
            c12579 = new C12579(doublePredicate);
        }
        return interfaceC23162.mo17153(c12579);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC23162 m29002(InterfaceC23162 interfaceC23162, DoublePredicate doublePredicate) {
        InterfaceC23162 c12579;
        if (doublePredicate instanceof InterfaceC23162) {
            c12579 = (InterfaceC23162) doublePredicate;
        } else {
            C11003.requireNonNull(doublePredicate);
            c12579 = new C12579(doublePredicate);
        }
        return interfaceC23162.mo17152(c12579);
    }
}
