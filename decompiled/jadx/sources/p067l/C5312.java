package p067l;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* JADX INFO: renamed from: l.ۗ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5312 implements InterfaceC13477 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Collector f12494a;

    public /* synthetic */ C5312(Collector collector) {
        this.f12494a = collector;
    }

    @Override // p067l.InterfaceC13477
    public final /* synthetic */ BiConsumer accumulator() {
        return this.f12494a.accumulator();
    }

    @Override // p067l.InterfaceC13477
    public final /* synthetic */ Set characteristics() {
        return AbstractC17381.m39424a(this.f12494a.characteristics());
    }

    @Override // p067l.InterfaceC13477
    public final /* synthetic */ BinaryOperator combiner() {
        return this.f12494a.combiner();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Collector collector = this.f12494a;
        if (obj instanceof C5312) {
            obj = ((C5312) obj).f12494a;
        }
        return collector.equals(obj);
    }

    @Override // p067l.InterfaceC13477
    public final /* synthetic */ Function finisher() {
        return this.f12494a.finisher();
    }

    public final /* synthetic */ int hashCode() {
        return this.f12494a.hashCode();
    }

    @Override // p067l.InterfaceC13477
    public final /* synthetic */ Supplier supplier() {
        return this.f12494a.supplier();
    }
}
