package p067l;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.֫ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public class C4089 extends C24048 implements List, InterfaceC13515 {
    public static final long serialVersionUID = -7754090372962971524L;

    /* JADX INFO: renamed from: c */
    public final List f9017c;

    public C4089(List list) {
        super(list);
        this.f9017c = list;
    }

    public C4089(List list, Object obj) {
        super(list, obj);
        this.f9017c = list;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f76380b) {
            zEquals = this.f9017c.equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f76380b) {
            iHashCode = this.f9017c.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object obj;
        synchronized (this.f76380b) {
            obj = this.f9017c.get(i);
        }
        return obj;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        Object obj2;
        synchronized (this.f76380b) {
            obj2 = this.f9017c.set(i, obj);
        }
        return obj2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        synchronized (this.f76380b) {
            this.f9017c.add(i, obj);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        Object objRemove;
        synchronized (this.f76380b) {
            objRemove = this.f9017c.remove(i);
        }
        return objRemove;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int iIndexOf;
        synchronized (this.f76380b) {
            iIndexOf = this.f9017c.indexOf(obj);
        }
        return iIndexOf;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int iLastIndexOf;
        synchronized (this.f76380b) {
            iLastIndexOf = this.f9017c.lastIndexOf(obj);
        }
        return iLastIndexOf;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        boolean zAddAll;
        synchronized (this.f76380b) {
            zAddAll = this.f9017c.addAll(i, collection);
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f9017c.listIterator();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.f9017c.listIterator(i);
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        C4089 c4089;
        synchronized (this.f76380b) {
            c4089 = new C4089(this.f9017c.subList(i, i2), this.f76380b);
        }
        return c4089;
    }

    @Override // java.util.List, p067l.InterfaceC13515
    public final void replaceAll(UnaryOperator unaryOperator) {
        synchronized (this.f76380b) {
            List list = this.f9017c;
            if (list instanceof InterfaceC13515) {
                ((InterfaceC13515) list).replaceAll(unaryOperator);
            } else {
                C12174.$default$replaceAll(list, unaryOperator);
            }
        }
    }

    @Override // java.util.List, p067l.InterfaceC13515
    public final void sort(Comparator comparator) {
        synchronized (this.f76380b) {
            C8150.sort(this.f9017c, comparator);
        }
    }

    private Object readResolve() {
        List list = this.f9017c;
        return list instanceof RandomAccess ? new C24876(list) : this;
    }
}
