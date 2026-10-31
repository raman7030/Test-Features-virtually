package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.᩷ܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8PX */
/* JADX INFO: loaded from: classes4.dex */
public final class C20999 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f67796;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21725 f67797;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f67798;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C6887 f67799;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C17714 f67800;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C6887 f67801;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C6887 f67802;

    public C20999(InterfaceC21725 interfaceC21725) {
        this.f67797 = interfaceC21725;
        int iM30785 = ((C12552) interfaceC21725).m30785();
        this.f67796 = iM30785;
        this.f67800 = new C17714(32);
        C6887 c6887 = new C6887(iM30785, 0L);
        this.f67799 = c6887;
        this.f67801 = c6887;
        this.f67802 = c6887;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m47814() {
        C6887 c6887 = this.f67799;
        C8319 c8319 = c6887.f21278;
        InterfaceC21725 interfaceC21725 = this.f67797;
        if (c8319 != null) {
            ((C12552) interfaceC21725).m30784(c6887);
            c6887.f21278 = null;
            c6887.f21280 = null;
        }
        C6887 c6888 = this.f67799;
        C22632.m50634(c6888.f21278 == null);
        c6888.f21281 = 0L;
        c6888.f21279 = this.f67796;
        C6887 c6889 = this.f67799;
        this.f67801 = c6889;
        this.f67802 = c6889;
        this.f67798 = 0L;
        ((C12552) interfaceC21725).m30787();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m47815(long j) {
        C22632.m50631(j <= this.f67798);
        this.f67798 = j;
        InterfaceC21725 interfaceC21725 = this.f67797;
        int i = this.f67796;
        if (j != 0) {
            C6887 c6887 = this.f67799;
            if (j != c6887.f21281) {
                while (this.f67798 > c6887.f21279) {
                    c6887 = c6887.f21280;
                }
                C6887 c6888 = c6887.f21280;
                c6888.getClass();
                if (c6888.f21278 != null) {
                    ((C12552) interfaceC21725).m30784(c6888);
                    c6888.f21278 = null;
                    c6888.f21280 = null;
                }
                C6887 c6889 = new C6887(i, c6887.f21279);
                c6887.f21280 = c6889;
                if (this.f67798 == c6887.f21279) {
                    c6887 = c6889;
                }
                this.f67802 = c6887;
                if (this.f67801 == c6888) {
                    this.f67801 = c6889;
                    return;
                }
                return;
            }
        }
        C6887 c68810 = this.f67799;
        if (c68810.f21278 != null) {
            ((C12552) interfaceC21725).m30784(c68810);
            c68810.f21278 = null;
            c68810.f21280 = null;
        }
        C6887 c68811 = new C6887(i, this.f67798);
        this.f67799 = c68811;
        this.f67801 = c68811;
        this.f67802 = c68811;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m47817() {
        this.f67801 = this.f67799;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m47816(C21843 c21843, C9004 c9004) {
        this.f67801 = m47808(this.f67801, c21843, c9004, this.f67800);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47813(C21843 c21843, C9004 c9004) {
        m47808(this.f67801, c21843, c9004, this.f67800);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47812(long j) {
        C6887 c6887;
        if (j == -1) {
            return;
        }
        while (true) {
            c6887 = this.f67799;
            if (j < c6887.f21279) {
                break;
            }
            ((C12552) this.f67797).m30783(c6887.f21278);
            C6887 c6888 = this.f67799;
            c6888.f21278 = null;
            C6887 c6889 = c6888.f21280;
            c6888.f21280 = null;
            this.f67799 = c6889;
        }
        if (this.f67801.f21281 < c6887.f21281) {
            this.f67801 = c6887;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m47810() {
        return this.f67798;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m47809(InterfaceC9765 interfaceC9765, int i, boolean z) throws EOFException {
        int iM47805 = m47805(i);
        C6887 c6887 = this.f67802;
        C8319 c8319 = c6887.f21278;
        int i2 = interfaceC9765.read(c8319.f25526, ((int) (this.f67798 - c6887.f21281)) + c8319.f25527, iM47805);
        if (i2 == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = this.f67798 + ((long) i2);
        this.f67798 = j;
        C6887 c6888 = this.f67802;
        if (j == c6888.f21279) {
            this.f67802 = c6888.f21280;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47811(int i, C17714 c17714) {
        while (i > 0) {
            int iM47805 = m47805(i);
            C6887 c6887 = this.f67802;
            C8319 c8319 = c6887.f21278;
            c17714.m41461(((int) (this.f67798 - c6887.f21281)) + c8319.f25527, iM47805, c8319.f25526);
            i -= iM47805;
            long j = this.f67798 + ((long) iM47805);
            this.f67798 = j;
            C6887 c6888 = this.f67802;
            if (j == c6888.f21279) {
                this.f67802 = c6888.f21280;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m47805(int i) {
        C6887 c6887 = this.f67802;
        if (c6887.f21278 == null) {
            C8319 c8319M30781 = ((C12552) this.f67797).m30781();
            C6887 c6888 = new C6887(this.f67796, this.f67802.f21279);
            c6887.f21278 = c8319M30781;
            c6887.f21280 = c6888;
        }
        return Math.min(i, (int) (this.f67802.f21279 - this.f67798));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6887 m47808(C6887 c6887, C21843 c21843, C9004 c9004, C17714 c17714) {
        C6887 c6887M47807;
        int iM41464;
        if (c21843.m49227()) {
            long j = c9004.f27356;
            c17714.m41481(1);
            C6887 c6887M47808 = m47807(c6887, j, c17714.m41482(), 1);
            long j2 = j + 1;
            byte b = c17714.m41482()[0];
            boolean z = (b & GCMSIVBlockCipher.MASK) != 0;
            int i = b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID;
            C5615 c5615 = c21843.f70000;
            byte[] bArr = c5615.f17379;
            if (bArr == null) {
                c5615.f17379 = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            c6887M47807 = m47807(c6887M47808, j2, c5615.f17379, i);
            long j3 = j2 + ((long) i);
            if (z) {
                c17714.m41481(2);
                c6887M47807 = m47807(c6887M47807, j3, c17714.m41482(), 2);
                j3 += 2;
                iM41464 = c17714.m41464();
            } else {
                iM41464 = 1;
            }
            int[] iArr = c5615.f17381;
            if (iArr == null || iArr.length < iM41464) {
                iArr = new int[iM41464];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = c5615.f17373;
            if (iArr3 == null || iArr3.length < iM41464) {
                iArr3 = new int[iM41464];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i2 = iM41464 * 6;
                c17714.m41481(i2);
                c6887M47807 = m47807(c6887M47807, j3, c17714.m41482(), i2);
                j3 += (long) i2;
                c17714.m41484(0);
                for (int i3 = 0; i3 < iM41464; i3++) {
                    iArr2[i3] = c17714.m41464();
                    iArr4[i3] = c17714.m41492();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = c9004.f27357 - ((int) (j3 - c9004.f27356));
            }
            C18677 c18677 = c9004.f27355;
            String str = C3603.f11424;
            c5615.m15920(iM41464, iArr2, iArr4, c18677.f59032, c5615.f17379, c18677.f59030, c18677.f59031, c18677.f59029);
            long j4 = c9004.f27356;
            int i4 = (int) (j3 - j4);
            c9004.f27356 = j4 + ((long) i4);
            c9004.f27357 -= i4;
        } else {
            c6887M47807 = c6887;
        }
        if (c21843.m12694()) {
            c17714.m41481(4);
            C6887 c6887M47809 = m47807(c6887M47807, c9004.f27356, c17714.m41482(), 4);
            int iM41492 = c17714.m41492();
            c9004.f27356 += 4;
            c9004.f27357 -= 4;
            c21843.m49228(iM41492);
            C6887 c6887M47806 = m47806(c6887M47809, c9004.f27356, c21843.f69995, iM41492);
            c9004.f27356 += (long) iM41492;
            int i5 = c9004.f27357 - iM41492;
            c9004.f27357 = i5;
            ByteBuffer byteBuffer = c21843.f69998;
            if (byteBuffer == null || byteBuffer.capacity() < i5) {
                c21843.f69998 = ByteBuffer.allocate(i5);
            } else {
                c21843.f69998.clear();
            }
            return m47806(c6887M47806, c9004.f27356, c21843.f69998, c9004.f27357);
        }
        c21843.m49228(c9004.f27357);
        return m47806(c6887M47807, c9004.f27356, c21843.f69995, c9004.f27357);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6887 m47806(C6887 c6887, long j, ByteBuffer byteBuffer, int i) {
        while (j >= c6887.f21279) {
            c6887 = c6887.f21280;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (c6887.f21279 - j));
            C8319 c8319 = c6887.f21278;
            byteBuffer.put(c8319.f25526, ((int) (j - c6887.f21281)) + c8319.f25527, iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == c6887.f21279) {
                c6887 = c6887.f21280;
            }
        }
        return c6887;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6887 m47807(C6887 c6887, long j, byte[] bArr, int i) {
        while (j >= c6887.f21279) {
            c6887 = c6887.f21280;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (c6887.f21279 - j));
            C8319 c8319 = c6887.f21278;
            System.arraycopy(c8319.f25526, ((int) (j - c6887.f21281)) + c8319.f25527, bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == c6887.f21279) {
                c6887 = c6887.f21280;
            }
        }
        return c6887;
    }
}
