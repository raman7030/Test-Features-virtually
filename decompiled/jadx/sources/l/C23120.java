package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.᩺ܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6E */
/* JADX INFO: loaded from: classes2.dex */
public final class C23120 extends AbstractC21710 implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient float[] f74362;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f74363;

    @Override // l.AbstractC21710, l.AbstractC4071, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C23120() {
        this.f74362 = C13947.f41626;
    }

    public C23120(float[] fArr) {
        this.f74362 = fArr;
        this.f74363 = fArr.length;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m51310(float f) {
        float[] fArr = this.f74362;
        int i = this.f74363;
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

    @Override // l.AbstractC4071, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C6187(this);
    }

    @Override // l.AbstractC4071, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final InterfaceC1290 iterator() {
        return new C6187(this);
    }

    @Override // l.AbstractC21710, l.AbstractC4071, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC15234 spliterator() {
        return new C11832(this);
    }

    @Override // l.AbstractC21710, l.AbstractC4071, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC16791 spliterator() {
        return new C11832(this);
    }

    @Override // l.InterfaceC11169
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo17038(float f) {
        return m51310(f) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f74363;
    }

    @Override // l.AbstractC21710
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo49043(float f) {
        int iM51310 = m51310(f);
        if (iM51310 == -1) {
            return false;
        }
        int i = (this.f74363 - iM51310) - 1;
        for (int i2 = 0; i2 < i; i2++) {
            float[] fArr = this.f74362;
            int i3 = iM51310 + i2;
            fArr[i3] = fArr[i3 + 1];
        }
        this.f74363--;
        return true;
    }

    @Override // l.AbstractC4071, l.InterfaceC11169
    public final boolean add(float f) {
        if (m51310(f) != -1) {
            return false;
        }
        int i = this.f74363;
        if (i == this.f74362.length) {
            float[] fArr = new float[i == 0 ? 2 : i * 2];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                fArr[i2] = this.f74362[i2];
                i = i2;
            }
            this.f74362 = fArr;
        }
        float[] fArr2 = this.f74362;
        int i3 = this.f74363;
        this.f74363 = i3 + 1;
        fArr2[i3] = f;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f74363 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f74363 == 0;
    }

    public final Object clone() {
        try {
            C23120 c23120 = (C23120) super.clone();
            c23120.f74362 = (float[]) this.f74362.clone();
            return c23120;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        float[] fArr = this.f74362;
        for (int i = 0; i < this.f74363; i++) {
            objectOutputStream.writeFloat(fArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        float[] fArr = new float[this.f74363];
        this.f74362 = fArr;
        for (int i = 0; i < this.f74363; i++) {
            fArr[i] = objectInputStream.readFloat();
        }
    }
}
