package p067l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ᩴۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91Q1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20125 extends AbstractC8269 implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᩸ */
    public transient int[] f62309;

    /* JADX INFO: renamed from: ᩹ */
    public int f62310;

    @Override // p067l.AbstractC8269, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C20125() {
        this.f62309 = C20796.f65364;
    }

    public C20125(int i) {
        this.f62309 = new int[i];
    }

    public C20125(int[] iArr) {
        this.f62309 = iArr;
        this.f62310 = iArr.length;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m45563(int i) {
        int[] iArr = this.f62309;
        int i2 = this.f62310;
        while (true) {
            int i3 = i2 - 1;
            if (i2 == 0) {
                return -1;
            }
            if (iArr[i3] == i) {
                return i3;
            }
            i2 = i3;
        }
    }

    @Override // p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C4702(this);
    }

    @Override // p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC8705 iterator() {
        return new C4702(this);
    }

    @Override // p067l.AbstractC8269, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC16847 spliterator() {
        return new C6043(this);
    }

    @Override // p067l.AbstractC8269, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC18287 spliterator() {
        return new C6043(this);
    }

    @Override // p067l.InterfaceC3360
    public final boolean contains(int i) {
        return m45563(i) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f62310;
    }

    @Override // p067l.AbstractC8269
    public final boolean remove(int i) {
        int iM45563 = m45563(i);
        if (iM45563 == -1) {
            return false;
        }
        int i2 = (this.f62310 - iM45563) - 1;
        for (int i3 = 0; i3 < i2; i3++) {
            int[] iArr = this.f62309;
            int i4 = iM45563 + i3;
            iArr[i4] = iArr[i4 + 1];
        }
        this.f62310--;
        return true;
    }

    @Override // p067l.AbstractC23022, p067l.InterfaceC3360
    public final boolean add(int i) {
        if (m45563(i) != -1) {
            return false;
        }
        int i2 = this.f62310;
        if (i2 == this.f62309.length) {
            int[] iArr = new int[i2 == 0 ? 2 : i2 * 2];
            while (true) {
                int i3 = i2 - 1;
                if (i2 == 0) {
                    break;
                }
                iArr[i3] = this.f62309[i3];
                i2 = i3;
            }
            this.f62309 = iArr;
        }
        int[] iArr2 = this.f62309;
        int i4 = this.f62310;
        this.f62310 = i4 + 1;
        iArr2[i4] = i;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f62310 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f62310 == 0;
    }

    @Override // p067l.AbstractC23022, p067l.InterfaceC3360
    /* JADX INFO: renamed from: ܶ */
    public final int[] mo5873() {
        int i = this.f62310;
        return i == 0 ? C20796.f65364 : Arrays.copyOf(this.f62309, i);
    }

    public final Object clone() {
        try {
            C20125 c20125 = (C20125) super.clone();
            c20125.f62309 = (int[]) this.f62309.clone();
            return c20125;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int[] iArr = this.f62309;
        for (int i = 0; i < this.f62310; i++) {
            objectOutputStream.writeInt(iArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int[] iArr = new int[this.f62310];
        this.f62309 = iArr;
        for (int i = 0; i < this.f62310; i++) {
            iArr[i] = objectInputStream.readInt();
        }
    }
}
