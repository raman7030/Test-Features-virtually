package p067l;

import java.io.Serializable;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: l.ۧܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: KCC7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12853 implements InterfaceC15533, Serializable {
    public static final long serialVersionUID = -4940583368468432370L;

    public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        return C17342.$default$andThen(this, intUnaryOperator);
    }

    public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        return C17342.$default$compose(this, intUnaryOperator);
    }

    @Override // p067l.InterfaceC15533, p067l.InterfaceC11771
    public /* synthetic */ Character get(Object obj) {
        return C24251.m53559(this, obj);
    }

    @Override // p067l.InterfaceC11771
    public /* bridge */ /* synthetic */ Object get(Object obj) {
        return get(obj);
    }

    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i) {
        return mo22106(C5065.m10799(i));
    }

    @Override // p067l.InterfaceC15533
    /* JADX INFO: renamed from: ֫ */
    public char mo29435(char c, char c2) {
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

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final Function mo56417andThen(Function function) {
        throw new NoSuchMethodError();
    }
}
