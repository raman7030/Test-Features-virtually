package p067l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.۫ۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7CAF */
/* JADX INFO: loaded from: classes4.dex */
public final class C13893 extends AbstractC13594 implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᩸ */
    public transient long[] f39227;

    /* JADX INFO: renamed from: ᩹ */
    public int f39228;

    @Override // p067l.AbstractC13594, p067l.AbstractC23652, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C13893() {
        this.f39227 = C11882.f33108;
    }

    public C13893(long[] jArr) {
        this.f39227 = jArr;
        this.f39228 = jArr.length;
    }

    /* JADX INFO: renamed from: ܽ */
    private int m31613(long j) {
        long[] jArr = this.f39227;
        int i = this.f39228;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return -1;
            }
            if (jArr[i2] == j) {
                return i2;
            }
            i = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C5176(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, p067l.InterfaceC13223, p067l.InterfaceC18625, java.util.List
    public final InterfaceC24660 iterator() {
        return new C5176(this);
    }

    @Override // p067l.AbstractC13594, p067l.AbstractC23652, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC16847 spliterator() {
        return new C14563(this);
    }

    @Override // p067l.InterfaceC13223
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo19003(long j) {
        return m31613(j) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f39228;
    }

    @Override // p067l.AbstractC13594
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo30922(long j) {
        int iM31613 = m31613(j);
        if (iM31613 == -1) {
            return false;
        }
        int i = (this.f39228 - iM31613) - 1;
        for (int i2 = 0; i2 < i; i2++) {
            long[] jArr = this.f39227;
            int i3 = iM31613 + i2;
            jArr[i3] = jArr[i3 + 1];
        }
        this.f39228--;
        return true;
    }

    @Override // p067l.AbstractC23652, p067l.InterfaceC13223
    public final boolean add(long j) {
        if (m31613(j) != -1) {
            return false;
        }
        int i = this.f39228;
        if (i == this.f39227.length) {
            long[] jArr = new long[i == 0 ? 2 : i * 2];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                jArr[i2] = this.f39227[i2];
                i = i2;
            }
            this.f39227 = jArr;
        }
        long[] jArr2 = this.f39227;
        int i3 = this.f39228;
        this.f39228 = i3 + 1;
        jArr2[i3] = j;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f39228 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f39228 == 0;
    }

    public final Object clone() {
        try {
            C13893 c13893 = (C13893) super.clone();
            c13893.f39227 = (long[]) this.f39227.clone();
            return c13893;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        long[] jArr = this.f39227;
        for (int i = 0; i < this.f39228; i++) {
            objectOutputStream.writeLong(jArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long[] jArr = new long[this.f39228];
        this.f39227 = jArr;
        for (int i = 0; i < this.f39228; i++) {
            jArr[i] = objectInputStream.readLong();
        }
    }
}
