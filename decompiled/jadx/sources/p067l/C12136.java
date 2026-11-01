package p067l;

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
public final /* synthetic */ class C12136 {
    /* JADX INFO: renamed from: of */
    public static InterfaceC13477 m28049of(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, EnumC8112... enumC8112Arr) {
        Set setUnmodifiableSet;
        C12826.requireNonNull(supplier);
        C12826.requireNonNull(biConsumer);
        C12826.requireNonNull(binaryOperator);
        C12826.requireNonNull(enumC8112Arr);
        if (enumC8112Arr.length == 0) {
            setUnmodifiableSet = C24205.f76714a;
        } else {
            setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(EnumC8112.IDENTITY_FINISH, enumC8112Arr));
        }
        return new C4742(supplier, biConsumer, binaryOperator, setUnmodifiableSet);
    }

    /* JADX INFO: renamed from: of */
    public static InterfaceC13477 m28048of(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Function function, EnumC8112... enumC8112Arr) {
        C12826.requireNonNull(supplier);
        C12826.requireNonNull(biConsumer);
        C12826.requireNonNull(binaryOperator);
        C12826.requireNonNull(function);
        C12826.requireNonNull(enumC8112Arr);
        Set setUnmodifiableSet = C24205.f76716c;
        if (enumC8112Arr.length > 0) {
            EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC8112.class);
            Collections.addAll(enumSetNoneOf, enumC8112Arr);
            setUnmodifiableSet = Collections.unmodifiableSet(enumSetNoneOf);
        }
        return new C4742(supplier, biConsumer, binaryOperator, function, setUnmodifiableSet);
    }
}
