package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
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
public final class C3562 extends AbstractC19791 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static Vector f11306 = new Vector();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Socket f11309 = null;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public InterfaceRunnableC16178 f11308 = null;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public AbstractC22612 f11307 = null;

    public C3562() {
        this.f63924 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f63913 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f63925 = 16384;
        this.f63917 = new C19708();
        this.f63919 = true;
    }

    @Override // l.AbstractC19791
    /* JADX INFO: renamed from: ۡ */
    public final void mo2847() {
        C19708 c19708;
        InputStream inputStream;
        try {
            AbstractC22612 abstractC22612 = this.f11307;
            if (abstractC22612 instanceof C20496) {
                this.f11308 = (InterfaceRunnableC16178) Class.forName(null).asSubclass(InterfaceRunnableC16178.class).getDeclaredConstructor(null).newInstance(null);
                PipedOutputStream pipedOutputStream = new PipedOutputStream();
                C19708 c19709 = this.f63917;
                C4268 c4268 = new C4268(pipedOutputStream, 32768);
                c4268.f13811 = pipedOutputStream;
                c19709.f63666 = c4268;
                InterfaceRunnableC16178 interfaceRunnableC16178 = this.f11308;
                m45493();
                interfaceRunnableC16178.m38117();
                this.f11308.m38116();
                ThreadFactoryC5970 threadFactoryC5970M19879 = m45497().m19879();
                InterfaceRunnableC16178 interfaceRunnableC16179 = this.f11308;
                threadFactoryC5970M19879.getClass();
                new Thread(interfaceRunnableC16179).start();
            } else {
                ((C4973) abstractC22612).getClass();
                Socket socketM44589 = C19356.m44589(0, 10000, (String) null);
                this.f11309 = socketM44589;
                socketM44589.setTcpNoDelay(true);
                this.f63917.f63666 = this.f11309.getInputStream();
                this.f63917.f63667 = this.f11309.getOutputStream();
            }
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
                    c8087.m21457();
                    c16261.m38234((byte) 94);
                    c16261.m38245(this.f63918);
                    c16261.m38245(i);
                    c16261.m38251(i);
                    synchronized (this) {
                        if (!this.f63909) {
                            c7381M45497.m19862(c8087, this, i);
                        }
                    }
                    break;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo10853(C16261 c16261) {
        C7381 c7381M45497;
        m45491(c16261.m38250());
        m45492(c16261.m38243());
        this.f63911 = c16261.m38250();
        byte[] bArrM38257 = c16261.m38257();
        int iM38250 = c16261.m38250();
        c16261.m38257();
        c16261.m38250();
        try {
            c7381M45497 = m45497();
        } catch (C12651 unused) {
            c7381M45497 = null;
        }
        byte[] bArr = C19356.f62660;
        AbstractC22612 abstractC22612M10850 = m10850(c7381M45497, new String(bArrM38257, 0, bArrM38257.length, StandardCharsets.UTF_8), iM38250);
        this.f11307 = abstractC22612M10850;
        if (abstractC22612M10850 == null) {
            this.f11307 = m10850(c7381M45497, (String) null, iM38250);
        }
        if (this.f11307 == null) {
            c7381M45497.f22696.m46777().getClass();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC22612 m10850(C7381 c7381, String str, int i) {
        synchronized (f11306) {
            int i2 = 0;
            while (true) {
                Vector vector = f11306;
                if (i2 >= vector.size()) {
                    return null;
                }
                AbstractC22612 abstractC22612 = (AbstractC22612) vector.elementAt(i2);
                abstractC22612.getClass();
                if (c7381 == null && (i == 0 || i == 0)) {
                    if (str == null) {
                        return abstractC22612;
                    }
                    throw null;
                }
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10852(C7381 c7381, int i) {
        Vector vector = f11306;
        synchronized (vector) {
            AbstractC22612 abstractC22612M10850 = m10850(c7381, "localhost", i);
            if (abstractC22612M10850 == null) {
                abstractC22612M10850 = m10850(c7381, (String) null, i);
            }
            if (abstractC22612M10850 == null) {
                return;
            }
            vector.removeElement(abstractC22612M10850);
            C16261 c16261 = new C16261(200);
            C8087 c8087 = new C8087(c16261);
            try {
                c8087.m21457();
                c16261.m38234(UTF8.S_P4A);
                byte[] bArr = C19356.f62660;
                Charset charset = StandardCharsets.UTF_8;
                c16261.m38256("cancel-tcpip-forward".getBytes(charset));
                c16261.m38234((byte) 0);
                c16261.m38256(C19356.m44592("0.0.0.0", charset));
                c16261.m38245(i);
                c7381.m19872(c8087);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10851(C7381 c7381) {
        int[] iArr;
        int i;
        Vector vector = f11306;
        synchronized (vector) {
            iArr = new int[vector.size()];
            int i2 = 0;
            while (true) {
                Vector vector2 = f11306;
                if (i2 >= vector2.size()) {
                    break;
                }
                ((AbstractC22612) vector2.elementAt(i2)).getClass();
                i2++;
            }
        }
        for (i = 0; i < 0; i++) {
            m10852(c7381, iArr[i]);
        }
    }
}
