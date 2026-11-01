package p067l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۤ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12472 extends AbstractC21011 implements Cloneable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ */
    public transient int[] f34906;

    /* JADX INFO: renamed from: ۙ */
    public final float f34907;

    /* JADX INFO: renamed from: ۛ */
    public final transient int f34908;

    /* JADX INFO: renamed from: ۟ */
    public transient InterfaceC3360 f34909;

    /* JADX INFO: renamed from: ۤ */
    public transient int f34910;

    /* JADX INFO: renamed from: ۨ */
    public transient int f34911;

    /* JADX INFO: renamed from: ۫ */
    public transient int f34912;

    /* JADX INFO: renamed from: ۬ */
    public transient InterfaceC13399 f34913;

    /* JADX INFO: renamed from: ܰ */
    public transient int[] f34914;

    /* JADX INFO: renamed from: ᩶ */
    public transient InterfaceC6437 f34915;

    /* JADX INFO: renamed from: ᩹ */
    public transient boolean f34916;

    /* JADX INFO: renamed from: ᩺ */
    public int f34917;

    public C12472(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("The expected number of elements must be nonnegative");
        }
        this.f34907 = 0.75f;
        int iM34880 = C15322.m34880(0.75f, i);
        this.f34911 = iM34880;
        this.f34908 = iM34880;
        this.f34912 = iM34880 - 1;
        this.f34910 = C15322.m34887(0.75f, iM34880);
        int i3 = this.f34911 + 1;
        this.f34906 = new int[i3];
        this.f34914 = new int[i3];
    }

    public C12472() {
        this(16, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ */
    public int m28701(int i) {
        int i2;
        int[] iArr = this.f34914;
        int i3 = iArr[i];
        this.f34917--;
        int[] iArr2 = this.f34906;
        loop0: while (true) {
            int i4 = (i + 1) & this.f34912;
            while (true) {
                i2 = iArr2[i4];
                if (i2 != 0) {
                    int iM34881 = C15322.m34881(i2);
                    int i5 = this.f34912;
                    int i6 = iM34881 & i5;
                    if (i > i4) {
                        if (i >= i6 && i6 > i4) {
                            break;
                        }
                        i4 = (i4 + 1) & i5;
                    } else {
                        if (i >= i6 || i6 > i4) {
                            break;
                        }
                        i4 = (i4 + 1) & i5;
                    }
                } else {
                    break loop0;
                }
            }
            iArr2[i] = i2;
            iArr[i] = iArr[i4];
            i = i4;
        }
        iArr2[i] = 0;
        int i7 = this.f34911;
        if (i7 > this.f34908 && this.f34917 < this.f34910 / 4 && i7 > 16) {
            m28706(i7 / 2);
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷ */
    public int m28702() {
        this.f34916 = false;
        int[] iArr = this.f34914;
        int i = this.f34911;
        int i2 = iArr[i];
        int i3 = this.f34917 - 1;
        this.f34917 = i3;
        if (i > this.f34908 && i3 < this.f34910 / 4 && i > 16) {
            m28706(i / 2);
        }
        return i2;
    }

    @Override // p067l.AbstractC21011, java.util.Map
    public final void putAll(Map map) {
        float f = this.f34907;
        if (f <= 0.5d) {
            int iM34880 = C15322.m34880(f, map.size());
            if (iM34880 > this.f34911) {
                m28706(iM34880);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C15322.m34883((long) Math.ceil((map.size() + this.f34917) / f))));
            if (iMin > this.f34911) {
                m28706(iMin);
            }
        }
        super.putAll(map);
    }

    @Override // p067l.AbstractC20340, p067l.InterfaceC11131
    /* JADX INFO: renamed from: ֫ */
    public final int mo25657(int i, int i2) {
        int i3;
        if (i == 0) {
            i3 = this.f34916 ? this.f34911 : -(this.f34911 + 1);
        } else {
            int[] iArr = this.f34906;
            int iM34881 = C15322.m34881(i) & this.f34912;
            int i4 = iArr[iM34881];
            if (i4 != 0) {
                if (i != i4) {
                    while (true) {
                        iM34881 = (iM34881 + 1) & this.f34912;
                        int i5 = iArr[iM34881];
                        if (i5 == 0) {
                            i3 = -(iM34881 + 1);
                        } else if (i == i5) {
                        }
                    }
                }
                i3 = iM34881;
            } else {
                i3 = -(iM34881 + 1);
            }
        }
        if (i3 < 0) {
            int i6 = (-i3) - 1;
            if (i6 == this.f34911) {
                this.f34916 = true;
            }
            this.f34906[i6] = i;
            this.f34914[i6] = i2;
            int i7 = this.f34917;
            this.f34917 = i7 + 1;
            if (i7 >= this.f34910) {
                m28706(C15322.m34880(this.f34907, i7 + 2));
            }
            return this.f62820;
        }
        int[] iArr2 = this.f34914;
        int i8 = iArr2[i3];
        iArr2[i3] = i2;
        return i8;
    }

    public final int remove(int i) {
        int i2;
        if (i == 0) {
            return this.f34916 ? m28702() : this.f62820;
        }
        int[] iArr = this.f34906;
        int iM34881 = C15322.m34881(i) & this.f34912;
        int i3 = iArr[iM34881];
        if (i3 == 0) {
            return this.f62820;
        }
        if (i == i3) {
            return m28701(iM34881);
        }
        do {
            iM34881 = (iM34881 + 1) & this.f34912;
            i2 = iArr[iM34881];
            if (i2 == 0) {
                return this.f62820;
            }
        } while (i != i2);
        return m28701(iM34881);
    }

    @Override // p067l.InterfaceC11131
    public final int get(int i) {
        int i2;
        if (i == 0) {
            return this.f34916 ? this.f34914[this.f34911] : this.f62820;
        }
        int[] iArr = this.f34906;
        int iM34881 = C15322.m34881(i) & this.f34912;
        int i3 = iArr[iM34881];
        if (i3 == 0) {
            return this.f62820;
        }
        if (i == i3) {
            return this.f34914[iM34881];
        }
        do {
            iM34881 = (iM34881 + 1) & this.f34912;
            i2 = iArr[iM34881];
            if (i2 == 0) {
                return this.f62820;
            }
        } while (i != i2);
        return this.f34914[iM34881];
    }

    @Override // p067l.InterfaceC11131
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo25658(int i) {
        int i2;
        if (i == 0) {
            return this.f34916;
        }
        int[] iArr = this.f34906;
        int iM34881 = C15322.m34881(i) & this.f34912;
        int i3 = iArr[iM34881];
        if (i3 == 0) {
            return false;
        }
        if (i != i3) {
            do {
                iM34881 = (iM34881 + 1) & this.f34912;
                i2 = iArr[iM34881];
                if (i2 == 0) {
                    return false;
                }
            } while (i != i2);
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m28707(int i) {
        int[] iArr = this.f34906;
        int[] iArr2 = this.f34914;
        if (this.f34916 && iArr2[this.f34911] == i) {
            return true;
        }
        int i2 = this.f34911;
        while (true) {
            int i3 = i2 - 1;
            if (i2 == 0) {
                return false;
            }
            if (iArr[i3] != 0 && iArr2[i3] == i) {
                return true;
            }
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m28704(int i) {
        int i2;
        if (i == 0) {
            if (this.f34916) {
                return this.f34914[this.f34911];
            }
            return -1;
        }
        int[] iArr = this.f34906;
        int iM34881 = C15322.m34881(i) & this.f34912;
        int i3 = iArr[iM34881];
        if (i3 == 0) {
            return -1;
        }
        if (i == i3) {
            return this.f34914[iM34881];
        }
        do {
            iM34881 = (iM34881 + 1) & this.f34912;
            i2 = iArr[iM34881];
            if (i2 == 0) {
                return -1;
            }
        } while (i != i2);
        return this.f34914[iM34881];
    }

    @Override // java.util.Map
    public final void clear() {
        if (this.f34917 == 0) {
            return;
        }
        this.f34917 = 0;
        this.f34916 = false;
        Arrays.fill(this.f34906, 0);
    }

    @Override // p067l.InterfaceC11771
    public final int size() {
        return this.f34917;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f34917 == 0;
    }

    @Override // p067l.InterfaceC20519
    /* JADX INFO: renamed from: ۫֫ */
    public final InterfaceC20007 mo28703() {
        if (this.f34915 == null) {
            this.f34915 = new C21860(this);
        }
        return this.f34915;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f34913 == null) {
            this.f34913 = new C17164(this);
        }
        return this.f34913;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f34909 == null) {
            this.f34909 = new C21190(this);
        }
        return this.f34909;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m28705() {
        float f = this.f34917;
        float f2 = this.f34907;
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(((int) Math.ceil(f / f2)) - 1));
        if (iNumberOfLeadingZeros >= this.f34911 || this.f34917 > C15322.m34887(f2, iNumberOfLeadingZeros)) {
            return;
        }
        try {
            m28706(iNumberOfLeadingZeros);
        } catch (OutOfMemoryError unused) {
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m28706(int i) {
        int i2;
        int[] iArr = this.f34906;
        int[] iArr2 = this.f34914;
        int i3 = i - 1;
        int i4 = i + 1;
        int[] iArr3 = new int[i4];
        int[] iArr4 = new int[i4];
        int i5 = this.f34911;
        int i6 = this.f34916 ? this.f34917 - 1 : this.f34917;
        while (true) {
            int i7 = i6 - 1;
            if (i6 != 0) {
                do {
                    i5--;
                    i2 = iArr[i5];
                } while (i2 == 0);
                int iM34881 = C15322.m34881(i2) & i3;
                if (iArr3[iM34881] != 0) {
                    do {
                        iM34881 = (iM34881 + 1) & i3;
                    } while (iArr3[iM34881] != 0);
                }
                iArr3[iM34881] = iArr[i5];
                iArr4[iM34881] = iArr2[i5];
                i6 = i7;
            } else {
                iArr4[i] = iArr2[this.f34911];
                this.f34911 = i;
                this.f34912 = i3;
                this.f34910 = C15322.m34887(this.f34907, i);
                this.f34906 = iArr3;
                this.f34914 = iArr4;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C12472 c12472 = (C12472) super.clone();
            c12472.f34913 = null;
            c12472.f34909 = null;
            c12472.f34915 = null;
            c12472.f34916 = this.f34916;
            c12472.f34906 = (int[]) this.f34906.clone();
            c12472.f34914 = (int[]) this.f34914.clone();
            return c12472;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i;
        int[] iArr = this.f34906;
        int[] iArr2 = this.f34914;
        int i2 = this.f34916 ? this.f34917 - 1 : this.f34917;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i2 - 1;
            if (i2 == 0) {
                break;
            }
            while (true) {
                i = iArr[i4];
                if (i == 0) {
                    i4++;
                }
            }
            i3 += i ^ iArr2[i4];
            i4++;
            i2 = i5;
        }
        return this.f34916 ? i3 + iArr2[this.f34911] : i3;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int[] iArr = this.f34906;
        int[] iArr2 = this.f34914;
        C3083 c3083 = new C3083(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f34917;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            int iM16376 = c3083.m16376();
            objectOutputStream.writeInt(iArr[iM16376]);
            objectOutputStream.writeInt(iArr2[iM16376]);
            i = i2;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        objectInputStream.defaultReadObject();
        int i2 = this.f34917;
        float f = this.f34907;
        int iM34880 = C15322.m34880(f, i2);
        this.f34911 = iM34880;
        this.f34910 = C15322.m34887(f, iM34880);
        int i3 = this.f34911;
        this.f34912 = i3 - 1;
        int[] iArr = new int[i3 + 1];
        this.f34906 = iArr;
        int[] iArr2 = new int[i3 + 1];
        this.f34914 = iArr2;
        int i4 = this.f34917;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            int i6 = objectInputStream.readInt();
            int i7 = objectInputStream.readInt();
            if (i6 == 0) {
                i = this.f34911;
                this.f34916 = true;
            } else {
                int iM34881 = C15322.m34881(i6);
                int i8 = this.f34912;
                while (true) {
                    i = iM34881 & i8;
                    if (iArr[i] != 0) {
                        iM34881 = i + 1;
                        i8 = this.f34912;
                    }
                }
            }
            iArr[i] = i6;
            iArr2[i] = i7;
            i4 = i5;
        }
    }
}
