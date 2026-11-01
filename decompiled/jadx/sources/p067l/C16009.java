package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Hashtable;

/* JADX INFO: renamed from: l.ܳۜۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7WV */
/* JADX INFO: loaded from: classes4.dex */
public final class C16009 extends AbstractC21178 {

    /* JADX INFO: renamed from: ᩶ */
    public static Hashtable f46370 = new Hashtable();

    /* JADX INFO: renamed from: ᩹ */
    public static Hashtable f46371 = new Hashtable();

    /* JADX INFO: renamed from: ܶ */
    public boolean f46373 = true;

    /* JADX INFO: renamed from: ᩸ */
    public Socket f46374 = null;

    /* JADX INFO: renamed from: ۠ */
    public byte[] f46372 = new byte[0];

    /* JADX INFO: renamed from: ֫ */
    public static void m36381(C9383 c9383) {
        Hashtable hashtable = f46371;
        synchronized (hashtable) {
            hashtable.remove(c9383);
            f46370.remove(c9383);
        }
    }

    public C16009() {
        this.f66561 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f66550 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f66562 = 16384;
        byte[] bArr = C20764.f65273;
        this.f66549 = C20764.m46886("x11", StandardCharsets.UTF_8);
        this.f66556 = true;
    }

    @Override // p067l.AbstractC21178
    /* JADX INFO: renamed from: ۡ */
    public final void mo5176() {
        C21099 c21099;
        InputStream inputStream;
        try {
            Socket socketM46883 = C20764.m46883(6000, 10000, "127.0.0.1");
            this.f46374 = socketM46883;
            socketM46883.setTcpNoDelay(true);
            C21099 c210910 = new C21099();
            this.f66554 = c210910;
            c210910.f66297 = this.f46374.getInputStream();
            this.f66554.f66298 = this.f46374.getOutputStream();
            m47798();
            this.f66545 = Thread.currentThread();
            C17823 c17823 = new C17823(this.f66548);
            C10054 c10054 = new C10054(c17823);
            try {
                C9383 c9383M47808 = m47808();
                while (this.f66545 != null && (c21099 = this.f66554) != null && (inputStream = c21099.f66297) != null) {
                    byte[] bArr = c17823.f53185;
                    int i = inputStream.read(bArr, 14, (bArr.length - 14) - c9383M47808.m21847());
                    if (i <= 0) {
                        m47806();
                        break;
                    }
                    if (this.f66546) {
                        break;
                    }
                    c10054.m23425();
                    c17823.m40448((byte) 94);
                    c17823.m40459(this.f66555);
                    c17823.m40459(i);
                    c17823.m40465(i);
                    c9383M47808.m21835(c10054, this, i);
                }
            } catch (Exception unused) {
            }
            m47801();
        } catch (Exception unused2) {
            m47799();
            this.f66546 = true;
            m47801();
        }
    }

    @Override // p067l.AbstractC21178
    /* JADX INFO: renamed from: ֫ */
    public final void mo5175(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2;
        if (this.f46373) {
            try {
                C9383 c9383M47808 = m47808();
                byte[] bArr3 = this.f46372;
                int length = bArr3.length + i2;
                byte[] bArr4 = new byte[length];
                System.arraycopy(bArr, i, bArr4, bArr3.length, i2);
                byte[] bArr5 = this.f46372;
                if (bArr5.length > 0) {
                    System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
                }
                this.f46372 = bArr4;
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
                Hashtable hashtable = f46370;
                synchronized (hashtable) {
                    bArr2 = (byte[]) hashtable.get(c9383M47808);
                }
                if (i6 != bArr2.length) {
                    this.f66545 = null;
                    m47806();
                    this.f66554.m47703();
                    m47801();
                    break;
                }
                for (int i8 = 0; i8 < i6; i8++) {
                    if (bArr6[i8] != bArr2[i8]) {
                        this.f66545 = null;
                        m47806();
                        this.f66554.m47703();
                        m47801();
                        break;
                    }
                }
                this.f46373 = false;
                C21099 c21099 = this.f66554;
                c21099.f66298.write(bArr4, 0, length);
                c21099.f66298.flush();
                this.f46372 = null;
                return;
            } catch (C14392 e) {
                throw new IOException(e.toString(), e);
            }
        }
        C21099 c210910 = this.f66554;
        c210910.f66298.write(bArr, i, i2);
        c210910.f66298.flush();
    }
}
