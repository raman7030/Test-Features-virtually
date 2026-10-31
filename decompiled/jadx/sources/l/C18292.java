package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩳ᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: L978 */
/* JADX INFO: loaded from: classes4.dex */
public class C18292 implements Map {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC2821 f56883;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f56880 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f56881 = 16;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f56879 = (int) Math.floor(((double) 16) * 0.75d);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public LinkedList[] f56882 = new LinkedList[8];

    public C18292(AbstractC2821 abstractC2821) {
        this.f56883 = abstractC2821;
    }

    @Override // java.util.Map
    public final void clear() {
        int i = this.f56881;
        this.f56882 = new LinkedList[i];
        this.f56880 = 0;
        this.f56879 = (int) Math.floor(((double) i) * 0.75d);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        AbstractC2821 abstractC2821 = this.f56883;
        int iMo8711 = abstractC2821.mo8711(obj);
        LinkedList[] linkedListArr = this.f56882;
        LinkedList<C16880> linkedList = linkedListArr[iMo8711 & (linkedListArr.length - 1)];
        if (linkedList == null) {
            return null;
        }
        for (C16880 c16880 : linkedList) {
            if (abstractC2821.mo8715(c16880.f51797, obj)) {
                return c16880.f51798;
            }
        }
        return null;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        C16880 c16880;
        if (obj == null) {
            return null;
        }
        int i = this.f56880;
        if (i > this.f56879) {
            LinkedList[] linkedListArr = this.f56882;
            int length = linkedListArr.length * 2;
            this.f56882 = new LinkedList[length];
            this.f56879 = (int) (((double) length) * 0.75d);
            for (LinkedList linkedList : linkedListArr) {
                if (linkedList != null) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext() && (c16880 = (C16880) it.next()) != null) {
                        put(c16880.f51797, c16880.f51798);
                    }
                }
            }
            this.f56880 = i;
        }
        AbstractC2821 abstractC2821 = this.f56883;
        int iMo8711 = abstractC2821.mo8711(obj);
        LinkedList[] linkedListArr2 = this.f56882;
        int length2 = iMo8711 & (linkedListArr2.length - 1);
        LinkedList<C16880> linkedList2 = linkedListArr2[length2];
        if (linkedList2 == null) {
            linkedList2 = new LinkedList();
            linkedListArr2[length2] = linkedList2;
        }
        for (C16880 c16881 : linkedList2) {
            if (abstractC2821.mo8715(c16881.f51797, obj)) {
                Object obj3 = c16881.f51798;
                c16881.f51798 = obj2;
                this.f56880++;
                return obj3;
            }
        }
        linkedList2.add(new C16880(obj, obj2));
        this.f56880++;
        return null;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Set keySet() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Collection values() {
        ArrayList arrayList = new ArrayList(this.f56880);
        for (LinkedList linkedList : this.f56882) {
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C16880) it.next()).f51798);
                }
            }
        }
        return arrayList;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int hashCode() {
        C16880 c16880;
        int iM6876 = 0;
        for (LinkedList linkedList : this.f56882) {
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext() && (c16880 = (C16880) it.next()) != null) {
                    iM6876 = C2093.m6876(iM6876, this.f56883.mo8711(c16880.f51797));
                }
            }
        }
        return C2093.m6873(iM6876, this.f56880);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f56880;
    }

    public final String toString() {
        C16880 c16880;
        if (this.f56880 == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        boolean z = true;
        for (LinkedList linkedList : this.f56882) {
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext() && (c16880 = (C16880) it.next()) != null) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(c16880.toString());
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f56880 == 0;
    }
}
