package l;

import com.alipay.sdk.m.p.a;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.cb;
import java.nio.ByteBuffer;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ܰۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9OT */
/* JADX INFO: loaded from: classes4.dex */
public final class C13646 extends AbstractC7297 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f40703;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f40704;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f40705;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f40706;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f40707;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f40708;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f40709;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f40710;

    public C13646(ByteBuffer byteBuffer, boolean z) {
        super(0);
        this.f40703 = Integer.MAX_VALUE;
        this.f40706 = byteBuffer;
        long jM48219 = C21244.m48219(byteBuffer);
        this.f40708 = jM48219;
        this.f40705 = ((long) byteBuffer.limit()) + jM48219;
        long jPosition = jM48219 + ((long) byteBuffer.position());
        this.f40704 = jPosition;
        this.f40707 = jPosition;
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ܶ */
    public final int mo19567() throws C2025 {
        if (mo19572()) {
            this.f40709 = 0;
            return 0;
        }
        int iMo19558 = mo19558();
        this.f40709 = iMo19558;
        if ((iMo19558 >>> 3) != 0) {
            return iMo19558;
        }
        throw C2025.m6581();
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ֫ */
    public final void mo19554(int i) throws C2025 {
        if (this.f40709 != i) {
            throw C2025.m6579();
        }
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo19573(int i) throws C2025 {
        int iMo19567;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (((int) (this.f40705 - this.f40704)) >= 10) {
                while (i3 < 10) {
                    long j = this.f40704;
                    this.f40704 = j + 1;
                    if (C21244.m48216(j) < 0) {
                        i3++;
                    }
                }
                throw C2025.m6580();
            }
            while (i3 < 10) {
                long j2 = this.f40704;
                if (j2 == this.f40705) {
                    throw C2025.m6584();
                }
                this.f40704 = j2 + 1;
                if (C21244.m48216(j2) < 0) {
                    i3++;
                }
            }
            throw C2025.m6580();
            return true;
        }
        if (i2 == 1) {
            m32798(8);
            return true;
        }
        if (i2 == 2) {
            m32798(mo19558());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 == 5) {
                m32798(4);
                return true;
            }
            throw C2025.m6582();
        }
        do {
            iMo19567 = mo19567();
            if (iMo19567 == 0) {
                break;
            }
        } while (mo19573(iMo19567));
        mo19554(((i >>> 3) << 3) | 4);
        return true;
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ᩻ */
    public final double mo19579() {
        return Double.longBitsToDouble(m32796());
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ۡ */
    public final float mo19562() {
        return Float.intBitsToFloat(m32799());
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ᩹ */
    public final long mo19578() {
        return m32795();
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ۖ */
    public final long mo19557() {
        return m32795();
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ܺ */
    public final int mo19568() {
        return mo19558();
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ۢ */
    public final long mo19563() {
        return m32796();
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ᩷ */
    public final int mo19576() {
        return m32799();
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo19571() {
        return m32795() != 0;
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ֨ */
    public final String mo19551() throws C2025 {
        int iMo19558 = mo19558();
        if (iMo19558 > 0) {
            long j = this.f40705;
            long j2 = this.f40704;
            if (iMo19558 <= ((int) (j - j2))) {
                byte[] bArr = new byte[iMo19558];
                long j3 = iMo19558;
                C21244.m48225(j2, bArr, 0L, j3);
                String str = new String(bArr, C13997.f41724);
                this.f40704 += j3;
                return str;
            }
        }
        if (iMo19558 == 0) {
            return "";
        }
        if (iMo19558 < 0) {
            throw C2025.m6585();
        }
        throw C2025.m6584();
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ۠ */
    public final String mo19561() throws C2025 {
        int iMo19558 = mo19558();
        if (iMo19558 > 0) {
            long j = this.f40705;
            long j2 = this.f40704;
            if (iMo19558 <= ((int) (j - j2))) {
                String strM29451 = C12071.m29451(this.f40706, (int) (j2 - this.f40708), iMo19558);
                this.f40704 += (long) iMo19558;
                return strM29451;
            }
        }
        if (iMo19558 == 0) {
            return "";
        }
        if (iMo19558 <= 0) {
            throw C2025.m6585();
        }
        throw C2025.m6584();
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ֫ */
    public final void mo19555(int i, InterfaceC9228 interfaceC9228, C17798 c17798) throws C2025 {
        m19553();
        this.f22399++;
        interfaceC9228.mergeFrom(this, c17798);
        mo19554((i << 3) | 4);
        this.f22399--;
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ֫ */
    public final void mo19556(InterfaceC9228 interfaceC9228, C17798 c17798) throws C2025 {
        int iMo19558 = mo19558();
        m19553();
        int iMo19570 = mo19570(iMo19558);
        this.f22399++;
        interfaceC9228.mergeFrom(this, c17798);
        mo19554(0);
        this.f22399--;
        if (mo19564() != 0) {
            throw C2025.m6584();
        }
        mo19565(iMo19570);
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC8522 mo19552(InterfaceC12050 interfaceC12050, C17798 c17798) throws C2025 {
        int iMo19558 = mo19558();
        m19553();
        int iMo19570 = mo19570(iMo19558);
        this.f22399++;
        InterfaceC8522 interfaceC8522 = (InterfaceC8522) interfaceC12050.parsePartialFrom(this, c17798);
        mo19554(0);
        this.f22399--;
        if (mo19564() != 0) {
            throw C2025.m6584();
        }
        mo19565(iMo19570);
        return interfaceC8522;
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ܳ */
    public final AbstractC5886 mo19566() throws C2025 {
        int iMo19558 = mo19558();
        if (iMo19558 > 0) {
            long j = this.f40705;
            long j2 = this.f40704;
            if (iMo19558 <= ((int) (j - j2))) {
                byte[] bArr = new byte[iMo19558];
                long j3 = iMo19558;
                C21244.m48225(j2, bArr, 0L, j3);
                this.f40704 += j3;
                AbstractC5886 abstractC5886 = AbstractC5886.f18080;
                return new C12236(bArr);
            }
        }
        if (iMo19558 == 0) {
            return AbstractC5886.f18080;
        }
        if (iMo19558 < 0) {
            throw C2025.m6585();
        }
        throw C2025.m6584();
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ᩸ */
    public final int mo19577() {
        return mo19558();
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ۜ */
    public final int mo19560() {
        return mo19558();
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ᩴ */
    public final int mo19574() {
        return m32799();
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ᩵ */
    public final long mo19575() {
        return m32796();
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ֡ */
    public final int mo19550() {
        return AbstractC7297.m19549(mo19558());
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ۚ */
    public final long mo19559() {
        return AbstractC7297.m19546(m32795());
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ۘ */
    public final int mo19558() {
        int i;
        long j = this.f40704;
        if (this.f40705 != j) {
            long j2 = 1 + j;
            byte bM48216 = C21244.m48216(j);
            if (bM48216 >= 0) {
                this.f40704 = j2;
                return bM48216;
            }
            if (this.f40705 - j2 >= 9) {
                long j3 = 2 + j;
                int iM48216 = (C21244.m48216(j2) << 7) ^ bM48216;
                if (iM48216 < 0) {
                    i = iM48216 ^ a.g;
                } else {
                    long j4 = 3 + j;
                    int iM48217 = iM48216 ^ (C21244.m48216(j3) << cb.f77931l);
                    if (iM48217 >= 0) {
                        i = iM48217 ^ 16256;
                    } else {
                        j3 = 4 + j;
                        int iM48218 = iM48217 ^ (C21244.m48216(j4) << 21);
                        if (iM48218 < 0) {
                            i = (-2080896) ^ iM48218;
                        } else {
                            j4 = 5 + j;
                            byte bM48217 = C21244.m48216(j3);
                            int i2 = (iM48218 ^ (bM48217 << ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB)) ^ 266354560;
                            if (bM48217 < 0) {
                                j3 = 6 + j;
                                if (C21244.m48216(j4) < 0) {
                                    j4 = 7 + j;
                                    if (C21244.m48216(j3) < 0) {
                                        j3 = 8 + j;
                                        if (C21244.m48216(j4) < 0) {
                                            j4 = j + 9;
                                            if (C21244.m48216(j3) < 0) {
                                                long j5 = j + 10;
                                                if (C21244.m48216(j4) >= 0) {
                                                    j3 = j5;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i2;
                            }
                            i = i2;
                        }
                    }
                    j3 = j4;
                }
                this.f40704 = j3;
                return i;
            }
        }
        return (int) m32797();
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long m32795() {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        long j5 = this.f40704;
        if (this.f40705 != j5) {
            long j6 = 1 + j5;
            byte bM48216 = C21244.m48216(j5);
            if (bM48216 >= 0) {
                this.f40704 = j6;
                return bM48216;
            }
            if (this.f40705 - j6 >= 9) {
                long j7 = 2 + j5;
                int iM48216 = (C21244.m48216(j6) << 7) ^ bM48216;
                if (iM48216 >= 0) {
                    j = 3 + j5;
                    int iM48217 = iM48216 ^ (C21244.m48216(j7) << cb.f77931l);
                    if (iM48217 >= 0) {
                        j2 = iM48217 ^ 16256;
                    } else {
                        j7 = 4 + j5;
                        int iM48218 = iM48217 ^ (C21244.m48216(j) << 21);
                        if (iM48218 < 0) {
                            i = (-2080896) ^ iM48218;
                        } else {
                            long j8 = 5 + j5;
                            long jM48216 = ((long) iM48218) ^ (((long) C21244.m48216(j7)) << 28);
                            if (jM48216 >= 0) {
                                j4 = 266354560;
                            } else {
                                long j9 = 6 + j5;
                                long jM48217 = jM48216 ^ (((long) C21244.m48216(j8)) << 35);
                                if (jM48217 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    j8 = 7 + j5;
                                    jM48216 = jM48217 ^ (((long) C21244.m48216(j9)) << 42);
                                    if (jM48216 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        j9 = 8 + j5;
                                        jM48217 = jM48216 ^ (((long) C21244.m48216(j8)) << 49);
                                        if (jM48217 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            long j10 = j5 + 9;
                                            long jM48218 = (jM48217 ^ (((long) C21244.m48216(j9)) << 56)) ^ 71499008037633920L;
                                            if (jM48218 < 0) {
                                                long j11 = j5 + 10;
                                                if (C21244.m48216(j10) >= 0) {
                                                    j2 = jM48218;
                                                    j = j11;
                                                }
                                            } else {
                                                j2 = jM48218;
                                                j = j10;
                                            }
                                        }
                                    }
                                }
                                j2 = j3 ^ jM48217;
                                j = j9;
                            }
                            j2 = j4 ^ jM48216;
                            j = j8;
                        }
                    }
                    this.f40704 = j;
                    return j2;
                }
                i = iM48216 ^ a.g;
                j2 = i;
                j = j7;
                this.f40704 = j;
                return j2;
            }
        }
        return m32797();
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int m32799() throws C2025 {
        long j = this.f40704;
        if (this.f40705 - j < 4) {
            throw C2025.m6584();
        }
        this.f40704 = 4 + j;
        return ((C21244.m48216(j + 3) & 255) << 24) | (C21244.m48216(j) & 255) | ((C21244.m48216(1 + j) & 255) << 8) | ((C21244.m48216(2 + j) & 255) << 16);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m32796() throws C2025 {
        long j = this.f40704;
        if (this.f40705 - j < 8) {
            throw C2025.m6584();
        }
        this.f40704 = 8 + j;
        return ((((long) C21244.m48216(j + 7)) & 255) << 56) | (((long) C21244.m48216(j)) & 255) | ((((long) C21244.m48216(1 + j)) & 255) << 8) | ((((long) C21244.m48216(2 + j)) & 255) << 16) | ((((long) C21244.m48216(3 + j)) & 255) << 24) | ((((long) C21244.m48216(4 + j)) & 255) << 32) | ((((long) C21244.m48216(5 + j)) & 255) << 40) | ((((long) C21244.m48216(6 + j)) & 255) << 48);
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ܽ */
    public final int mo19570(int i) throws C2025 {
        if (i < 0) {
            throw C2025.m6585();
        }
        int iMo19569 = i + mo19569();
        int i2 = this.f40703;
        if (iMo19569 > i2) {
            throw C2025.m6584();
        }
        this.f40703 = iMo19569;
        m32794();
        return i2;
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ۧ */
    public final void mo19565(int i) {
        this.f40703 = i;
        m32794();
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ۧ */
    public final int mo19564() {
        int i = this.f40703;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - mo19569();
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo19572() {
        return this.f40704 == this.f40705;
    }

    @Override // l.AbstractC7297
    /* JADX INFO: renamed from: ܽ */
    public final int mo19569() {
        return (int) (this.f40704 - this.f40707);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long m32797() throws C2025 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            long j2 = this.f40704;
            if (j2 == this.f40705) {
                throw C2025.m6584();
            }
            this.f40704 = 1 + j2;
            byte bM48216 = C21244.m48216(j2);
            j |= ((long) (bM48216 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID)) << i;
            if ((bM48216 & GCMSIVBlockCipher.MASK) == 0) {
                return j;
            }
        }
        throw C2025.m6580();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m32794() {
        long j = this.f40705 + ((long) this.f40710);
        this.f40705 = j;
        int i = (int) (j - this.f40707);
        int i2 = this.f40703;
        if (i > i2) {
            int i3 = i - i2;
            this.f40710 = i3;
            this.f40705 = j - ((long) i3);
            return;
        }
        this.f40710 = 0;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m32798(int i) throws C2025 {
        if (i >= 0) {
            long j = this.f40705;
            long j2 = this.f40704;
            if (i <= ((int) (j - j2))) {
                this.f40704 = j2 + ((long) i);
                return;
            }
        }
        if (i < 0) {
            throw C2025.m6585();
        }
        throw C2025.m6584();
    }
}
