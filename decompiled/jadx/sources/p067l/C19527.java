package p067l;

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
public final class C19527 extends AbstractC11500 implements NavigableMap, InterfaceC4108 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۤ */
    public static final C19527 f59463;

    /* JADX INFO: renamed from: ۗ */
    public final transient C19527 f59464;

    /* JADX INFO: renamed from: ۫ */
    public final transient AbstractC16192 f59465;

    /* JADX INFO: renamed from: ۬ */
    public final transient C11305 f59466;

    static {
        C11305 c11305M54645 = AbstractC24891.m54645(C14774.f42115);
        int i = AbstractC16192.f47662;
        f59463 = new C19527(c11305M54645, C18009.f53770, null);
    }

    /* JADX INFO: renamed from: of */
    public static C19527 m44362of() {
        return f59463;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19527 m44365(Comparator comparator) {
        if (C14774.f42115.equals(comparator)) {
            return f59463;
        }
        return new C19527(AbstractC24891.m54645(comparator), C18009.f53770, null);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        C11305 c11305 = this.f59466;
        AbstractC24891 abstractC24891 = c11305.f79494;
        if (abstractC24891 != null) {
            return abstractC24891;
        }
        AbstractC24891 abstractC24891Mo26248 = c11305.mo26248();
        c11305.f79494 = abstractC24891Mo26248;
        abstractC24891Mo26248.f79494 = c11305;
        return abstractC24891Mo26248;
    }

    public C19527(C11305 c11305, AbstractC16192 abstractC16192, C19527 c19527) {
        this.f59466 = c11305;
        this.f59465 = abstractC16192;
        this.f59464 = c19527;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f59465.size();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // p067l.AbstractC11500, java.util.Map
    public final Object get(Object obj) {
        int iBinarySearch;
        C11305 c11305 = this.f59466;
        c11305.getClass();
        if (obj == null) {
            iBinarySearch = -1;
        } else {
            try {
                iBinarySearch = Collections.binarySearch(c11305.f31490, obj, c11305.f79495);
                if (iBinarySearch < 0) {
                    iBinarySearch = -1;
                }
            } catch (ClassCastException unused) {
            }
        }
        if (iBinarySearch == -1) {
            return null;
        }
        return this.f59465.get(iBinarySearch);
    }

    @Override // p067l.AbstractC11500
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo20047() {
        return this.f59466.f31490.mo21230() || this.f59465.mo21230();
    }

    @Override // p067l.AbstractC11500, java.util.Map
    public final Set entrySet() {
        return super.entrySet();
    }

    @Override // java.util.NavigableMap
    public final C19527 headMap(Object obj, boolean z) {
        obj.getClass();
        return m44364(0, this.f59466.m26251(obj, z));
    }

    @Override // java.util.NavigableMap
    public final C19527 subMap(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        C6194.m14031(this.f59466.f79495.compare(obj, obj2) <= 0, "expected fromKey <= toKey but %s > %s", obj, obj2);
        return headMap(obj2, z2).tailMap(obj, z);
    }

    @Override // java.util.NavigableMap
    public final C19527 tailMap(Object obj, boolean z) {
        obj.getClass();
        return m44364(this.f59466.m26255(obj, z), this.f59465.size());
    }

    @Override // p067l.AbstractC11500
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8146 mo20044() {
        if (isEmpty()) {
            int i = AbstractC8146.f21506;
            return C22034.f69338;
        }
        return new C4104(this);
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.f59466.f79495;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.f59466.first();
    }

    @Override // p067l.AbstractC11500, java.util.Map
    public final Set keySet() {
        return this.f59466;
    }

    @Override // p067l.AbstractC11500, java.util.Map
    public final AbstractC8146 keySet() {
        return this.f59466;
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.f59466.last();
    }

    @Override // p067l.AbstractC11500
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC8146 mo20045() {
        throw new AssertionError("should never be called");
    }

    @Override // p067l.AbstractC11500, java.util.Map
    public final Collection values() {
        return this.f59465;
    }

    @Override // p067l.AbstractC11500, java.util.Map
    public final AbstractC23966 values() {
        return this.f59465;
    }

    @Override // p067l.AbstractC11500
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC23966 mo20046() {
        throw new AssertionError("should never be called");
    }

    /* JADX INFO: renamed from: ֫ */
    private C19527 m44364(int i, int i2) {
        AbstractC16192 abstractC16192 = this.f59465;
        if (i == 0 && i2 == abstractC16192.size()) {
            return this;
        }
        C11305 c11305 = this.f59466;
        if (i != i2) {
            return new C19527(c11305.m26249(i, i2), abstractC16192.subList(i, i2), null);
        }
        return m44365(c11305.f79495);
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
        return C20811.m46981(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return C20811.m46981(floorEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return C20811.m46981(ceilingEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return C20811.m46981(higherEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) super.entrySet().mo18927().get(0);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) super.entrySet().mo18927().get(this.f59465.size() - 1);
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
        C19527 c19527 = this.f59464;
        if (c19527 == null) {
            boolean zIsEmpty = isEmpty();
            C11305 c11305 = this.f59466;
            if (!zIsEmpty) {
                AbstractC24891 abstractC24891Mo26248 = c11305.f79494;
                if (abstractC24891Mo26248 == null) {
                    abstractC24891Mo26248 = c11305.mo26248();
                    c11305.f79494 = abstractC24891Mo26248;
                    abstractC24891Mo26248.f79494 = c11305;
                }
                c19527 = new C19527((C11305) abstractC24891Mo26248, this.f59465.mo36886(), this);
            } else {
                return m44365(AbstractC12093.m27884(c11305.f79495).mo24451());
            }
        }
        return c19527;
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return this.f59466;
    }

    @Override // p067l.AbstractC11500
    public Object writeReplace() {
        return new C18185(this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
}
