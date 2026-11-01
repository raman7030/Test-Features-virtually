package p067l;

import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۬ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1LO */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14602 implements InterfaceC23062, Serializable {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C22038.$default$compose(this, function);
    }

    @Override // p067l.InterfaceC23062, p067l.InterfaceC11771
    public /* synthetic */ Integer get(Object obj) {
        return C17025.m38624(this, obj);
    }

    @Override // p067l.InterfaceC11771
    public abstract /* synthetic */ int size();

    @Override // p067l.InterfaceC11771
    public /* bridge */ /* synthetic */ Object get(Object obj) {
        return get(obj);
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        return mo23939(obj);
    }

    @Override // p067l.InterfaceC23062
    /* JADX INFO: renamed from: ֫ */
    public int mo23936(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return get(obj);
    }

    @Override // p067l.InterfaceC23062
    /* JADX INFO: renamed from: ֫ */
    public int mo23937(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final Function mo56417andThen(Function function) {
        throw new NoSuchMethodError();
    }
}
