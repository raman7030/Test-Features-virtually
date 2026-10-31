package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.nio.ByteBuffer;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.۬ۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8J8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13044 extends AbstractC0759 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte[] f39053;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f39057;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public byte[] f39058;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f39059;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f39063;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f39064;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f39055 = 0;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f39061 = 0;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f39054 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f39051 = 100000;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final float f39052 = 0.2f;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f39060 = 2000000;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int f39062 = 10;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final short f39056 = 1024;

    public C13044() {
        byte[] bArr = C3603.f11423;
        this.f39053 = bArr;
        this.f39058 = bArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31621(boolean z) {
        this.f39057 = z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m31622() {
        return this.f39059;
    }

    @Override // l.AbstractC0759
    /* JADX INFO: renamed from: ۧ */
    public final C18399 mo2903(C18399 c18399) throws C19105 {
        if (c18399.f57133 == 2) {
            return c18399.f57134 == -1 ? C18399.f57130 : c18399;
        }
        throw new C19105(c18399);
    }

    @Override // l.AbstractC0759, l.InterfaceC0053
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo964() {
        return super.mo964() && this.f39057;
    }

    @Override // l.InterfaceC0053
    /* JADX INFO: renamed from: ֫ */
    public final void mo962(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !m2901()) {
            int i = this.f39064;
            short s = this.f39056;
            if (i == 0) {
                int iLimit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit2, byteBuffer.position() + this.f39053.length));
                int iLimit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit3 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit3) << 8) | (byteBuffer.get(iLimit3 - 1) & 255)) > s) {
                        int i2 = this.f39063;
                        iPosition = ((iLimit3 / i2) * i2) + i2;
                        break;
                    }
                    iLimit3 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.f39064 = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    m2900(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit2);
            } else {
                if (i != 1) {
                    throw new IllegalStateException();
                }
                C22632.m50634(this.f39061 < this.f39053.length);
                int iLimit4 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & 255)) > s) {
                        int i3 = this.f39063;
                        iLimit = (iPosition2 / i3) * i3;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int length = this.f39061;
                int i4 = this.f39054;
                int length2 = length + i4;
                byte[] bArr = this.f39053;
                if (length2 < bArr.length) {
                    length = bArr.length;
                } else {
                    length2 = i4 - (bArr.length - length);
                }
                int i5 = length - length2;
                boolean z = iLimit < iLimit4;
                int iMin = Math.min(iPosition3, i5);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f39053, length2, iMin);
                int i6 = this.f39054 + iMin;
                this.f39054 = i6;
                C22632.m50634(i6 <= this.f39053.length);
                boolean z2 = z && iPosition3 < i5;
                m31620(z2);
                if (z2) {
                    this.f39064 = 0;
                    this.f39055 = 0;
                }
                byteBuffer.limit(iLimit4);
            }
        }
    }

    @Override // l.AbstractC0759
    /* JADX INFO: renamed from: ᩻ */
    public final void mo2905() {
        if (this.f39054 > 0) {
            m31620(true);
            this.f39055 = 0;
        }
    }

    @Override // l.AbstractC0759
    /* JADX INFO: renamed from: ܳ */
    public final void mo2904() {
        if (mo964()) {
            C18399 c18399 = this.f2818;
            int i = c18399.f57132 * 2;
            this.f39063 = i;
            int i2 = ((((int) ((this.f39051 * ((long) c18399.f57134)) / 1000000)) / 2) / i) * i * 2;
            if (this.f39053.length != i2) {
                this.f39053 = new byte[i2];
                this.f39058 = new byte[i2];
            }
        }
        this.f39064 = 0;
        this.f39059 = 0L;
        this.f39055 = 0;
        this.f39061 = 0;
        this.f39054 = 0;
    }

    @Override // l.AbstractC0759
    /* JADX INFO: renamed from: ۜ */
    public final void mo2902() {
        this.f39057 = false;
        byte[] bArr = C3603.f11423;
        this.f39053 = bArr;
        this.f39058 = bArr;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m31620(boolean z) {
        int length;
        int iM31619;
        int i = this.f39054;
        byte[] bArr = this.f39053;
        if (i == bArr.length || z) {
            if (this.f39055 == 0) {
                if (z) {
                    m31618(i, 3);
                    length = i;
                } else {
                    C22632.m50634(i >= bArr.length / 2);
                    length = this.f39053.length / 2;
                    m31618(length, 0);
                }
                iM31619 = length;
            } else if (z) {
                int length2 = i - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iM316110 = m31619(length2) + (this.f39053.length / 2);
                m31618(iM316110, 2);
                iM31619 = iM316110;
                length = length3;
            } else {
                length = i - (bArr.length / 2);
                iM31619 = m31619(length);
                m31618(iM31619, 1);
            }
            C22632.m50633("bytesConsumed is not aligned to frame size: %s" + length, length % this.f39063 == 0);
            C22632.m50634(i >= iM31619);
            this.f39054 -= length;
            int i2 = this.f39061 + length;
            this.f39061 = i2;
            this.f39061 = i2 % this.f39053.length;
            int i3 = this.f39055;
            int i4 = this.f39063;
            this.f39055 = (iM31619 / i4) + i3;
            this.f39059 += (long) ((length - iM31619) / i4);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m31618(int i, int i2) {
        if (i == 0) {
            return;
        }
        C22632.m50631(this.f39054 >= i);
        if (i2 == 2) {
            int i3 = this.f39061;
            int i4 = this.f39054;
            int i5 = i3 + i4;
            byte[] bArr = this.f39053;
            if (i5 <= bArr.length) {
                System.arraycopy(bArr, i5 - i, this.f39058, 0, i);
            } else {
                int length = i4 - (bArr.length - i3);
                if (length >= i) {
                    System.arraycopy(bArr, length - i, this.f39058, 0, i);
                } else {
                    int i6 = i - length;
                    System.arraycopy(bArr, bArr.length - i6, this.f39058, 0, i6);
                    System.arraycopy(this.f39053, 0, this.f39058, i6, length);
                }
            }
        } else {
            int i7 = this.f39061;
            int i8 = i7 + i;
            byte[] bArr2 = this.f39053;
            if (i8 <= bArr2.length) {
                System.arraycopy(bArr2, i7, this.f39058, 0, i);
            } else {
                int length2 = bArr2.length - i7;
                System.arraycopy(bArr2, i7, this.f39058, 0, length2);
                System.arraycopy(this.f39053, 0, this.f39058, length2, i - length2);
            }
        }
        C22632.m50630("sizeToOutput is not aligned to frame size: " + i, i % this.f39063 == 0);
        C22632.m50634(this.f39061 < this.f39053.length);
        byte[] bArr3 = this.f39058;
        C22632.m50630("byteOutput size is not aligned to frame size " + i, i % this.f39063 == 0);
        if (i2 != 3) {
            for (int i9 = 0; i9 < i; i9 += 2) {
                int i10 = i9 + 1;
                int i11 = (bArr3[i10] << 8) | (bArr3[i9] & 255);
                int i12 = this.f39062;
                if (i2 == 0) {
                    i12 = ((((i9 * 1000) / (i - 1)) * (i12 - 100)) / 1000) + 100;
                } else if (i2 == 2) {
                    i12 += (((i9 * 1000) * (100 - i12)) / (i - 1)) / 1000;
                }
                int i13 = (i11 * i12) / 100;
                if (i13 >= 32767) {
                    bArr3[i9] = -1;
                    bArr3[i10] = ColorResourcesTableCreator.APPLICATION_PACKAGE_ID;
                } else if (i13 <= -32768) {
                    bArr3[i9] = 0;
                    bArr3[i10] = GCMSIVBlockCipher.MASK;
                } else {
                    bArr3[i9] = (byte) (i13 & 255);
                    bArr3[i10] = (byte) (i13 >> 8);
                }
            }
        }
        m2900(i).put(bArr3, 0, i).flip();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m31619(int i) {
        int length = ((((int) ((this.f39060 * ((long) this.f2818.f57134)) / 1000000)) - this.f39055) * this.f39063) - (this.f39053.length / 2);
        C22632.m50634(length >= 0);
        int iMin = (int) Math.min((i * this.f39052) + 0.5f, length);
        int i2 = this.f39063;
        return (iMin / i2) * i2;
    }
}
