package p067l;

import android.util.Base64DataException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.util.encoders.Base32Encoder;

/* JADX INFO: renamed from: l.ۙ۟ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4M8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6651 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ۗ */
    public int f17156;

    /* JADX INFO: renamed from: ۙ */
    public int f17157;

    /* JADX INFO: renamed from: ۤ */
    public final CharSequence f17158;

    /* JADX INFO: renamed from: ۫ */
    public boolean f17159;

    /* JADX INFO: renamed from: ۬ */
    public int f17160;

    /* JADX INFO: renamed from: ᩶ */
    public final int f17161;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC18588 f17162;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f17163;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C6651(CharSequence charSequence, InterfaceC18588 interfaceC18588) {
        this.f17158 = charSequence;
        this.f17162 = interfaceC18588;
        this.f17161 = charSequence.length();
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
    public final int read(byte[] bArr, int i, int i2) throws C25008, Base64DataException {
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
            int i6 = this.f17157;
            if (i6 > 0) {
                i3 = i5 + 1;
                bArr[i5 + i] = Base32Encoder.DEFAULT_PADDING;
                this.f17157 = i6 - 1;
                this.f17160 = (this.f17160 + 1) & 3;
            } else {
                int i7 = this.f17156;
                if (i7 < this.f17161) {
                    C7992.m18514(i7, this.f17162);
                    int i8 = this.f17156;
                    this.f17156 = i8 + 1;
                    char cCharAt = this.f17158.charAt(i8);
                    if ((cCharAt >= 'A' && cCharAt <= 'Z') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '+' || cCharAt == '/' || cCharAt == '='))) {
                        i3 = i5 + 1;
                        bArr[i5 + i] = (byte) cCharAt;
                        this.f17160 = (this.f17160 + 1) & 3;
                        this.f17159 |= cCharAt == '=';
                    }
                } else {
                    if (this.f17163) {
                        break;
                    }
                    this.f17163 = true;
                    if (this.f17159 || (i4 = this.f17160) == 0) {
                        break;
                    }
                    if (i4 == 1) {
                        throw new Base64DataException("Invalid Base64 input length");
                    }
                    this.f17157 = 4 - i4;
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
