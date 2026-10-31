package l;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.֫ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public class C1810 extends C22811 implements List, InterfaceC11728 {
    public static final long serialVersionUID = -7754090372962971524L;
    public final List c;

    public C1810(List list) {
        super(list);
        this.c = list;
    }

    public C1810(List list, Object obj) {
        super(list, obj);
        this.c = list;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        synchronized (this.b) {
            zEquals = this.c.equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashCode;
        synchronized (this.b) {
            iHashCode = this.c.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object obj;
        synchronized (this.b) {
            obj = this.c.get(i);
        }
        return obj;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        Object obj2;
        synchronized (this.b) {
            obj2 = this.c.set(i, obj);
        }
        return obj2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        synchronized (this.b) {
            this.c.add(i, obj);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        Object objRemove;
        synchronized (this.b) {
            objRemove = this.c.remove(i);
        }
        return objRemove;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int iIndexOf;
        synchronized (this.b) {
            iIndexOf = this.c.indexOf(obj);
        }
        return iIndexOf;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int iLastIndexOf;
        synchronized (this.b) {
            iLastIndexOf = this.c.lastIndexOf(obj);
        }
        return iLastIndexOf;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        boolean zAddAll;
        synchronized (this.b) {
            zAddAll = this.c.addAll(i, collection);
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.c.listIterator();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.c.listIterator(i);
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        C1810 c1810;
        synchronized (this.b) {
            c1810 = new C1810(this.c.subList(i, i2), this.b);
        }
        return c1810;
    }

    @Override // java.util.List, l.InterfaceC11728
    public final void replaceAll(UnaryOperator unaryOperator) {
        synchronized (this.b) {
            List list = this.c;
            if (list instanceof InterfaceC11728) {
                ((InterfaceC11728) list).replaceAll(unaryOperator);
            } else {
                C10317.$default$replaceAll(list, unaryOperator);
            }
        }
    }

    @Override // java.util.List, l.InterfaceC11728
    public final void sort(Comparator comparator) {
        synchronized (this.b) {
            C6083.sort(this.c, comparator);
        }
    }

    private Object readResolve() {
        List list = this.c;
        return list instanceof RandomAccess ? new C23682(list) : this;
    }
}
