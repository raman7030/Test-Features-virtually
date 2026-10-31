package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.֫ۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 04FP */
/* JADX INFO: loaded from: classes2.dex */
public final class C1774 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6171 f6146;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f6151 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C7150[] f6145 = new C7150[8];

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f6152 = 7;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f6149 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f6147 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f6150 = 4096;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f6148 = 4096;

    public C1774(InterfaceC1274 interfaceC1274) {
        this.f6146 = C23852.m52567(interfaceC1274);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m5919(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.f6145.length;
            while (true) {
                length--;
                i2 = this.f6152;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.f6145[length].f21947;
                i -= i4;
                this.f6147 -= i4;
                this.f6149--;
                i3++;
            }
            C7150[] c7150Arr = this.f6145;
            System.arraycopy(c7150Arr, i2 + 1, c7150Arr, i2 + 1 + i3, this.f6149);
            this.f6152 += i3;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m5925() {
        while (true) {
            InterfaceC6171 interfaceC6171 = this.f6146;
            if (interfaceC6171.mo12308()) {
                return;
            }
            byte b = interfaceC6171.readByte();
            int i = b & 255;
            if (i == 128) {
                throw new IOException("index == 0");
            }
            int i2 = b & GCMSIVBlockCipher.MASK;
            ArrayList arrayList = this.f6151;
            if (i2 == 128) {
                int iM5922 = m5922(i, 127);
                int i3 = iM5922 - 1;
                if (i3 >= 0) {
                    C7150[] c7150Arr = C16590.f50987;
                    if (i3 <= c7150Arr.length - 1) {
                        arrayList.add(c7150Arr[i3]);
                    }
                }
                int length = this.f6152 + 1 + (i3 - C16590.f50987.length);
                if (length >= 0) {
                    C7150[] c7150Arr2 = this.f6145;
                    if (length < c7150Arr2.length) {
                        arrayList.add(c7150Arr2[length]);
                    }
                }
                throw new IOException(C19370.m44628(iM5922, "Header index too large "));
            }
            if (i == 64) {
                C11816 c11816M5924 = m5924();
                C16590.m39087(c11816M5924);
                m5920(new C7150(c11816M5924, m5924()));
            } else if ((b & 64) == 64) {
                m5920(new C7150(m5921(m5922(i, 63) - 1), m5924()));
            } else if ((b & UTF8.S_CS3) == 32) {
                int iM5923 = m5922(i, 31);
                this.f6148 = iM5923;
                if (iM5923 < 0 || iM5923 > this.f6150) {
                    throw new IOException("Invalid dynamic table size update " + this.f6148);
                }
                int i4 = this.f6147;
                if (iM5923 < i4) {
                    if (iM5923 == 0) {
                        Arrays.fill(this.f6145, (Object) null);
                        this.f6152 = this.f6145.length - 1;
                        this.f6149 = 0;
                        this.f6147 = 0;
                    } else {
                        m5919(i4 - iM5923);
                    }
                }
            } else if (i == 16 || i == 0) {
                C11816 c11816M5925 = m5924();
                C16590.m39087(c11816M5925);
                arrayList.add(new C7150(c11816M5925, m5924()));
            } else {
                arrayList.add(new C7150(m5921(m5922(i, 15) - 1), m5924()));
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m5923() {
        ArrayList arrayList = this.f6151;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C11816 m5921(int i) throws IOException {
        if (i >= 0) {
            C7150[] c7150Arr = C16590.f50987;
            if (i <= c7150Arr.length - 1) {
                return c7150Arr[i].f21948;
            }
        }
        int length = this.f6152 + 1 + (i - C16590.f50987.length);
        if (length >= 0) {
            C7150[] c7150Arr2 = this.f6145;
            if (length < c7150Arr2.length) {
                return c7150Arr2[length].f21948;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5920(C7150 c7150) {
        this.f6151.add(c7150);
        int i = c7150.f21947;
        int i2 = this.f6148;
        if (i > i2) {
            Arrays.fill(this.f6145, (Object) null);
            this.f6152 = this.f6145.length - 1;
            this.f6149 = 0;
            this.f6147 = 0;
            return;
        }
        m5919((this.f6147 + i) - i2);
        int i3 = this.f6149 + 1;
        C7150[] c7150Arr = this.f6145;
        if (i3 > c7150Arr.length) {
            C7150[] c7150Arr2 = new C7150[c7150Arr.length * 2];
            System.arraycopy(c7150Arr, 0, c7150Arr2, c7150Arr.length, c7150Arr.length);
            this.f6152 = this.f6145.length - 1;
            this.f6145 = c7150Arr2;
        }
        int i4 = this.f6152;
        this.f6152 = i4 - 1;
        this.f6145[i4] = c7150;
        this.f6149++;
        this.f6147 += i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m5922(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte b = this.f6146.readByte();
            int i5 = b & 255;
            if ((b & GCMSIVBlockCipher.MASK) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << i4;
            i4 += 7;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11816 m5924() {
        InterfaceC6171 interfaceC6171 = this.f6146;
        byte b = interfaceC6171.readByte();
        int i = b & 255;
        boolean z = (b & GCMSIVBlockCipher.MASK) == 128;
        int iM5922 = m5922(i, 127);
        if (z) {
            return C11816.m28897(C22940.m51059().m51061(interfaceC6171.mo12312(iM5922)));
        }
        return interfaceC6171.mo12305(iM5922);
    }
}
