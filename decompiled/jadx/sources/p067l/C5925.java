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

/* JADX INFO: renamed from: l.ۘۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C59 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5925 extends AbstractC19038 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ */
    public transient int f14621;

    /* JADX INFO: renamed from: ۙ */
    public transient int f14622;

    /* JADX INFO: renamed from: ۤ */
    public int f14623;

    /* JADX INFO: renamed from: ۫ */
    public transient int f14624;

    /* JADX INFO: renamed from: ۬ */
    public final transient int f14625;

    /* JADX INFO: renamed from: ᩶ */
    public transient Object[] f14626;

    /* JADX INFO: renamed from: ᩸ */
    public transient boolean f14627;

    /* JADX INFO: renamed from: ᩹ */
    public final float f14628 = 0.75f;

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C5925() {
        int iM34880 = C15322.m34880(0.75f, 16);
        this.f14624 = iM34880;
        this.f14625 = iM34880;
        this.f14622 = iM34880 - 1;
        this.f14621 = C15322.m34887(0.75f, iM34880);
        this.f14626 = new Object[this.f14624 + 1];
    }

    static {
        C12136.m28049of(new C22019(), new C11290(), new C10619(), EnumC8112.UNORDERED);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        float f = this.f14628;
        if (f <= 0.5d) {
            int iM34880 = C15322.m34880(f, collection.size());
            if (iM34880 > this.f14624) {
                m13306(iM34880);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C15322.m34883((long) Math.ceil((collection.size() + this.f14623) / f))));
            if (iMin > this.f14624) {
                m13306(iMin);
            }
        }
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Object obj2;
        if (obj == null) {
            if (this.f14627) {
                return false;
            }
            this.f14627 = true;
        } else {
            Object[] objArr = this.f14626;
            int iM34881 = C15322.m34881(obj.hashCode()) & this.f14622;
            Object obj3 = objArr[iM34881];
            if (obj3 != null) {
                if (obj3.equals(obj)) {
                    return false;
                }
                do {
                    iM34881 = (iM34881 + 1) & this.f14622;
                    obj2 = objArr[iM34881];
                    if (obj2 != null) {
                    }
                } while (!obj2.equals(obj));
                return false;
            }
            objArr[iM34881] = obj;
        }
        int i = this.f14623;
        this.f14623 = i + 1;
        if (i >= this.f14621) {
            m13306(C15322.m34880(this.f14628, i + 2));
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m13305(int i) {
        Object obj;
        this.f14623--;
        Object[] objArr = this.f14626;
        loop0: while (true) {
            int i2 = (i + 1) & this.f14622;
            while (true) {
                obj = objArr[i2];
                if (obj != null) {
                    int iM34881 = C15322.m34881(obj.hashCode());
                    int i3 = this.f14622;
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
        int i5 = this.f14624;
        if (i5 <= this.f14625 || this.f14623 >= this.f14621 / 4 || i5 <= 16) {
            return;
        }
        m13306(i5 / 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        if (obj == null) {
            if (this.f14627) {
                this.f14627 = false;
                Object[] objArr = this.f14626;
                int i = this.f14624;
                objArr[i] = null;
                int i2 = this.f14623 - 1;
                this.f14623 = i2;
                if (i > this.f14625 && i2 < this.f14621 / 4 && i > 16) {
                    m13306(i / 2);
                }
                return true;
            }
        } else {
            Object[] objArr2 = this.f14626;
            int iM34881 = C15322.m34881(obj.hashCode()) & this.f14622;
            Object obj3 = objArr2[iM34881];
            if (obj3 != null) {
                if (obj.equals(obj3)) {
                    m13305(iM34881);
                    return true;
                }
                do {
                    iM34881 = (iM34881 + 1) & this.f14622;
                    obj2 = objArr2[iM34881];
                    if (obj2 == null) {
                    }
                } while (!obj.equals(obj2));
                m13305(iM34881);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object obj2;
        if (obj == null) {
            return this.f14627;
        }
        Object[] objArr = this.f14626;
        int iM34881 = C15322.m34881(obj.hashCode()) & this.f14622;
        Object obj3 = objArr[iM34881];
        if (obj3 == null) {
            return false;
        }
        if (!obj.equals(obj3)) {
            do {
                iM34881 = (iM34881 + 1) & this.f14622;
                obj2 = objArr[iM34881];
                if (obj2 == null) {
                    return false;
                }
            } while (!obj.equals(obj2));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f14623 == 0) {
            return;
        }
        this.f14623 = 0;
        this.f14627 = false;
        Arrays.fill(this.f14626, (Object) null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f14623;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f14623 == 0;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        C17323 c17323 = new C17323(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f14623;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            objectOutputStream.writeObject(c17323.next());
            i = i2;
        }
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C17323(this);
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC13833 iterator() {
        return new C17323(this);
    }

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, p067l.InterfaceC21210, p067l.InterfaceC3456, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC9948 spliterator() {
        return new C4584(this);
    }

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC16847 spliterator() {
        return new C4584(this);
    }

    @Override // p067l.AbstractC13262, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    public final void forEach(Consumer consumer) {
        Object[] objArr = this.f14626;
        if (this.f14627) {
            consumer.accept(objArr[this.f14624]);
        }
        int i = this.f14624;
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
    public final void m13306(int i) {
        Object obj;
        Object[] objArr = this.f14626;
        int i2 = i - 1;
        Object[] objArr2 = new Object[i + 1];
        int i3 = this.f14624;
        int i4 = this.f14627 ? this.f14623 - 1 : this.f14623;
        while (true) {
            int i5 = i4 - 1;
            if (i4 != 0) {
                do {
                    i3--;
                    obj = objArr[i3];
                } while (obj == null);
                int iM34881 = C15322.m34881(obj.hashCode()) & i2;
                if (objArr2[iM34881] != null) {
                    do {
                        iM34881 = (iM34881 + 1) & i2;
                    } while (objArr2[iM34881] != null);
                }
                objArr2[iM34881] = objArr[i3];
                i4 = i5;
            } else {
                this.f14624 = i;
                this.f14622 = i2;
                this.f14621 = C15322.m34887(this.f14628, i);
                this.f14626 = objArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C5925 c5925 = (C5925) super.clone();
            c5925.f14626 = (Object[]) this.f14626.clone();
            c5925.f14627 = this.f14627;
            return c5925;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // p067l.AbstractC19038, java.util.Collection, java.util.Set
    public final int hashCode() {
        Object obj;
        Object[] objArr = this.f14626;
        int i = this.f14627 ? this.f14623 - 1 : this.f14623;
        int iHashCode = 0;
        int i2 = 0;
        while (true) {
            int i3 = i - 1;
            if (i == 0) {
                return iHashCode;
            }
            while (true) {
                obj = objArr[i2];
                if (obj != null) {
                    break;
                }
                i2++;
            }
            if (this != obj) {
                iHashCode = obj.hashCode() + iHashCode;
            }
            i2++;
            i = i3;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int iM34881;
        objectInputStream.defaultReadObject();
        int i = this.f14623;
        float f = this.f14628;
        int iM34880 = C15322.m34880(f, i);
        this.f14624 = iM34880;
        this.f14621 = C15322.m34887(f, iM34880);
        int i2 = this.f14624;
        this.f14622 = i2 - 1;
        Object[] objArr = new Object[i2 + 1];
        this.f14626 = objArr;
        int i3 = this.f14623;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                return;
            }
            Object object = objectInputStream.readObject();
            if (object == null) {
                iM34881 = this.f14624;
                this.f14627 = true;
            } else {
                iM34881 = C15322.m34881(object.hashCode()) & this.f14622;
                if (objArr[iM34881] != null) {
                    do {
                        iM34881 = (iM34881 + 1) & this.f14622;
                    } while (objArr[iM34881] != null);
                }
            }
            objArr[iM34881] = object;
            i3 = i4;
        }
    }
}
