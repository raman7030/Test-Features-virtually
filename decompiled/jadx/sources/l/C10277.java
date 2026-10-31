package l;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۤۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10277 {
    public static InterfaceC11688 of(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, EnumC6043... enumC6043Arr) {
        Set setUnmodifiableSet;
        C11003.requireNonNull(supplier);
        C11003.requireNonNull(biConsumer);
        C11003.requireNonNull(binaryOperator);
        C11003.requireNonNull(enumC6043Arr);
        if (enumC6043Arr.length == 0) {
            setUnmodifiableSet = C22976.a;
        } else {
            setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(EnumC6043.IDENTITY_FINISH, enumC6043Arr));
        }
        return new C2497(supplier, biConsumer, binaryOperator, setUnmodifiableSet);
    }

    public static InterfaceC11688 of(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Function function, EnumC6043... enumC6043Arr) {
        C11003.requireNonNull(supplier);
        C11003.requireNonNull(biConsumer);
        C11003.requireNonNull(binaryOperator);
        C11003.requireNonNull(function);
        C11003.requireNonNull(enumC6043Arr);
        Set setUnmodifiableSet = C22976.c;
        if (enumC6043Arr.length > 0) {
            EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC6043.class);
            Collections.addAll(enumSetNoneOf, enumC6043Arr);
            setUnmodifiableSet = Collections.unmodifiableSet(enumSetNoneOf);
        }
        return new C2497(supplier, biConsumer, binaryOperator, function, setUnmodifiableSet);
    }
}
