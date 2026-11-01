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
import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩵ۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C94 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20776 extends AbstractC13634 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۙ */
    public transient int[] f65306;

    /* JADX INFO: renamed from: ۛ */
    public final transient int f65307;

    /* JADX INFO: renamed from: ۤ */
    public transient int f65308;

    /* JADX INFO: renamed from: ۨ */
    public transient int f65309;

    /* JADX INFO: renamed from: ۫ */
    public transient int f65310;

    /* JADX INFO: renamed from: ۬ */
    public transient long[] f65311;

    /* JADX INFO: renamed from: ᩸ */
    public transient boolean f65313;

    /* JADX INFO: renamed from: ᩺ */
    public int f65315;

    /* JADX INFO: renamed from: ᩶ */
    public transient int f65312 = -1;

    /* JADX INFO: renamed from: ۗ */
    public transient int f65305 = -1;

    /* JADX INFO: renamed from: ᩹ */
    public final float f65314 = 0.75f;

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // p067l.InterfaceC4206, java.util.SortedSet
    public final InterfaceC6713 comparator() {
        return null;
    }

    @Override // p067l.AbstractC13634, p067l.AbstractC8269, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C20776() {
        int iM34880 = C15322.m34880(0.75f, 16);
        this.f65309 = iM34880;
        this.f65307 = iM34880;
        this.f65310 = iM34880 - 1;
        this.f65308 = C15322.m34887(0.75f, iM34880);
        int i = this.f65309 + 1;
        this.f65306 = new int[i];
        this.f65311 = new long[i];
    }

    /* JADX INFO: renamed from: ֫ */
    private void m46917(long j) {
        int iMin = (int) Math.min(1073741824L, Math.max(2L, C15322.m34883((long) Math.ceil(j / this.f65314))));
        if (iMin > this.f65309) {
            m46921(iMin);
        }
    }

    @Override // p067l.AbstractC23022
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18622(InterfaceC3360 interfaceC3360) {
        float f = this.f65314;
        if (f <= 0.5d) {
            int iM34880 = C15322.m34880(f, interfaceC3360.size());
            if (iM34880 > this.f65309) {
                m46921(iM34880);
            }
        } else {
            m46917(interfaceC3360.size() + this.f65315);
        }
        return super.mo18622(interfaceC3360);
    }

    @Override // p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        float f = this.f65314;
        if (f <= 0.5d) {
            int iM34880 = C15322.m34880(f, collection.size());
            if (iM34880 > this.f65309) {
                m46921(iM34880);
            }
        } else {
            m46917(collection.size() + this.f65315);
        }
        return super.addAll(collection);
    }

    @Override // p067l.AbstractC23022, p067l.InterfaceC3360
    public final boolean add(int i) {
        int i2;
        int i3;
        if (i == 0) {
            if (this.f65313) {
                return false;
            }
            i2 = this.f65309;
            this.f65313 = true;
        } else {
            int[] iArr = this.f65306;
            int iM34881 = C15322.m34881(i) & this.f65310;
            int i4 = iArr[iM34881];
            if (i4 != 0) {
                if (i4 == i) {
                    return false;
                }
                do {
                    iM34881 = (iM34881 + 1) & this.f65310;
                    i3 = iArr[iM34881];
                    if (i3 != 0) {
                    }
                } while (i3 != i);
                return false;
            }
            iArr[iM34881] = i;
            i2 = iM34881;
        }
        int i5 = this.f65315;
        if (i5 == 0) {
            this.f65305 = i2;
            this.f65312 = i2;
            this.f65311[i2] = -1;
        } else {
            long[] jArr = this.f65311;
            int i6 = this.f65305;
            long j = jArr[i6];
            jArr[i6] = j ^ (((((long) i2) & 4294967295L) ^ j) & 4294967295L);
            jArr[i2] = ((((long) i6) & 4294967295L) << 32) | 4294967295L;
            this.f65305 = i2;
        }
        this.f65315 = i5 + 1;
        if (i5 >= this.f65308) {
            m46921(C15322.m34880(this.f65314, i5 + 2));
        }
        return true;
    }

    /* JADX INFO: renamed from: ܿ */
    private void m46918(int i) {
        int i2;
        this.f65315--;
        m46919(i);
        int[] iArr = this.f65306;
        loop0: while (true) {
            int i3 = (i + 1) & this.f65310;
            while (true) {
                i2 = iArr[i3];
                if (i2 != 0) {
                    int iM34881 = C15322.m34881(i2);
                    int i4 = this.f65310;
                    int i5 = iM34881 & i4;
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
            m46920(i3, i);
            i = i3;
        }
        iArr[i] = 0;
        int i6 = this.f65309;
        if (i6 <= this.f65307 || this.f65315 >= this.f65308 / 4 || i6 <= 16) {
            return;
        }
        m46921(i6 / 2);
    }

    @Override // p067l.AbstractC8269
    public final boolean remove(int i) {
        int i2;
        if (i == 0) {
            if (this.f65313) {
                this.f65313 = false;
                int[] iArr = this.f65306;
                int i3 = this.f65309;
                iArr[i3] = 0;
                this.f65315--;
                m46919(i3);
                int i4 = this.f65309;
                if (i4 > this.f65307 && this.f65315 < this.f65308 / 4 && i4 > 16) {
                    m46921(i4 / 2);
                }
                return true;
            }
        } else {
            int[] iArr2 = this.f65306;
            int iM34881 = C15322.m34881(i) & this.f65310;
            int i5 = iArr2[iM34881];
            if (i5 != 0) {
                if (i == i5) {
                    m46918(iM34881);
                    return true;
                }
                do {
                    iM34881 = (iM34881 + 1) & this.f65310;
                    i2 = iArr2[iM34881];
                    if (i2 == 0) {
                    }
                } while (i != i2);
                m46918(iM34881);
                return true;
            }
        }
        return false;
    }

    @Override // p067l.InterfaceC3360
    public final boolean contains(int i) {
        int i2;
        if (i == 0) {
            return this.f65313;
        }
        int[] iArr = this.f65306;
        int iM34881 = C15322.m34881(i) & this.f65310;
        int i3 = iArr[iM34881];
        if (i3 == 0) {
            return false;
        }
        if (i != i3) {
            do {
                iM34881 = (iM34881 + 1) & this.f65310;
                i2 = iArr[iM34881];
                if (i2 == 0) {
                    return false;
                }
            } while (i != i2);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f65315 == 0) {
            return;
        }
        this.f65315 = 0;
        this.f65313 = false;
        Arrays.fill(this.f65306, 0);
        this.f65305 = -1;
        this.f65312 = -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f65315;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f65315 == 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46919(int i) {
        if (this.f65315 == 0) {
            this.f65305 = -1;
            this.f65312 = -1;
            return;
        }
        if (this.f65312 == i) {
            long[] jArr = this.f65311;
            int i2 = (int) jArr[i];
            this.f65312 = i2;
            if (i2 >= 0) {
                jArr[i2] = (-4294967296L) | jArr[i2];
                return;
            }
            return;
        }
        if (this.f65305 == i) {
            long[] jArr2 = this.f65311;
            int i3 = (int) (jArr2[i] >>> 32);
            this.f65305 = i3;
            if (i3 >= 0) {
                jArr2[i3] = jArr2[i3] | 4294967295L;
                return;
            }
            return;
        }
        long[] jArr3 = this.f65311;
        long j = jArr3[i];
        int i4 = (int) (j >>> 32);
        int i5 = (int) j;
        long j2 = jArr3[i4];
        jArr3[i4] = (4294967295L & ((j & 4294967295L) ^ j2)) ^ j2;
        long j3 = jArr3[i5];
        jArr3[i5] = ((-4294967296L) & ((j & (-4294967296L)) ^ j3)) ^ j3;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m46920(int i, int i2) {
        if (this.f65315 == 1) {
            this.f65305 = i2;
            this.f65312 = i2;
            this.f65311[i2] = -1;
            return;
        }
        if (this.f65312 == i) {
            this.f65312 = i2;
            long[] jArr = this.f65311;
            long j = jArr[i];
            int i3 = (int) j;
            jArr[i3] = ((-4294967296L) & (((4294967295L & ((long) i2)) << 32) ^ jArr[(int) j])) ^ jArr[i3];
            jArr[i2] = jArr[i];
            return;
        }
        if (this.f65305 == i) {
            this.f65305 = i2;
            long[] jArr2 = this.f65311;
            long j2 = jArr2[i];
            int i4 = (int) (j2 >>> 32);
            jArr2[i4] = ((jArr2[(int) (j2 >>> 32)] ^ (((long) i2) & 4294967295L)) & 4294967295L) ^ jArr2[i4];
            jArr2[i2] = jArr2[i];
            return;
        }
        long[] jArr3 = this.f65311;
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

    @Override // p067l.InterfaceC4206
    /* JADX INFO: renamed from: ֡ */
    public final int mo8522() {
        if (this.f65315 == 0) {
            throw new NoSuchElementException();
        }
        return this.f65306[this.f65312];
    }

    @Override // p067l.InterfaceC4206
    /* JADX INFO: renamed from: ᩻֫ */
    public final int mo8527() {
        if (this.f65315 == 0) {
            throw new NoSuchElementException();
        }
        return this.f65306[this.f65305];
    }

    @Override // p067l.InterfaceC4206
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC4206 mo8524(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC4206
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC4206 mo8526(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC4206
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC4206 mo8525(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        C20105 c20105 = new C20105(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f65315;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            objectOutputStream.writeInt(c20105.nextInt());
            i = i2;
        }
    }

    @Override // p067l.AbstractC13634, p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C20105(this);
    }

    @Override // p067l.AbstractC13634, p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC8705 iterator() {
        return new C20105(this);
    }

    @Override // p067l.AbstractC13634, p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC16750 iterator() {
        return new C20105(this);
    }

    @Override // p067l.AbstractC13634, p067l.AbstractC8269, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC18287 spliterator() {
        return new C10912(new C20105(this), C6406.m14669(this), 337);
    }

    @Override // p067l.InterfaceC4206
    /* JADX INFO: renamed from: ۗ */
    public final InterfaceC16750 mo8523() {
        return new C20105(this);
    }

    @Override // p067l.AbstractC23022, p067l.InterfaceC16080
    public final void forEach(IntConsumer intConsumer) {
        int i = this.f65312;
        while (i != -1) {
            int i2 = (int) this.f65311[i];
            intConsumer.accept(this.f65306[i]);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m46921(int i) {
        int i2;
        int[] iArr = this.f65306;
        int i3 = i - 1;
        int i4 = i + 1;
        int[] iArr2 = new int[i4];
        int i5 = this.f65312;
        long[] jArr = this.f65311;
        long[] jArr2 = new long[i4];
        this.f65312 = -1;
        int i6 = this.f65315;
        int i7 = -1;
        int i8 = -1;
        while (true) {
            int i9 = i6 - 1;
            if (i6 == 0) {
                break;
            }
            int i10 = iArr[i5];
            if (i10 != 0) {
                int iM34881 = C15322.m34881(i10);
                while (true) {
                    i2 = iM34881 & i3;
                    if (iArr2[i2] == 0) {
                        break;
                    } else {
                        iM34881 = i2 + 1;
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
                this.f65312 = i2;
                jArr2[i2] = -1;
            }
            i7 = i2;
            i6 = i9;
            i8 = i5;
            i5 = (int) jArr[i5];
        }
        this.f65311 = jArr2;
        this.f65305 = i7;
        if (i7 != -1) {
            jArr2[i7] = 4294967295L | jArr2[i7];
        }
        this.f65309 = i;
        this.f65310 = i3;
        this.f65308 = C15322.m34887(this.f65314, i);
        this.f65306 = iArr2;
    }

    public final Object clone() {
        try {
            C20776 c20776 = (C20776) super.clone();
            c20776.f65306 = (int[]) this.f65306.clone();
            c20776.f65313 = this.f65313;
            c20776.f65311 = (long[]) this.f65311.clone();
            return c20776;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // p067l.AbstractC8269, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i;
        int[] iArr = this.f65306;
        int i2 = this.f65313 ? this.f65315 - 1 : this.f65315;
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
        int iM34881;
        objectInputStream.defaultReadObject();
        int i = this.f65315;
        float f = this.f65314;
        int iM34880 = C15322.m34880(f, i);
        this.f65309 = iM34880;
        this.f65308 = C15322.m34887(f, iM34880);
        int i2 = this.f65309;
        this.f65310 = i2 - 1;
        int[] iArr = new int[i2 + 1];
        this.f65306 = iArr;
        ?? r3 = 1;
        long[] jArr = new long[i2 + 1];
        this.f65311 = jArr;
        int i3 = -1;
        this.f65305 = -1;
        this.f65312 = -1;
        int i4 = this.f65315;
        int i5 = -1;
        while (true) {
            int i6 = i4 - 1;
            if (i4 == 0) {
                break;
            }
            int i7 = objectInputStream.readInt();
            if (i7 == 0) {
                iM34881 = this.f65309;
                this.f65313 = r3;
            } else {
                iM34881 = C15322.m34881(i7) & this.f65310;
                if (iArr[iM34881] != 0) {
                    do {
                        iM34881 = (iM34881 + r3) & this.f65310;
                    } while (iArr[iM34881] != 0);
                }
            }
            iArr[iM34881] = i7;
            if (this.f65312 != i3) {
                long j = jArr[i5];
                jArr[i5] = (((((long) iM34881) & 4294967295L) ^ j) & 4294967295L) ^ j;
                long j2 = jArr[iM34881];
                jArr[iM34881] = j2 ^ ((-4294967296L) & (((((long) i5) & 4294967295L) << 32) ^ j2));
            } else {
                this.f65312 = iM34881;
                jArr[iM34881] = jArr[iM34881] | (-4294967296L);
            }
            i4 = i6;
            i5 = iM34881;
            r3 = 1;
            i3 = -1;
        }
        this.f65305 = i5;
        if (i5 != -1) {
            jArr[i5] = 4294967295L | jArr[i5];
        }
    }
}
