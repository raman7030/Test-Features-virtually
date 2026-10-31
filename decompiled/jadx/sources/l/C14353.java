package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Hashtable;

/* JADX INFO: renamed from: l.ܳۜۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7WV */
/* JADX INFO: loaded from: classes4.dex */
public final class C14353 extends AbstractC19791 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static Hashtable f43279 = new Hashtable();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static Hashtable f43280 = new Hashtable();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f43282 = true;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Socket f43283 = null;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public byte[] f43281 = new byte[0];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34248(C7381 c7381) {
        Hashtable hashtable = f43280;
        synchronized (hashtable) {
            hashtable.remove(c7381);
            f43279.remove(c7381);
        }
    }

    public C14353() {
        this.f63924 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f63913 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f63925 = 16384;
        byte[] bArr = C19356.f62660;
        this.f63912 = C19356.m44592("x11", StandardCharsets.UTF_8);
        this.f63919 = true;
    }

    @Override // l.AbstractC19791
    /* JADX INFO: renamed from: ۡ */
    public final void mo2847() {
        C19708 c19708;
        InputStream inputStream;
        try {
            Socket socketM44589 = C19356.m44589(6000, 10000, "127.0.0.1");
            this.f43283 = socketM44589;
            socketM44589.setTcpNoDelay(true);
            C19708 c19709 = new C19708();
            this.f63917 = c19709;
            c19709.f63666 = this.f43283.getInputStream();
            this.f63917.f63667 = this.f43283.getOutputStream();
            m45487();
            this.f63908 = Thread.currentThread();
            C16261 c16261 = new C16261(this.f63911);
            C8087 c8087 = new C8087(c16261);
            try {
                C7381 c7381M45497 = m45497();
                while (this.f63908 != null && (c19708 = this.f63917) != null && (inputStream = c19708.f63666) != null) {
                    byte[] bArr = c16261.f50016;
                    int i = inputStream.read(bArr, 14, (bArr.length - 14) - c7381M45497.m19874());
                    if (i <= 0) {
                        m45495();
                        break;
                    }
                    if (this.f63909) {
                        break;
                    }
                    c8087.m21457();
                    c16261.m38234((byte) 94);
                    c16261.m38245(this.f63918);
                    c16261.m38245(i);
                    c16261.m38251(i);
                    c7381M45497.m19862(c8087, this, i);
                }
            } catch (Exception unused) {
            }
            m45490();
        } catch (Exception unused2) {
            m45488();
            this.f63909 = true;
            m45490();
        }
    }

    @Override // l.AbstractC19791
    /* JADX INFO: renamed from: ֫ */
    public final void mo2846(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2;
        if (this.f43282) {
            try {
                C7381 c7381M45497 = m45497();
                byte[] bArr3 = this.f43281;
                int length = bArr3.length + i2;
                byte[] bArr4 = new byte[length];
                System.arraycopy(bArr, i, bArr4, bArr3.length, i2);
                byte[] bArr5 = this.f43281;
                if (bArr5.length > 0) {
                    System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
                }
                this.f43281 = bArr4;
                if (length < 9) {
                    return;
                }
                int i3 = ((bArr4[6] & 255) * 256) + (bArr4[7] & 255);
                int i4 = ((bArr4[8] & 255) * 256) + (bArr4[9] & 255);
                int i5 = bArr4[0] & 255;
                if (i5 != 66 && i5 == 108) {
                    i3 = ((i3 << 8) & 65280) | ((i3 >>> 8) & 255);
                    i4 = ((i4 << 8) & 65280) | ((i4 >>> 8) & 255);
                }
                int i6 = i4;
                int i7 = i3 + 12 + ((-i3) & 3);
                if (length < i7 + i6) {
                    return;
                }
                byte[] bArr6 = new byte[i6];
                System.arraycopy(bArr4, i7, bArr6, 0, i6);
                Hashtable hashtable = f43279;
                synchronized (hashtable) {
                    bArr2 = (byte[]) hashtable.get(c7381M45497);
                }
                if (i6 != bArr2.length) {
                    this.f63908 = null;
                    m45495();
                    this.f63917.m45399();
                    m45490();
                    break;
                }
                for (int i8 = 0; i8 < i6; i8++) {
                    if (bArr6[i8] != bArr2[i8]) {
                        this.f63908 = null;
                        m45495();
                        this.f63917.m45399();
                        m45490();
                        break;
                    }
                }
                this.f43282 = false;
                C19708 c19708 = this.f63917;
                c19708.f63667.write(bArr4, 0, length);
                c19708.f63667.flush();
                this.f43281 = null;
                return;
            } catch (C12651 e) {
                throw new IOException(e.toString(), e);
            }
        }
        C19708 c19709 = this.f63917;
        c19709.f63667.write(bArr, i, i2);
        c19709.f63667.flush();
    }
}
