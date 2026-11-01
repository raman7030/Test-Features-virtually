package p067l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.֫ۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 04FP */
/* JADX INFO: loaded from: classes2.dex */
public final class C4054 {

    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC8233 f8921;

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList f8926 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public C9163[] f8920 = new C9163[8];

    /* JADX INFO: renamed from: ᩻ */
    public int f8927 = 7;

    /* JADX INFO: renamed from: ܽ */
    public int f8924 = 0;

    /* JADX INFO: renamed from: ۧ */
    public int f8922 = 0;

    /* JADX INFO: renamed from: ܿ */
    public final int f8925 = 4096;

    /* JADX INFO: renamed from: ܳ */
    public int f8923 = 4096;

    public C4054(InterfaceC3579 interfaceC3579) {
        this.f8921 = C25037.m54976(interfaceC3579);
    }

    /* JADX INFO: renamed from: ֫ */
    private int m8114(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.f8920.length;
            while (true) {
                length--;
                i2 = this.f8927;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.f8920[length].f24826;
                i -= i4;
                this.f8922 -= i4;
                this.f8924--;
                i3++;
            }
            C9163[] c9163Arr = this.f8920;
            System.arraycopy(c9163Arr, i2 + 1, c9163Arr, i2 + 1 + i3, this.f8924);
            this.f8927 += i3;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m8120() {
        while (true) {
            InterfaceC8233 interfaceC8233 = this.f8921;
            if (interfaceC8233.mo14213()) {
                return;
            }
            byte b = interfaceC8233.readByte();
            int i = b & 255;
            if (i == 128) {
                throw new IOException("index == 0");
            }
            int i2 = b & GCMSIVBlockCipher.MASK;
            ArrayList arrayList = this.f8926;
            if (i2 == 128) {
                int iM8117 = m8117(i, 127);
                int i3 = iM8117 - 1;
                if (i3 >= 0) {
                    C9163[] c9163Arr = C18135.f54164;
                    if (i3 <= c9163Arr.length - 1) {
                        arrayList.add(c9163Arr[i3]);
                    }
                }
                int length = this.f8927 + 1 + (i3 - C18135.f54164.length);
                if (length >= 0) {
                    C9163[] c9163Arr2 = this.f8920;
                    if (length < c9163Arr2.length) {
                        arrayList.add(c9163Arr2[length]);
                    }
                }
                throw new IOException(C20778.m46922(iM8117, "Header index too large "));
            }
            if (i == 64) {
                C13598 c13598M8119 = m8119();
                C18135.m41313(c13598M8119);
                m8115(new C9163(c13598M8119, m8119()));
            } else if ((b & 64) == 64) {
                m8115(new C9163(m8116(m8117(i, 63) - 1), m8119()));
            } else if ((b & UTF8.S_CS3) == 32) {
                int iM8118 = m8117(i, 31);
                this.f8923 = iM8118;
                if (iM8118 < 0 || iM8118 > this.f8925) {
                    throw new IOException("Invalid dynamic table size update " + this.f8923);
                }
                int i4 = this.f8922;
                if (iM8118 < i4) {
                    if (iM8118 == 0) {
                        Arrays.fill(this.f8920, (Object) null);
                        this.f8927 = this.f8920.length - 1;
                        this.f8924 = 0;
                        this.f8922 = 0;
                    } else {
                        m8114(i4 - iM8118);
                    }
                }
            } else if (i == 16 || i == 0) {
                C13598 c13598M81110 = m8119();
                C18135.m41313(c13598M81110);
                arrayList.add(new C9163(c13598M81110, m8119()));
            } else {
                arrayList.add(new C9163(m8116(m8117(i, 15) - 1), m8119()));
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m8118() {
        ArrayList arrayList = this.f8926;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۧ */
    private C13598 m8116(int i) throws IOException {
        if (i >= 0) {
            C9163[] c9163Arr = C18135.f54164;
            if (i <= c9163Arr.length - 1) {
                return c9163Arr[i].f24827;
            }
        }
        int length = this.f8927 + 1 + (i - C18135.f54164.length);
        if (length >= 0) {
            C9163[] c9163Arr2 = this.f8920;
            if (length < c9163Arr2.length) {
                return c9163Arr2[length].f24827;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    /* JADX INFO: renamed from: ֫ */
    private void m8115(C9163 c9163) {
        this.f8926.add(c9163);
        int i = c9163.f24826;
        int i2 = this.f8923;
        if (i > i2) {
            Arrays.fill(this.f8920, (Object) null);
            this.f8927 = this.f8920.length - 1;
            this.f8924 = 0;
            this.f8922 = 0;
            return;
        }
        m8114((this.f8922 + i) - i2);
        int i3 = this.f8924 + 1;
        C9163[] c9163Arr = this.f8920;
        if (i3 > c9163Arr.length) {
            C9163[] c9163Arr2 = new C9163[c9163Arr.length * 2];
            System.arraycopy(c9163Arr, 0, c9163Arr2, c9163Arr.length, c9163Arr.length);
            this.f8927 = this.f8920.length - 1;
            this.f8920 = c9163Arr2;
        }
        int i4 = this.f8927;
        this.f8927 = i4 - 1;
        this.f8920[i4] = c9163;
        this.f8924++;
        this.f8922 += i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m8117(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte b = this.f8921.readByte();
            int i5 = b & 255;
            if ((b & GCMSIVBlockCipher.MASK) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << i4;
            i4 += 7;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C13598 m8119() {
        InterfaceC8233 interfaceC8233 = this.f8921;
        byte b = interfaceC8233.readByte();
        int i = b & 255;
        boolean z = (b & GCMSIVBlockCipher.MASK) == 128;
        int iM8117 = m8117(i, 127);
        if (z) {
            return C13598.m30946(C24170.m53450().m53452(interfaceC8233.mo14217(iM8117)));
        }
        return interfaceC8233.mo14210(iM8117);
    }
}
