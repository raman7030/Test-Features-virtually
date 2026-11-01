package p067l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۚܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7519 extends AbstractC17656 implements Cloneable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ */
    public transient int f19737;

    /* JADX INFO: renamed from: ۙ */
    public transient InterfaceC13399 f19738;

    /* JADX INFO: renamed from: ۛ */
    public int f19739;

    /* JADX INFO: renamed from: ۤ */
    public transient int f19740;

    /* JADX INFO: renamed from: ۨ */
    public transient byte[] f19741;

    /* JADX INFO: renamed from: ۫ */
    public final transient int f19742;

    /* JADX INFO: renamed from: ۬ */
    public transient int f19743;

    /* JADX INFO: renamed from: ᩶ */
    public transient int[] f19744;

    /* JADX INFO: renamed from: ᩸ */
    public transient boolean f19745;

    /* JADX INFO: renamed from: ᩹ */
    public transient InterfaceC18247 f19746;

    /* JADX INFO: renamed from: ᩺ */
    public transient InterfaceC10429 f19747;

    public C7519() {
        int iM34880 = C15322.m34880(0.75f, 16);
        this.f19740 = iM34880;
        this.f19742 = iM34880;
        this.f19737 = iM34880 - 1;
        this.f19743 = C15322.m34887(0.75f, iM34880);
        int i = this.f19740 + 1;
        this.f19744 = new int[i];
        this.f19741 = new byte[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ */
    public byte m17418(int i) {
        int i2;
        byte[] bArr = this.f19741;
        byte b = bArr[i];
        this.f19739--;
        int[] iArr = this.f19744;
        loop0: while (true) {
            int i3 = (i + 1) & this.f19737;
            while (true) {
                i2 = iArr[i3];
                if (i2 != 0) {
                    int iM34881 = C15322.m34881(i2);
                    int i4 = this.f19737;
                    int i5 = iM34881 & i4;
                    if (i > i3) {
                        if (i >= i5 && i5 > i3) {
                            break;
                        }
                        i3 = (i3 + 1) & i4;
                    } else {
                        if (i >= i5 || i5 > i3) {
                            break;
                        }
                        i3 = (i3 + 1) & i4;
                    }
                } else {
                    break loop0;
                }
            }
            iArr[i] = i2;
            bArr[i] = bArr[i3];
            i = i3;
        }
        iArr[i] = 0;
        int i6 = this.f19740;
        if (i6 > this.f19742 && this.f19739 < this.f19743 / 4 && i6 > 16) {
            m17424(i6 / 2);
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public byte m17415() {
        this.f19745 = false;
        byte[] bArr = this.f19741;
        int i = this.f19740;
        byte b = bArr[i];
        int i2 = this.f19739 - 1;
        this.f19739 = i2;
        if (i > this.f19742 && i2 < this.f19743 / 4 && i > 16) {
            m17424(i / 2);
        }
        return b;
    }

    @Override // p067l.AbstractC17656, java.util.Map
    public final void putAll(Map map) {
        if (0.75f <= 0.5d) {
            int iM34880 = C15322.m34880(0.75f, map.size());
            if (iM34880 > this.f19740) {
                m17424(iM34880);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C15322.m34883((long) Math.ceil((map.size() + this.f19739) / 0.75f))));
            if (iMin > this.f19740) {
                m17424(iMin);
            }
        }
        super.putAll(map);
    }

    @Override // p067l.AbstractC10952, p067l.InterfaceC9610
    /* JADX INFO: renamed from: ֫ */
    public final byte mo17419(byte b, int i) {
        int i2;
        if (i == 0) {
            i2 = this.f19745 ? this.f19740 : -(this.f19740 + 1);
        } else {
            int[] iArr = this.f19744;
            int iM34881 = C15322.m34881(i) & this.f19737;
            int i3 = iArr[iM34881];
            if (i3 != 0) {
                if (i != i3) {
                    while (true) {
                        iM34881 = (iM34881 + 1) & this.f19737;
                        int i4 = iArr[iM34881];
                        if (i4 == 0) {
                            i2 = -(iM34881 + 1);
                        } else if (i == i4) {
                        }
                    }
                }
                i2 = iM34881;
            } else {
                i2 = -(iM34881 + 1);
            }
        }
        if (i2 < 0) {
            int i5 = (-i2) - 1;
            if (i5 == this.f19740) {
                this.f19745 = true;
            }
            this.f19744[i5] = i;
            this.f19741[i5] = b;
            int i6 = this.f19739;
            this.f19739 = i6 + 1;
            if (i6 < this.f19743) {
                return (byte) 0;
            }
            m17424(C15322.m34880(0.75f, i6 + 2));
            return (byte) 0;
        }
        byte[] bArr = this.f19741;
        byte b2 = bArr[i2];
        bArr[i2] = b;
        return b2;
    }

    public final byte remove(int i) {
        int i2;
        if (i == 0) {
            if (this.f19745) {
                return m17415();
            }
            return (byte) 0;
        }
        int[] iArr = this.f19744;
        int iM34881 = C15322.m34881(i) & this.f19737;
        int i3 = iArr[iM34881];
        if (i3 == 0) {
            return (byte) 0;
        }
        if (i == i3) {
            return m17418(iM34881);
        }
        do {
            iM34881 = (iM34881 + 1) & this.f19737;
            i2 = iArr[iM34881];
            if (i2 == 0) {
                return (byte) 0;
            }
        } while (i != i2);
        return m17418(iM34881);
    }

    @Override // p067l.InterfaceC9610
    public final byte get(int i) {
        int i2;
        if (i == 0) {
            if (this.f19745) {
                return this.f19741[this.f19740];
            }
            return (byte) 0;
        }
        int[] iArr = this.f19744;
        int iM34881 = C15322.m34881(i) & this.f19737;
        int i3 = iArr[iM34881];
        if (i3 == 0) {
            return (byte) 0;
        }
        if (i == i3) {
            return this.f19741[iM34881];
        }
        do {
            iM34881 = (iM34881 + 1) & this.f19737;
            i2 = iArr[iM34881];
            if (i2 == 0) {
                return (byte) 0;
            }
        } while (i != i2);
        return this.f19741[iM34881];
    }

    @Override // p067l.InterfaceC9610
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo17421(int i) {
        int i2;
        if (i == 0) {
            return this.f19745;
        }
        int[] iArr = this.f19744;
        int iM34881 = C15322.m34881(i) & this.f19737;
        int i3 = iArr[iM34881];
        if (i3 == 0) {
            return false;
        }
        if (i != i3) {
            do {
                iM34881 = (iM34881 + 1) & this.f19737;
                i2 = iArr[iM34881];
                if (i2 == 0) {
                    return false;
                }
            } while (i != i2);
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m17420(byte b) {
        int[] iArr = this.f19744;
        byte[] bArr = this.f19741;
        if (this.f19745 && bArr[this.f19740] == b) {
            return true;
        }
        int i = this.f19740;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (iArr[i2] != 0 && bArr[i2] == b) {
                return true;
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final byte m17423(int i) {
        int i2;
        if (i == 0) {
            if (this.f19745) {
                return this.f19741[this.f19740];
            }
            return (byte) 0;
        }
        int[] iArr = this.f19744;
        int iM34881 = C15322.m34881(i) & this.f19737;
        int i3 = iArr[iM34881];
        if (i3 == 0) {
            return (byte) 0;
        }
        if (i == i3) {
            return this.f19741[iM34881];
        }
        do {
            iM34881 = (iM34881 + 1) & this.f19737;
            i2 = iArr[iM34881];
            if (i2 == 0) {
                return (byte) 0;
            }
        } while (i != i2);
        return this.f19741[iM34881];
    }

    @Override // java.util.Map
    public final void clear() {
        if (this.f19739 == 0) {
            return;
        }
        this.f19739 = 0;
        this.f19745 = false;
        Arrays.fill(this.f19744, 0);
    }

    @Override // p067l.InterfaceC11771
    public final int size() {
        return this.f19739;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f19739 == 0;
    }

    @Override // p067l.InterfaceC19589
    /* JADX INFO: renamed from: ۖ֫ */
    public final InterfaceC20007 mo17422() {
        if (this.f19746 == null) {
            this.f19746 = new C4837(this);
        }
        return this.f19746;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f19738 == null) {
            this.f19738 = new C11543(this);
        }
        return this.f19738;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f19747 == null) {
            this.f19747 = new C18918(this);
        }
        return this.f19747;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m17424(int i) {
        int i2;
        int[] iArr = this.f19744;
        byte[] bArr = this.f19741;
        int i3 = i - 1;
        int i4 = i + 1;
        int[] iArr2 = new int[i4];
        byte[] bArr2 = new byte[i4];
        int i5 = this.f19740;
        int i6 = this.f19745 ? this.f19739 - 1 : this.f19739;
        while (true) {
            int i7 = i6 - 1;
            if (i6 != 0) {
                do {
                    i5--;
                    i2 = iArr[i5];
                } while (i2 == 0);
                int iM34881 = C15322.m34881(i2) & i3;
                if (iArr2[iM34881] != 0) {
                    do {
                        iM34881 = (iM34881 + 1) & i3;
                    } while (iArr2[iM34881] != 0);
                }
                iArr2[iM34881] = iArr[i5];
                bArr2[iM34881] = bArr[i5];
                i6 = i7;
            } else {
                bArr2[i] = bArr[this.f19740];
                this.f19740 = i;
                this.f19737 = i3;
                this.f19743 = C15322.m34887(0.75f, i);
                this.f19744 = iArr2;
                this.f19741 = bArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C7519 c7519 = (C7519) super.clone();
            c7519.f19738 = null;
            c7519.f19747 = null;
            c7519.f19746 = null;
            c7519.f19745 = this.f19745;
            c7519.f19744 = (int[]) this.f19744.clone();
            c7519.f19741 = (byte[]) this.f19741.clone();
            return c7519;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i;
        int[] iArr = this.f19744;
        byte[] bArr = this.f19741;
        int i2 = this.f19745 ? this.f19739 - 1 : this.f19739;
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
            i3 += i ^ bArr[i4];
            i4++;
            i2 = i5;
        }
        return this.f19745 ? i3 + bArr[this.f19740] : i3;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int[] iArr = this.f19744;
        byte[] bArr = this.f19741;
        C16235 c16235 = new C16235(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f19739;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            int iM14006 = c16235.m14006();
            objectOutputStream.writeInt(iArr[iM14006]);
            objectOutputStream.writeByte(bArr[iM14006]);
            i = i2;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        objectInputStream.defaultReadObject();
        int iM34880 = C15322.m34880(0.75f, this.f19739);
        this.f19740 = iM34880;
        this.f19743 = C15322.m34887(0.75f, iM34880);
        int i2 = this.f19740;
        this.f19737 = i2 - 1;
        int i3 = i2 + 1;
        int[] iArr = new int[i3];
        this.f19744 = iArr;
        byte[] bArr = new byte[i3];
        this.f19741 = bArr;
        int i4 = this.f19739;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            int i6 = objectInputStream.readInt();
            byte b = objectInputStream.readByte();
            if (i6 == 0) {
                i = this.f19740;
                this.f19745 = true;
            } else {
                int iM34881 = C15322.m34881(i6);
                int i7 = this.f19737;
                while (true) {
                    i = iM34881 & i7;
                    if (iArr[i] != 0) {
                        iM34881 = i + 1;
                        i7 = this.f19737;
                    }
                }
            }
            iArr[i] = i6;
            bArr[i] = b;
            i4 = i5;
        }
    }
}
