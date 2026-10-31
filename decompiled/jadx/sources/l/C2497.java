package l;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۖۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2497 implements InterfaceC11688 {
    public final Supplier a;
    public final BiConsumer b;
    public final BinaryOperator c;
    public final Function d;
    public final Set e;

    public C2497(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Function function, Set set) {
        this.a = supplier;
        this.b = biConsumer;
        this.c = binaryOperator;
        this.d = function;
        this.e = set;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2497(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Set set) {
        this(supplier, biConsumer, binaryOperator, new C8556(24), set);
        Set set2 = C22976.a;
    }

    @Override // l.InterfaceC11688
    public final BiConsumer accumulator() {
        return this.b;
    }

    @Override // l.InterfaceC11688
    public final Supplier supplier() {
        return this.a;
    }

    @Override // l.InterfaceC11688
    public final BinaryOperator combiner() {
        return this.c;
    }

    @Override // l.InterfaceC11688
    public final Function finisher() {
        return this.d;
    }

    @Override // l.InterfaceC11688
    public final Set characteristics() {
        return this.e;
    }
}
