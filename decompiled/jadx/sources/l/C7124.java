package l;

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
public final class C7124 extends AbstractC14716 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient int f21847;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public transient Object[] f21848;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final transient int f21849;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public transient int f21850;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public transient int f21851;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient int f21852;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public transient long[] f21853;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC9187 f21854;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient int f21855;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient boolean f21856;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final float f21857;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f21858;

    public C7124() {
        throw null;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return null;
    }

    @Override // l.AbstractC14716, l.AbstractC11462, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C7124(InterfaceC9187 interfaceC9187) {
        this.f21855 = -1;
        this.f21847 = -1;
        this.f21854 = interfaceC9187;
        this.f21857 = 0.75f;
        int iM32765 = C13630.m32765(0.75f, 16);
        this.f21851 = iM32765;
        this.f21849 = iM32765;
        this.f21852 = iM32765 - 1;
        this.f21850 = C13630.m32772(0.75f, iM32765);
        int i = this.f21851 + 1;
        this.f21848 = new Object[i];
        this.f21853 = new long[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        float f = this.f21857;
        if (f <= 0.5d) {
            int iM32765 = C13630.m32765(f, collection.size());
            if (iM32765 > this.f21851) {
                m19142(iM32765);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C13630.m32768((long) Math.ceil((collection.size() + this.f21858) / f))));
            if (iMin > this.f21851) {
                m19142(iMin);
            }
        }
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        Object obj2;
        if (this.f21854.mo8734(obj, null)) {
            if (this.f21856) {
                return false;
            }
            i = this.f21851;
            this.f21856 = true;
            this.f21848[i] = obj;
        } else {
            Object[] objArr = this.f21848;
            int iM32766 = C13630.m32766(this.f21854.mo8733(obj)) & this.f21852;
            Object obj3 = objArr[iM32766];
            if (obj3 != null) {
                if (this.f21854.mo8734(obj3, obj)) {
                    return false;
                }
                do {
                    iM32766 = (iM32766 + 1) & this.f21852;
                    obj2 = objArr[iM32766];
                    if (obj2 != null) {
                    }
                } while (!this.f21854.mo8734(obj2, obj));
                return false;
            }
            objArr[iM32766] = obj;
            i = iM32766;
        }
        int i2 = this.f21858;
        if (i2 == 0) {
            this.f21847 = i;
            this.f21855 = i;
            this.f21853[i] = -1;
        } else {
            long[] jArr = this.f21853;
            int i3 = this.f21847;
            long j = jArr[i3];
            jArr[i3] = j ^ (((((long) i) & 4294967295L) ^ j) & 4294967295L);
            jArr[i] = ((((long) i3) & 4294967295L) << 32) | 4294967295L;
            this.f21847 = i;
        }
        this.f21858 = i2 + 1;
        if (i2 >= this.f21850) {
            m19142(C13630.m32765(this.f21857, i2 + 2));
        }
        return true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m19141(int i) {
        Object obj;
        Object[] objArr = this.f21848;
        while (true) {
            int i2 = (i + 1) & this.f21852;
            while (true) {
                obj = objArr[i2];
                if (obj == null) {
                    objArr[i] = null;
                    return;
                }
                int iM32766 = C13630.m32766(this.f21854.mo8733(obj));
                int i3 = this.f21852;
                int i4 = iM32766 & i3;
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
            m19140(i2, i);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m19138(int i) {
        this.f21858--;
        m19139(i);
        m19141(i);
        int i2 = this.f21851;
        if (i2 <= this.f21849 || this.f21858 >= this.f21850 / 4 || i2 <= 16) {
            return;
        }
        m19142(i2 / 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        if (this.f21854.mo8734(obj, null)) {
            if (this.f21856) {
                this.f21856 = false;
                Object[] objArr = this.f21848;
                int i = this.f21851;
                objArr[i] = null;
                this.f21858--;
                m19139(i);
                int i2 = this.f21851;
                if (i2 > this.f21849 && this.f21858 < this.f21850 / 4 && i2 > 16) {
                    m19142(i2 / 2);
                }
                return true;
            }
        } else {
            Object[] objArr2 = this.f21848;
            int iM32766 = C13630.m32766(this.f21854.mo8733(obj)) & this.f21852;
            Object obj3 = objArr2[iM32766];
            if (obj3 != null) {
                if (this.f21854.mo8734(obj, obj3)) {
                    m19138(iM32766);
                    return true;
                }
                do {
                    iM32766 = (iM32766 + 1) & this.f21852;
                    obj2 = objArr2[iM32766];
                    if (obj2 == null) {
                    }
                } while (!this.f21854.mo8734(obj, obj2));
                m19138(iM32766);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object obj2;
        if (this.f21854.mo8734(obj, null)) {
            return this.f21856;
        }
        Object[] objArr = this.f21848;
        int iM32766 = C13630.m32766(this.f21854.mo8733(obj)) & this.f21852;
        Object obj3 = objArr[iM32766];
        if (obj3 == null) {
            return false;
        }
        if (!this.f21854.mo8734(obj, obj3)) {
            do {
                iM32766 = (iM32766 + 1) & this.f21852;
                obj2 = objArr[iM32766];
                if (obj2 == null) {
                    return false;
                }
            } while (!this.f21854.mo8734(obj, obj2));
        }
        return true;
    }

    public final Object removeFirst() {
        int i = this.f21858;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        int i2 = this.f21855;
        if (i == 1) {
            this.f21847 = -1;
            this.f21855 = -1;
        } else {
            long[] jArr = this.f21853;
            int i3 = (int) jArr[i2];
            this.f21855 = i3;
            if (i3 >= 0) {
                jArr[i3] = jArr[i3] | (-4294967296L);
            }
        }
        Object obj = this.f21848[i2];
        this.f21858 = i - 1;
        if (this.f21854.mo8734(obj, null)) {
            this.f21856 = false;
            this.f21848[this.f21851] = null;
        } else {
            m19141(i2);
        }
        int i4 = this.f21851;
        if (i4 > this.f21849 && this.f21858 < this.f21850 / 4 && i4 > 16) {
            m19142(i4 / 2);
        }
        return obj;
    }

    public final Object removeLast() {
        int i = this.f21858;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        int i2 = this.f21847;
        if (i == 1) {
            this.f21847 = -1;
            this.f21855 = -1;
        } else {
            long[] jArr = this.f21853;
            int i3 = (int) (jArr[i2] >>> 32);
            this.f21847 = i3;
            if (i3 >= 0) {
                jArr[i3] = jArr[i3] | 4294967295L;
            }
        }
        Object obj = this.f21848[i2];
        this.f21858 = i - 1;
        if (this.f21854.mo8734(obj, null)) {
            this.f21856 = false;
            this.f21848[this.f21851] = null;
        } else {
            m19141(i2);
        }
        int i4 = this.f21851;
        if (i4 > this.f21849 && this.f21858 < this.f21850 / 4 && i4 > 16) {
            m19142(i4 / 2);
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f21858 == 0) {
            return;
        }
        this.f21858 = 0;
        this.f21856 = false;
        Arrays.fill(this.f21848, (Object) null);
        this.f21847 = -1;
        this.f21855 = -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f21858;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f21858 == 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19139(int i) {
        if (this.f21858 == 0) {
            this.f21847 = -1;
            this.f21855 = -1;
            return;
        }
        if (this.f21855 == i) {
            long[] jArr = this.f21853;
            int i2 = (int) jArr[i];
            this.f21855 = i2;
            if (i2 >= 0) {
                jArr[i2] = (-4294967296L) | jArr[i2];
                return;
            }
            return;
        }
        if (this.f21847 == i) {
            long[] jArr2 = this.f21853;
            int i3 = (int) (jArr2[i] >>> 32);
            this.f21847 = i3;
            if (i3 >= 0) {
                jArr2[i3] = jArr2[i3] | 4294967295L;
                return;
            }
            return;
        }
        long[] jArr3 = this.f21853;
        long j = jArr3[i];
        int i4 = (int) (j >>> 32);
        int i5 = (int) j;
        long j2 = jArr3[i4];
        jArr3[i4] = (4294967295L & ((j & 4294967295L) ^ j2)) ^ j2;
        long j3 = jArr3[i5];
        jArr3[i5] = ((-4294967296L) & ((j & (-4294967296L)) ^ j3)) ^ j3;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m19140(int i, int i2) {
        if (this.f21858 == 1) {
            this.f21847 = i2;
            this.f21855 = i2;
            this.f21853[i2] = -1;
            return;
        }
        if (this.f21855 == i) {
            this.f21855 = i2;
            long[] jArr = this.f21853;
            long j = jArr[i];
            int i3 = (int) j;
            jArr[i3] = ((-4294967296L) & (((4294967295L & ((long) i2)) << 32) ^ jArr[(int) j])) ^ jArr[i3];
            jArr[i2] = jArr[i];
            return;
        }
        if (this.f21847 == i) {
            this.f21847 = i2;
            long[] jArr2 = this.f21853;
            long j2 = jArr2[i];
            int i4 = (int) (j2 >>> 32);
            jArr2[i4] = ((jArr2[(int) (j2 >>> 32)] ^ (((long) i2) & 4294967295L)) & 4294967295L) ^ jArr2[i4];
            jArr2[i2] = jArr2[i];
            return;
        }
        long[] jArr3 = this.f21853;
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
        if (this.f21858 == 0) {
            throw new NoSuchElementException();
        }
        return this.f21848[this.f21855];
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (this.f21858 == 0) {
            throw new NoSuchElementException();
        }
        return this.f21848[this.f21847];
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
        C13473 c13473 = new C13473(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f21858;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            objectOutputStream.writeObject(c13473.next());
            i = i2;
        }
    }

    @Override // l.AbstractC14716, l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C13473(this);
    }

    @Override // l.AbstractC14716, l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC12063 iterator() {
        return new C13473(this);
    }

    @Override // l.AbstractC14716, l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC14884 iterator() {
        return new C13473(this);
    }

    @Override // l.AbstractC14716, l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC7975 spliterator() {
        return new C12913(new C13473(this), C4248.m12789(this), 81);
    }

    @Override // l.AbstractC11462, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public final void forEach(Consumer consumer) {
        int i = this.f21855;
        while (i != -1) {
            int i2 = (int) this.f21853[i];
            consumer.accept(this.f21848[i]);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m19142(int i) {
        int i2;
        Object[] objArr = this.f21848;
        int i3 = i - 1;
        int i4 = i + 1;
        Object[] objArr2 = new Object[i4];
        int i5 = this.f21855;
        long[] jArr = this.f21853;
        long[] jArr2 = new long[i4];
        this.f21855 = -1;
        int i6 = this.f21858;
        int i7 = -1;
        int i8 = -1;
        while (true) {
            int i9 = i6 - 1;
            if (i6 == 0) {
                break;
            }
            if (!this.f21854.mo8734(objArr[i5], null)) {
                int iM32766 = C13630.m32766(this.f21854.mo8733(objArr[i5]));
                while (true) {
                    i2 = iM32766 & i3;
                    if (objArr2[i2] == null) {
                        break;
                    } else {
                        iM32766 = i2 + 1;
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
                this.f21855 = i2;
                jArr2[i2] = -1;
            }
            i7 = i2;
            i6 = i9;
            i8 = i5;
            i5 = (int) jArr[i5];
        }
        this.f21853 = jArr2;
        this.f21847 = i7;
        if (i7 != -1) {
            jArr2[i7] = 4294967295L | jArr2[i7];
        }
        this.f21851 = i;
        this.f21852 = i3;
        this.f21850 = C13630.m32772(this.f21857, i);
        this.f21848 = objArr2;
    }

    public final Object clone() {
        try {
            C7124 c7124 = (C7124) super.clone();
            c7124.f21848 = (Object[]) this.f21848.clone();
            c7124.f21856 = this.f21856;
            c7124.f21853 = (long[]) this.f21853.clone();
            c7124.f21854 = this.f21854;
            return c7124;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // l.AbstractC17539, java.util.Collection, java.util.Set
    public final int hashCode() {
        Object obj;
        Object[] objArr = this.f21848;
        int i = this.f21856 ? this.f21858 - 1 : this.f21858;
        int iMo8733 = 0;
        int i2 = 0;
        while (true) {
            int i3 = i - 1;
            if (i == 0) {
                return iMo8733;
            }
            while (true) {
                obj = objArr[i2];
                if (obj != null) {
                    break;
                }
                i2++;
            }
            if (this != obj) {
                iMo8733 = this.f21854.mo8733(obj) + iMo8733;
            }
            i2++;
            i = i3;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int iM32766;
        objectInputStream.defaultReadObject();
        int i = this.f21858;
        float f = this.f21857;
        int iM32765 = C13630.m32765(f, i);
        this.f21851 = iM32765;
        this.f21850 = C13630.m32772(f, iM32765);
        int i2 = this.f21851;
        this.f21852 = i2 - 1;
        Object[] objArr = new Object[i2 + 1];
        this.f21848 = objArr;
        ?? r3 = 1;
        long[] jArr = new long[i2 + 1];
        this.f21853 = jArr;
        int i3 = -1;
        this.f21847 = -1;
        this.f21855 = -1;
        int i4 = this.f21858;
        int i5 = -1;
        while (true) {
            int i6 = i4 - 1;
            if (i4 == 0) {
                break;
            }
            Object object = objectInputStream.readObject();
            if (this.f21854.mo8734(object, null)) {
                iM32766 = this.f21851;
                this.f21856 = r3;
            } else {
                iM32766 = C13630.m32766(this.f21854.mo8733(object)) & this.f21852;
                if (objArr[iM32766] != null) {
                    do {
                        iM32766 = (iM32766 + r3) & this.f21852;
                    } while (objArr[iM32766] != null);
                }
            }
            objArr[iM32766] = object;
            if (this.f21855 != i3) {
                long j = jArr[i5];
                jArr[i5] = (((((long) iM32766) & 4294967295L) ^ j) & 4294967295L) ^ j;
                long j2 = jArr[iM32766];
                jArr[iM32766] = j2 ^ ((-4294967296L) & (((((long) i5) & 4294967295L) << 32) ^ j2));
            } else {
                this.f21855 = iM32766;
                jArr[iM32766] = jArr[iM32766] | (-4294967296L);
            }
            i4 = i6;
            i5 = iM32766;
            r3 = 1;
            i3 = -1;
        }
        this.f21847 = i5;
        if (i5 != -1) {
            jArr[i5] = 4294967295L | jArr[i5];
        }
    }
}
