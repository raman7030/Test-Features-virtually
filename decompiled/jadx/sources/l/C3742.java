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

/* JADX INFO: renamed from: l.ۘۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C59 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3742 extends AbstractC17539 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient int f11814;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public transient int f11815;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f11816;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient int f11817;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final transient int f11818;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient Object[] f11819;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient boolean f11820;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final float f11821 = 0.75f;

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C3742() {
        int iM32765 = C13630.m32765(0.75f, 16);
        this.f11817 = iM32765;
        this.f11818 = iM32765;
        this.f11815 = iM32765 - 1;
        this.f11814 = C13630.m32772(0.75f, iM32765);
        this.f11819 = new Object[this.f11817 + 1];
    }

    static {
        C10277.of(new C20676(), new C9387(), new C8681(), EnumC6043.UNORDERED);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        float f = this.f11821;
        if (f <= 0.5d) {
            int iM32765 = C13630.m32765(f, collection.size());
            if (iM32765 > this.f11817) {
                m11354(iM32765);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C13630.m32768((long) Math.ceil((collection.size() + this.f11816) / f))));
            if (iMin > this.f11817) {
                m11354(iMin);
            }
        }
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Object obj2;
        if (obj == null) {
            if (this.f11820) {
                return false;
            }
            this.f11820 = true;
        } else {
            Object[] objArr = this.f11819;
            int iM32766 = C13630.m32766(obj.hashCode()) & this.f11815;
            Object obj3 = objArr[iM32766];
            if (obj3 != null) {
                if (obj3.equals(obj)) {
                    return false;
                }
                do {
                    iM32766 = (iM32766 + 1) & this.f11815;
                    obj2 = objArr[iM32766];
                    if (obj2 != null) {
                    }
                } while (!obj2.equals(obj));
                return false;
            }
            objArr[iM32766] = obj;
        }
        int i = this.f11816;
        this.f11816 = i + 1;
        if (i >= this.f11814) {
            m11354(C13630.m32765(this.f11821, i + 2));
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m11353(int i) {
        Object obj;
        this.f11816--;
        Object[] objArr = this.f11819;
        loop0: while (true) {
            int i2 = (i + 1) & this.f11815;
            while (true) {
                obj = objArr[i2];
                if (obj != null) {
                    int iM32766 = C13630.m32766(obj.hashCode());
                    int i3 = this.f11815;
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
        int i5 = this.f11817;
        if (i5 <= this.f11818 || this.f11816 >= this.f11814 / 4 || i5 <= 16) {
            return;
        }
        m11354(i5 / 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        if (obj == null) {
            if (this.f11820) {
                this.f11820 = false;
                Object[] objArr = this.f11819;
                int i = this.f11817;
                objArr[i] = null;
                int i2 = this.f11816 - 1;
                this.f11816 = i2;
                if (i > this.f11818 && i2 < this.f11814 / 4 && i > 16) {
                    m11354(i / 2);
                }
                return true;
            }
        } else {
            Object[] objArr2 = this.f11819;
            int iM32766 = C13630.m32766(obj.hashCode()) & this.f11815;
            Object obj3 = objArr2[iM32766];
            if (obj3 != null) {
                if (obj.equals(obj3)) {
                    m11353(iM32766);
                    return true;
                }
                do {
                    iM32766 = (iM32766 + 1) & this.f11815;
                    obj2 = objArr2[iM32766];
                    if (obj2 == null) {
                    }
                } while (!obj.equals(obj2));
                m11353(iM32766);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object obj2;
        if (obj == null) {
            return this.f11820;
        }
        Object[] objArr = this.f11819;
        int iM32766 = C13630.m32766(obj.hashCode()) & this.f11815;
        Object obj3 = objArr[iM32766];
        if (obj3 == null) {
            return false;
        }
        if (!obj.equals(obj3)) {
            do {
                iM32766 = (iM32766 + 1) & this.f11815;
                obj2 = objArr[iM32766];
                if (obj2 == null) {
                    return false;
                }
            } while (!obj.equals(obj2));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f11816 == 0) {
            return;
        }
        this.f11816 = 0;
        this.f11820 = false;
        Arrays.fill(this.f11819, (Object) null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f11816;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f11816 == 0;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        C15735 c15735 = new C15735(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f11816;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            objectOutputStream.writeObject(c15735.next());
            i = i2;
        }
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C15735(this);
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC12063 iterator() {
        return new C15735(this);
    }

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC19825, l.InterfaceC1144, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC7975 spliterator() {
        return new C2331(this);
    }

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC15234 spliterator() {
        return new C2331(this);
    }

    @Override // l.AbstractC11462, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public final void forEach(Consumer consumer) {
        Object[] objArr = this.f11819;
        if (this.f11820) {
            consumer.accept(objArr[this.f11817]);
        }
        int i = this.f11817;
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
    public final void m11354(int i) {
        Object obj;
        Object[] objArr = this.f11819;
        int i2 = i - 1;
        Object[] objArr2 = new Object[i + 1];
        int i3 = this.f11817;
        int i4 = this.f11820 ? this.f11816 - 1 : this.f11816;
        while (true) {
            int i5 = i4 - 1;
            if (i4 != 0) {
                do {
                    i3--;
                    obj = objArr[i3];
                } while (obj == null);
                int iM32766 = C13630.m32766(obj.hashCode()) & i2;
                if (objArr2[iM32766] != null) {
                    do {
                        iM32766 = (iM32766 + 1) & i2;
                    } while (objArr2[iM32766] != null);
                }
                objArr2[iM32766] = objArr[i3];
                i4 = i5;
            } else {
                this.f11817 = i;
                this.f11815 = i2;
                this.f11814 = C13630.m32772(this.f11821, i);
                this.f11819 = objArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C3742 c3742 = (C3742) super.clone();
            c3742.f11819 = (Object[]) this.f11819.clone();
            c3742.f11820 = this.f11820;
            return c3742;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // l.AbstractC17539, java.util.Collection, java.util.Set
    public final int hashCode() {
        Object obj;
        Object[] objArr = this.f11819;
        int i = this.f11820 ? this.f11816 - 1 : this.f11816;
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
        int iM32766;
        objectInputStream.defaultReadObject();
        int i = this.f11816;
        float f = this.f11821;
        int iM32765 = C13630.m32765(f, i);
        this.f11817 = iM32765;
        this.f11814 = C13630.m32772(f, iM32765);
        int i2 = this.f11817;
        this.f11815 = i2 - 1;
        Object[] objArr = new Object[i2 + 1];
        this.f11819 = objArr;
        int i3 = this.f11816;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                return;
            }
            Object object = objectInputStream.readObject();
            if (object == null) {
                iM32766 = this.f11817;
                this.f11820 = true;
            } else {
                iM32766 = C13630.m32766(object.hashCode()) & this.f11815;
                if (objArr[iM32766] != null) {
                    do {
                        iM32766 = (iM32766 + 1) & this.f11815;
                    } while (objArr[iM32766] != null);
                }
            }
            objArr[iM32766] = object;
            i3 = i4;
        }
    }
}
