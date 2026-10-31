package l;

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
public class C2609 extends AbstractCollection implements List {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final C2609 f8237 = new C9665(null, null);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Iterator f8238 = new C8959();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f8239 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object f8240;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C2609 f8241;

    public C2609(Object obj, C2609 c2609) {
        this.f8241 = c2609;
        this.f8240 = obj;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C2609 m8239() {
        return f8237;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2609 m8237(Object obj, C2609 c2609) {
        C12171.m29637(obj);
        C2609 c26010 = f8237;
        for (Object obj2 : c2609) {
            if (obj2 != null && !obj2.equals(obj)) {
                c26010.getClass();
                c26010 = new C2609(obj2, c26010);
            }
        }
        return c26010.m8250();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2609 m8247(C2609 c2609) {
        C18837 c18837 = new C18837();
        for (Object obj : this) {
            if (c2609.contains(obj)) {
                c18837.m43511(obj);
            }
        }
        return c18837.m43517();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m8244(C2609 c2609) {
        C18837 c18837 = new C18837();
        for (Object obj : this) {
            if (!c2609.contains(obj)) {
                c18837.m43511(obj);
            }
        }
        return c18837.m43517();
    }

    public static C2609 of(Object obj) {
        return new C2609(obj, f8237);
    }

    public static C2609 of(Object obj, Object obj2) {
        return new C2609(obj, of(obj2));
    }

    public static C2609 of(Object obj, Object obj2, Object obj3) {
        return new C2609(obj, of(obj2, obj3));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2609 m8236(Object obj, Object obj2, Object obj3, Object... objArr) {
        return new C2609(obj, new C2609(obj2, new C2609(obj3, m8238(objArr))));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2609 m8238(Object[] objArr) {
        C2609 c2609 = f8237;
        if (objArr != null) {
            int length = objArr.length - 1;
            while (length >= 0) {
                C2609 c26010 = new C2609(objArr[length], c2609);
                length--;
                c2609 = c26010;
            }
        }
        return c2609;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2609 m8235(Iterable iterable) {
        C18837 c18837 = new C18837();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c18837.m43511(it.next());
        }
        return c18837.m43517();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f8241 == null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m8249() {
        return this.f8241 != null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m8245() {
        int i = 0;
        C2609 c2609 = this;
        while (true) {
            c2609 = c2609.f8241;
            if (c2609 == null) {
                return i;
            }
            i++;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return m8245();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i2 > m8245() || i > i2) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i2 - i);
        C2609 c2609 = this;
        for (int i3 = 0; c2609.f8241 != null && i3 != i2; i3++) {
            if (i3 >= i) {
                arrayList.add(c2609.f8240);
            }
            c2609 = c2609.f8241;
        }
        return C20195.unmodifiableList(arrayList);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[m8245()]);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C2609 mo8251(C2609 c2609) {
        this.f8241 = c2609;
        return c2609;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2609 m8246(Object obj) {
        return new C2609(obj, this);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2609 m8248(C2609 c2609) {
        if (isEmpty()) {
            return c2609;
        }
        if (c2609.isEmpty()) {
            return this;
        }
        if (c2609.f8241.isEmpty()) {
            return new C2609(c2609.f8240, this);
        }
        C2609 c2609M8250 = c2609.m8250();
        C12171.m29642(c2609M8250 != c2609);
        C2609 c26010 = this;
        while (c2609M8250.m8249()) {
            C2609 c26011 = c2609M8250.f8241;
            c2609M8250.mo8251(c26010);
            c26010 = c2609M8250;
            c2609M8250 = c26011;
        }
        return c26010;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C2609 m8250() {
        if (isEmpty() || this.f8241.isEmpty()) {
            return this;
        }
        C2609 c2609 = f8237;
        C2609 c26010 = this;
        while (c26010.m8249()) {
            C2609 c26011 = new C2609(c26010.f8240, c2609);
            c26010 = c26010.f8241;
            c2609 = c26011;
        }
        return c2609;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m8242(Object obj) {
        return of(obj).m8248(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int i = 0;
        C2609 c2609 = this;
        while (c2609.m8249() && i < objArr.length) {
            objArr[i] = c2609.f8240;
            c2609 = c2609.f8241;
            i++;
        }
        if (c2609.isEmpty()) {
            if (i < objArr.length) {
                objArr[i] = null;
            }
            return objArr;
        }
        return toArray((Object[]) Array.newInstance(objArr.getClass().getComponentType(), m8245()));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m8241(String str) {
        if (isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8240);
        for (C2609 c2609 = this.f8241; c2609.m8249(); c2609 = c2609.f8241) {
            sb.append(str);
            sb.append(c2609.f8240);
        }
        return sb.toString();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return m8241(",");
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashCode = 1;
        for (C2609 c2609 = this; c2609.f8241 != null; c2609 = c2609.f8241) {
            int i = iHashCode * 31;
            Object obj = c2609.f8240;
            iHashCode = i + (obj == null ? 0 : obj.hashCode());
        }
        return iHashCode;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        C2609 c2609;
        if (obj instanceof C2609) {
            C2609 c26010 = (C2609) obj;
            C2609 c26011 = this;
            while (true) {
                c2609 = c26011.f8241;
                if (c2609 == null || c26010.f8241 == null) {
                    break;
                }
                Object obj2 = c26011.f8240;
                if (obj2 == null) {
                    if (c26010.f8240 != null) {
                        return false;
                    }
                } else if (!obj2.equals(c26010.f8240)) {
                    return false;
                }
                c26011 = c26011.f8241;
                c26010 = c26010.f8241;
            }
            return c2609 == null && c26010.f8241 == null;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Iterator it = ((List) obj).iterator();
        C2609 c26012 = this;
        while (c26012.f8241 != null && it.hasNext()) {
            Object next = it.next();
            Object obj3 = c26012.f8240;
            if (obj3 == null) {
                if (next != null) {
                    return false;
                }
            } else if (!obj3.equals(next)) {
                return false;
            }
            c26012 = c26012.f8241;
        }
        return c26012.isEmpty() && !it.hasNext();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        for (C2609 c2609 = this; c2609.f8241 != null; c2609 = c2609.f8241) {
            if (obj == null) {
                if (c2609.f8240 == null) {
                    return true;
                }
            } else if (c2609.f8240.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public final Object last() {
        Object obj = null;
        C2609 c2609 = this;
        while (true) {
            C2609 c26010 = c2609.f8241;
            if (c26010 == null) {
                return obj;
            }
            obj = c2609.f8240;
            c2609 = c26010;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m8243(Function function) {
        C18837 c18837 = new C18837();
        Iterator it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            Object objApply = function.apply(next);
            c18837.m43511(objApply);
            z |= objApply != next;
        }
        return z ? c18837.m43517() : this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        if (this.f8241 == null) {
            return f8238;
        }
        C16013 c16013 = new C16013();
        c16013.f49414 = this;
        return c16013;
    }

    @Override // java.util.List
    public final Object get(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(String.valueOf(i));
        }
        C2609 c2609 = this;
        int i2 = i;
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0 || c2609.isEmpty()) {
                break;
            }
            c2609 = c2609.f8241;
            i2 = i3;
        }
        if (!c2609.isEmpty()) {
            return c2609.f8240;
        }
        StringBuilder sbM32308 = C13325.m32308(i, "Index: ", ", Size: ");
        sbM32308.append(m8245());
        throw new IndexOutOfBoundsException(sbM32308.toString());
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
        C2609 c2609 = this;
        while (c2609.f8241 != null) {
            Object obj2 = c2609.f8240;
            if (obj2 == null) {
                if (obj == null) {
                    return i;
                }
                c2609 = c2609.f8241;
                i++;
            } else {
                if (obj2.equals(obj)) {
                    return i;
                }
                c2609 = c2609.f8241;
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
        C2609 c2609 = this;
        while (c2609.f8241 != null) {
            Object obj2 = c2609.f8240;
            if (obj2 == null) {
                if (obj == null) {
                    i = i2;
                }
            } else if (obj2.equals(obj)) {
                i = i2;
            }
            c2609 = c2609.f8241;
            i2++;
        }
        return i;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return C20195.unmodifiableList(new ArrayList(this)).listIterator();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return C20195.unmodifiableList(new ArrayList(this)).listIterator(i);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static InterfaceC11688 m8240() {
        return C10277.of(new C23775(0), new C6842(0), new C20954(0), new C15420(8), new EnumC6043[0]);
    }
}
