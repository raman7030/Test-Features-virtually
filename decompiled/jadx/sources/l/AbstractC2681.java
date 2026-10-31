package l;

import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۖܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4CC0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2681 implements InterfaceC8241, Serializable {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // l.InterfaceC8241, l.InterfaceC9893
    public /* synthetic */ Float get(Object obj) {
        return C1185.m4006(this, obj);
    }

    @Override // l.InterfaceC8241
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float mo8402() {
        return 0.0f;
    }

    @Override // l.InterfaceC9893
    public /* bridge */ /* synthetic */ Object get(Object obj) {
        return get(obj);
    }

    @Override // java.util.function.IntToDoubleFunction
    public final double applyAsDouble(int i) {
        return get(i);
    }

    @Override // l.InterfaceC8241
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float mo8401(float f, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return get(obj);
    }

    @Override // l.InterfaceC8241
    public float remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC9893
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo21825(((Integer) obj).intValue());
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
