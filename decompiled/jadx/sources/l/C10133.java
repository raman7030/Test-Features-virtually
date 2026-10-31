package l;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۤۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: PHN */
/* JADX INFO: loaded from: classes4.dex */
public class C10133 implements InterfaceC12954, Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C2372 f30495;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C10133 f30496 = this;

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    @Deprecated
    public final Object apply(Object obj) {
        Object obj2;
        Integer num = (Integer) obj;
        synchronized (this.f30496) {
            obj2 = this.f30495.get(num);
        }
        return obj2;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        Object objM9404;
        Integer num = (Integer) obj;
        synchronized (this.f30496) {
            objM9404 = C3077.m9404(this.f30495, num, obj2);
        }
        return objM9404;
    }

    public C10133(C2372 c2372) {
        this.f30495 = c2372;
    }

    @Override // l.InterfaceC12954, java.util.function.IntFunction
    public final Object apply(int i) {
        Object obj;
        synchronized (this.f30496) {
            obj = this.f30495.get(i);
        }
        return obj;
    }

    @Override // l.InterfaceC9893
    public final int size() {
        int i;
        synchronized (this.f30496) {
            i = this.f30495.f7577;
        }
        return i;
    }

    @Override // l.InterfaceC12954
    /* JADX INFO: renamed from: ܽ */
    public final Object mo2319() {
        synchronized (this.f30496) {
        }
        return null;
    }

    @Override // java.util.function.Function
    public final Function compose(Function function) {
        throw new NoSuchMethodError();
    }

    @Override // l.InterfaceC12954
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2422(int i) {
        boolean zMo2422;
        synchronized (this.f30496) {
            zMo2422 = this.f30495.mo2422(i);
        }
        return zMo2422;
    }

    @Override // l.InterfaceC9893
    @Deprecated
    public final boolean containsKey(Object obj) {
        boolean zM9405;
        synchronized (this.f30496) {
            zM9405 = C3077.m9405(this.f30495, obj);
        }
        return zM9405;
    }

    @Override // l.InterfaceC12954
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2318(int i, Object obj) {
        Object objMo2318;
        synchronized (this.f30496) {
            objMo2318 = this.f30495.mo2318(i, obj);
        }
        return objMo2318;
    }

    @Override // l.InterfaceC12954
    public final Object get(int i) {
        Object obj;
        synchronized (this.f30496) {
            obj = this.f30495.get(i);
        }
        return obj;
    }

    @Override // l.InterfaceC12954
    public final Object remove(int i) {
        Object objRemove;
        synchronized (this.f30496) {
            objRemove = this.f30495.remove(i);
        }
        return objRemove;
    }

    public final void clear() {
        synchronized (this.f30496) {
            this.f30495.clear();
        }
    }

    @Override // l.InterfaceC9893
    @Deprecated
    public final Object get(Object obj) {
        Object objM9406;
        synchronized (this.f30496) {
            objM9406 = C3077.m9406(this.f30495, obj);
        }
        return objM9406;
    }

    @Deprecated
    public final Object remove(Object obj) {
        Object objM9407;
        synchronized (this.f30496) {
            objM9407 = C3077.m9407(this.f30495, obj);
        }
        return objM9407;
    }

    public int hashCode() {
        int iHashCode;
        synchronized (this.f30496) {
            iHashCode = this.f30495.hashCode();
        }
        return iHashCode;
    }

    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f30496) {
            zEquals = this.f30495.equals(obj);
        }
        return zEquals;
    }

    public final String toString() {
        String string;
        synchronized (this.f30496) {
            string = this.f30495.toString();
        }
        return string;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f30496) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
