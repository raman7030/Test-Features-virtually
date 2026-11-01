package p067l;

import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܶܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: LCL2 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16945 implements InterfaceC17244, Serializable {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo56417andThen(Function function) {
        return C22038.$default$andThen(this, function);
    }

    @Override // p067l.InterfaceC11771
    public /* synthetic */ Object get(Object obj) {
        return C10540.m24296(this, obj);
    }

    @Override // java.util.function.LongFunction
    public final Object apply(long j) {
        return mo9532(j);
    }

    /* JADX INFO: renamed from: ֫ */
    public Object mo25899(long j, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return get(obj);
    }

    @Override // java.util.function.Function
    public final Function compose(Function function) {
        throw new NoSuchMethodError();
    }
}
