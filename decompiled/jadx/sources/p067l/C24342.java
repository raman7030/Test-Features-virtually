package p067l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.᩺ܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6E */
/* JADX INFO: loaded from: classes2.dex */
public final class C24342 extends AbstractC23002 implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᩸ */
    public transient float[] f77106;

    /* JADX INFO: renamed from: ᩹ */
    public int f77107;

    @Override // p067l.AbstractC23002, p067l.AbstractC6238, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C24342() {
        this.f77106 = C15624.f44707;
    }

    public C24342(float[] fArr) {
        this.f77106 = fArr;
        this.f77107 = fArr.length;
    }

    /* JADX INFO: renamed from: ܽ */
    private int m53704(float f) {
        float[] fArr = this.f77106;
        int i = this.f77107;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return -1;
            }
            if (Float.floatToRawIntBits(fArr[i2]) == Float.floatToRawIntBits(f)) {
                return i2;
            }
            i = i2;
        }
    }

    @Override // p067l.AbstractC6238, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C8249(this);
    }

    @Override // p067l.AbstractC6238, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final InterfaceC3595 iterator() {
        return new C8249(this);
    }

    @Override // p067l.AbstractC23002, p067l.AbstractC6238, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC16847 spliterator() {
        return new C13614(this);
    }

    @Override // p067l.AbstractC23002, p067l.AbstractC6238, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC18327 spliterator() {
        return new C13614(this);
    }

    @Override // p067l.InterfaceC12984
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo18969(float f) {
        return m53704(f) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f77107;
    }

    @Override // p067l.AbstractC23002
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo51392(float f) {
        int iM53704 = m53704(f);
        if (iM53704 == -1) {
            return false;
        }
        int i = (this.f77107 - iM53704) - 1;
        for (int i2 = 0; i2 < i; i2++) {
            float[] fArr = this.f77106;
            int i3 = iM53704 + i2;
            fArr[i3] = fArr[i3 + 1];
        }
        this.f77107--;
        return true;
    }

    @Override // p067l.AbstractC6238, p067l.InterfaceC12984
    public final boolean add(float f) {
        if (m53704(f) != -1) {
            return false;
        }
        int i = this.f77107;
        if (i == this.f77106.length) {
            float[] fArr = new float[i == 0 ? 2 : i * 2];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                fArr[i2] = this.f77106[i2];
                i = i2;
            }
            this.f77106 = fArr;
        }
        float[] fArr2 = this.f77106;
        int i3 = this.f77107;
        this.f77107 = i3 + 1;
        fArr2[i3] = f;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f77107 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f77107 == 0;
    }

    public final Object clone() {
        try {
            C24342 c24342 = (C24342) super.clone();
            c24342.f77106 = (float[]) this.f77106.clone();
            return c24342;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        float[] fArr = this.f77106;
        for (int i = 0; i < this.f77107; i++) {
            objectOutputStream.writeFloat(fArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        float[] fArr = new float[this.f77107];
        this.f77106 = fArr;
        for (int i = 0; i < this.f77107; i++) {
            fArr[i] = objectInputStream.readFloat();
        }
    }
}
