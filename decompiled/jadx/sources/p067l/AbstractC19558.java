package p067l;

import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩳܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1DZ */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19558 implements InterfaceC14688, Serializable {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo56417andThen(Function function) {
        return C22038.$default$andThen(this, function);
    }

    @Override // p067l.InterfaceC11771
    public /* synthetic */ Object get(Object obj) {
        return C5301.m11477(this, obj);
    }

    @Override // p067l.InterfaceC11771
    public abstract /* synthetic */ int size();

    @Override // p067l.InterfaceC14688
    /* JADX INFO: renamed from: ܽ */
    public Object mo27503() {
        return null;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        return mo15132(C5065.m10799(i));
    }

    @Override // p067l.InterfaceC14688
    /* JADX INFO: renamed from: ֫ */
    public Object mo15129(char c, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return get(obj);
    }

    @Override // p067l.InterfaceC14688
    /* JADX INFO: renamed from: ܿ */
    public Object mo15134(char c) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC11771
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo15130(((Character) obj).charValue());
    }

    @Override // java.util.function.Function
    public final Function compose(Function function) {
        throw new NoSuchMethodError();
    }
}
