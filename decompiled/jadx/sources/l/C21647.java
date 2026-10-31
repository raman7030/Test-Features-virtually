package l;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩸ܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: IF3 */
/* JADX INFO: loaded from: classes5.dex */
public class C21647 implements InterfaceC8241, Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C21214 f69482;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C21647 f69483 = this;

    @Override // java.util.function.Function
    @Deprecated
    public final Object apply(Object obj) {
        Float f;
        Integer num = (Integer) obj;
        synchronized (this.f69483) {
            f = (Float) this.f69482.get((Object) num);
        }
        return f;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        Float fM4005;
        Integer num = (Integer) obj;
        Float f = (Float) obj2;
        synchronized (this.f69483) {
            fM4005 = C1185.m4005(this.f69482, num, f);
        }
        return fM4005;
    }

    public C21647(C21214 c21214) {
        this.f69482 = c21214;
    }

    @Override // java.util.function.IntToDoubleFunction
    public final double applyAsDouble(int i) {
        double d;
        synchronized (this.f69483) {
            d = this.f69482.get(i);
        }
        return d;
    }

    @Override // l.InterfaceC9893
    public final int size() {
        int i;
        synchronized (this.f69483) {
            i = this.f69482.f68347;
        }
        return i;
    }

    @Override // l.InterfaceC8241
    /* JADX INFO: renamed from: ܽ */
    public final float mo8402() {
        synchronized (this.f69483) {
        }
        return 0.0f;
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

    @Override // l.InterfaceC8241
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo21825(int i) {
        boolean zMo21825;
        synchronized (this.f69483) {
            zMo21825 = this.f69482.mo21825(i);
        }
        return zMo21825;
    }

    @Override // l.InterfaceC9893
    @Deprecated
    public final boolean containsKey(Object obj) {
        boolean zContainsKey;
        synchronized (this.f69483) {
            zContainsKey = this.f69482.containsKey(obj);
        }
        return zContainsKey;
    }

    @Override // l.InterfaceC8241
    /* JADX INFO: renamed from: ֫ */
    public final float mo8401(float f, int i) {
        float fMo8401;
        synchronized (this.f69483) {
            fMo8401 = this.f69482.mo8401(f, i);
        }
        return fMo8401;
    }

    @Override // l.InterfaceC8241
    public final float get(int i) {
        float f;
        synchronized (this.f69483) {
            f = this.f69482.get(i);
        }
        return f;
    }

    @Override // l.InterfaceC8241
    public final float remove(int i) {
        float fRemove;
        synchronized (this.f69483) {
            fRemove = this.f69482.remove(i);
        }
        return fRemove;
    }

    public final void clear() {
        synchronized (this.f69483) {
            this.f69482.clear();
        }
    }

    @Override // l.InterfaceC9893
    @Deprecated
    public final Float get(Object obj) {
        Float fM4006;
        synchronized (this.f69483) {
            fM4006 = C1185.m4006(this.f69482, obj);
        }
        return fM4006;
    }

    @Deprecated
    public final Object remove(Object obj) {
        Float fM4007;
        synchronized (this.f69483) {
            fM4007 = C1185.m4007(this.f69482, obj);
        }
        return fM4007;
    }

    public int hashCode() {
        int iHashCode;
        synchronized (this.f69483) {
            iHashCode = this.f69482.hashCode();
        }
        return iHashCode;
    }

    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f69483) {
            zEquals = this.f69482.equals(obj);
        }
        return zEquals;
    }

    public final String toString() {
        String string;
        synchronized (this.f69483) {
            string = this.f69482.toString();
        }
        return string;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f69483) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
