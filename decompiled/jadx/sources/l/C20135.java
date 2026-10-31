package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.᩶ۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C1E */
/* JADX INFO: loaded from: classes5.dex */
public final class C20135 extends AbstractC0447 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient int f65196;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public transient int f65197;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f65198;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient int f65199;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final transient int f65200;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient char[] f65201;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient boolean f65202;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final float f65203 = 0.75f;

    @Override // l.AbstractC0447, l.AbstractC20910, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C20135() {
        int iM32765 = C13630.m32765(0.75f, 16);
        this.f65199 = iM32765;
        this.f65200 = iM32765;
        this.f65197 = iM32765 - 1;
        this.f65196 = C13630.m32772(0.75f, iM32765);
        this.f65201 = new char[this.f65199 + 1];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m46382(long j) {
        int iMin = (int) Math.min(1073741824L, Math.max(2L, C13630.m32768((long) Math.ceil(j / this.f65203))));
        if (iMin > this.f65199) {
            m46384(iMin);
        }
    }

    @Override // l.AbstractC20910
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo28161(InterfaceC5755 interfaceC5755) {
        float f = this.f65203;
        if (f <= 0.5d) {
            int iM32765 = C13630.m32765(f, interfaceC5755.size());
            if (iM32765 > this.f65199) {
                m46384(iM32765);
            }
        } else {
            m46382(interfaceC5755.size() + this.f65198);
        }
        return super.mo28161(interfaceC5755);
    }

    @Override // l.AbstractC20910, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        float f = this.f65203;
        if (f <= 0.5d) {
            int iM32765 = C13630.m32765(f, collection.size());
            if (iM32765 > this.f65199) {
                m46384(iM32765);
            }
        } else {
            m46382(collection.size() + this.f65198);
        }
        return super.addAll(collection);
    }

    @Override // l.AbstractC20910, l.InterfaceC5755
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo8955(char c) {
        char c2;
        if (c == 0) {
            if (this.f65202) {
                return false;
            }
            this.f65202 = true;
        } else {
            char[] cArr = this.f65201;
            int iM32766 = C13630.m32766((int) c) & this.f65197;
            char c3 = cArr[iM32766];
            if (c3 != 0) {
                if (c3 == c) {
                    return false;
                }
                do {
                    iM32766 = (iM32766 + 1) & this.f65197;
                    c2 = cArr[iM32766];
                    if (c2 != 0) {
                    }
                } while (c2 != c);
                return false;
            }
            cArr[iM32766] = c;
        }
        int i = this.f65198;
        this.f65198 = i + 1;
        if (i >= this.f65196) {
            m46384(C13630.m32765(this.f65203, i + 2));
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m46383(int i) {
        char c;
        this.f65198--;
        char[] cArr = this.f65201;
        loop0: while (true) {
            int i2 = (i + 1) & this.f65197;
            while (true) {
                c = cArr[i2];
                if (c != 0) {
                    int iM32766 = C13630.m32766((int) c);
                    int i3 = this.f65197;
                    int i4 = iM32766 & i3;
                    if (i > i2) {
                        if (i >= i4 && i4 > i2) {
                            break;
                        } else {
                            i2 = (i2 + 1) & i3;
                        }
                    } else if (i >= i4 || i4 > i2) {
                        break;
                    } else {
                        i2 = (i2 + 1) & i3;
                    }
                } else {
                    break loop0;
                }
            }
            cArr[i] = c;
            i = i2;
        }
        cArr[i] = 0;
        int i5 = this.f65199;
        if (i5 <= this.f65200 || this.f65198 >= this.f65196 / 4 || i5 <= 16) {
            return;
        }
        m46384(i5 / 2);
    }

    @Override // l.AbstractC0447
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2004(char c) {
        char c2;
        if (c == 0) {
            if (this.f65202) {
                this.f65202 = false;
                char[] cArr = this.f65201;
                int i = this.f65199;
                cArr[i] = 0;
                int i2 = this.f65198 - 1;
                this.f65198 = i2;
                if (i > this.f65200 && i2 < this.f65196 / 4 && i > 16) {
                    m46384(i / 2);
                }
                return true;
            }
        } else {
            char[] cArr2 = this.f65201;
            int iM32766 = C13630.m32766((int) c) & this.f65197;
            char c3 = cArr2[iM32766];
            if (c3 != 0) {
                if (c == c3) {
                    m46383(iM32766);
                    return true;
                }
                do {
                    iM32766 = (iM32766 + 1) & this.f65197;
                    c2 = cArr2[iM32766];
                    if (c2 == 0) {
                    }
                } while (c != c2);
                m46383(iM32766);
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC5755
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo8956(char c) {
        char c2;
        if (c == 0) {
            return this.f65202;
        }
        char[] cArr = this.f65201;
        int iM32766 = C13630.m32766((int) c) & this.f65197;
        char c3 = cArr[iM32766];
        if (c3 == 0) {
            return false;
        }
        if (c != c3) {
            do {
                iM32766 = (iM32766 + 1) & this.f65197;
                c2 = cArr[iM32766];
                if (c2 == 0) {
                    return false;
                }
            } while (c != c2);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f65198 == 0) {
            return;
        }
        this.f65198 = 0;
        this.f65202 = false;
        Arrays.fill(this.f65201, (char) 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f65198;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f65198 == 0;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        C21546 c21546 = new C21546(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f65198;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            objectOutputStream.writeChar(c21546.mo7691());
            i = i2;
        }
    }

    @Override // l.AbstractC20910, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C21546(this);
    }

    @Override // l.AbstractC20910, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC15900 iterator() {
        return new C21546(this);
    }

    @Override // l.AbstractC0447, l.AbstractC20910, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC15234 spliterator() {
        return new C22251(this);
    }

    @Override // l.AbstractC0447, l.AbstractC20910, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC16770 spliterator() {
        return new C22251(this);
    }

    @Override // l.AbstractC20910, l.InterfaceC9552
    /* JADX INFO: renamed from: ֫ */
    public final void mo10076(InterfaceC23662 interfaceC23662) {
        char[] cArr = this.f65201;
        if (this.f65202) {
            interfaceC23662.mo18328(cArr[this.f65199]);
        }
        int i = this.f65199;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            char c = cArr[i2];
            if (c != 0) {
                interfaceC23662.mo18328(c);
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46384(int i) {
        char c;
        char[] cArr = this.f65201;
        int i2 = i - 1;
        char[] cArr2 = new char[i + 1];
        int i3 = this.f65199;
        int i4 = this.f65202 ? this.f65198 - 1 : this.f65198;
        while (true) {
            int i5 = i4 - 1;
            if (i4 != 0) {
                do {
                    i3--;
                    c = cArr[i3];
                } while (c == 0);
                int iM32766 = C13630.m32766((int) c) & i2;
                if (cArr2[iM32766] != 0) {
                    do {
                        iM32766 = (iM32766 + 1) & i2;
                    } while (cArr2[iM32766] != 0);
                }
                cArr2[iM32766] = cArr[i3];
                i4 = i5;
            } else {
                this.f65199 = i;
                this.f65197 = i2;
                this.f65196 = C13630.m32772(this.f65203, i);
                this.f65201 = cArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C20135 c20135 = (C20135) super.clone();
            c20135.f65201 = (char[]) this.f65201.clone();
            c20135.f65202 = this.f65202;
            return c20135;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // l.AbstractC0447, java.util.Collection, java.util.Set
    public final int hashCode() {
        char c;
        char[] cArr = this.f65201;
        int i = this.f65202 ? this.f65198 - 1 : this.f65198;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i - 1;
            if (i == 0) {
                return i2;
            }
            while (true) {
                c = cArr[i3];
                if (c == 0) {
                    i3++;
                }
            }
            i2 += c;
            i3++;
            i = i4;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int iM32766;
        objectInputStream.defaultReadObject();
        int i = this.f65198;
        float f = this.f65203;
        int iM32765 = C13630.m32765(f, i);
        this.f65199 = iM32765;
        this.f65196 = C13630.m32772(f, iM32765);
        int i2 = this.f65199;
        this.f65197 = i2 - 1;
        char[] cArr = new char[i2 + 1];
        this.f65201 = cArr;
        int i3 = this.f65198;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                return;
            }
            char c = objectInputStream.readChar();
            if (c == 0) {
                iM32766 = this.f65199;
                this.f65202 = true;
            } else {
                iM32766 = C13630.m32766((int) c) & this.f65197;
                if (cArr[iM32766] != 0) {
                    do {
                        iM32766 = (iM32766 + 1) & this.f65197;
                    } while (cArr[iM32766] != 0);
                }
            }
            cArr[iM32766] = c;
            i3 = i4;
        }
    }
}
