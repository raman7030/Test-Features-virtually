package p067l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩳ᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: L978 */
/* JADX INFO: loaded from: classes4.dex */
public class C19753 implements Map {

    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC5050 f60101;

    /* JADX INFO: renamed from: ۙ */
    public int f60098 = 0;

    /* JADX INFO: renamed from: ᩶ */
    public final int f60099 = 16;

    /* JADX INFO: renamed from: ۗ */
    public int f60097 = (int) Math.floor(((double) 16) * 0.75d);

    /* JADX INFO: renamed from: ᩸ */
    public LinkedList[] f60100 = new LinkedList[8];

    public C19753(AbstractC5050 abstractC5050) {
        this.f60101 = abstractC5050;
    }

    @Override // java.util.Map
    public final void clear() {
        int i = this.f60099;
        this.f60100 = new LinkedList[i];
        this.f60098 = 0;
        this.f60097 = (int) Math.floor(((double) i) * 0.75d);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        AbstractC5050 abstractC5050 = this.f60101;
        int iMo10772 = abstractC5050.mo10772(obj);
        LinkedList[] linkedListArr = this.f60100;
        LinkedList<C18411> linkedList = linkedListArr[iMo10772 & (linkedListArr.length - 1)];
        if (linkedList == null) {
            return null;
        }
        for (C18411 c18411 : linkedList) {
            if (abstractC5050.mo10776(c18411.f54978, obj)) {
                return c18411.f54979;
            }
        }
        return null;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        C18411 c18411;
        if (obj == null) {
            return null;
        }
        int i = this.f60098;
        if (i > this.f60097) {
            LinkedList[] linkedListArr = this.f60100;
            int length = linkedListArr.length * 2;
            this.f60100 = new LinkedList[length];
            this.f60097 = (int) (((double) length) * 0.75d);
            for (LinkedList linkedList : linkedListArr) {
                if (linkedList != null) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext() && (c18411 = (C18411) it.next()) != null) {
                        put(c18411.f54978, c18411.f54979);
                    }
                }
            }
            this.f60098 = i;
        }
        AbstractC5050 abstractC5050 = this.f60101;
        int iMo10772 = abstractC5050.mo10772(obj);
        LinkedList[] linkedListArr2 = this.f60100;
        int length2 = iMo10772 & (linkedListArr2.length - 1);
        LinkedList<C18411> linkedList2 = linkedListArr2[length2];
        if (linkedList2 == null) {
            linkedList2 = new LinkedList();
            linkedListArr2[length2] = linkedList2;
        }
        for (C18411 c18412 : linkedList2) {
            if (abstractC5050.mo10776(c18412.f54978, obj)) {
                Object obj3 = c18412.f54979;
                c18412.f54979 = obj2;
                this.f60098++;
                return obj3;
            }
        }
        linkedList2.add(new C18411(obj, obj2));
        this.f60098++;
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
        ArrayList arrayList = new ArrayList(this.f60098);
        for (LinkedList linkedList : this.f60100) {
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C18411) it.next()).f54979);
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
        C18411 c18411;
        int iM9002 = 0;
        for (LinkedList linkedList : this.f60100) {
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext() && (c18411 = (C18411) it.next()) != null) {
                    iM9002 = C4358.m9002(iM9002, this.f60101.mo10772(c18411.f54978));
                }
            }
        }
        return C4358.m8999(iM9002, this.f60098);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f60098;
    }

    public final String toString() {
        C18411 c18411;
        if (this.f60098 == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        boolean z = true;
        for (LinkedList linkedList : this.f60100) {
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext() && (c18411 = (C18411) it.next()) != null) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(c18411.toString());
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f60098 == 0;
    }
}
