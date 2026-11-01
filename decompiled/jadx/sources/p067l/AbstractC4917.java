package p067l;

import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۖܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4CC0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4917 implements InterfaceC10201, Serializable {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // p067l.InterfaceC10201, p067l.InterfaceC11771
    public /* synthetic */ Float get(Object obj) {
        return C3495.m6248(this, obj);
    }

    @Override // p067l.InterfaceC10201
    /* JADX INFO: renamed from: ܽ */
    public float mo10448() {
        return 0.0f;
    }

    @Override // p067l.InterfaceC11771
    public /* bridge */ /* synthetic */ Object get(Object obj) {
        return get(obj);
    }

    @Override // java.util.function.IntToDoubleFunction
    public final double applyAsDouble(int i) {
        return get(i);
    }

    @Override // p067l.InterfaceC10201
    /* JADX INFO: renamed from: ֫ */
    public float mo10447(float f, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return get(obj);
    }

    @Override // p067l.InterfaceC10201
    public float remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC11771
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo23794(((Integer) obj).intValue());
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
