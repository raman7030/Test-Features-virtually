package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۗ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1DS */
/* JADX INFO: loaded from: classes3.dex */
public final class C2933 extends AbstractC0447 implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient char[] f9330;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f9331;

    @Override // l.AbstractC0447, l.AbstractC20910, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C2933() {
        this.f9330 = C12810.f38455;
    }

    public C2933(char[] cArr) {
        this.f9330 = cArr;
        this.f9331 = cArr.length;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m8954(char c) {
        char[] cArr = this.f9330;
        int i = this.f9331;
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

    @Override // l.AbstractC20910, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C19867(this);
    }

    @Override // l.AbstractC20910, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC15900 iterator() {
        return new C19867(this);
    }

    @Override // l.AbstractC0447, l.AbstractC20910, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC15234 spliterator() {
        return new C4344(this);
    }

    @Override // l.AbstractC0447, l.AbstractC20910, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC16770 spliterator() {
        return new C4344(this);
    }

    @Override // l.InterfaceC5755
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean mo8956(char c) {
        return m8954(c) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f9331;
    }

    @Override // l.AbstractC0447
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2004(char c) {
        int iM8954 = m8954(c);
        if (iM8954 == -1) {
            return false;
        }
        int i = (this.f9331 - iM8954) - 1;
        for (int i2 = 0; i2 < i; i2++) {
            char[] cArr = this.f9330;
            int i3 = iM8954 + i2;
            cArr[i3] = cArr[i3 + 1];
        }
        this.f9331--;
        return true;
    }

    @Override // l.AbstractC20910, l.InterfaceC5755
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo8955(char c) {
        if (m8954(c) != -1) {
            return false;
        }
        int i = this.f9331;
        if (i == this.f9330.length) {
            char[] cArr = new char[i == 0 ? 2 : i * 2];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                cArr[i2] = this.f9330[i2];
                i = i2;
            }
            this.f9330 = cArr;
        }
        char[] cArr2 = this.f9330;
        int i3 = this.f9331;
        this.f9331 = i3 + 1;
        cArr2[i3] = c;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f9331 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f9331 == 0;
    }

    public final Object clone() {
        try {
            C2933 c2933 = (C2933) super.clone();
            c2933.f9330 = (char[]) this.f9330.clone();
            return c2933;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        char[] cArr = this.f9330;
        for (int i = 0; i < this.f9331; i++) {
            objectOutputStream.writeChar(cArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        char[] cArr = new char[this.f9331];
        this.f9330 = cArr;
        for (int i = 0; i < this.f9331; i++) {
            cArr[i] = objectInputStream.readChar();
        }
    }
}
