package l;

import java.io.Serializable;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: l.ۡܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WC20 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9031 implements InterfaceC7619, Serializable {
    public static final long serialVersionUID = -4940583368468432370L;

    public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        return C15755.$default$andThen(this, intUnaryOperator);
    }

    public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        return C15755.$default$compose(this, intUnaryOperator);
    }

    @Override // l.InterfaceC7619
    /* JADX INFO: renamed from: ֫ */
    public abstract byte mo15508(byte b, int i);

    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i) {
        return get(i);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return get(obj);
    }

    @Override // java.util.function.Function
    public final Function compose(Function function) {
        throw new NoSuchMethodError();
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final Function mo22274andThen(Function function) {
        throw new NoSuchMethodError();
    }
}
