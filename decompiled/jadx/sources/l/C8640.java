package l;

import java.util.Date;
import org.simpleframework.xml.core.AnnotationHandler;

/* JADX INFO: renamed from: l.ۡۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9V3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8640 extends AbstractC11422 implements InterfaceC20594 {

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f26376 = C11321.m27961(C8640.class);

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public int f26377;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public int f26378;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public boolean f26379;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public int f26380;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public int f26381;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public int f26382;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public int f26383;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public C13537 f26384;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public int f26385;

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܿ */
    public final int mo1309(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ᩻ */
    public final int mo1311(int i, byte[] bArr) {
        return 0;
    }

    public C8640(InterfaceC18663 interfaceC18663) {
        super(interfaceC18663.mo27540());
        this.f26384 = new C13537();
        this.f26377 = ((C13722) interfaceC18663.mo27540()).m33006();
        this.f26381 = ((C13722) interfaceC18663.mo27540()).m33016();
        this.f26378 = ((C13722) interfaceC18663.mo27540()).m32979();
        this.f26385 = ((C13722) interfaceC18663.mo27540()).m32997();
        this.f26382 = ((C13722) interfaceC18663.mo27540()).m32982();
        this.f26383 = ((C13722) interfaceC18663.mo27540()).m33003();
        this.f26379 = ((C13722) interfaceC18663.mo27540()).m32988();
    }

    @Override // l.InterfaceC20594
    /* JADX INFO: renamed from: ᩻ */
    public final EnumC21485 mo10552() {
        return EnumC21485.SMB1;
    }

    @Override // l.InterfaceC20594
    /* JADX INFO: renamed from: ۫ */
    public final int mo10544() {
        return this.f26383;
    }

    @Override // l.InterfaceC20594
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10537(InterfaceC18663 interfaceC18663) {
        return m28218().equals(interfaceC18663.mo27540());
    }

    @Override // l.InterfaceC20594
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10538(InterfaceC18663 interfaceC18663, InterfaceC6482 interfaceC6482) {
        if (this.f26380 > 10) {
            return false;
        }
        C13537 c13537 = this.f26384;
        int i = c13537.f40411 & Integer.MIN_VALUE;
        InterfaceC2148 interfaceC2148 = f26376;
        if (i != Integer.MIN_VALUE && c13537.f40406 != 8 && ((C13722) interfaceC18663.mo27540()).m32989() == 0) {
            interfaceC2148.mo7104("Unexpected encryption key length: " + c13537.f40406);
            return false;
        }
        if (interfaceC6482.mo14179() || c13537.f40410) {
            this.f26381 |= 4;
            if (interfaceC6482.mo14179() || c13537.f40410) {
                this.f26381 |= 16;
            }
        } else {
            if (c13537.f40409) {
                interfaceC18663.mo27540().getClass();
            }
            this.f26381 &= 65515;
        }
        if (interfaceC2148.mo7086()) {
            StringBuilder sb = new StringBuilder("Signing ");
            sb.append((this.f26381 & 4) != 0 ? "enabled " : "not-enabled ");
            sb.append((this.f26381 & 16) != 0 ? AnnotationHandler.REQUIRED : "not-required");
            interfaceC2148.mo7088(sb.toString());
        }
        int iMin = Math.min(this.f26378, c13537.f40396);
        this.f26378 = iMin;
        if (iMin < 1) {
            this.f26378 = 1;
        }
        this.f26385 = Math.min(this.f26385, c13537.f40407);
        this.f26382 = Math.min(this.f26382, c13537.f40407);
        this.f26383 = Math.min(this.f26383, c13537.f40407);
        int i2 = this.f26377;
        int i3 = c13537.f40411;
        int i4 = i2 & i3;
        this.f26377 = i4;
        if ((i3 & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.f26377 = i4 | Integer.MIN_VALUE;
        }
        if (((C13722) interfaceC18663.mo27540()).m32988()) {
            this.f26377 |= 4;
        } else {
            interfaceC18663.mo27540().getClass();
        }
        if ((this.f26377 & 4) == 0) {
            interfaceC18663.mo27540().getClass();
            this.f26379 = false;
            this.f26381 &= EnumC5983.f18409;
        } else {
            this.f26379 = ((C13722) interfaceC18663.mo27540()).m32988();
        }
        if (this.f26379) {
            interfaceC2148.mo7088("Unicode is enabled");
            return true;
        }
        interfaceC2148.mo7088("Unicode is disabled");
        return true;
    }

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final int m22408() {
        return this.f26377;
    }

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final int m22409() {
        return this.f26385;
    }

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final int m22406() {
        return this.f26378;
    }

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final int m22407() {
        return this.f26378;
    }

    @Override // l.InterfaceC20594
    /* JADX INFO: renamed from: ܺ */
    public final int mo10547() {
        return this.f26382;
    }

    @Override // l.InterfaceC20594
    public final int getSendBufferSize() {
        return this.f26385;
    }

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final int m22405() {
        return this.f26381;
    }

    @Override // l.InterfaceC20594
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo10548(int i) {
        return (this.f26377 & i) == i;
    }

    @Override // l.InterfaceC20594
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo10545() {
        m28218().getClass();
        return mo10548(4096);
    }

    @Override // l.InterfaceC20594
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo10550() {
        return (this.f26381 & 4) == 4;
    }

    @Override // l.InterfaceC20594
    /* JADX INFO: renamed from: ۧ */
    public final void mo10543(InterfaceC7578 interfaceC7578) {
        if (interfaceC7578 instanceof AbstractC11422) {
            AbstractC11422 abstractC11422 = (AbstractC11422) interfaceC7578;
            abstractC11422.m28219(this.f26381);
            abstractC11422.m28217(abstractC11422.mo15687() || this.f26379);
            if (abstractC11422.m28215()) {
                abstractC11422.m28219(32768);
            }
            if (abstractC11422 instanceof AbstractC18246) {
                ((AbstractC18246) abstractC11422).m42529(this.f26385);
            }
        }
    }

    @Override // l.InterfaceC20594
    /* JADX INFO: renamed from: ֫ */
    public final void mo10536(InterfaceC13495 interfaceC13495) {
        if (interfaceC13495 instanceof AbstractC11422) {
            ((AbstractC11422) interfaceC13495).m28217(this.f26379);
        }
    }

    @Override // l.InterfaceC20594
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo10540() {
        C13537 c13537 = this.f26384;
        return c13537.f40409 || c13537.f40410;
    }

    @Override // l.InterfaceC20594
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo10539() {
        return this.f26384.f40410;
    }

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final C13537 m22410() {
        return this.f26384;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܽ */
    public final int mo1308(int i, byte[] bArr) {
        int iM5121 = C1480.m5121(i, bArr);
        this.f26380 = iM5121;
        int i2 = i + 2;
        if (iM5121 > 10) {
            return i2 - i;
        }
        int i3 = i + 3;
        byte b = bArr[i2];
        C13537 c13537 = this.f26384;
        c13537.f40401 = b & 255;
        c13537.f40402 = b & 1;
        c13537.f40397 = (b & 2) == 2;
        c13537.f40409 = (b & 4) == 4;
        c13537.f40410 = (b & 8) == 8;
        c13537.f40396 = C1480.m5121(i3, bArr);
        c13537.f40404 = C1480.m5121(i + 5, bArr);
        c13537.f40407 = C1480.m5123(i + 7, bArr);
        c13537.f40412 = C1480.m5123(i + 11, bArr);
        c13537.f40399 = C1480.m5123(i + 15, bArr);
        c13537.f40411 = C1480.m5123(i + 19, bArr);
        c13537.f40405 = C1480.m5127(i + 23, bArr);
        int iM5122 = C1480.m5121(i + 31, bArr);
        if (iM5122 > 32767) {
            iM5122 = (65536 - iM5122) * (-1);
        }
        c13537.f40398 = iM5122;
        c13537.f40406 = bArr[i + 33] & 255;
        return (i + 34) - i;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ۧ */
    public final int mo1306(int i, byte[] bArr) {
        int i2;
        int iM25125;
        C13537 c13537 = this.f26384;
        if ((c13537.f40411 & Integer.MIN_VALUE) == 0) {
            int i3 = c13537.f40406;
            byte[] bArr2 = new byte[i3];
            c13537.f40403 = bArr2;
            System.arraycopy(bArr, i, bArr2, 0, i3);
            int i4 = c13537.f40406;
            i2 = i + i4;
            if (this.f34160 > i4) {
                if ((this.f26381 & 32768) == 32768) {
                    iM25125 = C9969.m25129(i2, 256, bArr);
                    c13537.f40400 = C9969.m25131(i2, iM25125, bArr);
                } else {
                    iM25125 = C9969.m25125(i2, 256, bArr);
                    c13537.f40400 = C9969.m25126(bArr, i2, iM25125, m28218());
                }
                i2 += iM25125;
            } else {
                c13537.f40400 = new String();
            }
        } else {
            byte[] bArr3 = new byte[16];
            c13537.f40408 = bArr3;
            System.arraycopy(bArr, i, bArr3, 0, 16);
            int length = c13537.f40408.length + i;
            c13537.f40400 = new String();
            int i5 = this.f34160;
            if (i5 > 16) {
                int i6 = i5 - 16;
                c13537.f40406 = i6;
                byte[] bArr4 = new byte[i6];
                c13537.f40403 = bArr4;
                System.arraycopy(bArr, length, bArr4, 0, i6);
                InterfaceC2148 interfaceC2148 = f26376;
                if (interfaceC2148.mo7086()) {
                    interfaceC2148.mo7088("Have initial token ".concat(C12085.m29468(c13537.f40403, 0, c13537.f40406)));
                }
            }
            i2 = length;
        }
        return i2 - i;
    }

    @Override // l.AbstractC11422
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComNegotiateResponse[");
        sb.append(super.toString());
        sb.append(",wordCount=");
        sb.append(this.f34157);
        sb.append(",dialectIndex=");
        sb.append(this.f26380);
        sb.append(",securityMode=0x");
        C13537 c13537 = this.f26384;
        C19033.m43886(c13537.f40401, 1, ",security=", sb);
        sb.append(c13537.f40402 == 0 ? "share" : "user");
        sb.append(",encryptedPasswords=");
        sb.append(c13537.f40397);
        sb.append(",maxMpxCount=");
        sb.append(c13537.f40396);
        sb.append(",maxNumberVcs=");
        sb.append(c13537.f40404);
        sb.append(",maxBufferSize=");
        sb.append(c13537.f40407);
        sb.append(",maxRawSize=");
        sb.append(c13537.f40412);
        sb.append(",sessionKey=0x");
        C19033.m43886(c13537.f40399, 8, ",capabilities=0x", sb);
        sb.append(C12085.m29467(c13537.f40411, 8));
        sb.append(",serverTime=");
        sb.append(new Date(c13537.f40405));
        sb.append(",serverTimeZone=");
        sb.append(c13537.f40398);
        sb.append(",encryptionKeyLength=");
        sb.append(c13537.f40406);
        sb.append(",byteCount=");
        sb.append(this.f34160);
        sb.append(",oemDomainName=");
        return new String(C9045.m23341(sb, c13537.f40400, "]"));
    }
}
