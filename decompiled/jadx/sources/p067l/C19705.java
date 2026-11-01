package p067l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ᩳᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5T5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19705 implements InterfaceC7893 {

    /* JADX INFO: renamed from: ֫ */
    public int f59904;

    /* JADX INFO: renamed from: ۧ */
    public ArrayList f59905;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f59906;

    /* JADX INFO: renamed from: ܽ */
    public int f59907;

    /* JADX INFO: renamed from: ܿ */
    public int f59908;

    /* JADX INFO: renamed from: ᩳ */
    public byte[] f59909;

    public C19705(byte[] bArr) {
        this(bArr, false);
    }

    public C19705() {
        this(new byte[1000], true);
    }

    public C19705(byte[] bArr, boolean z) {
        if (bArr == null) {
            throw new NullPointerException("data == null");
        }
        this.f59906 = z;
        this.f59909 = bArr;
        this.f59907 = 0;
        this.f59905 = null;
        this.f59904 = 0;
        this.f59908 = 0;
    }

    /* JADX INFO: renamed from: ܿ */
    public final byte[] m44774() {
        return this.f59909;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final byte[] m44779() {
        int i = this.f59907;
        byte[] bArr = new byte[i];
        System.arraycopy(this.f59909, 0, bArr, 0, i);
        return bArr;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m44769() {
        return this.f59907;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m44768(int i) {
        if (this.f59907 == i) {
            return;
        }
        StringBuilder sbM34408 = C15033.m34408(i, "expected cursor ", "; actual value: ");
        sbM34408.append(this.f59907);
        throw new C10101(sbM34408.toString(), null);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m44776(int i) {
        int i2 = this.f59907;
        int i3 = i2 + 1;
        if (this.f59906) {
            m44758(i3);
        } else if (i3 > this.f59909.length) {
            m44757();
            throw null;
        }
        this.f59909[i2] = (byte) i;
        this.f59907 = i3;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m44770(int i) {
        int i2 = this.f59907;
        int i3 = i2 + 2;
        if (this.f59906) {
            m44758(i3);
        } else if (i3 > this.f59909.length) {
            m44757();
            throw null;
        }
        byte[] bArr = this.f59909;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        this.f59907 = i3;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m44773(int i) {
        int i2 = this.f59907;
        int i3 = i2 + 4;
        if (this.f59906) {
            m44758(i3);
        } else if (i3 > this.f59909.length) {
            m44757();
            throw null;
        }
        byte[] bArr = this.f59909;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.f59907 = i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44761(long j) {
        int i = this.f59907;
        int i2 = i + 8;
        if (this.f59906) {
            m44758(i2);
        } else if (i2 > this.f59909.length) {
            m44757();
            throw null;
        }
        int i3 = (int) j;
        byte[] bArr = this.f59909;
        bArr[i] = (byte) i3;
        bArr[i + 1] = (byte) (i3 >> 8);
        bArr[i + 2] = (byte) (i3 >> 16);
        bArr[i + 3] = (byte) (i3 >> 24);
        int i4 = (int) (j >> 32);
        bArr[i + 4] = (byte) i4;
        bArr[i + 5] = (byte) (i4 >> 8);
        bArr[i + 6] = (byte) (i4 >> 16);
        bArr[i + 7] = (byte) (i4 >> 24);
        this.f59907 = i2;
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m44766(int i) {
        if (this.f59906) {
            m44758(this.f59907 + 5);
        }
        int i2 = this.f59907;
        while (true) {
            int i3 = i >>> 7;
            if (i3 != 0) {
                m44776((byte) ((i & 127) | 128));
                i = i3;
            } else {
                m44776((byte) (i & 127));
                return this.f59907 - i2;
            }
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m44778(int i) {
        if (this.f59906) {
            m44758(this.f59907 + 5);
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
            m44776((byte) ((i5 & 127) | (z ? 128 : 0)));
            i2 = i >> 7;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44763(C13000 c13000) {
        int iM29810 = c13000.m29810();
        int i = this.f59907;
        int i2 = iM29810 + i;
        if (this.f59906) {
            m44758(i2);
        } else if (i2 > this.f59909.length) {
            m44757();
            throw null;
        }
        c13000.m29813(i, this.f59909);
        this.f59907 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44764(byte[] bArr) {
        int length = bArr.length;
        int i = this.f59907;
        int i2 = i + length;
        if ((length | i2) < 0 || length > bArr.length) {
            throw new IndexOutOfBoundsException("bytes.length " + bArr.length + "; 0..!" + i2);
        }
        if (this.f59906) {
            m44758(i2);
        } else if (i2 > this.f59909.length) {
            m44757();
            throw null;
        }
        System.arraycopy(bArr, 0, this.f59909, i, length);
        this.f59907 = i2;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m44777(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("count < 0");
        }
        int i2 = this.f59907 + i;
        if (this.f59906) {
            m44758(i2);
        } else if (i2 > this.f59909.length) {
            m44757();
            throw null;
        }
        Arrays.fill(this.f59909, this.f59907, i2, (byte) 0);
        this.f59907 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44759(int i) {
        int i2 = i - 1;
        if (i < 0 || (i & i2) != 0) {
            throw new IllegalArgumentException("bogus alignment");
        }
        int i3 = (this.f59907 + i2) & (~i2);
        if (this.f59906) {
            m44758(i3);
        } else if (i3 > this.f59909.length) {
            m44757();
            throw null;
        }
        Arrays.fill(this.f59909, this.f59907, i3, (byte) 0);
        this.f59907 = i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m44765() {
        return this.f59905 != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44762(String str) {
        if (this.f59905 == null) {
            return;
        }
        m44767();
        this.f59905.add(new C18363(this.f59907, Integer.MAX_VALUE, str));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44760(int i, String str) {
        if (this.f59905 == null) {
            return;
        }
        m44767();
        int size = this.f59905.size();
        int iM41835 = size == 0 ? 0 : ((C18363) this.f59905.get(size - 1)).m41835();
        int i2 = this.f59907;
        if (iM41835 <= i2) {
            iM41835 = i2;
        }
        this.f59905.add(new C18363(iM41835, i + iM41835, str));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m44767() {
        int size;
        ArrayList arrayList = this.f59905;
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        ((C18363) this.f59905.get(size - 1)).m41838(this.f59907);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m44775() {
        int i = this.f59908;
        return this.f59904 - ((i / 2) + ((i * 2) + 8));
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m44772(int i) {
        if (this.f59905 != null || this.f59907 != 0) {
            throw new RuntimeException("cannot enable annotations");
        }
        if (i < 40) {
            throw new IllegalArgumentException("annotationWidth < 40");
        }
        int iM21912 = C9417.m21912(i, 7, 15, 1) & (-2);
        if (iM21912 < 6) {
            iM21912 = 6;
        } else if (iM21912 > 10) {
            iM21912 = 10;
        }
        this.f59905 = new ArrayList(1000);
        this.f59904 = i;
        this.f59908 = iM21912;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m44771() {
        m44767();
        ArrayList arrayList = this.f59905;
        if (arrayList != null) {
            for (int size = arrayList.size(); size > 0; size--) {
                int i = size - 1;
                C18363 c18363 = (C18363) this.f59905.get(i);
                if (c18363.m41837() > this.f59907) {
                    this.f59905.remove(i);
                } else {
                    int iM41835 = c18363.m41835();
                    int i2 = this.f59907;
                    if (iM41835 > i2) {
                        c18363.m41836(i2);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public static void m44757() {
        throw new IndexOutOfBoundsException("attempt to write past the end");
    }

    /* JADX INFO: renamed from: ۢ */
    private void m44758(int i) {
        byte[] bArr = this.f59909;
        if (bArr.length < i) {
            byte[] bArr2 = new byte[(i * 2) + 1000];
            System.arraycopy(bArr, 0, bArr2, 0, this.f59907);
            this.f59909 = bArr2;
        }
    }
}
