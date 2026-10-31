package l;

import android.util.Base64DataException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.util.encoders.Base32Encoder;

/* JADX INFO: renamed from: l.ۙ۟ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4M8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4506 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f14329;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f14330;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final CharSequence f14331;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f14332;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f14333;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f14334;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC17066 f14335;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f14336;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C4506(CharSequence charSequence, InterfaceC17066 interfaceC17066) {
        this.f14331 = charSequence;
        this.f14335 = interfaceC17066;
        this.f14334 = charSequence.length();
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) < 0) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws C23821, Base64DataException {
        int i3;
        int i4;
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        int i5 = 0;
        while (i5 < i2) {
            int i6 = this.f14330;
            if (i6 > 0) {
                i3 = i5 + 1;
                bArr[i5 + i] = Base32Encoder.DEFAULT_PADDING;
                this.f14330 = i6 - 1;
                this.f14333 = (this.f14333 + 1) & 3;
            } else {
                int i7 = this.f14329;
                if (i7 < this.f14334) {
                    C5917.m16588(i7, this.f14335);
                    int i8 = this.f14329;
                    this.f14329 = i8 + 1;
                    char cCharAt = this.f14331.charAt(i8);
                    if ((cCharAt >= 'A' && cCharAt <= 'Z') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '+' || cCharAt == '/' || cCharAt == '='))) {
                        i3 = i5 + 1;
                        bArr[i5 + i] = (byte) cCharAt;
                        this.f14333 = (this.f14333 + 1) & 3;
                        this.f14332 |= cCharAt == '=';
                    }
                } else {
                    if (this.f14336) {
                        break;
                    }
                    this.f14336 = true;
                    if (this.f14332 || (i4 = this.f14333) == 0) {
                        break;
                    }
                    if (i4 == 1) {
                        throw new Base64DataException("Invalid Base64 input length");
                    }
                    this.f14330 = 4 - i4;
                }
            }
            i5 = i3;
        }
        if (i5 == 0) {
            return -1;
        }
        return i5;
    }
}
