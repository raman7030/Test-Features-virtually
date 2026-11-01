package p067l;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import org.bouncycastle.util.encoders.Base32Encoder;

/* JADX INFO: renamed from: l.ۡۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7ZR */
/* JADX INFO: loaded from: classes3.dex */
public final class C10705 extends AbstractC11376 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.AbstractC11376
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo9902(C9383 c9383) throws IOException {
        C17823 c17823;
        InterfaceC20093 interfaceC20093;
        String[] strArrMo6781;
        super.mo9902(c9383);
        InterfaceC20093 interfaceC20094 = this.f31748;
        if (interfaceC20094 == null || (interfaceC20094 instanceof InterfaceC22105)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f31749);
            sb.append("@");
            sb.append(c9383.f25599);
            byte[] bArr = c9383.f25578;
            byte[] bArrM46886 = C20764.m46886(this.f31749, StandardCharsets.UTF_8);
            boolean z = false;
            loop0: while (c9383.f25611 < c9383.f25592) {
                this.f31747.m23425();
                this.f31746.m40448((byte) 50);
                this.f31746.m40470(bArrM46886);
                C17823 c17824 = this.f31746;
                Charset charset = StandardCharsets.UTF_8;
                c17824.m40470("ssh-connection".getBytes(charset));
                this.f31746.m40470("keyboard-interactive".getBytes(charset));
                C17823 c17825 = this.f31746;
                byte[] bArr2 = C20764.f65273;
                c17825.m40470(bArr2);
                C17823 c17826 = this.f31746;
                c17826.getClass();
                c17826.m40466(0, bArr2.length, bArr2);
                c9383.m21845(this.f31747);
                boolean z2 = true;
                boolean z3 = true;
                while (true) {
                    c17823 = this.f31746;
                    c9383.m21836(c17823);
                    this.f31746 = c17823;
                    boolean z4 = c17823.f53185[5] & 255;
                    if (z4 == 52) {
                        return z2;
                    }
                    if (z4 == 53) {
                        c17823.m40464();
                        this.f31746.m40447();
                        this.f31746.m40447();
                        byte[] bArrM40471 = this.f31746.m40471();
                        this.f31746.m40471();
                        new String(bArrM40471, 0, bArrM40471.length, StandardCharsets.UTF_8);
                    } else {
                        if (z4 == 51) {
                            break;
                        }
                        if (z4 != 60) {
                            break loop0;
                        }
                        c17823.m40464();
                        this.f31746.m40447();
                        this.f31746.m40447();
                        byte[] bArrM40472 = this.f31746.m40471();
                        int length = bArrM40472.length;
                        Charset charset2 = StandardCharsets.UTF_8;
                        String str = new String(bArrM40472, 0, length, charset2);
                        byte[] bArrM40473 = this.f31746.m40471();
                        String str2 = new String(bArrM40473, 0, bArrM40473.length, charset2);
                        C20764.m46882(this.f31746.m40471());
                        int iM40464 = this.f31746.m40464();
                        String[] strArr = new String[iM40464];
                        boolean[] zArr = new boolean[iM40464];
                        int i = 0;
                        while (i < iM40464) {
                            byte[] bArrM40474 = this.f31746.m40471();
                            byte[] bArr3 = bArrM46886;
                            strArr[i] = new String(bArrM40474, 0, bArrM40474.length, StandardCharsets.UTF_8);
                            zArr[i] = this.f31746.m40447() != 0;
                            i++;
                            bArrM46886 = bArr3;
                        }
                        byte[] bArr4 = bArrM46886;
                        byte[][] bArr5 = null;
                        if (bArr != null && iM40464 == 1 && !zArr[0] && strArr[0].toLowerCase(Locale.ROOT).indexOf("password:") >= 0) {
                            byte[][] bArr6 = {bArr};
                            bArr = null;
                            bArr5 = bArr6;
                        } else if ((iM40464 > 0 || str.length() > 0 || str2.length() > 0) && (interfaceC20093 = this.f31748) != null && (strArrMo6781 = ((InterfaceC22105) interfaceC20093).mo6781(strArr)) != null) {
                            bArr5 = new byte[strArrMo6781.length][];
                            for (int i2 = 0; i2 < strArrMo6781.length; i2++) {
                                String str3 = strArrMo6781[i2];
                                bArr5[i2] = str3 != null ? str3.getBytes(StandardCharsets.UTF_8) : C20764.f65273;
                            }
                        }
                        this.f31747.m23425();
                        this.f31746.m40448(Base32Encoder.DEFAULT_PADDING);
                        if (iM40464 <= 0 || (bArr5 != null && iM40464 == bArr5.length)) {
                            this.f31746.m40459(iM40464);
                            for (int i3 = 0; i3 < iM40464; i3++) {
                                this.f31746.m40470(bArr5[i3]);
                            }
                        } else {
                            if (bArr5 == null) {
                                this.f31746.m40459(iM40464);
                                for (int i4 = 0; i4 < iM40464; i4++) {
                                    this.f31746.m40470(C20764.f65273);
                                }
                            } else {
                                this.f31746.m40459(0);
                            }
                            if (bArr5 == null) {
                                z = true;
                            }
                        }
                        c9383.m21845(this.f31747);
                        z3 = false;
                        bArrM46886 = bArr4;
                        z2 = true;
                    }
                }
                c17823.m40464();
                this.f31746.m40447();
                this.f31746.m40447();
                byte[] bArrM40475 = this.f31746.m40471();
                if (this.f31746.m40447() != 0) {
                    throw new C8357(new String(bArrM40475, 0, bArrM40475.length, StandardCharsets.UTF_8));
                }
                if (z3) {
                    break;
                }
                c9383.f25611 += z2 ? 1 : 0;
                if (z) {
                    throw new C5675("keyboard-interactive");
                }
            }
        }
        return false;
    }
}
