package p067l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.᩷ܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8PX */
/* JADX INFO: loaded from: classes4.dex */
public final class C22326 {

    /* JADX INFO: renamed from: ֫ */
    public final int f70481;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC23016 f70482;

    /* JADX INFO: renamed from: ܳ */
    public long f70483;

    /* JADX INFO: renamed from: ܽ */
    public C8914 f70484;

    /* JADX INFO: renamed from: ܿ */
    public final C19203 f70485;

    /* JADX INFO: renamed from: ᩳ */
    public C8914 f70486;

    /* JADX INFO: renamed from: ᩻ */
    public C8914 f70487;

    public C22326(InterfaceC23016 interfaceC23016) {
        this.f70482 = interfaceC23016;
        int iM32859 = ((C14298) interfaceC23016).m32859();
        this.f70481 = iM32859;
        this.f70485 = new C19203(32);
        C8914 c8914 = new C8914(iM32859, 0L);
        this.f70484 = c8914;
        this.f70486 = c8914;
        this.f70487 = c8914;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m50144() {
        C8914 c8914 = this.f70484;
        C10275 c10275 = c8914.f24155;
        InterfaceC23016 interfaceC23016 = this.f70482;
        if (c10275 != null) {
            ((C14298) interfaceC23016).m32858(c8914);
            c8914.f24155 = null;
            c8914.f24157 = null;
        }
        C8914 c8915 = this.f70484;
        C23877.m52960(c8915.f24155 == null);
        c8915.f24158 = 0L;
        c8915.f24156 = this.f70481;
        C8914 c8916 = this.f70484;
        this.f70486 = c8916;
        this.f70487 = c8916;
        this.f70483 = 0L;
        ((C14298) interfaceC23016).m32861();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m50145(long j) {
        C23877.m52957(j <= this.f70483);
        this.f70483 = j;
        InterfaceC23016 interfaceC23016 = this.f70482;
        int i = this.f70481;
        if (j != 0) {
            C8914 c8914 = this.f70484;
            if (j != c8914.f24158) {
                while (this.f70483 > c8914.f24156) {
                    c8914 = c8914.f24157;
                }
                C8914 c8915 = c8914.f24157;
                c8915.getClass();
                if (c8915.f24155 != null) {
                    ((C14298) interfaceC23016).m32858(c8915);
                    c8915.f24155 = null;
                    c8915.f24157 = null;
                }
                C8914 c8916 = new C8914(i, c8914.f24156);
                c8914.f24157 = c8916;
                if (this.f70483 == c8914.f24156) {
                    c8914 = c8916;
                }
                this.f70487 = c8914;
                if (this.f70486 == c8915) {
                    this.f70486 = c8916;
                    return;
                }
                return;
            }
        }
        C8914 c8917 = this.f70484;
        if (c8917.f24155 != null) {
            ((C14298) interfaceC23016).m32858(c8917);
            c8917.f24155 = null;
            c8917.f24157 = null;
        }
        C8914 c8918 = new C8914(i, this.f70483);
        this.f70484 = c8918;
        this.f70486 = c8918;
        this.f70487 = c8918;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m50147() {
        this.f70486 = this.f70484;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m50146(C23128 c23128, C10926 c10926) {
        this.f70486 = m50138(this.f70486, c23128, c10926, this.f70485);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50143(C23128 c23128, C10926 c10926) {
        m50138(this.f70486, c23128, c10926, this.f70485);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50142(long j) {
        C8914 c8914;
        if (j == -1) {
            return;
        }
        while (true) {
            c8914 = this.f70484;
            if (j < c8914.f24156) {
                break;
            }
            ((C14298) this.f70482).m32857(c8914.f24155);
            C8914 c8915 = this.f70484;
            c8915.f24155 = null;
            C8914 c8916 = c8915.f24157;
            c8915.f24157 = null;
            this.f70484 = c8916;
        }
        if (this.f70486.f24158 < c8914.f24158) {
            this.f70486 = c8914;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m50140() {
        return this.f70483;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m50139(InterfaceC11649 interfaceC11649, int i, boolean z) throws EOFException {
        int iM50135 = m50135(i);
        C8914 c8914 = this.f70487;
        C10275 c10275 = c8914.f24155;
        int i2 = interfaceC11649.read(c10275.f28437, ((int) (this.f70483 - c8914.f24158)) + c10275.f28438, iM50135);
        if (i2 == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = this.f70483 + ((long) i2);
        this.f70483 = j;
        C8914 c8915 = this.f70487;
        if (j == c8915.f24156) {
            this.f70487 = c8915.f24157;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50141(int i, C19203 c19203) {
        while (i > 0) {
            int iM50135 = m50135(i);
            C8914 c8914 = this.f70487;
            C10275 c10275 = c8914.f24155;
            c19203.m43707(((int) (this.f70483 - c8914.f24158)) + c10275.f28438, iM50135, c10275.f28437);
            i -= iM50135;
            long j = this.f70483 + ((long) iM50135);
            this.f70483 = j;
            C8914 c8915 = this.f70487;
            if (j == c8915.f24156) {
                this.f70487 = c8915.f24157;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private int m50135(int i) {
        C8914 c8914 = this.f70487;
        if (c8914.f24155 == null) {
            C10275 c10275M32855 = ((C14298) this.f70482).m32855();
            C8914 c8915 = new C8914(this.f70481, this.f70487.f24156);
            c8914.f24155 = c10275M32855;
            c8914.f24157 = c8915;
        }
        return Math.min(i, (int) (this.f70487.f24156 - this.f70483));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8914 m50138(C8914 c8914, C23128 c23128, C10926 c10926, C19203 c19203) {
        C8914 c8914M50137;
        int iM43710;
        if (c23128.m51578()) {
            long j = c10926.f30290;
            c19203.m43727(1);
            C8914 c8914M50138 = m50137(c8914, j, c19203.m43728(), 1);
            long j2 = j + 1;
            byte b = c19203.m43728()[0];
            boolean z = (b & GCMSIVBlockCipher.MASK) != 0;
            int i = b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID;
            C7705 c7705 = c23128.f72709;
            byte[] bArr = c7705.f20223;
            if (bArr == null) {
                c7705.f20223 = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            c8914M50137 = m50137(c8914M50138, j2, c7705.f20223, i);
            long j3 = j2 + ((long) i);
            if (z) {
                c19203.m43727(2);
                c8914M50137 = m50137(c8914M50137, j3, c19203.m43728(), 2);
                j3 += 2;
                iM43710 = c19203.m43710();
            } else {
                iM43710 = 1;
            }
            int[] iArr = c7705.f20225;
            if (iArr == null || iArr.length < iM43710) {
                iArr = new int[iM43710];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = c7705.f20217;
            if (iArr3 == null || iArr3.length < iM43710) {
                iArr3 = new int[iM43710];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i2 = iM43710 * 6;
                c19203.m43727(i2);
                c8914M50137 = m50137(c8914M50137, j3, c19203.m43728(), i2);
                j3 += (long) i2;
                c19203.m43730(0);
                for (int i3 = 0; i3 < iM43710; i3++) {
                    iArr2[i3] = c19203.m43710();
                    iArr4[i3] = c19203.m43738();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = c10926.f30291 - ((int) (j3 - c10926.f30290));
            }
            C20119 c20119 = c10926.f30289;
            String str = C5792.f14228;
            c7705.m17841(iM43710, iArr2, iArr4, c20119.f62255, c7705.f20223, c20119.f62253, c20119.f62254, c20119.f62252);
            long j4 = c10926.f30290;
            int i4 = (int) (j3 - j4);
            c10926.f30290 = j4 + ((long) i4);
            c10926.f30291 -= i4;
        } else {
            c8914M50137 = c8914;
        }
        if (c23128.m14570()) {
            c19203.m43727(4);
            C8914 c8914M50139 = m50137(c8914M50137, c10926.f30290, c19203.m43728(), 4);
            int iM43738 = c19203.m43738();
            c10926.f30290 += 4;
            c10926.f30291 -= 4;
            c23128.m51579(iM43738);
            C8914 c8914M50136 = m50136(c8914M50139, c10926.f30290, c23128.f72704, iM43738);
            c10926.f30290 += (long) iM43738;
            int i5 = c10926.f30291 - iM43738;
            c10926.f30291 = i5;
            ByteBuffer byteBuffer = c23128.f72707;
            if (byteBuffer == null || byteBuffer.capacity() < i5) {
                c23128.f72707 = ByteBuffer.allocate(i5);
            } else {
                c23128.f72707.clear();
            }
            return m50136(c8914M50136, c10926.f30290, c23128.f72707, c10926.f30291);
        }
        c23128.m51579(c10926.f30291);
        return m50136(c8914M50137, c10926.f30290, c23128.f72704, c10926.f30291);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8914 m50136(C8914 c8914, long j, ByteBuffer byteBuffer, int i) {
        while (j >= c8914.f24156) {
            c8914 = c8914.f24157;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (c8914.f24156 - j));
            C10275 c10275 = c8914.f24155;
            byteBuffer.put(c10275.f28437, ((int) (j - c8914.f24158)) + c10275.f28438, iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == c8914.f24156) {
                c8914 = c8914.f24157;
            }
        }
        return c8914;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8914 m50137(C8914 c8914, long j, byte[] bArr, int i) {
        while (j >= c8914.f24156) {
            c8914 = c8914.f24157;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (c8914.f24156 - j));
            C10275 c10275 = c8914.f24155;
            System.arraycopy(c10275.f28437, ((int) (j - c8914.f24158)) + c10275.f28438, bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == c8914.f24156) {
                c8914 = c8914.f24157;
            }
        }
        return c8914;
    }
}
