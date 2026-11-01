package p067l;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۤ۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1C7F */
/* JADX INFO: loaded from: classes4.dex */
public class C12007 implements InterfaceC14688, Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ᩸ */
    public final C6642 f33481;

    /* JADX INFO: renamed from: ᩹ */
    public final C12007 f33482 = this;

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo56417andThen(Function function) {
        return C22038.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    @Deprecated
    public final Object apply(Object obj) {
        Object obj2;
        Character ch = (Character) obj;
        synchronized (this.f33482) {
            obj2 = this.f33481.get(ch);
        }
        return obj2;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        Object objM11476;
        Character ch = (Character) obj;
        synchronized (this.f33482) {
            objM11476 = C5301.m11476(this.f33481, ch, obj2);
        }
        return objM11476;
    }

    public C12007(C6642 c6642) {
        this.f33481 = c6642;
    }

    @Override // java.util.function.IntFunction
    @Deprecated
    public final Object apply(int i) {
        Object objApply;
        synchronized (this.f33482) {
            objApply = this.f33481.apply(i);
        }
        return objApply;
    }

    @Override // p067l.InterfaceC11771
    public final int size() {
        int i;
        synchronized (this.f33482) {
            i = this.f33481.f17139;
        }
        return i;
    }

    @Override // p067l.InterfaceC14688
    /* JADX INFO: renamed from: ܽ */
    public final Object mo27503() {
        synchronized (this.f33482) {
        }
        return null;
    }

    @Override // java.util.function.Function
    public final Function compose(Function function) {
        throw new NoSuchMethodError();
    }

    @Override // p067l.InterfaceC14688
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo15130(char c) {
        boolean zMo15130;
        synchronized (this.f33482) {
            zMo15130 = this.f33481.mo15130(c);
        }
        return zMo15130;
    }

    @Override // p067l.InterfaceC11771
    @Deprecated
    public final boolean containsKey(Object obj) {
        boolean zContainsKey;
        synchronized (this.f33482) {
            zContainsKey = this.f33481.containsKey(obj);
        }
        return zContainsKey;
    }

    @Override // p067l.InterfaceC14688
    /* JADX INFO: renamed from: ֫ */
    public final Object mo15129(char c, Object obj) {
        Object objMo15129;
        synchronized (this.f33482) {
            objMo15129 = this.f33481.mo15129(c, obj);
        }
        return objMo15129;
    }

    @Override // p067l.InterfaceC14688
    /* JADX INFO: renamed from: ۧ */
    public final Object mo15132(char c) {
        Object objMo15132;
        synchronized (this.f33482) {
            objMo15132 = this.f33481.mo15132(c);
        }
        return objMo15132;
    }

    @Override // p067l.InterfaceC14688
    /* JADX INFO: renamed from: ܿ */
    public final Object mo15134(char c) {
        Object objMo15134;
        synchronized (this.f33482) {
            objMo15134 = this.f33481.mo15134(c);
        }
        return objMo15134;
    }

    public final void clear() {
        synchronized (this.f33482) {
            this.f33481.clear();
        }
    }

    @Override // p067l.InterfaceC11771
    @Deprecated
    public final Object get(Object obj) {
        Object objM11477;
        synchronized (this.f33482) {
            objM11477 = C5301.m11477(this.f33481, obj);
        }
        return objM11477;
    }

    @Deprecated
    public final Object remove(Object obj) {
        Object objM11478;
        synchronized (this.f33482) {
            objM11478 = C5301.m11478(this.f33481, obj);
        }
        return objM11478;
    }

    public int hashCode() {
        int iHashCode;
        synchronized (this.f33482) {
            iHashCode = this.f33481.hashCode();
        }
        return iHashCode;
    }

    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f33482) {
            zEquals = this.f33481.equals(obj);
        }
        return zEquals;
    }

    public final String toString() {
        String string;
        synchronized (this.f33482) {
            string = this.f33481.toString();
        }
        return string;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f33482) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
