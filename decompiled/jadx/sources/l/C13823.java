package l;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.ܰ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C13823 implements Comparator, Serializable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C13823(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ToIntFunction toIntFunction = (ToIntFunction) this.b;
                return Integer.compare(toIntFunction.applyAsInt(obj), toIntFunction.applyAsInt(obj2));
            case 1:
                ToDoubleFunction toDoubleFunction = (ToDoubleFunction) this.b;
                return Double.compare(toDoubleFunction.applyAsDouble(obj), toDoubleFunction.applyAsDouble(obj2));
            case 2:
                Function function = (Function) this.b;
                return ((Comparable) function.apply(obj)).compareTo(function.apply(obj2));
            default:
                ToLongFunction toLongFunction = (ToLongFunction) this.b;
                return Long.compare(toLongFunction.applyAsLong(obj), toLongFunction.applyAsLong(obj2));
        }
    }
}
