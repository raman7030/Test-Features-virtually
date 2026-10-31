package l;

import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.᩺᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: RAPC */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23297 {
    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m51690(InterfaceC14124 interfaceC14124, int i) {
        return interfaceC14124.mo4927(C2837.m8729(i));
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m51691(InterfaceC14124 interfaceC14124, Byte b) {
        return interfaceC14124.mo4927(b.byteValue());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC14124 m51689(InterfaceC14124 interfaceC14124, IntPredicate intPredicate) {
        InterfaceC14124 c10598;
        if (intPredicate instanceof InterfaceC14124) {
            c10598 = (InterfaceC14124) intPredicate;
        } else {
            C11003.requireNonNull(intPredicate);
            c10598 = new C10598(intPredicate);
        }
        return interfaceC14124.mo4925(c10598);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC14124 m51692(InterfaceC14124 interfaceC14124, IntPredicate intPredicate) {
        InterfaceC14124 c10598;
        if (intPredicate instanceof InterfaceC14124) {
            c10598 = (InterfaceC14124) intPredicate;
        } else {
            C11003.requireNonNull(intPredicate);
            c10598 = new C10598(intPredicate);
        }
        return interfaceC14124.mo4926(c10598);
    }
}
