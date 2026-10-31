package l;

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
public final class C10630 extends AbstractC19615 implements Cloneable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient int[] f31934;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float f31935;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final transient int f31936;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public transient InterfaceC1043 f31937;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public transient int f31938;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public transient int f31939;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient int f31940;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public transient InterfaceC11606 f31941;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient int[] f31942;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC4280 f31943;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient boolean f31944;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f31945;

    public C10630(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("The expected number of elements must be nonnegative");
        }
        this.f31935 = 0.75f;
        int iM32765 = C13630.m32765(0.75f, i);
        this.f31939 = iM32765;
        this.f31936 = iM32765;
        this.f31940 = iM32765 - 1;
        this.f31938 = C13630.m32772(0.75f, iM32765);
        int i3 = this.f31939 + 1;
        this.f31934 = new int[i3];
        this.f31942 = new int[i3];
    }

    public C10630() {
        this(16, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int m26661(int i) {
        int i2;
        int[] iArr = this.f31942;
        int i3 = iArr[i];
        this.f31945--;
        int[] iArr2 = this.f31934;
        loop0: while (true) {
            int i4 = (i + 1) & this.f31940;
            while (true) {
                i2 = iArr2[i4];
                if (i2 != 0) {
                    int iM32766 = C13630.m32766(i2);
                    int i5 = this.f31940;
                    int i6 = iM32766 & i5;
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
        int i7 = this.f31939;
        if (i7 > this.f31936 && this.f31945 < this.f31938 / 4 && i7 > 16) {
            m26666(i7 / 2);
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int m26662() {
        this.f31944 = false;
        int[] iArr = this.f31942;
        int i = this.f31939;
        int i2 = iArr[i];
        int i3 = this.f31945 - 1;
        this.f31945 = i3;
        if (i > this.f31936 && i3 < this.f31938 / 4 && i > 16) {
            m26666(i / 2);
        }
        return i2;
    }

    @Override // l.AbstractC19615, java.util.Map
    public final void putAll(Map map) {
        float f = this.f31935;
        if (f <= 0.5d) {
            int iM32765 = C13630.m32765(f, map.size());
            if (iM32765 > this.f31939) {
                m26666(iM32765);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C13630.m32768((long) Math.ceil((map.size() + this.f31945) / f))));
            if (iMin > this.f31939) {
                m26666(iMin);
            }
        }
        super.putAll(map);
    }

    @Override // l.AbstractC18909, l.InterfaceC9219
    /* JADX INFO: renamed from: ֫ */
    public final int mo23658(int i, int i2) {
        int i3;
        if (i == 0) {
            i3 = this.f31944 ? this.f31939 : -(this.f31939 + 1);
        } else {
            int[] iArr = this.f31934;
            int iM32766 = C13630.m32766(i) & this.f31940;
            int i4 = iArr[iM32766];
            if (i4 != 0) {
                if (i != i4) {
                    while (true) {
                        iM32766 = (iM32766 + 1) & this.f31940;
                        int i5 = iArr[iM32766];
                        if (i5 == 0) {
                            i3 = -(iM32766 + 1);
                        } else if (i == i5) {
                        }
                    }
                }
                i3 = iM32766;
            } else {
                i3 = -(iM32766 + 1);
            }
        }
        if (i3 < 0) {
            int i6 = (-i3) - 1;
            if (i6 == this.f31939) {
                this.f31944 = true;
            }
            this.f31934[i6] = i;
            this.f31942[i6] = i2;
            int i7 = this.f31945;
            this.f31945 = i7 + 1;
            if (i7 >= this.f31938) {
                m26666(C13630.m32765(this.f31935, i7 + 2));
            }
            return this.f59590;
        }
        int[] iArr2 = this.f31942;
        int i8 = iArr2[i3];
        iArr2[i3] = i2;
        return i8;
    }

    public final int remove(int i) {
        int i2;
        if (i == 0) {
            return this.f31944 ? m26662() : this.f59590;
        }
        int[] iArr = this.f31934;
        int iM32766 = C13630.m32766(i) & this.f31940;
        int i3 = iArr[iM32766];
        if (i3 == 0) {
            return this.f59590;
        }
        if (i == i3) {
            return m26661(iM32766);
        }
        do {
            iM32766 = (iM32766 + 1) & this.f31940;
            i2 = iArr[iM32766];
            if (i2 == 0) {
                return this.f59590;
            }
        } while (i != i2);
        return m26661(iM32766);
    }

    @Override // l.InterfaceC9219
    public final int get(int i) {
        int i2;
        if (i == 0) {
            return this.f31944 ? this.f31942[this.f31939] : this.f59590;
        }
        int[] iArr = this.f31934;
        int iM32766 = C13630.m32766(i) & this.f31940;
        int i3 = iArr[iM32766];
        if (i3 == 0) {
            return this.f59590;
        }
        if (i == i3) {
            return this.f31942[iM32766];
        }
        do {
            iM32766 = (iM32766 + 1) & this.f31940;
            i2 = iArr[iM32766];
            if (i2 == 0) {
                return this.f59590;
            }
        } while (i != i2);
        return this.f31942[iM32766];
    }

    @Override // l.InterfaceC9219
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo23659(int i) {
        int i2;
        if (i == 0) {
            return this.f31944;
        }
        int[] iArr = this.f31934;
        int iM32766 = C13630.m32766(i) & this.f31940;
        int i3 = iArr[iM32766];
        if (i3 == 0) {
            return false;
        }
        if (i != i3) {
            do {
                iM32766 = (iM32766 + 1) & this.f31940;
                i2 = iArr[iM32766];
                if (i2 == 0) {
                    return false;
                }
            } while (i != i2);
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m26667(int i) {
        int[] iArr = this.f31934;
        int[] iArr2 = this.f31942;
        if (this.f31944 && iArr2[this.f31939] == i) {
            return true;
        }
        int i2 = this.f31939;
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

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m26664(int i) {
        int i2;
        if (i == 0) {
            if (this.f31944) {
                return this.f31942[this.f31939];
            }
            return -1;
        }
        int[] iArr = this.f31934;
        int iM32766 = C13630.m32766(i) & this.f31940;
        int i3 = iArr[iM32766];
        if (i3 == 0) {
            return -1;
        }
        if (i == i3) {
            return this.f31942[iM32766];
        }
        do {
            iM32766 = (iM32766 + 1) & this.f31940;
            i2 = iArr[iM32766];
            if (i2 == 0) {
                return -1;
            }
        } while (i != i2);
        return this.f31942[iM32766];
    }

    @Override // java.util.Map
    public final void clear() {
        if (this.f31945 == 0) {
            return;
        }
        this.f31945 = 0;
        this.f31944 = false;
        Arrays.fill(this.f31934, 0);
    }

    @Override // l.InterfaceC9893
    public final int size() {
        return this.f31945;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f31945 == 0;
    }

    @Override // l.InterfaceC19097
    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18559 mo26663() {
        if (this.f31943 == null) {
            this.f31943 = new C20508(this);
        }
        return this.f31943;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f31941 == null) {
            this.f31941 = new C15567(this);
        }
        return this.f31941;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f31937 == null) {
            this.f31937 = new C19803(this);
        }
        return this.f31937;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m26665() {
        float f = this.f31945;
        float f2 = this.f31935;
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(((int) Math.ceil(f / f2)) - 1));
        if (iNumberOfLeadingZeros >= this.f31939 || this.f31945 > C13630.m32772(f2, iNumberOfLeadingZeros)) {
            return;
        }
        try {
            m26666(iNumberOfLeadingZeros);
        } catch (OutOfMemoryError unused) {
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m26666(int i) {
        int i2;
        int[] iArr = this.f31934;
        int[] iArr2 = this.f31942;
        int i3 = i - 1;
        int i4 = i + 1;
        int[] iArr3 = new int[i4];
        int[] iArr4 = new int[i4];
        int i5 = this.f31939;
        int i6 = this.f31944 ? this.f31945 - 1 : this.f31945;
        while (true) {
            int i7 = i6 - 1;
            if (i6 != 0) {
                do {
                    i5--;
                    i2 = iArr[i5];
                } while (i2 == 0);
                int iM32766 = C13630.m32766(i2) & i3;
                if (iArr3[iM32766] != 0) {
                    do {
                        iM32766 = (iM32766 + 1) & i3;
                    } while (iArr3[iM32766] != 0);
                }
                iArr3[iM32766] = iArr[i5];
                iArr4[iM32766] = iArr2[i5];
                i6 = i7;
            } else {
                iArr4[i] = iArr2[this.f31939];
                this.f31939 = i;
                this.f31940 = i3;
                this.f31938 = C13630.m32772(this.f31935, i);
                this.f31934 = iArr3;
                this.f31942 = iArr4;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C10630 c10630 = (C10630) super.clone();
            c10630.f31941 = null;
            c10630.f31937 = null;
            c10630.f31943 = null;
            c10630.f31944 = this.f31944;
            c10630.f31934 = (int[]) this.f31934.clone();
            c10630.f31942 = (int[]) this.f31942.clone();
            return c10630;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i;
        int[] iArr = this.f31934;
        int[] iArr2 = this.f31942;
        int i2 = this.f31944 ? this.f31945 - 1 : this.f31945;
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
        return this.f31944 ? i3 + iArr2[this.f31939] : i3;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int[] iArr = this.f31934;
        int[] iArr2 = this.f31942;
        C0751 c0751 = new C0751(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f31945;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            int iM14472 = c0751.m14472();
            objectOutputStream.writeInt(iArr[iM14472]);
            objectOutputStream.writeInt(iArr2[iM14472]);
            i = i2;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        objectInputStream.defaultReadObject();
        int i2 = this.f31945;
        float f = this.f31935;
        int iM32765 = C13630.m32765(f, i2);
        this.f31939 = iM32765;
        this.f31938 = C13630.m32772(f, iM32765);
        int i3 = this.f31939;
        this.f31940 = i3 - 1;
        int[] iArr = new int[i3 + 1];
        this.f31934 = iArr;
        int[] iArr2 = new int[i3 + 1];
        this.f31942 = iArr2;
        int i4 = this.f31945;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            int i6 = objectInputStream.readInt();
            int i7 = objectInputStream.readInt();
            if (i6 == 0) {
                i = this.f31939;
                this.f31944 = true;
            } else {
                int iM32766 = C13630.m32766(i6);
                int i8 = this.f31940;
                while (true) {
                    i = iM32766 & i8;
                    if (iArr[i] != 0) {
                        iM32766 = i + 1;
                        i8 = this.f31940;
                    }
                }
            }
            iArr[i] = i6;
            iArr2[i] = i7;
            i4 = i5;
        }
    }
}
