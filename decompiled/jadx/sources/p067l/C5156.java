package p067l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۗ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1DS */
/* JADX INFO: loaded from: classes3.dex */
public final class C5156 extends AbstractC2793 implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᩸ */
    public transient char[] f12129;

    /* JADX INFO: renamed from: ᩹ */
    public int f12130;

    @Override // p067l.AbstractC2793, p067l.AbstractC22241, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C5156() {
        this.f12129 = C14543.f41497;
    }

    public C5156(char[] cArr) {
        this.f12129 = cArr;
        this.f12130 = cArr.length;
    }

    /* JADX INFO: renamed from: ܽ */
    private int m11022(char c) {
        char[] cArr = this.f12129;
        int i = this.f12130;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return -1;
            }
            if (cArr[i2] == c) {
                return i2;
            }
            i = i2;
        }
    }

    @Override // p067l.AbstractC22241, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C21250(this);
    }

    @Override // p067l.AbstractC22241, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC17480 iterator() {
        return new C21250(this);
    }

    @Override // p067l.AbstractC2793, p067l.AbstractC22241, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC16847 spliterator() {
        return new C6497(this);
    }

    @Override // p067l.AbstractC2793, p067l.AbstractC22241, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC18307 spliterator() {
        return new C6497(this);
    }

    @Override // p067l.InterfaceC7838
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo11024(char c) {
        return m11022(c) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f12130;
    }

    @Override // p067l.AbstractC2793
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4381(char c) {
        int iM11022 = m11022(c);
        if (iM11022 == -1) {
            return false;
        }
        int i = (this.f12130 - iM11022) - 1;
        for (int i2 = 0; i2 < i; i2++) {
            char[] cArr = this.f12129;
            int i3 = iM11022 + i2;
            cArr[i3] = cArr[i3 + 1];
        }
        this.f12130--;
        return true;
    }

    @Override // p067l.AbstractC22241, p067l.InterfaceC7838
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo11023(char c) {
        if (m11022(c) != -1) {
            return false;
        }
        int i = this.f12130;
        if (i == this.f12129.length) {
            char[] cArr = new char[i == 0 ? 2 : i * 2];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                cArr[i2] = this.f12129[i2];
                i = i2;
            }
            this.f12129 = cArr;
        }
        char[] cArr2 = this.f12129;
        int i3 = this.f12130;
        this.f12130 = i3 + 1;
        cArr2[i3] = c;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f12130 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f12130 == 0;
    }

    public final Object clone() {
        try {
            C5156 c5156 = (C5156) super.clone();
            c5156.f12129 = (char[]) this.f12129.clone();
            return c5156;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        char[] cArr = this.f12129;
        for (int i = 0; i < this.f12130; i++) {
            objectOutputStream.writeChar(cArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        char[] cArr = new char[this.f12130];
        this.f12129 = cArr;
        for (int i = 0; i < this.f12130; i++) {
            cArr[i] = objectInputStream.readChar();
        }
    }
}
