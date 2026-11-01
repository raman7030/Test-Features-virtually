package p067l;

import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۖܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: L42O */
/* JADX INFO: loaded from: classes2.dex */
public class C4848 extends AbstractCollection implements List {

    /* JADX INFO: renamed from: ۗ */
    public static final C4848 f11031 = new C11554(null, null);

    /* JADX INFO: renamed from: ۙ */
    public static final Iterator f11032 = new C10883();

    /* JADX INFO: renamed from: ᩶ */
    public static final /* synthetic */ int f11033 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public Object f11034;

    /* JADX INFO: renamed from: ᩹ */
    public C4848 f11035;

    public C4848(Object obj, C4848 c4848) {
        this.f11035 = c4848;
        this.f11034 = obj;
    }

    /* JADX INFO: renamed from: ܳ */
    public static C4848 m10283() {
        return f11031;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4848 m10281(Object obj, C4848 c4848) {
        C1446.m31699(obj);
        C4848 c4849 = f11031;
        for (Object obj2 : c4848) {
            if (obj2 != null && !obj2.equals(obj)) {
                c4849.getClass();
                c4849 = new C4848(obj2, c4849);
            }
        }
        return c4849.m10294();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4848 m10291(C4848 c4848) {
        C20271 c20271 = new C20271();
        for (Object obj : this) {
            if (c4848.contains(obj)) {
                c20271.m45777(obj);
            }
        }
        return c20271.m45783();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m10288(C4848 c4848) {
        C20271 c20271 = new C20271();
        for (Object obj : this) {
            if (!c4848.contains(obj)) {
                c20271.m45777(obj);
            }
        }
        return c20271.m45783();
    }

    /* JADX INFO: renamed from: of */
    public static C4848 m10276of(Object obj) {
        return new C4848(obj, f11031);
    }

    /* JADX INFO: renamed from: of */
    public static C4848 m10277of(Object obj, Object obj2) {
        return new C4848(obj, m10276of(obj2));
    }

    /* JADX INFO: renamed from: of */
    public static C4848 m10278of(Object obj, Object obj2, Object obj3) {
        return new C4848(obj, m10277of(obj2, obj3));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4848 m10280(Object obj, Object obj2, Object obj3, Object... objArr) {
        return new C4848(obj, new C4848(obj2, new C4848(obj3, m10282(objArr))));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4848 m10282(Object[] objArr) {
        C4848 c4848 = f11031;
        if (objArr != null) {
            int length = objArr.length - 1;
            while (length >= 0) {
                C4848 c4849 = new C4848(objArr[length], c4848);
                length--;
                c4848 = c4849;
            }
        }
        return c4848;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4848 m10279(Iterable iterable) {
        C20271 c20271 = new C20271();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c20271.m45777(it.next());
        }
        return c20271.m45783();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f11035 == null;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m10293() {
        return this.f11035 != null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m10289() {
        int i = 0;
        C4848 c4848 = this;
        while (true) {
            c4848 = c4848.f11035;
            if (c4848 == null) {
                return i;
            }
            i++;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return m10289();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i2 > m10289() || i > i2) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i2 - i);
        C4848 c4848 = this;
        for (int i3 = 0; c4848.f11035 != null && i3 != i2; i3++) {
            if (i3 >= i) {
                arrayList.add(c4848.f11034);
            }
            c4848 = c4848.f11035;
        }
        return C21562.unmodifiableList(arrayList);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[m10289()]);
    }

    /* JADX INFO: renamed from: ᩳ */
    public C4848 mo10295(C4848 c4848) {
        this.f11035 = c4848;
        return c4848;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4848 m10290(Object obj) {
        return new C4848(obj, this);
    }

    /* JADX INFO: renamed from: ܽ */
    public final C4848 m10292(C4848 c4848) {
        if (isEmpty()) {
            return c4848;
        }
        if (c4848.isEmpty()) {
            return this;
        }
        if (c4848.f11035.isEmpty()) {
            return new C4848(c4848.f11034, this);
        }
        C4848 c4848M10294 = c4848.m10294();
        C1446.m31704(c4848M10294 != c4848);
        C4848 c4849 = this;
        while (c4848M10294.m10293()) {
            C4848 c48410 = c4848M10294.f11035;
            c4848M10294.mo10295(c4849);
            c4849 = c4848M10294;
            c4848M10294 = c48410;
        }
        return c4849;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C4848 m10294() {
        if (isEmpty() || this.f11035.isEmpty()) {
            return this;
        }
        C4848 c4848 = f11031;
        C4848 c4849 = this;
        while (c4849.m10293()) {
            C4848 c48410 = new C4848(c4849.f11034, c4848);
            c4849 = c4849.f11035;
            c4848 = c48410;
        }
        return c4848;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m10286(Object obj) {
        return m10276of(obj).m10292(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int i = 0;
        C4848 c4848 = this;
        while (c4848.m10293() && i < objArr.length) {
            objArr[i] = c4848.f11034;
            c4848 = c4848.f11035;
            i++;
        }
        if (c4848.isEmpty()) {
            if (i < objArr.length) {
                objArr[i] = null;
            }
            return objArr;
        }
        return toArray((Object[]) Array.newInstance(objArr.getClass().getComponentType(), m10289()));
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m10285(String str) {
        if (isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11034);
        for (C4848 c4848 = this.f11035; c4848.m10293(); c4848 = c4848.f11035) {
            sb.append(str);
            sb.append(c4848.f11034);
        }
        return sb.toString();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return m10285(",");
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashCode = 1;
        for (C4848 c4848 = this; c4848.f11035 != null; c4848 = c4848.f11035) {
            int i = iHashCode * 31;
            Object obj = c4848.f11034;
            iHashCode = i + (obj == null ? 0 : obj.hashCode());
        }
        return iHashCode;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        C4848 c4848;
        if (obj instanceof C4848) {
            C4848 c4849 = (C4848) obj;
            C4848 c48410 = this;
            while (true) {
                c4848 = c48410.f11035;
                if (c4848 == null || c4849.f11035 == null) {
                    break;
                }
                Object obj2 = c48410.f11034;
                if (obj2 == null) {
                    if (c4849.f11034 != null) {
                        return false;
                    }
                } else if (!obj2.equals(c4849.f11034)) {
                    return false;
                }
                c48410 = c48410.f11035;
                c4849 = c4849.f11035;
            }
            return c4848 == null && c4849.f11035 == null;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Iterator it = ((List) obj).iterator();
        C4848 c48411 = this;
        while (c48411.f11035 != null && it.hasNext()) {
            Object next = it.next();
            Object obj3 = c48411.f11034;
            if (obj3 == null) {
                if (next != null) {
                    return false;
                }
            } else if (!obj3.equals(next)) {
                return false;
            }
            c48411 = c48411.f11035;
        }
        return c48411.isEmpty() && !it.hasNext();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        for (C4848 c4848 = this; c4848.f11035 != null; c4848 = c4848.f11035) {
            if (obj == null) {
                if (c4848.f11034 == null) {
                    return true;
                }
            } else if (c4848.f11034.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public final Object last() {
        Object obj = null;
        C4848 c4848 = this;
        while (true) {
            C4848 c4849 = c4848.f11035;
            if (c4849 == null) {
                return obj;
            }
            obj = c4848.f11034;
            c4848 = c4849;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m10287(Function function) {
        C20271 c20271 = new C20271();
        Iterator it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            Object objApply = function.apply(next);
            c20271.m45777(objApply);
            z |= objApply != next;
        }
        return z ? c20271.m45783() : this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        if (this.f11035 == null) {
            return f11032;
        }
        C17587 c17587 = new C17587();
        c17587.f52577 = this;
        return c17587;
    }

    @Override // java.util.List
    public final Object get(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(String.valueOf(i));
        }
        C4848 c4848 = this;
        int i2 = i;
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0 || c4848.isEmpty()) {
                break;
            }
            c4848 = c4848.f11035;
            i2 = i3;
        }
        if (!c4848.isEmpty()) {
            return c4848.f11034;
        }
        StringBuilder sbM34408 = C15033.m34408(i, "Index: ", ", Size: ");
        sbM34408.append(m10289());
        throw new IndexOutOfBoundsException(sbM34408.toString());
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = 0;
        C4848 c4848 = this;
        while (c4848.f11035 != null) {
            Object obj2 = c4848.f11034;
            if (obj2 == null) {
                if (obj == null) {
                    return i;
                }
                c4848 = c4848.f11035;
                i++;
            } else {
                if (obj2.equals(obj)) {
                    return i;
                }
                c4848 = c4848.f11035;
                i++;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0014  */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = -1;
        int i2 = 0;
        C4848 c4848 = this;
        while (c4848.f11035 != null) {
            Object obj2 = c4848.f11034;
            if (obj2 == null) {
                if (obj == null) {
                    i = i2;
                }
            } else if (obj2.equals(obj)) {
                i = i2;
            }
            c4848 = c4848.f11035;
            i2++;
        }
        return i;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return C21562.unmodifiableList(new ArrayList(this)).listIterator();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return C21562.unmodifiableList(new ArrayList(this)).listIterator(i);
    }

    /* JADX INFO: renamed from: ܿ */
    public static InterfaceC13477 m10284() {
        return C12136.m28048of(new C24964(0), new C8871(0), new C22283(0), new C17024(8), new EnumC8112[0]);
    }
}
