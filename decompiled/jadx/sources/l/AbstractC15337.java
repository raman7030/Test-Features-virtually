package l;

import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܶܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: LCL2 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15337 implements InterfaceC15652, Serializable {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // l.InterfaceC9893
    public /* synthetic */ Object get(Object obj) {
        return C8598.m22327(this, obj);
    }

    @Override // java.util.function.LongFunction
    public final Object apply(long j) {
        return mo7450(j);
    }

    /* JADX INFO: renamed from: ֫ */
    public Object mo23890(long j, Object obj) {
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
