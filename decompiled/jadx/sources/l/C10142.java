package l;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۤ۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1C7F */
/* JADX INFO: loaded from: classes4.dex */
public class C10142 implements InterfaceC12963, Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C4497 f30519;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C10142 f30520 = this;

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    @Deprecated
    public final Object apply(Object obj) {
        Object obj2;
        Character ch = (Character) obj;
        synchronized (this.f30520) {
            obj2 = this.f30519.get(ch);
        }
        return obj2;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        Object objM9433;
        Character ch = (Character) obj;
        synchronized (this.f30520) {
            objM9433 = C3086.m9433(this.f30519, ch, obj2);
        }
        return objM9433;
    }

    public C10142(C4497 c4497) {
        this.f30519 = c4497;
    }

    @Override // java.util.function.IntFunction
    @Deprecated
    public final Object apply(int i) {
        Object objApply;
        synchronized (this.f30520) {
            objApply = this.f30519.apply(i);
        }
        return objApply;
    }

    @Override // l.InterfaceC9893
    public final int size() {
        int i;
        synchronized (this.f30520) {
            i = this.f30519.f14312;
        }
        return i;
    }

    @Override // l.InterfaceC12963
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object mo25484() {
        synchronized (this.f30520) {
        }
        return null;
    }

    @Override // java.util.function.Function
    public final Function compose(Function function) {
        throw new NoSuchMethodError();
    }

    @Override // l.InterfaceC12963
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo13247(char c) {
        boolean zMo13247;
        synchronized (this.f30520) {
            zMo13247 = this.f30519.mo13247(c);
        }
        return zMo13247;
    }

    @Override // l.InterfaceC9893
    @Deprecated
    public final boolean containsKey(Object obj) {
        boolean zContainsKey;
        synchronized (this.f30520) {
            zContainsKey = this.f30519.containsKey(obj);
        }
        return zContainsKey;
    }

    @Override // l.InterfaceC12963
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13246(char c, Object obj) {
        Object objMo13246;
        synchronized (this.f30520) {
            objMo13246 = this.f30519.mo13246(c, obj);
        }
        return objMo13246;
    }

    @Override // l.InterfaceC12963
    /* JADX INFO: renamed from: ۧ */
    public final Object mo13249(char c) {
        Object objMo13249;
        synchronized (this.f30520) {
            objMo13249 = this.f30519.mo13249(c);
        }
        return objMo13249;
    }

    @Override // l.InterfaceC12963
    /* JADX INFO: renamed from: ܿ */
    public final Object mo13251(char c) {
        Object objMo13251;
        synchronized (this.f30520) {
            objMo13251 = this.f30519.mo13251(c);
        }
        return objMo13251;
    }

    public final void clear() {
        synchronized (this.f30520) {
            this.f30519.clear();
        }
    }

    @Override // l.InterfaceC9893
    @Deprecated
    public final Object get(Object obj) {
        Object objM9434;
        synchronized (this.f30520) {
            objM9434 = C3086.m9434(this.f30519, obj);
        }
        return objM9434;
    }

    @Deprecated
    public final Object remove(Object obj) {
        Object objM9435;
        synchronized (this.f30520) {
            objM9435 = C3086.m9435(this.f30519, obj);
        }
        return objM9435;
    }

    public int hashCode() {
        int iHashCode;
        synchronized (this.f30520) {
            iHashCode = this.f30519.hashCode();
        }
        return iHashCode;
    }

    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f30520) {
            zEquals = this.f30519.equals(obj);
        }
        return zEquals;
    }

    public final String toString() {
        String string;
        synchronized (this.f30520) {
            string = this.f30519.toString();
        }
        return string;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f30520) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
