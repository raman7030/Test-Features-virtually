package l;

import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۬ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1LO */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12872 implements InterfaceC21773, Serializable {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }

    @Override // l.InterfaceC21773, l.InterfaceC9893
    public /* synthetic */ Integer get(Object obj) {
        return C15421.m36466(this, obj);
    }

    @Override // l.InterfaceC9893
    public abstract /* synthetic */ int size();

    @Override // l.InterfaceC9893
    public /* bridge */ /* synthetic */ Object get(Object obj) {
        return get(obj);
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        return mo21968(obj);
    }

    @Override // l.InterfaceC21773
    /* JADX INFO: renamed from: ֫ */
    public int mo21965(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return get(obj);
    }

    @Override // l.InterfaceC21773
    /* JADX INFO: renamed from: ֫ */
    public int mo21966(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final Function mo22274andThen(Function function) {
        throw new NoSuchMethodError();
    }
}
