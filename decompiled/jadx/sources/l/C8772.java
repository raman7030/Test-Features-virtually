package l;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import org.bouncycastle.util.encoders.Base32Encoder;

/* JADX INFO: renamed from: l.ۡۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7ZR */
/* JADX INFO: loaded from: classes3.dex */
public final class C8772 extends AbstractC9478 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC9478
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7854(C7381 c7381) throws IOException {
        C16261 c16261;
        InterfaceC18650 interfaceC18650;
        String[] strArrMo4549;
        super.mo7854(c7381);
        InterfaceC18650 interfaceC18651 = this.f28799;
        if (interfaceC18651 == null || (interfaceC18651 instanceof InterfaceC20767)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f28800);
            sb.append("@");
            sb.append(c7381.f22687);
            byte[] bArr = c7381.f22666;
            byte[] bArrM44592 = C19356.m44592(this.f28800, StandardCharsets.UTF_8);
            boolean z = false;
            loop0: while (c7381.f22699 < c7381.f22680) {
                this.f28798.m21457();
                this.f28797.m38234((byte) 50);
                this.f28797.m38256(bArrM44592);
                C16261 c16262 = this.f28797;
                Charset charset = StandardCharsets.UTF_8;
                c16262.m38256("ssh-connection".getBytes(charset));
                this.f28797.m38256("keyboard-interactive".getBytes(charset));
                C16261 c16263 = this.f28797;
                byte[] bArr2 = C19356.f62660;
                c16263.m38256(bArr2);
                C16261 c16264 = this.f28797;
                c16264.getClass();
                c16264.m38252(0, bArr2.length, bArr2);
                c7381.m19872(this.f28798);
                boolean z2 = true;
                boolean z3 = true;
                while (true) {
                    c16261 = this.f28797;
                    c7381.m19863(c16261);
                    this.f28797 = c16261;
                    boolean z4 = c16261.f50016[5] & 255;
                    if (z4 == 52) {
                        return z2;
                    }
                    if (z4 == 53) {
                        c16261.m38250();
                        this.f28797.m38233();
                        this.f28797.m38233();
                        byte[] bArrM38257 = this.f28797.m38257();
                        this.f28797.m38257();
                        new String(bArrM38257, 0, bArrM38257.length, StandardCharsets.UTF_8);
                    } else {
                        if (z4 == 51) {
                            break;
                        }
                        if (z4 != 60) {
                            break loop0;
                        }
                        c16261.m38250();
                        this.f28797.m38233();
                        this.f28797.m38233();
                        byte[] bArrM38258 = this.f28797.m38257();
                        int length = bArrM38258.length;
                        Charset charset2 = StandardCharsets.UTF_8;
                        String str = new String(bArrM38258, 0, length, charset2);
                        byte[] bArrM38259 = this.f28797.m38257();
                        String str2 = new String(bArrM38259, 0, bArrM38259.length, charset2);
                        C19356.m44588(this.f28797.m38257());
                        int iM38250 = this.f28797.m38250();
                        String[] strArr = new String[iM38250];
                        boolean[] zArr = new boolean[iM38250];
                        int i = 0;
                        while (i < iM38250) {
                            byte[] bArrM382510 = this.f28797.m38257();
                            byte[] bArr3 = bArrM44592;
                            strArr[i] = new String(bArrM382510, 0, bArrM382510.length, StandardCharsets.UTF_8);
                            zArr[i] = this.f28797.m38233() != 0;
                            i++;
                            bArrM44592 = bArr3;
                        }
                        byte[] bArr4 = bArrM44592;
                        byte[][] bArr5 = null;
                        if (bArr != null && iM38250 == 1 && !zArr[0] && strArr[0].toLowerCase(Locale.ROOT).indexOf("password:") >= 0) {
                            byte[][] bArr6 = {bArr};
                            bArr = null;
                            bArr5 = bArr6;
                        } else if ((iM38250 > 0 || str.length() > 0 || str2.length() > 0) && (interfaceC18650 = this.f28799) != null && (strArrMo4549 = ((InterfaceC20767) interfaceC18650).mo4549(strArr)) != null) {
                            bArr5 = new byte[strArrMo4549.length][];
                            for (int i2 = 0; i2 < strArrMo4549.length; i2++) {
                                String str3 = strArrMo4549[i2];
                                bArr5[i2] = str3 != null ? str3.getBytes(StandardCharsets.UTF_8) : C19356.f62660;
                            }
                        }
                        this.f28798.m21457();
                        this.f28797.m38234(Base32Encoder.DEFAULT_PADDING);
                        if (iM38250 <= 0 || (bArr5 != null && iM38250 == bArr5.length)) {
                            this.f28797.m38245(iM38250);
                            for (int i3 = 0; i3 < iM38250; i3++) {
                                this.f28797.m38256(bArr5[i3]);
                            }
                        } else {
                            if (bArr5 == null) {
                                this.f28797.m38245(iM38250);
                                for (int i4 = 0; i4 < iM38250; i4++) {
                                    this.f28797.m38256(C19356.f62660);
                                }
                            } else {
                                this.f28797.m38245(0);
                            }
                            if (bArr5 == null) {
                                z = true;
                            }
                        }
                        c7381.m19872(this.f28798);
                        z3 = false;
                        bArrM44592 = bArr4;
                        z2 = true;
                    }
                }
                c16261.m38250();
                this.f28797.m38233();
                this.f28797.m38233();
                byte[] bArrM382511 = this.f28797.m38257();
                if (this.f28797.m38233() != 0) {
                    throw new C6301(new String(bArrM382511, 0, bArrM382511.length, StandardCharsets.UTF_8));
                }
                if (z3) {
                    break;
                }
                c7381.f22699 += z2 ? 1 : 0;
                if (z) {
                    throw new C3479("keyboard-interactive");
                }
            }
        }
        return false;
    }
}
