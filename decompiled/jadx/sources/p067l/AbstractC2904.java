package p067l;

import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֡ܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1BXE */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2904 implements InterfaceC14680, Serializable {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo56417andThen(Function function) {
        return C22038.$default$andThen(this, function);
    }

    @Override // p067l.InterfaceC11771
    public /* synthetic */ boolean containsKey(Object obj) {
        return C5293.m11447(this, obj);
    }

    @Override // p067l.InterfaceC11771
    public /* synthetic */ Object get(Object obj) {
        return C5293.m11448(this, obj);
    }

    @Override // p067l.InterfaceC11771
    public abstract /* synthetic */ int size();

    @Override // p067l.InterfaceC14680
    /* JADX INFO: renamed from: ܽ */
    public Object mo4687() {
        return null;
    }

    @Override // p067l.InterfaceC14680, java.util.function.IntFunction
    public final Object apply(int i) {
        return get(i);
    }

    @Override // p067l.InterfaceC14680
    /* JADX INFO: renamed from: ֫ */
    public Object mo4686(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return get(obj);
    }

    @Override // p067l.InterfaceC14680
    public Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.function.Function
    public final Function compose(Function function) {
        throw new NoSuchMethodError();
    }
}
