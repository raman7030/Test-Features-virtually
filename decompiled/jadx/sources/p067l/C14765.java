package p067l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.nio.ByteBuffer;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.۬ۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8J8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14765 extends AbstractC3089 {

    /* JADX INFO: renamed from: ۖ */
    public byte[] f42098;

    /* JADX INFO: renamed from: ۡ */
    public boolean f42102;

    /* JADX INFO: renamed from: ۢ */
    public byte[] f42103;

    /* JADX INFO: renamed from: ܶ */
    public long f42104;

    /* JADX INFO: renamed from: ᩷ */
    public int f42108;

    /* JADX INFO: renamed from: ᩸ */
    public int f42109;

    /* JADX INFO: renamed from: ۚ */
    public int f42100 = 0;

    /* JADX INFO: renamed from: ᩴ */
    public int f42106 = 0;

    /* JADX INFO: renamed from: ۘ */
    public int f42099 = 0;

    /* JADX INFO: renamed from: ֡ */
    public final long f42096 = 100000;

    /* JADX INFO: renamed from: ֨ */
    public final float f42097 = 0.2f;

    /* JADX INFO: renamed from: ܺ */
    public final long f42105 = 2000000;

    /* JADX INFO: renamed from: ᩵ */
    public final int f42107 = 10;

    /* JADX INFO: renamed from: ۠ */
    public final short f42101 = 1024;

    public C14765() {
        byte[] bArr = C5792.f14227;
        this.f42098 = bArr;
        this.f42103 = bArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33706(boolean z) {
        this.f42102 = z;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final long m33707() {
        return this.f42104;
    }

    @Override // p067l.AbstractC3089
    /* JADX INFO: renamed from: ۧ */
    public final C19854 mo5232(C19854 c19854) throws C20525 {
        if (c19854.f60353 == 2) {
            return c19854.f60354 == -1 ? C19854.f60350 : c19854;
        }
        throw new C20525(c19854);
    }

    @Override // p067l.AbstractC3089, p067l.InterfaceC2418
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo3359() {
        return super.mo3359() && this.f42102;
    }

    @Override // p067l.InterfaceC2418
    /* JADX INFO: renamed from: ֫ */
    public final void mo3357(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !m5230()) {
            int i = this.f42109;
            short s = this.f42101;
            if (i == 0) {
                int iLimit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit2, byteBuffer.position() + this.f42098.length));
                int iLimit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit3 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit3) << 8) | (byteBuffer.get(iLimit3 - 1) & 255)) > s) {
                        int i2 = this.f42108;
                        iPosition = ((iLimit3 / i2) * i2) + i2;
                        break;
                    }
                    iLimit3 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.f42109 = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    m5229(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit2);
            } else {
                if (i != 1) {
                    throw new IllegalStateException();
                }
                C23877.m52960(this.f42106 < this.f42098.length);
                int iLimit4 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & 255)) > s) {
                        int i3 = this.f42108;
                        iLimit = (iPosition2 / i3) * i3;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int length = this.f42106;
                int i4 = this.f42099;
                int length2 = length + i4;
                byte[] bArr = this.f42098;
                if (length2 < bArr.length) {
                    length = bArr.length;
                } else {
                    length2 = i4 - (bArr.length - length);
                }
                int i5 = length - length2;
                boolean z = iLimit < iLimit4;
                int iMin = Math.min(iPosition3, i5);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f42098, length2, iMin);
                int i6 = this.f42099 + iMin;
                this.f42099 = i6;
                C23877.m52960(i6 <= this.f42098.length);
                boolean z2 = z && iPosition3 < i5;
                m33705(z2);
                if (z2) {
                    this.f42109 = 0;
                    this.f42100 = 0;
                }
                byteBuffer.limit(iLimit4);
            }
        }
    }

    @Override // p067l.AbstractC3089
    /* JADX INFO: renamed from: ᩻ */
    public final void mo5234() {
        if (this.f42099 > 0) {
            m33705(true);
            this.f42100 = 0;
        }
    }

    @Override // p067l.AbstractC3089
    /* JADX INFO: renamed from: ܳ */
    public final void mo5233() {
        if (mo3359()) {
            C19854 c19854 = this.f5590;
            int i = c19854.f60352 * 2;
            this.f42108 = i;
            int i2 = ((((int) ((this.f42096 * ((long) c19854.f60354)) / 1000000)) / 2) / i) * i * 2;
            if (this.f42098.length != i2) {
                this.f42098 = new byte[i2];
                this.f42103 = new byte[i2];
            }
        }
        this.f42109 = 0;
        this.f42104 = 0L;
        this.f42100 = 0;
        this.f42106 = 0;
        this.f42099 = 0;
    }

    @Override // p067l.AbstractC3089
    /* JADX INFO: renamed from: ۜ */
    public final void mo5231() {
        this.f42102 = false;
        byte[] bArr = C5792.f14227;
        this.f42098 = bArr;
        this.f42103 = bArr;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m33705(boolean z) {
        int length;
        int iM33704;
        int i = this.f42099;
        byte[] bArr = this.f42098;
        if (i == bArr.length || z) {
            if (this.f42100 == 0) {
                if (z) {
                    m33703(i, 3);
                    length = i;
                } else {
                    C23877.m52960(i >= bArr.length / 2);
                    length = this.f42098.length / 2;
                    m33703(length, 0);
                }
                iM33704 = length;
            } else if (z) {
                int length2 = i - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iM33705 = m33704(length2) + (this.f42098.length / 2);
                m33703(iM33705, 2);
                iM33704 = iM33705;
                length = length3;
            } else {
                length = i - (bArr.length / 2);
                iM33704 = m33704(length);
                m33703(iM33704, 1);
            }
            C23877.m52959("bytesConsumed is not aligned to frame size: %s" + length, length % this.f42108 == 0);
            C23877.m52960(i >= iM33704);
            this.f42099 -= length;
            int i2 = this.f42106 + length;
            this.f42106 = i2;
            this.f42106 = i2 % this.f42098.length;
            int i3 = this.f42100;
            int i4 = this.f42108;
            this.f42100 = (iM33704 / i4) + i3;
            this.f42104 += (long) ((length - iM33704) / i4);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m33703(int i, int i2) {
        if (i == 0) {
            return;
        }
        C23877.m52957(this.f42099 >= i);
        if (i2 == 2) {
            int i3 = this.f42106;
            int i4 = this.f42099;
            int i5 = i3 + i4;
            byte[] bArr = this.f42098;
            if (i5 <= bArr.length) {
                System.arraycopy(bArr, i5 - i, this.f42103, 0, i);
            } else {
                int length = i4 - (bArr.length - i3);
                if (length >= i) {
                    System.arraycopy(bArr, length - i, this.f42103, 0, i);
                } else {
                    int i6 = i - length;
                    System.arraycopy(bArr, bArr.length - i6, this.f42103, 0, i6);
                    System.arraycopy(this.f42098, 0, this.f42103, i6, length);
                }
            }
        } else {
            int i7 = this.f42106;
            int i8 = i7 + i;
            byte[] bArr2 = this.f42098;
            if (i8 <= bArr2.length) {
                System.arraycopy(bArr2, i7, this.f42103, 0, i);
            } else {
                int length2 = bArr2.length - i7;
                System.arraycopy(bArr2, i7, this.f42103, 0, length2);
                System.arraycopy(this.f42098, 0, this.f42103, length2, i - length2);
            }
        }
        C23877.m52956("sizeToOutput is not aligned to frame size: " + i, i % this.f42108 == 0);
        C23877.m52960(this.f42106 < this.f42098.length);
        byte[] bArr3 = this.f42103;
        C23877.m52956("byteOutput size is not aligned to frame size " + i, i % this.f42108 == 0);
        if (i2 != 3) {
            for (int i9 = 0; i9 < i; i9 += 2) {
                int i10 = i9 + 1;
                int i11 = (bArr3[i10] << 8) | (bArr3[i9] & 255);
                int i12 = this.f42107;
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
        m5229(i).put(bArr3, 0, i).flip();
    }

    /* JADX INFO: renamed from: ۧ */
    private int m33704(int i) {
        int length = ((((int) ((this.f42105 * ((long) this.f5590.f60354)) / 1000000)) - this.f42100) * this.f42108) - (this.f42098.length / 2);
        C23877.m52960(length >= 0);
        int iMin = (int) Math.min((i * this.f42097) + 0.5f, length);
        int i2 = this.f42108;
        return (iMin / i2) * i2;
    }
}
