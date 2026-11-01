package p067l;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* JADX INFO: renamed from: l.ܽ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17896 implements Collector {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC13477 f53470a;

    public /* synthetic */ C17896(InterfaceC13477 interfaceC13477) {
        this.f53470a = interfaceC13477;
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ BiConsumer accumulator() {
        return this.f53470a.accumulator();
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Set characteristics() {
        return AbstractC17381.m39424a(this.f53470a.characteristics());
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ BinaryOperator combiner() {
        return this.f53470a.combiner();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC13477 interfaceC13477 = this.f53470a;
        if (obj instanceof C17896) {
            obj = ((C17896) obj).f53470a;
        }
        return interfaceC13477.equals(obj);
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Function finisher() {
        return this.f53470a.finisher();
    }

    public final /* synthetic */ int hashCode() {
        return this.f53470a.hashCode();
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Supplier supplier() {
        return this.f53470a.supplier();
    }
}
