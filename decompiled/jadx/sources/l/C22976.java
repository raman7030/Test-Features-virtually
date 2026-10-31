package l;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩺ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C22976 {
    public static final Set a;
    public static final Set b;
    public static final Set c;
    public static final Set d;

    static {
        EnumC6043 enumC6043 = EnumC6043.CONCURRENT;
        EnumC6043 enumC6044 = EnumC6043.UNORDERED;
        EnumC6043 enumC6045 = EnumC6043.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(enumC6043, enumC6044, enumC6045));
        Collections.unmodifiableSet(EnumSet.of(enumC6043, enumC6044));
        a = Collections.unmodifiableSet(EnumSet.of(enumC6045));
        b = Collections.unmodifiableSet(EnumSet.of(enumC6044, enumC6045));
        c = Collections.EMPTY_SET;
        d = Collections.unmodifiableSet(EnumSet.of(enumC6044));
    }

    public static InterfaceC11688 toCollection(Supplier supplier) {
        return new C2497(supplier, new C8556(15), new C8556(16), a);
    }

    public static InterfaceC11688 toList() {
        return new C2497(new C3639(1), new C8556(17), new C8556(23), a);
    }

    public static InterfaceC11688 toUnmodifiableList() {
        return new C2497(new C3639(1), new C8556(17), new C8556(18), new C8556(19), c);
    }

    public static InterfaceC11688 toSet() {
        return new C2497(new C3639(3), new C8556(20), new C8556(28), b);
    }

    public static InterfaceC11688 toUnmodifiableSet() {
        return new C2497(new C3639(3), new C8556(20), new C8556(21), new C8556(22), d);
    }

    public static InterfaceC11688 joining() {
        return new C2497(new C3639(6), new C4508(), new C10964(0), new C10964(1), c);
    }

    public static InterfaceC11688 joining(CharSequence charSequence) {
        return joining(charSequence, "", "");
    }

    public static InterfaceC11688 joining(final CharSequence charSequence, final CharSequence charSequence2, final CharSequence charSequence3) {
        return new C2497(new Supplier() { // from class: l.ۙ֫᩵
            @Override // java.util.function.Supplier
            public final Object get() {
                CharSequence charSequence4 = charSequence;
                CharSequence charSequence5 = charSequence2;
                CharSequence charSequence6 = charSequence3;
                Set set = C22976.a;
                return new C20175(charSequence4, charSequence5, charSequence6);
            }
        }, new C8556(25), new C8556(26), new C8556(27), c);
    }

    public static void a(double[] dArr, double d2) {
        double d3 = d2 - dArr[1];
        double d4 = dArr[0];
        double d5 = d4 + d3;
        dArr[1] = (d5 - d4) - d3;
        dArr[0] = d5;
    }

    public static InterfaceC11688 toMap(Function function, Function function2) {
        return new C2497(new C3639(5), new C21401(function, function2, 2), new C8556(14), a);
    }
}
