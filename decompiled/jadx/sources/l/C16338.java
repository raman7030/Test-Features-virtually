package l;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* JADX INFO: renamed from: l.ܽ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16338 implements Collector {
    public final /* synthetic */ InterfaceC11688 a;

    public /* synthetic */ C16338(InterfaceC11688 interfaceC11688) {
        this.a = interfaceC11688;
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ BiConsumer accumulator() {
        return this.a.accumulator();
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Set characteristics() {
        return AbstractC15796.a(this.a.characteristics());
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ BinaryOperator combiner() {
        return this.a.combiner();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC11688 interfaceC11688 = this.a;
        if (obj instanceof C16338) {
            obj = ((C16338) obj).a;
        }
        return interfaceC11688.equals(obj);
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Function finisher() {
        return this.a.finisher();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Supplier supplier() {
        return this.a.supplier();
    }
}
