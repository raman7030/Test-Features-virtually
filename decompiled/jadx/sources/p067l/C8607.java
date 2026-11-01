package p067l;

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
public final class C8607 extends AbstractC19038 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ */
    public transient int f23127;

    /* JADX INFO: renamed from: ۙ */
    public transient int f23128;

    /* JADX INFO: renamed from: ۛ */
    public InterfaceC11100 f23129;

    /* JADX INFO: renamed from: ۤ */
    public int f23130;

    /* JADX INFO: renamed from: ۫ */
    public transient int f23131;

    /* JADX INFO: renamed from: ۬ */
    public final transient int f23132;

    /* JADX INFO: renamed from: ᩶ */
    public transient Object[] f23133;

    /* JADX INFO: renamed from: ᩸ */
    public transient boolean f23134;

    /* JADX INFO: renamed from: ᩹ */
    public final float f23135;

    public C8607() {
        throw null;
    }

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C8607(InterfaceC11100 interfaceC11100) {
        this.f23129 = interfaceC11100;
        this.f23135 = 0.75f;
        int iM34880 = C15322.m34880(0.75f, 16);
        this.f23131 = iM34880;
        this.f23132 = iM34880;
        this.f23128 = iM34880 - 1;
        this.f23127 = C15322.m34887(0.75f, iM34880);
        this.f23133 = new Object[this.f23131 + 1];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        float f = this.f23135;
        if (f <= 0.5d) {
            int iM34880 = C15322.m34880(f, collection.size());
            if (iM34880 > this.f23131) {
                m20031(iM34880);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C15322.m34883((long) Math.ceil((collection.size() + this.f23130) / f))));
            if (iMin > this.f23131) {
                m20031(iMin);
            }
        }
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Object obj2;
        if (this.f23129.mo10801(obj, null)) {
            if (this.f23134) {
                return false;
            }
            this.f23134 = true;
            this.f23133[this.f23131] = obj;
        } else {
            Object[] objArr = this.f23133;
            int iM34881 = C15322.m34881(this.f23129.mo10800(obj)) & this.f23128;
            Object obj3 = objArr[iM34881];
            if (obj3 != null) {
                if (this.f23129.mo10801(obj3, obj)) {
                    return false;
                }
                do {
                    iM34881 = (iM34881 + 1) & this.f23128;
                    obj2 = objArr[iM34881];
                    if (obj2 != null) {
                    }
                } while (!this.f23129.mo10801(obj2, obj));
                return false;
            }
            objArr[iM34881] = obj;
        }
        int i = this.f23130;
        this.f23130 = i + 1;
        if (i >= this.f23127) {
            m20031(C15322.m34880(this.f23135, i + 2));
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m20030(int i) {
        Object obj;
        this.f23130--;
        Object[] objArr = this.f23133;
        loop0: while (true) {
            int i2 = (i + 1) & this.f23128;
            while (true) {
                obj = objArr[i2];
                if (obj != null) {
                    int iM34881 = C15322.m34881(this.f23129.mo10800(obj));
                    int i3 = this.f23128;
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
                } else {
                    break loop0;
                }
            }
            objArr[i] = obj;
            i = i2;
        }
        objArr[i] = null;
        int i5 = this.f23131;
        if (i5 <= this.f23132 || this.f23130 >= this.f23127 / 4 || i5 <= 16) {
            return;
        }
        m20031(i5 / 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        if (this.f23129.mo10801(obj, null)) {
            if (this.f23134) {
                this.f23134 = false;
                Object[] objArr = this.f23133;
                int i = this.f23131;
                objArr[i] = null;
                int i2 = this.f23130 - 1;
                this.f23130 = i2;
                if (i > this.f23132 && i2 < this.f23127 / 4 && i > 16) {
                    m20031(i / 2);
                }
                return true;
            }
        } else {
            Object[] objArr2 = this.f23133;
            int iM34881 = C15322.m34881(this.f23129.mo10800(obj)) & this.f23128;
            Object obj3 = objArr2[iM34881];
            if (obj3 != null) {
                if (this.f23129.mo10801(obj, obj3)) {
                    m20030(iM34881);
                    return true;
                }
                do {
                    iM34881 = (iM34881 + 1) & this.f23128;
                    obj2 = objArr2[iM34881];
                    if (obj2 == null) {
                    }
                } while (!this.f23129.mo10801(obj, obj2));
                m20030(iM34881);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object obj2;
        if (this.f23129.mo10801(obj, null)) {
            return this.f23134;
        }
        Object[] objArr = this.f23133;
        int iM34881 = C15322.m34881(this.f23129.mo10800(obj)) & this.f23128;
        Object obj3 = objArr[iM34881];
        if (obj3 == null) {
            return false;
        }
        if (!this.f23129.mo10801(obj, obj3)) {
            do {
                iM34881 = (iM34881 + 1) & this.f23128;
                obj2 = objArr[iM34881];
                if (obj2 == null) {
                    return false;
                }
            } while (!this.f23129.mo10801(obj, obj2));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f23130 == 0) {
            return;
        }
        this.f23130 = 0;
        this.f23134 = false;
        Arrays.fill(this.f23133, (Object) null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f23130;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f23130 == 0;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        C15982 c15982 = new C15982(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f23130;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            objectOutputStream.writeObject(c15982.next());
            i = i2;
        }
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C15982(this);
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC13833 iterator() {
        return new C15982(this);
    }

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, p067l.InterfaceC21210, p067l.InterfaceC3456, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC9948 spliterator() {
        return new C24700(this);
    }

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC16847 spliterator() {
        return new C24700(this);
    }

    @Override // p067l.AbstractC13262, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    public final void forEach(Consumer consumer) {
        Object[] objArr = this.f23133;
        if (this.f23134) {
            consumer.accept(objArr[this.f23131]);
        }
        int i = this.f23131;
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

    /* JADX INFO: renamed from: ֫ */
    public final void m20031(int i) {
        Object obj;
        Object[] objArr = this.f23133;
        int i2 = i - 1;
        Object[] objArr2 = new Object[i + 1];
        int i3 = this.f23131;
        int i4 = this.f23134 ? this.f23130 - 1 : this.f23130;
        while (true) {
            int i5 = i4 - 1;
            if (i4 != 0) {
                do {
                    i3--;
                    obj = objArr[i3];
                } while (obj == null);
                int iM34881 = C15322.m34881(this.f23129.mo10800(obj)) & i2;
                if (objArr2[iM34881] != null) {
                    do {
                        iM34881 = (iM34881 + 1) & i2;
                    } while (objArr2[iM34881] != null);
                }
                objArr2[iM34881] = objArr[i3];
                i4 = i5;
            } else {
                this.f23131 = i;
                this.f23128 = i2;
                this.f23127 = C15322.m34887(this.f23135, i);
                this.f23133 = objArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C8607 c8607 = (C8607) super.clone();
            c8607.f23133 = (Object[]) this.f23133.clone();
            c8607.f23134 = this.f23134;
            c8607.f23129 = this.f23129;
            return c8607;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // p067l.AbstractC19038, java.util.Collection, java.util.Set
    public final int hashCode() {
        Object obj;
        Object[] objArr = this.f23133;
        int i = this.f23134 ? this.f23130 - 1 : this.f23130;
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
                iMo10800 = this.f23129.mo10800(obj) + iMo10800;
            }
            i2++;
            i = i3;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int iM34881;
        objectInputStream.defaultReadObject();
        int i = this.f23130;
        float f = this.f23135;
        int iM34880 = C15322.m34880(f, i);
        this.f23131 = iM34880;
        this.f23127 = C15322.m34887(f, iM34880);
        int i2 = this.f23131;
        this.f23128 = i2 - 1;
        Object[] objArr = new Object[i2 + 1];
        this.f23133 = objArr;
        int i3 = this.f23130;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                return;
            }
            Object object = objectInputStream.readObject();
            if (this.f23129.mo10801(object, null)) {
                iM34881 = this.f23131;
                this.f23134 = true;
            } else {
                iM34881 = C15322.m34881(this.f23129.mo10800(object)) & this.f23128;
                if (objArr[iM34881] != null) {
                    do {
                        iM34881 = (iM34881 + 1) & this.f23128;
                    } while (objArr[iM34881] != null);
                }
            }
            objArr[iM34881] = object;
            i3 = i4;
        }
    }
}
