package p067l;

import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.᩺᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: RAPC */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24510 {
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static boolean m54086(InterfaceC15792 interfaceC15792, int i) {
        return interfaceC15792.mo7171(C5065.m10796(i));
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static boolean m54087(InterfaceC15792 interfaceC15792, Byte b) {
        return interfaceC15792.mo7171(b.byteValue());
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC15792 m54085(InterfaceC15792 interfaceC15792, IntPredicate intPredicate) {
        InterfaceC15792 c12441;
        if (intPredicate instanceof InterfaceC15792) {
            c12441 = (InterfaceC15792) intPredicate;
        } else {
            C12826.requireNonNull(intPredicate);
            c12441 = new C12441(intPredicate);
        }
        return interfaceC15792.mo7169(c12441);
    }

    /* JADX INFO: renamed from: ۧ */
    public static InterfaceC15792 m54088(InterfaceC15792 interfaceC15792, IntPredicate intPredicate) {
        InterfaceC15792 c12441;
        if (intPredicate instanceof InterfaceC15792) {
            c12441 = (InterfaceC15792) intPredicate;
        } else {
            C12826.requireNonNull(intPredicate);
            c12441 = new C12441(intPredicate);
        }
        return interfaceC15792.mo7170(c12441);
    }
}
