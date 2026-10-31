package l;

import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֡ܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1BXE */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0563 implements InterfaceC12954, Serializable {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // l.InterfaceC9893
    public /* synthetic */ boolean containsKey(Object obj) {
        return C3077.m9405(this, obj);
    }

    @Override // l.InterfaceC9893
    public /* synthetic */ Object get(Object obj) {
        return C3077.m9406(this, obj);
    }

    @Override // l.InterfaceC9893
    public abstract /* synthetic */ int size();

    @Override // l.InterfaceC12954
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Object mo2319() {
        return null;
    }

    @Override // l.InterfaceC12954, java.util.function.IntFunction
    public final Object apply(int i) {
        return get(i);
    }

    @Override // l.InterfaceC12954
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object mo2318(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return get(obj);
    }

    @Override // l.InterfaceC12954
    public Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.function.Function
    public final Function compose(Function function) {
        throw new NoSuchMethodError();
    }
}
