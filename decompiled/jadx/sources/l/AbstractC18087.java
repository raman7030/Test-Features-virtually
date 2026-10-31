package l;

import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩳܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1DZ */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18087 implements InterfaceC12963, Serializable {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // l.InterfaceC9893
    public /* synthetic */ Object get(Object obj) {
        return C3086.m9434(this, obj);
    }

    @Override // l.InterfaceC9893
    public abstract /* synthetic */ int size();

    @Override // l.InterfaceC12963
    /* JADX INFO: renamed from: ܽ */
    public Object mo25484() {
        return null;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        return mo13249(C2837.m8732(i));
    }

    @Override // l.InterfaceC12963
    /* JADX INFO: renamed from: ֫ */
    public Object mo13246(char c, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return get(obj);
    }

    @Override // l.InterfaceC12963
    /* JADX INFO: renamed from: ܿ */
    public Object mo13251(char c) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC9893
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo13247(((Character) obj).charValue());
    }

    @Override // java.util.function.Function
    public final Function compose(Function function) {
        throw new NoSuchMethodError();
    }
}
