package p067l;

import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.stream.IntStream;

/* JADX INFO: renamed from: l.ܽۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18152 implements IntFunction, LongFunction {

    /* JADX INFO: renamed from: a */
    public IntFunction f54184a;

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        Object objApply = this.f54184a.apply(i);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof InterfaceC13123) {
            return C4405.convert((InterfaceC13123) objApply);
        }
        if (objApply instanceof IntStream) {
            return C9453.convert((IntStream) objApply);
        }
        C18013.m40990a(objApply.getClass(), "java.util.stream.IntStream");
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        return AbstractC11111.m25592G(j, this.f54184a);
    }
}
