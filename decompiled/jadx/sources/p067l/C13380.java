package p067l;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۨ۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M9MB */
/* JADX INFO: loaded from: classes4.dex */
public final class C13380 extends AbstractC12039 {

    /* JADX INFO: renamed from: ۙ */
    public static final Object[] f37537 = new Object[0];

    /* JADX INFO: renamed from: ᩶ */
    public int f37538;

    /* JADX INFO: renamed from: ᩸ */
    public Object[] f37539 = f37537;

    /* JADX INFO: renamed from: ᩹ */
    public int f37540;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM30526;
        C13045.m29867(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f37539.length != 0) {
            int iM30527 = m30526(this.f37538 + this.f37540);
            int i = this.f37540;
            if (i < iM30527) {
                iM30526 = i;
                while (i < iM30527) {
                    Object obj = this.f37539[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.f37539[iM30526] = obj;
                        iM30526++;
                    }
                    i++;
                }
                C24108.m53362(this.f37539, null, iM30526, iM30527);
            } else {
                int length = this.f37539.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr = this.f37539;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f37539[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iM30526 = m30526(i2);
                for (int i3 = 0; i3 < iM30527; i3++) {
                    Object[] objArr2 = this.f37539;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f37539[iM30526] = obj3;
                        iM30526 = m30525(iM30526);
                    }
                }
                z = z2;
            }
            if (z) {
                m30523();
                this.f37538 = m30524(iM30526 - this.f37540);
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM30526;
        C13045.m29867(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f37539.length != 0) {
            int iM30527 = m30526(this.f37538 + this.f37540);
            int i = this.f37540;
            if (i < iM30527) {
                iM30526 = i;
                while (i < iM30527) {
                    Object obj = this.f37539[i];
                    if (collection.contains(obj)) {
                        this.f37539[iM30526] = obj;
                        iM30526++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                C24108.m53362(this.f37539, null, iM30526, iM30527);
            } else {
                int length = this.f37539.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr = this.f37539;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.f37539[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iM30526 = m30526(i2);
                for (int i3 = 0; i3 < iM30527; i3++) {
                    Object[] objArr2 = this.f37539;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f37539[iM30526] = obj3;
                        iM30526 = m30525(iM30526);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                m30523();
                this.f37538 = m30524(iM30526 - this.f37540);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iMo27554 = mo27554();
        if (i < 0 || i >= iMo27554) {
            throw new IndexOutOfBoundsException(C19768.m44907("index: ", i, iMo27554, ", size: "));
        }
        return this.f37539[m30526(this.f37540 + i)];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return mo27554() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iMo27554 = mo27554();
        if (i < 0 || i >= iMo27554) {
            throw new IndexOutOfBoundsException(C19768.m44907("index: ", i, iMo27554, ", size: "));
        }
        int iM30526 = m30526(this.f37540 + i);
        Object[] objArr = this.f37539;
        Object obj2 = objArr[iM30526];
        objArr[iM30526] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo27554()]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        int i2 = this.f37538;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(C19768.m44907("index: ", i, i2, ", size: "));
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        m30523();
        m30521(this.f37538 + 1);
        int iM30526 = m30526(this.f37540 + i);
        int i3 = this.f37538;
        if (i < ((i3 + 1) >> 1)) {
            if (iM30526 == 0) {
                Object[] objArr = this.f37539;
                C13045.m29867(objArr, "<this>");
                iM30526 = objArr.length;
            }
            int i4 = iM30526 - 1;
            int i5 = this.f37540;
            if (i5 == 0) {
                Object[] objArr2 = this.f37539;
                C13045.m29867(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i5 - 1;
            }
            int i6 = this.f37540;
            if (i4 >= i6) {
                Object[] objArr3 = this.f37539;
                objArr3[length] = objArr3[i6];
                C15390.m35065(i6, i6 + 1, i4 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f37539;
                C15390.m35065(i6 - 1, i6, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f37539;
                objArr5[objArr5.length - 1] = objArr5[0];
                C15390.m35065(0, 1, i4 + 1, objArr5, objArr5);
            }
            this.f37539[i4] = obj;
            this.f37540 = length;
        } else {
            int iM30527 = m30526(i3 + this.f37540);
            if (iM30526 < iM30527) {
                Object[] objArr6 = this.f37539;
                C15390.m35065(iM30526 + 1, iM30526, iM30527, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f37539;
                C15390.m35065(1, 0, iM30527, objArr7, objArr7);
                Object[] objArr8 = this.f37539;
                objArr8[0] = objArr8[objArr8.length - 1];
                C15390.m35065(iM30526 + 1, iM30526, objArr8.length - 1, objArr8, objArr8);
            }
            this.f37539[iM30526] = obj;
        }
        this.f37538++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        C13045.m29867(collection, "elements");
        int i2 = this.f37538;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(C19768.m44907("index: ", i, i2, ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f37538) {
            return addAll(collection);
        }
        m30523();
        m30521(collection.size() + this.f37538);
        int iM30526 = m30526(this.f37538 + this.f37540);
        int iM30527 = m30526(this.f37540 + i);
        int size = collection.size();
        if (i >= ((this.f37538 + 1) >> 1)) {
            int i3 = iM30527 + size;
            if (iM30527 < iM30526) {
                int i4 = size + iM30526;
                Object[] objArr = this.f37539;
                if (i4 <= objArr.length) {
                    C15390.m35065(i3, iM30527, iM30526, objArr, objArr);
                } else if (i3 >= objArr.length) {
                    C15390.m35065(i3 - objArr.length, iM30527, iM30526, objArr, objArr);
                } else {
                    int length = iM30526 - (i4 - objArr.length);
                    C15390.m35065(0, length, iM30526, objArr, objArr);
                    Object[] objArr2 = this.f37539;
                    C15390.m35065(i3, iM30527, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.f37539;
                C15390.m35065(size, 0, iM30526, objArr3, objArr3);
                Object[] objArr4 = this.f37539;
                if (i3 >= objArr4.length) {
                    C15390.m35065(i3 - objArr4.length, iM30527, objArr4.length, objArr4, objArr4);
                } else {
                    C15390.m35065(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f37539;
                    C15390.m35065(i3, iM30527, objArr5.length - size, objArr5, objArr5);
                }
            }
            m30520(iM30527, collection);
            return true;
        }
        int i5 = this.f37540;
        int length2 = i5 - size;
        if (iM30527 < i5) {
            Object[] objArr6 = this.f37539;
            C15390.m35065(length2, i5, objArr6.length, objArr6, objArr6);
            if (size >= iM30527) {
                Object[] objArr7 = this.f37539;
                C15390.m35065(objArr7.length - size, 0, iM30527, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.f37539;
                C15390.m35065(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.f37539;
                C15390.m35065(0, size, iM30527, objArr9, objArr9);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f37539;
            C15390.m35065(length2, i5, iM30527, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.f37539;
            length2 += objArr11.length;
            int i6 = iM30527 - i5;
            int length3 = objArr11.length - length2;
            if (length3 >= i6) {
                C15390.m35065(length2, i5, iM30527, objArr11, objArr11);
            } else {
                C15390.m35065(length2, i5, i5 + length3, objArr11, objArr11);
                Object[] objArr12 = this.f37539;
                C15390.m35065(0, this.f37540 + length3, iM30527, objArr12, objArr12);
            }
        }
        this.f37540 = length2;
        m30520(m30524(iM30527 - size), collection);
        return true;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        C21427.m48556(i, i2, this.f37538);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.f37538) {
            clear();
            return;
        }
        if (i3 == 1) {
            mo27553(i);
            return;
        }
        m30523();
        if (i < this.f37538 - i2) {
            int iM30526 = m30526(this.f37540 + (i - 1));
            int iM30527 = m30526(this.f37540 + (i2 - 1));
            while (i > 0) {
                int i4 = iM30526 + 1;
                int iMin = Math.min(i, Math.min(i4, iM30527 + 1));
                Object[] objArr = this.f37539;
                int i5 = iM30527 - iMin;
                int i6 = iM30526 - iMin;
                C15390.m35065(i5 + 1, i6 + 1, i4, objArr, objArr);
                iM30526 = m30524(i6);
                iM30527 = m30524(i5);
                i -= iMin;
            }
            int iM30528 = m30526(this.f37540 + i3);
            m30522(this.f37540, iM30528);
            this.f37540 = iM30528;
        } else {
            int iM30529 = m30526(this.f37540 + i2);
            int iM305210 = m30526(this.f37540 + i);
            int i7 = this.f37538;
            while (true) {
                i7 -= i2;
                if (i7 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f37539;
                i2 = Math.min(i7, Math.min(objArr2.length - iM30529, objArr2.length - iM305210));
                Object[] objArr3 = this.f37539;
                int i8 = iM30529 + i2;
                C15390.m35065(iM305210, iM30529, i8, objArr3, objArr3);
                iM30529 = m30526(i8);
                iM305210 = m30526(iM305210 + i2);
            }
            int iM305211 = m30526(this.f37538 + this.f37540);
            m30522(m30524(iM305211 - i3), iM305211);
        }
        this.f37538 -= i3;
    }

    @Override // p067l.AbstractC12039
    /* JADX INFO: renamed from: ֫ */
    public final Object mo27553(int i) {
        int i2 = this.f37538;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(C19768.m44907("index: ", i, i2, ", size: "));
        }
        if (i == C4187.m8473((List) this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        m30523();
        int iM30526 = m30526(this.f37540 + i);
        Object[] objArr = this.f37539;
        Object obj = objArr[iM30526];
        if (i < (this.f37538 >> 1)) {
            int i3 = this.f37540;
            if (iM30526 >= i3) {
                C15390.m35065(i3 + 1, i3, iM30526, objArr, objArr);
            } else {
                C15390.m35065(1, 0, iM30526, objArr, objArr);
                Object[] objArr2 = this.f37539;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.f37540;
                C15390.m35065(i4 + 1, i4, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f37539;
            int i5 = this.f37540;
            objArr3[i5] = null;
            this.f37540 = m30525(i5);
        } else {
            int iM30527 = m30526(C4187.m8473((List) this) + this.f37540);
            if (iM30526 <= iM30527) {
                Object[] objArr4 = this.f37539;
                C15390.m35065(iM30526, iM30526 + 1, iM30527 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f37539;
                C15390.m35065(iM30526, iM30526 + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f37539;
                objArr6[objArr6.length - 1] = objArr6[0];
                C15390.m35065(0, 1, iM30527 + 1, objArr6, objArr6);
            }
            this.f37539[iM30527] = null;
        }
        this.f37538--;
        return obj;
    }

    @Override // p067l.AbstractC12039
    /* JADX INFO: renamed from: ۧ */
    public final int mo27554() {
        return this.f37538;
    }

    /* JADX INFO: renamed from: ۧ */
    private final void m30521(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f37539;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f37537) {
            if (i < 10) {
                i = 10;
            }
            this.f37539 = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        C15390.m35065(0, this.f37540, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f37539;
        int length2 = objArr3.length;
        int i3 = this.f37540;
        C15390.m35065(length2 - i3, 0, i3, objArr3, objArr2);
        this.f37540 = 0;
        this.f37539 = objArr2;
    }

    /* JADX INFO: renamed from: ᩻ */
    private final int m30526(int i) {
        Object[] objArr = this.f37539;
        return i >= objArr.length ? i - objArr.length : i;
    }

    /* JADX INFO: renamed from: ܿ */
    private final int m30524(int i) {
        return i < 0 ? i + this.f37539.length : i;
    }

    /* JADX INFO: renamed from: ᩳ */
    private final int m30525(int i) {
        Object[] objArr = this.f37539;
        C13045.m29867(objArr, "<this>");
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final void addFirst(Object obj) {
        m30523();
        m30521(this.f37538 + 1);
        int length = this.f37540;
        if (length == 0) {
            Object[] objArr = this.f37539;
            C13045.m29867(objArr, "<this>");
            length = objArr.length;
        }
        int i = length - 1;
        this.f37540 = i;
        this.f37539[i] = obj;
        this.f37538++;
    }

    public final void addLast(Object obj) {
        m30523();
        m30521(mo27554() + 1);
        this.f37539[m30526(mo27554() + this.f37540)] = obj;
        this.f37538 = mo27554() + 1;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m30523();
        Object[] objArr = this.f37539;
        int i = this.f37540;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f37540 = m30525(i);
        this.f37538 = mo27554() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m30523();
        int iM30526 = m30526(C4187.m8473((List) this) + this.f37540);
        Object[] objArr = this.f37539;
        Object obj = objArr[iM30526];
        objArr[iM30526] = null;
        this.f37538 = mo27554() - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    private final void m30520(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f37539.length;
        while (i < length && it.hasNext()) {
            this.f37539[i] = it.next();
            i++;
        }
        int i2 = this.f37540;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f37539[i3] = it.next();
        }
        this.f37538 = collection.size() + this.f37538;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        C13045.m29867(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        m30523();
        m30521(collection.size() + mo27554());
        m30520(m30526(mo27554() + this.f37540), collection);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iM30526 = m30526(mo27554() + this.f37540);
        int length = this.f37540;
        if (length < iM30526) {
            while (length < iM30526) {
                if (C13045.m29864(obj, this.f37539[length])) {
                    i = this.f37540;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.f37540) < iM30526) {
            return -1;
        }
        int length2 = this.f37539.length;
        while (length < length2) {
            if (C13045.m29864(obj, this.f37539[length])) {
                i = this.f37540;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iM30526; i2++) {
            if (C13045.m29864(obj, this.f37539[i2])) {
                length = i2 + this.f37539.length;
                i = this.f37540;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iM30526 = m30526(this.f37538 + this.f37540);
        int i2 = this.f37540;
        if (i2 < iM30526) {
            length = iM30526 - 1;
            if (i2 <= length) {
                while (!C13045.m29864(obj, this.f37539[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f37540;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.f37540 >= iM30526) {
            do {
                iM30526--;
                if (-1 >= iM30526) {
                    Object[] objArr = this.f37539;
                    C13045.m29867(objArr, "<this>");
                    length = objArr.length - 1;
                    int i3 = this.f37540;
                    if (i3 <= length) {
                        while (!C13045.m29864(obj, this.f37539[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.f37540;
                    }
                }
                return length - i;
            } while (!C13045.m29864(obj, this.f37539[iM30526]));
            length = iM30526 + this.f37539.length;
            i = this.f37540;
            return length - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        mo27553(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m30523();
            m30522(this.f37540, m30526(mo27554() + this.f37540));
        }
        this.f37540 = 0;
        this.f37538 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        C13045.m29867(objArr, "array");
        int length = objArr.length;
        int i = this.f37538;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            C13045.m29862(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int iM30526 = m30526(this.f37538 + this.f37540);
        int i2 = this.f37540;
        if (i2 < iM30526) {
            C24108.m53363(this.f37539, objArr, 0, i2, iM30526, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f37539;
            C15390.m35065(0, this.f37540, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f37539;
            C15390.m35065(objArr3.length - this.f37540, 0, iM30526, objArr3, objArr);
        }
        int i3 = this.f37538;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: ۧ */
    private final void m30522(int i, int i2) {
        if (i < i2) {
            C24108.m53362(this.f37539, null, i, i2);
            return;
        }
        Object[] objArr = this.f37539;
        Arrays.fill(objArr, i, objArr.length, (Object) null);
        C24108.m53362(this.f37539, null, 0, i2);
    }

    /* JADX INFO: renamed from: ܽ */
    private final void m30523() {
        ((AbstractList) this).modCount++;
    }
}
