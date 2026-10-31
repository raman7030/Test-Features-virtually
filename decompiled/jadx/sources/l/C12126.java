package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.۫ۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7CAF */
/* JADX INFO: loaded from: classes4.dex */
public final class C12126 extends AbstractC11811 implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient long[] f36215;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f36216;

    @Override // l.AbstractC11811, l.AbstractC22394, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C12126() {
        this.f36215 = C10010.f30148;
    }

    public C12126(long[] jArr) {
        this.f36215 = jArr;
        this.f36216 = jArr.length;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m29549(long j) {
        long[] jArr = this.f36215;
        int i = this.f36216;
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
        return new C2954(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC11421, l.InterfaceC17105, java.util.List
    public final InterfaceC23455 iterator() {
        return new C2954(this);
    }

    @Override // l.AbstractC11811, l.AbstractC22394, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC15234 spliterator() {
        return new C12831(this);
    }

    @Override // l.InterfaceC11421
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo17071(long j) {
        return m29549(j) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f36216;
    }

    @Override // l.AbstractC11811
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo28873(long j) {
        int iM29549 = m29549(j);
        if (iM29549 == -1) {
            return false;
        }
        int i = (this.f36216 - iM29549) - 1;
        for (int i2 = 0; i2 < i; i2++) {
            long[] jArr = this.f36215;
            int i3 = iM29549 + i2;
            jArr[i3] = jArr[i3 + 1];
        }
        this.f36216--;
        return true;
    }

    @Override // l.AbstractC22394, l.InterfaceC11421
    public final boolean add(long j) {
        if (m29549(j) != -1) {
            return false;
        }
        int i = this.f36216;
        if (i == this.f36215.length) {
            long[] jArr = new long[i == 0 ? 2 : i * 2];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                jArr[i2] = this.f36215[i2];
                i = i2;
            }
            this.f36215 = jArr;
        }
        long[] jArr2 = this.f36215;
        int i3 = this.f36216;
        this.f36216 = i3 + 1;
        jArr2[i3] = j;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f36216 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f36216 == 0;
    }

    public final Object clone() {
        try {
            C12126 c12126 = (C12126) super.clone();
            c12126.f36215 = (long[]) this.f36215.clone();
            return c12126;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        long[] jArr = this.f36215;
        for (int i = 0; i < this.f36216; i++) {
            objectOutputStream.writeLong(jArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long[] jArr = new long[this.f36216];
        this.f36215 = jArr;
        for (int i = 0; i < this.f36216; i++) {
            jArr[i] = objectInputStream.readLong();
        }
    }
}
