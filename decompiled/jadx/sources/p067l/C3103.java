package p067l;

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
public class C3103 extends AbstractC19038 implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᩸ */
    public transient Object[] f5643;

    /* JADX INFO: renamed from: ᩹ */
    public int f5644;

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C3103() {
        this.f5643 = C9809.f27145;
    }

    public C3103(Object[] objArr) {
        this.f5643 = objArr;
        this.f5644 = objArr.length;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m5285(Object obj) {
        Object[] objArr = this.f5643;
        int i = this.f5644;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return -1;
            }
            if (C12826.equals(objArr[i2], obj)) {
                return i2;
            }
            i = i2;
        }
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2432(this);
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC13833 iterator() {
        return new C2432(this);
    }

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, p067l.InterfaceC21210, p067l.InterfaceC3456, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC9948 spliterator() {
        return new C7127(this);
    }

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC16847 spliterator() {
        return new C7127(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return m5285(obj) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5644;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = this.f5644;
        if (i == 0) {
            return C9809.f27145;
        }
        return Arrays.copyOf(this.f5643, i, Object[].class);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM5285 = m5285(obj);
        if (iM5285 == -1) {
            return false;
        }
        int i = (this.f5644 - iM5285) - 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object[] objArr = this.f5643;
            int i3 = iM5285 + i2;
            objArr[i3] = objArr[i3 + 1];
        }
        int i4 = this.f5644 - 1;
        this.f5644 = i4;
        this.f5643[i4] = null;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (m5285(obj) != -1) {
            return false;
        }
        int i = this.f5644;
        if (i == this.f5643.length) {
            Object[] objArr = new Object[i == 0 ? 2 : i * 2];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                objArr[i2] = this.f5643[i2];
                i = i2;
            }
            this.f5643 = objArr;
        }
        Object[] objArr2 = this.f5643;
        int i3 = this.f5644;
        this.f5644 = i3 + 1;
        objArr2[i3] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Arrays.fill(this.f5643, 0, this.f5644, (Object) null);
        this.f5644 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f5644 == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr == null) {
            objArr = new Object[this.f5644];
        } else if (objArr.length < this.f5644) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f5644);
        }
        System.arraycopy(this.f5643, 0, objArr, 0, this.f5644);
        int length = objArr.length;
        int i = this.f5644;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    public final Object clone() {
        try {
            C3103 c3103 = (C3103) super.clone();
            c3103.f5643 = (Object[]) this.f5643.clone();
            return c3103;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Object[] objArr = this.f5643;
        for (int i = 0; i < this.f5644; i++) {
            objectOutputStream.writeObject(objArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object[] objArr = new Object[this.f5644];
        this.f5643 = objArr;
        for (int i = 0; i < this.f5644; i++) {
            objArr[i] = objectInputStream.readObject();
        }
    }
}
