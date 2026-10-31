package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۛۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DC36 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5961 extends AbstractC6208 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient int f18274;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public transient int f18275;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f18276;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient int f18277;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final transient int f18278;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient int[] f18279;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient boolean f18280;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final float f18281 = 0.75f;

    @Override // l.AbstractC6208, l.AbstractC21731, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C5961() {
        int iM32765 = C13630.m32765(0.75f, 16);
        this.f18277 = iM32765;
        this.f18278 = iM32765;
        this.f18275 = iM32765 - 1;
        this.f18274 = C13630.m32772(0.75f, iM32765);
        this.f18279 = new int[this.f18277 + 1];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m16693(long j) {
        int iMin = (int) Math.min(1073741824L, Math.max(2L, C13630.m32768((long) Math.ceil(j / this.f18281))));
        if (iMin > this.f18277) {
            m16695(iMin);
        }
    }

    @Override // l.AbstractC21731
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo16696(InterfaceC1043 interfaceC1043) {
        float f = this.f18281;
        if (f <= 0.5d) {
            int iM32765 = C13630.m32765(f, interfaceC1043.size());
            if (iM32765 > this.f18277) {
                m16695(iM32765);
            }
        } else {
            m16693(interfaceC1043.size() + this.f18276);
        }
        return super.mo16696(interfaceC1043);
    }

    @Override // l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        float f = this.f18281;
        if (f <= 0.5d) {
            int iM32765 = C13630.m32765(f, collection.size());
            if (iM32765 > this.f18277) {
                m16695(iM32765);
            }
        } else {
            m16693(collection.size() + this.f18276);
        }
        return super.addAll(collection);
    }

    @Override // l.AbstractC21731, l.InterfaceC1043
    public final boolean add(int i) {
        int i2;
        if (i == 0) {
            if (this.f18280) {
                return false;
            }
            this.f18280 = true;
        } else {
            int[] iArr = this.f18279;
            int iM32766 = C13630.m32766(i) & this.f18275;
            int i3 = iArr[iM32766];
            if (i3 != 0) {
                if (i3 == i) {
                    return false;
                }
                do {
                    iM32766 = (iM32766 + 1) & this.f18275;
                    i2 = iArr[iM32766];
                    if (i2 != 0) {
                    }
                } while (i2 != i);
                return false;
            }
            iArr[iM32766] = i;
        }
        int i4 = this.f18276;
        this.f18276 = i4 + 1;
        if (i4 >= this.f18274) {
            m16695(C13630.m32765(this.f18281, i4 + 2));
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m16694(int i) {
        int i2;
        this.f18276--;
        int[] iArr = this.f18279;
        loop0: while (true) {
            int i3 = (i + 1) & this.f18275;
            while (true) {
                i2 = iArr[i3];
                if (i2 != 0) {
                    int iM32766 = C13630.m32766(i2);
                    int i4 = this.f18275;
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
            i = i3;
        }
        iArr[i] = 0;
        int i6 = this.f18277;
        if (i6 <= this.f18278 || this.f18276 >= this.f18274 / 4 || i6 <= 16) {
            return;
        }
        m16695(i6 / 2);
    }

    @Override // l.AbstractC6208
    public final boolean remove(int i) {
        int i2;
        if (i == 0) {
            if (this.f18280) {
                this.f18280 = false;
                int[] iArr = this.f18279;
                int i3 = this.f18277;
                iArr[i3] = 0;
                int i4 = this.f18276 - 1;
                this.f18276 = i4;
                if (i3 > this.f18278 && i4 < this.f18274 / 4 && i3 > 16) {
                    m16695(i3 / 2);
                }
                return true;
            }
        } else {
            int[] iArr2 = this.f18279;
            int iM32766 = C13630.m32766(i) & this.f18275;
            int i5 = iArr2[iM32766];
            if (i5 != 0) {
                if (i == i5) {
                    m16694(iM32766);
                    return true;
                }
                do {
                    iM32766 = (iM32766 + 1) & this.f18275;
                    i2 = iArr2[iM32766];
                    if (i2 == 0) {
                    }
                } while (i != i2);
                m16694(iM32766);
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC1043
    public final boolean contains(int i) {
        int i2;
        if (i == 0) {
            return this.f18280;
        }
        int[] iArr = this.f18279;
        int iM32766 = C13630.m32766(i) & this.f18275;
        int i3 = iArr[iM32766];
        if (i3 == 0) {
            return false;
        }
        if (i != i3) {
            do {
                iM32766 = (iM32766 + 1) & this.f18275;
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
        if (this.f18276 == 0) {
            return;
        }
        this.f18276 = 0;
        this.f18280 = false;
        Arrays.fill(this.f18279, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f18276;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f18276 == 0;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        C12311 c12311 = new C12311(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f18276;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            objectOutputStream.writeInt(c12311.nextInt());
            i = i2;
        }
    }

    @Override // l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C12311(this);
    }

    @Override // l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC6667 iterator() {
        return new C12311(this);
    }

    @Override // l.AbstractC6208, l.AbstractC21731, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC15234 spliterator() {
        return new C10195(this);
    }

    @Override // l.AbstractC6208, l.AbstractC21731, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC16749 spliterator() {
        return new C10195(this);
    }

    @Override // l.AbstractC21731, l.InterfaceC14427
    public final void forEach(IntConsumer intConsumer) {
        int[] iArr = this.f18279;
        if (this.f18280) {
            intConsumer.accept(iArr[this.f18277]);
        }
        int i = this.f18277;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            int i3 = iArr[i2];
            if (i3 != 0) {
                intConsumer.accept(i3);
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m16697() {
        float f = this.f18276;
        float f2 = this.f18281;
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(((int) Math.ceil(f / f2)) - 1));
        if (iNumberOfLeadingZeros >= this.f18277 || this.f18276 > C13630.m32772(f2, iNumberOfLeadingZeros)) {
            return;
        }
        try {
            m16695(iNumberOfLeadingZeros);
        } catch (OutOfMemoryError unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16695(int i) {
        int i2;
        int[] iArr = this.f18279;
        int i3 = i - 1;
        int[] iArr2 = new int[i + 1];
        int i4 = this.f18277;
        int i5 = this.f18280 ? this.f18276 - 1 : this.f18276;
        while (true) {
            int i6 = i5 - 1;
            if (i5 != 0) {
                do {
                    i4--;
                    i2 = iArr[i4];
                } while (i2 == 0);
                int iM32766 = C13630.m32766(i2) & i3;
                if (iArr2[iM32766] != 0) {
                    do {
                        iM32766 = (iM32766 + 1) & i3;
                    } while (iArr2[iM32766] != 0);
                }
                iArr2[iM32766] = iArr[i4];
                i5 = i6;
            } else {
                this.f18277 = i;
                this.f18275 = i3;
                this.f18274 = C13630.m32772(this.f18281, i);
                this.f18279 = iArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C5961 c5961 = (C5961) super.clone();
            c5961.f18279 = (int[]) this.f18279.clone();
            c5961.f18280 = this.f18280;
            return c5961;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // l.AbstractC6208, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i;
        int[] iArr = this.f18279;
        int i2 = this.f18280 ? this.f18276 - 1 : this.f18276;
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

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int iM32766;
        objectInputStream.defaultReadObject();
        int i = this.f18276;
        float f = this.f18281;
        int iM32765 = C13630.m32765(f, i);
        this.f18277 = iM32765;
        this.f18274 = C13630.m32772(f, iM32765);
        int i2 = this.f18277;
        this.f18275 = i2 - 1;
        int[] iArr = new int[i2 + 1];
        this.f18279 = iArr;
        int i3 = this.f18276;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                return;
            }
            int i5 = objectInputStream.readInt();
            if (i5 == 0) {
                iM32766 = this.f18277;
                this.f18280 = true;
            } else {
                iM32766 = C13630.m32766(i5) & this.f18275;
                if (iArr[iM32766] != 0) {
                    do {
                        iM32766 = (iM32766 + 1) & this.f18275;
                    } while (iArr[iM32766] != 0);
                }
            }
            iArr[iM32766] = i5;
            i3 = i4;
        }
    }
}
