package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ᩳᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5T5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18241 implements InterfaceC5813 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f56686;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f56687;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f56688;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f56689;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f56690;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte[] f56691;

    public C18241(byte[] bArr) {
        this(bArr, false);
    }

    public C18241() {
        this(new byte[1000], true);
    }

    public C18241(byte[] bArr, boolean z) {
        if (bArr == null) {
            throw new NullPointerException("data == null");
        }
        this.f56688 = z;
        this.f56691 = bArr;
        this.f56689 = 0;
        this.f56687 = null;
        this.f56686 = 0;
        this.f56690 = 0;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] m42515() {
        return this.f56691;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final byte[] m42520() {
        int i = this.f56689;
        byte[] bArr = new byte[i];
        System.arraycopy(this.f56691, 0, bArr, 0, i);
        return bArr;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m42510() {
        return this.f56689;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m42509(int i) {
        if (this.f56689 == i) {
            return;
        }
        StringBuilder sbM32308 = C13325.m32308(i, "expected cursor ", "; actual value: ");
        sbM32308.append(this.f56689);
        throw new C8136(sbM32308.toString(), null);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m42517(int i) {
        int i2 = this.f56689;
        int i3 = i2 + 1;
        if (this.f56688) {
            m42499(i3);
        } else if (i3 > this.f56691.length) {
            m42498();
            throw null;
        }
        this.f56691[i2] = (byte) i;
        this.f56689 = i3;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m42511(int i) {
        int i2 = this.f56689;
        int i3 = i2 + 2;
        if (this.f56688) {
            m42499(i3);
        } else if (i3 > this.f56691.length) {
            m42498();
            throw null;
        }
        byte[] bArr = this.f56691;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        this.f56689 = i3;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m42514(int i) {
        int i2 = this.f56689;
        int i3 = i2 + 4;
        if (this.f56688) {
            m42499(i3);
        } else if (i3 > this.f56691.length) {
            m42498();
            throw null;
        }
        byte[] bArr = this.f56691;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.f56689 = i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42502(long j) {
        int i = this.f56689;
        int i2 = i + 8;
        if (this.f56688) {
            m42499(i2);
        } else if (i2 > this.f56691.length) {
            m42498();
            throw null;
        }
        int i3 = (int) j;
        byte[] bArr = this.f56691;
        bArr[i] = (byte) i3;
        bArr[i + 1] = (byte) (i3 >> 8);
        bArr[i + 2] = (byte) (i3 >> 16);
        bArr[i + 3] = (byte) (i3 >> 24);
        int i4 = (int) (j >> 32);
        bArr[i + 4] = (byte) i4;
        bArr[i + 5] = (byte) (i4 >> 8);
        bArr[i + 6] = (byte) (i4 >> 16);
        bArr[i + 7] = (byte) (i4 >> 24);
        this.f56689 = i2;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m42507(int i) {
        if (this.f56688) {
            m42499(this.f56689 + 5);
        }
        int i2 = this.f56689;
        while (true) {
            int i3 = i >>> 7;
            if (i3 != 0) {
                m42517((byte) ((i & 127) | 128));
                i = i3;
            } else {
                m42517((byte) (i & 127));
                return this.f56689 - i2;
            }
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m42519(int i) {
        if (this.f56688) {
            m42499(this.f56689 + 5);
        }
        int i2 = i >> 7;
        int i3 = (Integer.MIN_VALUE & i) == 0 ? 0 : -1;
        boolean z = true;
        while (true) {
            int i4 = i2;
            int i5 = i;
            i = i4;
            if (!z) {
                return;
            }
            z = (i == i3 && (i & 1) == ((i5 >> 6) & 1)) ? false : true;
            m42517((byte) ((i5 & 127) | (z ? 128 : 0)));
            i2 = i >> 7;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42504(C11186 c11186) {
        int iM27748 = c11186.m27748();
        int i = this.f56689;
        int i2 = iM27748 + i;
        if (this.f56688) {
            m42499(i2);
        } else if (i2 > this.f56691.length) {
            m42498();
            throw null;
        }
        c11186.m27751(i, this.f56691);
        this.f56689 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42505(byte[] bArr) {
        int length = bArr.length;
        int i = this.f56689;
        int i2 = i + length;
        if ((length | i2) < 0 || length > bArr.length) {
            throw new IndexOutOfBoundsException("bytes.length " + bArr.length + "; 0..!" + i2);
        }
        if (this.f56688) {
            m42499(i2);
        } else if (i2 > this.f56691.length) {
            m42498();
            throw null;
        }
        System.arraycopy(bArr, 0, this.f56691, i, length);
        this.f56689 = i2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m42518(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("count < 0");
        }
        int i2 = this.f56689 + i;
        if (this.f56688) {
            m42499(i2);
        } else if (i2 > this.f56691.length) {
            m42498();
            throw null;
        }
        Arrays.fill(this.f56691, this.f56689, i2, (byte) 0);
        this.f56689 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42500(int i) {
        int i2 = i - 1;
        if (i < 0 || (i & i2) != 0) {
            throw new IllegalArgumentException("bogus alignment");
        }
        int i3 = (this.f56689 + i2) & (~i2);
        if (this.f56688) {
            m42499(i3);
        } else if (i3 > this.f56691.length) {
            m42498();
            throw null;
        }
        Arrays.fill(this.f56691, this.f56689, i3, (byte) 0);
        this.f56689 = i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m42506() {
        return this.f56687 != null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42503(String str) {
        if (this.f56687 == null) {
            return;
        }
        m42508();
        this.f56687.add(new C16829(this.f56689, Integer.MAX_VALUE, str));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42501(int i, String str) {
        if (this.f56687 == null) {
            return;
        }
        m42508();
        int size = this.f56687.size();
        int iM39599 = size == 0 ? 0 : ((C16829) this.f56687.get(size - 1)).m39599();
        int i2 = this.f56689;
        if (iM39599 <= i2) {
            iM39599 = i2;
        }
        this.f56687.add(new C16829(iM39599, i + iM39599, str));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m42508() {
        int size;
        ArrayList arrayList = this.f56687;
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        ((C16829) this.f56687.get(size - 1)).m39602(this.f56689);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m42516() {
        int i = this.f56690;
        return this.f56686 - ((i / 2) + ((i * 2) + 8));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m42513(int i) {
        if (this.f56687 != null || this.f56689 != 0) {
            throw new RuntimeException("cannot enable annotations");
        }
        if (i < 40) {
            throw new IllegalArgumentException("annotationWidth < 40");
        }
        int iM19938 = C7416.m19938(i, 7, 15, 1) & (-2);
        if (iM19938 < 6) {
            iM19938 = 6;
        } else if (iM19938 > 10) {
            iM19938 = 10;
        }
        this.f56687 = new ArrayList(1000);
        this.f56686 = i;
        this.f56690 = iM19938;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m42512() {
        m42508();
        ArrayList arrayList = this.f56687;
        if (arrayList != null) {
            for (int size = arrayList.size(); size > 0; size--) {
                int i = size - 1;
                C16829 c16829 = (C16829) this.f56687.get(i);
                if (c16829.m39601() > this.f56689) {
                    this.f56687.remove(i);
                } else {
                    int iM39599 = c16829.m39599();
                    int i2 = this.f56689;
                    if (iM39599 > i2) {
                        c16829.m39600(i2);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static void m42498() {
        throw new IndexOutOfBoundsException("attempt to write past the end");
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m42499(int i) {
        byte[] bArr = this.f56691;
        if (bArr.length < i) {
            byte[] bArr2 = new byte[(i * 2) + 1000];
            System.arraycopy(bArr, 0, bArr2, 0, this.f56689);
            this.f56691 = bArr2;
        }
    }
}
