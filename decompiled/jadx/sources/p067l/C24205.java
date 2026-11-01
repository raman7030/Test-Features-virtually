package p067l;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩺ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C24205 {

    /* JADX INFO: renamed from: a */
    public static final Set f76714a;

    /* JADX INFO: renamed from: b */
    public static final Set f76715b;

    /* JADX INFO: renamed from: c */
    public static final Set f76716c;

    /* JADX INFO: renamed from: d */
    public static final Set f76717d;

    static {
        EnumC8112 enumC8112 = EnumC8112.CONCURRENT;
        EnumC8112 enumC8113 = EnumC8112.UNORDERED;
        EnumC8112 enumC8114 = EnumC8112.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(enumC8112, enumC8113, enumC8114));
        Collections.unmodifiableSet(EnumSet.of(enumC8112, enumC8113));
        f76714a = Collections.unmodifiableSet(EnumSet.of(enumC8114));
        f76715b = Collections.unmodifiableSet(EnumSet.of(enumC8113, enumC8114));
        f76716c = Collections.EMPTY_SET;
        f76717d = Collections.unmodifiableSet(EnumSet.of(enumC8113));
    }

    public static InterfaceC13477 toCollection(Supplier supplier) {
        return new C4742(supplier, new C10500(15), new C10500(16), f76714a);
    }

    public static InterfaceC13477 toList() {
        return new C4742(new C5827(1), new C10500(17), new C10500(23), f76714a);
    }

    public static InterfaceC13477 toUnmodifiableList() {
        return new C4742(new C5827(1), new C10500(17), new C10500(18), new C10500(19), f76716c);
    }

    public static InterfaceC13477 toSet() {
        return new C4742(new C5827(3), new C10500(20), new C10500(28), f76715b);
    }

    public static InterfaceC13477 toUnmodifiableSet() {
        return new C4742(new C5827(3), new C10500(20), new C10500(21), new C10500(22), f76717d);
    }

    public static InterfaceC13477 joining() {
        return new C4742(new C5827(6), new C6653(), new C12789(0), new C12789(1), f76716c);
    }

    public static InterfaceC13477 joining(CharSequence charSequence) {
        return joining(charSequence, "", "");
    }

    public static InterfaceC13477 joining(final CharSequence charSequence, final CharSequence charSequence2, final CharSequence charSequence3) {
        return new C4742(new Supplier() { // from class: l.ۙ֫᩵
            @Override // java.util.function.Supplier
            public final Object get() {
                CharSequence charSequence4 = charSequence;
                CharSequence charSequence5 = charSequence2;
                CharSequence charSequence6 = charSequence3;
                Set set = C24205.f76714a;
                return new C21543(charSequence4, charSequence5, charSequence6);
            }
        }, new C10500(25), new C10500(26), new C10500(27), f76716c);
    }

    /* JADX INFO: renamed from: a */
    public static void m53524a(double[] dArr, double d) {
        double d2 = d - dArr[1];
        double d3 = dArr[0];
        double d4 = d3 + d2;
        dArr[1] = (d4 - d3) - d2;
        dArr[0] = d4;
    }

    public static InterfaceC13477 toMap(Function function, Function function2) {
        return new C4742(new C5827(5), new C22708(function, function2, 2), new C10500(14), f76714a);
    }
}
