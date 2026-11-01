package p067l;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۖۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4742 implements InterfaceC13477 {

    /* JADX INFO: renamed from: a */
    public final Supplier f10740a;

    /* JADX INFO: renamed from: b */
    public final BiConsumer f10741b;

    /* JADX INFO: renamed from: c */
    public final BinaryOperator f10742c;

    /* JADX INFO: renamed from: d */
    public final Function f10743d;

    /* JADX INFO: renamed from: e */
    public final Set f10744e;

    public C4742(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Function function, Set set) {
        this.f10740a = supplier;
        this.f10741b = biConsumer;
        this.f10742c = binaryOperator;
        this.f10743d = function;
        this.f10744e = set;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4742(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Set set) {
        this(supplier, biConsumer, binaryOperator, new C10500(24), set);
        Set set2 = C24205.f76714a;
    }

    @Override // p067l.InterfaceC13477
    public final BiConsumer accumulator() {
        return this.f10741b;
    }

    @Override // p067l.InterfaceC13477
    public final Supplier supplier() {
        return this.f10740a;
    }

    @Override // p067l.InterfaceC13477
    public final BinaryOperator combiner() {
        return this.f10742c;
    }

    @Override // p067l.InterfaceC13477
    public final Function finisher() {
        return this.f10743d;
    }

    @Override // p067l.InterfaceC13477
    public final Set characteristics() {
        return this.f10744e;
    }
}
