package l;

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
public final class C5419 extends AbstractC16085 implements Cloneable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient int f16899;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC11606 f16900;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f16901;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public transient int f16902;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public transient byte[] f16903;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final transient int f16904;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public transient int f16905;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient int[] f16906;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient boolean f16907;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient InterfaceC16707 f16908;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public transient InterfaceC8481 f16909;

    public C5419() {
        int iM32765 = C13630.m32765(0.75f, 16);
        this.f16902 = iM32765;
        this.f16904 = iM32765;
        this.f16899 = iM32765 - 1;
        this.f16905 = C13630.m32772(0.75f, iM32765);
        int i = this.f16902 + 1;
        this.f16906 = new int[i];
        this.f16903 = new byte[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte m15507(int i) {
        int i2;
        byte[] bArr = this.f16903;
        byte b = bArr[i];
        this.f16901--;
        int[] iArr = this.f16906;
        loop0: while (true) {
            int i3 = (i + 1) & this.f16899;
            while (true) {
                i2 = iArr[i3];
                if (i2 != 0) {
                    int iM32766 = C13630.m32766(i2);
                    int i4 = this.f16899;
                    int i5 = iM32766 & i4;
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
        int i6 = this.f16902;
        if (i6 > this.f16904 && this.f16901 < this.f16905 / 4 && i6 > 16) {
            m15513(i6 / 2);
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte m15504() {
        this.f16907 = false;
        byte[] bArr = this.f16903;
        int i = this.f16902;
        byte b = bArr[i];
        int i2 = this.f16901 - 1;
        this.f16901 = i2;
        if (i > this.f16904 && i2 < this.f16905 / 4 && i > 16) {
            m15513(i / 2);
        }
        return b;
    }

    @Override // l.AbstractC16085, java.util.Map
    public final void putAll(Map map) {
        if (0.75f <= 0.5d) {
            int iM32765 = C13630.m32765(0.75f, map.size());
            if (iM32765 > this.f16902) {
                m15513(iM32765);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C13630.m32768((long) Math.ceil((map.size() + this.f16901) / 0.75f))));
            if (iMin > this.f16902) {
                m15513(iMin);
            }
        }
        super.putAll(map);
    }

    @Override // l.AbstractC9031, l.InterfaceC7619
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte mo15508(byte b, int i) {
        int i2;
        if (i == 0) {
            i2 = this.f16907 ? this.f16902 : -(this.f16902 + 1);
        } else {
            int[] iArr = this.f16906;
            int iM32766 = C13630.m32766(i) & this.f16899;
            int i3 = iArr[iM32766];
            if (i3 != 0) {
                if (i != i3) {
                    while (true) {
                        iM32766 = (iM32766 + 1) & this.f16899;
                        int i4 = iArr[iM32766];
                        if (i4 == 0) {
                            i2 = -(iM32766 + 1);
                        } else if (i == i4) {
                        }
                    }
                }
                i2 = iM32766;
            } else {
                i2 = -(iM32766 + 1);
            }
        }
        if (i2 < 0) {
            int i5 = (-i2) - 1;
            if (i5 == this.f16902) {
                this.f16907 = true;
            }
            this.f16906[i5] = i;
            this.f16903[i5] = b;
            int i6 = this.f16901;
            this.f16901 = i6 + 1;
            if (i6 < this.f16905) {
                return (byte) 0;
            }
            m15513(C13630.m32765(0.75f, i6 + 2));
            return (byte) 0;
        }
        byte[] bArr = this.f16903;
        byte b2 = bArr[i2];
        bArr[i2] = b;
        return b2;
    }

    public final byte remove(int i) {
        int i2;
        if (i == 0) {
            if (this.f16907) {
                return m15504();
            }
            return (byte) 0;
        }
        int[] iArr = this.f16906;
        int iM32766 = C13630.m32766(i) & this.f16899;
        int i3 = iArr[iM32766];
        if (i3 == 0) {
            return (byte) 0;
        }
        if (i == i3) {
            return m15507(iM32766);
        }
        do {
            iM32766 = (iM32766 + 1) & this.f16899;
            i2 = iArr[iM32766];
            if (i2 == 0) {
                return (byte) 0;
            }
        } while (i != i2);
        return m15507(iM32766);
    }

    @Override // l.InterfaceC7619
    public final byte get(int i) {
        int i2;
        if (i == 0) {
            if (this.f16907) {
                return this.f16903[this.f16902];
            }
            return (byte) 0;
        }
        int[] iArr = this.f16906;
        int iM32766 = C13630.m32766(i) & this.f16899;
        int i3 = iArr[iM32766];
        if (i3 == 0) {
            return (byte) 0;
        }
        if (i == i3) {
            return this.f16903[iM32766];
        }
        do {
            iM32766 = (iM32766 + 1) & this.f16899;
            i2 = iArr[iM32766];
            if (i2 == 0) {
                return (byte) 0;
            }
        } while (i != i2);
        return this.f16903[iM32766];
    }

    @Override // l.InterfaceC7619
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo15510(int i) {
        int i2;
        if (i == 0) {
            return this.f16907;
        }
        int[] iArr = this.f16906;
        int iM32766 = C13630.m32766(i) & this.f16899;
        int i3 = iArr[iM32766];
        if (i3 == 0) {
            return false;
        }
        if (i != i3) {
            do {
                iM32766 = (iM32766 + 1) & this.f16899;
                i2 = iArr[iM32766];
                if (i2 == 0) {
                    return false;
                }
            } while (i != i2);
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m15509(byte b) {
        int[] iArr = this.f16906;
        byte[] bArr = this.f16903;
        if (this.f16907 && bArr[this.f16902] == b) {
            return true;
        }
        int i = this.f16902;
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

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte m15512(int i) {
        int i2;
        if (i == 0) {
            if (this.f16907) {
                return this.f16903[this.f16902];
            }
            return (byte) 0;
        }
        int[] iArr = this.f16906;
        int iM32766 = C13630.m32766(i) & this.f16899;
        int i3 = iArr[iM32766];
        if (i3 == 0) {
            return (byte) 0;
        }
        if (i == i3) {
            return this.f16903[iM32766];
        }
        do {
            iM32766 = (iM32766 + 1) & this.f16899;
            i2 = iArr[iM32766];
            if (i2 == 0) {
                return (byte) 0;
            }
        } while (i != i2);
        return this.f16903[iM32766];
    }

    @Override // java.util.Map
    public final void clear() {
        if (this.f16901 == 0) {
            return;
        }
        this.f16901 = 0;
        this.f16907 = false;
        Arrays.fill(this.f16906, 0);
    }

    @Override // l.InterfaceC9893
    public final int size() {
        return this.f16901;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f16901 == 0;
    }

    @Override // l.InterfaceC18119
    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18559 mo15511() {
        if (this.f16908 == null) {
            this.f16908 = new C2597(this);
        }
        return this.f16908;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f16900 == null) {
            this.f16900 = new C9653(this);
        }
        return this.f16900;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f16909 == null) {
            this.f16909 = new C17413(this);
        }
        return this.f16909;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m15513(int i) {
        int i2;
        int[] iArr = this.f16906;
        byte[] bArr = this.f16903;
        int i3 = i - 1;
        int i4 = i + 1;
        int[] iArr2 = new int[i4];
        byte[] bArr2 = new byte[i4];
        int i5 = this.f16902;
        int i6 = this.f16907 ? this.f16901 - 1 : this.f16901;
        while (true) {
            int i7 = i6 - 1;
            if (i6 != 0) {
                do {
                    i5--;
                    i2 = iArr[i5];
                } while (i2 == 0);
                int iM32766 = C13630.m32766(i2) & i3;
                if (iArr2[iM32766] != 0) {
                    do {
                        iM32766 = (iM32766 + 1) & i3;
                    } while (iArr2[iM32766] != 0);
                }
                iArr2[iM32766] = iArr[i5];
                bArr2[iM32766] = bArr[i5];
                i6 = i7;
            } else {
                bArr2[i] = bArr[this.f16902];
                this.f16902 = i;
                this.f16899 = i3;
                this.f16905 = C13630.m32772(0.75f, i);
                this.f16906 = iArr2;
                this.f16903 = bArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C5419 c5419 = (C5419) super.clone();
            c5419.f16900 = null;
            c5419.f16909 = null;
            c5419.f16908 = null;
            c5419.f16907 = this.f16907;
            c5419.f16906 = (int[]) this.f16906.clone();
            c5419.f16903 = (byte[]) this.f16903.clone();
            return c5419;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i;
        int[] iArr = this.f16906;
        byte[] bArr = this.f16903;
        int i2 = this.f16907 ? this.f16901 - 1 : this.f16901;
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
        return this.f16907 ? i3 + bArr[this.f16902] : i3;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int[] iArr = this.f16906;
        byte[] bArr = this.f16903;
        C14590 c14590 = new C14590(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f16901;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            int iM12086 = c14590.m12086();
            objectOutputStream.writeInt(iArr[iM12086]);
            objectOutputStream.writeByte(bArr[iM12086]);
            i = i2;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        objectInputStream.defaultReadObject();
        int iM32765 = C13630.m32765(0.75f, this.f16901);
        this.f16902 = iM32765;
        this.f16905 = C13630.m32772(0.75f, iM32765);
        int i2 = this.f16902;
        this.f16899 = i2 - 1;
        int i3 = i2 + 1;
        int[] iArr = new int[i3];
        this.f16906 = iArr;
        byte[] bArr = new byte[i3];
        this.f16903 = bArr;
        int i4 = this.f16901;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            int i6 = objectInputStream.readInt();
            byte b = objectInputStream.readByte();
            if (i6 == 0) {
                i = this.f16902;
                this.f16907 = true;
            } else {
                int iM32766 = C13630.m32766(i6);
                int i7 = this.f16899;
                while (true) {
                    i = iM32766 & i7;
                    if (iArr[i] != 0) {
                        iM32766 = i + 1;
                        i7 = this.f16899;
                    }
                }
            }
            iArr[i] = i6;
            bArr[i] = b;
            i4 = i5;
        }
    }
}
