package l;

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
public final class C18683 extends AbstractC6208 implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient int[] f59086;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f59087;

    @Override // l.AbstractC6208, l.AbstractC21731, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C18683() {
        this.f59086 = C19389.f62753;
    }

    public C18683(int i) {
        this.f59086 = new int[i];
    }

    public C18683(int[] iArr) {
        this.f59086 = iArr;
        this.f59087 = iArr.length;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m43297(int i) {
        int[] iArr = this.f59086;
        int i2 = this.f59087;
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

    @Override // l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2455(this);
    }

    @Override // l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC6667 iterator() {
        return new C2455(this);
    }

    @Override // l.AbstractC6208, l.AbstractC21731, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC15234 spliterator() {
        return new C3866(this);
    }

    @Override // l.AbstractC6208, l.AbstractC21731, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC16749 spliterator() {
        return new C3866(this);
    }

    @Override // l.InterfaceC1043
    public final boolean contains(int i) {
        return m43297(i) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f59087;
    }

    @Override // l.AbstractC6208
    public final boolean remove(int i) {
        int iM43297 = m43297(i);
        if (iM43297 == -1) {
            return false;
        }
        int i2 = (this.f59087 - iM43297) - 1;
        for (int i3 = 0; i3 < i2; i3++) {
            int[] iArr = this.f59086;
            int i4 = iM43297 + i3;
            iArr[i4] = iArr[i4 + 1];
        }
        this.f59087--;
        return true;
    }

    @Override // l.AbstractC21731, l.InterfaceC1043
    public final boolean add(int i) {
        if (m43297(i) != -1) {
            return false;
        }
        int i2 = this.f59087;
        if (i2 == this.f59086.length) {
            int[] iArr = new int[i2 == 0 ? 2 : i2 * 2];
            while (true) {
                int i3 = i2 - 1;
                if (i2 == 0) {
                    break;
                }
                iArr[i3] = this.f59086[i3];
                i2 = i3;
            }
            this.f59086 = iArr;
        }
        int[] iArr2 = this.f59086;
        int i4 = this.f59087;
        this.f59087 = i4 + 1;
        iArr2[i4] = i;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f59087 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f59087 == 0;
    }

    @Override // l.AbstractC21731, l.InterfaceC1043
    /* JADX INFO: renamed from: ܶ */
    public final int[] mo3586() {
        int i = this.f59087;
        return i == 0 ? C19389.f62753 : Arrays.copyOf(this.f59086, i);
    }

    public final Object clone() {
        try {
            C18683 c18683 = (C18683) super.clone();
            c18683.f59086 = (int[]) this.f59086.clone();
            return c18683;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int[] iArr = this.f59086;
        for (int i = 0; i < this.f59087; i++) {
            objectOutputStream.writeInt(iArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int[] iArr = new int[this.f59087];
        this.f59086 = iArr;
        for (int i = 0; i < this.f59087; i++) {
            iArr[i] = objectInputStream.readInt();
        }
    }
}
