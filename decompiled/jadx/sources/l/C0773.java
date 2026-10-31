package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.֨֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21EP */
/* JADX INFO: loaded from: classes3.dex */
public class C0773 extends AbstractC17539 implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient Object[] f2871;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f2872;

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C0773() {
        this.f2871 = C7829.f24229;
    }

    public C0773(Object[] objArr) {
        this.f2871 = objArr;
        this.f2872 = objArr.length;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m2956(Object obj) {
        Object[] objArr = this.f2871;
        int i = this.f2872;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return -1;
            }
            if (C11003.equals(objArr[i2], obj)) {
                return i2;
            }
            i = i2;
        }
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0067(this);
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC12063 iterator() {
        return new C0067(this);
    }

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC19825, l.InterfaceC1144, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC7975 spliterator() {
        return new C5007(this);
    }

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC15234 spliterator() {
        return new C5007(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return m2956(obj) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2872;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = this.f2872;
        if (i == 0) {
            return C7829.f24229;
        }
        return Arrays.copyOf(this.f2871, i, Object[].class);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM2956 = m2956(obj);
        if (iM2956 == -1) {
            return false;
        }
        int i = (this.f2872 - iM2956) - 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object[] objArr = this.f2871;
            int i3 = iM2956 + i2;
            objArr[i3] = objArr[i3 + 1];
        }
        int i4 = this.f2872 - 1;
        this.f2872 = i4;
        this.f2871[i4] = null;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (m2956(obj) != -1) {
            return false;
        }
        int i = this.f2872;
        if (i == this.f2871.length) {
            Object[] objArr = new Object[i == 0 ? 2 : i * 2];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                objArr[i2] = this.f2871[i2];
                i = i2;
            }
            this.f2871 = objArr;
        }
        Object[] objArr2 = this.f2871;
        int i3 = this.f2872;
        this.f2872 = i3 + 1;
        objArr2[i3] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Arrays.fill(this.f2871, 0, this.f2872, (Object) null);
        this.f2872 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f2872 == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr == null) {
            objArr = new Object[this.f2872];
        } else if (objArr.length < this.f2872) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f2872);
        }
        System.arraycopy(this.f2871, 0, objArr, 0, this.f2872);
        int length = objArr.length;
        int i = this.f2872;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    public final Object clone() {
        try {
            C0773 c0773 = (C0773) super.clone();
            c0773.f2871 = (Object[]) this.f2871.clone();
            return c0773;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Object[] objArr = this.f2871;
        for (int i = 0; i < this.f2872; i++) {
            objectOutputStream.writeObject(objArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object[] objArr = new Object[this.f2872];
        this.f2871 = objArr;
        for (int i = 0; i < this.f2872; i++) {
            objArr[i] = objectInputStream.readObject();
        }
    }
}
