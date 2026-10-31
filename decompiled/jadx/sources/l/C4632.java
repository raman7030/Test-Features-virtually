package l;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۙۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4632 extends C22353 {
    public static final long serialVersionUID = 7854390611657943733L;

    @Override // l.C18744, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public final void forEach(Consumer consumer) {
        C11003.requireNonNull(consumer);
        C5378.a(this.a, new C2122(consumer, 2));
    }

    @Override // l.C18744, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC15234 spliterator() {
        return new C22271(C5378.b(this.a));
    }

    @Override // l.C18744, java.util.Collection, l.InterfaceC1144
    /* JADX INFO: renamed from: stream */
    public final InterfaceC17664 mo42464stream() {
        return C14841.stream(spliterator(), false);
    }

    @Override // l.C18744, java.util.Collection, l.InterfaceC1144
    /* JADX INFO: renamed from: parallelStream */
    public final InterfaceC17664 mo42463parallelStream() {
        return C14841.stream(spliterator(), true);
    }

    @Override // l.C18744, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2516(this);
    }

    @Override // l.C18744, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] array = this.a.toArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = new C15214((Map.Entry) array[i]);
        }
        return array;
    }

    @Override // l.C18744, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Object[] array = this.a.toArray(objArr.length == 0 ? objArr : Arrays.copyOf(objArr, 0));
        for (int i = 0; i < array.length; i++) {
            array[i] = new C15214((Map.Entry) array[i]);
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

    @Override // l.C18744, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return this.a.contains(new C15214((Map.Entry) obj));
        }
        return false;
    }

    @Override // l.C18744, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // l.C22353, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.size() != this.a.size()) {
            return false;
        }
        return containsAll(set);
    }
}
