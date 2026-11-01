package p067l;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۤۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: PHN */
/* JADX INFO: loaded from: classes4.dex */
public class C11999 implements InterfaceC14680, Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ᩸ */
    public final C4623 f33457;

    /* JADX INFO: renamed from: ᩹ */
    public final C11999 f33458 = this;

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo56417andThen(Function function) {
        return C22038.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    @Deprecated
    public final Object apply(Object obj) {
        Object obj2;
        Integer num = (Integer) obj;
        synchronized (this.f33458) {
            obj2 = this.f33457.get(num);
        }
        return obj2;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        Object objM11446;
        Integer num = (Integer) obj;
        synchronized (this.f33458) {
            objM11446 = C5293.m11446(this.f33457, num, obj2);
        }
        return objM11446;
    }

    public C11999(C4623 c4623) {
        this.f33457 = c4623;
    }

    @Override // p067l.InterfaceC14680, java.util.function.IntFunction
    public final Object apply(int i) {
        Object obj;
        synchronized (this.f33458) {
            obj = this.f33457.get(i);
        }
        return obj;
    }

    @Override // p067l.InterfaceC11771
    public final int size() {
        int i;
        synchronized (this.f33458) {
            i = this.f33457.f10368;
        }
        return i;
    }

    @Override // p067l.InterfaceC14680
    /* JADX INFO: renamed from: ܽ */
    public final Object mo4687() {
        synchronized (this.f33458) {
        }
        return null;
    }

    @Override // java.util.function.Function
    public final Function compose(Function function) {
        throw new NoSuchMethodError();
    }

    @Override // p067l.InterfaceC14680
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4793(int i) {
        boolean zMo4793;
        synchronized (this.f33458) {
            zMo4793 = this.f33457.mo4793(i);
        }
        return zMo4793;
    }

    @Override // p067l.InterfaceC11771
    @Deprecated
    public final boolean containsKey(Object obj) {
        boolean zM11447;
        synchronized (this.f33458) {
            zM11447 = C5293.m11447(this.f33457, obj);
        }
        return zM11447;
    }

    @Override // p067l.InterfaceC14680
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4686(int i, Object obj) {
        Object objMo4686;
        synchronized (this.f33458) {
            objMo4686 = this.f33457.mo4686(i, obj);
        }
        return objMo4686;
    }

    @Override // p067l.InterfaceC14680
    public final Object get(int i) {
        Object obj;
        synchronized (this.f33458) {
            obj = this.f33457.get(i);
        }
        return obj;
    }

    @Override // p067l.InterfaceC14680
    public final Object remove(int i) {
        Object objRemove;
        synchronized (this.f33458) {
            objRemove = this.f33457.remove(i);
        }
        return objRemove;
    }

    public final void clear() {
        synchronized (this.f33458) {
            this.f33457.clear();
        }
    }

    @Override // p067l.InterfaceC11771
    @Deprecated
    public final Object get(Object obj) {
        Object objM11448;
        synchronized (this.f33458) {
            objM11448 = C5293.m11448(this.f33457, obj);
        }
        return objM11448;
    }

    @Deprecated
    public final Object remove(Object obj) {
        Object objM11449;
        synchronized (this.f33458) {
            objM11449 = C5293.m11449(this.f33457, obj);
        }
        return objM11449;
    }

    public int hashCode() {
        int iHashCode;
        synchronized (this.f33458) {
            iHashCode = this.f33457.hashCode();
        }
        return iHashCode;
    }

    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f33458) {
            zEquals = this.f33457.equals(obj);
        }
        return zEquals;
    }

    public final String toString() {
        String string;
        synchronized (this.f33458) {
            string = this.f33457.toString();
        }
        return string;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f33458) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
