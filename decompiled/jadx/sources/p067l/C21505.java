package p067l;

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
public final class C21505 extends AbstractC2793 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ */
    public transient int f67835;

    /* JADX INFO: renamed from: ۙ */
    public transient int f67836;

    /* JADX INFO: renamed from: ۤ */
    public int f67837;

    /* JADX INFO: renamed from: ۫ */
    public transient int f67838;

    /* JADX INFO: renamed from: ۬ */
    public final transient int f67839;

    /* JADX INFO: renamed from: ᩶ */
    public transient char[] f67840;

    /* JADX INFO: renamed from: ᩸ */
    public transient boolean f67841;

    /* JADX INFO: renamed from: ᩹ */
    public final float f67842 = 0.75f;

    @Override // p067l.AbstractC2793, p067l.AbstractC22241, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C21505() {
        int iM34880 = C15322.m34880(0.75f, 16);
        this.f67838 = iM34880;
        this.f67839 = iM34880;
        this.f67836 = iM34880 - 1;
        this.f67835 = C15322.m34887(0.75f, iM34880);
        this.f67840 = new char[this.f67838 + 1];
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48698(long j) {
        int iMin = (int) Math.min(1073741824L, Math.max(2L, C15322.m34883((long) Math.ceil(j / this.f67842))));
        if (iMin > this.f67838) {
            m48700(iMin);
        }
    }

    @Override // p067l.AbstractC22241
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo30205(InterfaceC7838 interfaceC7838) {
        float f = this.f67842;
        if (f <= 0.5d) {
            int iM34880 = C15322.m34880(f, interfaceC7838.size());
            if (iM34880 > this.f67838) {
                m48700(iM34880);
            }
        } else {
            m48698(interfaceC7838.size() + this.f67837);
        }
        return super.mo30205(interfaceC7838);
    }

    @Override // p067l.AbstractC22241, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        float f = this.f67842;
        if (f <= 0.5d) {
            int iM34880 = C15322.m34880(f, collection.size());
            if (iM34880 > this.f67838) {
                m48700(iM34880);
            }
        } else {
            m48698(collection.size() + this.f67837);
        }
        return super.addAll(collection);
    }

    @Override // p067l.AbstractC22241, p067l.InterfaceC7838
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo11023(char c) {
        char c2;
        if (c == 0) {
            if (this.f67841) {
                return false;
            }
            this.f67841 = true;
        } else {
            char[] cArr = this.f67840;
            int iM34881 = C15322.m34881((int) c) & this.f67836;
            char c3 = cArr[iM34881];
            if (c3 != 0) {
                if (c3 == c) {
                    return false;
                }
                do {
                    iM34881 = (iM34881 + 1) & this.f67836;
                    c2 = cArr[iM34881];
                    if (c2 != 0) {
                    }
                } while (c2 != c);
                return false;
            }
            cArr[iM34881] = c;
        }
        int i = this.f67837;
        this.f67837 = i + 1;
        if (i >= this.f67835) {
            m48700(C15322.m34880(this.f67842, i + 2));
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m48699(int i) {
        char c;
        this.f67837--;
        char[] cArr = this.f67840;
        loop0: while (true) {
            int i2 = (i + 1) & this.f67836;
            while (true) {
                c = cArr[i2];
                if (c != 0) {
                    int iM34881 = C15322.m34881((int) c);
                    int i3 = this.f67836;
                    int i4 = iM34881 & i3;
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
        int i5 = this.f67838;
        if (i5 <= this.f67839 || this.f67837 >= this.f67835 / 4 || i5 <= 16) {
            return;
        }
        m48700(i5 / 2);
    }

    @Override // p067l.AbstractC2793
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4381(char c) {
        char c2;
        if (c == 0) {
            if (this.f67841) {
                this.f67841 = false;
                char[] cArr = this.f67840;
                int i = this.f67838;
                cArr[i] = 0;
                int i2 = this.f67837 - 1;
                this.f67837 = i2;
                if (i > this.f67839 && i2 < this.f67835 / 4 && i > 16) {
                    m48700(i / 2);
                }
                return true;
            }
        } else {
            char[] cArr2 = this.f67840;
            int iM34881 = C15322.m34881((int) c) & this.f67836;
            char c3 = cArr2[iM34881];
            if (c3 != 0) {
                if (c == c3) {
                    m48699(iM34881);
                    return true;
                }
                do {
                    iM34881 = (iM34881 + 1) & this.f67836;
                    c2 = cArr2[iM34881];
                    if (c2 == 0) {
                    }
                } while (c != c2);
                m48699(iM34881);
                return true;
            }
        }
        return false;
    }

    @Override // p067l.InterfaceC7838
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo11024(char c) {
        char c2;
        if (c == 0) {
            return this.f67841;
        }
        char[] cArr = this.f67840;
        int iM34881 = C15322.m34881((int) c) & this.f67836;
        char c3 = cArr[iM34881];
        if (c3 == 0) {
            return false;
        }
        if (c != c3) {
            do {
                iM34881 = (iM34881 + 1) & this.f67836;
                c2 = cArr[iM34881];
                if (c2 == 0) {
                    return false;
                }
            } while (c != c2);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f67837 == 0) {
            return;
        }
        this.f67837 = 0;
        this.f67841 = false;
        Arrays.fill(this.f67840, (char) 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f67837;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f67837 == 0;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        C22846 c22846 = new C22846(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f67837;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            objectOutputStream.writeChar(c22846.mo9752());
            i = i2;
        }
    }

    @Override // p067l.AbstractC22241, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C22846(this);
    }

    @Override // p067l.AbstractC22241, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC17480 iterator() {
        return new C22846(this);
    }

    @Override // p067l.AbstractC2793, p067l.AbstractC22241, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC16847 spliterator() {
        return new C23516(this);
    }

    @Override // p067l.AbstractC2793, p067l.AbstractC22241, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC18307 spliterator() {
        return new C23516(this);
    }

    @Override // p067l.AbstractC22241, p067l.InterfaceC11447
    /* JADX INFO: renamed from: ֫ */
    public final void mo12109(InterfaceC24857 interfaceC24857) {
        char[] cArr = this.f67840;
        if (this.f67841) {
            interfaceC24857.mo20276(cArr[this.f67838]);
        }
        int i = this.f67838;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            char c = cArr[i2];
            if (c != 0) {
                interfaceC24857.mo20276(c);
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48700(int i) {
        char c;
        char[] cArr = this.f67840;
        int i2 = i - 1;
        char[] cArr2 = new char[i + 1];
        int i3 = this.f67838;
        int i4 = this.f67841 ? this.f67837 - 1 : this.f67837;
        while (true) {
            int i5 = i4 - 1;
            if (i4 != 0) {
                do {
                    i3--;
                    c = cArr[i3];
                } while (c == 0);
                int iM34881 = C15322.m34881((int) c) & i2;
                if (cArr2[iM34881] != 0) {
                    do {
                        iM34881 = (iM34881 + 1) & i2;
                    } while (cArr2[iM34881] != 0);
                }
                cArr2[iM34881] = cArr[i3];
                i4 = i5;
            } else {
                this.f67838 = i;
                this.f67836 = i2;
                this.f67835 = C15322.m34887(this.f67842, i);
                this.f67840 = cArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C21505 c21505 = (C21505) super.clone();
            c21505.f67840 = (char[]) this.f67840.clone();
            c21505.f67841 = this.f67841;
            return c21505;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // p067l.AbstractC2793, java.util.Collection, java.util.Set
    public final int hashCode() {
        char c;
        char[] cArr = this.f67840;
        int i = this.f67841 ? this.f67837 - 1 : this.f67837;
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
        int iM34881;
        objectInputStream.defaultReadObject();
        int i = this.f67837;
        float f = this.f67842;
        int iM34880 = C15322.m34880(f, i);
        this.f67838 = iM34880;
        this.f67835 = C15322.m34887(f, iM34880);
        int i2 = this.f67838;
        this.f67836 = i2 - 1;
        char[] cArr = new char[i2 + 1];
        this.f67840 = cArr;
        int i3 = this.f67837;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                return;
            }
            char c = objectInputStream.readChar();
            if (c == 0) {
                iM34881 = this.f67838;
                this.f67841 = true;
            } else {
                iM34881 = C15322.m34881((int) c) & this.f67836;
                if (cArr[iM34881] != 0) {
                    do {
                        iM34881 = (iM34881 + 1) & this.f67836;
                    } while (cArr[iM34881] != 0);
                }
            }
            cArr[iM34881] = c;
            i3 = i4;
        }
    }
}
