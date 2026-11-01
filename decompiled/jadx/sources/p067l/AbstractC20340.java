package p067l;

import java.io.Serializable;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: l.ᩴܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1L7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20340 implements InterfaceC11131, Serializable {
    public static final long serialVersionUID = -4940583368468432370L;

    /* JADX INFO: renamed from: ᩸ */
    public int f62820;

    public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        return C17342.$default$andThen(this, intUnaryOperator);
    }

    public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        return C17342.$default$compose(this, intUnaryOperator);
    }

    @Override // p067l.InterfaceC11131
    /* JADX INFO: renamed from: ֫ */
    public abstract int mo25657(int i, int i2);

    /* JADX INFO: renamed from: ֫ */
    public final void m45919() {
        this.f62820 = -1;
    }

    @Override // p067l.InterfaceC11131
    /* JADX INFO: renamed from: ܽ */
    public int mo25659() {
        return this.f62820;
    }

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
    public final Function mo56417andThen(Function function) {
        throw new NoSuchMethodError();
    }
}
