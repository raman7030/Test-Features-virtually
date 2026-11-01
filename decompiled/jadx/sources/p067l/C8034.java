package p067l;

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
public final class C8034 extends AbstractC8269 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ */
    public transient int f21128;

    /* JADX INFO: renamed from: ۙ */
    public transient int f21129;

    /* JADX INFO: renamed from: ۤ */
    public int f21130;

    /* JADX INFO: renamed from: ۫ */
    public transient int f21131;

    /* JADX INFO: renamed from: ۬ */
    public final transient int f21132;

    /* JADX INFO: renamed from: ᩶ */
    public transient int[] f21133;

    /* JADX INFO: renamed from: ᩸ */
    public transient boolean f21134;

    /* JADX INFO: renamed from: ᩹ */
    public final float f21135 = 0.75f;

    @Override // p067l.AbstractC8269, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C8034() {
        int iM34880 = C15322.m34880(0.75f, 16);
        this.f21131 = iM34880;
        this.f21132 = iM34880;
        this.f21129 = iM34880 - 1;
        this.f21128 = C15322.m34887(0.75f, iM34880);
        this.f21133 = new int[this.f21131 + 1];
    }

    /* JADX INFO: renamed from: ֫ */
    private void m18619(long j) {
        int iMin = (int) Math.min(1073741824L, Math.max(2L, C15322.m34883((long) Math.ceil(j / this.f21135))));
        if (iMin > this.f21131) {
            m18621(iMin);
        }
    }

    @Override // p067l.AbstractC23022
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18622(InterfaceC3360 interfaceC3360) {
        float f = this.f21135;
        if (f <= 0.5d) {
            int iM34880 = C15322.m34880(f, interfaceC3360.size());
            if (iM34880 > this.f21131) {
                m18621(iM34880);
            }
        } else {
            m18619(interfaceC3360.size() + this.f21130);
        }
        return super.mo18622(interfaceC3360);
    }

    @Override // p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        float f = this.f21135;
        if (f <= 0.5d) {
            int iM34880 = C15322.m34880(f, collection.size());
            if (iM34880 > this.f21131) {
                m18621(iM34880);
            }
        } else {
            m18619(collection.size() + this.f21130);
        }
        return super.addAll(collection);
    }

    @Override // p067l.AbstractC23022, p067l.InterfaceC3360
    public final boolean add(int i) {
        int i2;
        if (i == 0) {
            if (this.f21134) {
                return false;
            }
            this.f21134 = true;
        } else {
            int[] iArr = this.f21133;
            int iM34881 = C15322.m34881(i) & this.f21129;
            int i3 = iArr[iM34881];
            if (i3 != 0) {
                if (i3 == i) {
                    return false;
                }
                do {
                    iM34881 = (iM34881 + 1) & this.f21129;
                    i2 = iArr[iM34881];
                    if (i2 != 0) {
                    }
                } while (i2 != i);
                return false;
            }
            iArr[iM34881] = i;
        }
        int i4 = this.f21130;
        this.f21130 = i4 + 1;
        if (i4 >= this.f21128) {
            m18621(C15322.m34880(this.f21135, i4 + 2));
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m18620(int i) {
        int i2;
        this.f21130--;
        int[] iArr = this.f21133;
        loop0: while (true) {
            int i3 = (i + 1) & this.f21129;
            while (true) {
                i2 = iArr[i3];
                if (i2 != 0) {
                    int iM34881 = C15322.m34881(i2);
                    int i4 = this.f21129;
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
            i = i3;
        }
        iArr[i] = 0;
        int i6 = this.f21131;
        if (i6 <= this.f21132 || this.f21130 >= this.f21128 / 4 || i6 <= 16) {
            return;
        }
        m18621(i6 / 2);
    }

    @Override // p067l.AbstractC8269
    public final boolean remove(int i) {
        int i2;
        if (i == 0) {
            if (this.f21134) {
                this.f21134 = false;
                int[] iArr = this.f21133;
                int i3 = this.f21131;
                iArr[i3] = 0;
                int i4 = this.f21130 - 1;
                this.f21130 = i4;
                if (i3 > this.f21132 && i4 < this.f21128 / 4 && i3 > 16) {
                    m18621(i3 / 2);
                }
                return true;
            }
        } else {
            int[] iArr2 = this.f21133;
            int iM34881 = C15322.m34881(i) & this.f21129;
            int i5 = iArr2[iM34881];
            if (i5 != 0) {
                if (i == i5) {
                    m18620(iM34881);
                    return true;
                }
                do {
                    iM34881 = (iM34881 + 1) & this.f21129;
                    i2 = iArr2[iM34881];
                    if (i2 == 0) {
                    }
                } while (i != i2);
                m18620(iM34881);
                return true;
            }
        }
        return false;
    }

    @Override // p067l.InterfaceC3360
    public final boolean contains(int i) {
        int i2;
        if (i == 0) {
            return this.f21134;
        }
        int[] iArr = this.f21133;
        int iM34881 = C15322.m34881(i) & this.f21129;
        int i3 = iArr[iM34881];
        if (i3 == 0) {
            return false;
        }
        if (i != i3) {
            do {
                iM34881 = (iM34881 + 1) & this.f21129;
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
        if (this.f21130 == 0) {
            return;
        }
        this.f21130 = 0;
        this.f21134 = false;
        Arrays.fill(this.f21133, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f21130;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f21130 == 0;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        C14069 c14069 = new C14069(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f21130;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            objectOutputStream.writeInt(c14069.nextInt());
            i = i2;
        }
    }

    @Override // p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C14069(this);
    }

    @Override // p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC8705 iterator() {
        return new C14069(this);
    }

    @Override // p067l.AbstractC8269, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC16847 spliterator() {
        return new C12058(this);
    }

    @Override // p067l.AbstractC8269, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC18287 spliterator() {
        return new C12058(this);
    }

    @Override // p067l.AbstractC23022, p067l.InterfaceC16080
    public final void forEach(IntConsumer intConsumer) {
        int[] iArr = this.f21133;
        if (this.f21134) {
            intConsumer.accept(iArr[this.f21131]);
        }
        int i = this.f21131;
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

    /* JADX INFO: renamed from: ܿ */
    public final void m18623() {
        float f = this.f21130;
        float f2 = this.f21135;
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(((int) Math.ceil(f / f2)) - 1));
        if (iNumberOfLeadingZeros >= this.f21131 || this.f21130 > C15322.m34887(f2, iNumberOfLeadingZeros)) {
            return;
        }
        try {
            m18621(iNumberOfLeadingZeros);
        } catch (OutOfMemoryError unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18621(int i) {
        int i2;
        int[] iArr = this.f21133;
        int i3 = i - 1;
        int[] iArr2 = new int[i + 1];
        int i4 = this.f21131;
        int i5 = this.f21134 ? this.f21130 - 1 : this.f21130;
        while (true) {
            int i6 = i5 - 1;
            if (i5 != 0) {
                do {
                    i4--;
                    i2 = iArr[i4];
                } while (i2 == 0);
                int iM34881 = C15322.m34881(i2) & i3;
                if (iArr2[iM34881] != 0) {
                    do {
                        iM34881 = (iM34881 + 1) & i3;
                    } while (iArr2[iM34881] != 0);
                }
                iArr2[iM34881] = iArr[i4];
                i5 = i6;
            } else {
                this.f21131 = i;
                this.f21129 = i3;
                this.f21128 = C15322.m34887(this.f21135, i);
                this.f21133 = iArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C8034 c8034 = (C8034) super.clone();
            c8034.f21133 = (int[]) this.f21133.clone();
            c8034.f21134 = this.f21134;
            return c8034;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // p067l.AbstractC8269, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i;
        int[] iArr = this.f21133;
        int i2 = this.f21134 ? this.f21130 - 1 : this.f21130;
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
        int iM34881;
        objectInputStream.defaultReadObject();
        int i = this.f21130;
        float f = this.f21135;
        int iM34880 = C15322.m34880(f, i);
        this.f21131 = iM34880;
        this.f21128 = C15322.m34887(f, iM34880);
        int i2 = this.f21131;
        this.f21129 = i2 - 1;
        int[] iArr = new int[i2 + 1];
        this.f21133 = iArr;
        int i3 = this.f21130;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                return;
            }
            int i5 = objectInputStream.readInt();
            if (i5 == 0) {
                iM34881 = this.f21131;
                this.f21134 = true;
            } else {
                iM34881 = C15322.m34881(i5) & this.f21129;
                if (iArr[iM34881] != 0) {
                    do {
                        iM34881 = (iM34881 + 1) & this.f21129;
                    } while (iArr[iM34881] != 0);
                }
            }
            iArr[iM34881] = i5;
            i3 = i4;
        }
    }
}
