package l;

import java.io.Serializable;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: l.ۧܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: KCC7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11032 implements InterfaceC13852, Serializable {
    public static final long serialVersionUID = -4940583368468432370L;

    public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        return C15755.$default$andThen(this, intUnaryOperator);
    }

    public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        return C15755.$default$compose(this, intUnaryOperator);
    }

    @Override // l.InterfaceC13852, l.InterfaceC9893
    public /* synthetic */ Character get(Object obj) {
        return C23025.m51166(this, obj);
    }

    @Override // l.InterfaceC9893
    public /* bridge */ /* synthetic */ Object get(Object obj) {
        return get(obj);
    }

    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i) {
        return mo20130(C2837.m8732(i));
    }

    @Override // l.InterfaceC13852
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public char mo27373(char c, char c2) {
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
    public final Function mo22274andThen(Function function) {
        throw new NoSuchMethodError();
    }
}
