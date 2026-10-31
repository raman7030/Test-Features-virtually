package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۜۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VFO */
/* JADX INFO: loaded from: classes3.dex */
public final class C6564 extends AbstractC17539 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient int f20249;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public transient int f20250;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public InterfaceC9187 f20251;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f20252;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient int f20253;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final transient int f20254;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient Object[] f20255;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient boolean f20256;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final float f20257;

    public C6564() {
        throw null;
    }

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C6564(InterfaceC9187 interfaceC9187) {
        this.f20251 = interfaceC9187;
        this.f20257 = 0.75f;
        int iM32765 = C13630.m32765(0.75f, 16);
        this.f20253 = iM32765;
        this.f20254 = iM32765;
        this.f20250 = iM32765 - 1;
        this.f20249 = C13630.m32772(0.75f, iM32765);
        this.f20255 = new Object[this.f20253 + 1];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        float f = this.f20257;
        if (f <= 0.5d) {
            int iM32765 = C13630.m32765(f, collection.size());
            if (iM32765 > this.f20253) {
                m18081(iM32765);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C13630.m32768((long) Math.ceil((collection.size() + this.f20252) / f))));
            if (iMin > this.f20253) {
                m18081(iMin);
            }
        }
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Object obj2;
        if (this.f20251.mo8734(obj, null)) {
            if (this.f20256) {
                return false;
            }
            this.f20256 = true;
            this.f20255[this.f20253] = obj;
        } else {
            Object[] objArr = this.f20255;
            int iM32766 = C13630.m32766(this.f20251.mo8733(obj)) & this.f20250;
            Object obj3 = objArr[iM32766];
            if (obj3 != null) {
                if (this.f20251.mo8734(obj3, obj)) {
                    return false;
                }
                do {
                    iM32766 = (iM32766 + 1) & this.f20250;
                    obj2 = objArr[iM32766];
                    if (obj2 != null) {
                    }
                } while (!this.f20251.mo8734(obj2, obj));
                return false;
            }
            objArr[iM32766] = obj;
        }
        int i = this.f20252;
        this.f20252 = i + 1;
        if (i >= this.f20249) {
            m18081(C13630.m32765(this.f20257, i + 2));
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m18080(int i) {
        Object obj;
        this.f20252--;
        Object[] objArr = this.f20255;
        loop0: while (true) {
            int i2 = (i + 1) & this.f20250;
            while (true) {
                obj = objArr[i2];
                if (obj != null) {
                    int iM32766 = C13630.m32766(this.f20251.mo8733(obj));
                    int i3 = this.f20250;
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
                } else {
                    break loop0;
                }
            }
            objArr[i] = obj;
            i = i2;
        }
        objArr[i] = null;
        int i5 = this.f20253;
        if (i5 <= this.f20254 || this.f20252 >= this.f20249 / 4 || i5 <= 16) {
            return;
        }
        m18081(i5 / 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        if (this.f20251.mo8734(obj, null)) {
            if (this.f20256) {
                this.f20256 = false;
                Object[] objArr = this.f20255;
                int i = this.f20253;
                objArr[i] = null;
                int i2 = this.f20252 - 1;
                this.f20252 = i2;
                if (i > this.f20254 && i2 < this.f20249 / 4 && i > 16) {
                    m18081(i / 2);
                }
                return true;
            }
        } else {
            Object[] objArr2 = this.f20255;
            int iM32766 = C13630.m32766(this.f20251.mo8733(obj)) & this.f20250;
            Object obj3 = objArr2[iM32766];
            if (obj3 != null) {
                if (this.f20251.mo8734(obj, obj3)) {
                    m18080(iM32766);
                    return true;
                }
                do {
                    iM32766 = (iM32766 + 1) & this.f20250;
                    obj2 = objArr2[iM32766];
                    if (obj2 == null) {
                    }
                } while (!this.f20251.mo8734(obj, obj2));
                m18080(iM32766);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object obj2;
        if (this.f20251.mo8734(obj, null)) {
            return this.f20256;
        }
        Object[] objArr = this.f20255;
        int iM32766 = C13630.m32766(this.f20251.mo8733(obj)) & this.f20250;
        Object obj3 = objArr[iM32766];
        if (obj3 == null) {
            return false;
        }
        if (!this.f20251.mo8734(obj, obj3)) {
            do {
                iM32766 = (iM32766 + 1) & this.f20250;
                obj2 = objArr[iM32766];
                if (obj2 == null) {
                    return false;
                }
            } while (!this.f20251.mo8734(obj, obj2));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f20252 == 0) {
            return;
        }
        this.f20252 = 0;
        this.f20256 = false;
        Arrays.fill(this.f20255, (Object) null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f20252;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f20252 == 0;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        C14324 c14324 = new C14324(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f20252;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            objectOutputStream.writeObject(c14324.next());
            i = i2;
        }
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C14324(this);
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC12063 iterator() {
        return new C14324(this);
    }

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC19825, l.InterfaceC1144, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC7975 spliterator() {
        return new C23497(this);
    }

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC15234 spliterator() {
        return new C23497(this);
    }

    @Override // l.AbstractC11462, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public final void forEach(Consumer consumer) {
        Object[] objArr = this.f20255;
        if (this.f20256) {
            consumer.accept(objArr[this.f20253]);
        }
        int i = this.f20253;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            Object obj = objArr[i2];
            if (obj != null) {
                consumer.accept(obj);
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18081(int i) {
        Object obj;
        Object[] objArr = this.f20255;
        int i2 = i - 1;
        Object[] objArr2 = new Object[i + 1];
        int i3 = this.f20253;
        int i4 = this.f20256 ? this.f20252 - 1 : this.f20252;
        while (true) {
            int i5 = i4 - 1;
            if (i4 != 0) {
                do {
                    i3--;
                    obj = objArr[i3];
                } while (obj == null);
                int iM32766 = C13630.m32766(this.f20251.mo8733(obj)) & i2;
                if (objArr2[iM32766] != null) {
                    do {
                        iM32766 = (iM32766 + 1) & i2;
                    } while (objArr2[iM32766] != null);
                }
                objArr2[iM32766] = objArr[i3];
                i4 = i5;
            } else {
                this.f20253 = i;
                this.f20250 = i2;
                this.f20249 = C13630.m32772(this.f20257, i);
                this.f20255 = objArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C6564 c6564 = (C6564) super.clone();
            c6564.f20255 = (Object[]) this.f20255.clone();
            c6564.f20256 = this.f20256;
            c6564.f20251 = this.f20251;
            return c6564;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // l.AbstractC17539, java.util.Collection, java.util.Set
    public final int hashCode() {
        Object obj;
        Object[] objArr = this.f20255;
        int i = this.f20256 ? this.f20252 - 1 : this.f20252;
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
                iMo8733 = this.f20251.mo8733(obj) + iMo8733;
            }
            i2++;
            i = i3;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int iM32766;
        objectInputStream.defaultReadObject();
        int i = this.f20252;
        float f = this.f20257;
        int iM32765 = C13630.m32765(f, i);
        this.f20253 = iM32765;
        this.f20249 = C13630.m32772(f, iM32765);
        int i2 = this.f20253;
        this.f20250 = i2 - 1;
        Object[] objArr = new Object[i2 + 1];
        this.f20255 = objArr;
        int i3 = this.f20252;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                return;
            }
            Object object = objectInputStream.readObject();
            if (this.f20251.mo8734(object, null)) {
                iM32766 = this.f20253;
                this.f20256 = true;
            } else {
                iM32766 = C13630.m32766(this.f20251.mo8733(object)) & this.f20250;
                if (objArr[iM32766] != null) {
                    do {
                        iM32766 = (iM32766 + 1) & this.f20250;
                    } while (objArr[iM32766] != null);
                }
            }
            objArr[iM32766] = object;
            i3 = i4;
        }
    }
}
