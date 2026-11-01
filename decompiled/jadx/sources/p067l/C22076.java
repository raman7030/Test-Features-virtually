package p067l;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1BJ4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C22076 extends AbstractList {

    /* JADX INFO: renamed from: ᩸ */
    public final C12688 f69441 = new C12688();

    /* JADX INFO: renamed from: ܽ */
    public static /* synthetic */ void m49674(C22076 c22076) {
        ((AbstractList) c22076).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m49680((C13533) obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        C13533 c13533 = get(i);
        this.f69441.m29198(i, (C13533) obj);
        return c13533;
    }

    public C22076() {
    }

    public C22076(int i) {
    }

    public C22076(Collection collection) {
        addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f69441.m29194(), collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f69441.m29194();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m49675(int i) {
        int iM29194 = this.f69441.m29194() - 1;
        int i2 = 0;
        while (i2 <= iM29194) {
            int i3 = (i2 + iM29194) >>> 1;
            int iM49684 = m49684(i3);
            if (i < iM49684) {
                iM29194 = i3 - 1;
            } else {
                if (i <= iM49684) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49680(C13533 c13533) {
        add(this.f69441.m29194(), c13533);
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m49683(int i) {
        return i == this.f69441.m29194() - 1 || m49684(i + 1) != m49684(i);
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m49690() {
        return this.f69441.m29194() == 1 && m49682(0) == m49685(0);
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m49691() {
        return this.f69441.m29194() - 1;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m49694(int i, int i2) {
        if (i2 >= 0) {
            int iM29194 = this.f69441.m29194();
            if (iM29194 == 0) {
                return -1;
            }
            int iMin = Math.min(i2, iM29194 - 1);
            int iM49684 = m49684(iMin);
            if (iM49684 == i) {
                return iMin;
            }
            if (iM49684 < i) {
                int iM49672 = m49672(i, iMin, false);
                if (iM49672 >= iM29194 || m49684(iM49672) != i) {
                    return -1;
                }
                return iM49672;
            }
            int iM49673 = m49672(i, iMin, true) - 1;
            if (iM49673 < 0 || m49684(iM49673) != i) {
                return -1;
            }
            return iM49673;
        }
        throw new IndexOutOfBoundsException("Negative line index");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f69441.m29188();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final C13533 get(int i) {
        C13533 c13533 = new C13533();
        this.f69441.m29197(i, c13533);
        return c13533;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m49689(int i, C13533 c13533) {
        this.f69441.m29198(i, c13533);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final void add(int i, C13533 c13533) {
        this.f69441.m29192(i, c13533);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        C13533 c13533 = get(i);
        m49676(i, i + 1);
        return c13533;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        C22076 c22076;
        if (collection instanceof C22076) {
            c22076 = (C22076) collection;
        } else {
            C22076 c22077 = new C22076();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                c22077.m49680((C13533) it.next());
            }
            c22076 = c22077;
        }
        this.f69441.m29196(i, i, c22076.f69441);
        ((AbstractList) this).modCount++;
        return !c22076.isEmpty();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49676(int i, int i2) {
        this.f69441.m29196(i, i2, new C12688());
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m49676(i, i2);
    }

    /* JADX INFO: renamed from: ۚ */
    public final int m49682(int i) {
        return this.f69441.m29195(i, 0);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m49685(int i) {
        return this.f69441.m29195(i, 1);
    }

    /* JADX INFO: renamed from: ۡ */
    public final int m49684(int i) {
        return this.f69441.m29195(i, 2);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C15543 m49686() {
        C12688 c12688 = this.f69441;
        c12688.getClass();
        return new C15543(c12688);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49677(int i, int i2, int i3, int i4) {
        this.f69441.m29190(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m49687(int i, int i2) {
        this.f69441.m29189(i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49678(int i, int i2, C22076 c22076) {
        this.f69441.m29191(i, i2, c22076.f69441);
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49681(C22076 c22076) {
        if (this.f69441.m29193(c22076.f69441)) {
            ((AbstractList) this).modCount++;
            ((AbstractList) c22076).modCount++;
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m49696(int i) {
        return i == 0 || m49684(i + (-1)) != m49684(i);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m49693(int i) {
        return m49672(m49684(i), i, false);
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m49692(int i) {
        return m49672(m49684(i), i, true) - 1;
    }

    /* JADX INFO: renamed from: ۧ */
    private int m49672(int i, int i2, boolean z) {
        int iM29194;
        int i3;
        long j = 1;
        if (!m49671(i2, i, z)) {
            iM29194 = i2;
            while (true) {
                if (j > i2) {
                    i3 = 0;
                    break;
                }
                int i4 = i2 - ((int) j);
                if (m49671(i4, i, z)) {
                    i3 = i4 + 1;
                    break;
                }
                j <<= 1;
                iM29194 = i4;
            }
        } else {
            i3 = i2 + 1;
            C12688 c12688 = this.f69441;
            iM29194 = c12688.m29194();
            while (j < ((long) c12688.m29194()) - ((long) i2)) {
                int i5 = ((int) j) + i2;
                if (!m49671(i5, i, z)) {
                    iM29194 = i5;
                    break;
                }
                i3 = i5 + 1;
                j <<= 1;
            }
        }
        while (i3 < iM29194) {
            int i6 = (i3 + iM29194) >>> 1;
            if (m49671(i6, i, z)) {
                i3 = i6 + 1;
            } else {
                iM29194 = i6;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m49671(int i, int i2, boolean z) {
        int iM49684 = m49684(i);
        if (iM49684 >= i2) {
            return z && iM49684 == i2;
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C13533 m49695() {
        return get(m49691());
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m49688(int i, int i2, C22076 c22076) {
        this.f69441.m29196(i, i2 + i, c22076.f69441);
        ((AbstractList) this).modCount++;
    }
}
