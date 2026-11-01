package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.io.InputStream;
import java.io.PipedOutputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Vector;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۗ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F7ZZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C5754 extends AbstractC21178 {

    /* JADX INFO: renamed from: ᩹ */
    public static Vector f14112 = new Vector();

    /* JADX INFO: renamed from: ᩸ */
    public Socket f14115 = null;

    /* JADX INFO: renamed from: ܶ */
    public InterfaceRunnableC17744 f14114 = null;

    /* JADX INFO: renamed from: ۠ */
    public AbstractC23859 f14113 = null;

    public C5754() {
        this.f66561 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f66550 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f66562 = 16384;
        this.f66554 = new C21099();
        this.f66556 = true;
    }

    @Override // p067l.AbstractC21178
    /* JADX INFO: renamed from: ۡ */
    public final void mo5176() {
        C21099 c21099;
        InputStream inputStream;
        try {
            AbstractC23859 abstractC23859 = this.f14113;
            if (abstractC23859 instanceof C21848) {
                this.f14114 = (InterfaceRunnableC17744) Class.forName(null).asSubclass(InterfaceRunnableC17744.class).getDeclaredConstructor(null).newInstance(null);
                PipedOutputStream pipedOutputStream = new PipedOutputStream();
                C21099 c210910 = this.f66554;
                C6425 c6425 = new C6425(pipedOutputStream, 32768);
                c6425.f16628 = pipedOutputStream;
                c210910.f66297 = c6425;
                InterfaceRunnableC17744 interfaceRunnableC17744 = this.f14114;
                m47804();
                interfaceRunnableC17744.m40329();
                this.f14114.m40328();
                ThreadFactoryC8042 threadFactoryC8042M21852 = m47808().m21852();
                InterfaceRunnableC17744 interfaceRunnableC17745 = this.f14114;
                threadFactoryC8042M21852.getClass();
                new Thread(interfaceRunnableC17745).start();
            } else {
                ((C7095) abstractC23859).getClass();
                Socket socketM46883 = C20764.m46883(0, 10000, (String) null);
                this.f14115 = socketM46883;
                socketM46883.setTcpNoDelay(true);
                this.f66554.f66297 = this.f14115.getInputStream();
                this.f66554.f66298 = this.f14115.getOutputStream();
            }
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
    public final void mo12833(C17823 c17823) {
        C9383 c9383M47808;
        m47802(c17823.m40464());
        m47803(c17823.m40457());
        this.f66548 = c17823.m40464();
        byte[] bArrM40471 = c17823.m40471();
        int iM40464 = c17823.m40464();
        c17823.m40471();
        c17823.m40464();
        try {
            c9383M47808 = m47808();
        } catch (C14392 unused) {
            c9383M47808 = null;
        }
        byte[] bArr = C20764.f65273;
        AbstractC23859 abstractC23859M12830 = m12830(c9383M47808, new String(bArrM40471, 0, bArrM40471.length, StandardCharsets.UTF_8), iM40464);
        this.f14113 = abstractC23859M12830;
        if (abstractC23859M12830 == null) {
            this.f14113 = m12830(c9383M47808, (String) null, iM40464);
        }
        if (this.f14113 == null) {
            c9383M47808.f25608.m49100().getClass();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC23859 m12830(C9383 c9383, String str, int i) {
        synchronized (f14112) {
            int i2 = 0;
            while (true) {
                Vector vector = f14112;
                if (i2 >= vector.size()) {
                    return null;
                }
                AbstractC23859 abstractC23859 = (AbstractC23859) vector.elementAt(i2);
                abstractC23859.getClass();
                if (c9383 == null && (i == 0 || i == 0)) {
                    if (str == null) {
                        return abstractC23859;
                    }
                    throw null;
                }
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m12832(C9383 c9383, int i) {
        Vector vector = f14112;
        synchronized (vector) {
            AbstractC23859 abstractC23859M12830 = m12830(c9383, "localhost", i);
            if (abstractC23859M12830 == null) {
                abstractC23859M12830 = m12830(c9383, (String) null, i);
            }
            if (abstractC23859M12830 == null) {
                return;
            }
            vector.removeElement(abstractC23859M12830);
            C17823 c17823 = new C17823(200);
            C10054 c10054 = new C10054(c17823);
            try {
                c10054.m23425();
                c17823.m40448(UTF8.S_P4A);
                byte[] bArr = C20764.f65273;
                Charset charset = StandardCharsets.UTF_8;
                c17823.m40470("cancel-tcpip-forward".getBytes(charset));
                c17823.m40448((byte) 0);
                c17823.m40470(C20764.m46886("0.0.0.0", charset));
                c17823.m40459(i);
                c9383.m21845(c10054);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m12831(C9383 c9383) {
        int[] iArr;
        int i;
        Vector vector = f14112;
        synchronized (vector) {
            iArr = new int[vector.size()];
            int i2 = 0;
            while (true) {
                Vector vector2 = f14112;
                if (i2 >= vector2.size()) {
                    break;
                }
                ((AbstractC23859) vector2.elementAt(i2)).getClass();
                i2++;
            }
        }
        for (i = 0; i < 0; i++) {
            m12832(c9383, iArr[i]);
        }
    }
}
