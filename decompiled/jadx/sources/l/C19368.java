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
import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩵ۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C94 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19368 extends AbstractC11853 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public transient int[] f62694;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final transient int f62695;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public transient int f62696;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public transient int f62697;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient int f62698;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public transient long[] f62699;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient boolean f62701;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f62703;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient int f62700 = -1;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient int f62693 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final float f62702 = 0.75f;

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // l.InterfaceC1933, java.util.SortedSet
    public final InterfaceC4571 comparator() {
        return null;
    }

    @Override // l.AbstractC11853, l.AbstractC6208, l.AbstractC21731, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C19368() {
        int iM32765 = C13630.m32765(0.75f, 16);
        this.f62697 = iM32765;
        this.f62695 = iM32765;
        this.f62698 = iM32765 - 1;
        this.f62696 = C13630.m32772(0.75f, iM32765);
        int i = this.f62697 + 1;
        this.f62694 = new int[i];
        this.f62699 = new long[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m44623(long j) {
        int iMin = (int) Math.min(1073741824L, Math.max(2L, C13630.m32768((long) Math.ceil(j / this.f62702))));
        if (iMin > this.f62697) {
            m44627(iMin);
        }
    }

    @Override // l.AbstractC21731
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo16696(InterfaceC1043 interfaceC1043) {
        float f = this.f62702;
        if (f <= 0.5d) {
            int iM32765 = C13630.m32765(f, interfaceC1043.size());
            if (iM32765 > this.f62697) {
                m44627(iM32765);
            }
        } else {
            m44623(interfaceC1043.size() + this.f62703);
        }
        return super.mo16696(interfaceC1043);
    }

    @Override // l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        float f = this.f62702;
        if (f <= 0.5d) {
            int iM32765 = C13630.m32765(f, collection.size());
            if (iM32765 > this.f62697) {
                m44627(iM32765);
            }
        } else {
            m44623(collection.size() + this.f62703);
        }
        return super.addAll(collection);
    }

    @Override // l.AbstractC21731, l.InterfaceC1043
    public final boolean add(int i) {
        int i2;
        int i3;
        if (i == 0) {
            if (this.f62701) {
                return false;
            }
            i2 = this.f62697;
            this.f62701 = true;
        } else {
            int[] iArr = this.f62694;
            int iM32766 = C13630.m32766(i) & this.f62698;
            int i4 = iArr[iM32766];
            if (i4 != 0) {
                if (i4 == i) {
                    return false;
                }
                do {
                    iM32766 = (iM32766 + 1) & this.f62698;
                    i3 = iArr[iM32766];
                    if (i3 != 0) {
                    }
                } while (i3 != i);
                return false;
            }
            iArr[iM32766] = i;
            i2 = iM32766;
        }
        int i5 = this.f62703;
        if (i5 == 0) {
            this.f62693 = i2;
            this.f62700 = i2;
            this.f62699[i2] = -1;
        } else {
            long[] jArr = this.f62699;
            int i6 = this.f62693;
            long j = jArr[i6];
            jArr[i6] = j ^ (((((long) i2) & 4294967295L) ^ j) & 4294967295L);
            jArr[i2] = ((((long) i6) & 4294967295L) << 32) | 4294967295L;
            this.f62693 = i2;
        }
        this.f62703 = i5 + 1;
        if (i5 >= this.f62696) {
            m44627(C13630.m32765(this.f62702, i5 + 2));
        }
        return true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m44624(int i) {
        int i2;
        this.f62703--;
        m44625(i);
        int[] iArr = this.f62694;
        loop0: while (true) {
            int i3 = (i + 1) & this.f62698;
            while (true) {
                i2 = iArr[i3];
                if (i2 != 0) {
                    int iM32766 = C13630.m32766(i2);
                    int i4 = this.f62698;
                    int i5 = iM32766 & i4;
                    if (i > i3) {
                        if (i >= i5 && i5 > i3) {
                            break;
                        } else {
                            i3 = (i3 + 1) & i4;
                        }
                    } else if (i >= i5 || i5 > i3) {
                        break;
                    } else {
                        i3 = (i3 + 1) & i4;
                    }
                } else {
                    break loop0;
                }
            }
            iArr[i] = i2;
            m44626(i3, i);
            i = i3;
        }
        iArr[i] = 0;
        int i6 = this.f62697;
        if (i6 <= this.f62695 || this.f62703 >= this.f62696 / 4 || i6 <= 16) {
            return;
        }
        m44627(i6 / 2);
    }

    @Override // l.AbstractC6208
    public final boolean remove(int i) {
        int i2;
        if (i == 0) {
            if (this.f62701) {
                this.f62701 = false;
                int[] iArr = this.f62694;
                int i3 = this.f62697;
                iArr[i3] = 0;
                this.f62703--;
                m44625(i3);
                int i4 = this.f62697;
                if (i4 > this.f62695 && this.f62703 < this.f62696 / 4 && i4 > 16) {
                    m44627(i4 / 2);
                }
                return true;
            }
        } else {
            int[] iArr2 = this.f62694;
            int iM32766 = C13630.m32766(i) & this.f62698;
            int i5 = iArr2[iM32766];
            if (i5 != 0) {
                if (i == i5) {
                    m44624(iM32766);
                    return true;
                }
                do {
                    iM32766 = (iM32766 + 1) & this.f62698;
                    i2 = iArr2[iM32766];
                    if (i2 == 0) {
                    }
                } while (i != i2);
                m44624(iM32766);
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC1043
    public final boolean contains(int i) {
        int i2;
        if (i == 0) {
            return this.f62701;
        }
        int[] iArr = this.f62694;
        int iM32766 = C13630.m32766(i) & this.f62698;
        int i3 = iArr[iM32766];
        if (i3 == 0) {
            return false;
        }
        if (i != i3) {
            do {
                iM32766 = (iM32766 + 1) & this.f62698;
                i2 = iArr[iM32766];
                if (i2 == 0) {
                    return false;
                }
            } while (i != i2);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f62703 == 0) {
            return;
        }
        this.f62703 = 0;
        this.f62701 = false;
        Arrays.fill(this.f62694, 0);
        this.f62693 = -1;
        this.f62700 = -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f62703;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f62703 == 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44625(int i) {
        if (this.f62703 == 0) {
            this.f62693 = -1;
            this.f62700 = -1;
            return;
        }
        if (this.f62700 == i) {
            long[] jArr = this.f62699;
            int i2 = (int) jArr[i];
            this.f62700 = i2;
            if (i2 >= 0) {
                jArr[i2] = (-4294967296L) | jArr[i2];
                return;
            }
            return;
        }
        if (this.f62693 == i) {
            long[] jArr2 = this.f62699;
            int i3 = (int) (jArr2[i] >>> 32);
            this.f62693 = i3;
            if (i3 >= 0) {
                jArr2[i3] = jArr2[i3] | 4294967295L;
                return;
            }
            return;
        }
        long[] jArr3 = this.f62699;
        long j = jArr3[i];
        int i4 = (int) (j >>> 32);
        int i5 = (int) j;
        long j2 = jArr3[i4];
        jArr3[i4] = (4294967295L & ((j & 4294967295L) ^ j2)) ^ j2;
        long j3 = jArr3[i5];
        jArr3[i5] = ((-4294967296L) & ((j & (-4294967296L)) ^ j3)) ^ j3;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44626(int i, int i2) {
        if (this.f62703 == 1) {
            this.f62693 = i2;
            this.f62700 = i2;
            this.f62699[i2] = -1;
            return;
        }
        if (this.f62700 == i) {
            this.f62700 = i2;
            long[] jArr = this.f62699;
            long j = jArr[i];
            int i3 = (int) j;
            jArr[i3] = ((-4294967296L) & (((4294967295L & ((long) i2)) << 32) ^ jArr[(int) j])) ^ jArr[i3];
            jArr[i2] = jArr[i];
            return;
        }
        if (this.f62693 == i) {
            this.f62693 = i2;
            long[] jArr2 = this.f62699;
            long j2 = jArr2[i];
            int i4 = (int) (j2 >>> 32);
            jArr2[i4] = ((jArr2[(int) (j2 >>> 32)] ^ (((long) i2) & 4294967295L)) & 4294967295L) ^ jArr2[i4];
            jArr2[i2] = jArr2[i];
            return;
        }
        long[] jArr3 = this.f62699;
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

    @Override // l.InterfaceC1933
    /* JADX INFO: renamed from: ֡ */
    public final int mo6349() {
        if (this.f62703 == 0) {
            throw new NoSuchElementException();
        }
        return this.f62694[this.f62700];
    }

    @Override // l.InterfaceC1933
    /* JADX INFO: renamed from: ᩻֫ */
    public final int mo6354() {
        if (this.f62703 == 0) {
            throw new NoSuchElementException();
        }
        return this.f62694[this.f62693];
    }

    @Override // l.InterfaceC1933
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC1933 mo6351(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC1933
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC1933 mo6353(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC1933
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC1933 mo6352(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        C18662 c18662 = new C18662(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f62703;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            objectOutputStream.writeInt(c18662.nextInt());
            i = i2;
        }
    }

    @Override // l.AbstractC11853, l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C18662(this);
    }

    @Override // l.AbstractC11853, l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC6667 iterator() {
        return new C18662(this);
    }

    @Override // l.AbstractC11853, l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC15132 iterator() {
        return new C18662(this);
    }

    @Override // l.AbstractC11853, l.AbstractC6208, l.AbstractC21731, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC16749 spliterator() {
        return new C8989(new C18662(this), C4248.m12789(this), 337);
    }

    @Override // l.InterfaceC1933
    /* JADX INFO: renamed from: ۗ */
    public final InterfaceC15132 mo6350() {
        return new C18662(this);
    }

    @Override // l.AbstractC21731, l.InterfaceC14427
    public final void forEach(IntConsumer intConsumer) {
        int i = this.f62700;
        while (i != -1) {
            int i2 = (int) this.f62699[i];
            intConsumer.accept(this.f62694[i]);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m44627(int i) {
        int i2;
        int[] iArr = this.f62694;
        int i3 = i - 1;
        int i4 = i + 1;
        int[] iArr2 = new int[i4];
        int i5 = this.f62700;
        long[] jArr = this.f62699;
        long[] jArr2 = new long[i4];
        this.f62700 = -1;
        int i6 = this.f62703;
        int i7 = -1;
        int i8 = -1;
        while (true) {
            int i9 = i6 - 1;
            if (i6 == 0) {
                break;
            }
            int i10 = iArr[i5];
            if (i10 != 0) {
                int iM32766 = C13630.m32766(i10);
                while (true) {
                    i2 = iM32766 & i3;
                    if (iArr2[i2] == 0) {
                        break;
                    } else {
                        iM32766 = i2 + 1;
                    }
                }
            } else {
                i2 = i;
            }
            iArr2[i2] = iArr[i5];
            if (i8 != -1) {
                long j = jArr2[i7];
                jArr2[i7] = (((((long) i2) & 4294967295L) ^ j) & 4294967295L) ^ j;
                long j2 = jArr2[i2];
                jArr2[i2] = ((((((long) i7) & 4294967295L) << 32) ^ j2) & (-4294967296L)) ^ j2;
            } else {
                this.f62700 = i2;
                jArr2[i2] = -1;
            }
            i7 = i2;
            i6 = i9;
            i8 = i5;
            i5 = (int) jArr[i5];
        }
        this.f62699 = jArr2;
        this.f62693 = i7;
        if (i7 != -1) {
            jArr2[i7] = 4294967295L | jArr2[i7];
        }
        this.f62697 = i;
        this.f62698 = i3;
        this.f62696 = C13630.m32772(this.f62702, i);
        this.f62694 = iArr2;
    }

    public final Object clone() {
        try {
            C19368 c19368 = (C19368) super.clone();
            c19368.f62694 = (int[]) this.f62694.clone();
            c19368.f62701 = this.f62701;
            c19368.f62699 = (long[]) this.f62699.clone();
            return c19368;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // l.AbstractC6208, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i;
        int[] iArr = this.f62694;
        int i2 = this.f62701 ? this.f62703 - 1 : this.f62703;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i2 - 1;
            if (i2 == 0) {
                return i3;
            }
            while (true) {
                i = iArr[i4];
                if (i == 0) {
                    i4++;
                }
            }
            i3 += i;
            i4++;
            i2 = i5;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int iM32766;
        objectInputStream.defaultReadObject();
        int i = this.f62703;
        float f = this.f62702;
        int iM32765 = C13630.m32765(f, i);
        this.f62697 = iM32765;
        this.f62696 = C13630.m32772(f, iM32765);
        int i2 = this.f62697;
        this.f62698 = i2 - 1;
        int[] iArr = new int[i2 + 1];
        this.f62694 = iArr;
        ?? r3 = 1;
        long[] jArr = new long[i2 + 1];
        this.f62699 = jArr;
        int i3 = -1;
        this.f62693 = -1;
        this.f62700 = -1;
        int i4 = this.f62703;
        int i5 = -1;
        while (true) {
            int i6 = i4 - 1;
            if (i4 == 0) {
                break;
            }
            int i7 = objectInputStream.readInt();
            if (i7 == 0) {
                iM32766 = this.f62697;
                this.f62701 = r3;
            } else {
                iM32766 = C13630.m32766(i7) & this.f62698;
                if (iArr[iM32766] != 0) {
                    do {
                        iM32766 = (iM32766 + r3) & this.f62698;
                    } while (iArr[iM32766] != 0);
                }
            }
            iArr[iM32766] = i7;
            if (this.f62700 != i3) {
                long j = jArr[i5];
                jArr[i5] = (((((long) iM32766) & 4294967295L) ^ j) & 4294967295L) ^ j;
                long j2 = jArr[iM32766];
                jArr[iM32766] = j2 ^ ((-4294967296L) & (((((long) i5) & 4294967295L) << 32) ^ j2));
            } else {
                this.f62700 = iM32766;
                jArr[iM32766] = jArr[iM32766] | (-4294967296L);
            }
            i4 = i6;
            i5 = iM32766;
            r3 = 1;
            i3 = -1;
        }
        this.f62693 = i5;
        if (i5 != -1) {
            jArr[i5] = 4294967295L | jArr[i5];
        }
    }
}
