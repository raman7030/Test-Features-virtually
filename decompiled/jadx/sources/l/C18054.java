package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: renamed from: l.ᩳ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: F4NW */
/* JADX INFO: loaded from: classes5.dex */
public final class C18054 extends AbstractC9608 implements NavigableMap, InterfaceC1830 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C18054 f56261;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final transient C18054 f56262;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final transient AbstractC14545 f56263;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final transient C9403 f56264;

    static {
        C9403 c9403M52241 = AbstractC23698.m52241(C13053.f39070);
        int i = AbstractC14545.f44556;
        f56261 = new C18054(c9403M52241, C16457.f50591, null);
    }

    public static C18054 of() {
        return f56261;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18054 m42113(Comparator comparator) {
        if (C13053.f39070.equals(comparator)) {
            return f56261;
        }
        return new C18054(AbstractC23698.m52241(comparator), C16457.f50591, null);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        C9403 c9403 = this.f56264;
        AbstractC23698 abstractC23698 = c9403.f76744;
        if (abstractC23698 != null) {
            return abstractC23698;
        }
        AbstractC23698 abstractC23698Mo24238 = c9403.mo24238();
        c9403.f76744 = abstractC23698Mo24238;
        abstractC23698Mo24238.f76744 = c9403;
        return abstractC23698Mo24238;
    }

    public C18054(C9403 c9403, AbstractC14545 abstractC14545, C18054 c18054) {
        this.f56264 = c9403;
        this.f56263 = abstractC14545;
        this.f56262 = c18054;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f56263.size();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // l.AbstractC9608, java.util.Map
    public final Object get(Object obj) {
        int iBinarySearch;
        C9403 c9403 = this.f56264;
        c9403.getClass();
        if (obj == null) {
            iBinarySearch = -1;
        } else {
            try {
                iBinarySearch = Collections.binarySearch(c9403.f28541, obj, c9403.f76745);
                if (iBinarySearch < 0) {
                    iBinarySearch = -1;
                }
            } catch (ClassCastException unused) {
            }
        }
        if (iBinarySearch == -1) {
            return null;
        }
        return this.f56263.get(iBinarySearch);
    }

    @Override // l.AbstractC9608
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo18096() {
        return this.f56264.f28541.mo19283() || this.f56263.mo19283();
    }

    @Override // l.AbstractC9608, java.util.Map
    public final Set entrySet() {
        return super.entrySet();
    }

    @Override // java.util.NavigableMap
    public final C18054 headMap(Object obj, boolean z) {
        obj.getClass();
        return m42112(0, this.f56264.m24241(obj, z));
    }

    @Override // java.util.NavigableMap
    public final C18054 subMap(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        C4025.m12111(this.f56264.f76745.compare(obj, obj2) <= 0, "expected fromKey <= toKey but %s > %s", obj, obj2);
        return headMap(obj2, z2).tailMap(obj, z);
    }

    @Override // java.util.NavigableMap
    public final C18054 tailMap(Object obj, boolean z) {
        obj.getClass();
        return m42112(this.f56264.m24245(obj, z), this.f56263.size());
    }

    @Override // l.AbstractC9608
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6079 mo18093() {
        if (isEmpty()) {
            int i = AbstractC6079.f18650;
            return C20692.f66656;
        }
        return new C1826(this);
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.f56264.f76745;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.f56264.first();
    }

    @Override // l.AbstractC9608, java.util.Map
    public final Set keySet() {
        return this.f56264;
    }

    @Override // l.AbstractC9608, java.util.Map
    public final AbstractC6079 keySet() {
        return this.f56264;
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.f56264.last();
    }

    @Override // l.AbstractC9608
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC6079 mo18094() {
        throw new AssertionError("should never be called");
    }

    @Override // l.AbstractC9608, java.util.Map
    public final Collection values() {
        return this.f56263;
    }

    @Override // l.AbstractC9608, java.util.Map
    public final AbstractC22725 values() {
        return this.f56263;
    }

    @Override // l.AbstractC9608
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC22725 mo18095() {
        throw new AssertionError("should never be called");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C18054 m42112(int i, int i2) {
        AbstractC14545 abstractC14545 = this.f56263;
        if (i == 0 && i2 == abstractC14545.size()) {
            return this;
        }
        C9403 c9403 = this.f56264;
        if (i != i2) {
            return new C18054(c9403.m24239(i, i2), abstractC14545.subList(i, i2), null);
        }
        return m42113(c9403.f76745);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return C19405.m44687(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return C19405.m44687(floorEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return C19405.m44687(ceilingEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return C19405.m44687(higherEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) super.entrySet().mo16996().get(0);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) super.entrySet().mo16996().get(this.f56263.size() - 1);
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        C18054 c18054 = this.f56262;
        if (c18054 == null) {
            boolean zIsEmpty = isEmpty();
            C9403 c9403 = this.f56264;
            if (!zIsEmpty) {
                AbstractC23698 abstractC23698Mo24238 = c9403.f76744;
                if (abstractC23698Mo24238 == null) {
                    abstractC23698Mo24238 = c9403.mo24238();
                    c9403.f76744 = abstractC23698Mo24238;
                    abstractC23698Mo24238.f76744 = c9403;
                }
                c18054 = new C18054((C9403) abstractC23698Mo24238, this.f56263.mo34737(), this);
            } else {
                return m42113(AbstractC10232.m25862(c9403.f76745).mo22482());
            }
        }
        return c18054;
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return this.f56264;
    }

    @Override // l.AbstractC9608
    public Object writeReplace() {
        return new C16642(this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
}
