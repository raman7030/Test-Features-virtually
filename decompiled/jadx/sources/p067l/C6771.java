package p067l;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۙۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6771 extends C23613 {
    public static final long serialVersionUID = 7854390611657943733L;

    @Override // p067l.C20183, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    public final void forEach(Consumer consumer) {
        C12826.requireNonNull(consumer);
        C7480.m17260a(this.f62465a, new C4386(consumer, 2));
    }

    @Override // p067l.C20183, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC16847 spliterator() {
        return new C23535(C7480.m17261b(this.f62465a));
    }

    @Override // p067l.C20183, java.util.Collection, p067l.InterfaceC3456
    /* JADX INFO: renamed from: stream */
    public final InterfaceC19157 mo56528stream() {
        return C16474.stream(spliterator(), false);
    }

    @Override // p067l.C20183, java.util.Collection, p067l.InterfaceC3456
    /* JADX INFO: renamed from: parallelStream */
    public final InterfaceC19157 mo56527parallelStream() {
        return C16474.stream(spliterator(), true);
    }

    @Override // p067l.C20183, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C4760(this);
    }

    @Override // p067l.C20183, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] array = this.f62465a.toArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = new C16828((Map.Entry) array[i]);
        }
        return array;
    }

    @Override // p067l.C20183, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Object[] array = this.f62465a.toArray(objArr.length == 0 ? objArr : Arrays.copyOf(objArr, 0));
        for (int i = 0; i < array.length; i++) {
            array[i] = new C16828((Map.Entry) array[i]);
        }
        if (array.length > objArr.length) {
            return array;
        }
        System.arraycopy(array, 0, objArr, 0, array.length);
        if (objArr.length > array.length) {
            objArr[array.length] = null;
        }
        return objArr;
    }

    @Override // p067l.C20183, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return this.f62465a.contains(new C16828((Map.Entry) obj));
        }
        return false;
    }

    @Override // p067l.C20183, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // p067l.C23613, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.size() != this.f62465a.size()) {
            return false;
        }
        return containsAll(set);
    }
}
