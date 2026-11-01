package p067l;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩸ܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: IF3 */
/* JADX INFO: loaded from: classes5.dex */
public class C22942 implements InterfaceC10201, Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ᩸ */
    public final C22531 f72185;

    /* JADX INFO: renamed from: ᩹ */
    public final C22942 f72186 = this;

    @Override // java.util.function.Function
    @Deprecated
    public final Object apply(Object obj) {
        Float f;
        Integer num = (Integer) obj;
        synchronized (this.f72186) {
            f = (Float) this.f72185.get((Object) num);
        }
        return f;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        Float fM6247;
        Integer num = (Integer) obj;
        Float f = (Float) obj2;
        synchronized (this.f72186) {
            fM6247 = C3495.m6247(this.f72185, num, f);
        }
        return fM6247;
    }

    public C22942(C22531 c22531) {
        this.f72185 = c22531;
    }

    @Override // java.util.function.IntToDoubleFunction
    public final double applyAsDouble(int i) {
        double d;
        synchronized (this.f72186) {
            d = this.f72185.get(i);
        }
        return d;
    }

    @Override // p067l.InterfaceC11771
    public final int size() {
        int i;
        synchronized (this.f72186) {
            i = this.f72185.f71030;
        }
        return i;
    }

    @Override // p067l.InterfaceC10201
    /* JADX INFO: renamed from: ܽ */
    public final float mo10448() {
        synchronized (this.f72186) {
        }
        return 0.0f;
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

    @Override // p067l.InterfaceC10201
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo23794(int i) {
        boolean zMo23794;
        synchronized (this.f72186) {
            zMo23794 = this.f72185.mo23794(i);
        }
        return zMo23794;
    }

    @Override // p067l.InterfaceC11771
    @Deprecated
    public final boolean containsKey(Object obj) {
        boolean zContainsKey;
        synchronized (this.f72186) {
            zContainsKey = this.f72185.containsKey(obj);
        }
        return zContainsKey;
    }

    @Override // p067l.InterfaceC10201
    /* JADX INFO: renamed from: ֫ */
    public final float mo10447(float f, int i) {
        float fMo10447;
        synchronized (this.f72186) {
            fMo10447 = this.f72185.mo10447(f, i);
        }
        return fMo10447;
    }

    @Override // p067l.InterfaceC10201
    public final float get(int i) {
        float f;
        synchronized (this.f72186) {
            f = this.f72185.get(i);
        }
        return f;
    }

    @Override // p067l.InterfaceC10201
    public final float remove(int i) {
        float fRemove;
        synchronized (this.f72186) {
            fRemove = this.f72185.remove(i);
        }
        return fRemove;
    }

    public final void clear() {
        synchronized (this.f72186) {
            this.f72185.clear();
        }
    }

    @Override // p067l.InterfaceC11771
    @Deprecated
    public final Float get(Object obj) {
        Float fM6248;
        synchronized (this.f72186) {
            fM6248 = C3495.m6248(this.f72185, obj);
        }
        return fM6248;
    }

    @Deprecated
    public final Object remove(Object obj) {
        Float fM6249;
        synchronized (this.f72186) {
            fM6249 = C3495.m6249(this.f72185, obj);
        }
        return fM6249;
    }

    public int hashCode() {
        int iHashCode;
        synchronized (this.f72186) {
            iHashCode = this.f72185.hashCode();
        }
        return iHashCode;
    }

    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f72186) {
            zEquals = this.f72185.equals(obj);
        }
        return zEquals;
    }

    public final String toString() {
        String string;
        synchronized (this.f72186) {
            string = this.f72185.toString();
        }
        return string;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f72186) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
