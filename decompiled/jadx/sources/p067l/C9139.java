package p067l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۟֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1CGN */
/* JADX INFO: loaded from: classes3.dex */
public final class C9139 extends AbstractC16355 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ */
    public transient int f24726;

    /* JADX INFO: renamed from: ۙ */
    public transient Object[] f24727;

    /* JADX INFO: renamed from: ۛ */
    public final transient int f24728;

    /* JADX INFO: renamed from: ۤ */
    public transient int f24729;

    /* JADX INFO: renamed from: ۨ */
    public transient int f24730;

    /* JADX INFO: renamed from: ۫ */
    public transient int f24731;

    /* JADX INFO: renamed from: ۬ */
    public transient long[] f24732;

    /* JADX INFO: renamed from: ܰ */
    public InterfaceC11100 f24733;

    /* JADX INFO: renamed from: ᩶ */
    public transient int f24734;

    /* JADX INFO: renamed from: ᩸ */
    public transient boolean f24735;

    /* JADX INFO: renamed from: ᩹ */
    public final float f24736;

    /* JADX INFO: renamed from: ᩺ */
    public int f24737;

    public C9139() {
        throw null;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return null;
    }

    @Override // p067l.AbstractC16355, p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C9139(InterfaceC11100 interfaceC11100) {
        this.f24734 = -1;
        this.f24726 = -1;
        this.f24733 = interfaceC11100;
        this.f24736 = 0.75f;
        int iM34880 = C15322.m34880(0.75f, 16);
        this.f24730 = iM34880;
        this.f24728 = iM34880;
        this.f24731 = iM34880 - 1;
        this.f24729 = C15322.m34887(0.75f, iM34880);
        int i = this.f24730 + 1;
        this.f24727 = new Object[i];
        this.f24732 = new long[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        float f = this.f24736;
        if (f <= 0.5d) {
            int iM34880 = C15322.m34880(f, collection.size());
            if (iM34880 > this.f24730) {
                m21085(iM34880);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C15322.m34883((long) Math.ceil((collection.size() + this.f24737) / f))));
            if (iMin > this.f24730) {
                m21085(iMin);
            }
        }
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        Object obj2;
        if (this.f24733.mo10801(obj, null)) {
            if (this.f24735) {
                return false;
            }
            i = this.f24730;
            this.f24735 = true;
            this.f24727[i] = obj;
        } else {
            Object[] objArr = this.f24727;
            int iM34881 = C15322.m34881(this.f24733.mo10800(obj)) & this.f24731;
            Object obj3 = objArr[iM34881];
            if (obj3 != null) {
                if (this.f24733.mo10801(obj3, obj)) {
                    return false;
                }
                do {
                    iM34881 = (iM34881 + 1) & this.f24731;
                    obj2 = objArr[iM34881];
                    if (obj2 != null) {
                    }
                } while (!this.f24733.mo10801(obj2, obj));
                return false;
            }
            objArr[iM34881] = obj;
            i = iM34881;
        }
        int i2 = this.f24737;
        if (i2 == 0) {
            this.f24726 = i;
            this.f24734 = i;
            this.f24732[i] = -1;
        } else {
            long[] jArr = this.f24732;
            int i3 = this.f24726;
            long j = jArr[i3];
            jArr[i3] = j ^ (((((long) i) & 4294967295L) ^ j) & 4294967295L);
            jArr[i] = ((((long) i3) & 4294967295L) << 32) | 4294967295L;
            this.f24726 = i;
        }
        this.f24737 = i2 + 1;
        if (i2 >= this.f24729) {
            m21085(C15322.m34880(this.f24736, i2 + 2));
        }
        return true;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m21084(int i) {
        Object obj;
        Object[] objArr = this.f24727;
        while (true) {
            int i2 = (i + 1) & this.f24731;
            while (true) {
                obj = objArr[i2];
                if (obj == null) {
                    objArr[i] = null;
                    return;
                }
                int iM34881 = C15322.m34881(this.f24733.mo10800(obj));
                int i3 = this.f24731;
                int i4 = iM34881 & i3;
                if (i > i2) {
                    if (i >= i4 && i4 > i2) {
                        break;
                    } else {
                        i2 = (i2 + 1) & i3;
                    }
                } else if (i >= i4 || i4 > i2) {
                    break;
                } else {
                    i2 = (i2 + 1) & i3;
                }
            }
            objArr[i] = obj;
            m21083(i2, i);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m21081(int i) {
        this.f24737--;
        m21082(i);
        m21084(i);
        int i2 = this.f24730;
        if (i2 <= this.f24728 || this.f24737 >= this.f24729 / 4 || i2 <= 16) {
            return;
        }
        m21085(i2 / 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        if (this.f24733.mo10801(obj, null)) {
            if (this.f24735) {
                this.f24735 = false;
                Object[] objArr = this.f24727;
                int i = this.f24730;
                objArr[i] = null;
                this.f24737--;
                m21082(i);
                int i2 = this.f24730;
                if (i2 > this.f24728 && this.f24737 < this.f24729 / 4 && i2 > 16) {
                    m21085(i2 / 2);
                }
                return true;
            }
        } else {
            Object[] objArr2 = this.f24727;
            int iM34881 = C15322.m34881(this.f24733.mo10800(obj)) & this.f24731;
            Object obj3 = objArr2[iM34881];
            if (obj3 != null) {
                if (this.f24733.mo10801(obj, obj3)) {
                    m21081(iM34881);
                    return true;
                }
                do {
                    iM34881 = (iM34881 + 1) & this.f24731;
                    obj2 = objArr2[iM34881];
                    if (obj2 == null) {
                    }
                } while (!this.f24733.mo10801(obj, obj2));
                m21081(iM34881);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object obj2;
        if (this.f24733.mo10801(obj, null)) {
            return this.f24735;
        }
        Object[] objArr = this.f24727;
        int iM34881 = C15322.m34881(this.f24733.mo10800(obj)) & this.f24731;
        Object obj3 = objArr[iM34881];
        if (obj3 == null) {
            return false;
        }
        if (!this.f24733.mo10801(obj, obj3)) {
            do {
                iM34881 = (iM34881 + 1) & this.f24731;
                obj2 = objArr[iM34881];
                if (obj2 == null) {
                    return false;
                }
            } while (!this.f24733.mo10801(obj, obj2));
        }
        return true;
    }

    public final Object removeFirst() {
        int i = this.f24737;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        int i2 = this.f24734;
        if (i == 1) {
            this.f24726 = -1;
            this.f24734 = -1;
        } else {
            long[] jArr = this.f24732;
            int i3 = (int) jArr[i2];
            this.f24734 = i3;
            if (i3 >= 0) {
                jArr[i3] = jArr[i3] | (-4294967296L);
            }
        }
        Object obj = this.f24727[i2];
        this.f24737 = i - 1;
        if (this.f24733.mo10801(obj, null)) {
            this.f24735 = false;
            this.f24727[this.f24730] = null;
        } else {
            m21084(i2);
        }
        int i4 = this.f24730;
        if (i4 > this.f24728 && this.f24737 < this.f24729 / 4 && i4 > 16) {
            m21085(i4 / 2);
        }
        return obj;
    }

    public final Object removeLast() {
        int i = this.f24737;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        int i2 = this.f24726;
        if (i == 1) {
            this.f24726 = -1;
            this.f24734 = -1;
        } else {
            long[] jArr = this.f24732;
            int i3 = (int) (jArr[i2] >>> 32);
            this.f24726 = i3;
            if (i3 >= 0) {
                jArr[i3] = jArr[i3] | 4294967295L;
            }
        }
        Object obj = this.f24727[i2];
        this.f24737 = i - 1;
        if (this.f24733.mo10801(obj, null)) {
            this.f24735 = false;
            this.f24727[this.f24730] = null;
        } else {
            m21084(i2);
        }
        int i4 = this.f24730;
        if (i4 > this.f24728 && this.f24737 < this.f24729 / 4 && i4 > 16) {
            m21085(i4 / 2);
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f24737 == 0) {
            return;
        }
        this.f24737 = 0;
        this.f24735 = false;
        Arrays.fill(this.f24727, (Object) null);
        this.f24726 = -1;
        this.f24734 = -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f24737;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f24737 == 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21082(int i) {
        if (this.f24737 == 0) {
            this.f24726 = -1;
            this.f24734 = -1;
            return;
        }
        if (this.f24734 == i) {
            long[] jArr = this.f24732;
            int i2 = (int) jArr[i];
            this.f24734 = i2;
            if (i2 >= 0) {
                jArr[i2] = (-4294967296L) | jArr[i2];
                return;
            }
            return;
        }
        if (this.f24726 == i) {
            long[] jArr2 = this.f24732;
            int i3 = (int) (jArr2[i] >>> 32);
            this.f24726 = i3;
            if (i3 >= 0) {
                jArr2[i3] = jArr2[i3] | 4294967295L;
                return;
            }
            return;
        }
        long[] jArr3 = this.f24732;
        long j = jArr3[i];
        int i4 = (int) (j >>> 32);
        int i5 = (int) j;
        long j2 = jArr3[i4];
        jArr3[i4] = (4294967295L & ((j & 4294967295L) ^ j2)) ^ j2;
        long j3 = jArr3[i5];
        jArr3[i5] = ((-4294967296L) & ((j & (-4294967296L)) ^ j3)) ^ j3;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m21083(int i, int i2) {
        if (this.f24737 == 1) {
            this.f24726 = i2;
            this.f24734 = i2;
            this.f24732[i2] = -1;
            return;
        }
        if (this.f24734 == i) {
            this.f24734 = i2;
            long[] jArr = this.f24732;
            long j = jArr[i];
            int i3 = (int) j;
            jArr[i3] = ((-4294967296L) & (((4294967295L & ((long) i2)) << 32) ^ jArr[(int) j])) ^ jArr[i3];
            jArr[i2] = jArr[i];
            return;
        }
        if (this.f24726 == i) {
            this.f24726 = i2;
            long[] jArr2 = this.f24732;
            long j2 = jArr2[i];
            int i4 = (int) (j2 >>> 32);
            jArr2[i4] = ((jArr2[(int) (j2 >>> 32)] ^ (((long) i2) & 4294967295L)) & 4294967295L) ^ jArr2[i4];
            jArr2[i2] = jArr2[i];
            return;
        }
        long[] jArr3 = this.f24732;
        long j3 = jArr3[i];
        int i5 = (int) (j3 >>> 32);
        int i6 = (int) j3;
        long j4 = jArr3[i5];
        long j5 = ((long) i2) & 4294967295L;
        jArr3[i5] = ((j4 ^ j5) & 4294967295L) ^ j4;
        long j6 = jArr3[i6];
        jArr3[i6] = ((-4294967296L) & ((j5 << 32) ^ j6)) ^ j6;
        jArr3[i2] = j3;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        if (this.f24737 == 0) {
            throw new NoSuchElementException();
        }
        return this.f24727[this.f24734];
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (this.f24737 == 0) {
            throw new NoSuchElementException();
        }
        return this.f24727[this.f24726];
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        C15173 c15173 = new C15173(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f24737;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            objectOutputStream.writeObject(c15173.next());
            i = i2;
        }
    }

    @Override // p067l.AbstractC16355, p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C15173(this);
    }

    @Override // p067l.AbstractC16355, p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC13833 iterator() {
        return new C15173(this);
    }

    @Override // p067l.AbstractC16355, p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC16514 iterator() {
        return new C15173(this);
    }

    @Override // p067l.AbstractC16355, p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC9948 spliterator() {
        return new C14641(new C15173(this), C6406.m14669(this), 81);
    }

    @Override // p067l.AbstractC13262, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    public final void forEach(Consumer consumer) {
        int i = this.f24734;
        while (i != -1) {
            int i2 = (int) this.f24732[i];
            consumer.accept(this.f24727[i]);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m21085(int i) {
        int i2;
        Object[] objArr = this.f24727;
        int i3 = i - 1;
        int i4 = i + 1;
        Object[] objArr2 = new Object[i4];
        int i5 = this.f24734;
        long[] jArr = this.f24732;
        long[] jArr2 = new long[i4];
        this.f24734 = -1;
        int i6 = this.f24737;
        int i7 = -1;
        int i8 = -1;
        while (true) {
            int i9 = i6 - 1;
            if (i6 == 0) {
                break;
            }
            if (!this.f24733.mo10801(objArr[i5], null)) {
                int iM34881 = C15322.m34881(this.f24733.mo10800(objArr[i5]));
                while (true) {
                    i2 = iM34881 & i3;
                    if (objArr2[i2] == null) {
                        break;
                    } else {
                        iM34881 = i2 + 1;
                    }
                }
            } else {
                i2 = i;
            }
            objArr2[i2] = objArr[i5];
            if (i8 != -1) {
                long j = jArr2[i7];
                jArr2[i7] = (((((long) i2) & 4294967295L) ^ j) & 4294967295L) ^ j;
                long j2 = jArr2[i2];
                jArr2[i2] = j2 ^ ((((((long) i7) & 4294967295L) << 32) ^ j2) & (-4294967296L));
            } else {
                this.f24734 = i2;
                jArr2[i2] = -1;
            }
            i7 = i2;
            i6 = i9;
            i8 = i5;
            i5 = (int) jArr[i5];
        }
        this.f24732 = jArr2;
        this.f24726 = i7;
        if (i7 != -1) {
            jArr2[i7] = 4294967295L | jArr2[i7];
        }
        this.f24730 = i;
        this.f24731 = i3;
        this.f24729 = C15322.m34887(this.f24736, i);
        this.f24727 = objArr2;
    }

    public final Object clone() {
        try {
            C9139 c9139 = (C9139) super.clone();
            c9139.f24727 = (Object[]) this.f24727.clone();
            c9139.f24735 = this.f24735;
            c9139.f24732 = (long[]) this.f24732.clone();
            c9139.f24733 = this.f24733;
            return c9139;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // p067l.AbstractC19038, java.util.Collection, java.util.Set
    public final int hashCode() {
        Object obj;
        Object[] objArr = this.f24727;
        int i = this.f24735 ? this.f24737 - 1 : this.f24737;
        int iMo10800 = 0;
        int i2 = 0;
        while (true) {
            int i3 = i - 1;
            if (i == 0) {
                return iMo10800;
            }
            while (true) {
                obj = objArr[i2];
                if (obj != null) {
                    break;
                }
                i2++;
            }
            if (this != obj) {
                iMo10800 = this.f24733.mo10800(obj) + iMo10800;
            }
            i2++;
            i = i3;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int iM34881;
        objectInputStream.defaultReadObject();
        int i = this.f24737;
        float f = this.f24736;
        int iM34880 = C15322.m34880(f, i);
        this.f24730 = iM34880;
        this.f24729 = C15322.m34887(f, iM34880);
        int i2 = this.f24730;
        this.f24731 = i2 - 1;
        Object[] objArr = new Object[i2 + 1];
        this.f24727 = objArr;
        ?? r3 = 1;
        long[] jArr = new long[i2 + 1];
        this.f24732 = jArr;
        int i3 = -1;
        this.f24726 = -1;
        this.f24734 = -1;
        int i4 = this.f24737;
        int i5 = -1;
        while (true) {
            int i6 = i4 - 1;
            if (i4 == 0) {
                break;
            }
            Object object = objectInputStream.readObject();
            if (this.f24733.mo10801(object, null)) {
                iM34881 = this.f24730;
                this.f24735 = r3;
            } else {
                iM34881 = C15322.m34881(this.f24733.mo10800(object)) & this.f24731;
                if (objArr[iM34881] != null) {
                    do {
                        iM34881 = (iM34881 + r3) & this.f24731;
                    } while (objArr[iM34881] != null);
                }
            }
            objArr[iM34881] = object;
            if (this.f24734 != i3) {
                long j = jArr[i5];
                jArr[i5] = (((((long) iM34881) & 4294967295L) ^ j) & 4294967295L) ^ j;
                long j2 = jArr[iM34881];
                jArr[iM34881] = j2 ^ ((-4294967296L) & (((((long) i5) & 4294967295L) << 32) ^ j2));
            } else {
                this.f24734 = iM34881;
                jArr[iM34881] = jArr[iM34881] | (-4294967296L);
            }
            i4 = i6;
            i5 = iM34881;
            r3 = 1;
            i3 = -1;
        }
        this.f24726 = i5;
        if (i5 != -1) {
            jArr[i5] = 4294967295L | jArr[i5];
        }
    }
}
