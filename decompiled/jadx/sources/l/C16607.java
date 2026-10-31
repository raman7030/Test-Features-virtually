package l;

import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.stream.IntStream;

/* JADX INFO: renamed from: l.ܽۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16607 implements IntFunction, LongFunction {
    public IntFunction a;

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        Object objApply = this.a.apply(i);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof InterfaceC11315) {
            return C2142.convert((InterfaceC11315) objApply);
        }
        if (objApply instanceof IntStream) {
            return C7454.convert((IntStream) objApply);
        }
        C16461.a(objApply.getClass(), "java.util.stream.IntStream");
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        return AbstractC9198.G(j, this.a);
    }
}
