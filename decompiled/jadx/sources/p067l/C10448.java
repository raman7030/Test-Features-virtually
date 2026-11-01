package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.۠᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7W4 */
/* JADX INFO: loaded from: classes3.dex */
public class C10448 extends AbstractC21178 {

    /* JADX INFO: renamed from: ᩶ */
    public static final byte[] f28908;

    /* JADX INFO: renamed from: ۠ */
    public String f28909;

    /* JADX INFO: renamed from: ܶ */
    public String f28910 = "127.0.0.1";

    /* JADX INFO: renamed from: ᩸ */
    public int f28911 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public int f28912;

    static {
        byte[] bArr = C20764.f65273;
        f28908 = C20764.m46886("direct-tcpip", StandardCharsets.UTF_8);
    }

    public C10448() {
        this.f66549 = f28908;
        this.f66561 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f66550 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f66562 = 16384;
    }

    @Override // p067l.AbstractC21178
    /* JADX INFO: renamed from: ۜ */
    public final void mo7821() {
        this.f66554 = new C21099();
    }

    @Override // p067l.AbstractC21178
    /* JADX INFO: renamed from: ֫ */
    public final void mo24167(int i) throws C14392 {
        this.f66553 = 0;
        try {
            C9383 c9383M47808 = m47808();
            if (!c9383M47808.m21841()) {
                throw new C14392("session is down");
            }
            if (this.f66554.f66297 != null) {
                ThreadFactoryC8042 threadFactoryC8042M21852 = c9383M47808.m21852();
                Runnable runnable = new Runnable() { // from class: l.֨᩻ۘ
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7928.mo5176();
                    }
                };
                threadFactoryC8042M21852.getClass();
                Thread thread = new Thread(runnable);
                this.f66545 = thread;
                thread.setName("DirectTCPIP thread " + c9383M47808.f25599);
                this.f66545.start();
                return;
            }
            m47805();
        } catch (Exception e) {
            this.f66554.m47703();
            this.f66554 = null;
            C9383 c9383 = this.f66560;
            if (c9383 != null) {
                c9383.m21838(this);
            }
            if (e instanceof C14392) {
                throw ((C14392) e);
            }
        }
    }

    @Override // p067l.AbstractC21178
    /* JADX INFO: renamed from: ۡ */
    public final void mo5176() {
        C21099 c21099;
        InputStream inputStream;
        try {
            m47805();
            C17823 c17823 = new C17823(this.f66548);
            C10054 c10054 = new C10054(c17823);
            C9383 c9383M47808 = m47808();
            while (m47800() && this.f66545 != null && (c21099 = this.f66554) != null && (inputStream = c21099.f66297) != null) {
                byte[] bArr = c17823.f53185;
                int i = inputStream.read(bArr, 14, (bArr.length - 14) - c9383M47808.m21847());
                if (i <= 0) {
                    m47806();
                    break;
                }
                c10054.m23425();
                c17823.m40448((byte) 94);
                c17823.m40459(this.f66555);
                c17823.m40459(i);
                c17823.m40465(i);
                synchronized (this) {
                    if (!this.f66546) {
                        c9383M47808.m21835(c10054, this, i);
                    }
                }
                break;
            }
            m47806();
            m47801();
        } catch (Exception unused) {
            if (!this.f66556) {
                this.f66556 = true;
            }
            m47801();
        }
    }

    @Override // p067l.AbstractC21178
    /* JADX INFO: renamed from: ܿ */
    public C10054 mo17919() {
        C17823 c17823 = new C17823(this.f28910.length() + this.f28909.length() + 50 + this.f66560.m21847());
        C10054 c10054 = new C10054(c17823);
        c10054.m23425();
        c17823.m40448((byte) 90);
        c17823.m40470(this.f66549);
        c17823.m40459(this.f66557);
        c17823.m40459(this.f66550);
        c17823.m40459(this.f66562);
        String str = this.f28909;
        Charset charset = StandardCharsets.UTF_8;
        c17823.m40470(C20764.m46886(str, charset));
        c17823.m40459(this.f28912);
        c17823.m40470(C20764.m46886(this.f28910, charset));
        c17823.m40459(this.f28911);
        return c10054;
    }
}
